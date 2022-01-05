package i0.b.b;

import java.util.Map;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.i;

/* compiled from: ReflectionExtensions.kt */
public final class d0 {
    public static final Map<? extends Class<? extends Object>, Class<? extends Object>> a;

    static {
        Class cls = Boolean.TYPE;
        a = g.N(new Pair(cls, cls), new Pair(Byte.TYPE, Byte.class), new Pair(Character.TYPE, Character.class), new Pair(Double.TYPE, Double.class), new Pair(Float.TYPE, Float.class), new Pair(Integer.TYPE, Integer.class), new Pair(Long.TYPE, Long.class), new Pair(Short.TYPE, Short.class));
    }

    public static final boolean a(Class<?> cls, Class<?> cls2) {
        i.e(cls, "targetClass");
        i.e(cls2, "primitive");
        if (cls2.isPrimitive()) {
            return i.a(a.get(cls2), cls);
        }
        throw new IllegalArgumentException("First argument has to be primitive type".toString());
    }
}
