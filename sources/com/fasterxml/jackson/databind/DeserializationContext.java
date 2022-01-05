package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionConfigs;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MutableCoercionConfig;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.a.z;
import i0.f.a.c.c;
import i0.f.a.c.d;
import i0.f.a.c.l.e;
import i0.f.a.c.l.f;
import i0.f.a.c.n.a;
import i0.f.a.c.n.j;
import i0.f.a.c.t.b;
import i0.f.a.c.t.h;
import i0.f.a.c.t.n;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;

public abstract class DeserializationContext extends c implements Serializable {
    public final Class<?> Y1;
    public transient JsonParser Z1;
    public transient b a2;
    public transient n b2;
    public final DeserializerCache c;
    public transient DateFormat c2;
    public final f d;
    public h<JavaType> d2;
    public final DeserializationConfig q;
    public final int x;
    public final i0.f.a.b.m.f<StreamReadCapability> y;

    public DeserializationContext(f fVar, DeserializerCache deserializerCache) {
        Objects.requireNonNull(fVar, "Cannot pass null DeserializerFactory");
        this.d = fVar;
        this.c = deserializerCache == null ? new DeserializerCache() : deserializerCache;
        this.x = 0;
        this.y = null;
        this.q = null;
        this.Y1 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d A[LOOP:0: B:7:0x002d->B:10:0x003d, LOOP_START, PHI: r7 
      PHI: (r7v20 i0.f.a.c.h) = (r7v19 i0.f.a.c.h), (r7v23 i0.f.a.c.h) binds: [B:6:0x001f, B:10:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i0.f.a.c.h A(com.fasterxml.jackson.databind.JavaType r14, com.fasterxml.jackson.databind.BeanProperty r15) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r13 = this;
            com.fasterxml.jackson.databind.deser.DeserializerCache r0 = r13.c
            i0.f.a.c.l.f r1 = r13.d
            java.util.Objects.requireNonNull(r0)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory r1 = (com.fasterxml.jackson.databind.deser.BasicDeserializerFactory) r1
            java.util.Objects.requireNonNull(r1)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r13.q
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r3 = r1.y
            i0.f.a.c.l.h[] r3 = r3.Z1
            int r3 = r3.length
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x001b
            r3 = r5
            goto L_0x001c
        L_0x001b:
            r3 = r4
        L_0x001c:
            r6 = 0
            if (r3 == 0) goto L_0x0040
            i0.f.a.c.b r3 = r2.m(r14)
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r7 = r1.y
            i0.f.a.c.t.c r8 = new i0.f.a.c.t.c
            i0.f.a.c.l.h[] r7 = r7.Z1
            r8.<init>(r7)
            r7 = r6
        L_0x002d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0042
            java.lang.Object r7 = r8.next()
            i0.f.a.c.l.h r7 = (i0.f.a.c.l.h) r7
            i0.f.a.c.h r7 = r7.a(r14, r2, r3)
            if (r7 == 0) goto L_0x002d
            goto L_0x0042
        L_0x0040:
            r3 = r6
            r7 = r3
        L_0x0042:
            if (r7 != 0) goto L_0x01a9
            if (r3 != 0) goto L_0x004c
            java.lang.Class<?> r3 = r14.c
            i0.f.a.c.b r3 = r2.n(r3)
        L_0x004c:
            i0.f.a.c.n.i r3 = (i0.f.a.c.n.i) r3
            i0.f.a.c.n.b r3 = r3.f
            i0.f.a.c.h r7 = r1.x(r13, r3)
            if (r7 != 0) goto L_0x01a9
            boolean r3 = r14.I()
            if (r3 == 0) goto L_0x0107
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r13.q
            java.lang.Class<?> r3 = r14.c
            i0.f.a.c.b r7 = r2.C(r14)
            r8 = r7
            i0.f.a.c.n.i r8 = (i0.f.a.c.n.i) r8
            i0.f.a.c.n.b r9 = r8.f
            i0.f.a.c.h r9 = r1.x(r13, r9)
            if (r9 == 0) goto L_0x0072
            r7 = r9
            goto L_0x01a9
        L_0x0072:
            i0.f.a.c.d r9 = r1.i(r3, r2, r7)
            if (r9 == 0) goto L_0x0082
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD r0 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD
            java.lang.Class<?> r2 = r14.c
            r0.<init>(r2, r9)
        L_0x007f:
            r7 = r0
            goto L_0x01a9
        L_0x0082:
            i0.f.a.c.n.b r8 = r8.f
            i0.f.a.c.d r8 = r1.w(r13, r8)
            if (r8 == 0) goto L_0x0092
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD r0 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD
            java.lang.Class<?> r2 = r14.c
            r0.<init>(r2, r8)
            goto L_0x007f
        L_0x0092:
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r8 = r7.c()
            com.fasterxml.jackson.databind.util.EnumResolver r8 = r1.v(r3, r2, r8)
            java.util.List r7 = r7.f()
            java.util.Iterator r7 = r7.iterator()
        L_0x00a2:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0100
            java.lang.Object r9 = r7.next()
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r9 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r9
            boolean r10 = r1.m(r13, r9)
            if (r10 == 0) goto L_0x00a2
            int r10 = r9.x()
            if (r10 != r5) goto L_0x00e2
            java.lang.Class r10 = r9.A()
            boolean r10 = r10.isAssignableFrom(r3)
            if (r10 == 0) goto L_0x00e2
            java.lang.Class r10 = r9.z(r4)
            if (r10 == r0) goto L_0x00cb
            goto L_0x00a2
        L_0x00cb:
            boolean r0 = r2.b()
            if (r0 == 0) goto L_0x00dc
            java.lang.reflect.Method r0 = r9.x
            com.fasterxml.jackson.databind.MapperFeature r2 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r2 = r13.e0(r2)
            i0.f.a.c.t.f.e(r0, r2)
        L_0x00dc:
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$EnumKD r0 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$EnumKD
            r0.<init>(r8, r9)
            goto L_0x007f
        L_0x00e2:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Unsuitable method ("
            r15.append(r0)
            r15.append(r9)
            java.lang.String r0 = ") decorated with @JsonCreator (for Enum type "
            r15.append(r0)
            java.lang.String r0 = ")"
            java.lang.String r15 = i0.d.a.a.a.Y(r3, r15, r0)
            r14.<init>(r15)
            throw r14
        L_0x0100:
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$EnumKD r0 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$EnumKD
            r0.<init>(r8, r6)
            goto L_0x007f
        L_0x0107:
            i0.f.a.c.b r3 = r2.C(r14)
            java.lang.Class[] r7 = new java.lang.Class[r5]
            r7[r4] = r0
            i0.f.a.c.n.i r3 = (i0.f.a.c.n.i) r3
            i0.f.a.c.n.b r8 = r3.f
            java.util.List r8 = r8.k()
            java.util.Iterator r8 = r8.iterator()
        L_0x011b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x013e
            java.lang.Object r9 = r8.next()
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r9 = (com.fasterxml.jackson.databind.introspect.AnnotatedConstructor) r9
            int r10 = r9.x()
            if (r10 != r5) goto L_0x011b
            java.lang.Class r10 = r9.z(r4)
            r11 = r4
        L_0x0132:
            if (r11 >= r5) goto L_0x011b
            r12 = r7[r11]
            if (r12 != r10) goto L_0x013b
            java.lang.reflect.Constructor<?> r7 = r9.x
            goto L_0x013f
        L_0x013b:
            int r11 = r11 + 1
            goto L_0x0132
        L_0x013e:
            r7 = r6
        L_0x013f:
            if (r7 == 0) goto L_0x0156
            boolean r0 = r2.b()
            if (r0 == 0) goto L_0x0150
            com.fasterxml.jackson.databind.MapperFeature r0 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r0 = r2.q(r0)
            i0.f.a.c.t.f.e(r7, r0)
        L_0x0150:
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringCtorKeyDeserializer r6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringCtorKeyDeserializer
            r6.<init>(r7)
            goto L_0x01a8
        L_0x0156:
            java.lang.Class[] r7 = new java.lang.Class[r5]
            r7[r4] = r0
            i0.f.a.c.n.b r0 = r3.f
            java.util.List r0 = r0.l()
            java.util.Iterator r0 = r0.iterator()
        L_0x0164:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0191
            java.lang.Object r8 = r0.next()
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r8 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r8
            boolean r9 = r3.k(r8)
            if (r9 == 0) goto L_0x0164
            int r9 = r8.x()
            if (r9 != r5) goto L_0x0164
            java.lang.Class r9 = r8.z(r4)
            r10 = r4
        L_0x0181:
            if (r10 >= r5) goto L_0x0164
            r11 = r7[r10]
            boolean r11 = r9.isAssignableFrom(r11)
            if (r11 == 0) goto L_0x018e
            java.lang.reflect.Method r0 = r8.x
            goto L_0x0192
        L_0x018e:
            int r10 = r10 + 1
            goto L_0x0181
        L_0x0191:
            r0 = r6
        L_0x0192:
            if (r0 == 0) goto L_0x01a8
            boolean r3 = r2.b()
            if (r3 == 0) goto L_0x01a3
            com.fasterxml.jackson.databind.MapperFeature r3 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r2 = r2.q(r3)
            i0.f.a.c.t.f.e(r0, r2)
        L_0x01a3:
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringFactoryKeyDeserializer r6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringFactoryKeyDeserializer
            r6.<init>(r0)
        L_0x01a8:
            r7 = r6
        L_0x01a9:
            if (r7 == 0) goto L_0x01cb
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r1.y
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x01cb
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r1.y
            java.lang.Iterable r0 = r0.a()
            i0.f.a.c.t.c r0 = (i0.f.a.c.t.c) r0
        L_0x01bb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01cb
            java.lang.Object r1 = r0.next()
            i0.f.a.c.l.b r1 = (i0.f.a.c.l.b) r1
            java.util.Objects.requireNonNull(r1)
            goto L_0x01bb
        L_0x01cb:
            if (r7 == 0) goto L_0x01e2
            boolean r14 = r7 instanceof i0.f.a.c.l.j
            if (r14 == 0) goto L_0x01d7
            r14 = r7
            i0.f.a.c.l.j r14 = (i0.f.a.c.l.j) r14
            r14.c(r13)
        L_0x01d7:
            boolean r14 = r7 instanceof i0.f.a.c.l.d
            if (r14 == 0) goto L_0x01e1
            i0.f.a.c.l.d r7 = (i0.f.a.c.l.d) r7
            i0.f.a.c.h r7 = r7.a(r13, r15)
        L_0x01e1:
            return r7
        L_0x01e2:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Cannot find a (Map) Key deserializer for type "
            r15.append(r0)
            r15.append(r14)
            java.lang.String r15 = r15.toString()
            com.fasterxml.jackson.core.JsonParser r0 = r13.Z1
            com.fasterxml.jackson.databind.exc.InvalidDefinitionException r1 = new com.fasterxml.jackson.databind.exc.InvalidDefinitionException
            r1.<init>((com.fasterxml.jackson.core.JsonParser) r0, (java.lang.String) r15, (com.fasterxml.jackson.databind.JavaType) r14)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.DeserializationContext.A(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanProperty):i0.f.a.c.h");
    }

    public final d<Object> C(JavaType javaType) throws JsonMappingException {
        return this.c.f(this, this.d, javaType);
    }

    public abstract i0.f.a.c.l.m.h E(Object obj, ObjectIdGenerator<?> objectIdGenerator, z zVar);

    public final d<Object> F(JavaType javaType) throws JsonMappingException {
        d<?> R = R(this.c.f(this, this.d, javaType), (BeanProperty) null, javaType);
        i0.f.a.c.p.b b = this.d.b(this.q, javaType);
        return b != null ? new TypeWrappedDeserializer(b.f((BeanProperty) null), R) : R;
    }

    public final AnnotationIntrospector G() {
        return this.q.e();
    }

    public final b H() {
        if (this.a2 == null) {
            this.a2 = new b();
        }
        return this.a2;
    }

    public final Base64Variant I() {
        return this.q.d.e2;
    }

    public TimeZone J() {
        TimeZone timeZone = this.q.d.d2;
        return timeZone == null ? BaseSettings.c : timeZone;
    }

    public void M(d<?> dVar) throws JsonMappingException {
        if (!e0(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            JavaType q2 = q(dVar.n());
            throw new InvalidDefinitionException(this.Z1, String.format("Invalid configuration: values of type %s cannot be merged", new Object[]{i0.f.a.c.t.f.t(q2)}), q2);
        }
    }

    public Object N(Class<?> cls, Object obj, Throwable th) throws IOException {
        for (h hVar = this.q.g2; hVar != null; hVar = hVar.b) {
            Objects.requireNonNull((e) hVar.a);
            Object obj2 = e.a;
        }
        i0.f.a.c.t.f.J(th);
        if (!d0(DeserializationFeature.WRAP_EXCEPTIONS)) {
            i0.f.a.c.t.f.K(th);
        }
        throw b0(cls, th);
    }

    public Object O(Class<?> cls, ValueInstantiator valueInstantiator, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        String b = b(str, objArr);
        for (h hVar = this.q.g2; hVar != null; hVar = hVar.b) {
            Objects.requireNonNull((e) hVar.a);
            Object obj = e.a;
        }
        if (valueInstantiator == null) {
            n(f(cls), String.format("Cannot construct instance of %s: %s", new Object[]{i0.f.a.c.t.f.E(cls), b}));
            throw null;
        } else if (!valueInstantiator.m()) {
            n(f(cls), String.format("Cannot construct instance of %s (no Creators, like default constructor, exist): %s", new Object[]{i0.f.a.c.t.f.E(cls), b}));
            throw null;
        } else {
            throw new MismatchedInputException(this.Z1, b(String.format("Cannot construct instance of %s (although at least one Creator exists): %s", new Object[]{i0.f.a.c.t.f.E(cls), b}), new Object[0]), cls);
        }
    }

    public d<?> Q(d<?> dVar, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        if (dVar instanceof i0.f.a.c.l.c) {
            this.d2 = new h<>(javaType, this.d2);
            try {
                dVar = ((i0.f.a.c.l.c) dVar).a(this, beanProperty);
            } finally {
                this.d2 = this.d2.b;
            }
        }
        return dVar;
    }

    public d<?> R(d<?> dVar, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        if (dVar instanceof i0.f.a.c.l.c) {
            this.d2 = new h<>(javaType, this.d2);
            try {
                dVar = ((i0.f.a.c.l.c) dVar).a(this, beanProperty);
            } finally {
                this.d2 = this.d2.b;
            }
        }
        return dVar;
    }

    public Object T(JavaType javaType, JsonParser jsonParser) throws IOException {
        U(javaType, jsonParser.i(), jsonParser, (String) null, new Object[0]);
        throw null;
    }

    public Object U(JavaType javaType, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        String str2;
        String b = b(str, objArr);
        for (h hVar = this.q.g2; hVar != null; hVar = hVar.b) {
            Objects.requireNonNull((e) hVar.a);
            Class<?> cls = javaType.c;
            Object obj = e.a;
        }
        if (b == null) {
            String t = i0.f.a.c.t.f.t(javaType);
            if (jsonToken == null) {
                b = String.format("Unexpected end-of-input when trying read value of type %s", new Object[]{t});
            } else {
                Object[] objArr2 = new Object[3];
                objArr2[0] = t;
                switch (jsonToken.ordinal()) {
                    case 1:
                    case 2:
                    case 5:
                        str2 = "Object value";
                        break;
                    case 3:
                    case 4:
                        str2 = "Array value";
                        break;
                    case 6:
                        str2 = "Embedded Object";
                        break;
                    case 7:
                        str2 = "String value";
                        break;
                    case 8:
                        str2 = "Integer value";
                        break;
                    case 9:
                        str2 = "Floating-point value";
                        break;
                    case 10:
                    case 11:
                        str2 = "Boolean value";
                        break;
                    case 12:
                        str2 = "Null value";
                        break;
                    default:
                        str2 = "[Unavailable value]";
                        break;
                }
                objArr2[1] = str2;
                objArr2[2] = jsonToken;
                b = String.format("Cannot deserialize value of type %s from %s (token `JsonToken.%s`)", objArr2);
            }
        }
        if (jsonToken != null && jsonToken.isScalarValue()) {
            jsonParser.Z();
        }
        throw new MismatchedInputException(this.Z1, b(b, new Object[0]), javaType);
    }

    public Object V(Class<?> cls, JsonParser jsonParser) throws IOException {
        U(q(cls), jsonParser.i(), jsonParser, (String) null, new Object[0]);
        throw null;
    }

    public JavaType W(JavaType javaType, String str, i0.f.a.c.p.c cVar, String str2) throws IOException {
        for (h hVar = this.q.g2; hVar != null; hVar = hVar.b) {
            Objects.requireNonNull((e) hVar.a);
        }
        if (!d0(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
            return null;
        }
        throw k(javaType, str, str2);
    }

    public Object X(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String b = b(str2, objArr);
        for (h hVar = this.q.g2; hVar != null; hVar = hVar.b) {
            Objects.requireNonNull((e) hVar.a);
            Object obj = e.a;
        }
        throw new InvalidFormatException(this.Z1, String.format("Cannot deserialize Map key of type %s from String %s: %s", new Object[]{i0.f.a.c.t.f.E(cls), c(str), b}), str, cls);
    }

    public Object Y(Class<?> cls, Number number, String str, Object... objArr) throws IOException {
        String b = b(str, objArr);
        for (h hVar = this.q.g2; hVar != null; hVar = hVar.b) {
            Objects.requireNonNull((e) hVar.a);
            Object obj = e.a;
        }
        throw s0(number, cls, b);
    }

    public Object Z(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String b = b(str2, objArr);
        for (h hVar = this.q.g2; hVar != null; hVar = hVar.b) {
            Objects.requireNonNull((e) hVar.a);
            Object obj = e.a;
        }
        throw t0(str, cls, b);
    }

    public final boolean a0(int i) {
        return (i & this.x) != 0;
    }

    public JsonMappingException b0(Class<?> cls, Throwable th) {
        String str;
        if (th == null) {
            str = "N/A";
        } else {
            str = i0.f.a.c.t.f.j(th);
            if (str == null) {
                str = i0.f.a.c.t.f.E(th.getClass());
            }
        }
        return new ValueInstantiationException(this.Z1, String.format("Cannot construct instance of %s, problem: %s", new Object[]{i0.f.a.c.t.f.E(cls), str}), q(cls), th);
    }

    public final boolean c0(StreamReadCapability streamReadCapability) {
        i0.f.a.b.m.f<StreamReadCapability> fVar = this.y;
        Objects.requireNonNull(fVar);
        return (streamReadCapability.getMask() & fVar.a) != 0;
    }

    public final boolean d0(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this.x) != 0;
    }

    public final boolean e0(MapperFeature mapperFeature) {
        return mapperFeature.enabledIn(this.q.c);
    }

    public abstract i0.f.a.c.h f0(a aVar, Object obj) throws JsonMappingException;

    public final n g0() {
        n nVar = this.b2;
        if (nVar == null) {
            return new n();
        }
        this.b2 = null;
        return nVar;
    }

    public MapperConfig h() {
        return this.q;
    }

    public Date h0(String str) throws IllegalArgumentException {
        try {
            DateFormat dateFormat = this.c2;
            if (dateFormat == null) {
                dateFormat = (DateFormat) this.q.d.b2.clone();
                this.c2 = dateFormat;
            }
            return dateFormat.parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", new Object[]{str, i0.f.a.c.t.f.j(e)}));
        }
    }

    public final TypeFactory i() {
        return this.q.d.d;
    }

    public <T> T i0(i0.f.a.c.b bVar, j jVar, String str, Object... objArr) throws JsonMappingException {
        String b = b(str, objArr);
        Annotation[] annotationArr = i0.f.a.c.t.f.a;
        throw new InvalidDefinitionException(this.Z1, String.format("Invalid definition for property %s (of type %s): %s", new Object[]{i0.f.a.c.t.f.c(jVar.getName()), i0.f.a.c.t.f.E(bVar.a.c), b}), bVar, jVar);
    }

    public <T> T j0(i0.f.a.c.b bVar, String str, Object... objArr) throws JsonMappingException {
        throw new InvalidDefinitionException(this.Z1, String.format("Invalid type definition for type %s: %s", new Object[]{i0.f.a.c.t.f.E(bVar.a.c), b(str, objArr)}), bVar, (j) null);
    }

    public JsonMappingException k(JavaType javaType, String str, String str2) {
        return new InvalidTypeIdException(this.Z1, a(String.format("Could not resolve type id '%s' as a subtype of %s", new Object[]{str, i0.f.a.c.t.f.t(javaType)}), str2), javaType, str);
    }

    public <T> T k0(BeanProperty beanProperty, String str, Object... objArr) throws JsonMappingException {
        JavaType javaType;
        AnnotatedMember a;
        String b = b(str, objArr);
        if (beanProperty == null) {
            javaType = null;
        } else {
            javaType = ((SettableBeanProperty) beanProperty).y;
        }
        MismatchedInputException mismatchedInputException = new MismatchedInputException(this.Z1, b, javaType);
        if (!(beanProperty == null || (a = beanProperty.a()) == null)) {
            mismatchedInputException.g(a.h(), ((SettableBeanProperty) beanProperty).x.q);
        }
        throw mismatchedInputException;
    }

    public <T> T l0(JavaType javaType, String str, Object... objArr) throws JsonMappingException {
        throw new MismatchedInputException(this.Z1, b(str, objArr), javaType);
    }

    public <T> T m0(d<?> dVar, String str, Object... objArr) throws JsonMappingException {
        throw new MismatchedInputException(this.Z1, b(str, objArr), dVar.n());
    }

    public <T> T n(JavaType javaType, String str) throws JsonMappingException {
        throw new InvalidDefinitionException(this.Z1, str, javaType);
    }

    public <T> T n0(Class<?> cls, String str, Object... objArr) throws JsonMappingException {
        throw new MismatchedInputException(this.Z1, b(str, objArr), cls);
    }

    public <T> T o0(JavaType javaType, String str, String str2, Object... objArr) throws JsonMappingException {
        Class<?> cls = javaType.c;
        MismatchedInputException mismatchedInputException = new MismatchedInputException(this.Z1, b(str2, objArr), cls);
        if (str != null) {
            mismatchedInputException.g(cls, str);
        }
        throw mismatchedInputException;
    }

    public void p0(JavaType javaType, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        String b = b(str, objArr);
        JsonParser jsonParser = this.Z1;
        throw new MismatchedInputException(jsonParser, a(String.format("Unexpected token (%s), expected %s", new Object[]{jsonParser.i(), jsonToken}), b), javaType);
    }

    public final JavaType q(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return this.q.d.d.b((i0.f.a.c.s.a) null, cls, TypeFactory.q);
    }

    public void q0(d<?> dVar, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw u0(this.Z1, dVar.n(), jsonToken, b(str, objArr));
    }

    public final void r0(n nVar) {
        n nVar2 = this.b2;
        if (nVar2 != null) {
            Object[] objArr = nVar.d;
            int i = 0;
            int length = objArr == null ? 0 : objArr.length;
            Object[] objArr2 = nVar2.d;
            if (objArr2 != null) {
                i = objArr2.length;
            }
            if (length < i) {
                return;
            }
        }
        this.b2 = nVar;
    }

    public JsonMappingException s0(Number number, Class<?> cls, String str) {
        return new InvalidFormatException(this.Z1, String.format("Cannot deserialize value of type %s from number %s: %s", new Object[]{i0.f.a.c.t.f.E(cls), String.valueOf(number), str}), number, cls);
    }

    public JsonMappingException t0(String str, Class<?> cls, String str2) {
        return new InvalidFormatException(this.Z1, String.format("Cannot deserialize value of type %s from String %s: %s", new Object[]{i0.f.a.c.t.f.E(cls), c(str), str2}), str, cls);
    }

    public JsonMappingException u0(JsonParser jsonParser, Class<?> cls, JsonToken jsonToken, String str) {
        return new MismatchedInputException(jsonParser, a(String.format("Unexpected token (%s), expected %s", new Object[]{jsonParser.i(), jsonToken}), str), cls);
    }

    public abstract d<Object> v(a aVar, Object obj) throws JsonMappingException;

    public CoercionAction w(LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        CoercionAction coercionAction;
        MutableCoercionConfig mutableCoercionConfig;
        CoercionAction coercionAction2;
        MutableCoercionConfig mutableCoercionConfig2;
        CoercionAction coercionAction3;
        DeserializationConfig deserializationConfig = this.q;
        CoercionConfigs coercionConfigs = deserializationConfig.i2;
        Map<Class<?>, MutableCoercionConfig> map = coercionConfigs.x;
        if (map != null && cls != null && (mutableCoercionConfig2 = map.get(cls)) != null && (coercionAction3 = mutableCoercionConfig2.q[coercionInputShape.ordinal()]) != null) {
            return coercionAction3;
        }
        MutableCoercionConfig[] mutableCoercionConfigArr = coercionConfigs.q;
        if (mutableCoercionConfigArr != null && logicalType != null && (mutableCoercionConfig = mutableCoercionConfigArr[logicalType.ordinal()]) != null && (coercionAction2 = mutableCoercionConfig.q[coercionInputShape.ordinal()]) != null) {
            return coercionAction2;
        }
        CoercionAction coercionAction4 = coercionConfigs.d.q[coercionInputShape.ordinal()];
        if (coercionAction4 != null) {
            return coercionAction4;
        }
        int ordinal = coercionInputShape.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 7) {
                    coercionAction = deserializationConfig.F(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT) ? CoercionAction.AsNull : CoercionAction.Fail;
                }
            } else if (logicalType == LogicalType.Integer) {
                coercionAction = deserializationConfig.F(DeserializationFeature.ACCEPT_FLOAT_AS_INT) ? CoercionAction.TryConvert : CoercionAction.Fail;
            }
            return coercionAction;
        } else if (logicalType == LogicalType.Enum && deserializationConfig.F(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
            return CoercionAction.Fail;
        }
        boolean z = logicalType == LogicalType.Float || logicalType == LogicalType.Integer || logicalType == LogicalType.Boolean || logicalType == LogicalType.DateTime;
        if (z && !deserializationConfig.q(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
            return CoercionAction.Fail;
        }
        if (coercionInputShape != CoercionInputShape.EmptyString) {
            return coercionConfigs.c;
        }
        if (z || deserializationConfig.F(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
            return CoercionAction.AsNull;
        }
        if (logicalType == LogicalType.OtherScalar) {
            return CoercionAction.TryConvert;
        }
        return CoercionAction.Fail;
    }

    public CoercionAction x(LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        CoercionAction coercionAction2;
        MutableCoercionConfig mutableCoercionConfig;
        MutableCoercionConfig mutableCoercionConfig2;
        DeserializationConfig deserializationConfig = this.q;
        CoercionConfigs coercionConfigs = deserializationConfig.i2;
        Map<Class<?>, MutableCoercionConfig> map = coercionConfigs.x;
        Boolean bool = null;
        if (map == null || cls == null || (mutableCoercionConfig2 = map.get(cls)) == null) {
            coercionAction2 = null;
        } else {
            bool = mutableCoercionConfig2.d;
            coercionAction2 = mutableCoercionConfig2.a(CoercionInputShape.EmptyString);
        }
        MutableCoercionConfig[] mutableCoercionConfigArr = coercionConfigs.q;
        if (!(mutableCoercionConfigArr == null || logicalType == null || (mutableCoercionConfig = mutableCoercionConfigArr[logicalType.ordinal()]) == null)) {
            if (bool == null) {
                bool = mutableCoercionConfig.d;
            }
            if (coercionAction2 == null) {
                coercionAction2 = mutableCoercionConfig.a(CoercionInputShape.EmptyString);
            }
        }
        if (bool == null) {
            bool = coercionConfigs.d.d;
        }
        if (coercionAction2 == null) {
            coercionAction2 = coercionConfigs.d.a(CoercionInputShape.EmptyString);
        }
        if (!Boolean.TRUE.equals(bool)) {
            return coercionAction;
        }
        if (coercionAction2 != null) {
            return coercionAction2;
        }
        return deserializationConfig.F(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) ? CoercionAction.AsNull : CoercionAction.Fail;
    }

    public final d<Object> y(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return R(this.c.f(this, this.d, javaType), beanProperty, javaType);
    }

    public final Object z(Object obj, BeanProperty beanProperty, Object obj2) throws JsonMappingException {
        Class<?> cls;
        Annotation[] annotationArr = i0.f.a.c.t.f.a;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        p(cls, String.format("No 'injectableValues' configured, cannot inject value with id [%s]", new Object[]{obj}));
        throw null;
    }

    public DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser) {
        i0.f.a.b.m.f<StreamReadCapability> fVar;
        this.c = deserializationContext.c;
        this.d = deserializationContext.d;
        if (jsonParser == null) {
            fVar = null;
        } else {
            fVar = jsonParser.U();
        }
        this.y = fVar;
        this.q = deserializationConfig;
        this.x = deserializationConfig.k2;
        this.Y1 = deserializationConfig.b2;
        this.Z1 = jsonParser;
    }

    public DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig) {
        this.c = deserializationContext.c;
        this.d = deserializationContext.d;
        this.y = null;
        this.q = deserializationConfig;
        this.x = deserializationConfig.k2;
        this.Y1 = null;
        this.Z1 = null;
    }
}
