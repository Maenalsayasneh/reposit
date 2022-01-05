package h0.h.a;

import h0.f.h;
import h0.i.h.d;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: DirectedAcyclicGraph */
public final class a<T> {
    public final d<ArrayList<T>> a = new d<>(10);
    public final h<T, ArrayList<T>> b = new h<>();
    public final ArrayList<T> c = new ArrayList<>();
    public final HashSet<T> d = new HashSet<>();

    public void a(T t) {
        if (!(this.b.f(t) >= 0)) {
            this.b.put(t, null);
        }
    }

    public final void b(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList orDefault = this.b.getOrDefault(t, null);
                if (orDefault != null) {
                    int size = orDefault.size();
                    for (int i = 0; i < size; i++) {
                        b(orDefault.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
