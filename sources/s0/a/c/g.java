package s0.a.c;

import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.util.Date;

public class g {
    public final k a;
    public final Date b;
    public final CertPath c;
    public final int d;
    public final X509Certificate e;
    public final PublicKey f;

    public g(k kVar, Date date, CertPath certPath, int i, X509Certificate x509Certificate, PublicKey publicKey) {
        this.a = kVar;
        this.b = date;
        this.c = certPath;
        this.d = i;
        this.e = x509Certificate;
        this.f = publicKey;
    }

    public Date a() {
        return new Date(this.b.getTime());
    }
}
