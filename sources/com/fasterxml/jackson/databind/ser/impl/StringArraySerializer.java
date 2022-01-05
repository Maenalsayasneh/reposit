package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.p.e;
import i0.f.a.c.r.d;
import java.io.IOException;

@a
public class StringArraySerializer extends ArraySerializerBase<String[]> implements d {
    public static final StringArraySerializer y = new StringArraySerializer();
    public final g<Object> Y1;

    static {
        TypeFactory.d.q(String.class);
    }

    public StringArraySerializer() {
        super(String[].class);
        this.Y1 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.g<?> a(i0.f.a.c.i r5, com.fasterxml.jackson.databind.BeanProperty r6) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0018
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r5.O()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r6.a()
            if (r2 == 0) goto L_0x0018
            java.lang.Object r1 = r1.d(r2)
            if (r1 == 0) goto L_0x0018
            i0.f.a.c.g r1 = r5.c0(r2, r1)
            goto L_0x0019
        L_0x0018:
            r1 = r0
        L_0x0019:
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            com.fasterxml.jackson.annotation.JsonFormat$Feature r3 = com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = r4.m(r5, r6, r2)
            if (r2 == 0) goto L_0x0028
            java.lang.Boolean r2 = r2.b(r3)
            goto L_0x0029
        L_0x0028:
            r2 = r0
        L_0x0029:
            if (r1 != 0) goto L_0x002d
            i0.f.a.c.g<java.lang.Object> r1 = r4.Y1
        L_0x002d:
            i0.f.a.c.g r1 = r4.l(r5, r6, r1)
            if (r1 != 0) goto L_0x0039
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            i0.f.a.c.g r1 = r5.C(r1, r6)
        L_0x0039:
            boolean r5 = i0.f.a.c.t.f.y(r1)
            if (r5 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r0 = r1
        L_0x0041:
            i0.f.a.c.g<java.lang.Object> r5 = r4.Y1
            if (r0 != r5) goto L_0x004e
            java.lang.Boolean r5 = r4.x
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L_0x004e
            return r4
        L_0x004e:
            com.fasterxml.jackson.databind.ser.impl.StringArraySerializer r5 = new com.fasterxml.jackson.databind.ser.impl.StringArraySerializer
            r5.<init>(r4, r6, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.StringArraySerializer.a(i0.f.a.c.i, com.fasterxml.jackson.databind.BeanProperty):i0.f.a.c.g");
    }

    public boolean d(i iVar, Object obj) {
        return ((String[]) obj).length == 0;
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        String[] strArr = (String[]) obj;
        int length = strArr.length;
        if (length != 1 || ((this.x != null || !iVar.Y(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.x != Boolean.TRUE)) {
            jsonGenerator.L0(strArr, length);
            y(strArr, jsonGenerator, iVar);
            jsonGenerator.T();
            return;
        }
        y(strArr, jsonGenerator, iVar);
    }

    public ContainerSerializer<?> v(e eVar) {
        return this;
    }

    public g<?> x(BeanProperty beanProperty, Boolean bool) {
        return new StringArraySerializer(this, beanProperty, this.Y1, bool);
    }

    /* renamed from: z */
    public void y(String[] strArr, JsonGenerator jsonGenerator, i iVar) throws IOException {
        int length = strArr.length;
        if (length != 0) {
            g<Object> gVar = this.Y1;
            int i = 0;
            if (gVar != null) {
                int length2 = strArr.length;
                while (i < length2) {
                    if (strArr[i] == null) {
                        iVar.z(jsonGenerator);
                    } else {
                        gVar.f(strArr[i], jsonGenerator, iVar);
                    }
                    i++;
                }
                return;
            }
            while (i < length) {
                if (strArr[i] == null) {
                    jsonGenerator.c0();
                } else {
                    jsonGenerator.Q0(strArr[i]);
                }
                i++;
            }
        }
    }

    public StringArraySerializer(StringArraySerializer stringArraySerializer, BeanProperty beanProperty, g<?> gVar, Boolean bool) {
        super(stringArraySerializer, beanProperty, bool);
        this.Y1 = gVar;
    }
}
