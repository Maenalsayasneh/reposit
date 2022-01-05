package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.t0.h;
import m0.r.t.a.r.e.a.i;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.e.a.w.g;
import m0.r.t.a.r.e.a.w.n;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.g.d;

/* compiled from: LazyJavaClassMemberScope.kt */
public final class LazyJavaClassMemberScope$nestedClasses$1 extends Lambda implements l<d, h> {
    public final /* synthetic */ LazyJavaClassMemberScope c;
    public final /* synthetic */ c d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$nestedClasses$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, c cVar) {
        super(1);
        this.c = lazyJavaClassMemberScope;
        this.d = cVar;
    }

    public Object invoke(Object obj) {
        d dVar = (d) obj;
        i.e(dVar, "name");
        if (!((Set) this.c.r.invoke()).contains(dVar)) {
            n nVar = (n) ((Map) this.c.s.invoke()).get(dVar);
            if (nVar == null) {
                return null;
            }
            m0.r.t.a.r.l.h d2 = this.d.a.a.d(new LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1(this.c));
            c cVar = this.d;
            return m0.r.t.a.r.c.t0.n.H0(cVar.a.a, this.c.n, dVar, d2, i0.j.f.p.h.z3(cVar, nVar), this.d.a.j.a(nVar));
        }
        m0.r.t.a.r.e.a.i iVar = this.d.a.b;
        a g = DescriptorUtilsKt.g(this.c.n);
        i.c(g);
        a d3 = g.d(dVar);
        i.d(d3, "ownerDescriptor.classId!!.createNestedClassId(name)");
        g a = iVar.a(new i.a(d3, (byte[]) null, this.c.o, 2));
        if (a == null) {
            return null;
        }
        c cVar2 = this.d;
        LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(cVar2, this.c.n, a, (m0.r.t.a.r.c.d) null);
        cVar2.a.s.a(lazyJavaClassDescriptor);
        return lazyJavaClassDescriptor;
    }
}
