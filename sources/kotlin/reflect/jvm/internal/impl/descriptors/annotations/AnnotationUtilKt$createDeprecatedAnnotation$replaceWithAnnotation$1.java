package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.v;

/* compiled from: annotationUtil.kt */
public final class AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1 extends Lambda implements l<u, v> {
    public final /* synthetic */ f c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1(f fVar) {
        super(1);
        this.c = fVar;
    }

    public Object invoke(Object obj) {
        u uVar = (u) obj;
        i.e(uVar, "module");
        a0 h = uVar.m().h(Variance.INVARIANT, this.c.v());
        i.d(h, "module.builtIns.getArrayType(Variance.INVARIANT, stringType)");
        return h;
    }
}
