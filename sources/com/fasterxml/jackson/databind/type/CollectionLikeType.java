package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import i0.d.a.a.a;

public class CollectionLikeType extends TypeBase {
    public final JavaType c2;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollectionLikeType(java.lang.Class<?> r11, com.fasterxml.jackson.databind.type.TypeBindings r12, com.fasterxml.jackson.databind.JavaType r13, com.fasterxml.jackson.databind.JavaType[] r14, com.fasterxml.jackson.databind.JavaType r15, java.lang.Object r16, java.lang.Object r17, boolean r18) {
        /*
            r10 = this;
            r0 = r15
            int r6 = r0.d
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1.c2 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.CollectionLikeType.<init>(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType[], com.fasterxml.jackson.databind.JavaType, java.lang.Object, java.lang.Object, boolean):void");
    }

    public boolean E() {
        return true;
    }

    public boolean G() {
        return true;
    }

    public JavaType V(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new CollectionLikeType(cls, typeBindings, javaType, javaTypeArr, this.c2, this.q, this.x, this.y);
    }

    public JavaType W(JavaType javaType) {
        if (this.c2 == javaType) {
            return this;
        }
        return new CollectionLikeType(this.c, this.b2, this.Z1, this.a2, javaType, this.q, this.x, this.y);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.c2.Z(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JavaType Z(com.fasterxml.jackson.databind.JavaType r3) {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.JavaType r0 = super.Z(r3)
            com.fasterxml.jackson.databind.JavaType r3 = r3.l()
            if (r3 == 0) goto L_0x0018
            com.fasterxml.jackson.databind.JavaType r1 = r2.c2
            com.fasterxml.jackson.databind.JavaType r3 = r1.Z(r3)
            com.fasterxml.jackson.databind.JavaType r1 = r2.c2
            if (r3 == r1) goto L_0x0018
            com.fasterxml.jackson.databind.JavaType r0 = r0.W(r3)
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.CollectionLikeType.Z(com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JavaType");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        CollectionLikeType collectionLikeType = (CollectionLikeType) obj;
        if (this.c != collectionLikeType.c || !this.c2.equals(collectionLikeType.c2)) {
            return false;
        }
        return true;
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

    /* renamed from: g0 */
    public CollectionLikeType X(Object obj) {
        return new CollectionLikeType(this.c, this.b2, this.Z1, this.a2, this.c2.b0(obj), this.q, this.x, this.y);
    }

    /* renamed from: h0 */
    public CollectionLikeType Y(Object obj) {
        return new CollectionLikeType(this.c, this.b2, this.Z1, this.a2, this.c2.c0(obj), this.q, this.x, this.y);
    }

    /* renamed from: i0 */
    public CollectionLikeType a0() {
        if (this.y) {
            return this;
        }
        return new CollectionLikeType(this.c, this.b2, this.Z1, this.a2, this.c2.a0(), this.q, this.x, true);
    }

    /* renamed from: j0 */
    public CollectionLikeType b0(Object obj) {
        return new CollectionLikeType(this.c, this.b2, this.Z1, this.a2, this.c2, this.q, obj, this.y);
    }

    /* renamed from: k0 */
    public CollectionLikeType c0(Object obj) {
        return new CollectionLikeType(this.c, this.b2, this.Z1, this.a2, this.c2, obj, this.x, this.y);
    }

    public JavaType l() {
        return this.c2;
    }

    public StringBuilder m(StringBuilder sb) {
        TypeBase.d0(this.c, sb, true);
        return sb;
    }

    public StringBuilder n(StringBuilder sb) {
        TypeBase.d0(this.c, sb, false);
        sb.append('<');
        this.c2.n(sb);
        sb.append(">;");
        return sb;
    }

    public String toString() {
        StringBuilder P0 = a.P0("[collection-like type; class ");
        a.p(this.c, P0, ", contains ");
        P0.append(this.c2);
        P0.append("]");
        return P0.toString();
    }

    public boolean z() {
        return super.z() || this.c2.z();
    }
}
