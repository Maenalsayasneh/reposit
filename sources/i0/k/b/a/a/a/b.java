package i0.k.b.a.a.a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import q0.d0;
import q0.f0;
import q0.y;
import t0.h;
import t0.w;

/* compiled from: Factory.kt */
public final class b extends h.a {
    public final y a;
    public final d b;

    public b(y yVar, d dVar) {
        i.e(yVar, "contentType");
        i.e(dVar, "serializer");
        this.a = yVar;
        this.b = dVar;
    }

    public h<?, d0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, w wVar) {
        i.e(type, "type");
        i.e(annotationArr, "parameterAnnotations");
        i.e(annotationArr2, "methodAnnotations");
        i.e(wVar, "retrofit");
        d dVar = this.b;
        Objects.requireNonNull(dVar);
        i.e(type, "type");
        return new c(this.a, a.t3(dVar.b().a(), type), this.b);
    }

    public h<f0, ?> b(Type type, Annotation[] annotationArr, w wVar) {
        i.e(type, "type");
        i.e(annotationArr, "annotations");
        i.e(wVar, "retrofit");
        d dVar = this.b;
        Objects.requireNonNull(dVar);
        i.e(type, "type");
        return new a(a.t3(dVar.b().a(), type), this.b);
    }
}
