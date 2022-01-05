package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

public class SimpleType extends TypeBase {
    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, 0, obj, obj2, z);
    }

    public static SimpleType g0(Class<?> cls) {
        return new SimpleType(cls, (TypeBindings) null, (JavaType) null, (JavaType[]) null, (Object) null, (Object) null, false);
    }

    public boolean G() {
        return false;
    }

    public JavaType V(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    public JavaType W(JavaType javaType) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    public JavaType X(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        SimpleType simpleType = (SimpleType) obj;
        if (simpleType.c != this.c) {
            return false;
        }
        return this.b2.equals(simpleType.b2);
    }

    public String f0() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.getName());
        int length = this.b2.y.length;
        if (length > 0 && e0(length)) {
            sb.append('<');
            for (int i = 0; i < length; i++) {
                JavaType f = f(i);
                if (i > 0) {
                    sb.append(',');
                }
                sb.append(f.e());
            }
            sb.append('>');
        }
        return sb.toString();
    }

    /* renamed from: h0 */
    public SimpleType Y(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
    }

    /* renamed from: i0 */
    public SimpleType a0() {
        return this.y ? this : new SimpleType(this.c, this.b2, this.Z1, this.a2, this.q, this.x, true);
    }

    /* renamed from: j0 */
    public SimpleType b0(Object obj) {
        if (this.x == obj) {
            return this;
        }
        return new SimpleType(this.c, this.b2, this.Z1, this.a2, this.q, obj, this.y);
    }

    /* renamed from: k0 */
    public SimpleType c0(Object obj) {
        if (obj == this.q) {
            return this;
        }
        return new SimpleType(this.c, this.b2, this.Z1, this.a2, obj, this.x, this.y);
    }

    public StringBuilder m(StringBuilder sb) {
        TypeBase.d0(this.c, sb, true);
        return sb;
    }

    public StringBuilder n(StringBuilder sb) {
        TypeBase.d0(this.c, sb, false);
        int length = this.b2.y.length;
        if (length > 0) {
            sb.append('<');
            for (int i = 0; i < length; i++) {
                sb = f(i).n(sb);
            }
            sb.append('>');
        }
        sb.append(';');
        return sb;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[simple type, class ");
        sb.append(f0());
        sb.append(']');
        return sb.toString();
    }

    public boolean x() {
        return this instanceof ReferenceType;
    }

    public SimpleType(Class<?> cls) {
        this(cls, TypeBindings.q, (JavaType) null, (JavaType[]) null, (Object) null, (Object) null, false);
    }

    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, int i, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, i, obj, obj2, z);
    }
}
