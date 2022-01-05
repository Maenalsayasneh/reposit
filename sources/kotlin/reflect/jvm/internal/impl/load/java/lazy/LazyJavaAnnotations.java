package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt$filterNotNull$1;
import m0.n.b.i;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.e.a.w.a;
import m0.r.t.a.r.e.a.w.d;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.l.g;
import m0.s.e;
import m0.s.h;

/* compiled from: LazyJavaAnnotations.kt */
public final class LazyJavaAnnotations implements f {
    public final c c;
    public final d d;
    public final boolean q;
    public final g<a, m0.r.t.a.r.c.r0.c> x;

    public LazyJavaAnnotations(c cVar, d dVar, boolean z) {
        i.e(cVar, "c");
        i.e(dVar, "annotationOwner");
        this.c = cVar;
        this.d = dVar;
        this.q = z;
        this.x = cVar.a.a.h(new LazyJavaAnnotations$annotationDescriptors$1(this));
    }

    public m0.r.t.a.r.c.r0.c f(b bVar) {
        i.e(bVar, "fqName");
        a f = this.d.f(bVar);
        m0.r.t.a.r.c.r0.c invoke = f == null ? null : this.x.invoke(f);
        return invoke == null ? m0.r.t.a.r.e.a.s.b.a.a(bVar, this.d, this.c) : invoke;
    }

    public boolean isEmpty() {
        return this.d.getAnnotations().isEmpty() && !this.d.m();
    }

    public Iterator<m0.r.t.a.r.c.r0.c> iterator() {
        h<m0.r.t.a.r.c.r0.c> i = SequencesKt___SequencesKt.i(SequencesKt___SequencesKt.g(m0.j.g.e(this.d.getAnnotations()), this.x), m0.r.t.a.r.e.a.s.b.a.a(g.a.u, this.d, this.c));
        i.e(i, "$this$filterNotNull");
        return new e.a((e) SequencesKt___SequencesKt.e(i, SequencesKt___SequencesKt$filterNotNull$1.c));
    }

    public boolean n(b bVar) {
        return i0.j.f.p.h.O1(this, bVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyJavaAnnotations(c cVar, d dVar, boolean z, int i) {
        this(cVar, dVar, (i & 4) != 0 ? false : z);
    }
}
