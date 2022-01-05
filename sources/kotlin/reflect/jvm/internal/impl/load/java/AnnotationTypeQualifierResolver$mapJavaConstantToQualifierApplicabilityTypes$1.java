package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.r.t.a.r.j.p.i;

/* compiled from: AnnotationTypeQualifierResolver.kt */
public final class AnnotationTypeQualifierResolver$mapJavaConstantToQualifierApplicabilityTypes$1 extends Lambda implements p<i, AnnotationQualifierApplicabilityType, Boolean> {
    public static final AnnotationTypeQualifierResolver$mapJavaConstantToQualifierApplicabilityTypes$1 c = new AnnotationTypeQualifierResolver$mapJavaConstantToQualifierApplicabilityTypes$1();

    public AnnotationTypeQualifierResolver$mapJavaConstantToQualifierApplicabilityTypes$1() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        i iVar = (i) obj;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = (AnnotationQualifierApplicabilityType) obj2;
        m0.n.b.i.e(iVar, "<this>");
        m0.n.b.i.e(annotationQualifierApplicabilityType, "it");
        return Boolean.valueOf(m0.n.b.i.a(iVar.c.e(), annotationQualifierApplicabilityType.getJavaTarget()));
    }
}
