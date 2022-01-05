package i0.f.a.c.l.m;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import i0.f.a.c.n.j;

/* compiled from: CreatorCandidate */
public final class a {
    public final AnnotationIntrospector a;
    public final AnnotatedWithParams b;
    public final int c;
    public final C0121a[] d;

    /* renamed from: i0.f.a.c.l.m.a$a  reason: collision with other inner class name */
    /* compiled from: CreatorCandidate */
    public static final class C0121a {
        public final AnnotatedParameter a;
        public final j b;
        public final JacksonInject.Value c;

        public C0121a(AnnotatedParameter annotatedParameter, j jVar, JacksonInject.Value value) {
            this.a = annotatedParameter;
            this.b = jVar;
            this.c = value;
        }
    }

    public a(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, C0121a[] aVarArr, int i) {
        this.a = annotationIntrospector;
        this.b = annotatedWithParams;
        this.d = aVarArr;
        this.c = i;
    }

    public static a a(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, j[] jVarArr) {
        int x = annotatedWithParams.x();
        C0121a[] aVarArr = new C0121a[x];
        for (int i = 0; i < x; i++) {
            AnnotatedParameter w = annotatedWithParams.w(i);
            aVarArr[i] = new C0121a(w, jVarArr == null ? null : jVarArr[i], annotationIntrospector.v(w));
        }
        return new a(annotationIntrospector, annotatedWithParams, aVarArr, x);
    }

    public PropertyName b(int i) {
        String q = this.a.q(this.d[i].a);
        if (q == null || q.isEmpty()) {
            return null;
        }
        return PropertyName.a(q);
    }

    public JacksonInject.Value c(int i) {
        return this.d[i].c;
    }

    public PropertyName d(int i) {
        j jVar = this.d[i].b;
        if (jVar != null) {
            return jVar.b();
        }
        return null;
    }

    public AnnotatedParameter e(int i) {
        return this.d[i].a;
    }

    public j f(int i) {
        return this.d[i].b;
    }

    public String toString() {
        return this.b.toString();
    }
}
