package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.ReportLevel;
import m0.n.a.p;
import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.j.p.b;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.o.g;

/* compiled from: AnnotationTypeQualifierResolver.kt */
public final class AnnotationTypeQualifierResolver {
    public final g a;
    public final m0.r.t.a.r.l.g<d, c> b;

    /* compiled from: AnnotationTypeQualifierResolver.kt */
    public static final class a {
        public final c a;
        public final int b;

        public a(c cVar, int i) {
            i.e(cVar, "typeQualifier");
            this.a = cVar;
            this.b = i;
        }

        public final List<AnnotationQualifierApplicabilityType> a() {
            AnnotationQualifierApplicabilityType[] values = AnnotationQualifierApplicabilityType.values();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 6; i++) {
                AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = values[i];
                boolean z = true;
                if (!((this.b & (1 << annotationQualifierApplicabilityType.ordinal())) != 0)) {
                    if (!(((1 << AnnotationQualifierApplicabilityType.TYPE_USE.ordinal()) & this.b) != 0) || annotationQualifierApplicabilityType == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) {
                        z = false;
                    }
                }
                if (z) {
                    arrayList.add(annotationQualifierApplicabilityType);
                }
            }
            return arrayList;
        }
    }

    public AnnotationTypeQualifierResolver(l lVar, g gVar) {
        i.e(lVar, "storageManager");
        i.e(gVar, "javaTypeEnhancementState");
        this.a = gVar;
        this.b = lVar.h(new AnnotationTypeQualifierResolver$resolvedNicknames$1(this));
    }

    public final List<AnnotationQualifierApplicabilityType> a(m0.r.t.a.r.j.p.g<?> gVar, p<? super m0.r.t.a.r.j.p.i, ? super AnnotationQualifierApplicabilityType, Boolean> pVar) {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType;
        if (gVar instanceof b) {
            ArrayList arrayList = new ArrayList();
            for (m0.r.t.a.r.j.p.g a2 : (Iterable) ((b) gVar).a) {
                m0.j.g.b(arrayList, a(a2, pVar));
            }
            return arrayList;
        } else if (!(gVar instanceof m0.r.t.a.r.j.p.i)) {
            return EmptyList.c;
        } else {
            AnnotationQualifierApplicabilityType[] values = AnnotationQualifierApplicabilityType.values();
            int i = 0;
            while (true) {
                if (i >= 6) {
                    annotationQualifierApplicabilityType = null;
                    break;
                }
                annotationQualifierApplicabilityType = values[i];
                if (pVar.invoke(gVar, annotationQualifierApplicabilityType).booleanValue()) {
                    break;
                }
                i++;
            }
            return m0.j.g.L(annotationQualifierApplicabilityType);
        }
    }

    public final ReportLevel b(c cVar) {
        i.e(cVar, "annotationDescriptor");
        ReportLevel c = c(cVar);
        return c == null ? this.a.c : c;
    }

    public final ReportLevel c(c cVar) {
        i.e(cVar, "annotationDescriptor");
        Map<String, ReportLevel> map = this.a.e;
        m0.r.t.a.r.g.b d = cVar.d();
        ReportLevel reportLevel = map.get(d == null ? null : d.b());
        if (reportLevel != null) {
            return reportLevel;
        }
        d e = DescriptorUtilsKt.e(cVar);
        if (e == null) {
            return null;
        }
        c f = e.getAnnotations().f(m0.r.t.a.r.e.a.a.d);
        m0.r.t.a.r.j.p.g<?> b2 = f == null ? null : DescriptorUtilsKt.b(f);
        m0.r.t.a.r.j.p.i iVar = b2 instanceof m0.r.t.a.r.j.p.i ? (m0.r.t.a.r.j.p.i) b2 : null;
        if (iVar == null) {
            return null;
        }
        ReportLevel reportLevel2 = this.a.d;
        if (reportLevel2 != null) {
            return reportLevel2;
        }
        String b3 = iVar.c.b();
        int hashCode = b3.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902 && b3.equals("WARN")) {
                    return ReportLevel.WARN;
                }
                return null;
            } else if (!b3.equals("STRICT")) {
                return null;
            } else {
                return ReportLevel.STRICT;
            }
        } else if (!b3.equals("IGNORE")) {
            return null;
        } else {
            return ReportLevel.IGNORE;
        }
    }

    public final c d(c cVar) {
        d e;
        i.e(cVar, "annotationDescriptor");
        if (this.a.i || (e = DescriptorUtilsKt.e(cVar)) == null) {
            return null;
        }
        if (m0.r.t.a.r.e.a.a.h.contains(DescriptorUtilsKt.h(e)) || e.getAnnotations().n(m0.r.t.a.r.e.a.a.b)) {
            return cVar;
        }
        if (e.f() != ClassKind.ANNOTATION_CLASS) {
            return null;
        }
        return this.b.invoke(e);
    }
}
