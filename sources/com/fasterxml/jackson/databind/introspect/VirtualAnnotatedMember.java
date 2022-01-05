package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import i0.d.a.a.a;
import i0.f.a.c.n.h;
import i0.f.a.c.n.q;
import i0.f.a.c.t.f;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

public class VirtualAnnotatedMember extends AnnotatedMember implements Serializable {
    public final Class<?> q;
    public final JavaType x;
    public final String y;

    public VirtualAnnotatedMember(q qVar, Class<?> cls, String str, JavaType javaType) {
        super(qVar, (h) null);
        this.q = cls;
        this.x = javaType;
        this.y = str;
    }

    public /* bridge */ /* synthetic */ AnnotatedElement b() {
        return null;
    }

    public String d() {
        return this.y;
    }

    public Class<?> e() {
        return this.x.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!f.u(obj, VirtualAnnotatedMember.class)) {
            return false;
        }
        VirtualAnnotatedMember virtualAnnotatedMember = (VirtualAnnotatedMember) obj;
        if (virtualAnnotatedMember.q != this.q || !virtualAnnotatedMember.y.equals(this.y)) {
            return false;
        }
        return true;
    }

    public JavaType f() {
        return this.x;
    }

    public Class<?> h() {
        return this.q;
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    public Member k() {
        return null;
    }

    public Object l(Object obj) throws IllegalArgumentException {
        throw new IllegalArgumentException(a.y0(a.P0("Cannot get virtual property '"), this.y, "'"));
    }

    public i0.f.a.c.n.a n(h hVar) {
        return this;
    }

    public String toString() {
        StringBuilder P0 = a.P0("[virtual ");
        P0.append(i());
        P0.append("]");
        return P0.toString();
    }
}
