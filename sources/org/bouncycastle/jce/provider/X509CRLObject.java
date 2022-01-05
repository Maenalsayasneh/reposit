package org.bouncycastle.jce.provider;

import i0.d.a.a.a;
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
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import s0.a.a.b3.c;
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
import s0.a.g.j;
import s0.a.g.k.d;

public class X509CRLObject extends X509CRL {
    private o c;
    private int hashCodeValue;
    private boolean isHashCodeSet = false;
    private boolean isIndirect;
    private String sigAlgName;
    private byte[] sigAlgParams;

    public X509CRLObject(o oVar) throws CRLException {
        this.c = oVar;
        try {
            this.sigAlgName = X509SignatureUtil.getSignatureName(oVar.d);
            e eVar = oVar.d.d;
            if (eVar != null) {
                this.sigAlgParams = eVar.c().r("DER");
            } else {
                this.sigAlgParams = null;
            }
            this.isIndirect = isIndirectCRL(this);
        } catch (Exception e) {
            throw new CRLException("CRL contents invalid: " + e);
        }
    }

    private void doVerify(PublicKey publicKey, Signature signature) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        o oVar = this.c;
        if (oVar.d.equals(oVar.c.d)) {
            signature.initVerify(publicKey);
            signature.update(getTBSCertList());
            if (!signature.verify(getSignature())) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
            return;
        }
        throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
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

    public static boolean isIndirectCRL(X509CRL x509crl) throws CRLException {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(u.a2.d);
            return extensionValue != null && b0.u(s0.a.a.o.B(extensionValue).c).y;
        } catch (Exception e) {
            throw new ExtCRLException("Exception reading IssuingDistributionPoint", e);
        }
    }

    private Set loadCRLEntries() {
        u s;
        HashSet hashSet = new HashSet();
        Enumeration t = this.c.t();
        c cVar = null;
        while (t.hasMoreElements()) {
            n0.b bVar = (n0.b) t.nextElement();
            hashSet.add(new X509CRLEntryObject(bVar, this.isIndirect, cVar));
            if (this.isIndirect && bVar.v() && (s = bVar.s().s(u.b2)) != null) {
                cVar = c.s(x.s(s.s()).t()[0].c);
            }
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509CRL)) {
            return false;
        }
        if (!(obj instanceof X509CRLObject)) {
            return super.equals(obj);
        }
        X509CRLObject x509CRLObject = (X509CRLObject) obj;
        if (!this.isHashCodeSet || !x509CRLObject.isHashCodeSet || x509CRLObject.hashCodeValue == this.hashCodeValue) {
            return this.c.equals(x509CRLObject.c);
        }
        return false;
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
        v vVar = this.c.c.Z1;
        if (vVar == null) {
            return null;
        }
        u uVar = (u) vVar.c.get(new n(str));
        if (uVar == null) {
            return null;
        }
        try {
            return uVar.q2.getEncoded();
        } catch (Exception e) {
            throw new IllegalStateException(a.b0(e, a.P0("error parsing ")));
        }
    }

    public Principal getIssuerDN() {
        return new s0.a.d.c(c.s(this.c.c.q.Y1));
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
        if (t0Var != null) {
            return t0Var.s();
        }
        return null;
    }

    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        u s;
        Enumeration t = this.c.t();
        c cVar = null;
        while (t.hasMoreElements()) {
            n0.b bVar = (n0.b) t.nextElement();
            if (bVar.u().F(bigInteger)) {
                return new X509CRLEntryObject(bVar, this.isIndirect, cVar);
            }
            if (this.isIndirect && bVar.v() && (s = bVar.s().s(u.b2)) != null) {
                cVar = c.s(x.s(s.s()).t()[0].c);
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
        byte[] bArr = this.sigAlgParams;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
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
        criticalExtensionOIDs.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
        criticalExtensionOIDs.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
        return !criticalExtensionOIDs.isEmpty();
    }

    public int hashCode() {
        if (!this.isHashCodeSet) {
            this.isHashCodeSet = true;
            this.hashCodeValue = super.hashCode();
        }
        return this.hashCodeValue;
    }

    public boolean isRevoked(Certificate certificate) {
        c cVar;
        u s;
        if (certificate.getType().equals("X.509")) {
            Enumeration t = this.c.t();
            c cVar2 = this.c.c.q;
            X509Certificate x509Certificate = (X509Certificate) certificate;
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            while (t.hasMoreElements()) {
                n0.b t2 = n0.b.t(t.nextElement());
                if (this.isIndirect && t2.v() && (s = t2.s().s(u.b2)) != null) {
                    cVar2 = c.s(x.s(s.s()).t()[0].c);
                }
                if (t2.u().F(serialNumber)) {
                    if (certificate instanceof X509Certificate) {
                        cVar = c.s(x509Certificate.getIssuerX500Principal().getEncoded());
                    } else {
                        try {
                            cVar = s0.a.a.c3.n.s(certificate.getEncoded()).d.y;
                        } catch (CertificateEncodingException unused) {
                            throw new RuntimeException("Cannot process certificate");
                        }
                    }
                    if (!cVar2.equals(cVar)) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("X.509 CRL used with non X.509 Cert");
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
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ");
        stringBuffer.append(new String(d.e(signature, 0, 20)));
        stringBuffer.append(str2);
        int i = 20;
        while (i < signature.length) {
            int length = signature.length - 20;
            stringBuffer.append("                       ");
            stringBuffer.append(i < length ? new String(d.e(signature, i, 20)) : new String(d.e(signature, i, signature.length - i)));
            stringBuffer.append(str2);
            i += 20;
        }
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
        Signature signature;
        try {
            signature = Signature.getInstance(getSigAlgName(), BouncyCastleProvider.PROVIDER_NAME);
        } catch (Exception unused) {
            signature = Signature.getInstance(getSigAlgName());
        }
        doVerify(publicKey, signature);
    }

    public void verify(PublicKey publicKey, String str) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        doVerify(publicKey, str != null ? Signature.getInstance(getSigAlgName(), str) : Signature.getInstance(getSigAlgName()));
    }

    public void verify(PublicKey publicKey, Provider provider) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        doVerify(publicKey, provider != null ? Signature.getInstance(getSigAlgName(), provider) : Signature.getInstance(getSigAlgName()));
    }
}
