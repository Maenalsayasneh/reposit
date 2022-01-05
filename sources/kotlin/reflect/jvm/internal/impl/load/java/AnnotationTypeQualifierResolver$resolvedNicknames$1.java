package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Objects;
import kotlin.jvm.internal.FunctionReference;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.f;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.e.a.a;

/* compiled from: AnnotationTypeQualifierResolver.kt */
public /* synthetic */ class AnnotationTypeQualifierResolver$resolvedNicknames$1 extends FunctionReference implements l<d, c> {
    public AnnotationTypeQualifierResolver$resolvedNicknames$1(AnnotationTypeQualifierResolver annotationTypeQualifierResolver) {
        super(1, annotationTypeQualifierResolver);
    }

    public final String getName() {
        return "computeTypeQualifierNickname";
    }

    public final f getOwner() {
        return m.a(AnnotationTypeQualifierResolver.class);
    }

    public final String getSignature() {
        return "computeTypeQualifierNickname(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;";
    }

    public Object invoke(Object obj) {
        d dVar = (d) obj;
        i.e(dVar, "p0");
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver = (AnnotationTypeQualifierResolver) this.receiver;
        Objects.requireNonNull(annotationTypeQualifierResolver);
        if (!dVar.getAnnotations().n(a.a)) {
            return null;
        }
        for (c d : dVar.getAnnotations()) {
            c d2 = annotationTypeQualifierResolver.d(d);
            if (d2 != null) {
                return d2;
            }
        }
        return null;
    }
}
