package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

public class ResolvedRecursiveType extends TypeBase {
    public JavaType c2;

    public ResolvedRecursiveType(Class<?> cls, TypeBindings typeBindings) {
        super(cls, typeBindings, (JavaType) null, (JavaType[]) null, 0, (Object) null, (Object) null, false);
    }

    public boolean G() {
        return false;
    }

    public JavaType V(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    public JavaType W(JavaType javaType) {
        return this;
    }

    public JavaType X(Object obj) {
        return this;
    }

    public JavaType Y(Object obj) {
        return this;
    }

    public JavaType a0() {
        return this;
    }

    public JavaType b0(Object obj) {
        return this;
    }

    public JavaType c0(Object obj) {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == ResolvedRecursiveType.class) {
        }
        return false;
    }

    public TypeBindings k() {
        JavaType javaType = this.c2;
        if (javaType != null) {
            return javaType.k();
        }
        return this.b2;
    }

    public StringBuilder m(StringBuilder sb) {
        JavaType javaType = this.c2;
        return javaType != null ? javaType.m(sb) : sb;
    }

    public StringBuilder n(StringBuilder sb) {
        JavaType javaType = this.c2;
        if (javaType != null) {
            return javaType.m(sb);
        }
        sb.append("?");
        return sb;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[recursive type; ");
        JavaType javaType = this.c2;
        if (javaType == null) {
            sb.append("UNRESOLVED");
        } else {
            sb.append(javaType.c.getName());
        }
        return sb.toString();
    }

    public JavaType w() {
        JavaType javaType = this.c2;
        if (javaType != null) {
            return javaType.w();
        }
        return this.Z1;
    }
}
