package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.ClassSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.FileSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicBooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicIntegerSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicLongSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;
import i0.f.a.c.f;
import i0.f.a.c.g;
import i0.f.a.c.n.a;
import i0.f.a.c.n.b;
import i0.f.a.c.p.d;
import i0.f.a.c.p.e;
import i0.f.a.c.r.i;
import i0.f.a.c.t.r;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public abstract class BasicSerializerFactory extends i implements Serializable {
    public static final HashMap<String, g<?>> c;
    public static final HashMap<String, Class<? extends g<?>>> d;
    public final SerializerFactoryConfig q;

    static {
        HashMap<String, Class<? extends g<?>>> hashMap = new HashMap<>();
        HashMap<String, g<?>> hashMap2 = new HashMap<>();
        hashMap2.put(String.class.getName(), new StringSerializer());
        ToStringSerializer toStringSerializer = ToStringSerializer.q;
        hashMap2.put(StringBuffer.class.getName(), toStringSerializer);
        hashMap2.put(StringBuilder.class.getName(), toStringSerializer);
        hashMap2.put(Character.class.getName(), toStringSerializer);
        hashMap2.put(Character.TYPE.getName(), toStringSerializer);
        Class<Double> cls = Double.class;
        Class<Long> cls2 = Long.class;
        Class<Integer> cls3 = Integer.class;
        hashMap2.put(cls3.getName(), new NumberSerializers$IntegerSerializer(cls3));
        Class cls4 = Integer.TYPE;
        hashMap2.put(cls4.getName(), new NumberSerializers$IntegerSerializer(cls4));
        hashMap2.put(cls2.getName(), new NumberSerializers$LongSerializer(cls2));
        Class cls5 = Long.TYPE;
        hashMap2.put(cls5.getName(), new NumberSerializers$LongSerializer(cls5));
        String name = Byte.class.getName();
        NumberSerializers$IntLikeSerializer numberSerializers$IntLikeSerializer = NumberSerializers$IntLikeSerializer.q;
        hashMap2.put(name, numberSerializers$IntLikeSerializer);
        hashMap2.put(Byte.TYPE.getName(), numberSerializers$IntLikeSerializer);
        String name2 = Short.class.getName();
        NumberSerializers$ShortSerializer numberSerializers$ShortSerializer = NumberSerializers$ShortSerializer.q;
        hashMap2.put(name2, numberSerializers$ShortSerializer);
        hashMap2.put(Short.TYPE.getName(), numberSerializers$ShortSerializer);
        hashMap2.put(cls.getName(), new NumberSerializers$DoubleSerializer(cls));
        hashMap2.put(Double.TYPE.getName(), new NumberSerializers$DoubleSerializer(Double.TYPE));
        String name3 = Float.class.getName();
        NumberSerializers$FloatSerializer numberSerializers$FloatSerializer = NumberSerializers$FloatSerializer.q;
        hashMap2.put(name3, numberSerializers$FloatSerializer);
        hashMap2.put(Float.TYPE.getName(), numberSerializers$FloatSerializer);
        hashMap2.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        hashMap2.put(Boolean.class.getName(), new BooleanSerializer(false));
        hashMap2.put(BigInteger.class.getName(), new NumberSerializer(BigInteger.class));
        hashMap2.put(BigDecimal.class.getName(), new NumberSerializer(BigDecimal.class));
        hashMap2.put(Calendar.class.getName(), CalendarSerializer.Y1);
        hashMap2.put(Date.class.getName(), DateSerializer.Y1);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(URL.class, new ToStringSerializer(URL.class));
        hashMap3.put(URI.class, new ToStringSerializer(URI.class));
        hashMap3.put(Currency.class, new ToStringSerializer(Currency.class));
        hashMap3.put(UUID.class, new UUIDSerializer());
        hashMap3.put(Pattern.class, new ToStringSerializer(Pattern.class));
        hashMap3.put(Locale.class, new ToStringSerializer(Locale.class));
        hashMap3.put(AtomicBoolean.class, StdJdkSerializers$AtomicBooleanSerializer.class);
        hashMap3.put(AtomicInteger.class, StdJdkSerializers$AtomicIntegerSerializer.class);
        hashMap3.put(AtomicLong.class, StdJdkSerializers$AtomicLongSerializer.class);
        hashMap3.put(File.class, FileSerializer.class);
        hashMap3.put(Class.class, ClassSerializer.class);
        NullSerializer nullSerializer = NullSerializer.q;
        hashMap3.put(Void.class, nullSerializer);
        hashMap3.put(Void.TYPE, nullSerializer);
        for (Map.Entry entry : hashMap3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof g) {
                hashMap2.put(((Class) entry.getKey()).getName(), (g) value);
            } else {
                hashMap.put(((Class) entry.getKey()).getName(), (Class) value);
            }
        }
        hashMap.put(r.class.getName(), TokenBufferSerializer.class);
        c = hashMap2;
        d = hashMap;
    }

    public BasicSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        this.q = serializerFactoryConfig == null ? new SerializerFactoryConfig() : serializerFactoryConfig;
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b A[LOOP:0: B:7:0x001b->B:10:0x002b, LOOP_START, PHI: r2 
      PHI: (r2v15 i0.f.a.c.g<?>) = (r2v14 i0.f.a.c.g<?>), (r2v18 i0.f.a.c.g<?>) binds: [B:6:0x0015, B:10:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.g<java.lang.Object> a(i0.f.a.c.i r12, com.fasterxml.jackson.databind.JavaType r13, i0.f.a.c.g<java.lang.Object> r14) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r11 = this;
            com.fasterxml.jackson.databind.SerializationConfig r0 = r12.q
            i0.f.a.c.b r1 = r0.C(r13)
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r11.q
            i0.f.a.c.r.j[] r2 = r2.x
            int r3 = r2.length
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0011
            r3 = r5
            goto L_0x0012
        L_0x0011:
            r3 = r4
        L_0x0012:
            r6 = 0
            if (r3 == 0) goto L_0x002e
            i0.f.a.c.t.c r3 = new i0.f.a.c.t.c
            r3.<init>(r2)
            r2 = r6
        L_0x001b:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x002f
            java.lang.Object r2 = r3.next()
            i0.f.a.c.r.j r2 = (i0.f.a.c.r.j) r2
            i0.f.a.c.g r2 = r2.b(r0, r13, r1)
            if (r2 == 0) goto L_0x001b
            goto L_0x002f
        L_0x002e:
            r2 = r6
        L_0x002f:
            if (r2 != 0) goto L_0x0164
            r2 = r1
            i0.f.a.c.n.i r2 = (i0.f.a.c.n.i) r2
            i0.f.a.c.n.b r3 = r2.f
            com.fasterxml.jackson.databind.AnnotationIntrospector r7 = r12.O()
            java.lang.Object r7 = r7.y(r3)
            if (r7 == 0) goto L_0x0045
            i0.f.a.c.g r3 = r12.c0(r3, r7)
            goto L_0x0046
        L_0x0045:
            r3 = r6
        L_0x0046:
            if (r3 != 0) goto L_0x0162
            if (r14 != 0) goto L_0x0165
            java.lang.Class<?> r3 = r13.c
            i0.f.a.c.g<java.lang.Object> r7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.a
            r7 = 2
            r8 = 8
            if (r3 == 0) goto L_0x00d6
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            if (r3 != r9) goto L_0x0059
            goto L_0x00d6
        L_0x0059:
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            if (r3 != r9) goto L_0x0061
            i0.f.a.c.g<java.lang.Object> r3 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.a
            goto L_0x00db
        L_0x0061:
            boolean r9 = r3.isPrimitive()
            if (r9 == 0) goto L_0x006b
            java.lang.Class r3 = i0.f.a.c.t.f.N(r3)
        L_0x006b:
            java.lang.Class<java.lang.Integer> r9 = java.lang.Integer.class
            if (r3 != r9) goto L_0x0078
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default r9 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default
            r10 = 5
            r9.<init>(r10, r3)
        L_0x0075:
            r3 = r9
            goto L_0x00db
        L_0x0078:
            java.lang.Class<java.lang.Long> r9 = java.lang.Long.class
            if (r3 != r9) goto L_0x0083
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default r9 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default
            r10 = 6
            r9.<init>(r10, r3)
            goto L_0x0075
        L_0x0083:
            boolean r9 = r3.isPrimitive()
            if (r9 != 0) goto L_0x00d0
            java.lang.Class<java.lang.Number> r9 = java.lang.Number.class
            boolean r9 = r9.isAssignableFrom(r3)
            if (r9 == 0) goto L_0x0092
            goto L_0x00d0
        L_0x0092:
            java.lang.Class<java.lang.Class> r9 = java.lang.Class.class
            if (r3 != r9) goto L_0x009d
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default r9 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default
            r10 = 3
            r9.<init>(r10, r3)
            goto L_0x0075
        L_0x009d:
            java.lang.Class<java.util.Date> r9 = java.util.Date.class
            boolean r9 = r9.isAssignableFrom(r3)
            if (r9 == 0) goto L_0x00ab
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default r9 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default
            r9.<init>(r5, r3)
            goto L_0x0075
        L_0x00ab:
            java.lang.Class<java.util.Calendar> r9 = java.util.Calendar.class
            boolean r9 = r9.isAssignableFrom(r3)
            if (r9 == 0) goto L_0x00b9
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default r9 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default
            r9.<init>(r7, r3)
            goto L_0x0075
        L_0x00b9:
            java.lang.Class<java.util.UUID> r9 = java.util.UUID.class
            if (r3 != r9) goto L_0x00c3
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default r9 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default
            r9.<init>(r8, r3)
            goto L_0x0075
        L_0x00c3:
            java.lang.Class<byte[]> r9 = byte[].class
            if (r3 != r9) goto L_0x00ce
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default r9 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default
            r10 = 7
            r9.<init>(r10, r3)
            goto L_0x0075
        L_0x00ce:
            r3 = r6
            goto L_0x00db
        L_0x00d0:
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default r9 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default
            r9.<init>(r8, r3)
            goto L_0x0075
        L_0x00d6:
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic r3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic
            r3.<init>()
        L_0x00db:
            if (r3 != 0) goto L_0x0162
            i0.f.a.c.n.o r2 = r2.c
            if (r2 != 0) goto L_0x00e2
            goto L_0x0114
        L_0x00e2:
            boolean r3 = r2.i
            if (r3 != 0) goto L_0x00e9
            r2.h()
        L_0x00e9:
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r3 = r2.q
            if (r3 == 0) goto L_0x0114
            int r3 = r3.size()
            if (r3 > r5) goto L_0x00fc
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r2 = r2.q
            java.lang.Object r2 = r2.get(r4)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r2
            goto L_0x0115
        L_0x00fc:
            java.lang.Object[] r12 = new java.lang.Object[r7]
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r13 = r2.q
            java.lang.Object r13 = r13.get(r4)
            r12[r4] = r13
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r13 = r2.q
            java.lang.Object r13 = r13.get(r5)
            r12[r5] = r13
            java.lang.String r13 = "Multiple 'as-key' properties defined (%s vs %s)"
            r2.i(r13, r12)
            throw r6
        L_0x0114:
            r2 = r6
        L_0x0115:
            if (r2 != 0) goto L_0x011b
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r1.c()
        L_0x011b:
            if (r2 == 0) goto L_0x013e
            com.fasterxml.jackson.databind.JavaType r13 = r2.f()
            i0.f.a.c.g r12 = r11.a(r12, r13, r14)
            boolean r13 = r0.b()
            if (r13 == 0) goto L_0x0138
            java.lang.reflect.Member r13 = r2.k()
            com.fasterxml.jackson.databind.MapperFeature r14 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r14 = r0.q(r14)
            i0.f.a.c.t.f.e(r13, r14)
        L_0x0138:
            com.fasterxml.jackson.databind.ser.std.JsonValueSerializer r14 = new com.fasterxml.jackson.databind.ser.std.JsonValueSerializer
            r14.<init>(r2, r6, r12)
            goto L_0x0165
        L_0x013e:
            java.lang.Class<?> r12 = r13.c
            if (r12 == 0) goto L_0x015c
            java.lang.Class<java.lang.Enum> r13 = java.lang.Enum.class
            if (r12 != r13) goto L_0x014c
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic r14 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic
            r14.<init>()
            goto L_0x0165
        L_0x014c:
            boolean r13 = i0.f.a.c.t.f.w(r12)
            if (r13 == 0) goto L_0x015c
            com.fasterxml.jackson.databind.util.EnumValues r13 = com.fasterxml.jackson.databind.util.EnumValues.a(r0, r12)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$EnumKeySerializer r14 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$EnumKeySerializer
            r14.<init>(r12, r13)
            goto L_0x0165
        L_0x015c:
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default r14 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default
            r14.<init>(r8, r12)
            goto L_0x0165
        L_0x0162:
            r14 = r3
            goto L_0x0165
        L_0x0164:
            r14 = r2
        L_0x0165:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r12 = r11.q
            boolean r12 = r12.a()
            if (r12 == 0) goto L_0x0185
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r12 = r11.q
            java.lang.Iterable r12 = r12.b()
            i0.f.a.c.t.c r12 = (i0.f.a.c.t.c) r12
        L_0x0175:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0185
            java.lang.Object r13 = r12.next()
            i0.f.a.c.r.c r13 = (i0.f.a.c.r.c) r13
            java.util.Objects.requireNonNull(r13)
            goto L_0x0175
        L_0x0185:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.a(i0.f.a.c.i, com.fasterxml.jackson.databind.JavaType, i0.f.a.c.g):i0.f.a.c.g");
    }

    public e b(SerializationConfig serializationConfig, JavaType javaType) {
        ArrayList arrayList;
        b bVar = ((i0.f.a.c.n.i) serializationConfig.n(javaType.c)).f;
        d<?> l02 = serializationConfig.e().l0(serializationConfig, bVar, javaType);
        if (l02 == null) {
            l02 = serializationConfig.d.Z1;
            arrayList = null;
        } else {
            StdSubtypeResolver stdSubtypeResolver = (StdSubtypeResolver) serializationConfig.Z1;
            Objects.requireNonNull(stdSubtypeResolver);
            AnnotationIntrospector e = serializationConfig.e();
            HashMap hashMap = new HashMap();
            stdSubtypeResolver.d(bVar, new NamedType(bVar.q, (String) null), serializationConfig, e, hashMap);
            arrayList = new ArrayList(hashMap.values());
        }
        if (l02 == null) {
            return null;
        }
        return l02.f(serializationConfig, javaType, arrayList);
    }

    public JsonInclude.Value c(i0.f.a.c.i iVar, i0.f.a.c.b bVar, JavaType javaType, Class<?> cls) throws JsonMappingException {
        SerializationConfig serializationConfig = iVar.q;
        JsonInclude.Value e = bVar.e(serializationConfig.e2.d);
        serializationConfig.k(cls, e);
        serializationConfig.k(javaType.c, (JsonInclude.Value) null);
        return e;
    }

    public final g<?> d(i0.f.a.c.i iVar, JavaType javaType, i0.f.a.c.b bVar) throws JsonMappingException {
        if (f.class.isAssignableFrom(javaType.c)) {
            return SerializableSerializer.q;
        }
        AnnotatedMember c2 = bVar.c();
        if (c2 == null) {
            return null;
        }
        if (iVar.q.b()) {
            i0.f.a.c.t.f.e(c2.k(), iVar.X(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        JavaType f = c2.f();
        g<Object> e = e(iVar, c2);
        if (e == null) {
            e = (g) f.q;
        }
        e eVar = (e) f.x;
        if (eVar == null) {
            eVar = b(iVar.q, f);
        }
        return new JsonValueSerializer(c2, eVar, e);
    }

    public g<Object> e(i0.f.a.c.i iVar, a aVar) throws JsonMappingException {
        Object h02 = iVar.O().h0(aVar);
        i0.f.a.c.t.g<Object, Object> gVar = null;
        if (h02 == null) {
            return null;
        }
        g<Object> c0 = iVar.c0(aVar, h02);
        Object d0 = iVar.O().d0(aVar);
        if (d0 != null) {
            gVar = iVar.g(aVar, d0);
        }
        return gVar == null ? c0 : new StdDelegatingSerializer(gVar, gVar.c(iVar.i()), c0);
    }

    public boolean f(SerializationConfig serializationConfig, i0.f.a.c.b bVar, e eVar) {
        JsonSerialize.Typing g02 = serializationConfig.e().g0(((i0.f.a.c.n.i) bVar).f);
        if (g02 == null || g02 == JsonSerialize.Typing.DEFAULT_TYPING) {
            return serializationConfig.q(MapperFeature.USE_STATIC_TYPING);
        }
        return g02 == JsonSerialize.Typing.STATIC;
    }
}
