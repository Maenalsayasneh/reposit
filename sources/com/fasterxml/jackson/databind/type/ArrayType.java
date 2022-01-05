package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import i0.d.a.a.a;
import java.lang.reflect.Array;

public final class ArrayType extends TypeBase {
    public final JavaType c2;
    public final Object d2;

    public ArrayType(JavaType javaType, TypeBindings typeBindings, Object obj, Object obj2, Object obj3, boolean z) {
        super(obj.getClass(), typeBindings, (JavaType) null, (JavaType[]) null, javaType.d, obj2, obj3, z);
        this.c2 = javaType;
        this.d2 = obj;
    }

    public static ArrayType g0(JavaType javaType, TypeBindings typeBindings) {
        return new ArrayType(javaType, typeBindings, Array.newInstance(javaType.c, 0), (Object) null, (Object) null, false);
    }

    public boolean C() {
        return false;
    }

    public boolean F() {
        return true;
    }

    public boolean G() {
        return true;
    }

    public JavaType V(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    public JavaType W(JavaType javaType) {
        return new ArrayType(javaType, this.b2, Array.newInstance(javaType.c, 0), this.q, this.x, this.y);
    }

    public JavaType X(Object obj) {
        JavaType javaType = this.c2;
        if (obj == javaType.x) {
            return this;
        }
        return new ArrayType(javaType.b0(obj), this.b2, this.d2, this.q, this.x, this.y);
    }

    public JavaType Y(Object obj) {
        JavaType javaType = this.c2;
        if (obj == javaType.q) {
            return this;
        }
        return new ArrayType(javaType.c0(obj), this.b2, this.d2, this.q, this.x, this.y);
    }

    public JavaType a0() {
        if (this.y) {
            return this;
        }
        return new ArrayType(this.c2.a0(), this.b2, this.d2, this.q, this.x, true);
    }

    public JavaType b0(Object obj) {
        if (obj == this.x) {
            return this;
        }
        return new ArrayType(this.c2, this.b2, this.d2, this.q, obj, this.y);
    }

    public JavaType c0(Object obj) {
        if (obj == this.q) {
            return this;
        }
        return new ArrayType(this.c2, this.b2, this.d2, obj, this.x, this.y);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == ArrayType.class) {
            return this.c2.equals(((ArrayType) obj).c2);
        }
        return false;
    }

    public JavaType l() {
        return this.c2;
    }

    public StringBuilder m(StringBuilder sb) {
        sb.append('[');
        return this.c2.m(sb);
    }

    public StringBuilder n(StringBuilder sb) {
        sb.append('[');
        return this.c2.n(sb);
    }

    public String toString() {
        StringBuilder P0 = a.P0("[array type, component type: ");
        P0.append(this.c2);
        P0.append("]");
        return P0.toString();
    }

    public boolean y() {
        return this.c2.y();
    }

    public boolean z() {
        return super.z() || this.c2.z();
    }
}
