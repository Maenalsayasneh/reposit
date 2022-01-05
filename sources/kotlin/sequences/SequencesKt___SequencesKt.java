package kotlin.sequences;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import m0.s.b;
import m0.s.c;
import m0.s.e;
import m0.s.f;
import m0.s.h;
import m0.s.o;
import m0.s.q;

/* compiled from: _Sequences.kt */
public class SequencesKt___SequencesKt extends o {

    /* compiled from: Iterables.kt */
    public static final class a implements Iterable<T>, m0.n.b.s.a {
        public final /* synthetic */ h c;

        public a(h hVar) {
            this.c = hVar;
        }

        public Iterator<T> iterator() {
            return this.c.iterator();
        }
    }

    public static final <T> Iterable<T> a(h<? extends T> hVar) {
        i.e(hVar, "$this$asIterable");
        return new a(hVar);
    }

    public static final <T> int b(h<? extends T> hVar) {
        i.e(hVar, "$this$count");
        Iterator<? extends T> it = hVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                g.q0();
                throw null;
            }
        }
        return i;
    }

    public static final <T> h<T> c(h<? extends T> hVar, int i) {
        i.e(hVar, "$this$drop");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(i0.d.a.a.a.g0("Requested element count ", i, " is less than zero.").toString());
        } else if (i == 0) {
            return hVar;
        } else {
            if (hVar instanceof c) {
                return ((c) hVar).a(i);
            }
            return new b(hVar, i);
        }
    }

    public static final <T> h<T> d(h<? extends T> hVar, l<? super T, Boolean> lVar) {
        i.e(hVar, "$this$filter");
        i.e(lVar, "predicate");
        return new e(hVar, true, lVar);
    }

    public static final <T> h<T> e(h<? extends T> hVar, l<? super T, Boolean> lVar) {
        i.e(hVar, "$this$filterNot");
        i.e(lVar, "predicate");
        return new e(hVar, false, lVar);
    }

    public static final <T, R> h<R> f(h<? extends T> hVar, l<? super T, ? extends h<? extends R>> lVar) {
        i.e(hVar, "$this$flatMap");
        i.e(lVar, "transform");
        return new f(hVar, lVar, SequencesKt___SequencesKt$flatMap$2.c);
    }

    public static final <T, R> h<R> g(h<? extends T> hVar, l<? super T, ? extends R> lVar) {
        i.e(hVar, "$this$map");
        i.e(lVar, "transform");
        return new q(hVar, lVar);
    }

    public static final <T, R> h<R> h(h<? extends T> hVar, l<? super T, ? extends R> lVar) {
        i.e(hVar, "$this$mapNotNull");
        i.e(lVar, "transform");
        q qVar = new q(hVar, lVar);
        i.e(qVar, "$this$filterNotNull");
        return e(qVar, SequencesKt___SequencesKt$filterNotNull$1.c);
    }

    public static final <T> h<T> i(h<? extends T> hVar, T t) {
        i.e(hVar, "$this$plus");
        return m0.r.t.a.r.m.a1.a.x1(m0.r.t.a.r.m.a1.a.n3(hVar, m0.r.t.a.r.m.a1.a.n3(t)));
    }

    public static final <T> List<T> j(h<? extends T> hVar) {
        i.e(hVar, "$this$toList");
        return g.V(k(hVar));
    }

    public static final <T> List<T> k(h<? extends T> hVar) {
        i.e(hVar, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        i.e(hVar, "$this$toCollection");
        i.e(arrayList, "destination");
        for (Object add : hVar) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
