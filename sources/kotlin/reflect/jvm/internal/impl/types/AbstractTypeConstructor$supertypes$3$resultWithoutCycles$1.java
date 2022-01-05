package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.v;

/* compiled from: AbstractTypeConstructor.kt */
public final class AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1 extends Lambda implements l<j0, Iterable<? extends v>> {
    public final /* synthetic */ AbstractTypeConstructor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1(AbstractTypeConstructor abstractTypeConstructor) {
        super(1);
        this.c = abstractTypeConstructor;
    }

    public Object invoke(Object obj) {
        j0 j0Var = (j0) obj;
        i.e(j0Var, "it");
        return AbstractTypeConstructor.f(this.c, j0Var, false);
    }
}
