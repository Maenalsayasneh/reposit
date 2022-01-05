package com.fasterxml.jackson.databind.deser;

import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.util.LRUMap;
import i0.f.a.c.d;
import i0.f.a.c.l.f;
import i0.f.a.c.l.j;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;

public final class DeserializerCache implements Serializable {
    public final LRUMap<JavaType, d<Object>> c = new LRUMap<>(Math.min(64, 500), RecyclerView.MAX_SCROLL_DURATION);
    public final HashMap<JavaType, d<Object>> d = new HashMap<>(8);

    public d<Object> a(DeserializationContext deserializationContext, f fVar, JavaType javaType) throws JsonMappingException {
        try {
            d<Object> b = b(deserializationContext, fVar, javaType);
            if (b == null) {
                return null;
            }
            boolean z = !e(javaType) && b.p();
            if (b instanceof j) {
                this.d.put(javaType, b);
                ((j) b).c(deserializationContext);
                this.d.remove(javaType);
            }
            if (z) {
                this.c.a(javaType, b);
            }
            return b;
        } catch (IllegalArgumentException e) {
            throw new JsonMappingException((Closeable) deserializationContext.Z1, i0.f.a.c.t.f.j(e), (Throwable) e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r8 = r24.q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        r8 = r2.f0(r6, (r8 = r7.x(r6)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.d<java.lang.Object> b(com.fasterxml.jackson.databind.DeserializationContext r22, i0.f.a.c.l.f r23, com.fasterxml.jackson.databind.JavaType r24) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r0 = r23
            r3 = r24
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r2.q
            boolean r5 = r24.C()
            if (r5 != 0) goto L_0x001c
            boolean r5 = r24.O()
            if (r5 != 0) goto L_0x001c
            boolean r5 = r24.E()
            if (r5 == 0) goto L_0x001f
        L_0x001c:
            r0.c(r4, r3)
        L_0x001f:
            i0.f.a.c.b r5 = r4.C(r3)
            r6 = r5
            i0.f.a.c.n.i r6 = (i0.f.a.c.n.i) r6
            i0.f.a.c.n.b r7 = r6.f
            com.fasterxml.jackson.databind.AnnotationIntrospector r8 = r22.G()
            java.lang.Object r8 = r8.k(r7)
            r9 = 0
            if (r8 != 0) goto L_0x0035
            r8 = r9
            goto L_0x005a
        L_0x0035:
            i0.f.a.c.d r8 = r2.v(r7, r8)
            com.fasterxml.jackson.databind.AnnotationIntrospector r10 = r22.G()
            java.lang.Object r10 = r10.i(r7)
            if (r10 != 0) goto L_0x0045
            r7 = r9
            goto L_0x0049
        L_0x0045:
            i0.f.a.c.t.g r7 = r2.g(r7, r10)
        L_0x0049:
            if (r7 != 0) goto L_0x004c
            goto L_0x005a
        L_0x004c:
            com.fasterxml.jackson.databind.type.TypeFactory r10 = r22.i()
            com.fasterxml.jackson.databind.JavaType r10 = r7.b(r10)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r11 = new com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            r11.<init>(r7, r10, r8)
            r8 = r11
        L_0x005a:
            if (r8 == 0) goto L_0x005d
            return r8
        L_0x005d:
            i0.f.a.c.n.b r6 = r6.f
            com.fasterxml.jackson.databind.AnnotationIntrospector r7 = r22.G()
            if (r7 != 0) goto L_0x0068
            r6 = r3
            goto L_0x00e0
        L_0x0068:
            boolean r8 = r24.O()
            if (r8 == 0) goto L_0x008c
            com.fasterxml.jackson.databind.JavaType r8 = r24.q()
            if (r8 == 0) goto L_0x008c
            java.lang.Object r8 = r8.q
            if (r8 != 0) goto L_0x008c
            java.lang.Object r8 = r7.x(r6)
            if (r8 == 0) goto L_0x008c
            i0.f.a.c.h r8 = r2.f0(r6, r8)
            if (r8 == 0) goto L_0x008c
            r10 = r3
            com.fasterxml.jackson.databind.type.MapLikeType r10 = (com.fasterxml.jackson.databind.type.MapLikeType) r10
            com.fasterxml.jackson.databind.type.MapLikeType r8 = r10.j0(r8)
            goto L_0x008d
        L_0x008c:
            r8 = r3
        L_0x008d:
            com.fasterxml.jackson.databind.JavaType r10 = r8.l()
            if (r10 == 0) goto L_0x00da
            java.lang.Object r10 = r10.q
            if (r10 != 0) goto L_0x00da
            java.lang.Object r10 = r7.c(r6)
            if (r10 == 0) goto L_0x00da
            boolean r11 = r10 instanceof i0.f.a.c.d
            if (r11 == 0) goto L_0x00a4
            i0.f.a.c.d r10 = (i0.f.a.c.d) r10
            goto L_0x00bd
        L_0x00a4:
            java.lang.Class<i0.f.a.c.d$a> r11 = i0.f.a.c.d.a.class
            boolean r12 = r10 instanceof java.lang.Class
            if (r12 == 0) goto L_0x00c4
            java.lang.Class r10 = (java.lang.Class) r10
            if (r10 == r11) goto L_0x00b4
            boolean r11 = i0.f.a.c.t.f.v(r10)
            if (r11 == 0) goto L_0x00b5
        L_0x00b4:
            r10 = r9
        L_0x00b5:
            if (r10 == 0) goto L_0x00bc
            i0.f.a.c.d r10 = r2.v(r6, r10)
            goto L_0x00bd
        L_0x00bc:
            r10 = r9
        L_0x00bd:
            if (r10 == 0) goto L_0x00da
            com.fasterxml.jackson.databind.JavaType r8 = r8.Y(r10)
            goto L_0x00da
        L_0x00c4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "AnnotationIntrospector."
            java.lang.String r3 = "findContentDeserializer"
            java.lang.String r4 = "() returned value of type "
            java.lang.StringBuilder r2 = i0.d.a.a.a.T0(r2, r3, r4)
            java.lang.String r3 = ": expected type JsonSerializer or Class<JsonSerializer> instead"
            java.lang.String r2 = i0.d.a.a.a.d0(r10, r2, r3)
            r0.<init>(r2)
            throw r0
        L_0x00da:
            com.fasterxml.jackson.databind.DeserializationConfig r10 = r2.q
            com.fasterxml.jackson.databind.JavaType r6 = r7.B0(r10, r6, r8)
        L_0x00e0:
            if (r6 == r3) goto L_0x00e8
            i0.f.a.c.b r5 = r4.C(r6)
            r13 = r6
            goto L_0x00e9
        L_0x00e8:
            r13 = r3
        L_0x00e9:
            r3 = r5
            i0.f.a.c.n.i r3 = (i0.f.a.c.n.i) r3
            com.fasterxml.jackson.databind.AnnotationIntrospector r6 = r3.e
            if (r6 != 0) goto L_0x00f2
            r3 = r9
            goto L_0x00f8
        L_0x00f2:
            i0.f.a.c.n.b r3 = r3.f
            java.lang.Class r3 = r6.I(r3)
        L_0x00f8:
            if (r3 == 0) goto L_0x02e1
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory r0 = (com.fasterxml.jackson.databind.deser.BeanDeserializerFactory) r0
            java.util.Objects.requireNonNull(r0)
            com.fasterxml.jackson.databind.MapperFeature r4 = com.fasterxml.jackson.databind.MapperFeature.INFER_BUILDER_TYPE_BINDINGS
            boolean r4 = r2.e0(r4)
            if (r4 == 0) goto L_0x0114
            com.fasterxml.jackson.databind.type.TypeFactory r4 = r22.i()
            com.fasterxml.jackson.databind.type.TypeBindings r5 = r13.k()
            com.fasterxml.jackson.databind.JavaType r3 = r4.c(r9, r3, r5)
            goto L_0x0118
        L_0x0114:
            com.fasterxml.jackson.databind.JavaType r3 = r2.q(r3)
        L_0x0118:
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r2.q
            com.fasterxml.jackson.databind.cfg.BaseSettings r5 = r4.d
            i0.f.a.c.n.k r5 = r5.q
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector r5 = (com.fasterxml.jackson.databind.introspect.BasicClassIntrospector) r5
            i0.f.a.c.n.b r5 = r5.c(r4, r3, r4)
            com.fasterxml.jackson.databind.cfg.BaseSettings r6 = r4.d
            com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy$Provider r6 = r6.Y1
            com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy$Provider r6 = (com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy.Provider) r6
            java.util.Objects.requireNonNull(r6)
            boolean r7 = r4.p()
            if (r7 == 0) goto L_0x0138
            com.fasterxml.jackson.databind.AnnotationIntrospector r7 = r4.e()
            goto L_0x0139
        L_0x0138:
            r7 = r9
        L_0x0139:
            if (r7 != 0) goto L_0x013d
            r7 = r9
            goto L_0x0141
        L_0x013d:
            i0.f.a.c.j.e$a r7 = r7.J(r5)
        L_0x0141:
            if (r7 != 0) goto L_0x0146
            java.lang.String r7 = r6.d
            goto L_0x0148
        L_0x0146:
            java.lang.String r7 = r7.b
        L_0x0148:
            r17 = r7
            com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy r7 = new com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy
            java.lang.String r8 = r6.q
            java.lang.String r10 = r6.x
            com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy$a r6 = r6.y
            r14 = r7
            r15 = r4
            r16 = r5
            r18 = r8
            r19 = r10
            r20 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20)
            i0.f.a.c.n.o r6 = new i0.f.a.c.n.o
            r16 = 0
            r14 = r6
            r17 = r3
            r18 = r5
            r19 = r7
            r14.<init>(r15, r16, r17, r18, r19)
            i0.f.a.c.n.i r3 = new i0.f.a.c.n.i
            r3.<init>(r6)
            com.fasterxml.jackson.databind.deser.ValueInstantiator r4 = r0.y(r2, r3)     // Catch:{ NoClassDefFoundError -> 0x02d8, IllegalArgumentException -> 0x02ca }
            com.fasterxml.jackson.databind.DeserializationConfig r5 = r2.q
            i0.f.a.c.l.a r11 = new i0.f.a.c.l.a
            r11.<init>(r3, r2)
            r11.i = r4
            r0.C(r2, r3, r11)
            r0.F(r2, r3, r11)
            r0.A(r2, r3, r11)
            r0.E(r3, r11)
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r3.e
            if (r2 != 0) goto L_0x0191
            r2 = r9
            goto L_0x0197
        L_0x0191:
            i0.f.a.c.n.b r4 = r3.f
            i0.f.a.c.j.e$a r2 = r2.J(r4)
        L_0x0197:
            if (r2 != 0) goto L_0x019c
            java.lang.String r2 = "build"
            goto L_0x019e
        L_0x019c:
            java.lang.String r2 = r2.a
        L_0x019e:
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r3 = r3.d(r2, r9)
            if (r3 == 0) goto L_0x01b5
            boolean r4 = r5.b()
            if (r4 == 0) goto L_0x01b5
            java.lang.reflect.Method r4 = r3.x
            com.fasterxml.jackson.databind.MapperFeature r6 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r5 = r5.q(r6)
            i0.f.a.c.t.f.e(r4, r5)
        L_0x01b5:
            r11.m = r3
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r3 = r0.y
            boolean r3 = r3.c()
            if (r3 == 0) goto L_0x01d7
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r3 = r0.y
            java.lang.Iterable r3 = r3.a()
            i0.f.a.c.t.c r3 = (i0.f.a.c.t.c) r3
        L_0x01c7:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01d7
            java.lang.Object r4 = r3.next()
            i0.f.a.c.l.b r4 = (i0.f.a.c.l.b) r4
            java.util.Objects.requireNonNull(r4)
            goto L_0x01c7
        L_0x01d7:
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r3 = r11.m
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 != 0) goto L_0x01ff
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x01e5
            goto L_0x023b
        L_0x01e5:
            com.fasterxml.jackson.databind.DeserializationContext r0 = r11.b
            i0.f.a.c.b r3 = r11.c
            com.fasterxml.jackson.databind.JavaType r3 = r3.a
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r7 = i0.f.a.c.t.f.t(r3)
            r5[r4] = r7
            r5[r6] = r2
            java.lang.String r2 = "Builder class %s does not have build method (name: '%s')"
            java.lang.String r2 = java.lang.String.format(r2, r5)
            r0.n(r3, r2)
            throw r9
        L_0x01ff:
            java.lang.Class r2 = r3.A()
            java.lang.Class<?> r3 = r13.c
            if (r2 == r3) goto L_0x023b
            boolean r7 = r2.isAssignableFrom(r3)
            if (r7 != 0) goto L_0x023b
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L_0x0214
            goto L_0x023b
        L_0x0214:
            com.fasterxml.jackson.databind.DeserializationContext r0 = r11.b
            i0.f.a.c.b r3 = r11.c
            com.fasterxml.jackson.databind.JavaType r3 = r3.a
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r8 = r11.m
            java.lang.String r8 = r8.i()
            r7[r4] = r8
            java.lang.String r2 = i0.f.a.c.t.f.n(r2)
            r7[r6] = r2
            java.lang.String r2 = i0.f.a.c.t.f.t(r13)
            r7[r5] = r2
            java.lang.String r2 = "Build method `%s` has wrong return type (%s), not compatible with POJO type (%s)"
            java.lang.String r2 = java.lang.String.format(r2, r7)
            r0.n(r3, r2)
            throw r9
        L_0x023b:
            java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> r2 = r11.d
            java.util.Collection r2 = r2.values()
            r11.c(r2)
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r11.a
            java.util.Map r4 = r11.a(r2)
            boolean r5 = r11.b()
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r7 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap
            com.fasterxml.jackson.databind.cfg.BaseSettings r3 = r3.d
            java.util.Locale r3 = r3.c2
            r7.<init>((boolean) r5, (java.util.Collection<com.fasterxml.jackson.databind.deser.SettableBeanProperty>) r2, (java.util.Map<java.lang.String, java.util.List<com.fasterxml.jackson.databind.PropertyName>>) r4, (java.util.Locale) r3)
            r7.k()
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r11.a
            com.fasterxml.jackson.databind.MapperFeature r4 = com.fasterxml.jackson.databind.MapperFeature.DEFAULT_VIEW_INCLUSION
            boolean r3 = r3.q(r4)
            r3 = r3 ^ r6
            if (r3 != 0) goto L_0x027e
            java.util.Iterator r2 = r2.iterator()
        L_0x0269:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x027e
            java.lang.Object r4 = r2.next()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r4 = (com.fasterxml.jackson.databind.deser.SettableBeanProperty) r4
            boolean r4 = r4.E()
            if (r4 == 0) goto L_0x0269
            r19 = r6
            goto L_0x0280
        L_0x027e:
            r19 = r3
        L_0x0280:
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r2 = r11.j
            if (r2 == 0) goto L_0x0293
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty r2 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r3 = r11.j
            com.fasterxml.jackson.databind.PropertyMetadata r4 = com.fasterxml.jackson.databind.PropertyMetadata.c
            r2.<init>((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader) r3, (com.fasterxml.jackson.databind.PropertyMetadata) r4)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r2 = r7.z(r2)
            r14 = r2
            goto L_0x0294
        L_0x0293:
            r14 = r7
        L_0x0294:
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer r2 = new com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer
            i0.f.a.c.b r12 = r11.c
            java.util.HashMap<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> r15 = r11.f
            java.util.HashSet<java.lang.String> r3 = r11.g
            boolean r4 = r11.l
            java.util.HashSet<java.lang.String> r5 = r11.h
            r10 = r2
            r16 = r3
            r17 = r4
            r18 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r3 = r0.y
            boolean r3 = r3.c()
            if (r3 == 0) goto L_0x02e0
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r0.y
            java.lang.Iterable r0 = r0.a()
            i0.f.a.c.t.c r0 = (i0.f.a.c.t.c) r0
        L_0x02ba:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x02e0
            java.lang.Object r3 = r0.next()
            i0.f.a.c.l.b r3 = (i0.f.a.c.l.b) r3
            java.util.Objects.requireNonNull(r3)
            goto L_0x02ba
        L_0x02ca:
            r0 = move-exception
            r4 = r0
            com.fasterxml.jackson.core.JsonParser r0 = r2.Z1
            java.lang.String r2 = i0.f.a.c.t.f.j(r4)
            com.fasterxml.jackson.databind.exc.InvalidDefinitionException r4 = new com.fasterxml.jackson.databind.exc.InvalidDefinitionException
            r4.<init>((com.fasterxml.jackson.core.JsonParser) r0, (java.lang.String) r2, (i0.f.a.c.b) r3, (i0.f.a.c.n.j) r9)
            throw r4
        L_0x02d8:
            r0 = move-exception
            r2 = r0
            i0.f.a.c.l.m.c r0 = new i0.f.a.c.l.m.c
            r0.<init>(r2)
            r2 = r0
        L_0x02e0:
            return r2
        L_0x02e1:
            r3 = r5
            i0.f.a.c.n.i r3 = (i0.f.a.c.n.i) r3
            com.fasterxml.jackson.databind.AnnotationIntrospector r6 = r3.e
            if (r6 != 0) goto L_0x02e9
            goto L_0x02f3
        L_0x02e9:
            i0.f.a.c.n.b r7 = r3.f
            java.lang.Object r6 = r6.i(r7)
            i0.f.a.c.t.g r9 = r3.g(r6)
        L_0x02f3:
            if (r9 != 0) goto L_0x02fa
            i0.f.a.c.d r0 = r1.c(r2, r0, r13, r5)
            return r0
        L_0x02fa:
            com.fasterxml.jackson.databind.type.TypeFactory r3 = r22.i()
            com.fasterxml.jackson.databind.JavaType r3 = r9.b(r3)
            java.lang.Class<?> r6 = r13.c
            boolean r6 = r3.A(r6)
            if (r6 != 0) goto L_0x030e
            i0.f.a.c.b r5 = r4.C(r3)
        L_0x030e:
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r4 = new com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            i0.f.a.c.d r0 = r1.c(r2, r0, r3, r5)
            r4.<init>(r9, r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.DeserializerCache.b(com.fasterxml.jackson.databind.DeserializationContext, i0.f.a.c.l.f, com.fasterxml.jackson.databind.JavaType):i0.f.a.c.d");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v60, resolved type: com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v67, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v101, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v102, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v103, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v104, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v105, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v106, resolved type: com.fasterxml.jackson.databind.deser.AbstractDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v107, resolved type: com.fasterxml.jackson.databind.deser.AbstractDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v108, resolved type: com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v109, resolved type: i0.f.a.c.d<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: type inference failed for: r10v4, types: [i0.f.a.c.d<?>] */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r10v7, types: [com.fasterxml.jackson.databind.deser.ValueInstantiator] */
    /* JADX WARNING: type inference failed for: r10v9, types: [i0.f.a.c.d<?>] */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: type inference failed for: r10v11, types: [i0.f.a.c.d<?>] */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r10v13, types: [java.util.Set, java.util.Set<java.lang.String>] */
    /* JADX WARNING: type inference failed for: r10v15 */
    /* JADX WARNING: type inference failed for: r10v16 */
    /* JADX WARNING: type inference failed for: r10v18 */
    /* JADX WARNING: type inference failed for: r10v23 */
    /* JADX WARNING: type inference failed for: r10v24 */
    /* JADX WARNING: type inference failed for: r10v25 */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0792, code lost:
        if (r7 == null) goto L_0x0796;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0934, code lost:
        if (r7.endsWith("DataSource") != false) goto L_0x0954;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x076c  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x08a4 A[LOOP:18: B:471:0x089e->B:473:0x08a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x08b2  */
    /* JADX WARNING: Removed duplicated region for block: B:493:0x08e7  */
    /* JADX WARNING: Removed duplicated region for block: B:520:0x095e  */
    /* JADX WARNING: Removed duplicated region for block: B:579:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.d<?> c(com.fasterxml.jackson.databind.DeserializationContext r22, i0.f.a.c.l.f r23, com.fasterxml.jackson.databind.JavaType r24, i0.f.a.c.b r25) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r8 = r25
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r0.q
            boolean r4 = r24.I()
            r5 = 0
            r9 = 1
            if (r4 == 0) goto L_0x00ec
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory r1 = (com.fasterxml.jackson.databind.deser.BasicDeserializerFactory) r1
            java.util.Objects.requireNonNull(r1)
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r0.q
            java.lang.Class<?> r4 = r2.c
            i0.f.a.c.d r6 = r1.i(r4, r3, r8)
            if (r6 != 0) goto L_0x00ca
            java.lang.Class<java.lang.Enum> r7 = java.lang.Enum.class
            if (r4 != r7) goto L_0x002e
            com.fasterxml.jackson.databind.deser.AbstractDeserializer r0 = new com.fasterxml.jackson.databind.deser.AbstractDeserializer
            r0.<init>(r8)
            goto L_0x00eb
        L_0x002e:
            com.fasterxml.jackson.databind.deser.ValueInstantiator r14 = r1.h(r0, r8)
            r7 = r14
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator r7 = (com.fasterxml.jackson.databind.deser.std.StdValueInstantiator) r7
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r15 = r7.y
            java.util.List r7 = r25.f()
            java.util.Iterator r7 = r7.iterator()
        L_0x003f:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x00b1
            java.lang.Object r10 = r7.next()
            r12 = r10
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r12 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r12
            boolean r10 = r1.m(r0, r12)
            if (r10 == 0) goto L_0x003f
            int r6 = r12.x()
            if (r6 != 0) goto L_0x0072
            int r0 = com.fasterxml.jackson.databind.deser.std.EnumDeserializer.x
            boolean r0 = r3.b()
            if (r0 == 0) goto L_0x006b
            java.lang.reflect.Method r0 = r12.x
            com.fasterxml.jackson.databind.MapperFeature r2 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r2 = r3.q(r2)
            i0.f.a.c.t.f.e(r0, r2)
        L_0x006b:
            com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer r0 = new com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer
            r0.<init>((java.lang.Class<?>) r4, (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r12)
        L_0x0070:
            r6 = r0
            goto L_0x00b1
        L_0x0072:
            java.lang.Class r6 = r12.A()
            boolean r6 = r6.isAssignableFrom(r4)
            if (r6 == 0) goto L_0x009b
            int r0 = com.fasterxml.jackson.databind.deser.std.EnumDeserializer.x
            boolean r0 = r3.b()
            if (r0 == 0) goto L_0x008f
            java.lang.reflect.Method r0 = r12.x
            com.fasterxml.jackson.databind.MapperFeature r2 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r2 = r3.q(r2)
            i0.f.a.c.t.f.e(r0, r2)
        L_0x008f:
            com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer r0 = new com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer
            com.fasterxml.jackson.databind.JavaType r13 = r12.y(r5)
            r10 = r0
            r11 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0070
        L_0x009b:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r3 = r12.toString()
            r1[r5] = r3
            java.lang.String r3 = "Invalid `@JsonCreator` annotated Enum factory method [%s]: needs to return compatible type"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            com.fasterxml.jackson.core.JsonParser r0 = r0.Z1
            com.fasterxml.jackson.databind.exc.InvalidDefinitionException r3 = new com.fasterxml.jackson.databind.exc.InvalidDefinitionException
            r3.<init>((com.fasterxml.jackson.core.JsonParser) r0, (java.lang.String) r1, (com.fasterxml.jackson.databind.JavaType) r2)
            throw r3
        L_0x00b1:
            if (r6 != 0) goto L_0x00ca
            com.fasterxml.jackson.databind.deser.std.EnumDeserializer r6 = new com.fasterxml.jackson.databind.deser.std.EnumDeserializer
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = r25.c()
            com.fasterxml.jackson.databind.util.EnumResolver r0 = r1.v(r4, r3, r0)
            com.fasterxml.jackson.databind.MapperFeature r2 = com.fasterxml.jackson.databind.MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS
            boolean r2 = r3.q(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.<init>((com.fasterxml.jackson.databind.util.EnumResolver) r0, (java.lang.Boolean) r2)
        L_0x00ca:
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r1.y
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x00ea
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r1.y
            java.lang.Iterable r0 = r0.a()
            i0.f.a.c.t.c r0 = (i0.f.a.c.t.c) r0
        L_0x00da:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ea
            java.lang.Object r1 = r0.next()
            i0.f.a.c.l.b r1 = (i0.f.a.c.l.b) r1
            java.util.Objects.requireNonNull(r1)
            goto L_0x00da
        L_0x00ea:
            r0 = r6
        L_0x00eb:
            return r0
        L_0x00ec:
            boolean r4 = r24.G()
            r10 = 0
            if (r4 == 0) goto L_0x0468
            boolean r4 = r2 instanceof com.fasterxml.jackson.databind.type.ArrayType
            if (r4 == 0) goto L_0x01c2
            r7 = r2
            com.fasterxml.jackson.databind.type.ArrayType r7 = (com.fasterxml.jackson.databind.type.ArrayType) r7
            r9 = r1
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory r9 = (com.fasterxml.jackson.databind.deser.BasicDeserializerFactory) r9
            java.util.Objects.requireNonNull(r9)
            com.fasterxml.jackson.databind.DeserializationConfig r11 = r0.q
            com.fasterxml.jackson.databind.JavaType r12 = r7.c2
            java.lang.Object r0 = r12.q
            r13 = r0
            i0.f.a.c.d r13 = (i0.f.a.c.d) r13
            java.lang.Object r0 = r12.x
            i0.f.a.c.p.b r0 = (i0.f.a.c.p.b) r0
            if (r0 != 0) goto L_0x0113
            i0.f.a.c.p.b r0 = r9.b(r11, r12)
        L_0x0113:
            r14 = r0
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r9.y
            java.lang.Iterable r0 = r0.b()
            r15 = r0
            i0.f.a.c.t.c r15 = (i0.f.a.c.t.c) r15
        L_0x011d:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0136
            java.lang.Object r0 = r15.next()
            i0.f.a.c.l.g r0 = (i0.f.a.c.l.g) r0
            r1 = r7
            r2 = r11
            r3 = r25
            r4 = r14
            r5 = r13
            i0.f.a.c.d r0 = r0.h(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x011d
            r10 = r0
        L_0x0136:
            if (r10 != 0) goto L_0x01a0
            if (r13 != 0) goto L_0x019b
            java.lang.Class<?> r0 = r12.c
            boolean r1 = r12.Q()
            if (r1 == 0) goto L_0x0196
            int r1 = com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.x
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 != r1) goto L_0x014c
            com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$IntDeser r0 = com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.IntDeser.a2
            goto L_0x01c1
        L_0x014c:
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 != r1) goto L_0x0154
            com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$LongDeser r0 = com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.LongDeser.a2
            goto L_0x01c1
        L_0x0154:
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r0 != r1) goto L_0x015e
            com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$ByteDeser r0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$ByteDeser
            r0.<init>()
            goto L_0x01c1
        L_0x015e:
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r0 != r1) goto L_0x0168
            com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$ShortDeser r0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$ShortDeser
            r0.<init>()
            goto L_0x01c1
        L_0x0168:
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto L_0x0172
            com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$FloatDeser r0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$FloatDeser
            r0.<init>()
            goto L_0x01c1
        L_0x0172:
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 != r1) goto L_0x017c
            com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$DoubleDeser r0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$DoubleDeser
            r0.<init>()
            goto L_0x01c1
        L_0x017c:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 != r1) goto L_0x0186
            com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$BooleanDeser r0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$BooleanDeser
            r0.<init>()
            goto L_0x01c1
        L_0x0186:
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r0 != r1) goto L_0x0190
            com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$CharDeser r0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$CharDeser
            r0.<init>()
            goto L_0x01c1
        L_0x0190:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0196:
            if (r0 != r6) goto L_0x019b
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer r0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.y
            goto L_0x01c1
        L_0x019b:
            com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer r10 = new com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer
            r10.<init>(r7, r13, r14)
        L_0x01a0:
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r9.y
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x01c0
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r9.y
            java.lang.Iterable r0 = r0.a()
            i0.f.a.c.t.c r0 = (i0.f.a.c.t.c) r0
        L_0x01b0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01c0
            java.lang.Object r1 = r0.next()
            i0.f.a.c.l.b r1 = (i0.f.a.c.l.b) r1
            java.util.Objects.requireNonNull(r1)
            goto L_0x01b0
        L_0x01c0:
            r0 = r10
        L_0x01c1:
            return r0
        L_0x01c2:
            boolean r4 = r24.O()
            if (r4 == 0) goto L_0x03eb
            com.fasterxml.jackson.annotation.JsonFormat$Value r4 = r8.b(r10)
            com.fasterxml.jackson.annotation.JsonFormat$Shape r4 = r4.q
            com.fasterxml.jackson.annotation.JsonFormat$Shape r7 = com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT
            if (r4 == r7) goto L_0x03eb
            r7 = r2
            com.fasterxml.jackson.databind.type.MapLikeType r7 = (com.fasterxml.jackson.databind.type.MapLikeType) r7
            boolean r2 = r7 instanceof com.fasterxml.jackson.databind.type.MapType
            if (r2 == 0) goto L_0x0384
            r15 = r7
            com.fasterxml.jackson.databind.type.MapType r15 = (com.fasterxml.jackson.databind.type.MapType) r15
            r14 = r1
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory r14 = (com.fasterxml.jackson.databind.deser.BasicDeserializerFactory) r14
            java.util.Objects.requireNonNull(r14)
            com.fasterxml.jackson.databind.DeserializationConfig r13 = r0.q
            com.fasterxml.jackson.databind.JavaType r11 = r15.c2
            com.fasterxml.jackson.databind.JavaType r1 = r15.d2
            java.lang.Object r2 = r1.q
            r18 = r2
            i0.f.a.c.d r18 = (i0.f.a.c.d) r18
            java.lang.Object r2 = r11.q
            r19 = r2
            i0.f.a.c.h r19 = (i0.f.a.c.h) r19
            java.lang.Object r2 = r1.x
            i0.f.a.c.p.b r2 = (i0.f.a.c.p.b) r2
            if (r2 != 0) goto L_0x0201
            i0.f.a.c.p.b r1 = r14.b(r13, r1)
            r20 = r1
            goto L_0x0203
        L_0x0201:
            r20 = r2
        L_0x0203:
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r1 = r14.y
            java.lang.Iterable r1 = r1.b()
            r12 = r1
            i0.f.a.c.t.c r12 = (i0.f.a.c.t.c) r12
        L_0x020c:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0229
            java.lang.Object r1 = r12.next()
            i0.f.a.c.l.g r1 = (i0.f.a.c.l.g) r1
            r2 = r15
            r3 = r13
            r4 = r25
            r5 = r19
            r6 = r20
            r7 = r18
            i0.f.a.c.d r1 = r1.i(r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x020c
            goto L_0x022a
        L_0x0229:
            r1 = r10
        L_0x022a:
            if (r1 != 0) goto L_0x0362
            java.lang.Class<?> r2 = r15.c
            java.lang.Class<java.util.EnumMap> r3 = java.util.EnumMap.class
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L_0x0263
            java.lang.Class<java.util.EnumMap> r1 = java.util.EnumMap.class
            if (r2 != r1) goto L_0x023c
            r1 = r10
            goto L_0x0240
        L_0x023c:
            com.fasterxml.jackson.databind.deser.ValueInstantiator r1 = r14.y(r0, r8)
        L_0x0240:
            boolean r2 = r11.H()
            if (r2 == 0) goto L_0x025b
            com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer r2 = new com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer
            r3 = 0
            r17 = 0
            r11 = r2
            r12 = r15
            r7 = r13
            r13 = r1
            r6 = r14
            r14 = r3
            r3 = r15
            r15 = r18
            r16 = r20
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r1 = r2
            goto L_0x0266
        L_0x025b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot construct EnumMap; generic (key) type not available"
            r0.<init>(r1)
            throw r0
        L_0x0263:
            r7 = r13
            r6 = r14
            r3 = r15
        L_0x0266:
            if (r1 != 0) goto L_0x0360
            boolean r2 = r3.M()
            if (r2 != 0) goto L_0x02c8
            boolean r2 = r3.C()
            if (r2 == 0) goto L_0x0275
            goto L_0x02c8
        L_0x0275:
            java.lang.Class<?> r1 = i0.f.a.c.l.m.e.d
            boolean r1 = r3.A(r1)
            if (r1 == 0) goto L_0x028a
            r1 = 3
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            i0.f.a.c.l.m.e$a r4 = new i0.f.a.c.l.m.e$a
            com.fasterxml.jackson.databind.JavaType r2 = r3.i(r2)
            r4.<init>(r1, r2)
            goto L_0x02ba
        L_0x028a:
            java.lang.Class<?> r1 = i0.f.a.c.l.m.e.h
            boolean r1 = r3.A(r1)
            if (r1 == 0) goto L_0x029f
            r1 = 6
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            i0.f.a.c.l.m.e$a r4 = new i0.f.a.c.l.m.e$a
            com.fasterxml.jackson.databind.JavaType r2 = r3.i(r2)
            r4.<init>(r1, r2)
            goto L_0x02ba
        L_0x029f:
            java.lang.Class<?> r1 = r3.c
            java.lang.String r1 = i0.f.a.c.l.m.e.a(r1)
            java.lang.String r2 = "Map"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L_0x02c0
            r1 = 10
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            i0.f.a.c.l.m.e$a r4 = new i0.f.a.c.l.m.e$a
            com.fasterxml.jackson.databind.JavaType r2 = r3.i(r2)
            r4.<init>(r1, r2)
        L_0x02ba:
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r1 = new com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            r1.<init>(r4)
            goto L_0x02c1
        L_0x02c0:
            r1 = r10
        L_0x02c1:
            if (r1 == 0) goto L_0x02c5
            goto L_0x0383
        L_0x02c5:
            r4 = r3
            r2 = r8
            goto L_0x02f8
        L_0x02c8:
            java.util.HashMap<java.lang.String, java.lang.Class<? extends java.util.Map>> r2 = com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.a.b
            java.lang.Class<?> r4 = r3.c
            java.lang.String r4 = r4.getName()
            java.lang.Object r2 = r2.get(r4)
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 == 0) goto L_0x02e4
            com.fasterxml.jackson.databind.cfg.BaseSettings r4 = r7.d
            com.fasterxml.jackson.databind.type.TypeFactory r4 = r4.d
            com.fasterxml.jackson.databind.JavaType r2 = r4.l(r3, r2, r9)
            com.fasterxml.jackson.databind.type.MapType r2 = (com.fasterxml.jackson.databind.type.MapType) r2
            r15 = r2
            goto L_0x02e5
        L_0x02e4:
            r15 = r10
        L_0x02e5:
            if (r15 == 0) goto L_0x02ec
            i0.f.a.c.b r2 = r7.E(r15)
            goto L_0x02f7
        L_0x02ec:
            java.lang.Object r1 = r3.x
            if (r1 == 0) goto L_0x0349
            com.fasterxml.jackson.databind.deser.AbstractDeserializer r1 = new com.fasterxml.jackson.databind.deser.AbstractDeserializer
            r1.<init>(r8)
            r15 = r3
            r2 = r8
        L_0x02f7:
            r4 = r15
        L_0x02f8:
            if (r1 != 0) goto L_0x0360
            com.fasterxml.jackson.databind.deser.ValueInstantiator r5 = r6.y(r0, r2)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer r1 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer
            r3 = r1
            r0 = r6
            r6 = r19
            r9 = r7
            r7 = r18
            r8 = r20
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            i0.f.a.c.n.i r2 = (i0.f.a.c.n.i) r2
            i0.f.a.c.n.b r4 = r2.f
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r3 = r9.x(r3, r4)
            if (r3 != 0) goto L_0x031a
            r3 = r10
            goto L_0x031e
        L_0x031a:
            java.util.Set r3 = r3.c()
        L_0x031e:
            if (r3 == 0) goto L_0x0326
            int r4 = r3.size()
            if (r4 != 0) goto L_0x0327
        L_0x0326:
            r3 = r10
        L_0x0327:
            r1.i2 = r3
            java.util.Set<java.lang.String> r4 = r1.j2
            com.fasterxml.jackson.databind.util.IgnorePropertiesUtil$Checker r3 = h0.b0.v.q(r3, r4)
            r1.k2 = r3
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            i0.f.a.c.n.b r2 = r2.f
            com.fasterxml.jackson.annotation.JsonIncludeProperties$Value r2 = r9.y(r2)
            if (r2 != 0) goto L_0x033c
            goto L_0x033e
        L_0x033c:
            java.util.Set<java.lang.String> r10 = r2.d
        L_0x033e:
            r1.j2 = r10
            java.util.Set<java.lang.String> r2 = r1.i2
            com.fasterxml.jackson.databind.util.IgnorePropertiesUtil$Checker r2 = h0.b0.v.q(r2, r10)
            r1.k2 = r2
            goto L_0x0363
        L_0x0349:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot find a deserializer for non-concrete Map type "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0360:
            r0 = r6
            goto L_0x0363
        L_0x0362:
            r0 = r14
        L_0x0363:
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r2 = r0.y
            boolean r2 = r2.c()
            if (r2 == 0) goto L_0x0383
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r0.y
            java.lang.Iterable r0 = r0.a()
            i0.f.a.c.t.c r0 = (i0.f.a.c.t.c) r0
        L_0x0373:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0383
            java.lang.Object r2 = r0.next()
            i0.f.a.c.l.b r2 = (i0.f.a.c.l.b) r2
            java.util.Objects.requireNonNull(r2)
            goto L_0x0373
        L_0x0383:
            return r1
        L_0x0384:
            r9 = r1
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory r9 = (com.fasterxml.jackson.databind.deser.BasicDeserializerFactory) r9
            java.util.Objects.requireNonNull(r9)
            com.fasterxml.jackson.databind.JavaType r1 = r7.c2
            com.fasterxml.jackson.databind.JavaType r2 = r7.d2
            com.fasterxml.jackson.databind.DeserializationConfig r11 = r0.q
            java.lang.Object r0 = r2.q
            r12 = r0
            i0.f.a.c.d r12 = (i0.f.a.c.d) r12
            java.lang.Object r0 = r1.q
            r13 = r0
            i0.f.a.c.h r13 = (i0.f.a.c.h) r13
            java.lang.Object r0 = r2.x
            i0.f.a.c.p.b r0 = (i0.f.a.c.p.b) r0
            if (r0 != 0) goto L_0x03a4
            i0.f.a.c.p.b r0 = r9.b(r11, r2)
        L_0x03a4:
            r14 = r0
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r9.y
            java.lang.Iterable r0 = r0.b()
            r15 = r0
            i0.f.a.c.t.c r15 = (i0.f.a.c.t.c) r15
        L_0x03ae:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x03c8
            java.lang.Object r0 = r15.next()
            i0.f.a.c.l.g r0 = (i0.f.a.c.l.g) r0
            r1 = r7
            r2 = r11
            r3 = r25
            r4 = r13
            r5 = r14
            r6 = r12
            i0.f.a.c.d r0 = r0.b(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03ae
            r10 = r0
        L_0x03c8:
            if (r10 == 0) goto L_0x03ea
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r9.y
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x03ea
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r9.y
            java.lang.Iterable r0 = r0.a()
            i0.f.a.c.t.c r0 = (i0.f.a.c.t.c) r0
        L_0x03da:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x03ea
            java.lang.Object r1 = r0.next()
            i0.f.a.c.l.b r1 = (i0.f.a.c.l.b) r1
            java.util.Objects.requireNonNull(r1)
            goto L_0x03da
        L_0x03ea:
            return r10
        L_0x03eb:
            boolean r4 = r24.E()
            if (r4 == 0) goto L_0x0468
            com.fasterxml.jackson.annotation.JsonFormat$Value r4 = r8.b(r10)
            com.fasterxml.jackson.annotation.JsonFormat$Shape r4 = r4.q
            com.fasterxml.jackson.annotation.JsonFormat$Shape r7 = com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT
            if (r4 == r7) goto L_0x0468
            r6 = r2
            com.fasterxml.jackson.databind.type.CollectionLikeType r6 = (com.fasterxml.jackson.databind.type.CollectionLikeType) r6
            boolean r2 = r6 instanceof com.fasterxml.jackson.databind.type.CollectionType
            if (r2 == 0) goto L_0x0409
            com.fasterxml.jackson.databind.type.CollectionType r6 = (com.fasterxml.jackson.databind.type.CollectionType) r6
            i0.f.a.c.d r0 = r1.a(r0, r6, r8)
            return r0
        L_0x0409:
            r7 = r1
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory r7 = (com.fasterxml.jackson.databind.deser.BasicDeserializerFactory) r7
            java.util.Objects.requireNonNull(r7)
            com.fasterxml.jackson.databind.JavaType r1 = r6.c2
            java.lang.Object r2 = r1.q
            r9 = r2
            i0.f.a.c.d r9 = (i0.f.a.c.d) r9
            com.fasterxml.jackson.databind.DeserializationConfig r11 = r0.q
            java.lang.Object r0 = r1.x
            i0.f.a.c.p.b r0 = (i0.f.a.c.p.b) r0
            if (r0 != 0) goto L_0x0422
            i0.f.a.c.p.b r0 = r7.b(r11, r1)
        L_0x0422:
            r12 = r0
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r7.y
            java.lang.Iterable r0 = r0.b()
            r13 = r0
            i0.f.a.c.t.c r13 = (i0.f.a.c.t.c) r13
        L_0x042c:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0445
            java.lang.Object r0 = r13.next()
            i0.f.a.c.l.g r0 = (i0.f.a.c.l.g) r0
            r1 = r6
            r2 = r11
            r3 = r25
            r4 = r12
            r5 = r9
            i0.f.a.c.d r0 = r0.f(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x042c
            r10 = r0
        L_0x0445:
            if (r10 == 0) goto L_0x0467
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r7.y
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0467
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r7.y
            java.lang.Iterable r0 = r0.a()
            i0.f.a.c.t.c r0 = (i0.f.a.c.t.c) r0
        L_0x0457:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0467
            java.lang.Object r1 = r0.next()
            i0.f.a.c.l.b r1 = (i0.f.a.c.l.b) r1
            java.util.Objects.requireNonNull(r1)
            goto L_0x0457
        L_0x0467:
            return r10
        L_0x0468:
            boolean r4 = r24.d()
            if (r4 == 0) goto L_0x04ec
            r7 = r2
            com.fasterxml.jackson.databind.type.ReferenceType r7 = (com.fasterxml.jackson.databind.type.ReferenceType) r7
            r9 = r1
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory r9 = (com.fasterxml.jackson.databind.deser.BasicDeserializerFactory) r9
            java.util.Objects.requireNonNull(r9)
            com.fasterxml.jackson.databind.JavaType r1 = r7.c2
            java.lang.Object r2 = r1.q
            r11 = r2
            i0.f.a.c.d r11 = (i0.f.a.c.d) r11
            com.fasterxml.jackson.databind.DeserializationConfig r12 = r0.q
            java.lang.Object r2 = r1.x
            i0.f.a.c.p.b r2 = (i0.f.a.c.p.b) r2
            if (r2 != 0) goto L_0x048a
            i0.f.a.c.p.b r2 = r9.b(r12, r1)
        L_0x048a:
            r13 = r2
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r1 = r9.y
            java.lang.Iterable r1 = r1.b()
            r14 = r1
            i0.f.a.c.t.c r14 = (i0.f.a.c.t.c) r14
        L_0x0494:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x04ad
            java.lang.Object r1 = r14.next()
            i0.f.a.c.l.g r1 = (i0.f.a.c.l.g) r1
            r2 = r7
            r3 = r12
            r4 = r25
            r5 = r13
            r6 = r11
            i0.f.a.c.d r1 = r1.a(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0494
            goto L_0x04ae
        L_0x04ad:
            r1 = r10
        L_0x04ae:
            if (r1 != 0) goto L_0x04c9
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r2 = java.util.concurrent.atomic.AtomicReference.class
            boolean r2 = r7.T(r2)
            if (r2 == 0) goto L_0x04c9
            java.lang.Class<?> r1 = r7.c
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r2 = java.util.concurrent.atomic.AtomicReference.class
            if (r1 != r2) goto L_0x04bf
            goto L_0x04c3
        L_0x04bf:
            com.fasterxml.jackson.databind.deser.ValueInstantiator r10 = r9.y(r0, r8)
        L_0x04c3:
            com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer r1 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer
            r1.<init>(r7, r10, r13, r11)
            goto L_0x04eb
        L_0x04c9:
            if (r1 == 0) goto L_0x04eb
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r9.y
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x04eb
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r9.y
            java.lang.Iterable r0 = r0.a()
            i0.f.a.c.t.c r0 = (i0.f.a.c.t.c) r0
        L_0x04db:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x04eb
            java.lang.Object r2 = r0.next()
            i0.f.a.c.l.b r2 = (i0.f.a.c.l.b) r2
            java.util.Objects.requireNonNull(r2)
            goto L_0x04db
        L_0x04eb:
            return r1
        L_0x04ec:
            java.lang.Class<i0.f.a.c.e> r4 = i0.f.a.c.e.class
            java.lang.Class<?> r7 = r2.c
            boolean r4 = r4.isAssignableFrom(r7)
            if (r4 == 0) goto L_0x0531
            r0 = r1
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory r0 = (com.fasterxml.jackson.databind.deser.BasicDeserializerFactory) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.Class<?> r1 = r2.c
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r0.y
            java.lang.Iterable r0 = r0.b()
            i0.f.a.c.t.c r0 = (i0.f.a.c.t.c) r0
        L_0x0506:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0519
            java.lang.Object r2 = r0.next()
            i0.f.a.c.l.g r2 = (i0.f.a.c.l.g) r2
            i0.f.a.c.d r2 = r2.d(r1, r3, r8)
            if (r2 == 0) goto L_0x0506
            r10 = r2
        L_0x0519:
            if (r10 == 0) goto L_0x051c
            goto L_0x0530
        L_0x051c:
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer r0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.y
            java.lang.Class<com.fasterxml.jackson.databind.node.ObjectNode> r0 = com.fasterxml.jackson.databind.node.ObjectNode.class
            if (r1 != r0) goto L_0x0526
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer r0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer.y
        L_0x0524:
            r10 = r0
            goto L_0x0530
        L_0x0526:
            java.lang.Class<com.fasterxml.jackson.databind.node.ArrayNode> r0 = com.fasterxml.jackson.databind.node.ArrayNode.class
            if (r1 != r0) goto L_0x052d
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer r0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.y
            goto L_0x0524
        L_0x052d:
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer r0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.y
            goto L_0x0524
        L_0x0530:
            return r10
        L_0x0531:
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory r1 = (com.fasterxml.jackson.databind.deser.BeanDeserializerFactory) r1
            java.util.Objects.requireNonNull(r1)
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r0.q
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r7 = r1.y
            java.lang.Iterable r7 = r7.b()
            i0.f.a.c.t.c r7 = (i0.f.a.c.t.c) r7
        L_0x0542:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x0555
            java.lang.Object r11 = r7.next()
            i0.f.a.c.l.g r11 = (i0.f.a.c.l.g) r11
            i0.f.a.c.d r11 = r11.c(r2, r4, r8)
            if (r11 == 0) goto L_0x0542
            goto L_0x0556
        L_0x0555:
            r11 = r10
        L_0x0556:
            if (r11 == 0) goto L_0x0578
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r1.y
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0953
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r1.y
            java.lang.Iterable r0 = r0.a()
            i0.f.a.c.t.c r0 = (i0.f.a.c.t.c) r0
        L_0x0568:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0953
            java.lang.Object r1 = r0.next()
            i0.f.a.c.l.b r1 = (i0.f.a.c.l.b) r1
            java.util.Objects.requireNonNull(r1)
            goto L_0x0568
        L_0x0578:
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.Class<?> r7 = r2.c
            boolean r4 = r4.isAssignableFrom(r7)
            if (r4 == 0) goto L_0x0619
            i0.f.a.c.l.a r2 = new i0.f.a.c.l.a
            r2.<init>(r8, r0)
            com.fasterxml.jackson.databind.deser.ValueInstantiator r3 = r1.y(r0, r8)
            r2.i = r3
            r1.C(r0, r8, r2)
            java.lang.Class<?>[] r3 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.Y1
            java.lang.String r4 = "initCause"
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r3 = r8.d(r4, r3)
            if (r3 == 0) goto L_0x05c4
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r0.q
            com.fasterxml.jackson.databind.PropertyName r12 = new com.fasterxml.jackson.databind.PropertyName
            java.lang.String r6 = "cause"
            r12.<init>(r6)
            com.fasterxml.jackson.annotation.JsonInclude$Value r14 = i0.f.a.c.n.j.c
            i0.f.a.c.t.q r6 = new i0.f.a.c.t.q
            com.fasterxml.jackson.databind.AnnotationIntrospector r10 = r4.e()
            r13 = 0
            r9 = r6
            r11 = r3
            r9.<init>(r10, r11, r12, r13, r14)
            com.fasterxml.jackson.databind.JavaType r3 = r3.y(r5)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r1.H(r0, r8, r6, r3)
            if (r0 == 0) goto L_0x05c4
            java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> r3 = r2.d
            com.fasterxml.jackson.databind.PropertyName r4 = r0.x
            java.lang.String r4 = r4.q
            r3.put(r4, r0)
        L_0x05c4:
            java.lang.String r0 = "localizedMessage"
            r2.d(r0)
            java.lang.String r0 = "suppressed"
            r2.d(r0)
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r1.y
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x05ee
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r1.y
            java.lang.Iterable r0 = r0.a()
            i0.f.a.c.t.c r0 = (i0.f.a.c.t.c) r0
        L_0x05de:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x05ee
            java.lang.Object r3 = r0.next()
            i0.f.a.c.l.b r3 = (i0.f.a.c.l.b) r3
            java.util.Objects.requireNonNull(r3)
            goto L_0x05de
        L_0x05ee:
            i0.f.a.c.d r0 = r2.f()
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer r11 = new com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer
            com.fasterxml.jackson.databind.deser.BeanDeserializer r0 = (com.fasterxml.jackson.databind.deser.BeanDeserializer) r0
            r11.<init>(r0)
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r1.y
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0953
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r1.y
            java.lang.Iterable r0 = r0.a()
            i0.f.a.c.t.c r0 = (i0.f.a.c.t.c) r0
        L_0x0609:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0953
            java.lang.Object r1 = r0.next()
            i0.f.a.c.l.b r1 = (i0.f.a.c.l.b) r1
            java.util.Objects.requireNonNull(r1)
            goto L_0x0609
        L_0x0619:
            boolean r4 = r24.C()
            if (r4 == 0) goto L_0x0644
            boolean r4 = r24.Q()
            if (r4 != 0) goto L_0x0644
            boolean r4 = r24.I()
            if (r4 != 0) goto L_0x0644
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r4 = r1.y
            i0.f.a.c.t.c r7 = new i0.f.a.c.t.c
            i0.f.a.c.a[] r4 = r4.b2
            r7.<init>(r4)
        L_0x0634:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0644
            java.lang.Object r4 = r7.next()
            i0.f.a.c.a r4 = (i0.f.a.c.a) r4
            java.util.Objects.requireNonNull(r4)
            goto L_0x0634
        L_0x0644:
            java.lang.Class<?> r4 = r2.c
            if (r4 == r3) goto L_0x0869
            java.lang.Class<?> r7 = com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.x
            if (r4 != r7) goto L_0x064e
            goto L_0x0869
        L_0x064e:
            if (r4 == r6) goto L_0x0865
            java.lang.Class<?> r6 = com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.c
            if (r4 != r6) goto L_0x0656
            goto L_0x0865
        L_0x0656:
            java.lang.Class<?> r6 = com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.d
            if (r4 != r6) goto L_0x067b
            com.fasterxml.jackson.databind.type.TypeFactory r4 = r22.i()
            com.fasterxml.jackson.databind.JavaType[] r6 = r4.p(r2, r6)
            if (r6 == 0) goto L_0x066b
            int r7 = r6.length
            if (r7 == r9) goto L_0x0668
            goto L_0x066b
        L_0x0668:
            r6 = r6[r5]
            goto L_0x066f
        L_0x066b:
            com.fasterxml.jackson.databind.JavaType r6 = com.fasterxml.jackson.databind.type.TypeFactory.v()
        L_0x066f:
            java.lang.Class<java.util.Collection> r7 = java.util.Collection.class
            com.fasterxml.jackson.databind.type.CollectionType r4 = r4.g(r7, r6)
            i0.f.a.c.d r4 = r1.a(r0, r4, r8)
            goto L_0x0867
        L_0x067b:
            java.lang.Class<?> r6 = com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.q
            if (r4 != r6) goto L_0x06a2
            com.fasterxml.jackson.databind.JavaType r4 = r2.h(r5)
            com.fasterxml.jackson.databind.JavaType r6 = r2.h(r9)
            java.lang.Object r7 = r6.x
            i0.f.a.c.p.b r7 = (i0.f.a.c.p.b) r7
            if (r7 != 0) goto L_0x0693
            com.fasterxml.jackson.databind.DeserializationConfig r7 = r0.q
            i0.f.a.c.p.b r7 = r1.b(r7, r6)
        L_0x0693:
            java.lang.Object r6 = r6.q
            i0.f.a.c.d r6 = (i0.f.a.c.d) r6
            java.lang.Object r4 = r4.q
            i0.f.a.c.h r4 = (i0.f.a.c.h) r4
            com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer r11 = new com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer
            r11.<init>((com.fasterxml.jackson.databind.JavaType) r2, (i0.f.a.c.h) r4, (i0.f.a.c.d<java.lang.Object>) r6, (i0.f.a.c.p.b) r7)
            goto L_0x088c
        L_0x06a2:
            java.lang.String r6 = r4.getName()
            boolean r7 = r4.isPrimitive()
            if (r7 != 0) goto L_0x06b4
            java.lang.String r7 = "java."
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0796
        L_0x06b4:
            java.util.HashSet<java.lang.String> r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.a
            boolean r7 = r4.isPrimitive()
            if (r7 == 0) goto L_0x0704
            java.lang.Class r7 = java.lang.Integer.TYPE
            if (r4 != r7) goto L_0x06c4
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.a2
            goto L_0x076a
        L_0x06c4:
            java.lang.Class r7 = java.lang.Boolean.TYPE
            if (r4 != r7) goto L_0x06cc
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.a2
            goto L_0x076a
        L_0x06cc:
            java.lang.Class r7 = java.lang.Long.TYPE
            if (r4 != r7) goto L_0x06d4
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.a2
            goto L_0x076a
        L_0x06d4:
            java.lang.Class r7 = java.lang.Double.TYPE
            if (r4 != r7) goto L_0x06dc
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.a2
            goto L_0x076a
        L_0x06dc:
            java.lang.Class r7 = java.lang.Character.TYPE
            if (r4 != r7) goto L_0x06e4
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.a2
            goto L_0x076a
        L_0x06e4:
            java.lang.Class r7 = java.lang.Byte.TYPE
            if (r4 != r7) goto L_0x06ec
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.a2
            goto L_0x076a
        L_0x06ec:
            java.lang.Class r7 = java.lang.Short.TYPE
            if (r4 != r7) goto L_0x06f4
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.a2
            goto L_0x076a
        L_0x06f4:
            java.lang.Class r7 = java.lang.Float.TYPE
            if (r4 != r7) goto L_0x06fc
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.a2
            goto L_0x076a
        L_0x06fc:
            java.lang.Class r7 = java.lang.Void.TYPE
            if (r4 != r7) goto L_0x0759
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.x
            goto L_0x076a
        L_0x0704:
            java.util.HashSet<java.lang.String> r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.a
            boolean r7 = r7.contains(r6)
            if (r7 == 0) goto L_0x0769
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            if (r4 != r7) goto L_0x0713
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.b2
            goto L_0x076a
        L_0x0713:
            java.lang.Class<java.lang.Boolean> r7 = java.lang.Boolean.class
            if (r4 != r7) goto L_0x071a
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.b2
            goto L_0x076a
        L_0x071a:
            java.lang.Class<java.lang.Long> r7 = java.lang.Long.class
            if (r4 != r7) goto L_0x0721
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.b2
            goto L_0x076a
        L_0x0721:
            java.lang.Class<java.lang.Double> r7 = java.lang.Double.class
            if (r4 != r7) goto L_0x0728
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.b2
            goto L_0x076a
        L_0x0728:
            java.lang.Class<java.lang.Character> r7 = java.lang.Character.class
            if (r4 != r7) goto L_0x072f
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.b2
            goto L_0x076a
        L_0x072f:
            java.lang.Class<java.lang.Byte> r7 = java.lang.Byte.class
            if (r4 != r7) goto L_0x0736
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.b2
            goto L_0x076a
        L_0x0736:
            java.lang.Class<java.lang.Short> r7 = java.lang.Short.class
            if (r4 != r7) goto L_0x073d
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.b2
            goto L_0x076a
        L_0x073d:
            java.lang.Class<java.lang.Float> r7 = java.lang.Float.class
            if (r4 != r7) goto L_0x0744
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.b2
            goto L_0x076a
        L_0x0744:
            java.lang.Class<java.lang.Number> r7 = java.lang.Number.class
            if (r4 != r7) goto L_0x074b
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer.x
            goto L_0x076a
        L_0x074b:
            java.lang.Class<java.math.BigDecimal> r7 = java.math.BigDecimal.class
            if (r4 != r7) goto L_0x0752
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer.x
            goto L_0x076a
        L_0x0752:
            java.lang.Class<java.math.BigInteger> r7 = java.math.BigInteger.class
            if (r4 != r7) goto L_0x0759
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer r7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer.x
            goto L_0x076a
        L_0x0759:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Internal error: can't find deserializer for "
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            java.lang.String r1 = i0.d.a.a.a.W(r4, r1)
            r0.<init>(r1)
            throw r0
        L_0x0769:
            r7 = r10
        L_0x076a:
            if (r7 != 0) goto L_0x0792
            java.util.HashSet<java.lang.String> r7 = com.fasterxml.jackson.databind.deser.std.DateDeserializers.a
            boolean r7 = r7.contains(r6)
            if (r7 == 0) goto L_0x0791
            java.lang.Class<java.util.Calendar> r7 = java.util.Calendar.class
            if (r4 != r7) goto L_0x077e
            com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer r7 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer
            r7.<init>()
            goto L_0x0792
        L_0x077e:
            java.lang.Class<java.util.Date> r7 = java.util.Date.class
            if (r4 != r7) goto L_0x0785
            com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateDeserializer r7 = com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer.Y1
            goto L_0x0792
        L_0x0785:
            java.lang.Class<java.util.GregorianCalendar> r7 = java.util.GregorianCalendar.class
            if (r4 != r7) goto L_0x0791
            com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer r7 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer
            java.lang.Class<java.util.GregorianCalendar> r11 = java.util.GregorianCalendar.class
            r7.<init>(r11)
            goto L_0x0792
        L_0x0791:
            r7 = r10
        L_0x0792:
            if (r7 == 0) goto L_0x0796
            goto L_0x088b
        L_0x0796:
            java.lang.Class<i0.f.a.c.t.r> r7 = i0.f.a.c.t.r.class
            if (r4 != r7) goto L_0x07a1
            com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer r4 = new com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer
            r4.<init>()
            goto L_0x0867
        L_0x07a1:
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory r7 = com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.x
            com.fasterxml.jackson.databind.DeserializationConfig r11 = r0.q
            java.util.Objects.requireNonNull(r7)
            java.lang.Class<?> r12 = r2.c
            i0.f.a.c.m.a r13 = com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.q
            if (r13 == 0) goto L_0x07b6
            i0.f.a.c.d r13 = r13.a(r12)
            if (r13 == 0) goto L_0x07b6
            r7 = r13
            goto L_0x080b
        L_0x07b6:
            java.lang.Class<?> r13 = com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.c
            boolean r13 = r7.a(r12, r13)
            if (r13 == 0) goto L_0x07c7
            java.lang.String r11 = "com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer"
            java.lang.Object r7 = r7.d(r11, r2)
            i0.f.a.c.d r7 = (i0.f.a.c.d) r7
            goto L_0x080b
        L_0x07c7:
            java.lang.Class<?> r13 = com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.d
            boolean r13 = r7.a(r12, r13)
            if (r13 == 0) goto L_0x07d8
            java.lang.String r11 = "com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer"
            java.lang.Object r7 = r7.d(r11, r2)
            i0.f.a.c.d r7 = (i0.f.a.c.d) r7
            goto L_0x080b
        L_0x07d8:
            java.lang.String r13 = r12.getName()
            java.util.Map<java.lang.String, java.lang.String> r14 = r7.y
            java.lang.Object r14 = r14.get(r13)
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L_0x07ed
            java.lang.Object r7 = r7.d(r14, r2)
            i0.f.a.c.d r7 = (i0.f.a.c.d) r7
            goto L_0x080b
        L_0x07ed:
            java.lang.String r14 = "javax.xml."
            boolean r13 = r13.startsWith(r14)
            if (r13 != 0) goto L_0x07fb
            boolean r12 = r7.b(r12, r14)
            if (r12 == 0) goto L_0x0803
        L_0x07fb:
            java.lang.String r12 = "com.fasterxml.jackson.databind.ext.CoreXMLDeserializers"
            java.lang.Object r7 = r7.d(r12, r2)
            if (r7 != 0) goto L_0x0805
        L_0x0803:
            r7 = r10
            goto L_0x080b
        L_0x0805:
            i0.f.a.c.l.g r7 = (i0.f.a.c.l.g) r7
            i0.f.a.c.d r7 = r7.c(r2, r11, r8)
        L_0x080b:
            if (r7 == 0) goto L_0x080f
            goto L_0x088b
        L_0x080f:
            java.util.HashSet<java.lang.String> r7 = i0.f.a.c.l.n.a.a
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L_0x0863
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer r6 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.B0(r4)
            if (r6 == 0) goto L_0x0820
            r11 = r6
            goto L_0x088c
        L_0x0820:
            java.lang.Class<java.util.UUID> r6 = java.util.UUID.class
            if (r4 != r6) goto L_0x082a
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer r4 = new com.fasterxml.jackson.databind.deser.std.UUIDDeserializer
            r4.<init>()
            goto L_0x0867
        L_0x082a:
            java.lang.Class<java.lang.StackTraceElement> r6 = java.lang.StackTraceElement.class
            if (r4 != r6) goto L_0x0834
            com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer r4 = new com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer
            r4.<init>()
            goto L_0x0867
        L_0x0834:
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r6 = java.util.concurrent.atomic.AtomicBoolean.class
            if (r4 != r6) goto L_0x083e
            com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer r4 = new com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer
            r4.<init>()
            goto L_0x0867
        L_0x083e:
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r6 = java.util.concurrent.atomic.AtomicInteger.class
            if (r4 != r6) goto L_0x0848
            com.fasterxml.jackson.databind.deser.std.AtomicIntegerDeserializer r4 = new com.fasterxml.jackson.databind.deser.std.AtomicIntegerDeserializer
            r4.<init>()
            goto L_0x0867
        L_0x0848:
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r6 = java.util.concurrent.atomic.AtomicLong.class
            if (r4 != r6) goto L_0x0852
            com.fasterxml.jackson.databind.deser.std.AtomicLongDeserializer r4 = new com.fasterxml.jackson.databind.deser.std.AtomicLongDeserializer
            r4.<init>()
            goto L_0x0867
        L_0x0852:
            java.lang.Class<java.nio.ByteBuffer> r6 = java.nio.ByteBuffer.class
            if (r4 != r6) goto L_0x085c
            com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer r4 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer
            r4.<init>()
            goto L_0x0867
        L_0x085c:
            java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
            if (r4 != r6) goto L_0x0863
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer r4 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.x
            goto L_0x0867
        L_0x0863:
            r11 = r10
            goto L_0x088c
        L_0x0865:
            com.fasterxml.jackson.databind.deser.std.StringDeserializer r4 = com.fasterxml.jackson.databind.deser.std.StringDeserializer.x
        L_0x0867:
            r11 = r4
            goto L_0x088c
        L_0x0869:
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r0.q
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r6 = r1.y
            i0.f.a.c.a[] r6 = r6.b2
            int r6 = r6.length
            if (r6 <= 0) goto L_0x0874
            r6 = r9
            goto L_0x0875
        L_0x0874:
            r6 = r5
        L_0x0875:
            if (r6 == 0) goto L_0x0884
            java.lang.Class<java.util.List> r6 = java.util.List.class
            com.fasterxml.jackson.databind.JavaType r6 = r1.k(r4, r6)
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            com.fasterxml.jackson.databind.JavaType r4 = r1.k(r4, r7)
            goto L_0x0886
        L_0x0884:
            r4 = r10
            r6 = r4
        L_0x0886:
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer r7 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer
            r7.<init>((com.fasterxml.jackson.databind.JavaType) r6, (com.fasterxml.jackson.databind.JavaType) r4)
        L_0x088b:
            r11 = r7
        L_0x088c:
            if (r11 == 0) goto L_0x08ae
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r4 = r1.y
            boolean r4 = r4.c()
            if (r4 == 0) goto L_0x08ae
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r4 = r1.y
            java.lang.Iterable r4 = r4.a()
            i0.f.a.c.t.c r4 = (i0.f.a.c.t.c) r4
        L_0x089e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x08ae
            java.lang.Object r6 = r4.next()
            i0.f.a.c.l.b r6 = (i0.f.a.c.l.b) r6
            java.util.Objects.requireNonNull(r6)
            goto L_0x089e
        L_0x08ae:
            if (r11 == 0) goto L_0x08b2
            goto L_0x0953
        L_0x08b2:
            java.lang.Class<?> r4 = r2.c
            java.lang.String r6 = i0.f.a.c.t.f.d(r4)
            java.lang.String r7 = ") as a Bean"
            java.lang.String r11 = " (of type "
            java.lang.String r12 = "Cannot deserialize Class "
            if (r6 != 0) goto L_0x098e
            boolean r6 = i0.f.a.c.t.f.B(r4)
            if (r6 != 0) goto L_0x097c
            int r6 = r4.getModifiers()     // Catch:{ NullPointerException | SecurityException -> 0x08e4 }
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)     // Catch:{ NullPointerException | SecurityException -> 0x08e4 }
            if (r6 != 0) goto L_0x08e4
            boolean r6 = i0.f.a.c.t.f.A(r4)     // Catch:{ NullPointerException | SecurityException -> 0x08e4 }
            if (r6 != 0) goto L_0x08de
            java.lang.reflect.Method r6 = r4.getEnclosingMethod()     // Catch:{ NullPointerException | SecurityException -> 0x08e4 }
            if (r6 == 0) goto L_0x08de
            r6 = r9
            goto L_0x08df
        L_0x08de:
            r6 = r5
        L_0x08df:
            if (r6 == 0) goto L_0x08e4
            java.lang.String r6 = "local/anonymous"
            goto L_0x08e5
        L_0x08e4:
            r6 = r10
        L_0x08e5:
            if (r6 != 0) goto L_0x095e
            i0.f.a.c.p.f.i r4 = i0.f.a.c.p.f.i.b
            java.util.Objects.requireNonNull(r4)
            java.lang.Class<?> r6 = r2.c
            java.lang.String r7 = r6.getName()
            java.util.Set<java.lang.String> r4 = r4.c
            boolean r4 = r4.contains(r7)
            if (r4 != 0) goto L_0x0954
            boolean r4 = r6.isInterface()
            if (r4 == 0) goto L_0x0901
            goto L_0x0936
        L_0x0901:
            java.lang.String r4 = "org.springframework."
            boolean r4 = r7.startsWith(r4)
            if (r4 == 0) goto L_0x0926
        L_0x0909:
            if (r6 == 0) goto L_0x0936
            if (r6 == r3) goto L_0x0936
            java.lang.String r4 = r6.getSimpleName()
            java.lang.String r11 = "AbstractPointcutAdvisor"
            boolean r11 = r11.equals(r4)
            if (r11 != 0) goto L_0x0954
            java.lang.String r11 = "AbstractApplicationContext"
            boolean r4 = r11.equals(r4)
            if (r4 != 0) goto L_0x0954
            java.lang.Class r6 = r6.getSuperclass()
            goto L_0x0909
        L_0x0926:
            java.lang.String r3 = "com.mchange.v2.c3p0."
            boolean r3 = r7.startsWith(r3)
            if (r3 == 0) goto L_0x0936
            java.lang.String r3 = "DataSource"
            boolean r3 = r7.endsWith(r3)
            if (r3 != 0) goto L_0x0954
        L_0x0936:
            java.lang.String r3 = h0.b0.v.D(r24)
            if (r3 == 0) goto L_0x094b
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r0.q
            java.lang.Class<?> r5 = r2.c
            java.lang.Class r4 = r4.a(r5)
            if (r4 != 0) goto L_0x094b
            com.fasterxml.jackson.databind.deser.impl.UnsupportedTypeDeserializer r10 = new com.fasterxml.jackson.databind.deser.impl.UnsupportedTypeDeserializer
            r10.<init>(r2, r3)
        L_0x094b:
            if (r10 == 0) goto L_0x094f
            r11 = r10
            goto L_0x0953
        L_0x094f:
            i0.f.a.c.d r11 = r1.G(r0, r2, r8)
        L_0x0953:
            return r11
        L_0x0954:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r5] = r7
            java.lang.String r2 = "Illegal type (%s) to deserialize: prevented for security reasons"
            r0.j0(r8, r2, r1)
            throw r10
        L_0x095e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r12)
            java.lang.String r2 = r4.getName()
            r1.append(r2)
            r1.append(r11)
            r1.append(r6)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x097c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot deserialize Proxy class "
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            java.lang.String r2 = " as a Bean"
            java.lang.String r1 = i0.d.a.a.a.Y(r4, r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x098e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r12)
            java.lang.String r2 = r4.getName()
            r1.append(r2)
            r1.append(r11)
            r1.append(r6)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.DeserializerCache.c(com.fasterxml.jackson.databind.DeserializationContext, i0.f.a.c.l.f, com.fasterxml.jackson.databind.JavaType, i0.f.a.c.b):i0.f.a.c.d");
    }

    public d<Object> d(JavaType javaType) {
        if (javaType == null) {
            throw new IllegalArgumentException("Null JavaType passed");
        } else if (e(javaType)) {
            return null;
        } else {
            return (d) this.c.d.get(javaType);
        }
    }

    public final boolean e(JavaType javaType) {
        if (!javaType.G()) {
            return false;
        }
        JavaType l = javaType.l();
        if (l != null && (l.q != null || l.x != null)) {
            return true;
        }
        if (!javaType.O() || javaType.q().q == null) {
            return false;
        }
        return true;
    }

    public d<Object> f(DeserializationContext deserializationContext, f fVar, JavaType javaType) throws JsonMappingException {
        d<Object> dVar;
        d<Object> d2 = d(javaType);
        if (d2 == null) {
            synchronized (this.d) {
                d2 = d(javaType);
                if (d2 == null) {
                    int size = this.d.size();
                    if (size <= 0 || (dVar = this.d.get(javaType)) == null) {
                        try {
                            d<Object> a = a(deserializationContext, fVar, javaType);
                            d2 = a;
                        } finally {
                            if (size == 0) {
                                if (this.d.size() > 0) {
                                    this.d.clear();
                                }
                            }
                        }
                    } else {
                        d2 = dVar;
                    }
                }
            }
            if (d2 == null) {
                Class<?> cls = javaType.c;
                Annotation[] annotationArr = i0.f.a.c.t.f.a;
                if (!((cls.getModifiers() & 1536) == 0)) {
                    throw new InvalidDefinitionException(deserializationContext.Z1, "Cannot find a Value deserializer for abstract type " + javaType, javaType);
                }
                throw new InvalidDefinitionException(deserializationContext.Z1, "Cannot find a Value deserializer for type " + javaType, javaType);
            }
        }
        return d2;
    }
}
