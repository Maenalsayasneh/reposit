package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.e.a.u.h.a;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.x0.e;

/* compiled from: RawType.kt */
public final class RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2 extends Lambda implements l<e, a0> {
    public final /* synthetic */ d c;
    public final /* synthetic */ RawSubstitution d;
    public final /* synthetic */ a0 q;
    public final /* synthetic */ a x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2(d dVar, RawSubstitution rawSubstitution, a0 a0Var, a aVar) {
        super(1);
        this.c = dVar;
        this.d = rawSubstitution;
        this.q = a0Var;
        this.x = aVar;
    }

    public Object invoke(Object obj) {
        d a;
        e eVar = (e) obj;
        i.e(eVar, "kotlinTypeRefiner");
        d dVar = this.c;
        if (!(dVar instanceof d)) {
            dVar = null;
        }
        m0.r.t.a.r.g.a g = dVar == null ? null : DescriptorUtilsKt.g(dVar);
        if (g == null || (a = eVar.a(g)) == null || i.a(a, this.c)) {
            return null;
        }
        return (a0) this.d.i(this.q, a, this.x).c;
    }
}
