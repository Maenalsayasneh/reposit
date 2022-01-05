package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.t.a.r.m.v;

/* compiled from: AbstractTypeConstructor.kt */
public final class AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2 extends Lambda implements l<v, i> {
    public final /* synthetic */ AbstractTypeConstructor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2(AbstractTypeConstructor abstractTypeConstructor) {
        super(1);
        this.c = abstractTypeConstructor;
    }

    public Object invoke(Object obj) {
        v vVar = (v) obj;
        m0.n.b.i.e(vVar, "it");
        this.c.n(vVar);
        return i.a;
    }
}
