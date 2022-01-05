package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.b;

/* compiled from: Annotations.kt */
public final class CompositeAnnotations$findAnnotation$1 extends Lambda implements l<f, c> {
    public final /* synthetic */ b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations$findAnnotation$1(b bVar) {
        super(1);
        this.c = bVar;
    }

    public Object invoke(Object obj) {
        f fVar = (f) obj;
        i.e(fVar, "it");
        return fVar.f(this.c);
    }
}
