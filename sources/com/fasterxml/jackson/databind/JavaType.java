package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.b.l.a;
import i0.f.a.c.t.f;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

public abstract class JavaType extends a implements Serializable, Type {
    public final Class<?> c;
    public final int d;
    public final Object q;
    public final Object x;
    public final boolean y;

    public JavaType(Class<?> cls, int i, Object obj, Object obj2, boolean z) {
        this.c = cls;
        this.d = cls.getName().hashCode() + i;
        this.q = obj;
        this.x = obj2;
        this.y = z;
    }

    public final boolean A(Class<?> cls) {
        return this.c == cls;
    }

    public boolean C() {
        return Modifier.isAbstract(this.c.getModifiers());
    }

    public boolean E() {
        return false;
    }

    public boolean F() {
        if ((this.c.getModifiers() & 1536) == 0) {
            return true;
        }
        return this.c.isPrimitive();
    }

    public abstract boolean G();

    public final boolean H() {
        return f.w(this.c) && this.c != Enum.class;
    }

    public final boolean I() {
        return f.w(this.c);
    }

    public final boolean J() {
        return Modifier.isFinal(this.c.getModifiers());
    }

    public final boolean M() {
        return this.c.isInterface();
    }

    public final boolean N() {
        return this.c == Object.class;
    }

    public boolean O() {
        return false;
    }

    public final boolean Q() {
        return this.c.isPrimitive();
    }

    public final boolean R() {
        Class<?> cls = this.c;
        Annotation[] annotationArr = f.a;
        Class<? super Object> superclass = cls.getSuperclass();
        return superclass != null && "java.lang.Record".equals(superclass.getName());
    }

    public final boolean T(Class<?> cls) {
        Class<?> cls2 = this.c;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public final boolean U(Class<?> cls) {
        Class<?> cls2 = this.c;
        return cls2 == cls || cls2.isAssignableFrom(cls);
    }

    public abstract JavaType V(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr);

    public abstract JavaType W(JavaType javaType);

    public abstract JavaType X(Object obj);

    public abstract JavaType Y(Object obj);

    public JavaType Z(JavaType javaType) {
        Object obj = javaType.x;
        JavaType b0 = obj != this.x ? b0(obj) : this;
        Object obj2 = javaType.q;
        return obj2 != this.q ? b0.c0(obj2) : b0;
    }

    public abstract JavaType a0();

    public abstract JavaType b0(Object obj);

    public abstract JavaType c0(Object obj);

    public abstract boolean equals(Object obj);

    public abstract JavaType f(int i);

    public abstract int g();

    public JavaType h(int i) {
        JavaType f = f(i);
        return f == null ? TypeFactory.v() : f;
    }

    public final int hashCode() {
        return this.d;
    }

    public abstract JavaType i(Class<?> cls);

    public abstract TypeBindings k();

    public JavaType l() {
        return null;
    }

    public abstract StringBuilder m(StringBuilder sb);

    public abstract StringBuilder n(StringBuilder sb);

    public abstract List<JavaType> p();

    public JavaType q() {
        return null;
    }

    public abstract String toString();

    /* renamed from: v */
    public JavaType a() {
        return null;
    }

    public abstract JavaType w();

    public boolean x() {
        return true;
    }

    public boolean y() {
        return g() > 0;
    }

    public boolean z() {
        return (this.x == null && this.q == null) ? false : true;
    }
}
