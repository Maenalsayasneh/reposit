package s0.a.a.r2;

import java.util.Hashtable;
import s0.a.a.n;
import s0.a.a.y2.d;

public class a {
    public static final Hashtable a = new Hashtable();
    public static final Hashtable b = new Hashtable();

    static {
        a("B-571", d.F);
        a("B-409", d.D);
        a("B-283", d.n);
        a("B-233", d.t);
        a("B-163", d.l);
        a("K-571", d.E);
        a("K-409", d.C);
        a("K-283", d.m);
        a("K-233", d.s);
        a("K-163", d.b);
        a("P-521", d.B);
        a("P-384", d.A);
        a("P-256", d.H);
        a("P-224", d.z);
        a("P-192", d.G);
    }

    public static void a(String str, n nVar) {
        a.put(str, nVar);
        b.put(nVar, str);
    }
}
