package org.bouncycastle.jcajce.provider.asymmetric.x509;

import i0.d.a.a.a;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jcajce.CompositePublicKey;
import s0.a.a.c3.b;
import s0.a.a.c3.b0;
import s0.a.a.c3.l;
import s0.a.a.c3.n0;
import s0.a.a.c3.o;
import s0.a.a.c3.t0;
import s0.a.a.c3.u;
import s0.a.a.c3.v;
import s0.a.a.c3.x;
import s0.a.a.e;
import s0.a.a.k;
import s0.a.a.n;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.c.o.c;
import s0.a.e.b.b0.c.h3;
import s0.a.g.j;

public abstract class X509CRLImpl extends X509CRL {
    public c bcHelper;
    public o c;
    public boolean isIndirect;
    public String sigAlgName;
    public byte[] sigAlgParams;

    public X509CRLImpl(c cVar, o oVar, String str, byte[] bArr, boolean z) {
        this.bcHelper = cVar;
        this.c = oVar;
        this.sigAlgName = str;
        this.sigAlgParams = bArr;
        this.isIndirect = z;
    }

    private void checkSignature(PublicKey publicKey, Signature signature, e eVar, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        if (eVar != null) {
            X509SignatureUtil.setSignatureParameters(signature, eVar);
        }
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new s0.a.c.m.c(signature), 512);
            this.c.c.o(bufferedOutputStream, "DER");
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    private void doVerify(PublicKey publicKey, SignatureCreator signatureCreator) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException, NoSuchProviderException {
        SignatureException e;
        o oVar = this.c;
        if (oVar.d.equals(oVar.c.d)) {
            int i = 0;
            if ((publicKey instanceof CompositePublicKey) && X509SignatureUtil.isCompositeAlgorithm(this.c.d)) {
                List<PublicKey> list = ((CompositePublicKey) publicKey).c;
                s B = s.B(this.c.d.d);
                s B2 = s.B(o0.D(this.c.q).B());
                boolean z = false;
                while (i != list.size()) {
                    if (list.get(i) != null) {
                        b s = b.s(B.D(i));
                        try {
                            checkSignature(list.get(i), signatureCreator.createSignature(X509SignatureUtil.getSignatureName(s)), s.d, o0.D(B2.D(i)).B());
                            e = null;
                            z = true;
                        } catch (SignatureException e2) {
                            e = e2;
                        }
                        if (e != null) {
                            throw e;
                        }
                    }
                    i++;
                }
                if (!z) {
                    throw new InvalidKeyException("no matching key found");
                }
            } else if (X509SignatureUtil.isCompositeAlgorithm(this.c.d)) {
                s B3 = s.B(this.c.d.d);
                s B4 = s.B(o0.D(this.c.q).B());
                boolean z2 = false;
                while (i != B4.size()) {
                    b s2 = b.s(B3.D(i));
                    try {
                        checkSignature(publicKey, signatureCreator.createSignature(X509SignatureUtil.getSignatureName(s2)), s2.d, o0.D(B4.D(i)).B());
                        e = null;
                        z2 = true;
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
                if (!z2) {
                    throw new InvalidKeyException("no matching key found");
                }
            } else {
                Signature createSignature = signatureCreator.createSignature(getSigAlgName());
                byte[] bArr = this.sigAlgParams;
                if (bArr == null) {
                    checkSignature(publicKey, createSignature, (e) null, getSignature());
                    return;
                }
                try {
                    checkSignature(publicKey, createSignature, r.x(bArr), getSignature());
                } catch (IOException e4) {
                    throw new SignatureException(a.V(e4, a.P0("cannot decode signature parameters: ")));
                }
            }
        } else {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
    }

    private Set getExtensionOIDs(boolean z) {
        v vVar;
        if (getVersion() != 2 || (vVar = this.c.c.Z1) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration v = vVar.v();
        while (v.hasMoreElements()) {
            n nVar = (n) v.nextElement();
            if (z == vVar.s(nVar).p2) {
                hashSet.add(nVar.d);
            }
        }
        return hashSet;
    }

    public static byte[] getExtensionOctets(o oVar, String str) {
        s0.a.a.o extensionValue = getExtensionValue(oVar, str);
        if (extensionValue != null) {
            return extensionValue.c;
        }
        return null;
    }

    public static s0.a.a.o getExtensionValue(o oVar, String str) {
        v vVar = oVar.c.Z1;
        if (vVar == null) {
            return null;
        }
        u uVar = (u) vVar.c.get(new n(str));
        if (uVar != null) {
            return uVar.q2;
        }
        return null;
    }

    private Set loadCRLEntries() {
        u s;
        HashSet hashSet = new HashSet();
        Enumeration t = this.c.t();
        s0.a.a.b3.c cVar = null;
        while (t.hasMoreElements()) {
            n0.b bVar = (n0.b) t.nextElement();
            hashSet.add(new X509CRLEntryObject(bVar, this.isIndirect, cVar));
            if (this.isIndirect && bVar.v() && (s = bVar.s().s(u.b2)) != null) {
                cVar = s0.a.a.b3.c.s(x.s(s.s()).t()[0].c);
            }
        }
        return hashSet;
    }

    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    public byte[] getEncoded() throws CRLException {
        try {
            return this.c.r("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public byte[] getExtensionValue(String str) {
        s0.a.a.o extensionValue = getExtensionValue(this.c, str);
        if (extensionValue == null) {
            return null;
        }
        try {
            return extensionValue.getEncoded();
        } catch (Exception e) {
            throw new IllegalStateException(a.b0(e, a.P0("error parsing ")));
        }
    }

    public Principal getIssuerDN() {
        return new s0.a.d.c(s0.a.a.b3.c.s(this.c.c.q.Y1));
    }

    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.c.c.q.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    public Date getNextUpdate() {
        t0 t0Var = this.c.c.y;
        if (t0Var == null) {
            return null;
        }
        return t0Var.s();
    }

    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        u s;
        Enumeration t = this.c.t();
        s0.a.a.b3.c cVar = null;
        while (t.hasMoreElements()) {
            n0.b bVar = (n0.b) t.nextElement();
            if (bVar.u().F(bigInteger)) {
                return new X509CRLEntryObject(bVar, this.isIndirect, cVar);
            }
            if (this.isIndirect && bVar.v() && (s = bVar.s().s(u.b2)) != null) {
                cVar = s0.a.a.b3.c.s(x.s(s.s()).t()[0].c);
            }
        }
        return null;
    }

    public Set getRevokedCertificates() {
        Set loadCRLEntries = loadCRLEntries();
        if (!loadCRLEntries.isEmpty()) {
            return Collections.unmodifiableSet(loadCRLEntries);
        }
        return null;
    }

    public String getSigAlgName() {
        return this.sigAlgName;
    }

    public String getSigAlgOID() {
        return this.c.d.c.d;
    }

    public byte[] getSigAlgParams() {
        return h3.I(this.sigAlgParams);
    }

    public byte[] getSignature() {
        return this.c.q.C();
    }

    public byte[] getTBSCertList() throws CRLException {
        try {
            return this.c.c.r("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public Date getThisUpdate() {
        return this.c.c.x.s();
    }

    public int getVersion() {
        k kVar = this.c.c.c;
        if (kVar == null) {
            return 1;
        }
        return 1 + kVar.I();
    }

    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(u.a2.d);
        criticalExtensionOIDs.remove(u.Z1.d);
        return !criticalExtensionOIDs.isEmpty();
    }

    public boolean isRevoked(Certificate certificate) {
        s0.a.a.b3.c cVar;
        u s;
        if (certificate.getType().equals("X.509")) {
            Enumeration t = this.c.t();
            s0.a.a.b3.c cVar2 = this.c.c.q;
            if (t.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                BigInteger serialNumber = x509Certificate.getSerialNumber();
                while (t.hasMoreElements()) {
                    n0.b t2 = n0.b.t(t.nextElement());
                    if (this.isIndirect && t2.v() && (s = t2.s().s(u.b2)) != null) {
                        cVar2 = s0.a.a.b3.c.s(x.s(s.s()).t()[0].c);
                    }
                    if (t2.u().F(serialNumber)) {
                        if (certificate instanceof X509Certificate) {
                            cVar = s0.a.a.b3.c.s(x509Certificate.getIssuerX500Principal().getEncoded());
                        } else {
                            try {
                                cVar = s0.a.a.c3.n.s(certificate.getEncoded()).d.y;
                            } catch (CertificateEncodingException e) {
                                StringBuilder P0 = a.P0("Cannot process certificate: ");
                                P0.append(e.getMessage());
                                throw new IllegalArgumentException(P0.toString());
                            }
                        }
                        if (!cVar2.equals(cVar)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
    }

    public String toString() {
        String str;
        String j1;
        Object t;
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = j.a;
        stringBuffer.append("              Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(str2);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(str2);
        stringBuffer.append("          This update: ");
        stringBuffer.append(getThisUpdate());
        stringBuffer.append(str2);
        stringBuffer.append("          Next update: ");
        stringBuffer.append(getNextUpdate());
        stringBuffer.append(str2);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(str2);
        X509SignatureUtil.prettyPrintSignature(getSignature(), stringBuffer, str2);
        v vVar = this.c.c.Z1;
        if (vVar != null) {
            Enumeration v = vVar.v();
            if (v.hasMoreElements()) {
                str = "           Extensions: ";
                stringBuffer.append(str);
                stringBuffer.append(str2);
            }
            while (true) {
                if (!v.hasMoreElements()) {
                    break;
                }
                n nVar = (n) v.nextElement();
                u s = vVar.s(nVar);
                s0.a.a.o oVar = s.q2;
                if (oVar == null) {
                    break;
                }
                s0.a.a.j jVar = new s0.a.a.j(oVar.c);
                stringBuffer.append("                       critical(");
                stringBuffer.append(s.p2);
                stringBuffer.append(") ");
                s0.a.a.j jVar2 = new s0.a.a.j(oVar.c);
                stringBuffer.append("                       critical(");
                stringBuffer.append(s.p2);
                stringBuffer.append(") ");
                try {
                } catch (Exception unused) {
                    stringBuffer.append(nVar.d);
                    stringBuffer.append(" value = ");
                    str = "*****";
                }
                if (nVar.w(u.y)) {
                    t = new l(k.B(jVar2.i()).D());
                } else {
                    if (nVar.w(u.Z1)) {
                        j1 = "Base CRL: " + new l(k.B(jVar2.i()).D());
                    } else if (nVar.w(u.a2)) {
                        t = b0.u(jVar2.i());
                    } else if (nVar.w(u.d2)) {
                        t = s0.a.a.c3.k.t(jVar2.i());
                    } else if (nVar.w(u.j2)) {
                        t = s0.a.a.c3.k.t(jVar2.i());
                    } else {
                        stringBuffer.append(nVar.d);
                        stringBuffer.append(" value = ");
                        j1 = m0.r.t.a.r.m.a1.a.j1(jVar2.i());
                    }
                    stringBuffer.append(j1);
                    stringBuffer.append(str2);
                }
                stringBuffer.append(t);
                stringBuffer.append(str2);
                break;
                break;
            }
        }
        Set<Object> revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            for (Object append : revokedCertificates) {
                stringBuffer.append(append);
                stringBuffer.append(str2);
            }
        }
        return stringBuffer.toString();
    }

    public void verify(PublicKey publicKey) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        doVerify(publicKey, new SignatureCreator() {
            public Signature createSignature(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
                try {
                    return X509CRLImpl.this.bcHelper.createSignature(str);
                } catch (Exception unused) {
                    return Signature.getInstance(str);
                }
            }
        });
    }

    public void verify(PublicKey publicKey, final String str) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        doVerify(publicKey, new SignatureCreator() {
            public Signature createSignature(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
                String str2 = str;
                return str2 != null ? Signature.getInstance(str, str2) : Signature.getInstance(str);
            }
        });
    }

    public void verify(PublicKey publicKey, final Provider provider) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        try {
            doVerify(publicKey, new SignatureCreator() {
                public Signature createSignature(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
                    return provider != null ? Signature.getInstance(X509CRLImpl.this.getSigAlgName(), provider) : Signature.getInstance(X509CRLImpl.this.getSigAlgName());
                }
            });
        } catch (NoSuchProviderException e) {
            StringBuilder P0 = a.P0("provider issue: ");
            P0.append(e.getMessage());
            throw new NoSuchAlgorithmException(P0.toString());
        }
    }
}
