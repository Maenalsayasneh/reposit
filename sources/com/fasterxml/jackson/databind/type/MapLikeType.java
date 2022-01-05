package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

public class MapLikeType extends TypeBase {
    public final JavaType c2;
    public final JavaType d2;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MapLikeType(java.lang.Class<?> r13, com.fasterxml.jackson.databind.type.TypeBindings r14, com.fasterxml.jackson.databind.JavaType r15, com.fasterxml.jackson.databind.JavaType[] r16, com.fasterxml.jackson.databind.JavaType r17, com.fasterxml.jackson.databind.JavaType r18, java.lang.Object r19, java.lang.Object r20, boolean r21) {
        /*
            r12 = this;
            r9 = r12
            r10 = r17
            r11 = r18
            int r0 = r10.d
            int r1 = r11.d
            r5 = r0 ^ r1
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r19
            r7 = r20
            r8 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.c2 = r10
            r9.d2 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.MapLikeType.<init>(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType[], com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType, java.lang.Object, java.lang.Object, boolean):void");
    }

    public boolean G() {
        return true;
    }

    public boolean O() {
        return true;
    }

    public JavaType V(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new MapLikeType(cls, typeBindings, javaType, javaTypeArr, this.c2, this.d2, this.q, this.x, this.y);
    }

    public JavaType W(JavaType javaType) {
        if (this.d2 == javaType) {
            return this;
        }
        return new MapLikeType(this.c, this.b2, this.Z1, this.a2, this.c2, javaType, this.q, this.x, this.y);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r4 = r3.d2.Z(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JavaType Z(com.fasterxml.jackson.databind.JavaType r4) {
        /*
            r3 = this;
            com.fasterxml.jackson.databind.JavaType r0 = super.Z(r4)
            com.fasterxml.jackson.databind.JavaType r1 = r4.q()
            boolean r2 = r0 instanceof com.fasterxml.jackson.databind.type.MapLikeType
            if (r2 == 0) goto L_0x001e
            if (r1 == 0) goto L_0x001e
            com.fasterxml.jackson.databind.JavaType r2 = r3.c2
            com.fasterxml.jackson.databind.JavaType r1 = r2.Z(r1)
            com.fasterxml.jackson.databind.JavaType r2 = r3.c2
            if (r1 == r2) goto L_0x001e
            com.fasterxml.jackson.databind.type.MapLikeType r0 = (com.fasterxml.jackson.databind.type.MapLikeType) r0
            com.fasterxml.jackson.databind.type.MapLikeType r0 = r0.i0(r1)
        L_0x001e:
            com.fasterxml.jackson.databind.JavaType r4 = r4.l()
            if (r4 == 0) goto L_0x0032
            com.fasterxml.jackson.databind.JavaType r1 = r3.d2
            com.fasterxml.jackson.databind.JavaType r4 = r1.Z(r4)
            com.fasterxml.jackson.databind.JavaType r1 = r3.d2
            if (r4 == r1) goto L_0x0032
            com.fasterxml.jackson.databind.JavaType r0 = r0.W(r4)
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.MapLikeType.Z(com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JavaType");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        MapLikeType mapLikeType = (MapLikeType) obj;
        if (this.c != mapLikeType.c || !this.c2.equals(mapLikeType.c2) || !this.d2.equals(mapLikeType.d2)) {
            return false;
        }
        return true;
    }

    public String f0() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.getName());
        if (this.c2 != null && e0(2)) {
            sb.append('<');
            sb.append(this.c2.e());
            sb.append(',');
            sb.append(this.d2.e());
            sb.append('>');
        }
        return sb.toString();
    }

    /* renamed from: g0 */
    public MapLikeType X(Object obj) {
        return new MapLikeType(this.c, this.b2, this.Z1, this.a2, this.c2, this.d2.b0(obj), this.q, this.x, this.y);
    }

    /* renamed from: h0 */
    public MapLikeType Y(Object obj) {
        return new MapLikeType(this.c, this.b2, this.Z1, this.a2, this.c2, this.d2.c0(obj), this.q, this.x, this.y);
    }

    public MapLikeType i0(JavaType javaType) {
        if (javaType == this.c2) {
            return this;
        }
        return new MapLikeType(this.c, this.b2, this.Z1, this.a2, javaType, this.d2, this.q, this.x, this.y);
    }

    public MapLikeType j0(Object obj) {
        return new MapLikeType(this.c, this.b2, this.Z1, this.a2, this.c2.c0(obj), this.d2, this.q, this.x, this.y);
    }

    /* renamed from: k0 */
    public MapLikeType a0() {
        if (this.y) {
            return this;
        }
        return new MapLikeType(this.c, this.b2, this.Z1, this.a2, this.c2, this.d2.a0(), this.q, this.x, true);
    }

    public JavaType l() {
        return this.d2;
    }

    /* renamed from: l0 */
    public MapLikeType b0(Object obj) {
        return new MapLikeType(this.c, this.b2, this.Z1, this.a2, this.c2, this.d2, this.q, obj, this.y);
    }

    public StringBuilder m(StringBuilder sb) {
        TypeBase.d0(this.c, sb, true);
        return sb;
    }

    /* renamed from: m0 */
    public MapLikeType c0(Object obj) {
        return new MapLikeType(this.c, this.b2, this.Z1, this.a2, this.c2, this.d2, obj, this.x, this.y);
    }

    public StringBuilder n(StringBuilder sb) {
        TypeBase.d0(this.c, sb, false);
        sb.append('<');
        this.c2.n(sb);
        this.d2.n(sb);
        sb.append(">;");
        return sb;
    }

    public JavaType q() {
        return this.c2;
    }

    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", new Object[]{this.c.getName(), this.c2, this.d2});
    }

    public boolean z() {
        return super.z() || this.d2.z() || this.c2.z();
    }
}
