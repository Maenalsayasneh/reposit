package i0.f.a.c.m;

import i0.f.a.c.d;
import i0.f.a.c.g;
import i0.f.a.c.t.f;

/* compiled from: Java7Handlers */
public abstract class a {
    public static final a a;

    static {
        a aVar;
        try {
            aVar = (a) f.i(Class.forName("i0.f.a.c.m.b"), false);
        } catch (Throwable unused) {
            aVar = null;
        }
        a = aVar;
    }

    public abstract d<?> a(Class<?> cls);

    public abstract g<?> b(Class<?> cls);
}
