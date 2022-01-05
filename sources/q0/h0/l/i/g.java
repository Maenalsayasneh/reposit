package q0.h0.l.i;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import m0.n.b.i;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import q0.h0.l.c;
import q0.h0.l.h;
import q0.h0.l.i.j;

/* compiled from: BouncyCastleSocketAdapter.kt */
public final class g implements k {
    public static final j.a a = new a();

    /* compiled from: BouncyCastleSocketAdapter.kt */
    public static final class a implements j.a {
        public boolean a(SSLSocket sSLSocket) {
            i.e(sSLSocket, "sslSocket");
            c.a aVar = c.e;
            return c.d && (sSLSocket instanceof BCSSLSocket);
        }

        public k b(SSLSocket sSLSocket) {
            i.e(sSLSocket, "sslSocket");
            return new g();
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    public boolean b() {
        c.a aVar = c.e;
        return c.d;
    }

    public String c(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    public void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            i.d(parameters, "sslParameters");
            Object[] array = ((ArrayList) h.c.a(list)).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
