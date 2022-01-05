package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import i0.d.a.a.a;

public final class MapType extends MapLikeType {
    public MapType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, javaType2, javaType3, obj, obj2, z);
    }

    public static MapType n0(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3) {
        return new MapType(cls, typeBindings, javaType, javaTypeArr, javaType2, javaType3, (Object) null, (Object) null, false);
    }

    public JavaType V(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new MapType(cls, typeBindings, javaType, javaTypeArr, this.c2, this.d2, this.q, this.x, this.y);
    }

    public JavaType W(JavaType javaType) {
        if (this.d2 == javaType) {
            return this;
        }
        return new MapType(this.c, this.b2, this.Z1, this.a2, this.c2, javaType, this.q, this.x, this.y);
    }

    public MapLikeType i0(JavaType javaType) {
        if (javaType == this.c2) {
            return this;
        }
        return new MapType(this.c, this.b2, this.Z1, this.a2, javaType, this.d2, this.q, this.x, this.y);
    }

    public MapLikeType j0(Object obj) {
        return new MapType(this.c, this.b2, this.Z1, this.a2, this.c2.c0(obj), this.d2, this.q, this.x, this.y);
    }

    /* renamed from: o0 */
    public MapType g0(Object obj) {
        return new MapType(this.c, this.b2, this.Z1, this.a2, this.c2, this.d2.b0(obj), this.q, this.x, this.y);
    }

    /* renamed from: p0 */
    public MapType h0(Object obj) {
        return new MapType(this.c, this.b2, this.Z1, this.a2, this.c2, this.d2.c0(obj), this.q, this.x, this.y);
    }

    /* renamed from: q0 */
    public MapType k0() {
        if (this.y) {
            return this;
        }
        return new MapType(this.c, this.b2, this.Z1, this.a2, this.c2.a0(), this.d2.a0(), this.q, this.x, true);
    }

    /* renamed from: r0 */
    public MapType l0(Object obj) {
        return new MapType(this.c, this.b2, this.Z1, this.a2, this.c2, this.d2, this.q, obj, this.y);
    }

    /* renamed from: s0 */
    public MapType m0(Object obj) {
        return new MapType(this.c, this.b2, this.Z1, this.a2, this.c2, this.d2, obj, this.x, this.y);
    }

    public String toString() {
        StringBuilder P0 = a.P0("[map type; class ");
        a.p(this.c, P0, ", ");
        P0.append(this.c2);
        P0.append(" -> ");
        P0.append(this.d2);
        P0.append("]");
        return P0.toString();
    }
}
