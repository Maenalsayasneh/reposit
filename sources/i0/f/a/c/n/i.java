package i0.f.a.c.n;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import i0.d.a.a.a;
import i0.f.a.c.b;
import i0.f.a.c.t.f;
import i0.f.a.c.t.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: BasicBeanDescription */
public class i extends b {
    public static final Class<?>[] b = new Class[0];
    public final o c;
    public final MapperConfig<?> d;
    public final AnnotationIntrospector e;
    public final b f;
    public Class<?>[] g;
    public boolean h;
    public List<j> i;
    public n j;

    public i(MapperConfig<?> mapperConfig, JavaType javaType, b bVar, List<j> list) {
        super(javaType);
        this.c = null;
        this.d = mapperConfig;
        if (mapperConfig == null) {
            this.e = null;
        } else {
            this.e = mapperConfig.e();
        }
        this.f = bVar;
        this.i = list;
    }

    public static i i(MapperConfig<?> mapperConfig, JavaType javaType, b bVar) {
        return new i(mapperConfig, javaType, bVar, Collections.emptyList());
    }

    public Class<?>[] a() {
        Class<?>[] clsArr;
        if (!this.h) {
            this.h = true;
            AnnotationIntrospector annotationIntrospector = this.e;
            if (annotationIntrospector == null) {
                clsArr = null;
            } else {
                clsArr = annotationIntrospector.o0(this.f);
            }
            if (clsArr == null && !this.d.q(MapperFeature.DEFAULT_VIEW_INCLUSION)) {
                clsArr = b;
            }
            this.g = clsArr;
        }
        return this.g;
    }

    public JsonFormat.Value b(JsonFormat.Value value) {
        JsonFormat.Value value2;
        AnnotationIntrospector annotationIntrospector = this.e;
        if (annotationIntrospector == null || (value2 = annotationIntrospector.p(this.f)) == null) {
            value2 = null;
        }
        JsonFormat.Value h2 = this.d.h(this.f.q);
        if (h2 == null) {
            return value2;
        }
        if (value2 == null) {
            return h2;
        }
        return value2.f(h2);
    }

    public AnnotatedMember c() {
        o oVar = this.c;
        if (oVar == null) {
            return null;
        }
        if (!oVar.i) {
            oVar.h();
        }
        LinkedList<AnnotatedMember> linkedList = oVar.r;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() <= 1) {
            return oVar.r.get(0);
        }
        oVar.i("Multiple 'as-value' properties defined (%s vs %s)", oVar.r.get(0), oVar.r.get(1));
        throw null;
    }

    public AnnotatedMethod d(String str, Class<?>[] clsArr) {
        Map<m, AnnotatedMethod> map = this.f.h().c;
        if (map == null) {
            return null;
        }
        return map.get(new m(str, clsArr));
    }

    public JsonInclude.Value e(JsonInclude.Value value) {
        JsonInclude.Value V;
        AnnotationIntrospector annotationIntrospector = this.e;
        if (annotationIntrospector == null || (V = annotationIntrospector.V(this.f)) == null) {
            return value;
        }
        return value == null ? V : value.a(V);
    }

    public List<AnnotatedMethod> f() {
        List<AnnotatedMethod> l = this.f.l();
        if (l.isEmpty()) {
            return l;
        }
        ArrayList arrayList = null;
        for (AnnotatedMethod next : l) {
            if (k(next)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public g<Object, Object> g(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj instanceof Class) {
            Class<g.a> cls = (Class) obj;
            if (cls == g.a.class || f.v(cls)) {
                return null;
            }
            if (g.class.isAssignableFrom(cls)) {
                Objects.requireNonNull(this.d.d);
                return (g) f.i(cls, this.d.b());
            }
            throw new IllegalStateException(a.Y(cls, a.P0("AnnotationIntrospector returned Class "), "; expected Class<Converter>"));
        }
        throw new IllegalStateException(a.d0(obj, a.P0("AnnotationIntrospector returned Converter definition of type "), "; expected type Converter or Class<Converter> instead"));
    }

    public List<j> h() {
        if (this.i == null) {
            o oVar = this.c;
            if (!oVar.i) {
                oVar.h();
            }
            this.i = new ArrayList(oVar.j.values());
        }
        return this.i;
    }

    public boolean j(PropertyName propertyName) {
        j jVar;
        Iterator<j> it = h().iterator();
        while (true) {
            if (!it.hasNext()) {
                jVar = null;
                break;
            }
            jVar = it.next();
            if (jVar.F(propertyName)) {
                break;
            }
        }
        return jVar != null;
    }

    public boolean k(AnnotatedMethod annotatedMethod) {
        Class<?> z;
        if (!this.a.c.isAssignableFrom(annotatedMethod.A())) {
            return false;
        }
        JsonCreator.Mode e2 = this.e.e(this.d, annotatedMethod);
        if (e2 != null && e2 != JsonCreator.Mode.DISABLED) {
            return true;
        }
        String d2 = annotatedMethod.d();
        if ("valueOf".equals(d2) && annotatedMethod.x() == 1) {
            return true;
        }
        if (!"fromString".equals(d2) || annotatedMethod.x() != 1 || ((z = annotatedMethod.z(0)) != String.class && !CharSequence.class.isAssignableFrom(z))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(i0.f.a.c.n.o r3) {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.JavaType r0 = r3.d
            i0.f.a.c.n.b r1 = r3.e
            r2.<init>(r0)
            r2.c = r3
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r0 = r3.a
            r2.d = r0
            if (r0 != 0) goto L_0x0013
            r0 = 0
            r2.e = r0
            goto L_0x0019
        L_0x0013:
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r0.e()
            r2.e = r0
        L_0x0019:
            r2.f = r1
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r3.g
            i0.f.a.c.n.b r1 = r3.e
            i0.f.a.c.n.n r0 = r0.G(r1)
            if (r0 == 0) goto L_0x002d
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r3.g
            i0.f.a.c.n.b r3 = r3.e
            i0.f.a.c.n.n r0 = r1.H(r3, r0)
        L_0x002d:
            r2.j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.c.n.i.<init>(i0.f.a.c.n.o):void");
    }
}
