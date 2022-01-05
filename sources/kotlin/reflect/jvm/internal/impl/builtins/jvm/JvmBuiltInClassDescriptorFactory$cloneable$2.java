package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import i0.j.f.p.h;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import m0.n.a.a;
import m0.r.t.a.r.b.k.e;
import m0.r.t.a.r.c.c;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.t0.i;
import m0.r.t.a.r.l.l;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
public final class JvmBuiltInClassDescriptorFactory$cloneable$2 extends Lambda implements a<i> {
    public final /* synthetic */ e c;
    public final /* synthetic */ l d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInClassDescriptorFactory$cloneable$2(e eVar, l lVar) {
        super(0);
        this.c = eVar;
        this.d = lVar;
    }

    public Object invoke() {
        e eVar = this.c;
        i iVar = new i(eVar.g.invoke(eVar.f), e.d, Modality.ABSTRACT, ClassKind.INTERFACE, h.L2(this.c.f.m().f()), h0.a, false, this.d);
        iVar.H0(new m0.r.t.a.r.b.k.a(this.d, iVar), EmptySet.c, (c) null);
        return iVar;
    }
}
