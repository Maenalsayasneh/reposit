package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import i0.f.a.b.l.a;

public class ReferenceType extends SimpleType {
    public final JavaType c2;
    public final JavaType d2;

    /* JADX WARNING: type inference failed for: r17v0, types: [com.fasterxml.jackson.databind.JavaType] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ReferenceType(java.lang.Class<?> r12, com.fasterxml.jackson.databind.type.TypeBindings r13, com.fasterxml.jackson.databind.JavaType r14, com.fasterxml.jackson.databind.JavaType[] r15, com.fasterxml.jackson.databind.JavaType r16, com.fasterxml.jackson.databind.JavaType r17, java.lang.Object r18, java.lang.Object r19, boolean r20) {
        /*
            r11 = this;
            r9 = r11
            r10 = r16
            int r5 = r10.d
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r6 = r18
            r7 = r19
            r8 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.c2 = r10
            if (r17 != 0) goto L_0x0019
            r0 = r9
            goto L_0x001b
        L_0x0019:
            r0 = r17
        L_0x001b:
            r9.d2 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.ReferenceType.<init>(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType[], com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType, java.lang.Object, java.lang.Object, boolean):void");
    }

    public JavaType V(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new ReferenceType(cls, this.b2, javaType, javaTypeArr, this.c2, this.d2, this.q, this.x, this.y);
    }

    public JavaType W(JavaType javaType) {
        if (this.c2 == javaType) {
            return this;
        }
        return new ReferenceType(this.c, this.b2, this.Z1, this.a2, javaType, this.d2, this.q, this.x, this.y);
    }

    public JavaType X(Object obj) {
        JavaType javaType = this.c2;
        if (obj == javaType.x) {
            return this;
        }
        return new ReferenceType(this.c, this.b2, this.Z1, this.a2, javaType.b0(obj), this.d2, this.q, this.x, this.y);
    }

    public a a() {
        return this.c2;
    }

    public boolean d() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != ReferenceType.class) {
            return false;
        }
        ReferenceType referenceType = (ReferenceType) obj;
        if (referenceType.c != this.c) {
            return false;
        }
        return this.c2.equals(referenceType.c2);
    }

    public String f0() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.getName());
        if (this.c2 != null && e0(1)) {
            sb.append('<');
            sb.append(this.c2.e());
            sb.append('>');
        }
        return sb.toString();
    }

    public JavaType l() {
        return this.c2;
    }

    /* renamed from: l0 */
    public ReferenceType h0(Object obj) {
        JavaType javaType = this.c2;
        if (obj == javaType.q) {
            return this;
        }
        return new ReferenceType(this.c, this.b2, this.Z1, this.a2, javaType.c0(obj), this.d2, this.q, this.x, this.y);
    }

    public StringBuilder m(StringBuilder sb) {
        TypeBase.d0(this.c, sb, true);
        return sb;
    }

    /* renamed from: m0 */
    public ReferenceType i0() {
        if (this.y) {
            return this;
        }
        return new ReferenceType(this.c, this.b2, this.Z1, this.a2, this.c2.a0(), this.d2, this.q, this.x, true);
    }

    public StringBuilder n(StringBuilder sb) {
        TypeBase.d0(this.c, sb, false);
        sb.append('<');
        StringBuilder n = this.c2.n(sb);
        n.append(">;");
        return n;
    }

    /* renamed from: n0 */
    public ReferenceType j0(Object obj) {
        if (obj == this.x) {
            return this;
        }
        return new ReferenceType(this.c, this.b2, this.Z1, this.a2, this.c2, this.d2, this.q, obj, this.y);
    }

    /* renamed from: o0 */
    public ReferenceType k0(Object obj) {
        if (obj == this.q) {
            return this;
        }
        return new ReferenceType(this.c, this.b2, this.Z1, this.a2, this.c2, this.d2, obj, this.x, this.y);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[reference type, class ");
        sb.append(f0());
        sb.append('<');
        sb.append(this.c2);
        sb.append('>');
        sb.append(']');
        return sb.toString();
    }

    public JavaType v() {
        return this.c2;
    }
}
