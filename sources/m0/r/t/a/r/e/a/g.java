package m0.r.t.a.r.e.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.g.b;

/* compiled from: FakePureImplementationsProvider.kt */
public final class g {
    public static final g a = null;
    public static final HashMap<b, b> b = new HashMap<>();

    static {
        b(g.a.S, a("java.util.ArrayList", "java.util.LinkedList"));
        b(g.a.U, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(g.a.V, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b(new b("java.util.function.Function"), a("java.util.function.UnaryOperator"));
        b(new b("java.util.function.BiFunction"), a("java.util.function.BinaryOperator"));
    }

    public static final List<b> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String bVar : strArr) {
            arrayList.add(new b(bVar));
        }
        return arrayList;
    }

    public static final void b(b bVar, List<b> list) {
        HashMap<b, b> hashMap = b;
        for (T next : list) {
            b bVar2 = (b) next;
            hashMap.put(next, bVar);
        }
    }
}
