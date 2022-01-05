package org.bouncycastle.jce.provider;

import i0.d.a.a.a;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import s0.a.a.b3.c;
import s0.a.a.c3.m;
import s0.a.a.c3.n0;
import s0.a.a.c3.t0;
import s0.a.a.c3.u;
import s0.a.a.c3.v;
import s0.a.a.c3.v0;
import s0.a.a.c3.w;
import s0.a.a.c3.x;
import s0.a.a.g;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.g.j;

public class X509CRLEntryObject extends X509CRLEntry {
    private n0.b c;
    private c certificateIssuer;
    private int hashValue;
    private boolean isHashValueSet;

    public X509CRLEntryObject(n0.b bVar) {
        this.c = bVar;
        this.certificateIssuer = null;
    }

    public X509CRLEntryObject(n0.b bVar, boolean z, c cVar) {
        this.c = bVar;
        this.certificateIssuer = loadCertificateIssuer(z, cVar);
    }

    private u getExtension(n nVar) {
        v s = this.c.s();
        if (s != null) {
            return (u) s.c.get(nVar);
        }
        return null;
    }

    private Set getExtensionOIDs(boolean z) {
        v s = this.c.s();
        if (s == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration v = s.v();
        while (v.hasMoreElements()) {
            n nVar = (n) v.nextElement();
            if (z == s.s(nVar).p2) {
                hashSet.add(nVar.d);
            }
        }
        return hashSet;
    }

    private c loadCertificateIssuer(boolean z, c cVar) {
        if (!z) {
            return null;
        }
        u extension = getExtension(u.b2);
        if (extension == null) {
            return cVar;
        }
        try {
            w[] t = x.s(extension.s()).t();
            for (int i = 0; i < t.length; i++) {
                if (t[i].d == 4) {
                    return c.s(t[i].c);
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof X509CRLEntryObject ? this.c.equals(((X509CRLEntryObject) obj).c) : super.equals(this);
    }

    public X500Principal getCertificateIssuer() {
        if (this.certificateIssuer == null) {
            return null;
        }
        try {
            return new X500Principal(this.certificateIssuer.getEncoded());
        } catch (IOException unused) {
            return null;
        }
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
        u extension = getExtension(new n(str));
        if (extension == null) {
            return null;
        }
        try {
            return extension.q2.getEncoded();
        } catch (Exception e) {
            throw new RuntimeException(a.b0(e, a.P0("error encoding ")));
        }
    }

    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    public Date getRevocationDate() {
        return t0.t(this.c.c.D(1)).s();
    }

    public BigInteger getSerialNumber() {
        return this.c.u().E();
    }

    public boolean hasExtensions() {
        return this.c.s() != null;
    }

    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty();
    }

    public int hashCode() {
        if (!this.isHashValueSet) {
            this.hashValue = super.hashCode();
            this.isHashValueSet = true;
        }
        return this.hashValue;
    }

    public String toString() {
        Object s;
        StringBuffer stringBuffer = new StringBuffer();
        String str = j.a;
        stringBuffer.append("      userCertificate: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(str);
        stringBuffer.append("       revocationDate: ");
        stringBuffer.append(getRevocationDate());
        stringBuffer.append(str);
        stringBuffer.append("       certificateIssuer: ");
        stringBuffer.append(getCertificateIssuer());
        stringBuffer.append(str);
        v s2 = this.c.s();
        if (s2 != null) {
            Enumeration v = s2.v();
            if (v.hasMoreElements()) {
                String str2 = "   crlEntryExtensions:";
                loop0:
                while (true) {
                    stringBuffer.append(str2);
                    while (true) {
                        stringBuffer.append(str);
                        while (true) {
                            if (!v.hasMoreElements()) {
                                break loop0;
                            }
                            n nVar = (n) v.nextElement();
                            u s3 = s2.s(nVar);
                            o oVar = s3.q2;
                            if (oVar != null) {
                                s0.a.a.j jVar = new s0.a.a.j(oVar.c);
                                stringBuffer.append("                       critical(");
                                stringBuffer.append(s3.p2);
                                stringBuffer.append(") ");
                                try {
                                    if (nVar.w(v0.a)) {
                                        s = m.s(g.C(jVar.i()));
                                    } else if (nVar.w(v0.b)) {
                                        stringBuffer.append("Certificate issuer: ");
                                        s = x.s(jVar.i());
                                    } else {
                                        stringBuffer.append(nVar.d);
                                        stringBuffer.append(" value = ");
                                        stringBuffer.append(m0.r.t.a.r.m.a1.a.j1(jVar.i()));
                                        stringBuffer.append(str);
                                    }
                                    stringBuffer.append(s);
                                    stringBuffer.append(str);
                                } catch (Exception unused) {
                                    stringBuffer.append(nVar.d);
                                    stringBuffer.append(" value = ");
                                    str2 = "*****";
                                }
                            }
                        }
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
