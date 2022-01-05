package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import i0.f.a.c.r.j;
import i0.f.a.c.t.c;
import java.io.Serializable;

public class BeanSerializerFactory extends BasicSerializerFactory implements Serializable {
    public static final BeanSerializerFactory x = new BeanSerializerFactory((SerializerFactoryConfig) null);

    public BeanSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        super((SerializerFactoryConfig) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x028b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.ser.BeanPropertyWriter g(i0.f.a.c.i r17, i0.f.a.c.n.j r18, i0.f.a.c.r.e r19, boolean r20, com.fasterxml.jackson.databind.introspect.AnnotatedMember r21) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r4 = r18
            r14 = r19
            r0 = r21
            com.fasterxml.jackson.databind.PropertyName r6 = r18.b()
            com.fasterxml.jackson.databind.JavaType r11 = r21.f()
            com.fasterxml.jackson.databind.BeanProperty$Std r3 = new com.fasterxml.jackson.databind.BeanProperty$Std
            com.fasterxml.jackson.databind.PropertyName r8 = r18.C()
            com.fasterxml.jackson.databind.PropertyMetadata r10 = r18.f()
            r5 = r3
            r7 = r11
            r9 = r21
            r5.<init>(r6, r7, r8, r9, r10)
            i0.f.a.c.g r5 = r1.e(r2, r0)
            boolean r6 = r5 instanceof i0.f.a.c.r.g
            if (r6 == 0) goto L_0x0031
            r6 = r5
            i0.f.a.c.r.g r6 = (i0.f.a.c.r.g) r6
            r6.b(r2)
        L_0x0031:
            i0.f.a.c.g r8 = r2.T(r5, r3)
            boolean r3 = r11.G()
            r5 = 0
            if (r3 != 0) goto L_0x0045
            boolean r3 = r11.d()
            if (r3 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r3 = r5
            goto L_0x0064
        L_0x0045:
            com.fasterxml.jackson.databind.SerializationConfig r3 = r2.q
            com.fasterxml.jackson.databind.JavaType r6 = r11.l()
            com.fasterxml.jackson.databind.AnnotationIntrospector r7 = r3.e()
            i0.f.a.c.p.d r7 = r7.O(r3, r0, r11)
            if (r7 != 0) goto L_0x005a
            i0.f.a.c.p.e r3 = r1.b(r3, r6)
            goto L_0x0064
        L_0x005a:
            i0.f.a.c.p.a r9 = r3.Z1
            java.util.Collection r9 = r9.a(r3, r0, r6)
            i0.f.a.c.p.e r3 = r7.f(r3, r6, r9)
        L_0x0064:
            com.fasterxml.jackson.databind.SerializationConfig r6 = r2.q
            com.fasterxml.jackson.databind.AnnotationIntrospector r7 = r6.e()
            i0.f.a.c.p.d r7 = r7.Y(r6, r0, r11)
            if (r7 != 0) goto L_0x0075
            i0.f.a.c.p.e r6 = r1.b(r6, r11)
            goto L_0x007f
        L_0x0075:
            i0.f.a.c.p.a r9 = r6.Z1
            java.util.Collection r9 = r9.a(r6, r0, r11)
            i0.f.a.c.p.e r6 = r7.f(r6, r11, r9)
        L_0x007f:
            r9 = r6
            r6 = 0
            r7 = r20
            com.fasterxml.jackson.databind.JavaType r7 = r14.a(r0, r7, r11)     // Catch:{ JsonMappingException -> 0x0299 }
            if (r3 == 0) goto L_0x00b9
            if (r7 != 0) goto L_0x008c
            r7 = r11
        L_0x008c:
            com.fasterxml.jackson.databind.JavaType r10 = r7.l()
            if (r10 == 0) goto L_0x009b
            com.fasterxml.jackson.databind.JavaType r3 = r7.X(r3)
            r3.l()
            r10 = r3
            goto L_0x00ba
        L_0x009b:
            i0.f.a.c.b r0 = r14.b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "serialization type "
            r3.append(r8)
            r3.append(r7)
            java.lang.String r7 = " has no content"
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r2.Z(r0, r4, r3, r6)
            throw r5
        L_0x00b9:
            r10 = r7
        L_0x00ba:
            if (r10 != 0) goto L_0x00be
            r3 = r11
            goto L_0x00bf
        L_0x00be:
            r3 = r10
        L_0x00bf:
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r5 = r18.r()
            if (r5 == 0) goto L_0x028d
            java.lang.Class r5 = r5.e()
            com.fasterxml.jackson.databind.SerializationConfig r7 = r14.a
            java.lang.Class<?> r12 = r3.c
            com.fasterxml.jackson.annotation.JsonInclude$Value r13 = r14.e
            java.util.Objects.requireNonNull(r7)
            com.fasterxml.jackson.databind.cfg.ConfigOverrides r15 = r7.e2
            i0.f.a.c.k.b r12 = r15.a(r12)
            if (r12 != 0) goto L_0x00dc
            i0.f.a.c.k.b r12 = com.fasterxml.jackson.databind.cfg.MapperConfigBase.q
        L_0x00dc:
            java.util.Objects.requireNonNull(r12)
            com.fasterxml.jackson.databind.cfg.ConfigOverrides r7 = r7.e2
            i0.f.a.c.k.b r5 = r7.a(r5)
            if (r5 != 0) goto L_0x00e9
            i0.f.a.c.k.b r5 = com.fasterxml.jackson.databind.cfg.MapperConfigBase.q
        L_0x00e9:
            java.util.Objects.requireNonNull(r5)
            r5 = 3
            com.fasterxml.jackson.annotation.JsonInclude$Value[] r7 = new com.fasterxml.jackson.annotation.JsonInclude.Value[r5]
            r7[r6] = r13
            r12 = 1
            r13 = 0
            r7[r12] = r13
            r15 = 2
            r7[r15] = r13
        L_0x00f8:
            if (r6 >= r5) goto L_0x010a
            r5 = r7[r6]
            if (r5 == 0) goto L_0x0106
            if (r13 != 0) goto L_0x0101
            goto L_0x0105
        L_0x0101:
            com.fasterxml.jackson.annotation.JsonInclude$Value r5 = r13.a(r5)
        L_0x0105:
            r13 = r5
        L_0x0106:
            int r6 = r6 + 1
            r5 = 3
            goto L_0x00f8
        L_0x010a:
            com.fasterxml.jackson.annotation.JsonInclude$Value r5 = r18.l()
            com.fasterxml.jackson.annotation.JsonInclude$Value r5 = r13.a(r5)
            com.fasterxml.jackson.annotation.JsonInclude$Include r6 = r5.d
            com.fasterxml.jackson.annotation.JsonInclude$Include r7 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS
            if (r6 != r7) goto L_0x011a
            com.fasterxml.jackson.annotation.JsonInclude$Include r6 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS
        L_0x011a:
            int r6 = r6.ordinal()
            if (r6 == r12) goto L_0x0232
            if (r6 == r15) goto L_0x0229
            r7 = 3
            if (r6 == r7) goto L_0x0226
            r7 = 4
            if (r6 == r7) goto L_0x013e
            r7 = 5
            if (r6 == r7) goto L_0x012e
            r12 = 0
            goto L_0x0232
        L_0x012e:
            java.lang.Class<?> r3 = r5.x
            java.lang.Object r3 = r2.V(r4, r3)
            if (r3 != 0) goto L_0x0138
            goto L_0x0249
        L_0x0138:
            boolean r5 = r2.W(r3)
            goto L_0x0245
        L_0x013e:
            boolean r5 = r14.f
            if (r5 == 0) goto L_0x020f
            java.lang.Object r5 = r14.d
            if (r5 != 0) goto L_0x01c2
            i0.f.a.c.b r5 = r14.b
            com.fasterxml.jackson.databind.SerializationConfig r6 = r14.a
            boolean r6 = r6.b()
            i0.f.a.c.n.i r5 = (i0.f.a.c.n.i) r5
            i0.f.a.c.n.b r7 = r5.f
            i0.f.a.c.n.b$a r7 = r7.g()
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r7 = r7.a
            if (r7 != 0) goto L_0x015c
            r5 = 0
            goto L_0x0172
        L_0x015c:
            if (r6 == 0) goto L_0x0169
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r6 = r5.d
            com.fasterxml.jackson.databind.MapperFeature r13 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r6 = r6.q(r13)
            r7.g(r6)
        L_0x0169:
            java.lang.reflect.Constructor<?> r6 = r7.x     // Catch:{ Exception -> 0x0179 }
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0179 }
            java.lang.Object r5 = r6.newInstance(r7)     // Catch:{ Exception -> 0x0179 }
        L_0x0172:
            if (r5 != 0) goto L_0x0176
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L_0x0176:
            r14.d = r5
            goto L_0x01c2
        L_0x0179:
            r0 = move-exception
        L_0x017a:
            java.lang.Throwable r2 = r0.getCause()
            if (r2 == 0) goto L_0x0185
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x017a
        L_0x0185:
            i0.f.a.c.t.f.I(r0)
            i0.f.a.c.t.f.K(r0)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Failed to instantiate bean of type "
            java.lang.StringBuilder r3 = i0.d.a.a.a.P0(r3)
            i0.f.a.c.n.b r4 = r5.f
            java.lang.Class<?> r4 = r4.q
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ": ("
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ") "
            r3.append(r4)
            java.lang.String r4 = i0.f.a.c.t.f.j(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r0)
            throw r2
        L_0x01c2:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            if (r5 != r6) goto L_0x01c8
            r5 = 0
            goto L_0x01ca
        L_0x01c8:
            java.lang.Object r5 = r14.d
        L_0x01ca:
            if (r5 == 0) goto L_0x020f
            com.fasterxml.jackson.databind.MapperFeature r3 = com.fasterxml.jackson.databind.MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS
            boolean r3 = r2.X(r3)
            if (r3 == 0) goto L_0x01df
            com.fasterxml.jackson.databind.SerializationConfig r3 = r14.a
            com.fasterxml.jackson.databind.MapperFeature r6 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r3 = r3.q(r6)
            r0.g(r3)
        L_0x01df:
            java.lang.Object r3 = r0.l(r5)     // Catch:{ Exception -> 0x01e5 }
            r5 = 0
            goto L_0x0214
        L_0x01e5:
            r0 = move-exception
            java.lang.String r2 = r18.getName()
        L_0x01ea:
            java.lang.Throwable r3 = r0.getCause()
            if (r3 == 0) goto L_0x01f5
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x01ea
        L_0x01f5:
            i0.f.a.c.t.f.I(r0)
            i0.f.a.c.t.f.K(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Failed to get property '"
            java.lang.String r4 = "' of default "
            java.lang.StringBuilder r2 = i0.d.a.a.a.T0(r3, r2, r4)
            java.lang.String r3 = " instance"
            java.lang.String r2 = i0.d.a.a.a.d0(r5, r2, r3)
            r0.<init>(r2)
            throw r0
        L_0x020f:
            java.lang.Object r3 = h0.b0.v.k0(r3)
            r5 = r12
        L_0x0214:
            if (r3 != 0) goto L_0x0217
            goto L_0x0249
        L_0x0217:
            java.lang.Class r6 = r3.getClass()
            boolean r6 = r6.isArray()
            if (r6 == 0) goto L_0x0245
            java.lang.Object r3 = i0.f.a.c.t.b.a(r3)
            goto L_0x0245
        L_0x0226:
            java.lang.Object r3 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.q
            goto L_0x0249
        L_0x0229:
            boolean r3 = r3.d()
            if (r3 == 0) goto L_0x0248
            java.lang.Object r3 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.q
            goto L_0x0249
        L_0x0232:
            com.fasterxml.jackson.databind.SerializationFeature r5 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS
            boolean r3 = r3.G()
            if (r3 == 0) goto L_0x0248
            com.fasterxml.jackson.databind.SerializationConfig r3 = r14.a
            boolean r3 = r3.E(r5)
            if (r3 != 0) goto L_0x0248
            java.lang.Object r3 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.q
            r5 = r12
        L_0x0245:
            r13 = r3
            r12 = r5
            goto L_0x024a
        L_0x0248:
            r3 = 0
        L_0x0249:
            r13 = r3
        L_0x024a:
            java.lang.Class[] r3 = r18.q()
            if (r3 != 0) goto L_0x0256
            i0.f.a.c.b r3 = r14.b
            java.lang.Class[] r3 = r3.a()
        L_0x0256:
            r15 = r3
            i0.f.a.c.b r3 = r14.b
            i0.f.a.c.n.i r3 = (i0.f.a.c.n.i) r3
            i0.f.a.c.n.b r3 = r3.f
            i0.f.a.c.t.a r6 = r3.d2
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter
            r3 = r7
            r4 = r18
            r5 = r21
            r1 = r7
            r7 = r11
            r11 = r12
            r12 = r13
            r13 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r14.c
            java.lang.Object r3 = r3.F(r0)
            if (r3 == 0) goto L_0x027d
            i0.f.a.c.g r2 = r2.c0(r0, r3)
            r1.i(r2)
        L_0x027d:
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r14.c
            com.fasterxml.jackson.databind.util.NameTransformer r0 = r2.m0(r0)
            if (r0 == 0) goto L_0x028b
            com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter r7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter
            r7.<init>(r1, r0)
            goto L_0x028c
        L_0x028b:
            r7 = r1
        L_0x028c:
            return r7
        L_0x028d:
            i0.f.a.c.b r0 = r14.b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "could not determine property type"
            r2.Z(r0, r4, r3, r1)
            r0 = 0
            throw r0
        L_0x0299:
            r0 = move-exception
            r1 = r0
            i0.f.a.c.b r0 = r14.b
            java.lang.String r1 = i0.f.a.c.t.f.j(r1)
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r2.Z(r0, r4, r1, r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BeanSerializerFactory.g(i0.f.a.c.i, i0.f.a.c.n.j, i0.f.a.c.r.e, boolean, com.fasterxml.jackson.databind.introspect.AnnotatedMember):com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v89, resolved type: com.fasterxml.jackson.databind.ser.std.ToStringSerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: com.fasterxml.jackson.databind.ser.std.NumberSerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v91, resolved type: com.fasterxml.jackson.databind.ser.std.ToStringSerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v93, resolved type: com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v94, resolved type: com.fasterxml.jackson.databind.ser.std.InetAddressSerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v95, resolved type: com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v106, resolved type: com.fasterxml.jackson.databind.ser.std.DateSerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v108, resolved type: com.fasterxml.jackson.databind.ser.std.CalendarSerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v48, resolved type: i0.f.a.c.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v139, resolved type: i0.f.a.c.g<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v143, resolved type: i0.f.a.c.g<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v147, resolved type: i0.f.a.c.g<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v148, resolved type: i0.f.a.c.g<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v152, resolved type: i0.f.a.c.g<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v165, resolved type: i0.f.a.c.g<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v226, resolved type: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v227, resolved type: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v228, resolved type: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v229, resolved type: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v230, resolved type: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v231, resolved type: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v232, resolved type: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v13, resolved type: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v233, resolved type: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v234, resolved type: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer} */
    /* JADX WARNING: type inference failed for: r4v15, types: [com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator, com.fasterxml.jackson.annotation.ObjectIdGenerator] */
    /* JADX WARNING: type inference failed for: r1v107 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x033a A[LOOP:8: B:177:0x033a->B:180:0x0350, LOOP_START, PHI: r1 
      PHI: (r1v160 i0.f.a.c.g<?>) = (r1v159 i0.f.a.c.g<?>), (r1v172 i0.f.a.c.g<?>) binds: [B:176:0x032c, B:180:0x0350] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0470 A[LOOP:11: B:253:0x0470->B:256:0x0480, LOOP_START, PHI: r4 
      PHI: (r4v28 i0.f.a.c.g) = (r4v27 i0.f.a.c.g), (r4v32 i0.f.a.c.g) binds: [B:252:0x0468, B:256:0x0480] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x06df  */
    /* JADX WARNING: Removed duplicated region for block: B:566:0x0aa6  */
    /* JADX WARNING: Removed duplicated region for block: B:572:0x0af9  */
    /* JADX WARNING: Removed duplicated region for block: B:589:0x0b38  */
    /* JADX WARNING: Removed duplicated region for block: B:634:0x0bfd  */
    /* JADX WARNING: Removed duplicated region for block: B:638:0x0c29  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.g<?> h(i0.f.a.c.i r27, com.fasterxml.jackson.databind.JavaType r28, i0.f.a.c.b r29, boolean r30) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r0 = r28
            r6 = r29
            r9 = r30
            com.fasterxml.jackson.databind.SerializationConfig r1 = r8.q
            boolean r2 = r28.G()
            r3 = 3
            r10 = 0
            if (r2 == 0) goto L_0x03a7
            if (r9 != 0) goto L_0x001d
            boolean r1 = r7.f(r1, r6, r10)
            r16 = r1
            goto L_0x001f
        L_0x001d:
            r16 = r9
        L_0x001f:
            com.fasterxml.jackson.databind.SerializationConfig r5 = r8.q
            if (r16 != 0) goto L_0x0039
            boolean r1 = r0.y
            if (r1 == 0) goto L_0x0039
            boolean r1 = r28.G()
            if (r1 == 0) goto L_0x0037
            com.fasterxml.jackson.databind.JavaType r1 = r28.l()
            boolean r1 = r1.N()
            if (r1 != 0) goto L_0x0039
        L_0x0037:
            r1 = 1
            goto L_0x003b
        L_0x0039:
            r1 = r16
        L_0x003b:
            com.fasterxml.jackson.databind.JavaType r2 = r28.l()
            i0.f.a.c.p.e r4 = r7.b(r5, r2)
            if (r4 == 0) goto L_0x0046
            r1 = 0
        L_0x0046:
            r2 = r1
            r1 = r6
            i0.f.a.c.n.i r1 = (i0.f.a.c.n.i) r1
            i0.f.a.c.n.b r9 = r1.f
            com.fasterxml.jackson.databind.AnnotationIntrospector r11 = r27.O()
            java.lang.Object r11 = r11.d(r9)
            if (r11 == 0) goto L_0x005c
            i0.f.a.c.g r9 = r8.c0(r9, r11)
            r15 = r9
            goto L_0x005d
        L_0x005c:
            r15 = r10
        L_0x005d:
            boolean r9 = r28.O()
            if (r9 == 0) goto L_0x01f8
            r14 = r0
            com.fasterxml.jackson.databind.type.MapLikeType r14 = (com.fasterxml.jackson.databind.type.MapLikeType) r14
            i0.f.a.c.n.b r9 = r1.f
            com.fasterxml.jackson.databind.AnnotationIntrospector r11 = r27.O()
            java.lang.Object r11 = r11.y(r9)
            if (r11 == 0) goto L_0x0079
            i0.f.a.c.g r9 = r8.c0(r9, r11)
            r22 = r9
            goto L_0x007b
        L_0x0079:
            r22 = r10
        L_0x007b:
            boolean r9 = r14 instanceof com.fasterxml.jackson.databind.type.MapType
            if (r9 == 0) goto L_0x01a2
            r5 = r14
            com.fasterxml.jackson.databind.type.MapType r5 = (com.fasterxml.jackson.databind.type.MapType) r5
            com.fasterxml.jackson.annotation.JsonFormat$Value r9 = r6.b(r10)
            com.fasterxml.jackson.annotation.JsonFormat$Shape r9 = r9.q
            com.fasterxml.jackson.annotation.JsonFormat$Shape r11 = com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT
            if (r9 != r11) goto L_0x008f
            r1 = 4
            goto L_0x01f4
        L_0x008f:
            com.fasterxml.jackson.databind.SerializationConfig r14 = r8.q
            java.lang.Iterable r9 = r26.i()
            r17 = r9
            i0.f.a.c.t.c r17 = (i0.f.a.c.t.c) r17
        L_0x0099:
            boolean r9 = r17.hasNext()
            if (r9 == 0) goto L_0x00be
            java.lang.Object r9 = r17.next()
            i0.f.a.c.r.j r9 = (i0.f.a.c.r.j) r9
            r18 = 2
            r10 = r14
            r11 = r5
            r12 = r29
            r13 = r22
            r30 = r14
            r14 = r4
            r23 = r15
            i0.f.a.c.g r10 = r9.c(r10, r11, r12, r13, r14, r15)
            if (r10 == 0) goto L_0x00b9
            goto L_0x00c4
        L_0x00b9:
            r14 = r30
            r15 = r23
            goto L_0x0099
        L_0x00be:
            r30 = r14
            r23 = r15
            r18 = 2
        L_0x00c4:
            r9 = r18
            if (r10 != 0) goto L_0x0181
            i0.f.a.c.g r10 = r7.d(r8, r5, r6)
            if (r10 != 0) goto L_0x0181
            com.fasterxml.jackson.databind.AnnotationIntrospector r10 = r30.e()
            i0.f.a.c.n.b r11 = r1.f
            java.lang.Object r24 = r10.n(r11)
            java.lang.Class<java.util.Map> r10 = java.util.Map.class
            i0.f.a.c.n.b r11 = r1.f
            r12 = r30
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r10 = r12.x(r10, r11)
            if (r10 != 0) goto L_0x00e6
            r10 = 0
            goto L_0x00ea
        L_0x00e6:
            java.util.Set r10 = r10.d()
        L_0x00ea:
            r17 = r10
            java.lang.Class<java.util.Map> r10 = java.util.Map.class
            i0.f.a.c.n.b r1 = r1.f
            com.fasterxml.jackson.annotation.JsonIncludeProperties$Value r1 = r12.y(r1)
            if (r1 != 0) goto L_0x00f8
            r1 = 0
            goto L_0x00fa
        L_0x00f8:
            java.util.Set<java.lang.String> r1 = r1.d
        L_0x00fa:
            r18 = r1
            r19 = r5
            r20 = r2
            r21 = r4
            com.fasterxml.jackson.databind.ser.std.MapSerializer r1 = com.fasterxml.jackson.databind.ser.std.MapSerializer.x(r17, r18, r19, r20, r21, r22, r23, r24)
            com.fasterxml.jackson.databind.JavaType r2 = r1.a2
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            com.fasterxml.jackson.annotation.JsonInclude$Value r4 = r7.c(r8, r6, r2, r4)
            if (r4 != 0) goto L_0x0113
            com.fasterxml.jackson.annotation.JsonInclude$Include r5 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS
            goto L_0x0115
        L_0x0113:
            com.fasterxml.jackson.annotation.JsonInclude$Include r5 = r4.q
        L_0x0115:
            com.fasterxml.jackson.annotation.JsonInclude$Include r10 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS
            if (r5 == r10) goto L_0x016f
            com.fasterxml.jackson.annotation.JsonInclude$Include r10 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS
            if (r5 != r10) goto L_0x011e
            goto L_0x016f
        L_0x011e:
            int r5 = r5.ordinal()
            if (r5 == r9) goto L_0x015b
            if (r5 == r3) goto L_0x0152
            r3 = 4
            if (r5 == r3) goto L_0x013d
            r2 = 5
            if (r5 == r2) goto L_0x012e
            r2 = 0
            goto L_0x0169
        L_0x012e:
            java.lang.Class<?> r2 = r4.y
            r4 = 0
            java.lang.Object r2 = r8.V(r4, r2)
            if (r2 != 0) goto L_0x0138
            goto L_0x0169
        L_0x0138:
            boolean r4 = r8.W(r2)
            goto L_0x016a
        L_0x013d:
            java.lang.Object r2 = h0.b0.v.k0(r2)
            if (r2 == 0) goto L_0x0169
            java.lang.Class r4 = r2.getClass()
            boolean r4 = r4.isArray()
            if (r4 == 0) goto L_0x0169
            java.lang.Object r2 = i0.f.a.c.t.b.a(r2)
            goto L_0x0169
        L_0x0152:
            r2 = 4
            java.lang.Object r3 = com.fasterxml.jackson.databind.ser.std.MapSerializer.x
            r25 = r3
            r3 = r2
            r2 = r25
            goto L_0x0169
        L_0x015b:
            r3 = 0
            r4 = 4
            boolean r2 = r2.d()
            if (r2 == 0) goto L_0x0167
            java.lang.Object r2 = com.fasterxml.jackson.databind.ser.std.MapSerializer.x
        L_0x0165:
            r3 = r4
            goto L_0x0169
        L_0x0167:
            r2 = r3
            goto L_0x0165
        L_0x0169:
            r4 = 1
        L_0x016a:
            com.fasterxml.jackson.databind.ser.std.MapSerializer r1 = r1.A(r2, r4)
            goto L_0x017e
        L_0x016f:
            r2 = 0
            r3 = 4
            com.fasterxml.jackson.databind.SerializationFeature r4 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_NULL_MAP_VALUES
            boolean r4 = r8.Y(r4)
            if (r4 != 0) goto L_0x017e
            r4 = 1
            com.fasterxml.jackson.databind.ser.std.MapSerializer r1 = r1.A(r2, r4)
        L_0x017e:
            r10 = r1
            r1 = r3
            goto L_0x0182
        L_0x0181:
            r1 = 4
        L_0x0182:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r7.q
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x01f4
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r7.q
            java.lang.Iterable r2 = r2.b()
            i0.f.a.c.t.c r2 = (i0.f.a.c.t.c) r2
        L_0x0192:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01f4
            java.lang.Object r3 = r2.next()
            i0.f.a.c.r.c r3 = (i0.f.a.c.r.c) r3
            java.util.Objects.requireNonNull(r3)
            goto L_0x0192
        L_0x01a2:
            r23 = r15
            r1 = 4
            java.lang.Iterable r2 = r26.i()
            i0.f.a.c.t.c r2 = (i0.f.a.c.t.c) r2
        L_0x01ab:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01cb
            java.lang.Object r3 = r2.next()
            r9 = r3
            i0.f.a.c.r.j r9 = (i0.f.a.c.r.j) r9
            r10 = r5
            r11 = r14
            r12 = r29
            r13 = r22
            r3 = r14
            r14 = r4
            r15 = r23
            i0.f.a.c.g r10 = r9.f(r10, r11, r12, r13, r14, r15)
            if (r10 == 0) goto L_0x01c9
            goto L_0x01cb
        L_0x01c9:
            r14 = r3
            goto L_0x01ab
        L_0x01cb:
            if (r10 != 0) goto L_0x01d2
            i0.f.a.c.g r2 = r26.d(r27, r28, r29)
            r10 = r2
        L_0x01d2:
            if (r10 == 0) goto L_0x01f4
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r7.q
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x01f4
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r7.q
            java.lang.Iterable r2 = r2.b()
            i0.f.a.c.t.c r2 = (i0.f.a.c.t.c) r2
        L_0x01e4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01f4
            java.lang.Object r3 = r2.next()
            i0.f.a.c.r.c r3 = (i0.f.a.c.r.c) r3
            java.util.Objects.requireNonNull(r3)
            goto L_0x01e4
        L_0x01f4:
            r2 = r10
            r10 = r6
            goto L_0x039f
        L_0x01f8:
            r23 = r15
            r9 = 4
            boolean r1 = r28.E()
            if (r1 == 0) goto L_0x0323
            r11 = r0
            com.fasterxml.jackson.databind.type.CollectionLikeType r11 = (com.fasterxml.jackson.databind.type.CollectionLikeType) r11
            boolean r1 = r11 instanceof com.fasterxml.jackson.databind.type.CollectionType
            if (r1 == 0) goto L_0x02cf
            com.fasterxml.jackson.databind.type.CollectionType r11 = (com.fasterxml.jackson.databind.type.CollectionType) r11
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            com.fasterxml.jackson.databind.SerializationConfig r13 = r8.q
            java.lang.Iterable r1 = r26.i()
            r14 = r1
            i0.f.a.c.t.c r14 = (i0.f.a.c.t.c) r14
            r1 = r10
        L_0x0216:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x023b
            java.lang.Object r1 = r14.next()
            i0.f.a.c.r.j r1 = (i0.f.a.c.r.j) r1
            r15 = r2
            r2 = r13
            r3 = r11
            r9 = r4
            r4 = r29
            r5 = r9
            r10 = r6
            r6 = r23
            i0.f.a.c.g r1 = r1.g(r2, r3, r4, r5, r6)
            r2 = 4
            if (r1 == 0) goto L_0x0235
            r6 = r9
            goto L_0x023f
        L_0x0235:
            r4 = r9
            r6 = r10
            r10 = 0
            r9 = r2
            r2 = r15
            goto L_0x0216
        L_0x023b:
            r15 = r2
            r10 = r6
            r6 = r4
            r2 = r9
        L_0x023f:
            if (r1 != 0) goto L_0x02a8
            i0.f.a.c.g r1 = r7.d(r8, r11, r10)
            if (r1 != 0) goto L_0x02a8
            r3 = 0
            com.fasterxml.jackson.annotation.JsonFormat$Value r4 = r10.b(r3)
            com.fasterxml.jackson.annotation.JsonFormat$Shape r4 = r4.q
            com.fasterxml.jackson.annotation.JsonFormat$Shape r5 = com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT
            if (r4 != r5) goto L_0x0255
            r1 = r2
            goto L_0x039e
        L_0x0255:
            java.lang.Class<?> r4 = r11.c
            java.lang.Class<java.util.EnumSet> r5 = java.util.EnumSet.class
            boolean r5 = r5.isAssignableFrom(r4)
            if (r5 == 0) goto L_0x026e
            com.fasterxml.jackson.databind.JavaType r1 = r11.c2
            boolean r4 = r1.H()
            if (r4 != 0) goto L_0x0268
            r1 = r3
        L_0x0268:
            com.fasterxml.jackson.databind.ser.std.EnumSetSerializer r3 = new com.fasterxml.jackson.databind.ser.std.EnumSetSerializer
            r3.<init>(r1)
            goto L_0x02a7
        L_0x026e:
            com.fasterxml.jackson.databind.JavaType r3 = r11.c2
            java.lang.Class<?> r3 = r3.c
            java.lang.Class<java.util.RandomAccess> r5 = java.util.RandomAccess.class
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 == 0) goto L_0x0292
            if (r3 != r12) goto L_0x0287
            boolean r3 = i0.f.a.c.t.f.y(r23)
            if (r3 == 0) goto L_0x0284
            com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer r1 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.x
        L_0x0284:
            r13 = r23
            goto L_0x029e
        L_0x0287:
            com.fasterxml.jackson.databind.JavaType r1 = r11.c2
            com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer r3 = new com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer
            r13 = r23
            r3.<init>(r1, r15, r6, r13)
            r1 = r3
            goto L_0x029e
        L_0x0292:
            r13 = r23
            if (r3 != r12) goto L_0x029e
            boolean r3 = i0.f.a.c.t.f.y(r13)
            if (r3 == 0) goto L_0x029e
            com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer r1 = com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer.x
        L_0x029e:
            if (r1 != 0) goto L_0x02a8
            com.fasterxml.jackson.databind.JavaType r1 = r11.c2
            com.fasterxml.jackson.databind.ser.std.CollectionSerializer r3 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer
            r3.<init>(r1, r15, r6, r13)
        L_0x02a7:
            r1 = r3
        L_0x02a8:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r3 = r7.q
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x02c8
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r3 = r7.q
            java.lang.Iterable r3 = r3.b()
            i0.f.a.c.t.c r3 = (i0.f.a.c.t.c) r3
        L_0x02b8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02c8
            java.lang.Object r4 = r3.next()
            i0.f.a.c.r.c r4 = (i0.f.a.c.r.c) r4
            java.util.Objects.requireNonNull(r4)
            goto L_0x02b8
        L_0x02c8:
            r25 = r2
            r2 = r1
            r1 = r25
            goto L_0x039f
        L_0x02cf:
            r3 = r10
            r13 = r23
            r10 = r6
            r6 = r4
            java.lang.Iterable r1 = r26.i()
            r12 = r1
            i0.f.a.c.t.c r12 = (i0.f.a.c.t.c) r12
        L_0x02db:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x02f9
            java.lang.Object r1 = r12.next()
            i0.f.a.c.r.j r1 = (i0.f.a.c.r.j) r1
            r2 = r5
            r3 = r11
            r4 = r29
            r14 = r5
            r5 = r6
            r15 = r6
            r6 = r13
            i0.f.a.c.g r3 = r1.d(r2, r3, r4, r5, r6)
            if (r3 == 0) goto L_0x02f6
            goto L_0x02f9
        L_0x02f6:
            r5 = r14
            r6 = r15
            goto L_0x02db
        L_0x02f9:
            if (r3 != 0) goto L_0x0300
            i0.f.a.c.g r1 = r26.d(r27, r28, r29)
            goto L_0x0301
        L_0x0300:
            r1 = r3
        L_0x0301:
            if (r1 == 0) goto L_0x039a
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r7.q
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x039a
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r7.q
            java.lang.Iterable r2 = r2.b()
            i0.f.a.c.t.c r2 = (i0.f.a.c.t.c) r2
        L_0x0313:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x039a
            java.lang.Object r3 = r2.next()
            i0.f.a.c.r.c r3 = (i0.f.a.c.r.c) r3
            java.util.Objects.requireNonNull(r3)
            goto L_0x0313
        L_0x0323:
            r15 = r2
            r11 = r4
            r10 = r6
            r13 = r23
            boolean r1 = r0 instanceof com.fasterxml.jackson.databind.type.ArrayType
            if (r1 == 0) goto L_0x039d
            r12 = r0
            com.fasterxml.jackson.databind.type.ArrayType r12 = (com.fasterxml.jackson.databind.type.ArrayType) r12
            com.fasterxml.jackson.databind.SerializationConfig r14 = r8.q
            java.lang.Iterable r1 = r26.i()
            r17 = r1
            i0.f.a.c.t.c r17 = (i0.f.a.c.t.c) r17
            r1 = 0
        L_0x033a:
            boolean r2 = r17.hasNext()
            if (r2 == 0) goto L_0x0352
            java.lang.Object r1 = r17.next()
            i0.f.a.c.r.j r1 = (i0.f.a.c.r.j) r1
            r2 = r14
            r3 = r12
            r4 = r29
            r5 = r11
            r6 = r13
            i0.f.a.c.g r1 = r1.e(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x033a
        L_0x0352:
            if (r1 != 0) goto L_0x037a
            java.lang.Class<?> r2 = r12.c
            if (r13 == 0) goto L_0x035e
            boolean r3 = i0.f.a.c.t.f.y(r13)
            if (r3 == 0) goto L_0x0371
        L_0x035e:
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            if (r1 != r2) goto L_0x0365
            com.fasterxml.jackson.databind.ser.impl.StringArraySerializer r1 = com.fasterxml.jackson.databind.ser.impl.StringArraySerializer.y
            goto L_0x0371
        L_0x0365:
            java.util.HashMap<java.lang.String, i0.f.a.c.g<?>> r1 = com.fasterxml.jackson.databind.ser.std.StdArraySerializers.a
            java.lang.String r2 = r2.getName()
            java.lang.Object r1 = r1.get(r2)
            i0.f.a.c.g r1 = (i0.f.a.c.g) r1
        L_0x0371:
            if (r1 != 0) goto L_0x037a
            com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer r1 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer
            com.fasterxml.jackson.databind.JavaType r2 = r12.c2
            r1.<init>(r2, r15, r11, r13)
        L_0x037a:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r7.q
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x039a
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r7.q
            java.lang.Iterable r2 = r2.b()
            i0.f.a.c.t.c r2 = (i0.f.a.c.t.c) r2
        L_0x038a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x039a
            java.lang.Object r3 = r2.next()
            i0.f.a.c.r.c r3 = (i0.f.a.c.r.c) r3
            java.util.Objects.requireNonNull(r3)
            goto L_0x038a
        L_0x039a:
            r2 = r1
            r1 = r9
            goto L_0x039f
        L_0x039d:
            r1 = r9
        L_0x039e:
            r2 = 0
        L_0x039f:
            if (r2 == 0) goto L_0x03a2
            return r2
        L_0x03a2:
            r3 = 5
            r9 = r16
            goto L_0x048b
        L_0x03a7:
            r10 = r6
            r11 = 4
            boolean r2 = r28.d()
            if (r2 == 0) goto L_0x0468
            r12 = r0
            com.fasterxml.jackson.databind.type.ReferenceType r12 = (com.fasterxml.jackson.databind.type.ReferenceType) r12
            com.fasterxml.jackson.databind.JavaType r1 = r12.c2
            java.lang.Object r2 = r1.x
            i0.f.a.c.p.e r2 = (i0.f.a.c.p.e) r2
            com.fasterxml.jackson.databind.SerializationConfig r13 = r8.q
            if (r2 != 0) goto L_0x03c0
            i0.f.a.c.p.e r2 = r7.b(r13, r1)
        L_0x03c0:
            r14 = r2
            java.lang.Object r1 = r1.q
            r15 = r1
            i0.f.a.c.g r15 = (i0.f.a.c.g) r15
            java.lang.Iterable r1 = r26.i()
            r16 = r1
            i0.f.a.c.t.c r16 = (i0.f.a.c.t.c) r16
        L_0x03ce:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x03eb
            java.lang.Object r1 = r16.next()
            i0.f.a.c.r.j r1 = (i0.f.a.c.r.j) r1
            r2 = r13
            r3 = r12
            r4 = r29
            r5 = r14
            r6 = r15
            i0.f.a.c.g r1 = r1.a(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x03ce
            r2 = 5
            r3 = r2
            r2 = r1
            goto L_0x0484
        L_0x03eb:
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r1 = java.util.concurrent.atomic.AtomicReference.class
            boolean r1 = r12.T(r1)
            if (r1 == 0) goto L_0x0464
            com.fasterxml.jackson.databind.JavaType r1 = r12.c2
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r2 = java.util.concurrent.atomic.AtomicReference.class
            com.fasterxml.jackson.annotation.JsonInclude$Value r2 = r7.c(r8, r10, r1, r2)
            if (r2 != 0) goto L_0x0400
            com.fasterxml.jackson.annotation.JsonInclude$Include r3 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS
            goto L_0x0402
        L_0x0400:
            com.fasterxml.jackson.annotation.JsonInclude$Include r3 = r2.q
        L_0x0402:
            com.fasterxml.jackson.annotation.JsonInclude$Include r4 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS
            if (r3 == r4) goto L_0x0457
            com.fasterxml.jackson.annotation.JsonInclude$Include r4 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS
            if (r3 != r4) goto L_0x040b
            goto L_0x0457
        L_0x040b:
            int r3 = r3.ordinal()
            r4 = 2
            if (r3 == r4) goto L_0x0444
            r4 = 3
            if (r3 == r4) goto L_0x0440
            if (r3 == r11) goto L_0x042a
            r1 = 5
            if (r3 == r1) goto L_0x041b
            goto L_0x0454
        L_0x041b:
            java.lang.Class<?> r2 = r2.y
            r3 = 0
            java.lang.Object r2 = r8.V(r3, r2)
            if (r2 != 0) goto L_0x0425
            goto L_0x0455
        L_0x0425:
            boolean r3 = r8.W(r2)
            goto L_0x045a
        L_0x042a:
            r2 = 5
            java.lang.Object r1 = h0.b0.v.k0(r1)
            if (r1 == 0) goto L_0x044d
            java.lang.Class r3 = r1.getClass()
            boolean r3 = r3.isArray()
            if (r3 == 0) goto L_0x044d
            java.lang.Object r1 = i0.f.a.c.t.b.a(r1)
            goto L_0x044d
        L_0x0440:
            r1 = 5
            java.lang.Object r2 = com.fasterxml.jackson.databind.ser.std.MapSerializer.x
            goto L_0x0455
        L_0x0444:
            r2 = 5
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x0453
            java.lang.Object r1 = com.fasterxml.jackson.databind.ser.std.MapSerializer.x
        L_0x044d:
            r25 = r2
            r2 = r1
            r1 = r25
            goto L_0x0455
        L_0x0453:
            r1 = r2
        L_0x0454:
            r2 = 0
        L_0x0455:
            r3 = 1
            goto L_0x045a
        L_0x0457:
            r1 = 5
            r2 = 0
            r3 = 0
        L_0x045a:
            com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer r4 = new com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer
            r4.<init>(r12, r9, r14, r15)
            com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer r2 = r4.w(r2, r3)
            goto L_0x0466
        L_0x0464:
            r1 = 5
            r2 = 0
        L_0x0466:
            r3 = r1
            goto L_0x0484
        L_0x0468:
            r2 = 5
            java.lang.Iterable r3 = r26.i()
            i0.f.a.c.t.c r3 = (i0.f.a.c.t.c) r3
            r4 = 0
        L_0x0470:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0482
            java.lang.Object r4 = r3.next()
            i0.f.a.c.r.j r4 = (i0.f.a.c.r.j) r4
            i0.f.a.c.g r4 = r4.b(r1, r0, r10)
            if (r4 == 0) goto L_0x0470
        L_0x0482:
            r3 = r2
            r2 = r4
        L_0x0484:
            if (r2 != 0) goto L_0x048a
            i0.f.a.c.g r2 = r26.d(r27, r28, r29)
        L_0x048a:
            r1 = r11
        L_0x048b:
            if (r2 != 0) goto L_0x0c4c
            java.lang.Class<?> r2 = r0.c
            java.lang.String r2 = r2.getName()
            java.util.HashMap<java.lang.String, i0.f.a.c.g<?>> r4 = com.fasterxml.jackson.databind.ser.BasicSerializerFactory.c
            java.lang.Object r4 = r4.get(r2)
            i0.f.a.c.g r4 = (i0.f.a.c.g) r4
            if (r4 != 0) goto L_0x04af
            java.util.HashMap<java.lang.String, java.lang.Class<? extends i0.f.a.c.g<?>>> r5 = com.fasterxml.jackson.databind.ser.BasicSerializerFactory.d
            java.lang.Object r2 = r5.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 == 0) goto L_0x04af
            r4 = 0
            java.lang.Object r2 = i0.f.a.c.t.f.i(r2, r4)
            i0.f.a.c.g r2 = (i0.f.a.c.g) r2
            goto L_0x04b5
        L_0x04af:
            r2 = 0
            r25 = r4
            r4 = r2
            r2 = r25
        L_0x04b5:
            if (r2 != 0) goto L_0x0c4c
            boolean r2 = r28.I()
            if (r2 == 0) goto L_0x0529
            com.fasterxml.jackson.databind.SerializationConfig r1 = r8.q
            r2 = 0
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = r10.b(r2)
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = r2.q
            com.fasterxml.jackson.annotation.JsonFormat$Shape r5 = com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT
            if (r3 != r5) goto L_0x04f3
            r1 = r10
            i0.f.a.c.n.i r1 = (i0.f.a.c.n.i) r1
            java.util.List r1 = r1.h()
            java.util.Iterator r1 = r1.iterator()
        L_0x04d5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x04f0
            java.lang.Object r2 = r1.next()
            i0.f.a.c.n.j r2 = (i0.f.a.c.n.j) r2
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "declaringClass"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x04d5
            r1.remove()
        L_0x04f0:
            r1 = 1
            goto L_0x06db
        L_0x04f3:
            java.lang.Class<?> r3 = r0.c
            int r5 = com.fasterxml.jackson.databind.ser.std.EnumSerializer.q
            com.fasterxml.jackson.databind.util.EnumValues r1 = com.fasterxml.jackson.databind.util.EnumValues.a(r1, r3)
            r5 = 0
            r6 = 1
            java.lang.Boolean r2 = com.fasterxml.jackson.databind.ser.std.EnumSerializer.v(r3, r2, r6, r5)
            com.fasterxml.jackson.databind.ser.std.EnumSerializer r3 = new com.fasterxml.jackson.databind.ser.std.EnumSerializer
            r3.<init>(r1, r2)
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r7.q
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0526
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r7.q
            java.lang.Iterable r1 = r1.b()
            i0.f.a.c.t.c r1 = (i0.f.a.c.t.c) r1
        L_0x0516:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0526
            java.lang.Object r2 = r1.next()
            i0.f.a.c.r.c r2 = (i0.f.a.c.r.c) r2
            java.util.Objects.requireNonNull(r2)
            goto L_0x0516
        L_0x0526:
            r2 = r3
            goto L_0x06dd
        L_0x0529:
            r2 = 1
            java.lang.Class<?> r5 = r0.c
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory r6 = com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.x
            com.fasterxml.jackson.databind.SerializationConfig r11 = r8.q
            java.util.Objects.requireNonNull(r6)
            java.lang.Class<?> r12 = r0.c
            java.lang.Class<?> r13 = com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.c
            boolean r13 = r6.a(r12, r13)
            if (r13 == 0) goto L_0x0546
            java.lang.String r11 = "com.fasterxml.jackson.databind.ext.DOMSerializer"
            java.lang.Object r6 = r6.d(r11, r0)
            i0.f.a.c.g r6 = (i0.f.a.c.g) r6
            goto L_0x058d
        L_0x0546:
            i0.f.a.c.m.a r13 = com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.q
            if (r13 == 0) goto L_0x0552
            i0.f.a.c.g r13 = r13.b(r12)
            if (r13 == 0) goto L_0x0552
            r6 = r13
            goto L_0x058d
        L_0x0552:
            java.lang.String r13 = r12.getName()
            java.util.Map<java.lang.String, java.lang.Object> r14 = r6.Y1
            java.lang.Object r14 = r14.get(r13)
            if (r14 == 0) goto L_0x056f
            boolean r11 = r14 instanceof i0.f.a.c.g
            if (r11 == 0) goto L_0x0566
            r6 = r14
            i0.f.a.c.g r6 = (i0.f.a.c.g) r6
            goto L_0x058d
        L_0x0566:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r6 = r6.d(r14, r0)
            i0.f.a.c.g r6 = (i0.f.a.c.g) r6
            goto L_0x058d
        L_0x056f:
            java.lang.String r14 = "javax.xml."
            boolean r13 = r13.startsWith(r14)
            if (r13 != 0) goto L_0x057d
            boolean r12 = r6.b(r12, r14)
            if (r12 == 0) goto L_0x0585
        L_0x057d:
            java.lang.String r12 = "com.fasterxml.jackson.databind.ext.CoreXMLSerializers"
            java.lang.Object r6 = r6.d(r12, r0)
            if (r6 != 0) goto L_0x0587
        L_0x0585:
            r6 = 0
            goto L_0x058d
        L_0x0587:
            i0.f.a.c.r.j r6 = (i0.f.a.c.r.j) r6
            i0.f.a.c.g r6 = r6.b(r11, r0, r10)
        L_0x058d:
            if (r6 == 0) goto L_0x0591
            goto L_0x0667
        L_0x0591:
            java.lang.Class<java.util.Calendar> r6 = java.util.Calendar.class
            boolean r6 = r6.isAssignableFrom(r5)
            if (r6 == 0) goto L_0x059f
            com.fasterxml.jackson.databind.ser.std.CalendarSerializer r1 = com.fasterxml.jackson.databind.ser.std.CalendarSerializer.Y1
        L_0x059b:
            r6 = r2
            r2 = r1
            goto L_0x06dd
        L_0x059f:
            java.lang.Class<java.util.Date> r6 = java.util.Date.class
            boolean r6 = r6.isAssignableFrom(r5)
            if (r6 == 0) goto L_0x05aa
            com.fasterxml.jackson.databind.ser.std.DateSerializer r1 = com.fasterxml.jackson.databind.ser.std.DateSerializer.Y1
            goto L_0x059b
        L_0x05aa:
            java.lang.Class<java.util.Map$Entry> r6 = java.util.Map.Entry.class
            boolean r6 = r6.isAssignableFrom(r5)
            if (r6 == 0) goto L_0x066e
            java.lang.Class<java.util.Map$Entry> r5 = java.util.Map.Entry.class
            com.fasterxml.jackson.databind.JavaType r5 = r0.i(r5)
            com.fasterxml.jackson.databind.JavaType r14 = r5.h(r4)
            com.fasterxml.jackson.databind.JavaType r15 = r5.h(r2)
            java.lang.Class<java.util.Map$Entry> r5 = java.util.Map.Entry.class
            com.fasterxml.jackson.databind.SerializationConfig r6 = r8.q
            com.fasterxml.jackson.annotation.JsonFormat$Value r5 = r6.h(r5)
            r6 = 0
            com.fasterxml.jackson.annotation.JsonFormat$Value r6 = r10.b(r6)
            if (r6 != 0) goto L_0x05d0
            goto L_0x05d4
        L_0x05d0:
            com.fasterxml.jackson.annotation.JsonFormat$Value r5 = r6.f(r5)
        L_0x05d4:
            com.fasterxml.jackson.annotation.JsonFormat$Shape r5 = r5.q
            com.fasterxml.jackson.annotation.JsonFormat$Shape r6 = com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT
            if (r5 != r6) goto L_0x05dc
            goto L_0x06da
        L_0x05dc:
            com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer r5 = new com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer
            com.fasterxml.jackson.databind.SerializationConfig r6 = r8.q
            i0.f.a.c.p.e r17 = r7.b(r6, r15)
            r18 = 0
            r12 = r5
            r13 = r15
            r16 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18)
            com.fasterxml.jackson.databind.JavaType r6 = r5.a2
            java.lang.Class<java.util.Map$Entry> r11 = java.util.Map.Entry.class
            com.fasterxml.jackson.annotation.JsonInclude$Value r11 = r7.c(r8, r10, r6, r11)
            if (r11 != 0) goto L_0x05fa
            com.fasterxml.jackson.annotation.JsonInclude$Include r12 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS
            goto L_0x05fc
        L_0x05fa:
            com.fasterxml.jackson.annotation.JsonInclude$Include r12 = r11.q
        L_0x05fc:
            com.fasterxml.jackson.annotation.JsonInclude$Include r13 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS
            if (r12 == r13) goto L_0x0666
            com.fasterxml.jackson.annotation.JsonInclude$Include r13 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS
            if (r12 != r13) goto L_0x0606
            goto L_0x0666
        L_0x0606:
            int r12 = r12.ordinal()
            r13 = 2
            if (r12 == r13) goto L_0x0640
            r13 = 3
            if (r12 == r13) goto L_0x063d
            if (r12 == r1) goto L_0x0628
            if (r12 == r3) goto L_0x0615
            goto L_0x0649
        L_0x0615:
            java.lang.Class<?> r1 = r11.y
            r3 = 0
            java.lang.Object r1 = r8.V(r3, r1)
            if (r1 != 0) goto L_0x061f
            goto L_0x064a
        L_0x061f:
            boolean r3 = r8.W(r1)
            r20 = r1
            r21 = r3
            goto L_0x064e
        L_0x0628:
            java.lang.Object r1 = h0.b0.v.k0(r6)
            if (r1 == 0) goto L_0x064a
            java.lang.Class r3 = r1.getClass()
            boolean r3 = r3.isArray()
            if (r3 == 0) goto L_0x064a
            java.lang.Object r1 = i0.f.a.c.t.b.a(r1)
            goto L_0x064a
        L_0x063d:
            java.lang.Object r1 = com.fasterxml.jackson.databind.ser.std.MapSerializer.x
            goto L_0x064a
        L_0x0640:
            boolean r1 = r6.d()
            if (r1 == 0) goto L_0x0649
            java.lang.Object r1 = com.fasterxml.jackson.databind.ser.std.MapSerializer.x
            goto L_0x064a
        L_0x0649:
            r1 = 0
        L_0x064a:
            r20 = r1
            r21 = r2
        L_0x064e:
            if (r20 != 0) goto L_0x0653
            if (r21 != 0) goto L_0x0653
            goto L_0x0666
        L_0x0653:
            com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer r1 = new com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer
            i0.f.a.c.g<java.lang.Object> r3 = r5.b2
            i0.f.a.c.g<java.lang.Object> r6 = r5.c2
            r16 = r1
            r17 = r5
            r18 = r3
            r19 = r6
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x059b
        L_0x0666:
            r6 = r5
        L_0x0667:
            r25 = r6
            r6 = r2
            r2 = r25
            goto L_0x06dd
        L_0x066e:
            java.lang.Class<java.nio.ByteBuffer> r3 = java.nio.ByteBuffer.class
            boolean r3 = r3.isAssignableFrom(r5)
            if (r3 == 0) goto L_0x067d
            com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer r1 = new com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer
            r1.<init>()
            goto L_0x059b
        L_0x067d:
            java.lang.Class<java.net.InetAddress> r3 = java.net.InetAddress.class
            boolean r3 = r3.isAssignableFrom(r5)
            if (r3 == 0) goto L_0x068c
            com.fasterxml.jackson.databind.ser.std.InetAddressSerializer r1 = new com.fasterxml.jackson.databind.ser.std.InetAddressSerializer
            r1.<init>()
            goto L_0x059b
        L_0x068c:
            java.lang.Class<java.net.InetSocketAddress> r3 = java.net.InetSocketAddress.class
            boolean r3 = r3.isAssignableFrom(r5)
            if (r3 == 0) goto L_0x069b
            com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer r1 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer
            r1.<init>()
            goto L_0x059b
        L_0x069b:
            java.lang.Class<java.util.TimeZone> r3 = java.util.TimeZone.class
            boolean r3 = r3.isAssignableFrom(r5)
            if (r3 == 0) goto L_0x06aa
            com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer r1 = new com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer
            r1.<init>()
            goto L_0x059b
        L_0x06aa:
            java.lang.Class<java.nio.charset.Charset> r3 = java.nio.charset.Charset.class
            boolean r3 = r3.isAssignableFrom(r5)
            if (r3 == 0) goto L_0x06b6
            com.fasterxml.jackson.databind.ser.std.ToStringSerializer r1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.q
            goto L_0x059b
        L_0x06b6:
            java.lang.Class<java.lang.Number> r3 = java.lang.Number.class
            boolean r3 = r3.isAssignableFrom(r5)
            if (r3 == 0) goto L_0x06da
            r3 = 0
            com.fasterxml.jackson.annotation.JsonFormat$Value r3 = r10.b(r3)
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = r3.q
            int r3 = r3.ordinal()
            r5 = 3
            if (r3 == r5) goto L_0x06da
            if (r3 == r1) goto L_0x06da
            r1 = 8
            if (r3 == r1) goto L_0x06d6
            com.fasterxml.jackson.databind.ser.std.NumberSerializer r1 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.q
            goto L_0x059b
        L_0x06d6:
            com.fasterxml.jackson.databind.ser.std.ToStringSerializer r1 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.q
            goto L_0x059b
        L_0x06da:
            r1 = r2
        L_0x06db:
            r2 = 0
            r6 = r1
        L_0x06dd:
            if (r2 != 0) goto L_0x0c4c
            java.lang.Class<?> r1 = r0.c
            java.lang.String r2 = i0.f.a.c.t.f.d(r1)
            if (r2 != 0) goto L_0x06ee
            boolean r1 = i0.f.a.c.t.f.B(r1)
            if (r1 != 0) goto L_0x06ee
            goto L_0x06ef
        L_0x06ee:
            r6 = r4
        L_0x06ef:
            if (r6 != 0) goto L_0x06fb
            java.lang.Class<?> r1 = r0.c
            boolean r1 = i0.f.a.c.t.f.w(r1)
            if (r1 != 0) goto L_0x06fb
            r0 = 0
            goto L_0x0707
        L_0x06fb:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            com.fasterxml.jackson.databind.JavaType r2 = r10.a
            java.lang.Class<?> r2 = r2.c
            if (r2 != r1) goto L_0x070a
            i0.f.a.c.g r0 = r8.R(r1)
        L_0x0707:
            r2 = r0
            goto L_0x0bfb
        L_0x070a:
            java.lang.String r1 = h0.b0.v.D(r28)
            if (r1 == 0) goto L_0x0720
            com.fasterxml.jackson.databind.SerializationConfig r2 = r8.q
            java.lang.Class<?> r3 = r0.c
            java.lang.Class r2 = r2.a(r3)
            if (r2 != 0) goto L_0x0720
            com.fasterxml.jackson.databind.ser.impl.UnsupportedTypeSerializer r2 = new com.fasterxml.jackson.databind.ser.impl.UnsupportedTypeSerializer
            r2.<init>(r0, r1)
            goto L_0x0721
        L_0x0720:
            r2 = 0
        L_0x0721:
            if (r2 == 0) goto L_0x0725
            goto L_0x0bfb
        L_0x0725:
            com.fasterxml.jackson.databind.SerializationConfig r11 = r8.q
            i0.f.a.c.r.b r12 = new i0.f.a.c.r.b
            r12.<init>(r10)
            r12.c = r11
            r13 = r10
            i0.f.a.c.n.i r13 = (i0.f.a.c.n.i) r13
            java.util.List r1 = r13.h()
            com.fasterxml.jackson.databind.SerializationConfig r2 = r8.q
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r2.e()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Iterator r6 = r1.iterator()
        L_0x0744:
            boolean r14 = r6.hasNext()
            if (r14 == 0) goto L_0x078a
            java.lang.Object r14 = r6.next()
            i0.f.a.c.n.j r14 = (i0.f.a.c.n.j) r14
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r15 = r14.r()
            if (r15 != 0) goto L_0x075a
            r6.remove()
            goto L_0x0744
        L_0x075a:
            java.lang.Class r14 = r14.z()
            java.lang.Object r15 = r5.get(r14)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            if (r15 != 0) goto L_0x0780
            i0.f.a.c.k.b r15 = r2.f(r14)
            java.util.Objects.requireNonNull(r15)
            i0.f.a.c.b r15 = r2.n(r14)
            i0.f.a.c.n.i r15 = (i0.f.a.c.n.i) r15
            i0.f.a.c.n.b r15 = r15.f
            java.lang.Boolean r15 = r3.z0(r15)
            if (r15 != 0) goto L_0x077d
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
        L_0x077d:
            r5.put(r14, r15)
        L_0x0780:
            boolean r14 = r15.booleanValue()
            if (r14 == 0) goto L_0x0744
            r6.remove()
            goto L_0x0744
        L_0x078a:
            com.fasterxml.jackson.databind.MapperFeature r3 = com.fasterxml.jackson.databind.MapperFeature.REQUIRE_SETTERS_FOR_GETTERS
            boolean r3 = r2.q(r3)
            if (r3 == 0) goto L_0x07b2
            java.util.Iterator r3 = r1.iterator()
        L_0x0796:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x07b2
            java.lang.Object r5 = r3.next()
            i0.f.a.c.n.j r5 = (i0.f.a.c.n.j) r5
            boolean r6 = r5.i()
            if (r6 != 0) goto L_0x0796
            boolean r5 = r5.H()
            if (r5 != 0) goto L_0x0796
            r3.remove()
            goto L_0x0796
        L_0x07b2:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x07bd
            r1 = 0
            r30 = r9
            goto L_0x085b
        L_0x07bd:
            r3 = 0
            boolean r14 = r7.f(r2, r10, r3)
            i0.f.a.c.r.e r15 = new i0.f.a.c.r.e
            r15.<init>(r2, r10)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r2 = r1.size()
            r6.<init>(r2)
            java.util.Iterator r16 = r1.iterator()
        L_0x07d4:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0857
            java.lang.Object r1 = r16.next()
            r3 = r1
            i0.f.a.c.n.j r3 = (i0.f.a.c.n.j) r3
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r1 = r3.r()
            boolean r2 = r3.K()
            if (r2 == 0) goto L_0x0811
            if (r1 == 0) goto L_0x07d4
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r12.h
            if (r2 != 0) goto L_0x07f4
            r12.h = r1
            goto L_0x07d4
        L_0x07f4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Multiple type ids specified with "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r3 = r12.h
            r2.append(r3)
            java.lang.String r3 = " and "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0811:
            com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty r2 = r3.o()
            if (r2 == 0) goto L_0x0823
            com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty$Type r2 = r2.a
            com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty$Type r5 = com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.Type.BACK_REFERENCE
            if (r2 != r5) goto L_0x081f
            r2 = 1
            goto L_0x0820
        L_0x081f:
            r2 = r4
        L_0x0820:
            if (r2 == 0) goto L_0x0823
            goto L_0x07d4
        L_0x0823:
            boolean r2 = r1 instanceof com.fasterxml.jackson.databind.introspect.AnnotatedMethod
            if (r2 == 0) goto L_0x083e
            r17 = r1
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r17 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r17
            r1 = r26
            r2 = r27
            r4 = r15
            r5 = r14
            r30 = r9
            r9 = r6
            r6 = r17
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r1 = r1.g(r2, r3, r4, r5, r6)
            r9.add(r1)
            goto L_0x0851
        L_0x083e:
            r30 = r9
            r9 = r6
            r6 = r1
            com.fasterxml.jackson.databind.introspect.AnnotatedField r6 = (com.fasterxml.jackson.databind.introspect.AnnotatedField) r6
            r1 = r26
            r2 = r27
            r4 = r15
            r5 = r14
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r1 = r1.g(r2, r3, r4, r5, r6)
            r9.add(r1)
        L_0x0851:
            r4 = 0
            r6 = r9
            r9 = r30
            goto L_0x07d4
        L_0x0857:
            r30 = r9
            r9 = r6
            r1 = r9
        L_0x085b:
            if (r1 != 0) goto L_0x0863
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x08c0
        L_0x0863:
            int r2 = r1.size()
            r3 = 0
        L_0x0868:
            if (r3 >= r2) goto L_0x08c0
            java.lang.Object r4 = r1.get(r3)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r4 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter) r4
            i0.f.a.c.p.e r5 = r4.h2
            if (r5 == 0) goto L_0x08bd
            com.fasterxml.jackson.annotation.JsonTypeInfo$As r6 = r5.c()
            com.fasterxml.jackson.annotation.JsonTypeInfo$As r9 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY
            if (r6 == r9) goto L_0x087d
            goto L_0x08bd
        L_0x087d:
            java.lang.String r5 = r5.b()
            com.fasterxml.jackson.databind.PropertyName r5 = com.fasterxml.jackson.databind.PropertyName.a(r5)
            java.util.Iterator r6 = r1.iterator()
        L_0x0889:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x08bd
            java.lang.Object r9 = r6.next()
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r9 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter) r9
            if (r9 == r4) goto L_0x0889
            com.fasterxml.jackson.databind.PropertyName r14 = r9.y
            if (r14 == 0) goto L_0x08a0
            boolean r9 = r14.equals(r5)
            goto L_0x08b8
        L_0x08a0:
            com.fasterxml.jackson.core.io.SerializedString r9 = r9.x
            java.lang.String r9 = r9.d
            java.lang.String r14 = r5.q
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x08b7
            java.lang.String r9 = r5.x
            if (r9 == 0) goto L_0x08b2
            r9 = 1
            goto L_0x08b3
        L_0x08b2:
            r9 = 0
        L_0x08b3:
            if (r9 != 0) goto L_0x08b7
            r9 = 1
            goto L_0x08b8
        L_0x08b7:
            r9 = 0
        L_0x08b8:
            if (r9 == 0) goto L_0x0889
            r5 = 0
            r4.h2 = r5
        L_0x08bd:
            int r3 = r3 + 1
            goto L_0x0868
        L_0x08c0:
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r27.O()
            i0.f.a.c.n.b r3 = r13.f
            r2.a(r11, r3, r1)
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r7.q
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x08e9
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r7.q
            java.lang.Iterable r2 = r2.b()
            i0.f.a.c.t.c r2 = (i0.f.a.c.t.c) r2
        L_0x08d9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x08e9
            java.lang.Object r3 = r2.next()
            i0.f.a.c.r.c r3 = (i0.f.a.c.r.c) r3
            java.util.Objects.requireNonNull(r3)
            goto L_0x08d9
        L_0x08e9:
            com.fasterxml.jackson.databind.JavaType r2 = r10.a
            java.lang.Class<?> r2 = r2.c
            i0.f.a.c.n.b r3 = r13.f
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r2 = r11.x(r2, r3)
            if (r2 == 0) goto L_0x08fa
            java.util.Set r2 = r2.d()
            goto L_0x08fb
        L_0x08fa:
            r2 = 0
        L_0x08fb:
            com.fasterxml.jackson.databind.JavaType r3 = r10.a
            java.lang.Class<?> r3 = r3.c
            i0.f.a.c.n.b r3 = r13.f
            com.fasterxml.jackson.annotation.JsonIncludeProperties$Value r3 = r11.y(r3)
            if (r3 == 0) goto L_0x090a
            java.util.Set<java.lang.String> r3 = r3.d
            goto L_0x090b
        L_0x090a:
            r3 = 0
        L_0x090b:
            if (r3 != 0) goto L_0x0915
            if (r2 == 0) goto L_0x0933
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x0933
        L_0x0915:
            java.util.Iterator r4 = r1.iterator()
        L_0x0919:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0933
            java.lang.Object r5 = r4.next()
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r5 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter) r5
            com.fasterxml.jackson.core.io.SerializedString r5 = r5.x
            java.lang.String r5 = r5.d
            boolean r5 = h0.b0.v.Z1(r5, r2, r3)
            if (r5 == 0) goto L_0x0919
            r4.remove()
            goto L_0x0919
        L_0x0933:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r7.q
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x0953
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r7.q
            java.lang.Iterable r2 = r2.b()
            i0.f.a.c.t.c r2 = (i0.f.a.c.t.c) r2
        L_0x0943:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0953
            java.lang.Object r3 = r2.next()
            i0.f.a.c.r.c r3 = (i0.f.a.c.r.c) r3
            java.util.Objects.requireNonNull(r3)
            goto L_0x0943
        L_0x0953:
            i0.f.a.c.n.n r2 = r13.j
            if (r2 != 0) goto L_0x095a
            r2 = 0
            goto L_0x09d4
        L_0x095a:
            java.lang.Class<? extends com.fasterxml.jackson.annotation.ObjectIdGenerator<?>> r3 = r2.c
            java.lang.Class<com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator> r4 = com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator.class
            if (r3 != r4) goto L_0x09b5
            com.fasterxml.jackson.databind.PropertyName r3 = r2.b
            java.lang.String r3 = r3.q
            int r4 = r1.size()
            r5 = 0
        L_0x0969:
            if (r5 == r4) goto L_0x0996
            java.lang.Object r6 = r1.get(r5)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r6 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter) r6
            com.fasterxml.jackson.core.io.SerializedString r9 = r6.x
            java.lang.String r9 = r9.d
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L_0x0993
            if (r5 <= 0) goto L_0x0984
            r1.remove(r5)
            r3 = 0
            r1.add(r3, r6)
        L_0x0984:
            com.fasterxml.jackson.databind.JavaType r3 = r6.Y1
            com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator r4 = new com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator
            r4.<init>((i0.f.a.c.n.n) r2, (com.fasterxml.jackson.databind.ser.BeanPropertyWriter) r6)
            boolean r2 = r2.f
            r5 = 0
            i0.f.a.c.r.k.a r2 = i0.f.a.c.r.k.a.a(r3, r5, r4, r2)
            goto L_0x09d4
        L_0x0993:
            int r5 = r5 + 1
            goto L_0x0969
        L_0x0996:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.fasterxml.jackson.databind.JavaType r2 = r10.a
            java.lang.String r2 = i0.f.a.c.t.f.t(r2)
            r4 = 0
            r1[r4] = r2
            java.lang.String r2 = i0.f.a.c.t.f.D(r3)
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "Invalid Object Id definition for %s: cannot find property with name %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x09b5:
            r4 = 0
            com.fasterxml.jackson.databind.JavaType r3 = r8.f(r3)
            com.fasterxml.jackson.databind.type.TypeFactory r5 = r27.i()
            java.lang.Class<com.fasterxml.jackson.annotation.ObjectIdGenerator> r6 = com.fasterxml.jackson.annotation.ObjectIdGenerator.class
            com.fasterxml.jackson.databind.JavaType[] r3 = r5.p(r3, r6)
            r3 = r3[r4]
            i0.f.a.c.n.b r4 = r13.f
            com.fasterxml.jackson.annotation.ObjectIdGenerator r4 = r8.l(r4, r2)
            com.fasterxml.jackson.databind.PropertyName r5 = r2.b
            boolean r2 = r2.f
            i0.f.a.c.r.k.a r2 = i0.f.a.c.r.k.a.a(r3, r5, r4, r2)
        L_0x09d4:
            r12.i = r2
            r12.d = r1
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r11.e()
            i0.f.a.c.n.b r2 = r13.f
            java.lang.Object r1 = r1.n(r2)
            r12.g = r1
            i0.f.a.c.n.o r1 = r13.c
            if (r1 == 0) goto L_0x0aa3
            boolean r2 = r1.i
            if (r2 != 0) goto L_0x09ef
            r1.h()
        L_0x09ef:
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r2 = r1.m
            if (r2 == 0) goto L_0x0a1e
            int r2 = r2.size()
            r3 = 1
            if (r2 > r3) goto L_0x0a03
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r1 = r1.m
            java.lang.Object r1 = r1.getFirst()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r1 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r1
            goto L_0x0a1f
        L_0x0a03:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r2 = r1.m
            r4 = 0
            java.lang.Object r2 = r2.get(r4)
            r0[r4] = r2
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r2 = r1.m
            java.lang.Object r2 = r2.get(r3)
            r0[r3] = r2
            java.lang.String r2 = "Multiple 'any-getter' methods defined (%s vs %s)"
            r1.i(r2, r0)
            r0 = 0
            throw r0
        L_0x0a1e:
            r1 = 0
        L_0x0a1f:
            if (r1 == 0) goto L_0x0a45
            java.lang.Class r2 = r1.e()
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L_0x0a2f
            goto L_0x0aa4
        L_0x0a2f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r1 = r1.d()
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "Invalid 'any-getter' annotation on method %s(): return type is not instance of java.util.Map"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x0a45:
            i0.f.a.c.n.o r1 = r13.c
            boolean r2 = r1.i
            if (r2 != 0) goto L_0x0a4e
            r1.h()
        L_0x0a4e:
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r2 = r1.n
            if (r2 == 0) goto L_0x0a7d
            int r2 = r2.size()
            r3 = 1
            if (r2 > r3) goto L_0x0a62
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r1 = r1.n
            java.lang.Object r1 = r1.getFirst()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r1 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r1
            goto L_0x0a7e
        L_0x0a62:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r2 = r1.n
            r4 = 0
            java.lang.Object r2 = r2.get(r4)
            r0[r4] = r2
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r2 = r1.n
            java.lang.Object r2 = r2.get(r3)
            r0[r3] = r2
            java.lang.String r2 = "Multiple 'any-getter' fields defined (%s vs %s)"
            r1.i(r2, r0)
            r0 = 0
            throw r0
        L_0x0a7d:
            r1 = 0
        L_0x0a7e:
            if (r1 == 0) goto L_0x0aa3
            java.lang.Class r2 = r1.e()
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L_0x0a8d
            goto L_0x0aa4
        L_0x0a8d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r1 = r1.d()
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "Invalid 'any-getter' annotation on field '%s': type is not instance of java.util.Map"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x0aa3:
            r1 = 0
        L_0x0aa4:
            if (r1 == 0) goto L_0x0ae7
            com.fasterxml.jackson.databind.JavaType r16 = r1.f()
            com.fasterxml.jackson.databind.JavaType r2 = r16.l()
            i0.f.a.c.p.e r18 = r7.b(r11, r2)
            i0.f.a.c.g r3 = r7.e(r8, r1)
            if (r3 != 0) goto L_0x0aca
            r14 = 0
            com.fasterxml.jackson.databind.MapperFeature r3 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING
            boolean r17 = r11.q(r3)
            r19 = 0
            r20 = 0
            r21 = 0
            r15 = 0
            com.fasterxml.jackson.databind.ser.std.MapSerializer r3 = com.fasterxml.jackson.databind.ser.std.MapSerializer.x(r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0aca:
            java.lang.String r4 = r1.d()
            com.fasterxml.jackson.databind.PropertyName r15 = com.fasterxml.jackson.databind.PropertyName.a(r4)
            com.fasterxml.jackson.databind.BeanProperty$Std r4 = new com.fasterxml.jackson.databind.BeanProperty$Std
            r17 = 0
            com.fasterxml.jackson.databind.PropertyMetadata r19 = com.fasterxml.jackson.databind.PropertyMetadata.d
            r14 = r4
            r16 = r2
            r18 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            i0.f.a.c.r.a r2 = new i0.f.a.c.r.a
            r2.<init>(r4, r1, r3)
            r12.f = r2
        L_0x0ae7:
            java.util.List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> r1 = r12.d
            com.fasterxml.jackson.databind.MapperFeature r2 = com.fasterxml.jackson.databind.MapperFeature.DEFAULT_VIEW_INCLUSION
            boolean r2 = r11.q(r2)
            int r3 = r1.size()
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[r3]
            r5 = 0
            r6 = 0
        L_0x0af7:
            if (r5 >= r3) goto L_0x0b2b
            java.lang.Object r9 = r1.get(r5)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r9 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter) r9
            java.lang.Class<?>[] r14 = r9.l2
            if (r14 == 0) goto L_0x0b20
            int r15 = r14.length
            if (r15 != 0) goto L_0x0b07
            goto L_0x0b20
        L_0x0b07:
            int r6 = r6 + 1
            int r15 = r14.length
            r16 = r1
            r1 = 1
            if (r15 != r1) goto L_0x0b18
            com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView r1 = new com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView
            r15 = 0
            r14 = r14[r15]
            r1.<init>(r9, r14)
            goto L_0x0b1d
        L_0x0b18:
            com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView r1 = new com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView
            r1.<init>(r9, r14)
        L_0x0b1d:
            r4[r5] = r1
            goto L_0x0b26
        L_0x0b20:
            r16 = r1
            if (r2 == 0) goto L_0x0b26
            r4[r5] = r9
        L_0x0b26:
            int r5 = r5 + 1
            r1 = r16
            goto L_0x0af7
        L_0x0b2b:
            if (r2 == 0) goto L_0x0b30
            if (r6 != 0) goto L_0x0b30
            goto L_0x0b3a
        L_0x0b30:
            java.util.List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> r1 = r12.d
            int r1 = r1.size()
            if (r3 != r1) goto L_0x0c29
            r12.e = r4
        L_0x0b3a:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r7.q
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0b5a
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r7.q
            java.lang.Iterable r1 = r1.b()
            i0.f.a.c.t.c r1 = (i0.f.a.c.t.c) r1
        L_0x0b4a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0b5a
            java.lang.Object r2 = r1.next()
            i0.f.a.c.r.c r2 = (i0.f.a.c.r.c) r2
            java.util.Objects.requireNonNull(r2)
            goto L_0x0b4a
        L_0x0b5a:
            i0.f.a.c.g r1 = r12.a()     // Catch:{ RuntimeException -> 0x0c06 }
            if (r1 != 0) goto L_0x0bfa
            boolean r1 = r28.R()
            if (r1 == 0) goto L_0x0b74
            i0.f.a.c.b r0 = r12.b
            com.fasterxml.jackson.databind.JavaType r0 = r0.a
            com.fasterxml.jackson.databind.ser.BeanSerializer r1 = new com.fasterxml.jackson.databind.ser.BeanSerializer
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r2 = com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.q
            r3 = 0
            r1.<init>(r0, r12, r2, r3)
            goto L_0x0bfa
        L_0x0b74:
            java.lang.Class<?> r1 = r0.c
            java.lang.Class<java.util.Iterator> r2 = java.util.Iterator.class
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 == 0) goto L_0x0ba3
            com.fasterxml.jackson.databind.cfg.BaseSettings r1 = r11.d
            com.fasterxml.jackson.databind.type.TypeFactory r1 = r1.d
            java.lang.Class<java.util.Iterator> r2 = java.util.Iterator.class
            com.fasterxml.jackson.databind.JavaType[] r0 = r1.p(r0, r2)
            if (r0 == 0) goto L_0x0b93
            int r1 = r0.length
            r2 = 1
            if (r1 == r2) goto L_0x0b8f
            goto L_0x0b93
        L_0x0b8f:
            r1 = 0
            r0 = r0[r1]
            goto L_0x0b97
        L_0x0b93:
            com.fasterxml.jackson.databind.JavaType r0 = com.fasterxml.jackson.databind.type.TypeFactory.v()
        L_0x0b97:
            com.fasterxml.jackson.databind.ser.impl.IteratorSerializer r1 = new com.fasterxml.jackson.databind.ser.impl.IteratorSerializer
            i0.f.a.c.p.e r2 = r7.b(r11, r0)
            r9 = r30
            r1.<init>(r0, r9, r2)
            goto L_0x0bdd
        L_0x0ba3:
            r9 = r30
            java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 == 0) goto L_0x0bd0
            com.fasterxml.jackson.databind.cfg.BaseSettings r1 = r11.d
            com.fasterxml.jackson.databind.type.TypeFactory r1 = r1.d
            java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
            com.fasterxml.jackson.databind.JavaType[] r0 = r1.p(r0, r2)
            if (r0 == 0) goto L_0x0bc2
            int r1 = r0.length
            r2 = 1
            if (r1 == r2) goto L_0x0bbe
            goto L_0x0bc2
        L_0x0bbe:
            r1 = 0
            r0 = r0[r1]
            goto L_0x0bc6
        L_0x0bc2:
            com.fasterxml.jackson.databind.JavaType r0 = com.fasterxml.jackson.databind.type.TypeFactory.v()
        L_0x0bc6:
            com.fasterxml.jackson.databind.ser.std.IterableSerializer r1 = new com.fasterxml.jackson.databind.ser.std.IterableSerializer
            i0.f.a.c.p.e r2 = r7.b(r11, r0)
            r1.<init>(r0, r9, r2)
            goto L_0x0bdd
        L_0x0bd0:
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x0bdb
            com.fasterxml.jackson.databind.ser.std.ToStringSerializer r0 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.q
            goto L_0x0bdc
        L_0x0bdb:
            r0 = 0
        L_0x0bdc:
            r1 = r0
        L_0x0bdd:
            if (r1 != 0) goto L_0x0bfa
            i0.f.a.c.n.b r0 = r13.f
            i0.f.a.c.t.a r0 = r0.d2
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0beb
            r0 = 1
            goto L_0x0bec
        L_0x0beb:
            r0 = 0
        L_0x0bec:
            if (r0 == 0) goto L_0x0bfa
            i0.f.a.c.b r0 = r12.b
            com.fasterxml.jackson.databind.JavaType r0 = r0.a
            com.fasterxml.jackson.databind.ser.BeanSerializer r1 = new com.fasterxml.jackson.databind.ser.BeanSerializer
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r2 = com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.q
            r3 = 0
            r1.<init>(r0, r12, r2, r3)
        L_0x0bfa:
            r2 = r1
        L_0x0bfb:
            if (r2 != 0) goto L_0x0c4c
            com.fasterxml.jackson.databind.JavaType r0 = r10.a
            java.lang.Class<?> r0 = r0.c
            i0.f.a.c.g r2 = r8.R(r0)
            goto L_0x0c4c
        L_0x0c06:
            r0 = move-exception
            r1 = r0
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.fasterxml.jackson.databind.JavaType r2 = r10.a
            r3 = 0
            r0[r3] = r2
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            r3 = 1
            r0[r3] = r2
            java.lang.String r1 = r1.getMessage()
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "Failed to construct BeanSerializer for %s: (%s) %s"
            r8.a0(r10, r1, r0)
            r0 = 0
            throw r0
        L_0x0c29:
            r0 = 2
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r3 = 0
            r0[r3] = r2
            java.util.List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> r2 = r12.d
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r0[r3] = r2
            java.lang.String r2 = "Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r1.<init>(r0)
            throw r1
        L_0x0c4c:
            if (r2 == 0) goto L_0x0c6e
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r0 = r7.q
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0c6e
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r0 = r7.q
            java.lang.Iterable r0 = r0.b()
            i0.f.a.c.t.c r0 = (i0.f.a.c.t.c) r0
        L_0x0c5e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0c6e
            java.lang.Object r1 = r0.next()
            i0.f.a.c.r.c r1 = (i0.f.a.c.r.c) r1
            java.util.Objects.requireNonNull(r1)
            goto L_0x0c5e
        L_0x0c6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BeanSerializerFactory.h(i0.f.a.c.i, com.fasterxml.jackson.databind.JavaType, i0.f.a.c.b, boolean):i0.f.a.c.g");
    }

    public Iterable<j> i() {
        return new c(this.q.q);
    }
}
