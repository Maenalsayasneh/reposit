package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import i0.d.a.a.a;

public final class CollectionType extends CollectionLikeType {
    public CollectionType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, javaType2, obj, obj2, z);
    }

    public JavaType V(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new CollectionType(cls, typeBindings, javaType, javaTypeArr, this.c2, this.q, this.x, this.y);
    }

    public JavaType W(JavaType javaType) {
        if (this.c2 == javaType) {
            return this;
        }
        return new CollectionType(this.c, this.b2, this.Z1, this.a2, javaType, this.q, this.x, this.y);
    }

    /* renamed from: l0 */
    public CollectionType g0(Object obj) {
        return new CollectionType(this.c, this.b2, this.Z1, this.a2, this.c2.b0(obj), this.q, this.x, this.y);
    }

    /* renamed from: m0 */
    public CollectionType h0(Object obj) {
        return new CollectionType(this.c, this.b2, this.Z1, this.a2, this.c2.c0(obj), this.q, this.x, this.y);
    }

    /* renamed from: n0 */
    public CollectionType i0() {
        if (this.y) {
            return this;
        }
        return new CollectionType(this.c, this.b2, this.Z1, this.a2, this.c2.a0(), this.q, this.x, true);
    }

    /* renamed from: o0 */
    public CollectionType j0(Object obj) {
        return new CollectionType(this.c, this.b2, this.Z1, this.a2, this.c2, this.q, obj, this.y);
    }

    /* renamed from: p0 */
    public CollectionType k0(Object obj) {
        return new CollectionType(this.c, this.b2, this.Z1, this.a2, this.c2, obj, this.x, this.y);
    }

    public String toString() {
        StringBuilder P0 = a.P0("[collection type; class ");
        a.p(this.c, P0, ", contains ");
        P0.append(this.c2);
        P0.append("]");
        return P0.toString();
    }
}
