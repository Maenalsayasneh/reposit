package s0.a.f.b.a;

import java.util.HashMap;
import java.util.Map;
import s0.a.a.n;
import s0.a.b.b0.a0;
import s0.a.b.b0.c0;
import s0.a.b.b0.x;

public class b {
    public static Map<String, n> a = new HashMap();
    public static Map<n, String> b = new HashMap();

    static {
        Map<String, n> map = a;
        n nVar = s0.a.a.r2.b.c;
        map.put("SHA-256", nVar);
        Map<String, n> map2 = a;
        n nVar2 = s0.a.a.r2.b.e;
        map2.put("SHA-512", nVar2);
        Map<String, n> map3 = a;
        n nVar3 = s0.a.a.r2.b.m;
        map3.put("SHAKE128", nVar3);
        Map<String, n> map4 = a;
        n nVar4 = s0.a.a.r2.b.n;
        map4.put("SHAKE256", nVar4);
        b.put(nVar, "SHA-256");
        b.put(nVar2, "SHA-512");
        b.put(nVar3, "SHAKE128");
        b.put(nVar4, "SHAKE256");
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
}
