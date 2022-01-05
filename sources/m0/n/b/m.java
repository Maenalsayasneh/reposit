package m0.n.b;

import java.util.Arrays;
import java.util.Collections;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference1;
import m0.r.d;
import m0.r.j;
import m0.r.n;
import m0.r.p;

/* compiled from: Reflection */
public class m {
    public static final n a;
    public static final d[] b = new d[0];

    static {
        n nVar;
        try {
            nVar = (n) Class.forName("m0.r.t.a.m").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            nVar = null;
        }
        if (nVar == null) {
            nVar = new n();
        }
        a = nVar;
    }

    public static d a(Class cls) {
        return a.b(cls);
    }

    public static j b(MutablePropertyReference1 mutablePropertyReference1) {
        return a.e(mutablePropertyReference1);
    }

    public static m0.r.m c(PropertyReference1 propertyReference1) {
        return a.f(propertyReference1);
    }

    public static String d(g gVar) {
        return a.g(gVar);
    }

    public static n e(Class cls) {
        return a.i(a(cls), Collections.emptyList(), false);
    }

    public static n f(Class cls, p pVar, p pVar2) {
        return a.i(a(cls), Arrays.asList(new p[]{pVar, pVar2}), false);
    }
}
