package s0.a.f.b.g;

import i0.d.a.a.a;
import java.util.HashMap;
import java.util.Map;
import s0.a.a.n;
import s0.a.b.b0.a0;
import s0.a.b.b0.c0;
import s0.a.b.b0.x;
import s0.a.f.a.e;
import s0.a.f.a.h;

public class b {
    public static final s0.a.a.c3.b a;
    public static final s0.a.a.c3.b b;
    public static final s0.a.a.c3.b c = new s0.a.a.c3.b(s0.a.a.r2.b.j);
    public static final s0.a.a.c3.b d = new s0.a.a.c3.b(s0.a.a.r2.b.h);
    public static final s0.a.a.c3.b e = new s0.a.a.c3.b(s0.a.a.r2.b.c);
    public static final s0.a.a.c3.b f = new s0.a.a.c3.b(s0.a.a.r2.b.e);
    public static final s0.a.a.c3.b g = new s0.a.a.c3.b(s0.a.a.r2.b.m);
    public static final s0.a.a.c3.b h = new s0.a.a.c3.b(s0.a.a.r2.b.n);
    public static final Map i;

    static {
        n nVar = e.q;
        a = new s0.a.a.c3.b(nVar);
        n nVar2 = e.r;
        b = new s0.a.a.c3.b(nVar2);
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put(nVar, 5);
        hashMap.put(nVar2, 6);
    }

    public static s0.a.b.n a(n nVar) {
        if (nVar.w(s0.a.a.r2.b.c)) {
            return new x();
        }
        if (nVar.w(s0.a.a.r2.b.e)) {
            return new a0();
        }
        if (nVar.w(s0.a.a.r2.b.m)) {
            return new c0(128);
        }
        if (nVar.w(s0.a.a.r2.b.n)) {
            return new c0(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + nVar);
    }

    public static s0.a.a.c3.b b(int i2) {
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return b;
        }
        throw new IllegalArgumentException(a.e0("unknown security category: ", i2));
    }

    public static s0.a.a.c3.b c(String str) {
        if (str.equals("SHA3-256")) {
            return c;
        }
        if (str.equals("SHA-512/256")) {
            return d;
        }
        throw new IllegalArgumentException(a.n0("unknown tree digest: ", str));
    }

    public static String d(h hVar) {
        s0.a.a.c3.b bVar = hVar.d;
        if (bVar.c.w(c.c)) {
            return "SHA3-256";
        }
        if (bVar.c.w(d.c)) {
            return "SHA-512/256";
        }
        StringBuilder P0 = a.P0("unknown tree digest: ");
        P0.append(bVar.c);
        throw new IllegalArgumentException(P0.toString());
    }

    public static s0.a.a.c3.b e(String str) {
        if (str.equals("SHA-256")) {
            return e;
        }
        if (str.equals("SHA-512")) {
            return f;
        }
        if (str.equals("SHAKE128")) {
            return g;
        }
        if (str.equals("SHAKE256")) {
            return h;
        }
        throw new IllegalArgumentException(a.n0("unknown tree digest: ", str));
    }
}
