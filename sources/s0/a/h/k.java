package s0.a.h;

import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import s0.a.g.h;

public class k extends X509CertSelector implements h {
    public static final /* synthetic */ int c = 0;

    public Object clone() {
        return (k) super.clone();
    }

    public boolean match(Certificate certificate) {
        return r0(certificate);
    }

    public boolean r0(Object obj) {
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        return super.match((X509Certificate) obj);
    }
}
