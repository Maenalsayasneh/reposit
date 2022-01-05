package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.b.k.c;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.e.a.w.g;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.p;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
public final class LazyJavaAnnotationDescriptor$type$2 extends Lambda implements a<a0> {
    public final /* synthetic */ LazyJavaAnnotationDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaAnnotationDescriptor$type$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        super(0);
        this.c = lazyJavaAnnotationDescriptor;
    }

    public Object invoke() {
        b d = this.c.d();
        if (d == null) {
            return p.d(i.k("No fqName: ", this.c.c));
        }
        f m = this.c.b.a.o.m();
        i.e(d, "fqName");
        i.e(m, "builtIns");
        m0.r.t.a.r.g.a g = c.a.g(d);
        d dVar = null;
        d j = g != null ? m.j(g.b()) : null;
        if (j == null) {
            g x = this.c.c.x();
            if (x != null) {
                dVar = this.c.b.a.k.a(x);
            }
            if (dVar == null) {
                LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.c;
                u uVar = lazyJavaAnnotationDescriptor.b.a.o;
                m0.r.t.a.r.g.a l = m0.r.t.a.r.g.a.l(d);
                i.d(l, "topLevel(fqName)");
                j = h.G0(uVar, l, lazyJavaAnnotationDescriptor.b.a.d.c().l);
            } else {
                j = dVar;
            }
        }
        return j.q();
    }
}
