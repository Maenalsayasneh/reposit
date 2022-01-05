package q0.h0.l;

import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import m0.n.b.f;
import m0.n.b.i;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* compiled from: ConscryptPlatform.kt */
public final class d extends h {
    public static final boolean d;
    public static final a e;
    public final Provider f;

    /* compiled from: ConscryptPlatform.kt */
    public static final class a {
        public a(f fVar) {
        }

        public final boolean a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != i) {
                if (version.major() > i) {
                    return true;
                }
                return false;
            } else if (version.minor() != i2) {
                if (version.minor() > i2) {
                    return true;
                }
                return false;
            } else if (version.patch() >= i3) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* compiled from: ConscryptPlatform.kt */
    public static final class b implements ConscryptHostnameVerifier {
        public static final b a = new b();
    }

    static {
        a aVar = new a((f) null);
        e = aVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable() && aVar.a(2, 1, 0)) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        d = z;
    }

    public d() {
        Provider newProvider = Conscrypt.newProvider();
        i.d(newProvider, "Conscrypt.newProvider()");
        this.f = newProvider;
    }

    public void d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = ((ArrayList) h.c.a(list)).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
            return;
        }
        super.d(sSLSocket, str, list);
    }

    public String f(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        super.f(sSLSocket);
        return null;
    }

    public SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f);
        i.d(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        i.e(x509TrustManager, "trustManager");
        SSLContext instance = SSLContext.getInstance("TLS", this.f);
        i.d(instance, "SSLContext.getInstance(\"TLS\", provider)");
        instance.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
        SSLSocketFactory socketFactory = instance.getSocketFactory();
        i.d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    public X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        i.d(instance, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = instance.getTrustManagers();
        i.c(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, b.a);
            return x509TrustManager;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        i.d(arrays, "java.util.Arrays.toString(this)");
        P0.append(arrays);
        throw new IllegalStateException(P0.toString().toString());
    }
}
