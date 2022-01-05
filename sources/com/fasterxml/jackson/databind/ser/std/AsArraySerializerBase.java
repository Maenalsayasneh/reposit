package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import i0.f.a.c.r.d;
import i0.f.a.c.r.k.b;
import java.io.IOException;

public abstract class AsArraySerializerBase<T> extends ContainerSerializer<T> implements d {
    public final Boolean Y1;
    public final e Z1;
    public final g<Object> a2;
    public b b2;
    public final JavaType q;
    public final BeanProperty x;
    public final boolean y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsArraySerializerBase(Class<?> cls, JavaType javaType, boolean z, e eVar, g<Object> gVar) {
        super(cls, false);
        boolean z2 = false;
        this.q = javaType;
        if (z || (javaType != null && javaType.J())) {
            z2 = true;
        }
        this.y = z2;
        this.Z1 = eVar;
        this.x = null;
        this.a2 = gVar;
        this.b2 = b.C0122b.b;
        this.Y1 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.g<?> a(i0.f.a.c.i r6, com.fasterxml.jackson.databind.BeanProperty r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            i0.f.a.c.p.e r0 = r5.Z1
            if (r0 == 0) goto L_0x0008
            i0.f.a.c.p.e r0 = r0.a(r7)
        L_0x0008:
            r1 = 0
            if (r7 == 0) goto L_0x0020
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r6.O()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r3 = r7.a()
            if (r3 == 0) goto L_0x0020
            java.lang.Object r2 = r2.d(r3)
            if (r2 == 0) goto L_0x0020
            i0.f.a.c.g r2 = r6.c0(r3, r2)
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            java.lang.Class<T> r3 = r5.d
            com.fasterxml.jackson.annotation.JsonFormat$Value r3 = r5.m(r6, r7, r3)
            if (r3 == 0) goto L_0x002f
            com.fasterxml.jackson.annotation.JsonFormat$Feature r1 = com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r1 = r3.b(r1)
        L_0x002f:
            if (r2 != 0) goto L_0x0033
            i0.f.a.c.g<java.lang.Object> r2 = r5.a2
        L_0x0033:
            i0.f.a.c.g r2 = r5.l(r6, r7, r2)
            if (r2 != 0) goto L_0x004d
            com.fasterxml.jackson.databind.JavaType r3 = r5.q
            if (r3 == 0) goto L_0x004d
            boolean r4 = r5.y
            if (r4 == 0) goto L_0x004d
            boolean r3 = r3.N()
            if (r3 != 0) goto L_0x004d
            com.fasterxml.jackson.databind.JavaType r2 = r5.q
            i0.f.a.c.g r2 = r6.A(r2, r7)
        L_0x004d:
            i0.f.a.c.g<java.lang.Object> r6 = r5.a2
            if (r2 != r6) goto L_0x0063
            com.fasterxml.jackson.databind.BeanProperty r6 = r5.x
            if (r7 != r6) goto L_0x0063
            i0.f.a.c.p.e r6 = r5.Z1
            if (r6 != r0) goto L_0x0063
            java.lang.Boolean r6 = r5.Y1
            boolean r6 = java.util.Objects.equals(r6, r1)
            if (r6 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            return r5
        L_0x0063:
            com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase r6 = r5.y(r7, r0, r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase.a(i0.f.a.c.i, com.fasterxml.jackson.databind.BeanProperty):i0.f.a.c.g");
    }

    public void g(T t, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        WritableTypeId e = eVar.e(jsonGenerator, eVar.d(t, JsonToken.START_ARRAY));
        jsonGenerator.w(t);
        x(t, jsonGenerator, iVar);
        eVar.f(jsonGenerator, e);
    }

    public final g<Object> w(b bVar, Class<?> cls, i iVar) throws JsonMappingException {
        g<Object> C = iVar.C(cls, this.x);
        b b = bVar.b(cls, C);
        if (bVar != b) {
            this.b2 = b;
        }
        return C;
    }

    public abstract void x(T t, JsonGenerator jsonGenerator, i iVar) throws IOException;

    public abstract AsArraySerializerBase<T> y(BeanProperty beanProperty, e eVar, g<?> gVar, Boolean bool);

    public AsArraySerializerBase(AsArraySerializerBase<?> asArraySerializerBase, BeanProperty beanProperty, e eVar, g<?> gVar, Boolean bool) {
        super((ContainerSerializer<?>) asArraySerializerBase);
        this.q = asArraySerializerBase.q;
        this.y = asArraySerializerBase.y;
        this.Z1 = eVar;
        this.x = beanProperty;
        this.a2 = gVar;
        this.b2 = b.C0122b.b;
        this.Y1 = bool;
    }
}
