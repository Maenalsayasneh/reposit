package q0.h0.l.i;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import m0.n.b.i;
import okhttp3.Protocol;
import q0.h0.l.b;
import q0.h0.l.h;
import q0.h0.l.i.j;

/* compiled from: AndroidSocketAdapter.kt */
public class f implements k {
    public static final j.a a = new e("com.google.android.gms.org.conscrypt");
    public static final a b;
    public final Method c;
    public final Method d;
    public final Method e;
    public final Method f;
    public final Class<? super SSLSocket> g;

    /* compiled from: AndroidSocketAdapter.kt */
    public static final class a {
        public a(m0.n.b.f fVar) {
        }
    }

    static {
        a aVar = new a((m0.n.b.f) null);
        b = aVar;
        Objects.requireNonNull(aVar);
        i.e("com.google.android.gms.org.conscrypt", "packageName");
    }

    public f(Class<? super SSLSocket> cls) {
        i.e(cls, "sslSocketClass");
        this.g = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        i.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.c = declaredMethod;
        this.d = cls.getMethod("setHostname", new Class[]{String.class});
        this.e = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    public boolean a(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        return this.g.isInstance(sSLSocket);
    }

    public boolean b() {
        b.a aVar = b.e;
        return b.d;
    }

    public String c(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        if (!a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.e.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            i.d(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (NullPointerException e2) {
            if (i.a(e2.getMessage(), "ssl == null")) {
                return null;
            }
            throw e2;
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        } catch (InvocationTargetException e4) {
            throw new AssertionError(e4);
        }
    }

    public void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        if (a(sSLSocket)) {
            try {
                this.c.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.d.invoke(sSLSocket, new Object[]{str});
                }
                this.f.invoke(sSLSocket, new Object[]{h.c.b(list)});
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
