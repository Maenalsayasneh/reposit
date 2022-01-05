package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.x0.e;

/* compiled from: IntersectionTypeConstructor.kt */
public final class IntersectionTypeConstructor$createType$1 extends Lambda implements l<e, a0> {
    public final /* synthetic */ IntersectionTypeConstructor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntersectionTypeConstructor$createType$1(IntersectionTypeConstructor intersectionTypeConstructor) {
        super(1);
        this.c = intersectionTypeConstructor;
    }

    public Object invoke(Object obj) {
        e eVar = (e) obj;
        i.e(eVar, "kotlinTypeRefiner");
        return this.c.a(eVar).f();
    }
}
