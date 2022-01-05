package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import i0.d.a.a.a;
import i0.f.a.c.n.h;
import i0.f.a.c.n.q;
import i0.f.a.c.t.f;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

public final class AnnotatedField extends AnnotatedMember implements Serializable {
    public final transient Field q;

    public AnnotatedField(q qVar, Field field, h hVar) {
        super(qVar, hVar);
        this.q = field;
    }

    public AnnotatedElement b() {
        return this.q;
    }

    public String d() {
        return this.q.getName();
    }

    public Class<?> e() {
        return this.q.getType();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return f.u(obj, AnnotatedField.class) && ((AnnotatedField) obj).q == this.q;
    }

    public JavaType f() {
        return this.c.a(this.q.getGenericType());
    }

    public Class<?> h() {
        return this.q.getDeclaringClass();
    }

    public int hashCode() {
        return this.q.getName().hashCode();
    }

    public Member k() {
        return this.q;
    }

    public Object l(Object obj) throws IllegalArgumentException {
        try {
            return this.q.get(obj);
        } catch (IllegalAccessException e) {
            StringBuilder P0 = a.P0("Failed to getValue() for field ");
            P0.append(i());
            P0.append(": ");
            P0.append(e.getMessage());
            throw new IllegalArgumentException(P0.toString(), e);
        }
    }

    public i0.f.a.c.n.a n(h hVar) {
        return new AnnotatedField(this.c, this.q, hVar);
    }

    public String toString() {
        StringBuilder P0 = a.P0("[field ");
        P0.append(i());
        P0.append("]");
        return P0.toString();
    }
}
