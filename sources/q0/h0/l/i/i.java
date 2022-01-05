package q0.h0.l.i;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import q0.h0.l.d;
import q0.h0.l.h;
import q0.h0.l.i.j;

/* compiled from: ConscryptSocketAdapter.kt */
public final class i implements k {
    public static final j.a a = new a();

    /* compiled from: ConscryptSocketAdapter.kt */
    public static final class a implements j.a {
        public boolean a(SSLSocket sSLSocket) {
            m0.n.b.i.e(sSLSocket, "sslSocket");
            d.a aVar = d.e;
            return d.d && Conscrypt.isConscrypt(sSLSocket);
        }

        public k b(SSLSocket sSLSocket) {
            m0.n.b.i.e(sSLSocket, "sslSocket");
            return new i();
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        m0.n.b.i.e(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    public boolean b() {
        d.a aVar = d.e;
        return d.d;
    }

    public String c(SSLSocket sSLSocket) {
        m0.n.b.i.e(sSLSocket, "sslSocket");
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        m0.n.b.i.e(sSLSocket, "sslSocket");
        m0.n.b.i.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = ((ArrayList) h.c.a(list)).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
