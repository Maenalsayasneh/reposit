package i0.f.a.c.n;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.c.n.k;
import i0.f.a.c.n.q;
import i0.f.a.c.t.f;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: AnnotatedFieldCollector */
public class e extends l {
    public final TypeFactory d;
    public final k.a e;
    public final boolean f;

    /* compiled from: AnnotatedFieldCollector */
    public static final class a {
        public final q a;
        public final Field b;
        public AnnotationCollector c = AnnotationCollector.a.c;

        public a(q qVar, Field field) {
            this.a = qVar;
            this.b = field;
            i0.f.a.c.t.a aVar = AnnotationCollector.a;
        }
    }

    public e(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, k.a aVar, boolean z) {
        super(annotationIntrospector);
        this.d = typeFactory;
        this.e = annotationIntrospector == null ? null : aVar;
        this.f = z;
    }

    public final Map<String, a> f(q qVar, JavaType javaType, Map<String, a> map) {
        k.a aVar;
        Class<?> a2;
        a aVar2;
        JavaType w = javaType.w();
        if (w == null) {
            return map;
        }
        Class<?> cls = javaType.c;
        Map<String, a> f2 = f(new q.a(this.d, w.k()), w, map);
        for (Field field : cls.getDeclaredFields()) {
            if (g(field)) {
                if (f2 == null) {
                    f2 = new LinkedHashMap<>();
                }
                a aVar3 = new a(qVar, field);
                if (this.f) {
                    aVar3.c = b(aVar3.c, field.getDeclaredAnnotations());
                }
                f2.put(field.getName(), aVar3);
            }
        }
        if (!(f2 == null || (aVar = this.e) == null || (a2 = aVar.a(cls)) == null)) {
            Iterator it = ((ArrayList) f.m(a2, cls, true)).iterator();
            while (it.hasNext()) {
                for (Field field2 : ((Class) it.next()).getDeclaredFields()) {
                    if (g(field2) && (aVar2 = f2.get(field2.getName())) != null) {
                        aVar2.c = b(aVar2.c, field2.getDeclaredAnnotations());
                    }
                }
            }
        }
        return f2;
    }

    public final boolean g(Field field) {
        if (!field.isSynthetic() && !Modifier.isStatic(field.getModifiers())) {
            return true;
        }
        return false;
    }
}
