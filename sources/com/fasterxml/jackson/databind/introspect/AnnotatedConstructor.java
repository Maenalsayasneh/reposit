package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import i0.d.a.a.a;
import i0.f.a.c.n.h;
import i0.f.a.c.n.q;
import i0.f.a.c.t.f;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class AnnotatedConstructor extends AnnotatedWithParams {
    public final Constructor<?> x;

    public AnnotatedConstructor(q qVar, Constructor<?> constructor, h hVar, h[] hVarArr) {
        super(qVar, hVar, hVarArr);
        if (constructor != null) {
            this.x = constructor;
            return;
        }
        throw new IllegalArgumentException("Null constructor not allowed");
    }

    public AnnotatedElement b() {
        return this.x;
    }

    public String d() {
        return this.x.getName();
    }

    public Class<?> e() {
        return this.x.getDeclaringClass();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return f.u(obj, AnnotatedConstructor.class) && ((AnnotatedConstructor) obj).x == this.x;
    }

    public JavaType f() {
        return this.c.a(e());
    }

    public Class<?> h() {
        return this.x.getDeclaringClass();
    }

    public int hashCode() {
        return this.x.getName().hashCode();
    }

    public Member k() {
        return this.x;
    }

    public Object l(Object obj) throws UnsupportedOperationException {
        StringBuilder P0 = a.P0("Cannot call getValue() on constructor of ");
        P0.append(h().getName());
        throw new UnsupportedOperationException(P0.toString());
    }

    public i0.f.a.c.n.a n(h hVar) {
        return new AnnotatedConstructor(this.c, this.x, hVar, this.q);
    }

    public final Object p() throws Exception {
        return this.x.newInstance(new Object[0]);
    }

    public final Object q(Object[] objArr) throws Exception {
        return this.x.newInstance(objArr);
    }

    public String toString() {
        int length = this.x.getParameterTypes().length;
        Object[] objArr = new Object[4];
        objArr[0] = f.E(this.x.getDeclaringClass());
        objArr[1] = Integer.valueOf(length);
        objArr[2] = length == 1 ? "" : "s";
        objArr[3] = this.d;
        return String.format("[constructor for %s (%d arg%s), annotations: %s", objArr);
    }

    public final Object v(Object obj) throws Exception {
        return this.x.newInstance(new Object[]{obj});
    }

    public int x() {
        return this.x.getParameterTypes().length;
    }

    public JavaType y(int i) {
        Type[] genericParameterTypes = this.x.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this.c.a(genericParameterTypes[i]);
    }

    public Class<?> z(int i) {
        Class<?>[] parameterTypes = this.x.getParameterTypes();
        if (i >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i];
    }
}
