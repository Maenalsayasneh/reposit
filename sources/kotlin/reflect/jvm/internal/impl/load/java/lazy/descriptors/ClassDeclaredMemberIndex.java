package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.sequences.SequencesKt___SequencesKt;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.e.a.u.g.a;
import m0.r.t.a.r.e.a.w.g;
import m0.r.t.a.r.e.a.w.n;
import m0.r.t.a.r.e.a.w.p;
import m0.r.t.a.r.e.a.w.q;
import m0.r.t.a.r.e.a.w.s;
import m0.r.t.a.r.e.a.w.v;
import m0.r.t.a.r.g.d;
import m0.s.e;
import m0.s.h;

/* compiled from: DeclaredMemberIndex.kt */
public class ClassDeclaredMemberIndex implements a {
    public final g a;
    public final l<p, Boolean> b;
    public final l<q, Boolean> c;
    public final Map<d, List<q>> d;
    public final Map<d, n> e;
    public final Map<d, v> f;

    public ClassDeclaredMemberIndex(g gVar, l<? super p, Boolean> lVar) {
        i.e(gVar, "jClass");
        i.e(lVar, "memberFilter");
        this.a = gVar;
        this.b = lVar;
        ClassDeclaredMemberIndex$methodFilter$1 classDeclaredMemberIndex$methodFilter$1 = new ClassDeclaredMemberIndex$methodFilter$1(this);
        this.c = classDeclaredMemberIndex$methodFilter$1;
        h<T> d2 = SequencesKt___SequencesKt.d(m0.j.g.e(gVar.L()), classDeclaredMemberIndex$methodFilter$1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e.a aVar = new e.a((e) d2);
        while (aVar.hasNext()) {
            Object next = aVar.next();
            d name = ((q) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.d = linkedHashMap;
        h<T> d3 = SequencesKt___SequencesKt.d(m0.j.g.e(this.a.B()), this.b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        e.a aVar2 = new e.a((e) d3);
        while (aVar2.hasNext()) {
            Object next2 = aVar2.next();
            linkedHashMap2.put(((n) next2).getName(), next2);
        }
        this.e = linkedHashMap2;
        Collection<v> l = this.a.l();
        l<p, Boolean> lVar2 = this.b;
        ArrayList arrayList = new ArrayList();
        for (T next3 : l) {
            if (lVar2.invoke(next3).booleanValue()) {
                arrayList.add(next3);
            }
        }
        int R2 = i0.j.f.p.h.R2(i0.j.f.p.h.K(arrayList, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(R2 < 16 ? 16 : R2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next4 = it.next();
            linkedHashMap3.put(((v) next4).getName(), next4);
        }
        this.f = linkedHashMap3;
    }

    public Set<d> a() {
        h<T> d2 = SequencesKt___SequencesKt.d(m0.j.g.e(this.a.L()), this.c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e.a aVar = new e.a((e) d2);
        while (aVar.hasNext()) {
            linkedHashSet.add(((s) aVar.next()).getName());
        }
        return linkedHashSet;
    }

    public v b(d dVar) {
        i.e(dVar, "name");
        return this.f.get(dVar);
    }

    public n c(d dVar) {
        i.e(dVar, "name");
        return this.e.get(dVar);
    }

    public Set<d> d() {
        return this.f.keySet();
    }

    public Set<d> e() {
        h<T> d2 = SequencesKt___SequencesKt.d(m0.j.g.e(this.a.B()), this.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e.a aVar = new e.a((e) d2);
        while (aVar.hasNext()) {
            linkedHashSet.add(((s) aVar.next()).getName());
        }
        return linkedHashSet;
    }

    public Collection<q> f(d dVar) {
        i.e(dVar, "name");
        List list = this.d.get(dVar);
        return list == null ? EmptyList.c : list;
    }
}
