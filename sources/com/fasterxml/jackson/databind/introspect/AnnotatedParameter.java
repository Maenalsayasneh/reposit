package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import i0.d.a.a.a;
import i0.f.a.c.n.h;
import i0.f.a.c.n.q;
import i0.f.a.c.t.f;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

public final class AnnotatedParameter extends AnnotatedMember {
    public final AnnotatedWithParams q;
    public final JavaType x;
    public final int y;

    public AnnotatedParameter(AnnotatedWithParams annotatedWithParams, JavaType javaType, q qVar, h hVar, int i) {
        super(qVar, hVar);
        this.q = annotatedWithParams;
        this.x = javaType;
        this.y = i;
    }

    public AnnotatedElement b() {
        return null;
    }

    public String d() {
        return "";
    }

    public Class<?> e() {
        return this.x.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!f.u(obj, AnnotatedParameter.class)) {
            return false;
        }
        AnnotatedParameter annotatedParameter = (AnnotatedParameter) obj;
        if (!annotatedParameter.q.equals(this.q) || annotatedParameter.y != this.y) {
            return false;
        }
        return true;
    }

    public JavaType f() {
        return this.x;
    }

    public Class<?> h() {
        return this.q.h();
    }

    public int hashCode() {
        return this.q.hashCode() + this.y;
    }

    public Member k() {
        return this.q.k();
    }

    public Object l(Object obj) throws UnsupportedOperationException {
        StringBuilder P0 = a.P0("Cannot call getValue() on constructor parameter of ");
        P0.append(h().getName());
        throw new UnsupportedOperationException(P0.toString());
    }

    public i0.f.a.c.n.a n(h hVar) {
        if (hVar == this.d) {
            return this;
        }
        AnnotatedWithParams annotatedWithParams = this.q;
        int i = this.y;
        annotatedWithParams.q[i] = hVar;
        return annotatedWithParams.w(i);
    }

    public String toString() {
        StringBuilder P0 = a.P0("[parameter #");
        P0.append(this.y);
        P0.append(", annotations: ");
        P0.append(this.d);
        P0.append("]");
        return P0.toString();
    }
}
