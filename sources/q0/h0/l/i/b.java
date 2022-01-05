package q0.h0.l.i;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import m0.n.b.i;
import q0.h0.n.c;

/* compiled from: AndroidCertificateChainCleaner.kt */
public final class b extends c {
    public final X509TrustManager a;
    public final X509TrustManagerExtensions b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        i.e(x509TrustManager, "trustManager");
        i.e(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.a = x509TrustManager;
        this.b = x509TrustManagerExtensions;
    }

    public static final b b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        i.e(x509TrustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            return new b(x509TrustManager, x509TrustManagerExtensions);
        }
        return null;
    }

    public List<Certificate> a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        i.e(list, "chain");
        i.e(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        try {
            List<X509Certificate> checkServerTrusted = this.b.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            i.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).a == this.a;
    }

    public int hashCode() {
        return System.identityHashCode(this.a);
    }
}
