package i0.f.a.c.n;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.type.TypeBindings;
import i0.f.a.c.n.k;
import i0.f.a.c.t.a;
import i0.f.a.c.t.f;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: AnnotatedClassResolver */
public class c {
    public static final a a = AnnotationCollector.a;
    public static final Class<?> b = Object.class;
    public static final Class<?> c = Enum.class;
    public static final Class<?> d = List.class;
    public static final Class<?> e = Map.class;
    public final MapperConfig<?> f;
    public final AnnotationIntrospector g;
    public final k.a h;
    public final TypeBindings i;
    public final JavaType j;
    public final Class<?> k;
    public final Class<?> l;
    public final boolean m;

    public c(MapperConfig<?> mapperConfig, JavaType javaType, k.a aVar) {
        this.f = mapperConfig;
        this.j = javaType;
        Class<?> cls = javaType.c;
        this.k = cls;
        this.h = aVar;
        this.i = javaType.k();
        Class<?> cls2 = null;
        AnnotationIntrospector e2 = mapperConfig.p() ? mapperConfig.e() : null;
        this.g = e2;
        this.l = aVar != null ? aVar.a(cls) : cls2;
        this.m = e2 != null && (!f.x(cls) || !javaType.G());
    }

    public static void d(JavaType javaType, List<JavaType> list, boolean z) {
        Class<?> cls = javaType.c;
        if (z) {
            if (!f(list, cls)) {
                list.add(javaType);
                if (cls == d || cls == e) {
                    return;
                }
            } else {
                return;
            }
        }
        for (JavaType d2 : javaType.p()) {
            d(d2, list, true);
        }
    }

    public static void e(JavaType javaType, List<JavaType> list, boolean z) {
        Class<?> cls = javaType.c;
        if (cls != b && cls != c) {
            if (z) {
                if (!f(list, cls)) {
                    list.add(javaType);
                } else {
                    return;
                }
            }
            for (JavaType d2 : javaType.p()) {
                d(d2, list, true);
            }
            JavaType w = javaType.w();
            if (w != null) {
                e(w, list, true);
            }
        }
    }

    public static boolean f(List<JavaType> list, Class<?> cls) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).c == cls) {
                return true;
            }
        }
        return false;
    }

    public static b h(MapperConfig<?> mapperConfig, Class<?> cls) {
        if (cls.isArray()) {
            if (mapperConfig == null || ((MapperConfigBase) mapperConfig).a(cls) == null) {
                return new b(cls);
            }
        }
        c cVar = new c(mapperConfig, cls, (k.a) mapperConfig);
        List emptyList = Collections.emptyList();
        return new b((JavaType) null, cls, emptyList, cVar.l, cVar.g(emptyList), cVar.i, cVar.g, mapperConfig, mapperConfig.d.d, cVar.m);
    }

    public final AnnotationCollector a(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!annotationCollector.d(annotation)) {
                    annotationCollector = annotationCollector.a(annotation);
                    if (this.g.y0(annotation)) {
                        annotationCollector = c(annotationCollector, annotation);
                    }
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector b(AnnotationCollector annotationCollector, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            annotationCollector = a(annotationCollector, f.k(cls2));
            Iterator it = ((ArrayList) f.m(cls2, cls, false)).iterator();
            while (it.hasNext()) {
                annotationCollector = a(annotationCollector, f.k((Class) it.next()));
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector c(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : f.k(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !annotationCollector.d(annotation2)) {
                annotationCollector = annotationCollector.a(annotation2);
                if (this.g.y0(annotation2)) {
                    annotationCollector = c(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    public final a g(List<JavaType> list) {
        Class<Object> cls = Object.class;
        if (this.g == null) {
            return a;
        }
        k.a aVar = this.h;
        boolean z = aVar != null && (!(aVar instanceof SimpleMixInResolver) || ((SimpleMixInResolver) aVar).b());
        if (!z && !this.m) {
            return a;
        }
        a aVar2 = AnnotationCollector.a;
        AnnotationCollector annotationCollector = AnnotationCollector.a.c;
        Class<?> cls2 = this.l;
        if (cls2 != null) {
            annotationCollector = b(annotationCollector, this.k, cls2);
        }
        if (this.m) {
            annotationCollector = a(annotationCollector, f.k(this.k));
        }
        for (JavaType next : list) {
            if (z) {
                Class<?> cls3 = next.c;
                annotationCollector = b(annotationCollector, cls3, this.h.a(cls3));
            }
            if (this.m) {
                annotationCollector = a(annotationCollector, f.k(next.c));
            }
        }
        if (z) {
            annotationCollector = b(annotationCollector, cls, this.h.a(cls));
        }
        return annotationCollector.c();
    }

    public c(MapperConfig<?> mapperConfig, Class<?> cls, k.a aVar) {
        this.f = mapperConfig;
        Class<?> cls2 = null;
        this.j = null;
        this.k = cls;
        this.h = aVar;
        this.i = TypeBindings.q;
        if (mapperConfig == null) {
            this.g = null;
            this.l = null;
        } else {
            this.g = mapperConfig.p() ? mapperConfig.e() : null;
            this.l = aVar != null ? aVar.a(cls) : cls2;
        }
        this.m = this.g != null;
    }
}
