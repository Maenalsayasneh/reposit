package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import i0.f.a.c.r.d;
import i0.f.a.c.r.k.b;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public abstract class ReferenceTypeSerializer<T> extends StdSerializer<T> implements d {
    public static final Object q = JsonInclude.Include.NON_EMPTY;
    public final e Y1;
    public final g<Object> Z1;
    public final NameTransformer a2;
    public transient b b2;
    public final Object c2;
    public final boolean d2;
    public final JavaType x;
    public final BeanProperty y;

    public ReferenceTypeSerializer(ReferenceType referenceType, e eVar, g gVar) {
        super((JavaType) referenceType);
        this.x = referenceType.c2;
        this.y = null;
        this.Y1 = eVar;
        this.Z1 = gVar;
        this.a2 = null;
        this.c2 = null;
        this.d2 = false;
        this.b2 = b.C0122b.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005d, code lost:
        if (r5 == com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.DYNAMIC) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.g<?> a(i0.f.a.c.i r8, com.fasterxml.jackson.databind.BeanProperty r9) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r7 = this;
            i0.f.a.c.p.e r0 = r7.Y1
            if (r0 == 0) goto L_0x0008
            i0.f.a.c.p.e r0 = r0.a(r9)
        L_0x0008:
            r1 = 0
            if (r9 == 0) goto L_0x0020
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r9.a()
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r8.O()
            if (r2 == 0) goto L_0x0020
            java.lang.Object r3 = r3.d(r2)
            if (r3 == 0) goto L_0x0020
            i0.f.a.c.g r2 = r8.c0(r2, r3)
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0073
            i0.f.a.c.g<java.lang.Object> r2 = r7.Z1
            if (r2 != 0) goto L_0x006f
            com.fasterxml.jackson.databind.JavaType r5 = r7.x
            boolean r6 = r5.N()
            if (r6 == 0) goto L_0x0033
        L_0x0031:
            r5 = r3
            goto L_0x0066
        L_0x0033:
            boolean r6 = r5.J()
            if (r6 == 0) goto L_0x003b
        L_0x0039:
            r5 = r4
            goto L_0x0066
        L_0x003b:
            boolean r5 = r5.y
            if (r5 == 0) goto L_0x0040
            goto L_0x0039
        L_0x0040:
            com.fasterxml.jackson.databind.AnnotationIntrospector r5 = r8.O()
            if (r5 == 0) goto L_0x0060
            if (r9 == 0) goto L_0x0060
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r6 = r9.a()
            if (r6 == 0) goto L_0x0060
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r6 = r9.a()
            com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing r5 = r5.g0(r6)
            com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing r6 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.STATIC
            if (r5 != r6) goto L_0x005b
            goto L_0x0039
        L_0x005b:
            com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing r6 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.DYNAMIC
            if (r5 != r6) goto L_0x0060
            goto L_0x0031
        L_0x0060:
            com.fasterxml.jackson.databind.MapperFeature r5 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING
            boolean r5 = r8.X(r5)
        L_0x0066:
            if (r5 == 0) goto L_0x0073
            com.fasterxml.jackson.databind.JavaType r2 = r7.x
            i0.f.a.c.g r2 = r8.G(r2, r9)
            goto L_0x0073
        L_0x006f:
            i0.f.a.c.g r2 = r8.T(r2, r9)
        L_0x0073:
            com.fasterxml.jackson.databind.BeanProperty r5 = r7.y
            if (r5 != r9) goto L_0x0081
            i0.f.a.c.p.e r5 = r7.Y1
            if (r5 != r0) goto L_0x0081
            i0.f.a.c.g<java.lang.Object> r5 = r7.Z1
            if (r5 != r2) goto L_0x0081
            r0 = r7
            goto L_0x0087
        L_0x0081:
            com.fasterxml.jackson.databind.util.NameTransformer r5 = r7.a2
            com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer r0 = r7.x(r9, r0, r2, r5)
        L_0x0087:
            if (r9 == 0) goto L_0x00ed
            com.fasterxml.jackson.databind.SerializationConfig r2 = r8.q
            java.lang.Class<T> r5 = r7.d
            com.fasterxml.jackson.annotation.JsonInclude$Value r9 = r9.g(r2, r5)
            if (r9 == 0) goto L_0x00ed
            com.fasterxml.jackson.annotation.JsonInclude$Include r2 = r9.q
            com.fasterxml.jackson.annotation.JsonInclude$Include r5 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS
            if (r2 == r5) goto L_0x00ed
            int r2 = r2.ordinal()
            if (r2 == r4) goto L_0x00d0
            r5 = 2
            if (r2 == r5) goto L_0x00d5
            r5 = 3
            if (r2 == r5) goto L_0x00d2
            r5 = 4
            if (r2 == r5) goto L_0x00ba
            r5 = 5
            if (r2 == r5) goto L_0x00ac
            goto L_0x00e1
        L_0x00ac:
            java.lang.Class<?> r9 = r9.y
            java.lang.Object r1 = r8.V(r1, r9)
            if (r1 != 0) goto L_0x00b5
            goto L_0x00d0
        L_0x00b5:
            boolean r3 = r8.W(r1)
            goto L_0x00e1
        L_0x00ba:
            com.fasterxml.jackson.databind.JavaType r8 = r7.x
            java.lang.Object r1 = h0.b0.v.k0(r8)
            if (r1 == 0) goto L_0x00d0
            java.lang.Class r8 = r1.getClass()
            boolean r8 = r8.isArray()
            if (r8 == 0) goto L_0x00d0
            java.lang.Object r1 = i0.f.a.c.t.b.a(r1)
        L_0x00d0:
            r3 = r4
            goto L_0x00e1
        L_0x00d2:
            java.lang.Object r1 = q
            goto L_0x00d0
        L_0x00d5:
            com.fasterxml.jackson.databind.JavaType r8 = r7.x
            boolean r8 = r8.d()
            if (r8 == 0) goto L_0x00d0
            java.lang.Object r8 = q
            r1 = r8
            goto L_0x00d0
        L_0x00e1:
            java.lang.Object r8 = r7.c2
            if (r8 != r1) goto L_0x00e9
            boolean r8 = r7.d2
            if (r8 == r3) goto L_0x00ed
        L_0x00e9:
            com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer r0 = r0.w(r1, r3)
        L_0x00ed:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer.a(i0.f.a.c.i, com.fasterxml.jackson.databind.BeanProperty):i0.f.a.c.g");
    }

    public boolean d(i iVar, T t) {
        AtomicReference atomicReference = (AtomicReference) t;
        if (!(atomicReference.get() != null)) {
            return true;
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            return this.d2;
        }
        if (this.c2 == null) {
            return false;
        }
        g<Object> gVar = this.Z1;
        if (gVar == null) {
            try {
                gVar = v(iVar, obj.getClass());
            } catch (JsonMappingException e) {
                throw new RuntimeJsonMappingException(e);
            }
        }
        Object obj2 = this.c2;
        if (obj2 == q) {
            return gVar.d(iVar, obj);
        }
        return obj2.equals(obj);
    }

    public boolean e() {
        return this.a2 != null;
    }

    public void f(T t, JsonGenerator jsonGenerator, i iVar) throws IOException {
        Object obj = ((AtomicReference) t).get();
        if (obj != null) {
            g<Object> gVar = this.Z1;
            if (gVar == null) {
                gVar = v(iVar, obj.getClass());
            }
            e eVar = this.Y1;
            if (eVar != null) {
                gVar.g(obj, jsonGenerator, iVar, eVar);
            } else {
                gVar.f(obj, jsonGenerator, iVar);
            }
        } else if (this.a2 == null) {
            iVar.z(jsonGenerator);
        }
    }

    public void g(T t, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        Object obj = ((AtomicReference) t).get();
        if (obj != null) {
            g<Object> gVar = this.Z1;
            if (gVar == null) {
                gVar = v(iVar, obj.getClass());
            }
            gVar.g(obj, jsonGenerator, iVar, eVar);
        } else if (this.a2 == null) {
            iVar.z(jsonGenerator);
        }
    }

    public g<T> h(NameTransformer nameTransformer) {
        g<Object> gVar = this.Z1;
        if (gVar != null && (gVar = gVar.h(nameTransformer)) == this.Z1) {
            return this;
        }
        NameTransformer nameTransformer2 = this.a2;
        if (nameTransformer2 != null) {
            NameTransformer nameTransformer3 = NameTransformer.c;
            nameTransformer = new NameTransformer.Chained(nameTransformer, nameTransformer2);
        }
        if (this.Z1 == gVar && this.a2 == nameTransformer) {
            return this;
        }
        return x(this.y, this.Y1, gVar, nameTransformer);
    }

    public final g<Object> v(i iVar, Class<?> cls) throws JsonMappingException {
        g<Object> gVar;
        g<Object> c = this.b2.c(cls);
        if (c != null) {
            return c;
        }
        if (this.x.y()) {
            gVar = iVar.G(iVar.y(this.x, cls), this.y);
        } else {
            gVar = iVar.H(cls, this.y);
        }
        NameTransformer nameTransformer = this.a2;
        if (nameTransformer != null) {
            gVar = gVar.h(nameTransformer);
        }
        g<Object> gVar2 = gVar;
        this.b2 = this.b2.b(cls, gVar2);
        return gVar2;
    }

    public abstract ReferenceTypeSerializer<T> w(Object obj, boolean z);

    public abstract ReferenceTypeSerializer<T> x(BeanProperty beanProperty, e eVar, g<?> gVar, NameTransformer nameTransformer);

    public ReferenceTypeSerializer(ReferenceTypeSerializer<?> referenceTypeSerializer, BeanProperty beanProperty, e eVar, g<?> gVar, NameTransformer nameTransformer, Object obj, boolean z) {
        super((StdSerializer<?>) referenceTypeSerializer);
        this.x = referenceTypeSerializer.x;
        this.b2 = b.C0122b.b;
        this.y = beanProperty;
        this.Y1 = eVar;
        this.Z1 = gVar;
        this.a2 = nameTransformer;
        this.c2 = obj;
        this.d2 = z;
    }
}
