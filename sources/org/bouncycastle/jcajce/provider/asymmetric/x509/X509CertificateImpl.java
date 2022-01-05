package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.a.b3.e.d;
import s0.a.a.c3.b;
import s0.a.a.c3.d0;
import s0.a.a.c3.j;
import s0.a.a.c3.n;
import s0.a.a.c3.u;
import s0.a.a.c3.v;
import s0.a.a.c3.w;
import s0.a.a.e;
import s0.a.a.o;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.u0;
import s0.a.a.v0;
import s0.a.a.y;
import s0.a.c.l.a;
import s0.a.c.o.c;
import s0.a.e.b.b0.c.h3;
import s0.a.g.g;

public abstract class X509CertificateImpl extends X509Certificate implements a {
    public j basicConstraints;
    public c bcHelper;
    public n c;
    public boolean[] keyUsage;
    public String sigAlgName;
    public byte[] sigAlgParams;

    public X509CertificateImpl(c cVar, n nVar, j jVar, boolean[] zArr, String str, byte[] bArr) {
        this.bcHelper = cVar;
        this.c = nVar;
        this.basicConstraints = jVar;
        this.keyUsage = zArr;
        this.sigAlgName = str;
        this.sigAlgParams = bArr;
    }

    private void checkSignature(PublicKey publicKey, Signature signature, e eVar, byte[] bArr) throws CertificateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        n nVar = this.c;
        if (isAlgIdEqual(nVar.q, nVar.d.x)) {
            X509SignatureUtil.setSignatureParameters(signature, eVar);
            signature.initVerify(publicKey);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new s0.a.c.m.c(signature), 512);
                this.c.d.o(bufferedOutputStream, "DER");
                bufferedOutputStream.close();
                if (!signature.verify(bArr)) {
                    throw new SignatureException("certificate does not verify with supplied key");
                }
            } catch (IOException e) {
                throw new CertificateEncodingException(e.toString());
            }
        } else {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
    }

    private void doVerify(PublicKey publicKey, SignatureCreator signatureCreator) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException, NoSuchProviderException {
        SignatureException e;
        boolean z = publicKey instanceof CompositePublicKey;
        int i = 0;
        if (z && X509SignatureUtil.isCompositeAlgorithm(this.c.q)) {
            List<PublicKey> list = ((CompositePublicKey) publicKey).c;
            s B = s.B(this.c.q.d);
            s B2 = s.B(o0.D(this.c.x).B());
            boolean z2 = false;
            while (i != list.size()) {
                if (list.get(i) != null) {
                    b s = b.s(B.D(i));
                    try {
                        checkSignature(list.get(i), signatureCreator.createSignature(X509SignatureUtil.getSignatureName(s)), s.d, o0.D(B2.D(i)).B());
                        e = null;
                        z2 = true;
                    } catch (SignatureException e2) {
                        e = e2;
                    }
                    if (e != null) {
                        throw e;
                    }
                }
                i++;
            }
            if (!z2) {
                throw new InvalidKeyException("no matching key found");
            }
        } else if (X509SignatureUtil.isCompositeAlgorithm(this.c.q)) {
            s B3 = s.B(this.c.q.d);
            s B4 = s.B(o0.D(this.c.x).B());
            boolean z3 = false;
            while (i != B4.size()) {
                b s2 = b.s(B3.D(i));
                try {
                    checkSignature(publicKey, signatureCreator.createSignature(X509SignatureUtil.getSignatureName(s2)), s2.d, o0.D(B4.D(i)).B());
                    e = null;
                    z3 = true;
                } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
                    e = null;
                } catch (SignatureException e3) {
                    e = e3;
                }
                if (e == null) {
                    i++;
                } else {
                    throw e;
                }
            }
            if (!z3) {
                throw new InvalidKeyException("no matching key found");
            }
        } else {
            Signature createSignature = signatureCreator.createSignature(X509SignatureUtil.getSignatureName(this.c.q));
            if (z) {
                List<PublicKey> list2 = ((CompositePublicKey) publicKey).c;
                while (i != list2.size()) {
                    try {
                        checkSignature(list2.get(i), createSignature, this.c.q.d, getSignature());
                        return;
                    } catch (InvalidKeyException unused2) {
                        i++;
                    }
                }
                throw new InvalidKeyException("no matching signature found");
            }
            checkSignature(publicKey, createSignature, this.c.q.d, getSignature());
        }
    }

    private static Collection getAlternativeNames(n nVar, String str) throws CertificateParsingException {
        String e;
        byte[] extensionOctets = getExtensionOctets(nVar, str);
        if (extensionOctets == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration E = s.B(extensionOctets).E();
            while (E.hasMoreElements()) {
                w t = w.t(E.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(t.d));
                switch (t.d) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(t.getEncoded());
                        break;
                    case 1:
                    case 2:
                    case 6:
                        e = ((y) t.c).e();
                        break;
                    case 4:
                        e = s0.a.a.b3.c.t(d.T, t.c).toString();
                        break;
                    case 7:
                        try {
                            e = InetAddress.getByAddress(o.B(t.c).c).getHostAddress();
                            break;
                        } catch (UnknownHostException unused) {
                            break;
                        }
                    case 8:
                        e = s0.a.a.n.D(t.c).d;
                        break;
                    default:
                        throw new IOException("Bad tag number: " + t.d);
                }
                arrayList2.add(e);
                arrayList.add(Collections.unmodifiableList(arrayList2));
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (Exception e2) {
            throw new CertificateParsingException(e2.getMessage());
        }
    }

    public static byte[] getExtensionOctets(n nVar, String str) {
        o extensionValue = getExtensionValue(nVar, str);
        if (extensionValue != null) {
            return extensionValue.c;
        }
        return null;
    }

    public static o getExtensionValue(n nVar, String str) {
        v vVar = nVar.d.e2;
        if (vVar == null) {
            return null;
        }
        u uVar = (u) vVar.c.get(new s0.a.a.n(str));
        if (uVar != null) {
            return uVar.q2;
        }
        return null;
    }

    private boolean isAlgIdEqual(b bVar, b bVar2) {
        if (!bVar.c.w(bVar2.c)) {
            return false;
        }
        if (g.b("org.bouncycastle.x509.allow_absent_equiv_NULL")) {
            e eVar = bVar.d;
            if (eVar == null) {
                e eVar2 = bVar2.d;
                return eVar2 == null || eVar2.equals(v0.c);
            } else if (bVar2.d == null) {
                return eVar == null || eVar.equals(v0.c);
            }
        }
        e eVar3 = bVar.d;
        if (eVar3 != null) {
            return eVar3.equals(bVar2.d);
        }
        e eVar4 = bVar2.d;
        if (eVar4 != null) {
            return eVar4.equals(eVar3);
        }
        return true;
    }

    public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        checkValidity(new Date());
    }

    public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        if (date.getTime() > getNotAfter().getTime()) {
            StringBuilder P0 = i0.d.a.a.a.P0("certificate expired on ");
            P0.append(this.c.d.Z1.u());
            throw new CertificateExpiredException(P0.toString());
        } else if (date.getTime() < getNotBefore().getTime()) {
            StringBuilder P02 = i0.d.a.a.a.P0("certificate not valid till ");
            P02.append(this.c.d.Y1.u());
            throw new CertificateNotYetValidException(P02.toString());
        }
    }

    public int getBasicConstraints() {
        j jVar = this.basicConstraints;
        if (jVar == null || !jVar.u()) {
            return -1;
        }
        if (this.basicConstraints.t() == null) {
            return Integer.MAX_VALUE;
        }
        return this.basicConstraints.t().intValue();
    }

    public Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        v vVar = this.c.d.e2;
        if (vVar == null) {
            return null;
        }
        Enumeration v = vVar.v();
        while (v.hasMoreElements()) {
            s0.a.a.n nVar = (s0.a.a.n) v.nextElement();
            if (vVar.s(nVar).p2) {
                hashSet.add(nVar.d);
            }
        }
        return hashSet;
    }

    public byte[] getEncoded() throws CertificateEncodingException {
        try {
            return this.c.r("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    public List getExtendedKeyUsage() throws CertificateParsingException {
        byte[] extensionOctets = getExtensionOctets(this.c, "2.5.29.37");
        if (extensionOctets == null) {
            return null;
        }
        try {
            s B = s.B(r.x(extensionOctets));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != B.size(); i++) {
                arrayList.add(((s0.a.a.n) B.D(i)).d);
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    public byte[] getExtensionValue(String str) {
        o extensionValue = getExtensionValue(this.c, str);
        if (extensionValue == null) {
            return null;
        }
        try {
            return extensionValue.getEncoded();
        } catch (Exception e) {
            throw new IllegalStateException(i0.d.a.a.a.b0(e, i0.d.a.a.a.P0("error parsing ")));
        }
    }

    public Collection getIssuerAlternativeNames() throws CertificateParsingException {
        return getAlternativeNames(this.c, u.q.d);
    }

    public Principal getIssuerDN() {
        return new s0.a.d.c(this.c.d.y);
    }

    public boolean[] getIssuerUniqueID() {
        o0 o0Var = this.c.d.c2;
        if (o0Var == null) {
            return null;
        }
        byte[] B = o0Var.B();
        int length = (B.length * 8) - o0Var.q;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (B[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    public s0.a.a.b3.c getIssuerX500Name() {
        return this.c.d.y;
    }

    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.c.d.y.r("DER"));
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    public boolean[] getKeyUsage() {
        boolean[] zArr = this.keyUsage;
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        v vVar = this.c.d.e2;
        if (vVar == null) {
            return null;
        }
        Enumeration v = vVar.v();
        while (v.hasMoreElements()) {
            s0.a.a.n nVar = (s0.a.a.n) v.nextElement();
            if (!vVar.s(nVar).p2) {
                hashSet.add(nVar.d);
            }
        }
        return hashSet;
    }

    public Date getNotAfter() {
        return this.c.d.Z1.s();
    }

    public Date getNotBefore() {
        return this.c.d.Y1.s();
    }

    public PublicKey getPublicKey() {
        try {
            return BouncyCastleProvider.getPublicKey(this.c.d.b2);
        } catch (IOException unused) {
            return null;
        }
    }

    public BigInteger getSerialNumber() {
        return this.c.d.q.E();
    }

    public String getSigAlgName() {
        return this.sigAlgName;
    }

    public String getSigAlgOID() {
        return this.c.q.c.d;
    }

    public byte[] getSigAlgParams() {
        return h3.I(this.sigAlgParams);
    }

    public byte[] getSignature() {
        return this.c.x.C();
    }

    public Collection getSubjectAlternativeNames() throws CertificateParsingException {
        return getAlternativeNames(this.c, u.d.d);
    }

    public Principal getSubjectDN() {
        return new s0.a.d.c(this.c.d.a2);
    }

    public boolean[] getSubjectUniqueID() {
        o0 o0Var = this.c.d.d2;
        if (o0Var == null) {
            return null;
        }
        byte[] B = o0Var.B();
        int length = (B.length * 8) - o0Var.q;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (B[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    public s0.a.a.b3.c getSubjectX500Name() {
        return this.c.d.a2;
    }

    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.c.d.a2.r("DER"));
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode subject DN");
        }
    }

    public byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.c.d.r("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    public s0.a.a.c3.o0 getTBSCertificateNative() {
        return this.c.d;
    }

    public int getVersion() {
        return this.c.d.d.I() + 1;
    }

    public boolean hasUnsupportedCriticalExtension() {
        v vVar;
        if (getVersion() != 3 || (vVar = this.c.d.e2) == null) {
            return false;
        }
        Enumeration v = vVar.v();
        while (v.hasMoreElements()) {
            s0.a.a.n nVar = (s0.a.a.n) v.nextElement();
            if (!nVar.w(u.c) && !nVar.w(u.e2) && !nVar.w(u.f2) && !nVar.w(u.k2) && !nVar.w(u.d2) && !nVar.w(u.a2) && !nVar.w(u.Z1) && !nVar.w(u.h2) && !nVar.w(u.x) && !nVar.w(u.d) && !nVar.w(u.c2) && ((u) vVar.c.get(nVar)).p2) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        Object obj;
        StringBuffer stringBuffer = new StringBuffer();
        String str = s0.a.g.j.a;
        stringBuffer.append("  [0]         Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(str);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(str);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(str);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(str);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(str);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(str);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
        stringBuffer.append(str);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(str);
        X509SignatureUtil.prettyPrintSignature(getSignature(), stringBuffer, str);
        v vVar = this.c.d.e2;
        if (vVar != null) {
            Enumeration v = vVar.v();
            if (v.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
            }
            while (v.hasMoreElements()) {
                s0.a.a.n nVar = (s0.a.a.n) v.nextElement();
                u s = vVar.s(nVar);
                o oVar = s.q2;
                if (oVar != null) {
                    s0.a.a.j jVar = new s0.a.a.j(oVar.c);
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(s.p2);
                    stringBuffer.append(") ");
                    try {
                        if (nVar.w(u.x)) {
                            obj = j.s(jVar.i());
                        } else if (nVar.w(u.c)) {
                            obj = d0.s(jVar.i());
                        } else if (nVar.w(s0.a.a.q2.c.b)) {
                            obj = new s0.a.a.q2.d(o0.D(jVar.i()));
                        } else if (nVar.w(s0.a.a.q2.c.c)) {
                            obj = new s0.a.a.q2.e(u0.B(jVar.i()));
                        } else if (nVar.w(s0.a.a.q2.c.e)) {
                            obj = new s0.a.a.q2.g(u0.B(jVar.i()));
                        } else {
                            stringBuffer.append(nVar.d);
                            stringBuffer.append(" value = ");
                            stringBuffer.append(m0.r.t.a.r.m.a1.a.j1(jVar.i()));
                            stringBuffer.append(str);
                        }
                        stringBuffer.append(obj);
                        stringBuffer.append(str);
                    } catch (Exception unused) {
                        stringBuffer.append(nVar.d);
                        stringBuffer.append(" value = ");
                        stringBuffer.append("*****");
                    }
                }
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }

    public final void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        doVerify(publicKey, new SignatureCreator() {
            public Signature createSignature(String str) throws NoSuchAlgorithmException {
                try {
                    return X509CertificateImpl.this.bcHelper.createSignature(str);
                } catch (Exception unused) {
                    return Signature.getInstance(str);
                }
            }
        });
    }

    public final void verify(PublicKey publicKey, final String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        doVerify(publicKey, new SignatureCreator() {
            public Signature createSignature(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
                String str2 = str;
                return str2 != null ? Signature.getInstance(str, str2) : Signature.getInstance(str);
            }
        });
    }

    public final void verify(PublicKey publicKey, final Provider provider) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        try {
            doVerify(publicKey, new SignatureCreator() {
                public Signature createSignature(String str) throws NoSuchAlgorithmException {
                    Provider provider = provider;
                    return provider != null ? Signature.getInstance(str, provider) : Signature.getInstance(str);
                }
            });
        } catch (NoSuchProviderException e) {
            StringBuilder P0 = i0.d.a.a.a.P0("provider issue: ");
            P0.append(e.getMessage());
            throw new NoSuchAlgorithmException(P0.toString());
        }
    }
}
