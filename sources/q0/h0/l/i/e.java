package q0.h0.l.i;

import i0.d.a.a.a;
import javax.net.ssl.SSLSocket;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;
import q0.h0.l.i.f;
import q0.h0.l.i.j;

/* compiled from: AndroidSocketAdapter.kt */
public final class e implements j.a {
    public final /* synthetic */ String a;

    public e(String str) {
        this.a = str;
    }

    public boolean a(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        i.d(name, "sslSocket.javaClass.name");
        return StringsKt__IndentKt.J(name, a.x0(new StringBuilder(), this.a, '.'), false, 2);
    }

    public k b(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        f.a aVar = f.b;
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (cls2 != null && (!i.a(cls2.getSimpleName(), "OpenSSLSocketImpl"))) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        i.c(cls2);
        return new f(cls2);
    }
}
