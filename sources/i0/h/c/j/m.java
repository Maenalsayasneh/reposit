package i0.h.c.j;

import android.util.Log;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import i0.h.c.n.c;
import i0.h.c.n.d;
import i0.h.c.q.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ComponentRuntime */
public class m extends a implements i0.h.c.l.a {
    public static final /* synthetic */ int a = 0;
    public final Map<d<?>, b<?>> b = new HashMap();
    public final Map<Class<?>, b<?>> c = new HashMap();
    public final Map<Class<?>, v<?>> d = new HashMap();
    public final List<b<h>> e;
    public final t f;
    public final AtomicReference<Boolean> g = new AtomicReference<>();

    public m(Executor executor, Iterable iterable, Collection collection, a aVar) {
        t tVar = new t(executor);
        this.f = tVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.c(tVar, t.class, d.class, c.class));
        arrayList.add(d.c(this, i0.h.c.l.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object add : iterable) {
            arrayList2.add(add);
        }
        this.e = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    h hVar = (h) ((b) it2.next()).get();
                    if (hVar != null) {
                        arrayList.addAll(hVar.getComponents());
                        it2.remove();
                    }
                } catch (InvalidRegistrarException e2) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            if (this.b.isEmpty()) {
                i0.h.a.b.c.m.b.C(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.b.keySet());
                arrayList4.addAll(arrayList);
                i0.h.a.b.c.m.b.C(arrayList4);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                d dVar2 = (d) it3.next();
                this.b.put(dVar2, new u(new i(this, dVar2)));
            }
            arrayList3.addAll(g(arrayList));
            arrayList3.addAll(h());
            f();
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        Boolean bool = this.g.get();
        if (bool != null) {
            e(this.b, bool.booleanValue());
        }
    }

    public synchronized <T> b<T> b(Class<T> cls) {
        Objects.requireNonNull(cls, "Null interface requested.");
        return this.c.get(cls);
    }

    public synchronized <T> b<Set<T>> c(Class<T> cls) {
        v vVar = this.d.get(cls);
        if (vVar != null) {
            return vVar;
        }
        return l.a;
    }

    public final void e(Map<d<?>, b<?>> map, boolean z) {
        Queue<i0.h.c.n.a<?>> queue;
        Set<Map.Entry> emptySet;
        for (Map.Entry next : map.entrySet()) {
            b bVar = (b) next.getValue();
            int i = ((d) next.getKey()).c;
            boolean z2 = false;
            if (!(i == 1)) {
                if (i == 2) {
                    z2 = true;
                }
                if (z2) {
                    if (!z) {
                    }
                }
            }
            bVar.get();
        }
        t tVar = this.f;
        synchronized (tVar) {
            queue = tVar.b;
            if (queue != null) {
                tVar.b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (i0.h.c.n.a aVar : queue) {
                Objects.requireNonNull(aVar);
                synchronized (tVar) {
                    Queue<i0.h.c.n.a<?>> queue2 = tVar.b;
                    if (queue2 != null) {
                        queue2.add(aVar);
                    } else {
                        synchronized (tVar) {
                            Map map2 = tVar.a.get((Object) null);
                            emptySet = map2 == null ? Collections.emptySet() : map2.entrySet();
                        }
                        for (Map.Entry entry : emptySet) {
                            ((Executor) entry.getValue()).execute(new s(entry, aVar));
                        }
                    }
                }
            }
        }
    }

    public final void f() {
        for (d next : this.b.keySet()) {
            Iterator<r> it = next.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    r next2 = it.next();
                    if (next2.a() && !this.d.containsKey(next2.a)) {
                        this.d.put(next2.a, new v(Collections.emptySet()));
                    } else if (this.c.containsKey(next2.a)) {
                        continue;
                    } else {
                        if (next2.b == 1) {
                            throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.a}));
                        } else if (!next2.a()) {
                            this.c.put(next2.a, new y(w.a, x.a));
                        }
                    }
                }
            }
        }
    }

    public final List<Runnable> g(List<d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (d next : list) {
            if (next.b()) {
                b bVar = this.b.get(next);
                for (Class next2 : next.a) {
                    if (!this.c.containsKey(next2)) {
                        this.c.put(next2, bVar);
                    } else {
                        arrayList.add(new j((y) this.c.get(next2), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<Runnable> h() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.b.entrySet()) {
            d dVar = (d) next.getKey();
            if (!dVar.b()) {
                b bVar = (b) next.getValue();
                for (Class next2 : dVar.a) {
                    if (!hashMap.containsKey(next2)) {
                        hashMap.put(next2, new HashSet());
                    }
                    ((Set) hashMap.get(next2)).add(bVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.d.containsKey(entry.getKey())) {
                this.d.put((Class) entry.getKey(), new v((Set) ((Collection) entry.getValue())));
            } else {
                v vVar = this.d.get(entry.getKey());
                for (b kVar : (Set) entry.getValue()) {
                    arrayList.add(new k(vVar, kVar));
                }
            }
        }
        return arrayList;
    }
}
