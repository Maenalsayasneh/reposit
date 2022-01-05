package q0.h0.l.i;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: StandardAndroidSocketAdapter.kt */
public final class l extends f {
    public static final a h = new a((f) null);

    /* compiled from: StandardAndroidSocketAdapter.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        i.e(cls, "sslSocketClass");
        i.e(cls2, "sslSocketFactoryClass");
        i.e(cls3, "paramClass");
    }
}
