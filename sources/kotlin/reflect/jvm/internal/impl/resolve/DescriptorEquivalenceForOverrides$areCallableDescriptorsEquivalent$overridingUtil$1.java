package kotlin.reflect.jvm.internal.impl.resolve;

import m0.n.a.p;
import m0.n.b.i;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.j.b;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.x0.d;

/* compiled from: DescriptorEquivalenceForOverrides.kt */
public final class DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1 implements d.a {
    public final /* synthetic */ b a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ a c;
    public final /* synthetic */ a d;

    public DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1(b bVar, boolean z, a aVar, a aVar2) {
        this.a = bVar;
        this.b = z;
        this.c = aVar;
        this.d = aVar2;
    }

    public final boolean a(j0 j0Var, j0 j0Var2) {
        i.e(j0Var, "c1");
        i.e(j0Var2, "c2");
        if (i.a(j0Var, j0Var2)) {
            return true;
        }
        f c2 = j0Var.c();
        f c3 = j0Var2.c();
        if (!(c2 instanceof m0) || !(c3 instanceof m0)) {
            return false;
        }
        boolean z = this.b;
        final a aVar = this.c;
        final a aVar2 = this.d;
        return this.a.b((m0) c2, (m0) c3, z, new p<m0.r.t.a.r.c.i, m0.r.t.a.r.c.i, Boolean>() {
            public Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(i.a((m0.r.t.a.r.c.i) obj, aVar) && i.a((m0.r.t.a.r.c.i) obj2, aVar2));
            }
        });
    }
}
