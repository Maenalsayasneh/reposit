package n0.c.k;

import java.util.Map;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import m0.i;
import m0.j.g;
import m0.n.b.b;
import m0.n.b.h;
import m0.n.b.k;
import m0.n.b.m;
import m0.n.b.o;
import m0.n.b.q;
import m0.r.d;
import m0.r.t.a.r.m.a1.a;

/* compiled from: Primitives.kt */
public final class a1 {
    public static final Map<d<? extends Object>, KSerializer<? extends Object>> a;

    static {
        d a2 = m.a(String.class);
        a.s3(q.a);
        d a3 = m.a(Long.TYPE);
        a.q3(k.a);
        d a4 = m.a(Integer.TYPE);
        a.p3(h.a);
        d a5 = m.a(Short.TYPE);
        a.r3(o.a);
        d a6 = m.a(Byte.TYPE);
        a.o3(b.a);
        a = g.N(new Pair(a2, g1.b), new Pair(m.a(Character.TYPE), o.b), new Pair(m.a(char[].class), n.c), new Pair(m.a(Double.TYPE), r.b), new Pair(m.a(double[].class), q.c), new Pair(m.a(Float.TYPE), u.b), new Pair(m.a(float[].class), t.c), new Pair(a3, o0.b), new Pair(m.a(long[].class), n0.c), new Pair(a4, e0.b), new Pair(m.a(int[].class), d0.c), new Pair(a5, f1.b), new Pair(m.a(short[].class), e1.c), new Pair(a6, k.b), new Pair(m.a(byte[].class), j.c), new Pair(m.a(Boolean.TYPE), h.b), new Pair(m.a(boolean[].class), g.c), new Pair(m.a(i.class), m1.a));
    }
}
