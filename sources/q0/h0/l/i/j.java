package q0.h0.l.i;

import java.util.List;
import javax.net.ssl.SSLSocket;
import m0.n.b.i;
import okhttp3.Protocol;

/* compiled from: DeferredSocketAdapter.kt */
public final class j implements k {
    public k a;
    public final a b;

    /* compiled from: DeferredSocketAdapter.kt */
    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a aVar) {
        i.e(aVar, "socketAdapterFactory");
        this.b = aVar;
    }

    public boolean a(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        return this.b.a(sSLSocket);
    }

    public boolean b() {
        return true;
    }

    public String c(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        k e = e(sSLSocket);
        if (e != null) {
            return e.c(sSLSocket);
        }
        return null;
    }

    public void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        k e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized k e(SSLSocket sSLSocket) {
        if (this.a == null && this.b.a(sSLSocket)) {
            this.a = this.b.b(sSLSocket);
        }
        return this.a;
    }
}
