package q0.h0.l.i;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import m0.n.b.i;
import okhttp3.Protocol;
import q0.h0.l.h;

@SuppressLint({"NewApi"})
/* compiled from: Android10SocketAdapter.kt */
public final class a implements k {

    /* renamed from: q0.h0.l.i.a$a  reason: collision with other inner class name */
    /* compiled from: Android10SocketAdapter.kt */
    public static final class C0292a {
        public static final boolean a() {
            return h.c.c() && Build.VERSION.SDK_INT >= 29;
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    public boolean b() {
        return C0292a.a();
    }

    @SuppressLint({"NewApi"})
    public String c(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            i.d(sSLParameters, "sslParameters");
            Object[] array = ((ArrayList) h.c.a(list)).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
