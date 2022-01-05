package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import i0.d.a.a.a;
import i0.f.a.c.n.h;
import i0.f.a.c.n.q;
import i0.f.a.c.t.f;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class AnnotatedMethod extends AnnotatedWithParams implements Serializable {
    public final transient Method x;
    public Class<?>[] y;

    public AnnotatedMethod(q qVar, Method method, h hVar, h[] hVarArr) {
        super(qVar, hVar, hVarArr);
        if (method != null) {
            this.x = method;
            return;
        }
        throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
    }

    public Class<?> A() {
        return this.x.getReturnType();
    }

    public AnnotatedElement b() {
        return this.x;
    }

    public String d() {
        return this.x.getName();
    }

    public Class<?> e() {
        return this.x.getReturnType();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return f.u(obj, AnnotatedMethod.class) && ((AnnotatedMethod) obj).x == this.x;
    }

    public JavaType f() {
        return this.c.a(this.x.getGenericReturnType());
    }

    public Class<?> h() {
        return this.x.getDeclaringClass();
    }

    public int hashCode() {
        return this.x.getName().hashCode();
    }

    public String i() {
        String i = super.i();
        int x2 = x();
        if (x2 == 0) {
            return a.n0(i, "()");
        }
        if (x2 != 1) {
            return String.format("%s(%d params)", new Object[]{super.i(), Integer.valueOf(x())});
        }
        StringBuilder S0 = a.S0(i, "(");
        S0.append(z(0).getName());
        S0.append(")");
        return S0.toString();
    }

    public Member k() {
        return this.x;
    }

    public Object l(Object obj) throws IllegalArgumentException {
        try {
            return this.x.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            StringBuilder P0 = a.P0("Failed to getValue() with method ");
            P0.append(i());
            P0.append(": ");
            P0.append(e.getMessage());
            throw new IllegalArgumentException(P0.toString(), e);
        }
    }

    public i0.f.a.c.n.a n(h hVar) {
        return new AnnotatedMethod(this.c, this.x, hVar, this.q);
    }

    public final Object p() throws Exception {
        return this.x.invoke((Object) null, new Object[0]);
    }

    public final Object q(Object[] objArr) throws Exception {
        return this.x.invoke((Object) null, objArr);
    }

    public String toString() {
        StringBuilder P0 = a.P0("[method ");
        P0.append(i());
        P0.append("]");
        return P0.toString();
    }

    public final Object v(Object obj) throws Exception {
        return this.x.invoke((Object) null, new Object[]{obj});
    }

    public int x() {
        if (this.y == null) {
            this.y = this.x.getParameterTypes();
        }
        return this.y.length;
    }

    public JavaType y(int i) {
        Type[] genericParameterTypes = this.x.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this.c.a(genericParameterTypes[i]);
    }

    public Class<?> z(int i) {
        if (this.y == null) {
            this.y = this.x.getParameterTypes();
        }
        Class<?>[] clsArr = this.y;
        if (i >= clsArr.length) {
            return null;
        }
        return clsArr[i];
    }
}
