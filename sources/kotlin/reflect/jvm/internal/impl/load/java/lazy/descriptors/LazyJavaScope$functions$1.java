package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.e.b.n;
import m0.r.t.a.r.g.d;

/* compiled from: LazyJavaScope.kt */
public final class LazyJavaScope$functions$1 extends Lambda implements l<d, Collection<? extends g0>> {
    public final /* synthetic */ LazyJavaScope c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$functions$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.c = lazyJavaScope;
    }

    public Object invoke(Object obj) {
        d dVar = (d) obj;
        i.e(dVar, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) ((LockBasedStorageManager.m) this.c.g).invoke(dVar));
        Objects.requireNonNull(this.c);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : linkedHashSet) {
            String b = n.b((g0) next, false, false, 2);
            Object obj2 = linkedHashMap.get(b);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(b, obj2);
            }
            ((List) obj2).add(next);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection M3 = h.M3(list, LazyJavaScope$retainMostSpecificMethods$mostSpecificMethods$1.c);
                linkedHashSet.removeAll(list);
                linkedHashSet.addAll(M3);
            }
        }
        this.c.m(linkedHashSet, dVar);
        c cVar = this.c.c;
        return g.v0(cVar.a.r.a(cVar, linkedHashSet));
    }
}
