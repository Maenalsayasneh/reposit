package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.EnumResolver;
import i0.f.a.c.h;
import i0.f.a.c.l.f;
import i0.f.a.c.l.g;
import i0.f.a.c.n.i;
import i0.f.a.c.n.j;
import i0.f.a.c.n.p;
import i0.f.a.c.p.b;
import i0.f.a.c.p.d;
import i0.f.a.c.t.c;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public abstract class BasicDeserializerFactory extends f implements Serializable {
    public static final Class<?> c = CharSequence.class;
    public static final Class<?> d = Iterable.class;
    public static final Class<?> q = Map.Entry.class;
    public static final Class<?> x = Serializable.class;
    public final DeserializerFactoryConfig y;

    public static class a {
        public static final HashMap<String, Class<? extends Collection>> a;
        public static final HashMap<String, Class<? extends Map>> b;

        static {
            HashMap<String, Class<? extends Collection>> hashMap = new HashMap<>();
            Class<ArrayList> cls = ArrayList.class;
            Class<HashSet> cls2 = HashSet.class;
            hashMap.put(Collection.class.getName(), cls);
            hashMap.put(List.class.getName(), cls);
            hashMap.put(Set.class.getName(), cls2);
            hashMap.put(SortedSet.class.getName(), TreeSet.class);
            hashMap.put(Queue.class.getName(), LinkedList.class);
            hashMap.put(AbstractList.class.getName(), cls);
            hashMap.put(AbstractSet.class.getName(), cls2);
            hashMap.put(Deque.class.getName(), LinkedList.class);
            hashMap.put(NavigableSet.class.getName(), TreeSet.class);
            a = hashMap;
            HashMap<String, Class<? extends Map>> hashMap2 = new HashMap<>();
            Class<LinkedHashMap> cls3 = LinkedHashMap.class;
            hashMap2.put(Map.class.getName(), cls3);
            hashMap2.put(AbstractMap.class.getName(), cls3);
            hashMap2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
            hashMap2.put(SortedMap.class.getName(), TreeMap.class);
            hashMap2.put(NavigableMap.class.getName(), TreeMap.class);
            hashMap2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
            b = hashMap2;
        }
    }

    static {
        new PropertyName("@JsonUnwrapped");
    }

    public BasicDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        this.y = deserializerFactoryConfig;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x017c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.d<?> a(com.fasterxml.jackson.databind.DeserializationContext r13, com.fasterxml.jackson.databind.type.CollectionType r14, i0.f.a.c.b r15) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r12 = this;
            com.fasterxml.jackson.databind.JavaType r0 = r14.c2
            java.lang.Object r1 = r0.q
            i0.f.a.c.d r1 = (i0.f.a.c.d) r1
            com.fasterxml.jackson.databind.DeserializationConfig r8 = r13.q
            java.lang.Object r2 = r0.x
            i0.f.a.c.p.b r2 = (i0.f.a.c.p.b) r2
            if (r2 != 0) goto L_0x0012
            i0.f.a.c.p.b r2 = r12.b(r8, r0)
        L_0x0012:
            r9 = r2
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r2 = r12.y
            java.lang.Iterable r2 = r2.b()
            r10 = r2
            i0.f.a.c.t.c r10 = (i0.f.a.c.t.c) r10
        L_0x001c:
            boolean r2 = r10.hasNext()
            r11 = 0
            if (r2 == 0) goto L_0x0035
            java.lang.Object r2 = r10.next()
            i0.f.a.c.l.g r2 = (i0.f.a.c.l.g) r2
            r3 = r14
            r4 = r8
            r5 = r15
            r6 = r9
            r7 = r1
            i0.f.a.c.d r2 = r2.g(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x001c
            goto L_0x0036
        L_0x0035:
            r2 = r11
        L_0x0036:
            if (r2 != 0) goto L_0x0049
            java.lang.Class<?> r3 = r14.c
            if (r1 != 0) goto L_0x0049
            java.lang.Class<java.util.EnumSet> r4 = java.util.EnumSet.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L_0x0049
            com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer r2 = new com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer
            r2.<init>(r0, r11)
        L_0x0049:
            if (r2 != 0) goto L_0x0192
            boolean r3 = r14.M()
            r4 = 1
            if (r3 != 0) goto L_0x0058
            boolean r3 = r14.C()
            if (r3 == 0) goto L_0x009c
        L_0x0058:
            java.util.HashMap<java.lang.String, java.lang.Class<? extends java.util.Collection>> r3 = com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.a.a
            java.lang.Class<?> r5 = r14.c
            java.lang.String r5 = r5.getName()
            java.lang.Object r3 = r3.get(r5)
            java.lang.Class r3 = (java.lang.Class) r3
            if (r3 == 0) goto L_0x0073
            com.fasterxml.jackson.databind.cfg.BaseSettings r5 = r8.d
            com.fasterxml.jackson.databind.type.TypeFactory r5 = r5.d
            com.fasterxml.jackson.databind.JavaType r3 = r5.l(r14, r3, r4)
            com.fasterxml.jackson.databind.type.CollectionType r3 = (com.fasterxml.jackson.databind.type.CollectionType) r3
            goto L_0x0074
        L_0x0073:
            r3 = r11
        L_0x0074:
            if (r3 != 0) goto L_0x0097
            java.lang.Object r2 = r14.x
            if (r2 == 0) goto L_0x0080
            com.fasterxml.jackson.databind.deser.AbstractDeserializer r2 = new com.fasterxml.jackson.databind.deser.AbstractDeserializer
            r2.<init>(r15)
            goto L_0x009c
        L_0x0080:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Cannot find a deserializer for non-concrete Collection type "
            r15.append(r0)
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            r13.<init>(r14)
            throw r13
        L_0x0097:
            i0.f.a.c.b r15 = r8.E(r3)
            r14 = r3
        L_0x009c:
            if (r2 != 0) goto L_0x0192
            com.fasterxml.jackson.databind.deser.ValueInstantiator r13 = r12.y(r13, r15)
            boolean r15 = r13.k()
            r2 = 0
            if (r15 != 0) goto L_0x017d
            java.lang.Class<java.util.concurrent.ArrayBlockingQueue> r15 = java.util.concurrent.ArrayBlockingQueue.class
            java.lang.Class<?> r3 = r14.c
            if (r3 != r15) goto L_0x00b1
            r15 = r4
            goto L_0x00b2
        L_0x00b1:
            r15 = r2
        L_0x00b2:
            if (r15 == 0) goto L_0x00ba
            com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer r15 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer
            r15.<init>(r14, r1, r9, r13)
            return r15
        L_0x00ba:
            java.lang.Class<?> r15 = i0.f.a.c.l.m.e.a
            boolean r15 = r14.A(r15)
            if (r15 == 0) goto L_0x00d1
            r15 = 11
            java.lang.Class<java.util.List> r3 = java.util.List.class
            i0.f.a.c.l.m.e$a r5 = new i0.f.a.c.l.m.e$a
            com.fasterxml.jackson.databind.JavaType r3 = r14.i(r3)
            r5.<init>(r15, r3)
            goto L_0x0175
        L_0x00d1:
            java.lang.Class<?> r15 = i0.f.a.c.l.m.e.c
            boolean r15 = r14.A(r15)
            if (r15 == 0) goto L_0x00e7
            r15 = 2
            java.lang.Class<java.util.List> r3 = java.util.List.class
            i0.f.a.c.l.m.e$a r5 = new i0.f.a.c.l.m.e$a
            com.fasterxml.jackson.databind.JavaType r3 = r14.i(r3)
            r5.<init>(r15, r3)
            goto L_0x0175
        L_0x00e7:
            java.lang.Class<?> r15 = i0.f.a.c.l.m.e.b
            boolean r15 = r14.A(r15)
            if (r15 == 0) goto L_0x00fc
            java.lang.Class<java.util.Set> r15 = java.util.Set.class
            i0.f.a.c.l.m.e$a r5 = new i0.f.a.c.l.m.e$a
            com.fasterxml.jackson.databind.JavaType r15 = r14.i(r15)
            r5.<init>(r4, r15)
            goto L_0x0175
        L_0x00fc:
            java.lang.Class<?> r15 = i0.f.a.c.l.m.e.f
            boolean r15 = r14.A(r15)
            if (r15 != 0) goto L_0x0169
            java.lang.Class<?> r15 = i0.f.a.c.l.m.e.g
            boolean r15 = r14.A(r15)
            if (r15 == 0) goto L_0x010d
            goto L_0x0169
        L_0x010d:
            java.lang.Class<?> r15 = i0.f.a.c.l.m.e.e
            boolean r15 = r14.A(r15)
            if (r15 == 0) goto L_0x0122
            r15 = 4
            java.lang.Class<java.util.Set> r3 = java.util.Set.class
            i0.f.a.c.l.m.e$a r5 = new i0.f.a.c.l.m.e$a
            com.fasterxml.jackson.databind.JavaType r3 = r14.i(r3)
            r5.<init>(r15, r3)
            goto L_0x0175
        L_0x0122:
            java.lang.Class<?> r15 = r14.c
            java.lang.String r15 = i0.f.a.c.l.m.e.a(r15)
            java.lang.String r3 = "Set"
            boolean r3 = r15.endsWith(r3)
            if (r3 == 0) goto L_0x013d
            r15 = 7
            java.lang.Class<java.util.Set> r3 = java.util.Set.class
            i0.f.a.c.l.m.e$a r5 = new i0.f.a.c.l.m.e$a
            com.fasterxml.jackson.databind.JavaType r3 = r14.i(r3)
            r5.<init>(r15, r3)
            goto L_0x0175
        L_0x013d:
            java.lang.String r3 = "List"
            boolean r3 = r15.endsWith(r3)
            if (r3 == 0) goto L_0x0153
            r15 = 9
            java.lang.Class<java.util.List> r3 = java.util.List.class
            i0.f.a.c.l.m.e$a r5 = new i0.f.a.c.l.m.e$a
            com.fasterxml.jackson.databind.JavaType r3 = r14.i(r3)
            r5.<init>(r15, r3)
            goto L_0x0175
        L_0x0153:
            java.lang.String r3 = "Collection"
            boolean r15 = r15.endsWith(r3)
            if (r15 == 0) goto L_0x017a
            r15 = 8
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            i0.f.a.c.l.m.e$a r5 = new i0.f.a.c.l.m.e$a
            com.fasterxml.jackson.databind.JavaType r3 = r14.i(r3)
            r5.<init>(r15, r3)
            goto L_0x0175
        L_0x0169:
            r15 = 5
            java.lang.Class<java.util.List> r3 = java.util.List.class
            i0.f.a.c.l.m.e$a r5 = new i0.f.a.c.l.m.e$a
            com.fasterxml.jackson.databind.JavaType r3 = r14.i(r3)
            r5.<init>(r15, r3)
        L_0x0175:
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r11 = new com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            r11.<init>(r5)
        L_0x017a:
            if (r11 == 0) goto L_0x017d
            return r11
        L_0x017d:
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            java.lang.Class<?> r0 = r0.c
            if (r0 != r15) goto L_0x0184
            goto L_0x0185
        L_0x0184:
            r4 = r2
        L_0x0185:
            if (r4 == 0) goto L_0x018d
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer r2 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer
            r2.<init>(r14, r1, r13)
            goto L_0x0192
        L_0x018d:
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer r2 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
            r2.<init>(r14, r1, r9, r13)
        L_0x0192:
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r13 = r12.y
            boolean r13 = r13.c()
            if (r13 == 0) goto L_0x01b2
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r13 = r12.y
            java.lang.Iterable r13 = r13.a()
            i0.f.a.c.t.c r13 = (i0.f.a.c.t.c) r13
        L_0x01a2:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x01b2
            java.lang.Object r14 = r13.next()
            i0.f.a.c.l.b r14 = (i0.f.a.c.l.b) r14
            java.util.Objects.requireNonNull(r14)
            goto L_0x01a2
        L_0x01b2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.a(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.type.CollectionType, i0.f.a.c.b):i0.f.a.c.d");
    }

    public b b(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        Collection<NamedType> collection;
        i0.f.a.c.n.b bVar = ((i) deserializationConfig.n(javaType.c)).f;
        d l02 = deserializationConfig.e().l0(deserializationConfig, bVar, javaType);
        if (l02 == null) {
            l02 = deserializationConfig.d.Z1;
            if (l02 == null) {
                return null;
            }
            collection = null;
        } else {
            collection = deserializationConfig.Z1.b(deserializationConfig, bVar);
        }
        if (l02.h() == null && javaType.C()) {
            c(deserializationConfig, javaType);
            if (!javaType.A(javaType.c)) {
                l02 = l02.e(javaType.c);
            }
        }
        try {
            return l02.b(deserializationConfig, javaType, collection);
        } catch (IllegalArgumentException | IllegalStateException e) {
            InvalidDefinitionException invalidDefinitionException = new InvalidDefinitionException((JsonParser) null, i0.f.a.c.t.f.j(e), javaType);
            invalidDefinitionException.initCause(e);
            throw invalidDefinitionException;
        }
    }

    public JavaType c(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        Class<?> cls = javaType.c;
        i0.f.a.c.a[] aVarArr = this.y.b2;
        if (aVarArr.length > 0) {
            c cVar = new c(aVarArr);
            while (cVar.hasNext()) {
                Objects.requireNonNull((i0.f.a.c.a) cVar.next());
            }
        }
        return javaType;
    }

    public void d(DeserializationContext deserializationContext, i0.f.a.c.b bVar, i0.f.a.c.l.m.b bVar2, i0.f.a.c.l.m.a aVar, ConstructorDetector constructorDetector) throws JsonMappingException {
        PropertyName propertyName;
        boolean z;
        i0.f.a.c.l.m.b bVar3 = bVar2;
        i0.f.a.c.l.m.a aVar2 = aVar;
        ConstructorDetector constructorDetector2 = constructorDetector;
        boolean z2 = true;
        if (1 != aVar2.c) {
            if (!(constructorDetector2.d == ConstructorDetector.SingleArgConstructor.PROPERTIES)) {
                int i = -1;
                int i2 = -1;
                int i3 = 0;
                while (true) {
                    if (i3 >= aVar2.c) {
                        i = i2;
                        break;
                    }
                    if (aVar2.d[i3].c == null) {
                        if (i2 >= 0) {
                            break;
                        }
                        i2 = i3;
                    }
                    i3++;
                }
                if (i >= 0) {
                    if (constructorDetector2.d != ConstructorDetector.SingleArgConstructor.DELEGATING) {
                        z2 = false;
                    }
                    if (z2 || aVar2.d(i) == null) {
                        e(deserializationContext, bVar, bVar2, aVar);
                        return;
                    }
                }
            }
            f(deserializationContext, bVar, bVar2, aVar);
            return;
        }
        AnnotatedParameter e = aVar2.e(0);
        JacksonInject.Value c2 = aVar2.c(0);
        int ordinal = constructorDetector2.d.ordinal();
        if (ordinal == 0) {
            DeserializationContext deserializationContext2 = deserializationContext;
            i0.f.a.c.b bVar4 = bVar;
            z = false;
            propertyName = null;
        } else if (ordinal == 1) {
            DeserializationContext deserializationContext3 = deserializationContext;
            i0.f.a.c.b bVar5 = bVar;
            propertyName = aVar2.d(0);
            if (propertyName == null) {
                p(deserializationContext, bVar, aVar, 0, propertyName, c2);
            }
            z = true;
        } else if (ordinal != 3) {
            j f = aVar2.f(0);
            j jVar = aVar2.d[0].b;
            PropertyName b = (jVar == null || !jVar.I()) ? null : jVar.b();
            z = (b == null && c2 == null) ? false : true;
            if (!z && f != null) {
                b = aVar2.d(0);
                z = b != null && f.j();
            }
            DeserializationContext deserializationContext4 = deserializationContext;
            i0.f.a.c.b bVar6 = bVar;
            propertyName = b;
        } else {
            deserializationContext.j0(bVar, "Single-argument constructor (%s) is annotated but no 'mode' defined; `CreatorDetector`configured with `SingleArgConstructor.REQUIRE_MODE`", aVar2.b);
            throw null;
        }
        if (z) {
            bVar3.e(aVar2.b, true, new SettableBeanProperty[]{q(deserializationContext, bVar, propertyName, 0, e, c2)});
            return;
        }
        l(bVar3, aVar2.b, true, true);
        j f2 = aVar2.f(0);
        if (f2 != null) {
            ((p) f2).b2 = null;
        }
    }

    public void e(DeserializationContext deserializationContext, i0.f.a.c.b bVar, i0.f.a.c.l.m.b bVar2, i0.f.a.c.l.m.a aVar) throws JsonMappingException {
        DeserializationContext deserializationContext2 = deserializationContext;
        i0.f.a.c.b bVar3 = bVar;
        i0.f.a.c.l.m.b bVar4 = bVar2;
        i0.f.a.c.l.m.a aVar2 = aVar;
        int i = aVar2.c;
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[i];
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            AnnotatedParameter e = aVar2.e(i3);
            JacksonInject.Value c2 = aVar2.c(i3);
            if (c2 != null) {
                settableBeanPropertyArr[i3] = q(deserializationContext, bVar, (PropertyName) null, i3, e, c2);
            } else if (i2 < 0) {
                i2 = i3;
            } else {
                deserializationContext2.j0(bVar3, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i2), Integer.valueOf(i3), aVar2);
                throw null;
            }
        }
        if (i2 < 0) {
            deserializationContext2.j0(bVar3, "No argument left as delegating for Creator %s: exactly one required", aVar2);
            throw null;
        } else if (i == 1) {
            l(bVar4, aVar2.b, true, true);
            j f = aVar2.f(0);
            if (f != null) {
                ((p) f).b2 = null;
            }
        } else {
            bVar4.d(aVar2.b, true, settableBeanPropertyArr, i2);
        }
    }

    public void f(DeserializationContext deserializationContext, i0.f.a.c.b bVar, i0.f.a.c.l.m.b bVar2, i0.f.a.c.l.m.a aVar) throws JsonMappingException {
        PropertyName propertyName;
        i0.f.a.c.l.m.a aVar2 = aVar;
        int i = aVar2.c;
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[i];
        int i2 = 0;
        while (i2 < i) {
            JacksonInject.Value c2 = aVar2.c(i2);
            AnnotatedParameter e = aVar2.e(i2);
            PropertyName d2 = aVar2.d(i2);
            if (d2 != null) {
                DeserializationContext deserializationContext2 = deserializationContext;
                i0.f.a.c.b bVar3 = bVar;
                propertyName = d2;
            } else if (deserializationContext.G().m0(e) == null) {
                PropertyName b = aVar2.b(i2);
                p(deserializationContext, bVar, aVar, i2, b, c2);
                DeserializationContext deserializationContext3 = deserializationContext;
                i0.f.a.c.b bVar4 = bVar;
                propertyName = b;
            } else {
                n(deserializationContext, bVar, e);
                throw null;
            }
            int i3 = i2;
            settableBeanPropertyArr[i3] = q(deserializationContext, bVar, propertyName, i2, e, c2);
            i2 = i3 + 1;
        }
        bVar2.e(aVar2.b, true, settableBeanPropertyArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r3 = r5.getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(com.fasterxml.jackson.databind.AnnotationIntrospector r3, com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r4, i0.f.a.c.n.j r5) {
        /*
            r2 = this;
            r0 = 1
            if (r5 == 0) goto L_0x0009
            boolean r1 = r5.I()
            if (r1 != 0) goto L_0x0014
        L_0x0009:
            r1 = 0
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r4 = r4.w(r1)
            com.fasterxml.jackson.annotation.JacksonInject$Value r3 = r3.v(r4)
            if (r3 == 0) goto L_0x0015
        L_0x0014:
            return r0
        L_0x0015:
            if (r5 == 0) goto L_0x002a
            java.lang.String r3 = r5.getName()
            if (r3 == 0) goto L_0x002a
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x002a
            boolean r3 = r5.j()
            if (r3 == 0) goto L_0x002a
            return r0
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.g(com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, i0.f.a.c.n.j):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: com.fasterxml.jackson.databind.introspect.AnnotatedWithParams} */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0170, code lost:
        r5 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x054d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.deser.ValueInstantiator h(com.fasterxml.jackson.databind.DeserializationContext r35, i0.f.a.c.b r36) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r34 = this;
            r7 = r34
            r8 = r35
            r9 = r36
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r8.q
            com.fasterxml.jackson.databind.JavaType r1 = r9.a
            java.lang.Class<?> r1 = r1.c
            r10 = r9
            i0.f.a.c.n.i r10 = (i0.f.a.c.n.i) r10
            i0.f.a.c.n.b r2 = r10.f
            com.fasterxml.jackson.databind.introspect.VisibilityChecker r11 = r0.l(r1, r2)
            com.fasterxml.jackson.databind.cfg.ConstructorDetector r1 = r0.A()
            i0.f.a.c.l.m.b r12 = new i0.f.a.c.l.m.b
            r12.<init>(r9, r0)
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.util.List r2 = r10.h()
            java.util.Iterator r2 = r2.iterator()
            r13 = r0
        L_0x002b:
            boolean r0 = r2.hasNext()
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r2.next()
            i0.f.a.c.n.j r0 = (i0.f.a.c.n.j) r0
            java.util.Iterator r3 = r0.t()
        L_0x003d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x002b
            java.lang.Object r4 = r3.next()
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r4 = (com.fasterxml.jackson.databind.introspect.AnnotatedParameter) r4
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r15 = r4.q
            java.lang.Object r17 = r13.get(r15)
            i0.f.a.c.n.j[] r17 = (i0.f.a.c.n.j[]) r17
            int r4 = r4.y
            if (r17 != 0) goto L_0x006c
            boolean r17 = r13.isEmpty()
            if (r17 == 0) goto L_0x0060
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
        L_0x0060:
            int r14 = r15.x()
            i0.f.a.c.n.j[] r14 = new i0.f.a.c.n.j[r14]
            r13.put(r15, r14)
            r17 = r14
            goto L_0x0070
        L_0x006c:
            r14 = r17[r4]
            if (r14 != 0) goto L_0x0073
        L_0x0070:
            r17[r4] = r0
            goto L_0x003d
        L_0x0073:
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1[r5] = r2
            r1[r6] = r15
            r2 = r17[r4]
            r3 = 2
            r1[r3] = r2
            r2 = 3
            r1[r2] = r0
            java.lang.String r0 = "Conflict: parameter #%d of %s bound to more than one property; %s vs %s"
            r8.j0(r9, r0, r1)
            r0 = 0
            throw r0
        L_0x008d:
            java.util.Objects.requireNonNull(r1)
            com.fasterxml.jackson.databind.AnnotationIntrospector r14 = r35.G()
            java.util.List r0 = r36.f()
            java.util.Iterator r15 = r0.iterator()
            r18 = r5
            r17 = 0
        L_0x00a0:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x012b
            java.lang.Object r0 = r15.next()
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r0
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r8.q
            com.fasterxml.jackson.annotation.JsonCreator$Mode r1 = r14.e(r1, r0)
            int r2 = r0.x()
            if (r1 != 0) goto L_0x00d8
            if (r2 != r6) goto L_0x00a0
            r1 = r11
            com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std r1 = (com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std) r1
            boolean r1 = r1.c(r0)
            if (r1 == 0) goto L_0x00a0
            r1 = 0
            i0.f.a.c.l.m.a r0 = i0.f.a.c.l.m.a.a(r14, r0, r1)
            if (r17 != 0) goto L_0x00d0
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            goto L_0x00d2
        L_0x00d0:
            r1 = r17
        L_0x00d2:
            r1.add(r0)
            r17 = r1
            goto L_0x00a0
        L_0x00d8:
            com.fasterxml.jackson.annotation.JsonCreator$Mode r3 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DISABLED
            if (r1 != r3) goto L_0x00dd
            goto L_0x00a0
        L_0x00dd:
            if (r2 != 0) goto L_0x00e3
            r12.g(r0)
            goto L_0x00a0
        L_0x00e3:
            int r1 = r1.ordinal()
            if (r1 == r6) goto L_0x0119
            r2 = 2
            if (r1 == r2) goto L_0x0108
            java.lang.Object r1 = r13.get(r0)
            i0.f.a.c.n.j[] r1 = (i0.f.a.c.n.j[]) r1
            i0.f.a.c.l.m.a r4 = i0.f.a.c.l.m.a.a(r14, r0, r1)
            com.fasterxml.jackson.databind.cfg.ConstructorDetector r19 = com.fasterxml.jackson.databind.cfg.ConstructorDetector.c
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r12
            r20 = r15
            r15 = r5
            r5 = r19
            r0.d(r1, r2, r3, r4, r5)
            goto L_0x0124
        L_0x0108:
            r20 = r15
            r15 = r5
            java.lang.Object r1 = r13.get(r0)
            i0.f.a.c.n.j[] r1 = (i0.f.a.c.n.j[]) r1
            i0.f.a.c.l.m.a r0 = i0.f.a.c.l.m.a.a(r14, r0, r1)
            r7.f(r8, r9, r12, r0)
            goto L_0x0124
        L_0x0119:
            r20 = r15
            r1 = 0
            r15 = r5
            i0.f.a.c.l.m.a r0 = i0.f.a.c.l.m.a.a(r14, r0, r1)
            r7.e(r8, r9, r12, r0)
        L_0x0124:
            int r18 = r18 + 1
            r5 = r15
            r15 = r20
            goto L_0x00a0
        L_0x012b:
            r15 = r5
            com.fasterxml.jackson.databind.JavaType r0 = r9.a
            boolean r0 = r0.F()
            if (r0 == 0) goto L_0x0541
            com.fasterxml.jackson.databind.JavaType r0 = r9.a
            boolean r0 = r0.R()
            if (r0 == 0) goto L_0x01d8
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            i0.f.a.c.o.a r0 = new i0.f.a.c.o.a
            r0.<init>(r8, r9)
            java.util.List<com.fasterxml.jackson.databind.introspect.AnnotatedConstructor> r1 = r0.d
            java.util.Iterator r1 = r1.iterator()
        L_0x014c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0172
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r2 = (com.fasterxml.jackson.databind.introspect.AnnotatedConstructor) r2
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r0.c
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r0.b
            com.fasterxml.jackson.annotation.JsonCreator$Mode r3 = r3.e(r4, r2)
            if (r3 == 0) goto L_0x014c
            com.fasterxml.jackson.annotation.JsonCreator$Mode r4 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DISABLED
            if (r4 != r3) goto L_0x0167
            goto L_0x014c
        L_0x0167:
            com.fasterxml.jackson.annotation.JsonCreator$Mode r4 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING
            if (r4 != r3) goto L_0x016c
            goto L_0x0170
        L_0x016c:
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r3 = r0.e
            if (r2 == r3) goto L_0x014c
        L_0x0170:
            r5 = 0
            goto L_0x0185
        L_0x0172:
            i0.f.a.c.o.b[] r1 = r0.f
            int r2 = r1.length
            r5 = r15
        L_0x0176:
            if (r5 >= r2) goto L_0x0182
            r3 = r1[r5]
            java.lang.String r3 = r3.b
            r14.add(r3)
            int r5 = r5 + 1
            goto L_0x0176
        L_0x0182:
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = r0.e
            r5 = r0
        L_0x0185:
            if (r5 == 0) goto L_0x01d8
            int r10 = r5.x()
            com.fasterxml.jackson.databind.AnnotationIntrospector r11 = r35.G()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r13 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[r10]
            r6 = r15
        L_0x0192:
            if (r6 >= r10) goto L_0x01ce
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r4 = r5.w(r6)
            com.fasterxml.jackson.annotation.JacksonInject$Value r16 = r11.v(r4)
            com.fasterxml.jackson.databind.PropertyName r0 = r11.A(r4)
            if (r0 == 0) goto L_0x01a8
            boolean r1 = r0.e()
            if (r1 == 0) goto L_0x01b2
        L_0x01a8:
            java.lang.Object r0 = r14.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            com.fasterxml.jackson.databind.PropertyName r0 = com.fasterxml.jackson.databind.PropertyName.a(r0)
        L_0x01b2:
            r3 = r0
            r0 = r34
            r1 = r35
            r2 = r36
            r17 = r4
            r4 = r6
            r15 = r5
            r5 = r17
            r17 = r6
            r6 = r16
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.q(r1, r2, r3, r4, r5, r6)
            r13[r17] = r0
            int r6 = r17 + 1
            r5 = r15
            r15 = 0
            goto L_0x0192
        L_0x01ce:
            r0 = r15
            r15 = r5
            r12.e(r15, r0, r13)
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r12.f(r8)
            return r0
        L_0x01d8:
            i0.f.a.c.n.b r0 = r10.f
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x01e2
            goto L_0x0541
        L_0x01e2:
            com.fasterxml.jackson.databind.JavaType r0 = r9.a
            java.lang.Class<?> r0 = r0.c
            boolean r1 = i0.f.a.c.t.f.x(r0)
            if (r1 == 0) goto L_0x01f6
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 != 0) goto L_0x01f6
            r14 = 0
            goto L_0x01f7
        L_0x01f6:
            r14 = r6
        L_0x01f7:
            com.fasterxml.jackson.databind.AnnotationIntrospector r15 = r35.G()
            i0.f.a.c.n.b r0 = r10.f
            i0.f.a.c.n.b$a r0 = r0.g()
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = r0.a
            if (r0 == 0) goto L_0x021a
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] r1 = r12.e
            r2 = 0
            r1 = r1[r2]
            if (r1 == 0) goto L_0x020e
            r5 = r6
            goto L_0x020f
        L_0x020e:
            r5 = 0
        L_0x020f:
            if (r5 == 0) goto L_0x0217
            boolean r1 = r7.m(r8, r0)
            if (r1 == 0) goto L_0x021a
        L_0x0217:
            r12.g(r0)
        L_0x021a:
            i0.f.a.c.n.b r0 = r10.f
            java.util.List r0 = r0.k()
            java.util.Iterator r20 = r0.iterator()
            r21 = 0
            r22 = 0
        L_0x0228:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x02a3
            java.lang.Object r0 = r20.next()
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedConstructor) r0
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r8.q
            com.fasterxml.jackson.annotation.JsonCreator$Mode r1 = r15.e(r1, r0)
            com.fasterxml.jackson.annotation.JsonCreator$Mode r2 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DISABLED
            if (r2 != r1) goto L_0x023f
            goto L_0x0228
        L_0x023f:
            if (r1 != 0) goto L_0x0266
            if (r14 == 0) goto L_0x0228
            r1 = r11
            com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std r1 = (com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std) r1
            boolean r1 = r1.c(r0)
            if (r1 == 0) goto L_0x0228
            java.lang.Object r1 = r13.get(r0)
            i0.f.a.c.n.j[] r1 = (i0.f.a.c.n.j[]) r1
            i0.f.a.c.l.m.a r0 = i0.f.a.c.l.m.a.a(r15, r0, r1)
            if (r22 != 0) goto L_0x025e
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            goto L_0x0260
        L_0x025e:
            r1 = r22
        L_0x0260:
            r1.add(r0)
            r22 = r1
            goto L_0x0228
        L_0x0266:
            int r1 = r1.ordinal()
            if (r1 == r6) goto L_0x0298
            r2 = 2
            if (r1 == r2) goto L_0x028a
            java.lang.Object r1 = r13.get(r0)
            i0.f.a.c.n.j[] r1 = (i0.f.a.c.n.j[]) r1
            i0.f.a.c.l.m.a r4 = i0.f.a.c.l.m.a.a(r15, r0, r1)
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r8.q
            com.fasterxml.jackson.databind.cfg.ConstructorDetector r5 = r0.A()
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r12
            r0.d(r1, r2, r3, r4, r5)
            goto L_0x02a0
        L_0x028a:
            java.lang.Object r1 = r13.get(r0)
            i0.f.a.c.n.j[] r1 = (i0.f.a.c.n.j[]) r1
            i0.f.a.c.l.m.a r0 = i0.f.a.c.l.m.a.a(r15, r0, r1)
            r7.f(r8, r9, r12, r0)
            goto L_0x02a0
        L_0x0298:
            r1 = 0
            i0.f.a.c.l.m.a r0 = i0.f.a.c.l.m.a.a(r15, r0, r1)
            r7.e(r8, r9, r12, r0)
        L_0x02a0:
            int r21 = r21 + 1
            goto L_0x0228
        L_0x02a3:
            if (r22 == 0) goto L_0x02a7
            r5 = r6
            goto L_0x02a8
        L_0x02a7:
            r5 = 0
        L_0x02a8:
            if (r5 == 0) goto L_0x053a
            if (r21 <= 0) goto L_0x02ae
            r5 = r6
            goto L_0x02af
        L_0x02ae:
            r5 = 0
        L_0x02af:
            if (r5 != 0) goto L_0x053a
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r8.q
            com.fasterxml.jackson.databind.AnnotationIntrospector r14 = r35.G()
            com.fasterxml.jackson.databind.cfg.ConstructorDetector r0 = r0.A()
            com.fasterxml.jackson.databind.cfg.ConstructorDetector$SingleArgConstructor r0 = r0.d
            com.fasterxml.jackson.databind.cfg.ConstructorDetector$SingleArgConstructor r1 = com.fasterxml.jackson.databind.cfg.ConstructorDetector.SingleArgConstructor.PROPERTIES
            if (r0 != r1) goto L_0x02c3
            r15 = r6
            goto L_0x02c4
        L_0x02c3:
            r15 = 0
        L_0x02c4:
            java.util.Iterator r20 = r22.iterator()
            r22 = 0
        L_0x02ca:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x044e
            java.lang.Object r0 = r20.next()
            r5 = r0
            i0.f.a.c.l.m.a r5 = (i0.f.a.c.l.m.a) r5
            int r4 = r5.c
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r3 = r5.b
            if (r4 != r6) goto L_0x0352
            r2 = 0
            i0.f.a.c.n.j r0 = r5.f(r2)
            if (r15 != 0) goto L_0x02ed
            boolean r1 = r7.g(r14, r3, r0)
            if (r1 == 0) goto L_0x02eb
            goto L_0x02ed
        L_0x02eb:
            r1 = r2
            goto L_0x02ee
        L_0x02ed:
            r1 = r6
        L_0x02ee:
            if (r1 == 0) goto L_0x0334
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r4 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[r6]
            com.fasterxml.jackson.annotation.JacksonInject$Value r19 = r5.c(r2)
            com.fasterxml.jackson.databind.PropertyName r0 = r5.d(r2)
            if (r0 != 0) goto L_0x030c
            com.fasterxml.jackson.databind.PropertyName r0 = r5.b(r2)
            if (r0 != 0) goto L_0x030c
            if (r19 != 0) goto L_0x030c
            r24 = r10
            r23 = r13
            r26 = r15
            r10 = r6
            goto L_0x034e
        L_0x030c:
            r23 = r0
            r24 = 0
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r5 = r5.e(r2)
            r0 = r34
            r1 = r35
            r2 = r36
            r26 = r15
            r15 = r3
            r3 = r23
            r23 = r13
            r13 = r4
            r4 = r24
            r24 = r10
            r10 = r6
            r6 = r19
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.q(r1, r2, r3, r4, r5, r6)
            r1 = 0
            r13[r1] = r0
            r12.e(r15, r1, r13)
            goto L_0x034e
        L_0x0334:
            r1 = r2
            r24 = r10
            r23 = r13
            r26 = r15
            r15 = r3
            r10 = r6
            r2 = r11
            com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std r2 = (com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std) r2
            boolean r2 = r2.c(r15)
            r7.l(r12, r15, r1, r2)
            if (r0 == 0) goto L_0x034e
            i0.f.a.c.n.p r0 = (i0.f.a.c.n.p) r0
            r1 = 0
            r0.b2 = r1
        L_0x034e:
            r32 = r11
            goto L_0x042f
        L_0x0352:
            r24 = r10
            r23 = r13
            r26 = r15
            r15 = r3
            r10 = r6
            r0 = -1
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r13 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[r4]
            r6 = r0
            r3 = 0
            r25 = 0
            r27 = 0
        L_0x0363:
            if (r3 >= r4) goto L_0x03e5
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r2 = r15.w(r3)
            i0.f.a.c.n.j r0 = r5.f(r3)
            com.fasterxml.jackson.annotation.JacksonInject$Value r28 = r14.v(r2)
            if (r0 != 0) goto L_0x0376
            r29 = 0
            goto L_0x037c
        L_0x0376:
            com.fasterxml.jackson.databind.PropertyName r1 = r0.b()
            r29 = r1
        L_0x037c:
            if (r0 == 0) goto L_0x03a6
            boolean r0 = r0.I()
            if (r0 == 0) goto L_0x03a6
            int r25 = r25 + 1
            r0 = r34
            r1 = r35
            r30 = r2
            r2 = r36
            r31 = r3
            r3 = r29
            r10 = r4
            r4 = r31
            r32 = r11
            r11 = r5
            r5 = r30
            r33 = r11
            r11 = r6
            r6 = r28
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.q(r1, r2, r3, r4, r5, r6)
            r13[r31] = r0
            goto L_0x03d6
        L_0x03a6:
            r30 = r2
            r31 = r3
            r10 = r4
            r33 = r5
            r32 = r11
            r11 = r6
            if (r28 == 0) goto L_0x03c9
            int r27 = r27 + 1
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r29
            r4 = r31
            r5 = r30
            r6 = r28
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.q(r1, r2, r3, r4, r5, r6)
            r13[r31] = r0
            goto L_0x03d6
        L_0x03c9:
            r0 = r30
            com.fasterxml.jackson.databind.util.NameTransformer r1 = r14.m0(r0)
            if (r1 != 0) goto L_0x03e0
            if (r11 >= 0) goto L_0x03d6
            r6 = r31
            goto L_0x03d7
        L_0x03d6:
            r6 = r11
        L_0x03d7:
            int r3 = r31 + 1
            r4 = r10
            r11 = r32
            r5 = r33
            r10 = 1
            goto L_0x0363
        L_0x03e0:
            r7.n(r8, r9, r0)
            r0 = 0
            throw r0
        L_0x03e5:
            r10 = r4
            r33 = r5
            r32 = r11
            r11 = r6
            int r0 = r25 + 0
            if (r25 > 0) goto L_0x03f4
            if (r27 <= 0) goto L_0x03f2
            goto L_0x03f4
        L_0x03f2:
            r0 = 0
            goto L_0x0416
        L_0x03f4:
            int r0 = r0 + r27
            if (r0 != r10) goto L_0x03fd
            r0 = 0
            r12.e(r15, r0, r13)
            goto L_0x042f
        L_0x03fd:
            r0 = 0
            if (r25 != 0) goto L_0x0408
            int r1 = r27 + 1
            if (r1 != r10) goto L_0x0408
            r12.d(r15, r0, r13, r0)
            goto L_0x042f
        L_0x0408:
            r1 = r33
            com.fasterxml.jackson.databind.PropertyName r1 = r1.b(r11)
            if (r1 == 0) goto L_0x043a
            boolean r1 = r1.e()
            if (r1 != 0) goto L_0x043a
        L_0x0416:
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] r1 = r12.e
            r1 = r1[r0]
            if (r1 == 0) goto L_0x041e
            r6 = 1
            goto L_0x041f
        L_0x041e:
            r6 = 0
        L_0x041f:
            if (r6 != 0) goto L_0x042f
            if (r22 != 0) goto L_0x0428
            java.util.LinkedList r22 = new java.util.LinkedList
            r22.<init>()
        L_0x0428:
            r0 = r22
            r0.add(r15)
            r22 = r0
        L_0x042f:
            r13 = r23
            r10 = r24
            r15 = r26
            r11 = r32
            r6 = 1
            goto L_0x02ca
        L_0x043a:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r0[r1] = r15
            java.lang.String r1 = "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator"
            r8.j0(r9, r1, r0)
            r0 = 0
            throw r0
        L_0x044e:
            r24 = r10
            r32 = r11
            r23 = r13
            if (r22 == 0) goto L_0x053e
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] r0 = r12.e
            r1 = 8
            r1 = r0[r1]
            if (r1 == 0) goto L_0x0460
            r6 = 1
            goto L_0x0461
        L_0x0460:
            r6 = 0
        L_0x0461:
            if (r6 != 0) goto L_0x053e
            r1 = 9
            r0 = r0[r1]
            if (r0 == 0) goto L_0x046b
            r6 = 1
            goto L_0x046c
        L_0x046b:
            r6 = 0
        L_0x046c:
            if (r6 != 0) goto L_0x053e
            java.util.Iterator r10 = r22.iterator()
            r11 = 0
            r13 = 0
        L_0x0474:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x04fa
            java.lang.Object r0 = r10.next()
            r15 = r0
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r15 = (com.fasterxml.jackson.databind.introspect.AnnotatedWithParams) r15
            r0 = r32
            com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std r0 = (com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std) r0
            boolean r0 = r0.c(r15)
            if (r0 != 0) goto L_0x048c
            goto L_0x0474
        L_0x048c:
            int r6 = r15.x()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r5 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[r6]
            r4 = 0
        L_0x0493:
            if (r4 >= r6) goto L_0x04ef
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r3 = r15.w(r4)
            if (r14 == 0) goto L_0x04bb
            com.fasterxml.jackson.databind.PropertyName r0 = r14.A(r3)
            if (r0 == 0) goto L_0x04a8
            boolean r1 = r0.e()
            if (r1 != 0) goto L_0x04a8
            goto L_0x04b8
        L_0x04a8:
            java.lang.String r0 = r14.q(r3)
            if (r0 == 0) goto L_0x04bb
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x04bb
            com.fasterxml.jackson.databind.PropertyName r0 = com.fasterxml.jackson.databind.PropertyName.a(r0)
        L_0x04b8:
            r20 = r0
            goto L_0x04bd
        L_0x04bb:
            r20 = 0
        L_0x04bd:
            if (r20 == 0) goto L_0x0474
            boolean r0 = r20.e()
            if (r0 == 0) goto L_0x04c6
            goto L_0x0474
        L_0x04c6:
            int r2 = r3.y
            r22 = 0
            r0 = r34
            r1 = r35
            r25 = r2
            r2 = r36
            r26 = r3
            r3 = r20
            r20 = r4
            r4 = r25
            r25 = r5
            r5 = r26
            r26 = r6
            r6 = r22
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.q(r1, r2, r3, r4, r5, r6)
            r25[r20] = r0
            int r4 = r20 + 1
            r5 = r25
            r6 = r26
            goto L_0x0493
        L_0x04ef:
            r25 = r5
            if (r13 == 0) goto L_0x04f5
            r13 = 0
            goto L_0x04fa
        L_0x04f5:
            r13 = r15
            r11 = r25
            goto L_0x0474
        L_0x04fa:
            if (r13 == 0) goto L_0x053e
            r0 = 0
            r12.e(r13, r0, r11)
            int r0 = r11.length
            r5 = 0
        L_0x0502:
            if (r5 >= r0) goto L_0x053e
            r1 = r11[r5]
            com.fasterxml.jackson.databind.PropertyName r2 = r1.x
            r3 = r24
            boolean r4 = r3.j(r2)
            if (r4 != 0) goto L_0x0535
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r8.q
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r27 = r1.a()
            com.fasterxml.jackson.annotation.JsonInclude$Value r30 = i0.f.a.c.n.j.c
            i0.f.a.c.t.q r1 = new i0.f.a.c.t.q
            com.fasterxml.jackson.databind.AnnotationIntrospector r26 = r4.e()
            r29 = 0
            r25 = r1
            r28 = r2
            r25.<init>(r26, r27, r28, r29, r30)
            boolean r2 = r3.j(r2)
            if (r2 == 0) goto L_0x052e
            goto L_0x0535
        L_0x052e:
            java.util.List r2 = r3.h()
            r2.add(r1)
        L_0x0535:
            int r5 = r5 + 1
            r24 = r3
            goto L_0x0502
        L_0x053a:
            r32 = r11
            r23 = r13
        L_0x053e:
            r5 = r21
            goto L_0x0546
        L_0x0541:
            r32 = r11
            r23 = r13
            r5 = 0
        L_0x0546:
            if (r17 == 0) goto L_0x054a
            r6 = 1
            goto L_0x054b
        L_0x054a:
            r6 = 0
        L_0x054b:
            if (r6 == 0) goto L_0x0665
            if (r18 <= 0) goto L_0x0551
            r6 = 1
            goto L_0x0552
        L_0x0551:
            r6 = 0
        L_0x0552:
            if (r6 != 0) goto L_0x0665
            if (r5 <= 0) goto L_0x0558
            r6 = 1
            goto L_0x0559
        L_0x0558:
            r6 = 0
        L_0x0559:
            if (r6 != 0) goto L_0x0665
            com.fasterxml.jackson.databind.AnnotationIntrospector r10 = r35.G()
            java.util.Iterator r11 = r17.iterator()
        L_0x0563:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0665
            java.lang.Object r0 = r11.next()
            i0.f.a.c.l.m.a r0 = (i0.f.a.c.l.m.a) r0
            int r13 = r0.c
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r14 = r0.b
            r15 = r23
            java.lang.Object r1 = r15.get(r14)
            r17 = r1
            i0.f.a.c.n.j[] r17 = (i0.f.a.c.n.j[]) r17
            r1 = 1
            if (r13 == r1) goto L_0x0581
            goto L_0x059e
        L_0x0581:
            r1 = 0
            i0.f.a.c.n.j r0 = r0.f(r1)
            boolean r2 = r7.g(r10, r14, r0)
            if (r2 != 0) goto L_0x05a1
            r2 = r32
            com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std r2 = (com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std) r2
            boolean r2 = r2.c(r14)
            r7.l(r12, r14, r1, r2)
            if (r0 == 0) goto L_0x059e
            i0.f.a.c.n.p r0 = (i0.f.a.c.n.p) r0
            r1 = 0
            r0.b2 = r1
        L_0x059e:
            r23 = r15
            goto L_0x0563
        L_0x05a1:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r6 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[r13]
            r4 = 0
            r5 = 0
            r18 = 0
            r20 = 0
        L_0x05a9:
            if (r4 >= r13) goto L_0x0628
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r3 = r14.w(r4)
            if (r17 != 0) goto L_0x05b3
            r0 = 0
            goto L_0x05b5
        L_0x05b3:
            r0 = r17[r4]
        L_0x05b5:
            com.fasterxml.jackson.annotation.JacksonInject$Value r21 = r10.v(r3)
            if (r0 != 0) goto L_0x05be
            r22 = 0
            goto L_0x05c4
        L_0x05be:
            com.fasterxml.jackson.databind.PropertyName r1 = r0.b()
            r22 = r1
        L_0x05c4:
            if (r0 == 0) goto L_0x05eb
            boolean r0 = r0.I()
            if (r0 == 0) goto L_0x05eb
            int r18 = r18 + 1
            r0 = r34
            r1 = r35
            r2 = r36
            r23 = r3
            r3 = r22
            r24 = r4
            r25 = r11
            r11 = r5
            r5 = r23
            r26 = r15
            r15 = r6
            r6 = r21
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.q(r1, r2, r3, r4, r5, r6)
            r15[r24] = r0
            goto L_0x061a
        L_0x05eb:
            r23 = r3
            r24 = r4
            r25 = r11
            r26 = r15
            r11 = r5
            r15 = r6
            if (r21 == 0) goto L_0x060e
            int r20 = r20 + 1
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r22
            r4 = r24
            r5 = r23
            r6 = r21
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.q(r1, r2, r3, r4, r5, r6)
            r15[r24] = r0
            goto L_0x061a
        L_0x060e:
            r0 = r23
            com.fasterxml.jackson.databind.util.NameTransformer r1 = r10.m0(r0)
            if (r1 != 0) goto L_0x0623
            if (r11 != 0) goto L_0x061a
            r5 = r0
            goto L_0x061b
        L_0x061a:
            r5 = r11
        L_0x061b:
            int r4 = r24 + 1
            r6 = r15
            r11 = r25
            r15 = r26
            goto L_0x05a9
        L_0x0623:
            r7.n(r8, r9, r0)
            r0 = 0
            throw r0
        L_0x0628:
            r25 = r11
            r26 = r15
            r11 = r5
            r15 = r6
            int r0 = r18 + 0
            if (r18 > 0) goto L_0x0637
            if (r20 <= 0) goto L_0x0635
            goto L_0x0637
        L_0x0635:
            r0 = 0
            goto L_0x064a
        L_0x0637:
            int r0 = r0 + r20
            if (r0 != r13) goto L_0x0640
            r0 = 0
            r12.e(r14, r0, r15)
            goto L_0x064a
        L_0x0640:
            r0 = 0
            if (r18 != 0) goto L_0x0650
            int r1 = r20 + 1
            if (r1 != r13) goto L_0x0650
            r12.d(r14, r0, r15, r0)
        L_0x064a:
            r11 = r25
            r23 = r26
            goto L_0x0563
        L_0x0650:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r11.y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r0] = r2
            r0 = 1
            r1[r0] = r14
            java.lang.String r0 = "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator"
            r8.j0(r9, r0, r1)
            r0 = 0
            throw r0
        L_0x0665:
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r12.f(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.h(com.fasterxml.jackson.databind.DeserializationContext, i0.f.a.c.b):com.fasterxml.jackson.databind.deser.ValueInstantiator");
    }

    public i0.f.a.c.d<?> i(Class<?> cls, DeserializationConfig deserializationConfig, i0.f.a.c.b bVar) throws JsonMappingException {
        c cVar = (c) this.y.b();
        while (cVar.hasNext()) {
            i0.f.a.c.d<?> e = ((g) cVar.next()).e(cls, deserializationConfig, bVar);
            if (e != null) {
                return e;
            }
        }
        return null;
    }

    public JavaType k(DeserializationConfig deserializationConfig, Class<?> cls) throws JsonMappingException {
        JavaType b = deserializationConfig.d.d.b((i0.f.a.c.s.a) null, cls, TypeFactory.q);
        c(deserializationConfig, b);
        if (b.c == cls) {
            return null;
        }
        return b;
    }

    public boolean l(i0.f.a.c.l.m.b bVar, AnnotatedWithParams annotatedWithParams, boolean z, boolean z2) {
        Class<?> z3 = annotatedWithParams.z(0);
        if (z3 == String.class || z3 == c) {
            if (z || z2) {
                bVar.h(annotatedWithParams, 1, z);
            }
            return true;
        } else if (z3 == Integer.TYPE || z3 == Integer.class) {
            if (z || z2) {
                bVar.h(annotatedWithParams, 2, z);
            }
            return true;
        } else if (z3 == Long.TYPE || z3 == Long.class) {
            if (z || z2) {
                bVar.h(annotatedWithParams, 3, z);
            }
            return true;
        } else if (z3 == Double.TYPE || z3 == Double.class) {
            if (z || z2) {
                bVar.h(annotatedWithParams, 5, z);
            }
            return true;
        } else if (z3 == Boolean.TYPE || z3 == Boolean.class) {
            if (z || z2) {
                bVar.h(annotatedWithParams, 7, z);
            }
            return true;
        } else {
            if (z3 == BigInteger.class && (z || z2)) {
                bVar.h(annotatedWithParams, 4, z);
            }
            if (z3 == BigDecimal.class && (z || z2)) {
                bVar.h(annotatedWithParams, 6, z);
            }
            if (!z) {
                return false;
            }
            bVar.d(annotatedWithParams, z, (SettableBeanProperty[]) null, 0);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r0.e(r2.q, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m(com.fasterxml.jackson.databind.DeserializationContext r2, i0.f.a.c.n.a r3) {
        /*
            r1 = this;
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r2.G()
            if (r0 == 0) goto L_0x0014
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r2.q
            com.fasterxml.jackson.annotation.JsonCreator$Mode r2 = r0.e(r2, r3)
            if (r2 == 0) goto L_0x0014
            com.fasterxml.jackson.annotation.JsonCreator$Mode r3 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DISABLED
            if (r2 == r3) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.m(com.fasterxml.jackson.databind.DeserializationContext, i0.f.a.c.n.a):boolean");
    }

    public void n(DeserializationContext deserializationContext, i0.f.a.c.b bVar, AnnotatedParameter annotatedParameter) throws JsonMappingException {
        deserializationContext.j0(bVar, "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", Integer.valueOf(annotatedParameter.y));
        throw null;
    }

    public void p(DeserializationContext deserializationContext, i0.f.a.c.b bVar, i0.f.a.c.l.m.a aVar, int i, PropertyName propertyName, JacksonInject.Value value) throws JsonMappingException {
        if (propertyName == null && value == null) {
            deserializationContext.j0(bVar, "Argument #%d of constructor %s has no property name (and is not Injectable): can not use as property-based Creator", Integer.valueOf(i), aVar);
            throw null;
        }
    }

    public SettableBeanProperty q(DeserializationContext deserializationContext, i0.f.a.c.b bVar, PropertyName propertyName, int i, AnnotatedParameter annotatedParameter, JacksonInject.Value value) throws JsonMappingException {
        PropertyMetadata propertyMetadata;
        Nulls nulls;
        PropertyMetadata propertyMetadata2;
        JsonSetter.Value i02;
        DeserializationContext deserializationContext2 = deserializationContext;
        AnnotatedParameter annotatedParameter2 = annotatedParameter;
        DeserializationConfig deserializationConfig = deserializationContext2.q;
        AnnotationIntrospector G = deserializationContext.G();
        if (G == null) {
            propertyMetadata = PropertyMetadata.q;
        } else {
            propertyMetadata = PropertyMetadata.a(G.x0(annotatedParameter2), G.R(annotatedParameter2), G.X(annotatedParameter2), G.Q(annotatedParameter2));
        }
        PropertyMetadata propertyMetadata3 = propertyMetadata;
        JavaType z = z(deserializationContext, annotatedParameter2, annotatedParameter2.x);
        Objects.requireNonNull(G);
        BeanProperty.Std std = new BeanProperty.Std(propertyName, z, (PropertyName) null, annotatedParameter, propertyMetadata3);
        b bVar2 = (b) z.x;
        if (bVar2 == null) {
            bVar2 = b(deserializationConfig, z);
        }
        b bVar3 = bVar2;
        AnnotationIntrospector G2 = deserializationContext.G();
        DeserializationConfig deserializationConfig2 = deserializationContext2.q;
        AnnotatedMember a2 = std.a();
        Nulls nulls2 = null;
        if (a2 != null) {
            if (G2 == null || (i02 = G2.i0(a2)) == null) {
                nulls = null;
            } else {
                nulls2 = i02.c();
                nulls = i02.b();
            }
            JsonSetter.Value value2 = deserializationConfig2.f(std.getType().c).c;
            if (value2 != null) {
                if (nulls2 == null) {
                    nulls2 = value2.c();
                }
                if (nulls == null) {
                    nulls = value2.b();
                }
            }
        } else {
            nulls = null;
        }
        JsonSetter.Value value3 = deserializationConfig2.e2.q;
        if (nulls2 == null) {
            nulls2 = value3.c();
        }
        if (nulls == null) {
            nulls = value3.b();
        }
        if (nulls2 == null && nulls == null) {
            propertyMetadata2 = propertyMetadata3;
        } else {
            propertyMetadata2 = propertyMetadata3.c(nulls2, nulls);
        }
        CreatorProperty V = CreatorProperty.V(propertyName, z, (PropertyName) null, bVar3, ((i) bVar).f.d2, annotatedParameter, i, value, propertyMetadata2);
        i0.f.a.c.d<Object> w = w(deserializationContext, annotatedParameter2);
        if (w == null) {
            w = (i0.f.a.c.d) z.q;
        }
        return w != null ? V.T(deserializationContext.Q(w, V, z)) : V;
    }

    public EnumResolver v(Class<?> cls, DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        Class<?> cls2 = cls;
        DeserializationConfig deserializationConfig2 = deserializationConfig;
        AnnotatedMember annotatedMember2 = annotatedMember;
        if (annotatedMember2 != null) {
            if (deserializationConfig.b()) {
                i0.f.a.c.t.f.e(annotatedMember.k(), deserializationConfig2.q(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            AnnotationIntrospector e = deserializationConfig.e();
            boolean q2 = deserializationConfig2.q(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
            Enum[] a2 = EnumResolver.a(cls);
            HashMap hashMap = new HashMap();
            int length = a2.length;
            while (true) {
                length--;
                if (length >= 0) {
                    Enum enumR = a2[length];
                    try {
                        Object l = annotatedMember2.l(enumR);
                        if (l != null) {
                            hashMap.put(l.toString(), enumR);
                        }
                    } catch (Exception e2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to access @JsonValue of Enum value ");
                        sb.append(enumR);
                        sb.append(": ");
                        throw new IllegalArgumentException(i0.d.a.a.a.a0(e2, sb));
                    }
                } else {
                    return new EnumResolver(cls, a2, hashMap, EnumResolver.b(e, cls2), q2);
                }
            }
        } else {
            AnnotationIntrospector e3 = deserializationConfig.e();
            boolean q3 = deserializationConfig2.q(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
            Enum[] a3 = EnumResolver.a(cls);
            String[] m = e3.m(cls2, a3, new String[a3.length]);
            String[][] strArr = new String[m.length][];
            e3.l(cls2, a3, strArr);
            HashMap hashMap2 = new HashMap();
            int length2 = a3.length;
            for (int i = 0; i < length2; i++) {
                Enum enumR2 = a3[i];
                String str = m[i];
                if (str == null) {
                    str = enumR2.name();
                }
                hashMap2.put(str, enumR2);
                String[] strArr2 = strArr[i];
                if (strArr2 != null) {
                    for (String str2 : strArr2) {
                        if (!hashMap2.containsKey(str2)) {
                            hashMap2.put(str2, enumR2);
                        }
                    }
                }
            }
            return new EnumResolver(cls, a3, hashMap2, EnumResolver.b(e3, cls2), q3);
        }
    }

    public i0.f.a.c.d<Object> w(DeserializationContext deserializationContext, i0.f.a.c.n.a aVar) throws JsonMappingException {
        Object k;
        AnnotationIntrospector G = deserializationContext.G();
        if (G == null || (k = G.k(aVar)) == null) {
            return null;
        }
        return deserializationContext.v(aVar, k);
    }

    public h x(DeserializationContext deserializationContext, i0.f.a.c.n.a aVar) throws JsonMappingException {
        Object x2;
        AnnotationIntrospector G = deserializationContext.G();
        if (G == null || (x2 = G.x(aVar)) == null) {
            return null;
        }
        return deserializationContext.f0(aVar, x2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.deser.ValueInstantiator y(com.fasterxml.jackson.databind.DeserializationContext r8, i0.f.a.c.b r9) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r8.q
            r1 = r9
            i0.f.a.c.n.i r1 = (i0.f.a.c.n.i) r1
            i0.f.a.c.n.b r1 = r1.f
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r8.G()
            java.lang.Object r1 = r2.n0(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0062
            boolean r3 = r1 instanceof com.fasterxml.jackson.databind.deser.ValueInstantiator
            if (r3 == 0) goto L_0x0019
            com.fasterxml.jackson.databind.deser.ValueInstantiator r1 = (com.fasterxml.jackson.databind.deser.ValueInstantiator) r1
            goto L_0x0063
        L_0x0019:
            boolean r3 = r1 instanceof java.lang.Class
            if (r3 == 0) goto L_0x0050
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r3 = i0.f.a.c.t.f.v(r1)
            if (r3 == 0) goto L_0x0026
            goto L_0x0062
        L_0x0026:
            java.lang.Class<com.fasterxml.jackson.databind.deser.ValueInstantiator> r3 = com.fasterxml.jackson.databind.deser.ValueInstantiator.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x003e
            com.fasterxml.jackson.databind.cfg.BaseSettings r3 = r0.d
            java.util.Objects.requireNonNull(r3)
            boolean r3 = r0.b()
            java.lang.Object r1 = i0.f.a.c.t.f.i(r1, r3)
            com.fasterxml.jackson.databind.deser.ValueInstantiator r1 = (com.fasterxml.jackson.databind.deser.ValueInstantiator) r1
            goto L_0x0063
        L_0x003e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "AnnotationIntrospector returned Class "
            java.lang.StringBuilder r9 = i0.d.a.a.a.P0(r9)
            java.lang.String r0 = "; expected Class<ValueInstantiator>"
            java.lang.String r9 = i0.d.a.a.a.Y(r1, r9, r0)
            r8.<init>(r9)
            throw r8
        L_0x0050:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "AnnotationIntrospector returned key deserializer definition of type "
            java.lang.StringBuilder r9 = i0.d.a.a.a.P0(r9)
            java.lang.String r0 = "; expected type KeyDeserializer or Class<KeyDeserializer> instead"
            java.lang.String r9 = i0.d.a.a.a.d0(r1, r9, r0)
            r8.<init>(r9)
            throw r8
        L_0x0062:
            r1 = r2
        L_0x0063:
            if (r1 != 0) goto L_0x00cb
            com.fasterxml.jackson.databind.JavaType r1 = r9.a
            java.lang.Class<?> r1 = r1.c
            java.lang.Class<com.fasterxml.jackson.core.JsonLocation> r3 = com.fasterxml.jackson.core.JsonLocation.class
            if (r1 != r3) goto L_0x0073
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator r1 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator
            r1.<init>()
            goto L_0x00c5
        L_0x0073:
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x009e
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            if (r1 != r3) goto L_0x0082
            com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators$ArrayListInstantiator r1 = com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators$ArrayListInstantiator.d
            goto L_0x00c5
        L_0x0082:
            java.util.Set r3 = java.util.Collections.EMPTY_SET
            java.lang.Class r4 = r3.getClass()
            if (r4 != r1) goto L_0x0090
            com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators$ConstantValueInstantiator r1 = new com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators$ConstantValueInstantiator
            r1.<init>(r3)
            goto L_0x00c5
        L_0x0090:
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            java.lang.Class r4 = r3.getClass()
            if (r4 != r1) goto L_0x00c4
            com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators$ConstantValueInstantiator r1 = new com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators$ConstantValueInstantiator
            r1.<init>(r3)
            goto L_0x00c5
        L_0x009e:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x00c4
            java.lang.Class<java.util.LinkedHashMap> r3 = java.util.LinkedHashMap.class
            if (r1 != r3) goto L_0x00ad
            com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators$LinkedHashMapInstantiator r1 = com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators$LinkedHashMapInstantiator.d
            goto L_0x00c5
        L_0x00ad:
            java.lang.Class<java.util.HashMap> r3 = java.util.HashMap.class
            if (r1 != r3) goto L_0x00b4
            com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators$HashMapInstantiator r1 = com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators$HashMapInstantiator.d
            goto L_0x00c5
        L_0x00b4:
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
            java.lang.Class r3 = r3.getClass()
            if (r3 != r1) goto L_0x00c4
            com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators$ConstantValueInstantiator r1 = new com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators$ConstantValueInstantiator
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
            r1.<init>(r3)
            goto L_0x00c5
        L_0x00c4:
            r1 = r2
        L_0x00c5:
            if (r1 != 0) goto L_0x00cb
            com.fasterxml.jackson.databind.deser.ValueInstantiator r1 = r7.h(r8, r9)
        L_0x00cb:
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r3 = r7.y
            i0.f.a.c.l.l[] r3 = r3.c2
            int r4 = r3.length
            r5 = 1
            r6 = 0
            if (r4 <= 0) goto L_0x00d6
            r4 = r5
            goto L_0x00d7
        L_0x00d6:
            r4 = r6
        L_0x00d7:
            if (r4 == 0) goto L_0x0103
            i0.f.a.c.t.c r4 = new i0.f.a.c.t.c
            r4.<init>(r3)
        L_0x00de:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0103
            java.lang.Object r3 = r4.next()
            i0.f.a.c.l.l r3 = (i0.f.a.c.l.l) r3
            com.fasterxml.jackson.databind.deser.ValueInstantiator r1 = r3.a(r0, r9, r1)
            if (r1 == 0) goto L_0x00f1
            goto L_0x00de
        L_0x00f1:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            r0[r6] = r1
            java.lang.String r1 = "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator"
            r8.j0(r9, r1, r0)
            throw r2
        L_0x0103:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.y(com.fasterxml.jackson.databind.DeserializationContext, i0.f.a.c.b):com.fasterxml.jackson.databind.deser.ValueInstantiator");
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JavaType z(com.fasterxml.jackson.databind.DeserializationContext r6, com.fasterxml.jackson.databind.introspect.AnnotatedMember r7, com.fasterxml.jackson.databind.JavaType r8) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r6.G()
            if (r0 != 0) goto L_0x0007
            return r8
        L_0x0007:
            boolean r1 = r8.O()
            if (r1 == 0) goto L_0x0025
            com.fasterxml.jackson.databind.JavaType r1 = r8.q()
            if (r1 == 0) goto L_0x0025
            java.lang.Object r1 = r0.x(r7)
            i0.f.a.c.h r1 = r6.f0(r7, r1)
            if (r1 == 0) goto L_0x0025
            com.fasterxml.jackson.databind.type.MapLikeType r8 = (com.fasterxml.jackson.databind.type.MapLikeType) r8
            com.fasterxml.jackson.databind.type.MapLikeType r8 = r8.j0(r1)
            com.fasterxml.jackson.databind.JavaType r1 = r8.c2
        L_0x0025:
            boolean r1 = r8.x()
            if (r1 == 0) goto L_0x005e
            java.lang.Object r1 = r0.c(r7)
            i0.f.a.c.d r1 = r6.v(r7, r1)
            if (r1 == 0) goto L_0x0039
            com.fasterxml.jackson.databind.JavaType r8 = r8.Y(r1)
        L_0x0039:
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r6.q
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r1.e()
            i0.f.a.c.p.d r2 = r2.O(r1, r7, r8)
            com.fasterxml.jackson.databind.JavaType r3 = r8.l()
            if (r2 != 0) goto L_0x004e
            i0.f.a.c.p.b r1 = r5.b(r1, r3)
            goto L_0x0058
        L_0x004e:
            i0.f.a.c.p.a r4 = r1.Z1
            java.util.Collection r4 = r4.c(r1, r7, r3)
            i0.f.a.c.p.b r1 = r2.b(r1, r3, r4)
        L_0x0058:
            if (r1 == 0) goto L_0x005e
            com.fasterxml.jackson.databind.JavaType r8 = r8.X(r1)
        L_0x005e:
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r6.q
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r1.e()
            i0.f.a.c.p.d r2 = r2.Y(r1, r7, r8)
            if (r2 != 0) goto L_0x006f
            i0.f.a.c.p.b r1 = r5.b(r1, r8)
            goto L_0x0079
        L_0x006f:
            i0.f.a.c.p.a r3 = r1.Z1
            java.util.Collection r3 = r3.c(r1, r7, r8)
            i0.f.a.c.p.b r1 = r2.b(r1, r8, r3)     // Catch:{ IllegalArgumentException -> 0x0088, IllegalStateException -> 0x0086 }
        L_0x0079:
            if (r1 == 0) goto L_0x007f
            com.fasterxml.jackson.databind.JavaType r8 = r8.b0(r1)
        L_0x007f:
            com.fasterxml.jackson.databind.DeserializationConfig r6 = r6.q
            com.fasterxml.jackson.databind.JavaType r6 = r0.B0(r6, r7, r8)
            return r6
        L_0x0086:
            r6 = move-exception
            goto L_0x0089
        L_0x0088:
            r6 = move-exception
        L_0x0089:
            r7 = 0
            java.lang.String r0 = i0.f.a.c.t.f.j(r6)
            com.fasterxml.jackson.databind.exc.InvalidDefinitionException r1 = new com.fasterxml.jackson.databind.exc.InvalidDefinitionException
            r1.<init>((com.fasterxml.jackson.core.JsonParser) r7, (java.lang.String) r0, (com.fasterxml.jackson.databind.JavaType) r8)
            r1.initCause(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.z(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JavaType");
    }
}
