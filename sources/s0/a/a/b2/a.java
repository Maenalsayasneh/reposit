package s0.a.a.b2;

import java.math.BigInteger;
import java.util.Hashtable;
import s0.a.a.d3.h;
import s0.a.a.d3.i;
import s0.a.a.d3.j;
import s0.a.a.n;
import s0.a.e.b.e;
import s0.a.e.b.v;
import s0.a.g.k.d;

public class a {
    public static i a = new C0295a();
    public static final Hashtable b;
    public static final Hashtable c;
    public static final Hashtable d;

    /* renamed from: s0.a.a.b2.a$a  reason: collision with other inner class name */
    public static class C0295a extends i {
        public h a() {
            BigInteger a = a.a("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger a2 = a.a("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger a3 = a.a("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            BigInteger a4 = a.a("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger valueOf = BigInteger.valueOf(1);
            e.C0302e eVar = new e.C0302e(a, a2, a3, a4, valueOf);
            j jVar = new j((e) eVar, d.b("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB"));
            v.a(jVar.s());
            return new h(eVar, jVar, a4, valueOf, (byte[]) null);
        }
    }

    static {
        Hashtable hashtable = new Hashtable();
        b = hashtable;
        Hashtable hashtable2 = new Hashtable();
        c = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        d = hashtable3;
        n nVar = b.a;
        i iVar = a;
        hashtable.put(s0.a.g.j.d("FRP256v1"), nVar);
        hashtable3.put(nVar, "FRP256v1");
        hashtable2.put(nVar, iVar);
    }

    public static BigInteger a(String str) {
        return new BigInteger(1, d.b(str));
    }
}
