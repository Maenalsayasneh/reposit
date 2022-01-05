package i0.b.a.q0;

import i0.b.a.q0.c;
import i0.j.f.p.h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import m0.j.o;
import m0.n.a.a;
import m0.n.b.i;
import m0.q.e;

/* compiled from: PreloadTargetProvider.kt */
public final class d<P extends c> {
    public final ArrayDeque<P> a;

    public d(int i, a<? extends P> aVar) {
        i.e(aVar, "requestHolderFactory");
        e f = m0.q.i.f(0, i);
        ArrayList arrayList = new ArrayList(h.K(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            ((o) it).a();
            arrayList.add((c) aVar.invoke());
        }
        this.a = new ArrayDeque<>(arrayList);
    }
}
