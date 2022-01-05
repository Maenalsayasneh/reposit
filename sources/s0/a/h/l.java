package s0.a.h;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.jce.provider.X509CertificateObject;
import s0.a.a.c3.p;
import s0.a.c.o.a;

public class l {
    public X509Certificate a;
    public X509Certificate b;

    public l(p pVar) throws CertificateParsingException {
        new a();
        if (pVar.c != null) {
            this.a = new X509CertificateObject(pVar.c);
        }
        if (pVar.d != null) {
            this.b = new X509CertificateObject(pVar.d);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        X509Certificate x509Certificate = this.a;
        boolean equals = x509Certificate != null ? x509Certificate.equals(lVar.a) : lVar.a == null;
        X509Certificate x509Certificate2 = this.b;
        X509Certificate x509Certificate3 = lVar.b;
        return equals && (x509Certificate2 != null ? x509Certificate2.equals(x509Certificate3) : x509Certificate3 == null);
    }

    public int hashCode() {
        X509Certificate x509Certificate = this.a;
        int i = -1;
        if (x509Certificate != null) {
            i = -1 ^ x509Certificate.hashCode();
        }
        X509Certificate x509Certificate2 = this.b;
        return x509Certificate2 != null ? (i * 17) ^ x509Certificate2.hashCode() : i;
    }
}
