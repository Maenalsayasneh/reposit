package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import i0.d.a.a.a;

public class PlaceholderForType extends TypeBase {
    public final int c2;
    public JavaType d2;

    public PlaceholderForType(int i) {
        super(Object.class, TypeBindings.q, TypeFactory.v(), (JavaType[]) null, 1, (Object) null, (Object) null, false);
        this.c2 = i;
    }

    public boolean G() {
        return false;
    }

    public JavaType V(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        g0();
        throw null;
    }

    public JavaType W(JavaType javaType) {
        g0();
        throw null;
    }

    public JavaType X(Object obj) {
        g0();
        throw null;
    }

    public JavaType Y(Object obj) {
        g0();
        throw null;
    }

    public JavaType a0() {
        g0();
        throw null;
    }

    public JavaType b0(Object obj) {
        g0();
        throw null;
    }

    public JavaType c0(Object obj) {
        g0();
        throw null;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public String f0() {
        return toString();
    }

    public final <T> T g0() {
        throw new UnsupportedOperationException(a.W(PlaceholderForType.class, a.P0("Operation should not be attempted on ")));
    }

    public StringBuilder m(StringBuilder sb) {
        sb.append('$');
        sb.append(this.c2 + 1);
        return sb;
    }

    public StringBuilder n(StringBuilder sb) {
        m(sb);
        return sb;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        m(sb);
        return sb.toString();
    }
}
