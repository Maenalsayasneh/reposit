package s0.a.c.o;

import java.util.HashMap;
import java.util.Map;
import s0.a.a.n;
import s0.a.a.o2.a;
import s0.a.a.v2.b;

public class d {
    public static Map<n, String> a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(s0.a.a.w2.n.V, "MD2");
        a.put(s0.a.a.w2.n.W, "MD4");
        a.put(s0.a.a.w2.n.X, "MD5");
        a.put(b.f, "SHA-1");
        a.put(s0.a.a.r2.b.f, "SHA-224");
        a.put(s0.a.a.r2.b.c, "SHA-256");
        a.put(s0.a.a.r2.b.d, "SHA-384");
        a.put(s0.a.a.r2.b.e, "SHA-512");
        a.put(s0.a.a.z2.b.c, "RIPEMD-128");
        a.put(s0.a.a.z2.b.b, "RIPEMD-160");
        a.put(s0.a.a.z2.b.d, "RIPEMD-128");
        a.put(a.d, "RIPEMD-128");
        a.put(a.c, "RIPEMD-160");
        a.put(s0.a.a.g2.a.b, "GOST3411");
        a.put(s0.a.a.k2.a.a, "Tiger");
        a.put(a.e, "Whirlpool");
        a.put(s0.a.a.r2.b.i, "SHA3-224");
        a.put(s0.a.a.r2.b.j, "SHA3-256");
        a.put(s0.a.a.r2.b.k, "SHA3-384");
        a.put(s0.a.a.r2.b.l, "SHA3-512");
        a.put(s0.a.a.j2.b.p, "SM3");
    }

    public static String a(n nVar) {
        String str = a.get(nVar);
        return str != null ? str : nVar.d;
    }
}
