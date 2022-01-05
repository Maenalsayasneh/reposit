package s0.a.h;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.util.Arrays;
import s0.a.a.c3.u;
import s0.a.a.k;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.e.b.b0.c.h3;
import s0.a.g.h;

public class i extends X509CRLSelector implements h {
    public h Y1;
    public boolean c = false;
    public boolean d = false;
    public BigInteger q = null;
    public byte[] x = null;
    public boolean y = false;

    public Object clone() {
        i iVar = new i();
        iVar.setCertificateChecking(getCertificateChecking());
        iVar.setDateAndTime(getDateAndTime());
        try {
            iVar.setIssuerNames(getIssuerNames());
            iVar.setIssuers(getIssuers());
            iVar.setMaxCRLNumber(getMaxCRL());
            iVar.setMinCRLNumber(getMinCRL());
            iVar.c = this.c;
            iVar.d = this.d;
            iVar.q = this.q;
            iVar.Y1 = this.Y1;
            iVar.y = this.y;
            iVar.x = h3.I(this.x);
            return iVar;
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public boolean match(CRL crl) {
        return r0(crl);
    }

    public boolean r0(Object obj) {
        if (!(obj instanceof X509CRL)) {
            return false;
        }
        X509CRL x509crl = (X509CRL) obj;
        k kVar = null;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(u.Z1.d);
            if (extensionValue != null) {
                kVar = k.B(r.x(((o) r.x(extensionValue)).c));
            }
            if (this.c && kVar == null) {
                return false;
            }
            if (this.d && kVar != null) {
                return false;
            }
            if (kVar != null && this.q != null && kVar.D().compareTo(this.q) == 1) {
                return false;
            }
            if (this.y) {
                byte[] extensionValue2 = x509crl.getExtensionValue(u.a2.d);
                byte[] bArr = this.x;
                if (bArr == null) {
                    if (extensionValue2 != null) {
                        return false;
                    }
                } else if (!Arrays.equals(extensionValue2, bArr)) {
                    return false;
                }
            }
            return super.match(x509crl);
        } catch (Exception unused) {
            return false;
        }
    }
}
