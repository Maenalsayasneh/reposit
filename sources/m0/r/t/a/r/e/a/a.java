package m0.r.t.a.r.e.a;

import i0.j.f.p.h;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import m0.j.g;
import m0.r.t.a.r.g.b;

/* compiled from: AnnotationQualifiersFqNames.kt */
public final class a {
    public static final b a = new b("javax.annotation.meta.TypeQualifierNickname");
    public static final b b = new b("javax.annotation.meta.TypeQualifier");
    public static final b c = new b("javax.annotation.meta.TypeQualifierDefault");
    public static final b d = new b("kotlin.annotations.jvm.UnderMigration");
    public static final List<AnnotationQualifierApplicabilityType> e;
    public static final Map<b, k> f;
    public static final Map<b, k> g;
    public static final Set<b> h = g.h0(r.e, r.f);

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List<AnnotationQualifierApplicabilityType> K = g.K(AnnotationQualifierApplicabilityType.FIELD, AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE, annotationQualifierApplicabilityType, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE);
        e = K;
        b bVar = r.c;
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        Map<b, k> S2 = h.S2(new Pair(bVar, new k(new m0.r.t.a.r.e.a.x.g(nullabilityQualifier, false, 2), K, false)));
        f = S2;
        g = g.b0(g.N(new Pair(new b("javax.annotation.ParametersAreNullableByDefault"), new k(new m0.r.t.a.r.e.a.x.g(NullabilityQualifier.NULLABLE, false, 2), h.L2(annotationQualifierApplicabilityType), false, 4)), new Pair(new b("javax.annotation.ParametersAreNonnullByDefault"), new k(new m0.r.t.a.r.e.a.x.g(nullabilityQualifier, false, 2), h.L2(annotationQualifierApplicabilityType), false, 4))), S2);
    }
}
