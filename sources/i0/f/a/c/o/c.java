package i0.f.a.c.o;

import i0.d.a.a.a;
import i0.f.a.c.t.f;
import java.lang.reflect.Method;

/* compiled from: JDK14Util */
public class c {
    public static final c a;
    public static final RuntimeException b;
    public final Method c;
    public final Method d;
    public final Method e;

    static {
        c cVar = null;
        try {
            e = null;
            cVar = new c();
        } catch (RuntimeException e2) {
            e = e2;
        }
        a = cVar;
        b = e;
    }

    public c() throws RuntimeException {
        try {
            this.c = Class.class.getMethod("getRecordComponents", new Class[0]);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.d = cls.getMethod("getName", new Class[0]);
            this.e = cls.getMethod("getType", new Class[0]);
        } catch (Exception e2) {
            throw new RuntimeException(String.format("Failed to access Methods needed to support `java.lang.Record`: (%s) %s", new Object[]{e2.getClass().getName(), e2.getMessage()}), e2);
        }
    }

    public Object[] a(Class<?> cls) throws IllegalArgumentException {
        try {
            return (Object[]) this.c.invoke(cls, new Object[0]);
        } catch (Exception unused) {
            StringBuilder P0 = a.P0("Failed to access RecordComponents of type ");
            P0.append(f.E(cls));
            throw new IllegalArgumentException(P0.toString());
        }
    }
}
