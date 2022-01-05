package i0.f.a.c.n;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import i0.f.a.c.t.a;
import i0.f.a.c.t.f;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* compiled from: CollectorBase */
public class l {
    public static final h[] a = new h[0];
    public static final Annotation[] b = new Annotation[0];
    public final AnnotationIntrospector c;

    public l(AnnotationIntrospector annotationIntrospector) {
        this.c = annotationIntrospector;
    }

    public static h[] a(int i) {
        if (i == 0) {
            return a;
        }
        h[] hVarArr = new h[i];
        for (int i2 = 0; i2 < i; i2++) {
            hVarArr[i2] = new h();
        }
        return hVarArr;
    }

    public final AnnotationCollector b(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            annotationCollector = annotationCollector.a(annotation);
            if (this.c.y0(annotation)) {
                annotationCollector = e(annotationCollector, annotation);
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector c(Annotation[] annotationArr) {
        a aVar = AnnotationCollector.a;
        AnnotationCollector annotationCollector = AnnotationCollector.a.c;
        for (Annotation annotation : annotationArr) {
            annotationCollector = annotationCollector.a(annotation);
            if (this.c.y0(annotation)) {
                annotationCollector = e(annotationCollector, annotation);
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector d(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!annotationCollector.d(annotation)) {
                annotationCollector = annotationCollector.a(annotation);
                if (this.c.y0(annotation)) {
                    for (Annotation annotation2 : f.k(annotation.annotationType())) {
                        if (!((annotation2 instanceof Target) || (annotation2 instanceof Retention)) && !annotationCollector.d(annotation2)) {
                            annotationCollector = annotationCollector.a(annotation2);
                            if (this.c.y0(annotation2)) {
                                annotationCollector = e(annotationCollector, annotation2);
                            }
                        }
                    }
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector e(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : f.k(annotation.annotationType())) {
            if (!((annotation2 instanceof Target) || (annotation2 instanceof Retention))) {
                if (!this.c.y0(annotation2)) {
                    annotationCollector = annotationCollector.a(annotation2);
                } else if (!annotationCollector.d(annotation2)) {
                    annotationCollector = e(annotationCollector.a(annotation2), annotation2);
                }
            }
        }
        return annotationCollector;
    }
}
