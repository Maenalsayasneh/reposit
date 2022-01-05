package m0.r.t.a.r.m.x0;

import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.n.b.i;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.z0.f;
import m0.r.t.a.r.m.z0.g;

/* compiled from: ClassicTypeCheckerContext.kt */
public final class a extends AbstractTypeCheckerContext.a.C0239a {
    public final /* synthetic */ c a;
    public final /* synthetic */ TypeSubstitutor b;

    public a(c cVar, TypeSubstitutor typeSubstitutor) {
        this.a = cVar;
        this.b = typeSubstitutor;
    }

    public g a(AbstractTypeCheckerContext abstractTypeCheckerContext, f fVar) {
        i.e(abstractTypeCheckerContext, "context");
        i.e(fVar, "type");
        c cVar = this.a;
        v i = this.b.i((v) cVar.o(fVar), Variance.INVARIANT);
        i.d(i, "substitutor.safeSubstitute(\n                        type.lowerBoundIfFlexible() as KotlinType,\n                        Variance.INVARIANT\n                    )");
        g a2 = cVar.a(i);
        i.c(a2);
        return a2;
    }
}
