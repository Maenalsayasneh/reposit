package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import i0.f.a.c.b;
import i0.f.a.c.d;
import i0.f.a.c.l.a;
import i0.f.a.c.n.i;
import i0.f.a.c.n.j;
import i0.f.a.c.n.o;
import i0.f.a.c.t.c;
import i0.f.a.c.t.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public class BeanDeserializerFactory extends BasicDeserializerFactory implements Serializable {
    public static final Class<?>[] Y1 = {Throwable.class};
    public static final BeanDeserializerFactory Z1 = new BeanDeserializerFactory(new DeserializerFactoryConfig());

    public BeanDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        super(deserializerFactoryConfig);
    }

    public void A(DeserializationContext deserializationContext, b bVar, a aVar) throws JsonMappingException {
        String str;
        ArrayList<j> arrayList = null;
        HashSet hashSet = null;
        for (j next : ((i) bVar).h()) {
            AnnotationIntrospector.ReferenceProperty o = next.o();
            if (o != null) {
                if (!(o.a == AnnotationIntrospector.ReferenceProperty.Type.BACK_REFERENCE)) {
                    continue;
                } else {
                    String str2 = o.b;
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        hashSet = new HashSet();
                        hashSet.add(str2);
                    } else if (!hashSet.add(str2)) {
                        StringBuilder P0 = i0.d.a.a.a.P0("Multiple back-reference properties with name ");
                        P0.append(f.D(str2));
                        throw new IllegalArgumentException(P0.toString());
                    }
                    arrayList.add(next);
                }
            }
        }
        if (arrayList != null) {
            for (j jVar : arrayList) {
                AnnotationIntrospector.ReferenceProperty o2 = jVar.o();
                if (o2 == null) {
                    str = null;
                } else {
                    str = o2.b;
                }
                SettableBeanProperty H = H(deserializationContext, bVar, jVar, jVar.y());
                if (aVar.f == null) {
                    aVar.f = new HashMap<>(4);
                }
                if (aVar.a.b()) {
                    H.n(aVar.a);
                }
                aVar.f.put(str, H);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v54, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: i0.f.a.c.h} */
    /* JADX WARNING: type inference failed for: r7v36, types: [com.fasterxml.jackson.databind.introspect.AnnotatedMember] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x021b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C(com.fasterxml.jackson.databind.DeserializationContext r24, i0.f.a.c.b r25, i0.f.a.c.l.a r26) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.fasterxml.jackson.databind.JavaType r5 = r2.a
            boolean r5 = r5.C()
            r6 = 1
            r5 = r5 ^ r6
            r7 = 0
            if (r5 == 0) goto L_0x001e
            com.fasterxml.jackson.databind.deser.ValueInstantiator r5 = r3.i
            com.fasterxml.jackson.databind.DeserializationConfig r8 = r1.q
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r5 = r5.M(r8)
            goto L_0x001f
        L_0x001e:
            r5 = r7
        L_0x001f:
            r8 = 0
            if (r5 == 0) goto L_0x0024
            r9 = r6
            goto L_0x0025
        L_0x0024:
            r9 = r8
        L_0x0025:
            com.fasterxml.jackson.databind.DeserializationConfig r10 = r1.q
            com.fasterxml.jackson.databind.JavaType r11 = r2.a
            java.lang.Class<?> r11 = r11.c
            r12 = r2
            i0.f.a.c.n.i r12 = (i0.f.a.c.n.i) r12
            i0.f.a.c.n.b r13 = r12.f
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r10 = r10.x(r11, r13)
            if (r10 == 0) goto L_0x0052
            boolean r11 = r10.q
            r3.l = r11
            java.util.Set r10 = r10.c()
            java.util.Iterator r11 = r10.iterator()
        L_0x0042:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0056
            java.lang.Object r13 = r11.next()
            java.lang.String r13 = (java.lang.String) r13
            r3.d(r13)
            goto L_0x0042
        L_0x0052:
            java.util.Set r10 = java.util.Collections.emptySet()
        L_0x0056:
            com.fasterxml.jackson.databind.DeserializationConfig r11 = r1.q
            com.fasterxml.jackson.databind.JavaType r13 = r2.a
            java.lang.Class<?> r13 = r13.c
            i0.f.a.c.n.b r13 = r12.f
            com.fasterxml.jackson.annotation.JsonIncludeProperties$Value r11 = r11.y(r13)
            if (r11 == 0) goto L_0x0089
            java.util.Set<java.lang.String> r11 = r11.d
            if (r11 == 0) goto L_0x008a
            java.util.Iterator r13 = r11.iterator()
        L_0x006c:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x008a
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            java.util.HashSet<java.lang.String> r15 = r3.h
            if (r15 != 0) goto L_0x0083
            java.util.HashSet r15 = new java.util.HashSet
            r15.<init>()
            r3.h = r15
        L_0x0083:
            java.util.HashSet<java.lang.String> r15 = r3.h
            r15.add(r14)
            goto L_0x006c
        L_0x0089:
            r11 = r7
        L_0x008a:
            i0.f.a.c.n.o r13 = r12.c
            r14 = 2
            if (r13 == 0) goto L_0x0144
            boolean r15 = r13.i
            if (r15 != 0) goto L_0x0096
            r13.h()
        L_0x0096:
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r15 = r13.o
            if (r15 == 0) goto L_0x00c1
            int r15 = r15.size()
            if (r15 > r6) goto L_0x00a9
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r13 = r13.o
            java.lang.Object r13 = r13.getFirst()
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r13 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r13
            goto L_0x00c2
        L_0x00a9:
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r2 = r13.o
            java.lang.Object r2 = r2.get(r8)
            r1[r8] = r2
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r2 = r13.o
            java.lang.Object r2 = r2.get(r6)
            r1[r6] = r2
            java.lang.String r2 = "Multiple 'any-setter' methods defined (%s vs %s)"
            r13.i(r2, r1)
            throw r7
        L_0x00c1:
            r13 = r7
        L_0x00c2:
            if (r13 == 0) goto L_0x00ea
            java.lang.Class r15 = r13.z(r8)
            if (r15 == r4) goto L_0x0145
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            if (r15 != r7) goto L_0x00d0
            goto L_0x0145
        L_0x00d0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Object[] r2 = new java.lang.Object[r14]
            java.lang.String r3 = r13.d()
            r2[r8] = r3
            java.lang.String r3 = r15.getName()
            r2[r6] = r3
            java.lang.String r3 = "Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x00ea:
            i0.f.a.c.n.o r7 = r12.c
            boolean r13 = r7.i
            if (r13 != 0) goto L_0x00f3
            r7.h()
        L_0x00f3:
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r13 = r7.p
            if (r13 == 0) goto L_0x0120
            int r13 = r13.size()
            if (r13 > r6) goto L_0x0107
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r7 = r7.p
            java.lang.Object r7 = r7.getFirst()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r7 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r7
            r13 = r7
            goto L_0x0121
        L_0x0107:
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r2 = r7.p
            java.lang.Object r2 = r2.get(r8)
            r1[r8] = r2
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r2 = r7.p
            java.lang.Object r2 = r2.get(r6)
            r1[r6] = r2
            java.lang.String r2 = "Multiple 'any-setter' fields defined (%s vs %s)"
            r7.i(r2, r1)
            r1 = 0
            throw r1
        L_0x0120:
            r13 = 0
        L_0x0121:
            if (r13 == 0) goto L_0x0144
            java.lang.Class r7 = r13.e()
            java.lang.Class<java.util.Map> r15 = java.util.Map.class
            boolean r7 = r15.isAssignableFrom(r7)
            if (r7 == 0) goto L_0x0130
            goto L_0x0145
        L_0x0130:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r3 = r13.d()
            r2[r8] = r3
            java.lang.String r3 = "Invalid 'any-setter' annotation on field '%s': type is not instance of java.util.Map"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x0144:
            r13 = 0
        L_0x0145:
            if (r13 == 0) goto L_0x021b
            boolean r7 = r13 instanceof com.fasterxml.jackson.databind.introspect.AnnotatedMethod
            if (r7 == 0) goto L_0x0175
            r7 = r13
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r7 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r7
            com.fasterxml.jackson.databind.JavaType r15 = r7.y(r8)
            com.fasterxml.jackson.databind.JavaType r7 = r7.y(r6)
            com.fasterxml.jackson.databind.JavaType r7 = r0.z(r1, r13, r7)
            com.fasterxml.jackson.databind.BeanProperty$Std r22 = new com.fasterxml.jackson.databind.BeanProperty$Std
            java.lang.String r16 = r13.d()
            com.fasterxml.jackson.databind.PropertyName r17 = com.fasterxml.jackson.databind.PropertyName.a(r16)
            r19 = 0
            com.fasterxml.jackson.databind.PropertyMetadata r21 = com.fasterxml.jackson.databind.PropertyMetadata.d
            r16 = r22
            r18 = r7
            r20 = r13
            r16.<init>(r17, r18, r19, r20, r21)
        L_0x0171:
            r14 = r7
            r7 = r22
            goto L_0x01a2
        L_0x0175:
            boolean r7 = r13 instanceof com.fasterxml.jackson.databind.introspect.AnnotatedField
            if (r7 == 0) goto L_0x0205
            r7 = r13
            com.fasterxml.jackson.databind.introspect.AnnotatedField r7 = (com.fasterxml.jackson.databind.introspect.AnnotatedField) r7
            com.fasterxml.jackson.databind.JavaType r7 = r7.f()
            com.fasterxml.jackson.databind.JavaType r18 = r0.z(r1, r13, r7)
            com.fasterxml.jackson.databind.JavaType r15 = r18.q()
            com.fasterxml.jackson.databind.JavaType r7 = r18.l()
            com.fasterxml.jackson.databind.BeanProperty$Std r22 = new com.fasterxml.jackson.databind.BeanProperty$Std
            java.lang.String r16 = r13.d()
            com.fasterxml.jackson.databind.PropertyName r17 = com.fasterxml.jackson.databind.PropertyName.a(r16)
            r19 = 0
            com.fasterxml.jackson.databind.PropertyMetadata r21 = com.fasterxml.jackson.databind.PropertyMetadata.d
            r16 = r22
            r20 = r13
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x0171
        L_0x01a2:
            i0.f.a.c.h r16 = r0.x(r1, r13)
            if (r16 != 0) goto L_0x01ae
            java.lang.Object r8 = r15.q
            r16 = r8
            i0.f.a.c.h r16 = (i0.f.a.c.h) r16
        L_0x01ae:
            r8 = r16
            if (r8 != 0) goto L_0x01b7
            i0.f.a.c.h r8 = r1.A(r15, r7)
            goto L_0x01c1
        L_0x01b7:
            boolean r15 = r8 instanceof i0.f.a.c.l.d
            if (r15 == 0) goto L_0x01c1
            i0.f.a.c.l.d r8 = (i0.f.a.c.l.d) r8
            i0.f.a.c.h r8 = r8.a(r1, r7)
        L_0x01c1:
            r20 = r8
            com.fasterxml.jackson.databind.AnnotationIntrospector r8 = r24.G()
            if (r8 == 0) goto L_0x01d4
            java.lang.Object r8 = r8.c(r13)
            if (r8 == 0) goto L_0x01d4
            i0.f.a.c.d r8 = r1.v(r13, r8)
            goto L_0x01d5
        L_0x01d4:
            r8 = 0
        L_0x01d5:
            if (r8 != 0) goto L_0x01db
            java.lang.Object r8 = r14.q
            i0.f.a.c.d r8 = (i0.f.a.c.d) r8
        L_0x01db:
            if (r8 == 0) goto L_0x01e1
            i0.f.a.c.d r8 = r1.Q(r8, r7, r14)
        L_0x01e1:
            r21 = r8
            java.lang.Object r8 = r14.x
            r22 = r8
            i0.f.a.c.p.b r22 = (i0.f.a.c.p.b) r22
            com.fasterxml.jackson.databind.deser.SettableAnyProperty r8 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty
            r16 = r8
            r17 = r7
            r18 = r13
            r19 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22)
            com.fasterxml.jackson.databind.deser.SettableAnyProperty r7 = r3.k
            if (r7 != 0) goto L_0x01fd
            r3.k = r8
            goto L_0x023f
        L_0x01fd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "_anySetter already set to non-null"
            r1.<init>(r2)
            throw r1
        L_0x0205:
            com.fasterxml.jackson.databind.JavaType r2 = r2.a
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.Class r4 = r13.getClass()
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "Unrecognized mutator type for any setter: %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r1.n(r2, r3)
            r1 = 0
            throw r1
        L_0x021b:
            i0.f.a.c.n.o r7 = r12.c
            if (r7 != 0) goto L_0x0221
            r7 = 0
            goto L_0x0223
        L_0x0221:
            java.util.HashSet<java.lang.String> r7 = r7.s
        L_0x0223:
            if (r7 != 0) goto L_0x0229
            java.util.Set r7 = java.util.Collections.emptySet()
        L_0x0229:
            if (r7 == 0) goto L_0x023f
            java.util.Iterator r7 = r7.iterator()
        L_0x022f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x023f
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            r3.d(r8)
            goto L_0x022f
        L_0x023f:
            com.fasterxml.jackson.databind.MapperFeature r7 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS
            boolean r7 = r1.e0(r7)
            if (r7 == 0) goto L_0x0251
            com.fasterxml.jackson.databind.MapperFeature r7 = com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_GETTERS
            boolean r7 = r1.e0(r7)
            if (r7 == 0) goto L_0x0251
            r7 = r6
            goto L_0x0252
        L_0x0251:
            r7 = 0
        L_0x0252:
            java.util.List r8 = r12.h()
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = r8.size()
            r14 = 4
            int r13 = java.lang.Math.max(r14, r13)
            r12.<init>(r13)
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x026d:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x02ef
            java.lang.Object r14 = r8.next()
            i0.f.a.c.n.j r14 = (i0.f.a.c.n.j) r14
            java.lang.String r15 = r14.getName()
            boolean r16 = h0.b0.v.Z1(r15, r10, r11)
            if (r16 == 0) goto L_0x0284
            goto L_0x026d
        L_0x0284:
            boolean r16 = r14.D()
            if (r16 != 0) goto L_0x02e1
            java.lang.Class r6 = r14.z()
            if (r6 == 0) goto L_0x02e1
            r17 = r8
            com.fasterxml.jackson.databind.DeserializationConfig r8 = r1.q
            java.lang.Object r18 = r13.get(r6)
            java.lang.Boolean r18 = (java.lang.Boolean) r18
            if (r18 == 0) goto L_0x02a3
            boolean r6 = r18.booleanValue()
            r18 = r4
            goto L_0x02db
        L_0x02a3:
            if (r6 == r4) goto L_0x02d0
            boolean r18 = r6.isPrimitive()
            if (r18 == 0) goto L_0x02ac
            goto L_0x02d0
        L_0x02ac:
            r18 = r4
            com.fasterxml.jackson.databind.cfg.ConfigOverrides r4 = r8.e2
            i0.f.a.c.k.b r4 = r4.a(r6)
            if (r4 != 0) goto L_0x02b8
            i0.f.a.c.k.b r4 = com.fasterxml.jackson.databind.cfg.MapperConfigBase.q
        L_0x02b8:
            java.util.Objects.requireNonNull(r4)
            i0.f.a.c.b r4 = r8.n(r6)
            com.fasterxml.jackson.databind.AnnotationIntrospector r8 = r8.e()
            i0.f.a.c.n.i r4 = (i0.f.a.c.n.i) r4
            i0.f.a.c.n.b r4 = r4.f
            java.lang.Boolean r4 = r8.z0(r4)
            if (r4 != 0) goto L_0x02d4
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            goto L_0x02d4
        L_0x02d0:
            r18 = r4
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L_0x02d4:
            r13.put(r6, r4)
            boolean r6 = r4.booleanValue()
        L_0x02db:
            if (r6 == 0) goto L_0x02e5
            r3.d(r15)
            goto L_0x02e8
        L_0x02e1:
            r18 = r4
            r17 = r8
        L_0x02e5:
            r12.add(r14)
        L_0x02e8:
            r8 = r17
            r4 = r18
            r6 = 1
            goto L_0x026d
        L_0x02ef:
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r4 = r0.y
            boolean r4 = r4.c()
            if (r4 == 0) goto L_0x030f
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r4 = r0.y
            java.lang.Iterable r4 = r4.a()
            i0.f.a.c.t.c r4 = (i0.f.a.c.t.c) r4
        L_0x02ff:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x030f
            java.lang.Object r6 = r4.next()
            i0.f.a.c.l.b r6 = (i0.f.a.c.l.b) r6
            java.util.Objects.requireNonNull(r6)
            goto L_0x02ff
        L_0x030f:
            java.util.Iterator r4 = r12.iterator()
        L_0x0313:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0415
            java.lang.Object r6 = r4.next()
            i0.f.a.c.n.j r6 = (i0.f.a.c.n.j) r6
            boolean r8 = r6.G()
            if (r8 == 0) goto L_0x0333
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r8 = r6.B()
            r10 = 0
            com.fasterxml.jackson.databind.JavaType r8 = r8.y(r10)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r8 = r0.H(r1, r2, r6, r8)
            goto L_0x0390
        L_0x0333:
            boolean r8 = r6.E()
            if (r8 == 0) goto L_0x0346
            com.fasterxml.jackson.databind.introspect.AnnotatedField r8 = r6.u()
            com.fasterxml.jackson.databind.JavaType r8 = r8.f()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r8 = r0.H(r1, r2, r6, r8)
            goto L_0x0390
        L_0x0346:
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r8 = r6.v()
            if (r8 == 0) goto L_0x038f
            if (r7 == 0) goto L_0x037c
            java.lang.Class r8 = r8.e()
            java.lang.Class<java.util.Collection> r10 = java.util.Collection.class
            boolean r10 = r10.isAssignableFrom(r8)
            if (r10 != 0) goto L_0x0365
            java.lang.Class<java.util.Map> r10 = java.util.Map.class
            boolean r8 = r10.isAssignableFrom(r8)
            if (r8 == 0) goto L_0x0363
            goto L_0x0365
        L_0x0363:
            r8 = 0
            goto L_0x0366
        L_0x0365:
            r8 = 1
        L_0x0366:
            if (r8 == 0) goto L_0x037c
            java.lang.String r8 = r6.getName()
            java.util.HashSet<java.lang.String> r10 = r3.g
            java.util.HashSet<java.lang.String> r11 = r3.h
            boolean r8 = h0.b0.v.Z1(r8, r10, r11)
            if (r8 == 0) goto L_0x0377
            goto L_0x038f
        L_0x0377:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r8 = r0.I(r1, r2, r6)
            goto L_0x0390
        L_0x037c:
            boolean r8 = r6.D()
            if (r8 != 0) goto L_0x038f
            com.fasterxml.jackson.databind.PropertyMetadata r8 = r6.f()
            com.fasterxml.jackson.databind.PropertyMetadata$a r8 = r8.a2
            if (r8 == 0) goto L_0x038f
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r8 = r0.I(r1, r2, r6)
            goto L_0x0390
        L_0x038f:
            r8 = 0
        L_0x0390:
            if (r9 == 0) goto L_0x03fd
            boolean r10 = r6.D()
            if (r10 == 0) goto L_0x03fd
            java.lang.String r10 = r6.getName()
            int r11 = r5.length
            r12 = 0
        L_0x039e:
            if (r12 >= r11) goto L_0x03b7
            r13 = r5[r12]
            com.fasterxml.jackson.databind.PropertyName r14 = r13.x
            java.lang.String r14 = r14.q
            boolean r14 = r10.equals(r14)
            if (r14 == 0) goto L_0x03b4
            boolean r14 = r13 instanceof com.fasterxml.jackson.databind.deser.CreatorProperty
            if (r14 == 0) goto L_0x03b4
            r11 = r13
            com.fasterxml.jackson.databind.deser.CreatorProperty r11 = (com.fasterxml.jackson.databind.deser.CreatorProperty) r11
            goto L_0x03b8
        L_0x03b4:
            int r12 = r12 + 1
            goto L_0x039e
        L_0x03b7:
            r11 = 0
        L_0x03b8:
            if (r11 != 0) goto L_0x03e3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r5.length
            r7 = 0
        L_0x03c1:
            if (r7 >= r4) goto L_0x03cf
            r8 = r5[r7]
            com.fasterxml.jackson.databind.PropertyName r8 = r8.x
            java.lang.String r8 = r8.q
            r3.add(r8)
            int r7 = r7 + 1
            goto L_0x03c1
        L_0x03cf:
            r12 = 2
            java.lang.Object[] r4 = new java.lang.Object[r12]
            java.lang.String r5 = i0.f.a.c.t.f.D(r10)
            r10 = 0
            r4[r10] = r5
            r13 = 1
            r4[r13] = r3
            java.lang.String r3 = "Could not find creator property with name %s (known Creator properties: %s)"
            r1.i0(r2, r6, r3, r4)
            r14 = 0
            throw r14
        L_0x03e3:
            r10 = 0
            r12 = 2
            r13 = 1
            r14 = 0
            if (r8 == 0) goto L_0x03eb
            r11.j2 = r8
        L_0x03eb:
            java.lang.Class[] r6 = r6.q()
            if (r6 != 0) goto L_0x03f5
            java.lang.Class[] r6 = r25.a()
        L_0x03f5:
            r11.M(r6)
            r3.e(r11)
            goto L_0x0313
        L_0x03fd:
            r10 = 0
            r12 = 2
            r13 = 1
            r14 = 0
            if (r8 == 0) goto L_0x0313
            java.lang.Class[] r6 = r6.q()
            if (r6 != 0) goto L_0x040d
            java.lang.Class[] r6 = r25.a()
        L_0x040d:
            r8.M(r6)
            r3.e(r8)
            goto L_0x0313
        L_0x0415:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.C(com.fasterxml.jackson.databind.DeserializationContext, i0.f.a.c.b, i0.f.a.c.l.a):void");
    }

    public void E(b bVar, a aVar) throws JsonMappingException {
        Map map;
        o oVar = ((i) bVar).c;
        if (oVar != null) {
            if (!oVar.i) {
                oVar.h();
            }
            map = oVar.t;
        } else {
            map = Collections.emptyMap();
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                AnnotatedMember annotatedMember = (AnnotatedMember) entry.getValue();
                PropertyName a = PropertyName.a(annotatedMember.d());
                JavaType f = annotatedMember.f();
                i0.f.a.c.t.a aVar2 = ((i) bVar).f.d2;
                Object key = entry.getKey();
                if (aVar.e == null) {
                    aVar.e = new ArrayList();
                }
                if (aVar.a.b()) {
                    annotatedMember.g(aVar.a.q(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                }
                aVar.e.add(new ValueInjector(a, f, annotatedMember, key));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void F(com.fasterxml.jackson.databind.DeserializationContext r11, i0.f.a.c.b r12, i0.f.a.c.l.a r13) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r10 = this;
            r0 = r12
            i0.f.a.c.n.i r0 = (i0.f.a.c.n.i) r0
            i0.f.a.c.n.n r1 = r0.j
            if (r1 != 0) goto L_0x0008
            return
        L_0x0008:
            java.lang.Class<? extends com.fasterxml.jackson.annotation.ObjectIdGenerator<?>> r2 = r1.c
            i0.f.a.c.n.b r3 = r0.f
            i0.f.a.a.z r9 = r11.m(r3, r1)
            java.lang.Class<com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator> r3 = com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator.class
            r4 = 0
            if (r2 != r3) goto L_0x004b
            com.fasterxml.jackson.databind.PropertyName r0 = r1.b
            java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> r2 = r13.d
            java.lang.String r3 = r0.q
            java.lang.Object r2 = r2.get(r3)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r2 = (com.fasterxml.jackson.databind.deser.SettableBeanProperty) r2
            if (r2 == 0) goto L_0x002d
            com.fasterxml.jackson.databind.JavaType r12 = r2.y
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator r0 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator
            java.lang.Class<?> r3 = r1.e
            r0.<init>(r3)
            goto L_0x0062
        L_0x002d:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]
            com.fasterxml.jackson.databind.JavaType r12 = r12.a
            java.lang.String r12 = i0.f.a.c.t.f.t(r12)
            r13[r4] = r12
            r12 = 1
            java.lang.String r0 = i0.f.a.c.t.f.C(r0)
            r13[r12] = r0
            java.lang.String r12 = "Invalid Object Id definition for %s: cannot find property with name %s"
            java.lang.String r12 = java.lang.String.format(r12, r13)
            r11.<init>(r12)
            throw r11
        L_0x004b:
            com.fasterxml.jackson.databind.JavaType r12 = r11.q(r2)
            com.fasterxml.jackson.databind.type.TypeFactory r2 = r11.i()
            java.lang.Class<com.fasterxml.jackson.annotation.ObjectIdGenerator> r3 = com.fasterxml.jackson.annotation.ObjectIdGenerator.class
            com.fasterxml.jackson.databind.JavaType[] r12 = r2.p(r12, r3)
            r12 = r12[r4]
            r2 = 0
            i0.f.a.c.n.b r0 = r0.f
            com.fasterxml.jackson.annotation.ObjectIdGenerator r0 = r11.l(r0, r1)
        L_0x0062:
            r4 = r12
            r6 = r0
            r8 = r2
            i0.f.a.c.d r7 = r11.F(r4)
            com.fasterxml.jackson.databind.PropertyName r5 = r1.b
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r11 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.a(r4, r5, r6, r7, r8, r9)
            r13.j = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.F(com.fasterxml.jackson.databind.DeserializationContext, i0.f.a.c.b, i0.f.a.c.l.a):void");
    }

    public d<Object> G(DeserializationContext deserializationContext, JavaType javaType, b bVar) throws JsonMappingException {
        d dVar;
        try {
            ValueInstantiator y = y(deserializationContext, bVar);
            a aVar = new a(bVar, deserializationContext);
            aVar.i = y;
            C(deserializationContext, bVar, aVar);
            F(deserializationContext, bVar, aVar);
            A(deserializationContext, bVar, aVar);
            E(bVar, aVar);
            if (this.y.c()) {
                c cVar = (c) this.y.a();
                while (cVar.hasNext()) {
                    Objects.requireNonNull((i0.f.a.c.l.b) cVar.next());
                }
            }
            if (!javaType.C() || y.m()) {
                dVar = aVar.f();
            } else {
                dVar = new AbstractDeserializer(aVar, aVar.c, aVar.f, aVar.d);
            }
            if (this.y.c()) {
                c cVar2 = (c) this.y.a();
                while (cVar2.hasNext()) {
                    Objects.requireNonNull((i0.f.a.c.l.b) cVar2.next());
                }
            }
            return dVar;
        } catch (NoClassDefFoundError e) {
            return new i0.f.a.c.l.m.c(e);
        } catch (IllegalArgumentException e2) {
            InvalidDefinitionException invalidDefinitionException = new InvalidDefinitionException(deserializationContext.Z1, f.j(e2), bVar, (j) null);
            invalidDefinitionException.initCause(e2);
            throw invalidDefinitionException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.fasterxml.jackson.databind.deser.SettableBeanProperty} */
    /* JADX WARNING: type inference failed for: r8v0, types: [com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.deser.SettableBeanProperty] */
    /* JADX WARNING: type inference failed for: r8v1, types: [com.fasterxml.jackson.databind.deser.SettableBeanProperty] */
    /* JADX WARNING: type inference failed for: r2v4, types: [com.fasterxml.jackson.databind.deser.impl.FieldProperty] */
    /* JADX WARNING: type inference failed for: r2v5, types: [com.fasterxml.jackson.databind.deser.impl.MethodProperty] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.deser.SettableBeanProperty H(com.fasterxml.jackson.databind.DeserializationContext r10, i0.f.a.c.b r11, i0.f.a.c.n.j r12, com.fasterxml.jackson.databind.JavaType r13) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r9 = this;
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r0 = r12.B()
            if (r0 != 0) goto L_0x000a
            com.fasterxml.jackson.databind.introspect.AnnotatedField r0 = r12.u()
        L_0x000a:
            r1 = 0
            if (r0 == 0) goto L_0x006d
            com.fasterxml.jackson.databind.JavaType r13 = r9.z(r10, r0, r13)
            java.lang.Object r2 = r13.x
            r5 = r2
            i0.f.a.c.p.b r5 = (i0.f.a.c.p.b) r5
            boolean r2 = r0 instanceof com.fasterxml.jackson.databind.introspect.AnnotatedMethod
            if (r2 == 0) goto L_0x002c
            com.fasterxml.jackson.databind.deser.impl.MethodProperty r8 = new com.fasterxml.jackson.databind.deser.impl.MethodProperty
            i0.f.a.c.n.i r11 = (i0.f.a.c.n.i) r11
            i0.f.a.c.n.b r11 = r11.f
            i0.f.a.c.t.a r6 = r11.d2
            r7 = r0
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r7 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r7
            r2 = r8
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x003d
        L_0x002c:
            com.fasterxml.jackson.databind.deser.impl.FieldProperty r8 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty
            i0.f.a.c.n.i r11 = (i0.f.a.c.n.i) r11
            i0.f.a.c.n.b r11 = r11.f
            i0.f.a.c.t.a r6 = r11.d2
            r7 = r0
            com.fasterxml.jackson.databind.introspect.AnnotatedField r7 = (com.fasterxml.jackson.databind.introspect.AnnotatedField) r7
            r2 = r8
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x003d:
            i0.f.a.c.d r11 = r9.w(r10, r0)
            if (r11 != 0) goto L_0x0047
            java.lang.Object r11 = r13.q
            i0.f.a.c.d r11 = (i0.f.a.c.d) r11
        L_0x0047:
            if (r11 == 0) goto L_0x0051
            i0.f.a.c.d r10 = r10.Q(r11, r8, r13)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r8 = r8.T(r10)
        L_0x0051:
            com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty r10 = r12.o()
            if (r10 == 0) goto L_0x0064
            com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty$Type r11 = r10.a
            com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty$Type r13 = com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.Type.MANAGED_REFERENCE
            if (r11 != r13) goto L_0x005e
            r1 = 1
        L_0x005e:
            if (r1 == 0) goto L_0x0064
            java.lang.String r10 = r10.b
            r8.d2 = r10
        L_0x0064:
            i0.f.a.c.n.n r10 = r12.n()
            if (r10 == 0) goto L_0x006c
            r8.e2 = r10
        L_0x006c:
            return r8
        L_0x006d:
            java.lang.Object[] r13 = new java.lang.Object[r1]
            java.lang.String r0 = "No non-constructor mutator available"
            r10.i0(r11, r12, r0, r13)
            r10 = 0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.H(com.fasterxml.jackson.databind.DeserializationContext, i0.f.a.c.b, i0.f.a.c.n.j, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.deser.SettableBeanProperty");
    }

    public SettableBeanProperty I(DeserializationContext deserializationContext, b bVar, j jVar) throws JsonMappingException {
        AnnotatedMethod v = jVar.v();
        JavaType z = z(deserializationContext, v, v.f());
        SetterlessProperty setterlessProperty = new SetterlessProperty(jVar, z, (i0.f.a.c.p.b) z.x, ((i) bVar).f.d2, v);
        d<Object> w = w(deserializationContext, v);
        if (w == null) {
            w = (d) z.q;
        }
        return w != null ? setterlessProperty.T(deserializationContext.Q(w, setterlessProperty, z)) : setterlessProperty;
    }
}
