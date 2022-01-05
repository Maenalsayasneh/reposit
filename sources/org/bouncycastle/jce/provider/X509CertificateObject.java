package org.bouncycastle.jce.provider;

import i0.d.a.a.a;
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
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import s0.a.a.b3.c;
import s0.a.a.b3.e.d;
import s0.a.a.c3.b;
import s0.a.a.c3.d0;
import s0.a.a.c3.j;
import s0.a.a.c3.n;
import s0.a.a.c3.u;
import s0.a.a.c3.v;
import s0.a.a.c3.w;
import s0.a.a.o;
import s0.a.a.o0;
import s0.a.a.q2.g;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.u0;
import s0.a.a.v0;
import s0.a.a.y;
import s0.a.d.d.e;

public class X509CertificateObject extends X509Certificate implements e {
    private e attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private j basicConstraints;
    private n c;
    private int hashValue;
    private boolean hashValueSet;
    private boolean[] keyUsage;

    public X509CertificateObject(n nVar) throws CertificateParsingException {
        this.c = nVar;
        try {
            byte[] extensionBytes = getExtensionBytes("2.5.29.19");
            if (extensionBytes != null) {
                this.basicConstraints = j.s(r.x(extensionBytes));
            }
            try {
                byte[] extensionBytes2 = getExtensionBytes("2.5.29.15");
                if (extensionBytes2 != null) {
                    o0 D = o0.D(r.x(extensionBytes2));
                    byte[] B = D.B();
                    int length = (B.length * 8) - D.q;
                    int i = 9;
                    if (length >= 9) {
                        i = length;
                    }
                    this.keyUsage = new boolean[i];
                    for (int i2 = 0; i2 != length; i2++) {
                        this.keyUsage[i2] = (B[i2 / 8] & (128 >>> (i2 % 8))) != 0;
                    }
                    return;
                }
                this.keyUsage = null;
            } catch (Exception e) {
                throw new CertificateParsingException("cannot construct KeyUsage: " + e);
            }
        } catch (Exception e2) {
            throw new CertificateParsingException("cannot construct BasicConstraints: " + e2);
        }
    }

    private int calculateHashCode() {
        try {
            byte[] encoded = getEncoded();
            int i = 0;
            for (int i2 = 1; i2 < encoded.length; i2++) {
                i += encoded[i2] * i2;
            }
            return i;
        } catch (CertificateEncodingException unused) {
            return 0;
        }
    }

    private void checkSignature(PublicKey publicKey, Signature signature) throws CertificateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        n nVar = this.c;
        if (isAlgIdEqual(nVar.q, nVar.d.x)) {
            X509SignatureUtil.setSignatureParameters(signature, this.c.q.d);
            signature.initVerify(publicKey);
            signature.update(getTBSCertificate());
            if (!signature.verify(getSignature())) {
                throw new SignatureException("certificate does not verify with supplied key");
            }
            return;
        }
        throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
    }

    private static Collection getAlternativeNames(byte[] bArr) throws CertificateParsingException {
        String e;
        if (bArr == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration E = s.B(bArr).E();
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
                        e = c.t(d.T, t.c).toString();
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

    private byte[] getExtensionBytes(String str) {
        v vVar = this.c.d.e2;
        if (vVar == null) {
            return null;
        }
        u uVar = (u) vVar.c.get(new s0.a.a.n(str));
        if (uVar != null) {
            return uVar.q2.c;
        }
        return null;
    }

    private boolean isAlgIdEqual(b bVar, b bVar2) {
        if (!bVar.c.w(bVar2.c)) {
            return false;
        }
        s0.a.a.e eVar = bVar.d;
        if (eVar == null) {
            s0.a.a.e eVar2 = bVar2.d;
            if (eVar2 == null || eVar2.equals(v0.c)) {
                return true;
            }
            return false;
        }
        s0.a.a.e eVar3 = bVar2.d;
        if (eVar3 != null) {
            return eVar.equals(eVar3);
        }
        if (eVar == null || eVar.equals(v0.c)) {
            return true;
        }
        return false;
    }

    public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        checkValidity(new Date());
    }

    public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        if (date.getTime() > getNotAfter().getTime()) {
            StringBuilder P0 = a.P0("certificate expired on ");
            P0.append(this.c.d.Z1.u());
            throw new CertificateExpiredException(P0.toString());
        } else if (date.getTime() < getNotBefore().getTime()) {
            StringBuilder P02 = a.P0("certificate not valid till ");
            P02.append(this.c.d.Y1.u());
            throw new CertificateNotYetValidException(P02.toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Certificate)) {
            return false;
        }
        try {
            return Arrays.equals(getEncoded(), ((Certificate) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    public s0.a.a.e getBagAttribute(s0.a.a.n nVar) {
        return this.attrCarrier.getBagAttribute(nVar);
    }

    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
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
        byte[] extensionBytes = getExtensionBytes("2.5.29.37");
        if (extensionBytes == null) {
            return null;
        }
        try {
            s sVar = (s) new s0.a.a.j(extensionBytes).i();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != sVar.size(); i++) {
                arrayList.add(((s0.a.a.n) sVar.D(i)).d);
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    public byte[] getExtensionValue(String str) {
        v vVar = this.c.d.e2;
        if (vVar == null) {
            return null;
        }
        u uVar = (u) vVar.c.get(new s0.a.a.n(str));
        if (uVar == null) {
            return null;
        }
        try {
            return uVar.q2.getEncoded();
        } catch (Exception e) {
            throw new IllegalStateException(a.b0(e, a.P0("error parsing ")));
        }
    }

    public Collection getIssuerAlternativeNames() throws CertificateParsingException {
        return getAlternativeNames(getExtensionBytes(u.q.d));
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

    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.c.d.y.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    public boolean[] getKeyUsage() {
        return this.keyUsage;
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
        Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (provider != null) {
            StringBuilder P0 = a.P0("Alg.Alias.Signature.");
            P0.append(getSigAlgOID());
            String property = provider.getProperty(P0.toString());
            if (property != null) {
                return property;
            }
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            Provider provider2 = providers[i];
            StringBuilder P02 = a.P0("Alg.Alias.Signature.");
            P02.append(getSigAlgOID());
            String property2 = provider2.getProperty(P02.toString());
            if (property2 != null) {
                return property2;
            }
        }
        return getSigAlgOID();
    }

    public String getSigAlgOID() {
        return this.c.q.c.d;
    }

    public byte[] getSigAlgParams() {
        s0.a.a.e eVar = this.c.q.d;
        if (eVar != null) {
            try {
                return eVar.c().r("DER");
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public byte[] getSignature() {
        return this.c.x.C();
    }

    public Collection getSubjectAlternativeNames() throws CertificateParsingException {
        return getAlternativeNames(getExtensionBytes(u.d.d));
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

    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.c.d.a2.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    public byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.c.d.r("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
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
            String str = nVar.d;
            if (!str.equals(RFC3280CertPathUtilities.KEY_USAGE) && !str.equals(RFC3280CertPathUtilities.CERTIFICATE_POLICIES) && !str.equals(RFC3280CertPathUtilities.POLICY_MAPPINGS) && !str.equals(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY) && !str.equals(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS) && !str.equals(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT) && !str.equals(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR) && !str.equals(RFC3280CertPathUtilities.POLICY_CONSTRAINTS) && !str.equals(RFC3280CertPathUtilities.BASIC_CONSTRAINTS) && !str.equals(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME) && !str.equals(RFC3280CertPathUtilities.NAME_CONSTRAINTS) && ((u) vVar.c.get(nVar)).p2) {
                return true;
            }
        }
        return false;
    }

    public synchronized int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = calculateHashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    public void setBagAttribute(s0.a.a.n nVar, s0.a.a.e eVar) {
        this.attrCarrier.setBagAttribute(nVar, eVar);
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
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ");
        stringBuffer.append(new String(s0.a.g.k.d.e(signature, 0, 20)));
        stringBuffer.append(str);
        int i = 20;
        while (i < signature.length) {
            int length = signature.length - 20;
            stringBuffer.append("                       ");
            stringBuffer.append(i < length ? new String(s0.a.g.k.d.e(signature, i, 20)) : new String(s0.a.g.k.d.e(signature, i, signature.length - i)));
            stringBuffer.append(str);
            i += 20;
        }
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
                            obj = new s0.a.a.q2.d((o0) jVar.i());
                        } else if (nVar.w(s0.a.a.q2.c.c)) {
                            obj = new s0.a.a.q2.e((u0) jVar.i());
                        } else if (nVar.w(s0.a.a.q2.c.e)) {
                            obj = new g((u0) jVar.i());
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
        Signature signature;
        String signatureName = X509SignatureUtil.getSignatureName(this.c.q);
        try {
            signature = Signature.getInstance(signatureName, BouncyCastleProvider.PROVIDER_NAME);
        } catch (Exception unused) {
            signature = Signature.getInstance(signatureName);
        }
        checkSignature(publicKey, signature);
    }

    public final void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        String signatureName = X509SignatureUtil.getSignatureName(this.c.q);
        checkSignature(publicKey, str != null ? Signature.getInstance(signatureName, str) : Signature.getInstance(signatureName));
    }

    public final void verify(PublicKey publicKey, Provider provider) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        String signatureName = X509SignatureUtil.getSignatureName(this.c.q);
        checkSignature(publicKey, provider != null ? Signature.getInstance(signatureName, provider) : Signature.getInstance(signatureName));
    }
}
