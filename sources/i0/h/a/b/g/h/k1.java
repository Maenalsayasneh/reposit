package i0.h.a.b.g.h;

import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class k1 {
    public static final Class<?> a;
    public static final x1<?, ?> b = a(false);
    public static final x1<?, ?> c = a(true);
    public static final x1<?, ?> d = new z1();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
    }

    public static x1<?, ?> a(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (x1) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static <T, FT extends x<FT>> void b(u<FT> uVar, T t, T t2) {
        v<FT> a2 = uVar.a(t2);
        if (!a2.b.isEmpty()) {
            v<FT> c2 = uVar.c(t);
            Objects.requireNonNull(c2);
            for (int i = 0; i < a2.b.f(); i++) {
                c2.g(a2.b.d(i));
            }
            for (Map.Entry<T, Object> g : a2.b.h()) {
                c2.g(g);
            }
        }
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
