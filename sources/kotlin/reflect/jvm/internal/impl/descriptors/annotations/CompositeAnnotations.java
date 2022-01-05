package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.SequencesKt___SequencesKt;
import m0.j.g;
import m0.j.j;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.b;
import m0.s.e;
import m0.s.f;
import m0.s.h;

/* compiled from: Annotations.kt */
public final class CompositeAnnotations implements f {
    public final List<f> c;

    public CompositeAnnotations(List<? extends f> list) {
        i.e(list, "delegates");
        this.c = list;
    }

    public c f(b bVar) {
        Object obj;
        i.e(bVar, "fqName");
        h<R> h = SequencesKt___SequencesKt.h(g.e(this.c), new CompositeAnnotations$findAnnotation$1(bVar));
        i.e(h, "$this$firstOrNull");
        e.a aVar = (e.a) ((e) h).iterator();
        if (!aVar.hasNext()) {
            obj = null;
        } else {
            obj = aVar.next();
        }
        return (c) obj;
    }

    public boolean isEmpty() {
        List<f> list = this.c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (f isEmpty : list) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public Iterator<c> iterator() {
        return new f.a((m0.s.f) SequencesKt___SequencesKt.f(g.e(this.c), CompositeAnnotations$iterator$1.c));
    }

    public boolean n(b bVar) {
        i.e(bVar, "fqName");
        Iterator it = ((j) g.e(this.c)).iterator();
        while (it.hasNext()) {
            if (((m0.r.t.a.r.c.r0.f) it.next()).n(bVar)) {
                return true;
            }
        }
        return false;
    }

    public CompositeAnnotations(m0.r.t.a.r.c.r0.f... fVarArr) {
        i.e(fVarArr, "delegates");
        List<m0.r.t.a.r.c.r0.f> l4 = i0.j.f.p.h.l4(fVarArr);
        i.e(l4, "delegates");
        this.c = l4;
    }
}
