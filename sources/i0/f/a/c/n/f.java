package i0.f.a.c.n;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import i0.f.a.c.n.k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: AnnotatedMethodCollector */
public class f extends l {
    public final k.a d;
    public final boolean e;

    /* compiled from: AnnotatedMethodCollector */
    public static final class a {
        public q a;
        public Method b;
        public AnnotationCollector c;

        public a(q qVar, Method method, AnnotationCollector annotationCollector) {
            this.a = qVar;
            this.b = method;
            this.c = annotationCollector;
        }
    }

    public f(AnnotationIntrospector annotationIntrospector, k.a aVar, boolean z) {
        super(annotationIntrospector);
        this.d = annotationIntrospector == null ? null : aVar;
        this.e = z;
    }

    public static boolean h(Method method) {
        if (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) {
            return false;
        }
        return true;
    }

    public final void f(q qVar, Class<?> cls, Map<m, a> map, Class<?> cls2) {
        AnnotationCollector annotationCollector;
        if (cls2 != null) {
            g(qVar, cls, map, cls2);
        }
        if (cls != null) {
            for (Method method : i0.f.a.c.t.f.o(cls)) {
                if (h(method)) {
                    m mVar = new m(method);
                    a aVar = map.get(mVar);
                    if (aVar == null) {
                        if (this.c == null) {
                            i0.f.a.c.t.a aVar2 = AnnotationCollector.a;
                            annotationCollector = AnnotationCollector.a.c;
                        } else {
                            annotationCollector = c(method.getDeclaredAnnotations());
                        }
                        map.put(mVar, new a(qVar, method, annotationCollector));
                    } else {
                        if (this.e) {
                            aVar.c = d(aVar.c, method.getDeclaredAnnotations());
                        }
                        Method method2 = aVar.b;
                        if (method2 == null) {
                            aVar.b = method;
                        } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                            aVar.b = method;
                            aVar.a = qVar;
                        }
                    }
                }
            }
        }
    }

    public void g(q qVar, Class<?> cls, Map<m, a> map, Class<?> cls2) {
        List<Class> list;
        if (this.c != null) {
            Annotation[] annotationArr = i0.f.a.c.t.f.a;
            if (cls2 == cls || cls2 == Object.class) {
                list = Collections.emptyList();
            } else {
                list = new ArrayList<>(8);
                i0.f.a.c.t.f.a(cls2, cls, list, true);
            }
            for (Class declaredMethods : list) {
                for (Method method : declaredMethods.getDeclaredMethods()) {
                    if (h(method)) {
                        m mVar = new m(method);
                        a aVar = map.get(mVar);
                        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                        if (aVar == null) {
                            map.put(mVar, new a(qVar, (Method) null, c(declaredAnnotations)));
                        } else {
                            aVar.c = d(aVar.c, declaredAnnotations);
                        }
                    }
                }
            }
        }
    }
}
