package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import i0.f.a.c.r.a;
import i0.f.a.c.r.b;
import i0.f.a.c.r.d;
import i0.f.a.c.r.g;
import java.io.Closeable;
import java.io.IOException;
import java.util.Objects;
import java.util.Set;

public abstract class BeanSerializerBase extends StdSerializer<Object> implements d, g {
    public static final BeanPropertyWriter[] q = new BeanPropertyWriter[0];
    public final BeanPropertyWriter[] Y1;
    public final a Z1;
    public final Object a2;
    public final AnnotatedMember b2;
    public final i0.f.a.c.r.k.a c2;
    public final JsonFormat.Shape d2;
    public final JavaType x;
    public final BeanPropertyWriter[] y;

    static {
        new PropertyName("#object-ref");
    }

    public BeanSerializerBase(JavaType javaType, b bVar, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType);
        this.x = javaType;
        this.y = beanPropertyWriterArr;
        this.Y1 = beanPropertyWriterArr2;
        if (bVar == null) {
            this.b2 = null;
            this.Z1 = null;
            this.a2 = null;
            this.c2 = null;
            this.d2 = null;
            return;
        }
        this.b2 = bVar.h;
        this.Z1 = bVar.f;
        this.a2 = bVar.g;
        this.c2 = bVar.i;
        this.d2 = bVar.b.b((JsonFormat.Value) null).q;
    }

    public static final BeanPropertyWriter[] z(BeanPropertyWriter[] beanPropertyWriterArr, NameTransformer nameTransformer) {
        if (beanPropertyWriterArr == null || beanPropertyWriterArr.length == 0 || nameTransformer == null || nameTransformer == NameTransformer.c) {
            return beanPropertyWriterArr;
        }
        int length = beanPropertyWriterArr.length;
        BeanPropertyWriter[] beanPropertyWriterArr2 = new BeanPropertyWriter[length];
        for (int i = 0; i < length; i++) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
            if (beanPropertyWriter != null) {
                beanPropertyWriterArr2[i] = beanPropertyWriter.l(nameTransformer);
            }
        }
        return beanPropertyWriterArr2;
    }

    public void A(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        String str = "[anySetter]";
        BeanPropertyWriter[] beanPropertyWriterArr = this.Y1;
        if (beanPropertyWriterArr == null || iVar.x == null) {
            beanPropertyWriterArr = this.y;
        }
        try {
            for (BeanPropertyWriter beanPropertyWriter : beanPropertyWriterArr) {
                if (beanPropertyWriter != null) {
                    beanPropertyWriter.n(obj, jsonGenerator, iVar);
                }
            }
            a aVar = this.Z1;
            if (aVar != null) {
                aVar.a(obj, jsonGenerator, iVar);
            }
        } catch (Exception e) {
            if (0 != beanPropertyWriterArr.length) {
                str = beanPropertyWriterArr[0].x.d;
            }
            q(iVar, e, obj, str);
            throw null;
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException((Closeable) jsonGenerator, "Infinite recursion (StackOverflowError)", (Throwable) e2);
            if (0 != beanPropertyWriterArr.length) {
                str = beanPropertyWriterArr[0].x.d;
            }
            jsonMappingException.f(new JsonMappingException.Reference(obj, str));
            throw jsonMappingException;
        }
    }

    public abstract BeanSerializerBase C(Set<String> set, Set<String> set2);

    public abstract BeanSerializerBase E(Object obj);

    public abstract BeanSerializerBase F(i0.f.a.c.r.k.a aVar);

    public abstract BeanSerializerBase G(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2);

    /* JADX WARNING: type inference failed for: r12v7, types: [com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator, com.fasterxml.jackson.annotation.ObjectIdGenerator] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01df A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.g<?> a(i0.f.a.c.i r21, com.fasterxml.jackson.databind.BeanProperty r22) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r9 = r22
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r21.O()
            r3 = 0
            if (r9 == 0) goto L_0x0015
            if (r2 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r4 = r22.a()
            goto L_0x0016
        L_0x0015:
            r4 = r3
        L_0x0016:
            com.fasterxml.jackson.databind.SerializationConfig r5 = r1.q
            java.lang.Class<T> r6 = r0.d
            com.fasterxml.jackson.annotation.JsonFormat$Value r6 = r0.m(r1, r9, r6)
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x00a9
            com.fasterxml.jackson.annotation.JsonFormat$Shape r10 = r6.q
            com.fasterxml.jackson.annotation.JsonFormat$Shape r11 = com.fasterxml.jackson.annotation.JsonFormat.Shape.ANY
            if (r10 == r11) goto L_0x002a
            r12 = r8
            goto L_0x002b
        L_0x002a:
            r12 = r7
        L_0x002b:
            if (r12 == 0) goto L_0x00a9
            if (r10 == r11) goto L_0x00aa
            com.fasterxml.jackson.annotation.JsonFormat$Shape r11 = r0.d2
            if (r10 == r11) goto L_0x00aa
            com.fasterxml.jackson.databind.JavaType r11 = r0.x
            boolean r11 = r11.I()
            if (r11 == 0) goto L_0x0067
            int r11 = r10.ordinal()
            r12 = 5
            if (r11 == r12) goto L_0x004a
            r12 = 7
            if (r11 == r12) goto L_0x004a
            r12 = 8
            if (r11 == r12) goto L_0x004a
            goto L_0x00aa
        L_0x004a:
            com.fasterxml.jackson.databind.JavaType r2 = r0.x
            r5.m(r2)
            com.fasterxml.jackson.databind.JavaType r2 = r0.x
            java.lang.Class<?> r2 = r2.c
            com.fasterxml.jackson.databind.SerializationConfig r4 = r1.q
            com.fasterxml.jackson.databind.util.EnumValues r4 = com.fasterxml.jackson.databind.util.EnumValues.a(r4, r2)
            java.lang.Boolean r2 = com.fasterxml.jackson.databind.ser.std.EnumSerializer.v(r2, r6, r8, r3)
            com.fasterxml.jackson.databind.ser.std.EnumSerializer r3 = new com.fasterxml.jackson.databind.ser.std.EnumSerializer
            r3.<init>(r4, r2)
            i0.f.a.c.g r1 = r1.T(r3, r9)
            return r1
        L_0x0067:
            com.fasterxml.jackson.annotation.JsonFormat$Shape r6 = com.fasterxml.jackson.annotation.JsonFormat.Shape.NATURAL
            if (r10 != r6) goto L_0x00aa
            com.fasterxml.jackson.databind.JavaType r6 = r0.x
            boolean r6 = r6.O()
            if (r6 == 0) goto L_0x007e
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            java.lang.Class<T> r11 = r0.d
            boolean r6 = r6.isAssignableFrom(r11)
            if (r6 == 0) goto L_0x007e
            goto L_0x00aa
        L_0x007e:
            java.lang.Class<java.util.Map$Entry> r6 = java.util.Map.Entry.class
            java.lang.Class<T> r11 = r0.d
            boolean r6 = r6.isAssignableFrom(r11)
            if (r6 == 0) goto L_0x00aa
            com.fasterxml.jackson.databind.JavaType r2 = r0.x
            java.lang.Class<java.util.Map$Entry> r3 = java.util.Map.Entry.class
            com.fasterxml.jackson.databind.JavaType r2 = r2.i(r3)
            com.fasterxml.jackson.databind.JavaType r4 = r2.h(r7)
            com.fasterxml.jackson.databind.JavaType r5 = r2.h(r8)
            com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer r10 = new com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer
            com.fasterxml.jackson.databind.JavaType r3 = r0.x
            r6 = 0
            r7 = 0
            r2 = r10
            r8 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8)
            i0.f.a.c.g r1 = r1.T(r10, r9)
            return r1
        L_0x00a9:
            r10 = r3
        L_0x00aa:
            i0.f.a.c.r.k.a r6 = r0.c2
            if (r4 == 0) goto L_0x016e
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r11 = r2.T(r5, r4)
            java.util.Set r11 = r11.d()
            com.fasterxml.jackson.annotation.JsonIncludeProperties$Value r5 = r2.W(r5, r4)
            java.util.Set<java.lang.String> r5 = r5.d
            i0.f.a.c.n.n r12 = r2.G(r4)
            if (r12 != 0) goto L_0x00ec
            if (r6 == 0) goto L_0x015a
            i0.f.a.c.n.n r12 = r2.H(r4, r3)
            if (r12 == 0) goto L_0x015a
            i0.f.a.c.r.k.a r6 = r0.c2
            boolean r12 = r12.f
            boolean r13 = r6.e
            if (r12 != r13) goto L_0x00d4
            goto L_0x015a
        L_0x00d4:
            i0.f.a.c.r.k.a r19 = new i0.f.a.c.r.k.a
            com.fasterxml.jackson.databind.JavaType r14 = r6.a
            i0.f.a.b.f r15 = r6.b
            com.fasterxml.jackson.annotation.ObjectIdGenerator<?> r13 = r6.c
            i0.f.a.c.g<java.lang.Object> r6 = r6.d
            r16 = r13
            r13 = r19
            r17 = r6
            r18 = r12
            r13.<init>(r14, r15, r16, r17, r18)
            r6 = r19
            goto L_0x015a
        L_0x00ec:
            i0.f.a.c.n.n r6 = r2.H(r4, r12)
            java.lang.Class<? extends com.fasterxml.jackson.annotation.ObjectIdGenerator<?>> r12 = r6.c
            com.fasterxml.jackson.databind.JavaType r13 = r1.f(r12)
            com.fasterxml.jackson.databind.type.TypeFactory r14 = r21.i()
            java.lang.Class<com.fasterxml.jackson.annotation.ObjectIdGenerator> r15 = com.fasterxml.jackson.annotation.ObjectIdGenerator.class
            com.fasterxml.jackson.databind.JavaType[] r13 = r14.p(r13, r15)
            r13 = r13[r7]
            java.lang.Class<com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator> r14 = com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator.class
            if (r12 != r14) goto L_0x014e
            com.fasterxml.jackson.databind.PropertyName r12 = r6.b
            java.lang.String r12 = r12.q
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r13 = r0.y
            int r13 = r13.length
            r14 = r7
        L_0x010e:
            if (r14 == r13) goto L_0x0130
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r15 = r0.y
            r15 = r15[r14]
            com.fasterxml.jackson.core.io.SerializedString r8 = r15.x
            java.lang.String r8 = r8.d
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L_0x012c
            com.fasterxml.jackson.databind.JavaType r8 = r15.Y1
            com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator r12 = new com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator
            r12.<init>((i0.f.a.c.n.n) r6, (com.fasterxml.jackson.databind.ser.BeanPropertyWriter) r15)
            boolean r6 = r6.f
            i0.f.a.c.r.k.a r6 = i0.f.a.c.r.k.a.a(r8, r3, r12, r6)
            goto L_0x015b
        L_0x012c:
            int r14 = r14 + 1
            r8 = 1
            goto L_0x010e
        L_0x0130:
            com.fasterxml.jackson.databind.JavaType r2 = r0.x
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Class<T> r5 = r0.d
            java.lang.String r5 = i0.f.a.c.t.f.E(r5)
            r4[r7] = r5
            java.lang.String r5 = i0.f.a.c.t.f.D(r12)
            r6 = 1
            r4[r6] = r5
            java.lang.String r5 = "Invalid Object Id definition for %s: cannot find property with name %s"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r1.n(r2, r4)
            throw r3
        L_0x014e:
            com.fasterxml.jackson.annotation.ObjectIdGenerator r8 = r1.l(r4, r6)
            com.fasterxml.jackson.databind.PropertyName r12 = r6.b
            boolean r6 = r6.f
            i0.f.a.c.r.k.a r6 = i0.f.a.c.r.k.a.a(r13, r12, r8, r6)
        L_0x015a:
            r14 = r7
        L_0x015b:
            java.lang.Object r2 = r2.n(r4)
            if (r2 == 0) goto L_0x016c
            java.lang.Object r4 = r0.a2
            if (r4 == 0) goto L_0x0172
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x016c
            goto L_0x0172
        L_0x016c:
            r2 = r3
            goto L_0x0172
        L_0x016e:
            r2 = r3
            r5 = r2
            r11 = r5
            r14 = r7
        L_0x0172:
            if (r14 <= 0) goto L_0x019d
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r4 = r0.y
            int r8 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r8)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r4 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) r4
            r8 = r4[r14]
            r12 = 1
            java.lang.System.arraycopy(r4, r7, r4, r12, r14)
            r4[r7] = r8
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r8 = r0.Y1
            if (r8 != 0) goto L_0x018a
            goto L_0x0198
        L_0x018a:
            int r3 = r8.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r8, r3)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r3 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) r3
            r8 = r3[r14]
            java.lang.System.arraycopy(r3, r7, r3, r12, r14)
            r3[r7] = r8
        L_0x0198:
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase r3 = r0.G(r4, r3)
            goto L_0x019e
        L_0x019d:
            r3 = r0
        L_0x019e:
            if (r6 == 0) goto L_0x01be
            com.fasterxml.jackson.databind.JavaType r4 = r6.a
            i0.f.a.c.g r16 = r1.M(r4, r9)
            i0.f.a.c.r.k.a r1 = new i0.f.a.c.r.k.a
            com.fasterxml.jackson.databind.JavaType r13 = r6.a
            i0.f.a.b.f r14 = r6.b
            com.fasterxml.jackson.annotation.ObjectIdGenerator<?> r15 = r6.c
            boolean r4 = r6.e
            r12 = r1
            r17 = r4
            r12.<init>(r13, r14, r15, r16, r17)
            i0.f.a.c.r.k.a r4 = r0.c2
            if (r1 == r4) goto L_0x01be
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase r3 = r3.F(r1)
        L_0x01be:
            if (r11 == 0) goto L_0x01c6
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x01c8
        L_0x01c6:
            if (r5 == 0) goto L_0x01cc
        L_0x01c8:
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase r3 = r3.C(r11, r5)
        L_0x01cc:
            if (r2 == 0) goto L_0x01d2
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase r3 = r3.E(r2)
        L_0x01d2:
            if (r10 != 0) goto L_0x01d6
            com.fasterxml.jackson.annotation.JsonFormat$Shape r10 = r0.d2
        L_0x01d6:
            com.fasterxml.jackson.annotation.JsonFormat$Shape r1 = com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY
            if (r10 != r1) goto L_0x01df
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase r1 = r3.y()
            return r1
        L_0x01df:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.a(i0.f.a.c.i, com.fasterxml.jackson.databind.BeanProperty):i0.f.a.c.g");
    }

    public void b(i iVar) throws JsonMappingException {
        BeanPropertyWriter beanPropertyWriter;
        e eVar;
        AnnotatedMember annotatedMember;
        Object d0;
        i0.f.a.c.g<Object> gVar;
        BeanPropertyWriter beanPropertyWriter2;
        BeanPropertyWriter[] beanPropertyWriterArr = this.Y1;
        int length = beanPropertyWriterArr == null ? 0 : beanPropertyWriterArr.length;
        int length2 = this.y.length;
        for (int i = 0; i < length2; i++) {
            BeanPropertyWriter beanPropertyWriter3 = this.y[i];
            boolean z = true;
            if (!beanPropertyWriter3.j2) {
                if (!(beanPropertyWriter3.g2 != null) && (gVar = iVar.c2) != null) {
                    beanPropertyWriter3.i(gVar);
                    if (i < length && (beanPropertyWriter2 = this.Y1[i]) != null) {
                        beanPropertyWriter2.i(gVar);
                    }
                }
            }
            if (beanPropertyWriter3.f2 == null) {
                z = false;
            }
            if (!z) {
                AnnotationIntrospector O = iVar.O();
                i0.f.a.c.g<Object> gVar2 = null;
                if (!(O == null || (annotatedMember = beanPropertyWriter3.c2) == null || (d0 = O.d0(annotatedMember)) == null)) {
                    i0.f.a.c.t.g<Object, Object> g = iVar.g(beanPropertyWriter3.c2, d0);
                    JavaType c = g.c(iVar.i());
                    if (!c.N()) {
                        gVar2 = iVar.M(c, beanPropertyWriter3);
                    }
                    gVar2 = new StdDelegatingSerializer(g, c, gVar2);
                }
                if (gVar2 == null) {
                    JavaType javaType = beanPropertyWriter3.Z1;
                    if (javaType == null) {
                        javaType = beanPropertyWriter3.Y1;
                        if (!javaType.J()) {
                            if (javaType.G() || javaType.g() > 0) {
                                beanPropertyWriter3.a2 = javaType;
                            }
                        }
                    }
                    gVar2 = iVar.M(javaType, beanPropertyWriter3);
                    if (javaType.G() && (eVar = (e) javaType.l().x) != null && (gVar2 instanceof ContainerSerializer)) {
                        ContainerSerializer containerSerializer = (ContainerSerializer) gVar2;
                        Objects.requireNonNull(containerSerializer);
                        gVar2 = containerSerializer.v(eVar);
                    }
                }
                if (i >= length || (beanPropertyWriter = this.Y1[i]) == null) {
                    beanPropertyWriter3.k(gVar2);
                } else {
                    beanPropertyWriter.k(gVar2);
                }
            }
        }
        a aVar = this.Z1;
        if (aVar != null) {
            i0.f.a.c.g<Object> gVar3 = aVar.c;
            if (gVar3 instanceof d) {
                i0.f.a.c.g<?> T = iVar.T(gVar3, aVar.a);
                aVar.c = T;
                if (T instanceof MapSerializer) {
                    aVar.d = (MapSerializer) T;
                }
            }
        }
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        if (this.c2 != null) {
            jsonGenerator.w(obj);
            v(obj, jsonGenerator, iVar, eVar);
            return;
        }
        jsonGenerator.w(obj);
        WritableTypeId x2 = x(eVar, obj, JsonToken.START_OBJECT);
        eVar.e(jsonGenerator, x2);
        Object obj2 = this.a2;
        if (obj2 != null) {
            if (this.Y1 != null) {
                Class<?> cls = iVar.x;
            }
            n(iVar, obj2, obj);
            throw null;
        }
        A(obj, jsonGenerator, iVar);
        eVar.f(jsonGenerator, x2);
    }

    public boolean i() {
        return this.c2 != null;
    }

    public final void v(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        i0.f.a.c.r.k.a aVar = this.c2;
        i0.f.a.c.r.k.e F = iVar.F(obj, aVar.c);
        if (!F.b(jsonGenerator, iVar, aVar)) {
            if (F.b == null) {
                F.b = F.a.c(obj);
            }
            Object obj2 = F.b;
            if (aVar.e) {
                aVar.d.f(obj2, jsonGenerator, iVar);
                return;
            }
            i0.f.a.c.r.k.a aVar2 = this.c2;
            WritableTypeId x2 = x(eVar, obj, JsonToken.START_OBJECT);
            eVar.e(jsonGenerator, x2);
            F.a(jsonGenerator, iVar, aVar2);
            Object obj3 = this.a2;
            if (obj3 == null) {
                A(obj, jsonGenerator, iVar);
                eVar.f(jsonGenerator, x2);
                return;
            }
            n(iVar, obj3, obj);
            throw null;
        }
    }

    public final void w(Object obj, JsonGenerator jsonGenerator, i iVar, boolean z) throws IOException {
        i0.f.a.c.r.k.a aVar = this.c2;
        i0.f.a.c.r.k.e F = iVar.F(obj, aVar.c);
        if (!F.b(jsonGenerator, iVar, aVar)) {
            if (F.b == null) {
                F.b = F.a.c(obj);
            }
            Object obj2 = F.b;
            if (aVar.e) {
                aVar.d.f(obj2, jsonGenerator, iVar);
                return;
            }
            if (z) {
                jsonGenerator.N0(obj);
            }
            F.a(jsonGenerator, iVar, aVar);
            Object obj3 = this.a2;
            if (obj3 == null) {
                A(obj, jsonGenerator, iVar);
                if (z) {
                    jsonGenerator.U();
                    return;
                }
                return;
            }
            n(iVar, obj3, obj);
            throw null;
        }
    }

    public final WritableTypeId x(e eVar, Object obj, JsonToken jsonToken) {
        AnnotatedMember annotatedMember = this.b2;
        if (annotatedMember == null) {
            return eVar.d(obj, jsonToken);
        }
        Object l = annotatedMember.l(obj);
        if (l == null) {
            l = "";
        }
        WritableTypeId d = eVar.d(obj, jsonToken);
        d.c = l;
        return d;
    }

    public abstract BeanSerializerBase y();

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(beanSerializerBase.d);
        this.x = beanSerializerBase.x;
        this.y = beanPropertyWriterArr;
        this.Y1 = beanPropertyWriterArr2;
        this.b2 = beanSerializerBase.b2;
        this.Z1 = beanSerializerBase.Z1;
        this.c2 = beanSerializerBase.c2;
        this.a2 = beanSerializerBase.a2;
        this.d2 = beanSerializerBase.d2;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, i0.f.a.c.r.k.a aVar, Object obj) {
        super(beanSerializerBase.d);
        this.x = beanSerializerBase.x;
        this.y = beanSerializerBase.y;
        this.Y1 = beanSerializerBase.Y1;
        this.b2 = beanSerializerBase.b2;
        this.Z1 = beanSerializerBase.Z1;
        this.c2 = aVar;
        this.a2 = obj;
        this.d2 = beanSerializerBase.d2;
    }

    /* JADX WARNING: type inference failed for: r11v11, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BeanSerializerBase(com.fasterxml.jackson.databind.ser.std.BeanSerializerBase r10, java.util.Set<java.lang.String> r11, java.util.Set<java.lang.String> r12) {
        /*
            r9 = this;
            java.lang.Class<T> r0 = r10.d
            r9.<init>(r0)
            com.fasterxml.jackson.databind.JavaType r0 = r10.x
            r9.x = r0
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r0 = r10.y
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r1 = r10.Y1
            int r2 = r0.length
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r4 = 0
            if (r1 != 0) goto L_0x0018
            r5 = r4
            goto L_0x001d
        L_0x0018:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
        L_0x001d:
            r6 = 0
        L_0x001e:
            if (r6 >= r2) goto L_0x003a
            r7 = r0[r6]
            com.fasterxml.jackson.core.io.SerializedString r8 = r7.x
            java.lang.String r8 = r8.d
            boolean r8 = h0.b0.v.Z1(r8, r11, r12)
            if (r8 == 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            r3.add(r7)
            if (r1 == 0) goto L_0x0037
            r7 = r1[r6]
            r5.add(r7)
        L_0x0037:
            int r6 = r6 + 1
            goto L_0x001e
        L_0x003a:
            int r11 = r3.size()
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[r11]
            java.lang.Object[] r11 = r3.toArray(r11)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r11 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) r11
            r9.y = r11
            if (r5 != 0) goto L_0x004b
            goto L_0x0058
        L_0x004b:
            int r11 = r5.size()
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[r11]
            java.lang.Object[] r11 = r5.toArray(r11)
            r4 = r11
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r4 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) r4
        L_0x0058:
            r9.Y1 = r4
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r11 = r10.b2
            r9.b2 = r11
            i0.f.a.c.r.a r11 = r10.Z1
            r9.Z1 = r11
            i0.f.a.c.r.k.a r11 = r10.c2
            r9.c2 = r11
            java.lang.Object r11 = r10.a2
            r9.a2 = r11
            com.fasterxml.jackson.annotation.JsonFormat$Shape r10 = r10.d2
            r9.d2 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.<init>(com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, java.util.Set, java.util.Set):void");
    }
}
