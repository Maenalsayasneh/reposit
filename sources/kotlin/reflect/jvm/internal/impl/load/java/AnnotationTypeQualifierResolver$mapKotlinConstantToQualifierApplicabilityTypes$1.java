package kotlin.reflect.jvm.internal.impl.load.java;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper;
import m0.n.a.p;
import m0.r.t.a.r.j.p.i;

/* compiled from: AnnotationTypeQualifierResolver.kt */
public final class AnnotationTypeQualifierResolver$mapKotlinConstantToQualifierApplicabilityTypes$1 extends Lambda implements p<i, AnnotationQualifierApplicabilityType, Boolean> {
    public final /* synthetic */ AnnotationTypeQualifierResolver c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnnotationTypeQualifierResolver$mapKotlinConstantToQualifierApplicabilityTypes$1(AnnotationTypeQualifierResolver annotationTypeQualifierResolver) {
        super(2);
        this.c = annotationTypeQualifierResolver;
    }

    public Object invoke(Object obj, Object obj2) {
        i iVar = (i) obj;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = (AnnotationQualifierApplicabilityType) obj2;
        m0.n.b.i.e(iVar, "<this>");
        m0.n.b.i.e(annotationQualifierApplicabilityType, "it");
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver = this.c;
        String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
        Objects.requireNonNull(annotationTypeQualifierResolver);
        JavaAnnotationTargetMapper javaAnnotationTargetMapper = JavaAnnotationTargetMapper.a;
        Iterable<KotlinTarget> iterable = JavaAnnotationTargetMapper.b.get(javaTarget);
        if (iterable == null) {
            iterable = EmptySet.c;
        }
        ArrayList arrayList = new ArrayList(h.K(iterable, 10));
        for (KotlinTarget name : iterable) {
            arrayList.add(name.name());
        }
        return Boolean.valueOf(arrayList.contains(iVar.c.e()));
    }
}
