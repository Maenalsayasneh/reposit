package m0.r.t.a.r.e.a;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;

/* compiled from: BuiltinSpecialProperties.kt */
public final class c {
    public static final c a = new c();
    public static final Map<b, d> b;
    public static final Map<d, List<d>> c;
    public static final Set<b> d;
    public static final Set<d> e;

    static {
        m0.r.t.a.r.g.c cVar = g.a.r;
        b bVar = g.a.N;
        Map<b, d> N = m0.j.g.N(new Pair(h.i(cVar, "name"), d.g("name")), new Pair(h.i(cVar, "ordinal"), d.g("ordinal")), new Pair(h.h(g.a.J, "size"), d.g("size")), new Pair(h.h(bVar, "size"), d.g("size")), new Pair(h.i(g.a.f, "length"), d.g("length")), new Pair(h.h(bVar, "keys"), d.g("keySet")), new Pair(h.h(bVar, "values"), d.g("values")), new Pair(h.h(bVar, "entries"), d.g("entrySet")));
        b = N;
        Set<Map.Entry<b, d>> entrySet = N.entrySet();
        ArrayList<Pair> arrayList = new ArrayList<>(h.K(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new Pair(((b) entry.getKey()).g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            d dVar = (d) pair.d;
            Object obj = linkedHashMap.get(dVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(dVar, obj);
            }
            ((List) obj).add((d) pair.c);
        }
        c = linkedHashMap;
        Set<b> keySet = b.keySet();
        d = keySet;
        ArrayList arrayList2 = new ArrayList(h.K(keySet, 10));
        for (b g : keySet) {
            arrayList2.add(g.g());
        }
        e = m0.j.g.D0(arrayList2);
    }
}
