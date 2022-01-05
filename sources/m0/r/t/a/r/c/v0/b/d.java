package m0.r.t.a.r.c.v0.b;

import java.lang.annotation.Annotation;
import m0.n.b.i;
import m0.r.t.a.r.e.a.w.a;
import m0.r.t.a.r.e.a.w.c;

/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class d extends c implements c {
    public final Annotation b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(m0.r.t.a.r.g.d dVar, Annotation annotation) {
        super(dVar);
        i.e(annotation, "annotation");
        this.b = annotation;
    }

    public a a() {
        return new b(this.b);
    }
}
