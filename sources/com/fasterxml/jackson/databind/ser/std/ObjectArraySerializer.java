package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.p.e;
import i0.f.a.c.r.d;
import i0.f.a.c.r.k.b;
import java.io.IOException;

@a
public class ObjectArraySerializer extends ArraySerializerBase<Object[]> implements d {
    public final JavaType Y1;
    public final e Z1;
    public g<Object> a2;
    public b b2 = b.C0122b.b;
    public final boolean y;

    public ObjectArraySerializer(JavaType javaType, boolean z, e eVar, g<Object> gVar) {
        super(Object[].class);
        this.Y1 = javaType;
        this.y = z;
        this.Z1 = eVar;
        this.a2 = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        r1 = r7.Y1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.g<?> a(i0.f.a.c.i r8, com.fasterxml.jackson.databind.BeanProperty r9) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r7 = this;
            i0.f.a.c.p.e r0 = r7.Z1
            if (r0 == 0) goto L_0x0008
            i0.f.a.c.p.e r0 = r0.a(r9)
        L_0x0008:
            r4 = r0
            r0 = 0
            if (r9 == 0) goto L_0x0021
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r1 = r9.a()
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r8.O()
            if (r1 == 0) goto L_0x0021
            java.lang.Object r2 = r2.d(r1)
            if (r2 == 0) goto L_0x0021
            i0.f.a.c.g r1 = r8.c0(r1, r2)
            goto L_0x0022
        L_0x0021:
            r1 = r0
        L_0x0022:
            java.lang.Class<T> r2 = r7.d
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = r7.m(r8, r9, r2)
            if (r2 == 0) goto L_0x0030
            com.fasterxml.jackson.annotation.JsonFormat$Feature r0 = com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r0 = r2.b(r0)
        L_0x0030:
            r6 = r0
            if (r1 != 0) goto L_0x0035
            i0.f.a.c.g<java.lang.Object> r1 = r7.a2
        L_0x0035:
            i0.f.a.c.g r0 = r7.l(r8, r9, r1)
            if (r0 != 0) goto L_0x0051
            com.fasterxml.jackson.databind.JavaType r1 = r7.Y1
            if (r1 == 0) goto L_0x0051
            boolean r2 = r7.y
            if (r2 == 0) goto L_0x0051
            boolean r1 = r1.N()
            if (r1 != 0) goto L_0x0051
            com.fasterxml.jackson.databind.JavaType r0 = r7.Y1
            i0.f.a.c.g r8 = r8.A(r0, r9)
            r5 = r8
            goto L_0x0052
        L_0x0051:
            r5 = r0
        L_0x0052:
            com.fasterxml.jackson.databind.BeanProperty r8 = r7.q
            if (r8 != r9) goto L_0x0068
            i0.f.a.c.g<java.lang.Object> r8 = r7.a2
            if (r5 != r8) goto L_0x0068
            i0.f.a.c.p.e r8 = r7.Z1
            if (r8 != r4) goto L_0x0068
            java.lang.Boolean r8 = r7.x
            boolean r8 = java.util.Objects.equals(r8, r6)
            if (r8 == 0) goto L_0x0068
            r8 = r7
            goto L_0x0070
        L_0x0068:
            com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer r8 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer
            r1 = r8
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0070:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer.a(i0.f.a.c.i, com.fasterxml.jackson.databind.BeanProperty):i0.f.a.c.g");
    }

    public boolean d(i iVar, Object obj) {
        return ((Object[]) obj).length == 0;
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length != 1 || ((this.x != null || !iVar.Y(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.x != Boolean.TRUE)) {
            jsonGenerator.L0(objArr, length);
            y(objArr, jsonGenerator, iVar);
            jsonGenerator.T();
            return;
        }
        y(objArr, jsonGenerator, iVar);
    }

    public ContainerSerializer<?> v(e eVar) {
        return new ObjectArraySerializer(this.Y1, this.y, eVar, this.a2);
    }

    public g<?> x(BeanProperty beanProperty, Boolean bool) {
        return new ObjectArraySerializer(this, beanProperty, this.Z1, this.a2, bool);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0046, code lost:
        r7 = r11.C(r6, r8.q);
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void y(java.lang.Object[] r9, com.fasterxml.jackson.core.JsonGenerator r10, i0.f.a.c.i r11) throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r9.length
            if (r0 != 0) goto L_0x0004
            return
        L_0x0004:
            i0.f.a.c.g<java.lang.Object> r1 = r8.a2
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x002a
            int r0 = r9.length
            i0.f.a.c.p.e r4 = r8.Z1
            r5 = r3
        L_0x000e:
            if (r2 >= r0) goto L_0x0029
            r5 = r9[r2]     // Catch:{ Exception -> 0x0024 }
            if (r5 != 0) goto L_0x0018
            r11.z(r10)     // Catch:{ Exception -> 0x0024 }
            goto L_0x0021
        L_0x0018:
            if (r4 != 0) goto L_0x001e
            r1.f(r5, r10, r11)     // Catch:{ Exception -> 0x0024 }
            goto L_0x0021
        L_0x001e:
            r1.g(r5, r10, r11, r4)     // Catch:{ Exception -> 0x0024 }
        L_0x0021:
            int r2 = r2 + 1
            goto L_0x000e
        L_0x0024:
            r9 = move-exception
            r8.p(r11, r9, r5, r2)
            throw r3
        L_0x0029:
            return
        L_0x002a:
            i0.f.a.c.p.e r1 = r8.Z1
            if (r1 == 0) goto L_0x0063
            int r0 = r9.length
            i0.f.a.c.r.k.b r4 = r8.b2     // Catch:{ Exception -> 0x005d }
            r5 = r3
        L_0x0032:
            if (r2 >= r0) goto L_0x005c
            r5 = r9[r2]     // Catch:{ Exception -> 0x005a }
            if (r5 != 0) goto L_0x003c
            r11.z(r10)     // Catch:{ Exception -> 0x005a }
            goto L_0x0057
        L_0x003c:
            java.lang.Class r6 = r5.getClass()     // Catch:{ Exception -> 0x005a }
            i0.f.a.c.g r7 = r4.c(r6)     // Catch:{ Exception -> 0x005a }
            if (r7 != 0) goto L_0x0054
            com.fasterxml.jackson.databind.BeanProperty r7 = r8.q     // Catch:{ Exception -> 0x005a }
            i0.f.a.c.g r7 = r11.C(r6, r7)     // Catch:{ Exception -> 0x005a }
            i0.f.a.c.r.k.b r6 = r4.b(r6, r7)     // Catch:{ Exception -> 0x005a }
            if (r4 == r6) goto L_0x0054
            r8.b2 = r6     // Catch:{ Exception -> 0x005a }
        L_0x0054:
            r7.g(r5, r10, r11, r1)     // Catch:{ Exception -> 0x005a }
        L_0x0057:
            int r2 = r2 + 1
            goto L_0x0032
        L_0x005a:
            r9 = move-exception
            goto L_0x005f
        L_0x005c:
            return
        L_0x005d:
            r9 = move-exception
            r5 = r3
        L_0x005f:
            r8.p(r11, r9, r5, r2)
            throw r3
        L_0x0063:
            i0.f.a.c.r.k.b r1 = r8.b2     // Catch:{ Exception -> 0x00ae }
            r4 = r3
        L_0x0066:
            if (r2 >= r0) goto L_0x00ad
            r4 = r9[r2]     // Catch:{ Exception -> 0x00ab }
            if (r4 != 0) goto L_0x0070
            r11.z(r10)     // Catch:{ Exception -> 0x00ab }
            goto L_0x00a8
        L_0x0070:
            java.lang.Class r5 = r4.getClass()     // Catch:{ Exception -> 0x00ab }
            i0.f.a.c.g r6 = r1.c(r5)     // Catch:{ Exception -> 0x00ab }
            if (r6 != 0) goto L_0x00a5
            com.fasterxml.jackson.databind.JavaType r6 = r8.Y1     // Catch:{ Exception -> 0x00ab }
            boolean r6 = r6.y()     // Catch:{ Exception -> 0x00ab }
            if (r6 == 0) goto L_0x0097
            com.fasterxml.jackson.databind.JavaType r6 = r8.Y1     // Catch:{ Exception -> 0x00ab }
            com.fasterxml.jackson.databind.JavaType r5 = r11.y(r6, r5)     // Catch:{ Exception -> 0x00ab }
            com.fasterxml.jackson.databind.BeanProperty r6 = r8.q     // Catch:{ Exception -> 0x00ab }
            i0.f.a.c.r.k.b$d r5 = r1.a(r5, r11, r6)     // Catch:{ Exception -> 0x00ab }
            i0.f.a.c.r.k.b r6 = r5.b     // Catch:{ Exception -> 0x00ab }
            if (r1 == r6) goto L_0x0094
            r8.b2 = r6     // Catch:{ Exception -> 0x00ab }
        L_0x0094:
            i0.f.a.c.g<java.lang.Object> r6 = r5.a     // Catch:{ Exception -> 0x00ab }
            goto L_0x00a5
        L_0x0097:
            com.fasterxml.jackson.databind.BeanProperty r6 = r8.q     // Catch:{ Exception -> 0x00ab }
            i0.f.a.c.g r6 = r11.C(r5, r6)     // Catch:{ Exception -> 0x00ab }
            i0.f.a.c.r.k.b r5 = r1.b(r5, r6)     // Catch:{ Exception -> 0x00ab }
            if (r1 == r5) goto L_0x00a5
            r8.b2 = r5     // Catch:{ Exception -> 0x00ab }
        L_0x00a5:
            r6.f(r4, r10, r11)     // Catch:{ Exception -> 0x00ab }
        L_0x00a8:
            int r2 = r2 + 1
            goto L_0x0066
        L_0x00ab:
            r9 = move-exception
            goto L_0x00b0
        L_0x00ad:
            return
        L_0x00ae:
            r9 = move-exception
            r4 = r3
        L_0x00b0:
            r8.p(r11, r9, r4, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer.y(java.lang.Object[], com.fasterxml.jackson.core.JsonGenerator, i0.f.a.c.i):void");
    }

    public ObjectArraySerializer(ObjectArraySerializer objectArraySerializer, BeanProperty beanProperty, e eVar, g<?> gVar, Boolean bool) {
        super(objectArraySerializer, beanProperty, bool);
        this.Y1 = objectArraySerializer.Y1;
        this.Z1 = eVar;
        this.y = objectArraySerializer.y;
        this.a2 = gVar;
    }
}
