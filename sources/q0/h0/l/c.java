package q0.h0.l;

import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import m0.n.b.f;
import m0.n.b.i;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* compiled from: BouncyCastlePlatform.kt */
public final class c extends h {
    public static final boolean d;
    public static final a e;
    public final Provider f = new BouncyCastleJsseProvider();

    /* compiled from: BouncyCastlePlatform.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    static {
        a aVar = new a((f) null);
        e = aVar;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        d = z;
    }

    public void d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            List<String> a2 = h.c.a(list);
            i.d(parameters, "sslParameters");
            Object[] array = ((ArrayList) a2).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
            return;
        }
        super.d(sSLSocket, str, list);
    }

    public String f(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        if (sSLSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
                return applicationProtocol;
            }
        } else {
            super.f(sSLSocket);
        }
        return null;
    }

    public SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f);
        i.d(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    public X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        instance.init((KeyStore) null);
        i.d(instance, "factory");
        TrustManager[] trustManagers = instance.getTrustManagers();
        i.c(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        i.d(arrays, "java.util.Arrays.toString(this)");
        P0.append(arrays);
        throw new IllegalStateException(P0.toString().toString());
    }
}
