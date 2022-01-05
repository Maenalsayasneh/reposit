package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.NameTransformer;
import h0.b0.v;
import i0.f.a.c.b;
import i0.f.a.c.d;
import i0.f.a.c.l.a;
import i0.f.a.c.l.c;
import i0.f.a.c.l.j;
import i0.f.a.c.l.m.h;
import i0.f.a.c.l.m.i;
import i0.f.a.c.t.f;
import i0.f.a.c.t.r;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public abstract class BeanDeserializerBase extends StdDeserializer<Object> implements c, j, Serializable {
    public static final PropertyName x = new PropertyName("#temporary-name");
    public final JsonFormat.Shape Y1;
    public final ValueInstantiator Z1;
    public d<Object> a2;
    public d<Object> b2;
    public PropertyBasedCreator c2;
    public boolean d2;
    public boolean e2;
    public final BeanPropertyMap f2;
    public final ValueInjector[] g2;
    public SettableAnyProperty h2;
    public final Set<String> i2;
    public final Set<String> j2;
    public final boolean k2;
    public final boolean l2;
    public final Map<String, SettableBeanProperty> m2;
    public transient HashMap<ClassKey, d<Object>> n2;
    public i o2;
    public i0.f.a.c.l.m.d p2;
    public final ObjectIdReader q2;
    public final JavaType y;

    public BeanDeserializerBase(a aVar, b bVar, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, Set<String> set2, boolean z2) {
        super(bVar.a);
        this.y = bVar.a;
        ValueInstantiator valueInstantiator = aVar.i;
        this.Z1 = valueInstantiator;
        this.a2 = null;
        this.b2 = null;
        this.c2 = null;
        this.f2 = beanPropertyMap;
        this.m2 = map;
        this.i2 = set;
        this.k2 = z;
        this.j2 = set2;
        this.h2 = aVar.k;
        List<ValueInjector> list = aVar.e;
        ValueInjector[] valueInjectorArr = (list == null || list.isEmpty()) ? null : (ValueInjector[]) list.toArray(new ValueInjector[list.size()]);
        this.g2 = valueInjectorArr;
        ObjectIdReader objectIdReader = aVar.j;
        this.q2 = objectIdReader;
        boolean z3 = false;
        this.d2 = this.o2 != null || valueInstantiator.l() || valueInstantiator.g() || !valueInstantiator.k();
        this.Y1 = bVar.b((JsonFormat.Value) null).q;
        this.l2 = z2;
        if (!this.d2 && valueInjectorArr == null && !z2 && objectIdReader == null) {
            z3 = true;
        }
        this.e2 = z3;
    }

    public final d<Object> A0(DeserializationContext deserializationContext, JavaType javaType, AnnotatedWithParams annotatedWithParams) throws JsonMappingException {
        d<?> dVar;
        BeanProperty.Std std = new BeanProperty.Std(x, javaType, (PropertyName) null, annotatedWithParams, PropertyMetadata.d);
        i0.f.a.c.p.b bVar = (i0.f.a.c.p.b) javaType.x;
        if (bVar == null) {
            DeserializationConfig deserializationConfig = deserializationContext.q;
            Objects.requireNonNull(deserializationConfig);
            i0.f.a.c.n.b bVar2 = ((i0.f.a.c.n.i) deserializationConfig.n(javaType.c)).f;
            i0.f.a.c.p.d<?> l02 = deserializationConfig.e().l0(deserializationConfig, bVar2, javaType);
            Collection<NamedType> collection = null;
            if (l02 == null) {
                l02 = deserializationConfig.d.Z1;
                if (l02 == null) {
                    bVar = null;
                }
            } else {
                collection = deserializationConfig.Z1.b(deserializationConfig, bVar2);
            }
            bVar = l02.b(deserializationConfig, javaType, collection);
        }
        d dVar2 = (d) javaType.q;
        if (dVar2 == null) {
            dVar = deserializationContext.R(deserializationContext.c.f(deserializationContext, deserializationContext.d, javaType), std, javaType);
        } else {
            dVar = deserializationContext.R(dVar2, std, javaType);
        }
        return bVar != null ? new TypeWrappedDeserializer(bVar.f(std), dVar) : dVar;
    }

    public Object B0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Object obj2) throws IOException {
        d<Object> dVar = this.q2.y;
        if (dVar.n() != obj2.getClass()) {
            r rVar = new r(jsonParser, deserializationContext);
            if (obj2 instanceof String) {
                rVar.Q0((String) obj2);
            } else if (obj2 instanceof Long) {
                rVar.i0(((Long) obj2).longValue());
            } else if (obj2 instanceof Integer) {
                rVar.g0(((Integer) obj2).intValue());
            } else {
                rVar.u0(obj2);
            }
            JsonParser f1 = rVar.f1();
            f1.M0();
            obj2 = dVar.d(f1, deserializationContext);
        }
        ObjectIdReader objectIdReader = this.q2;
        deserializationContext.E(obj2, objectIdReader.q, objectIdReader.x).b(obj);
        SettableBeanProperty settableBeanProperty = this.q2.Y1;
        return settableBeanProperty != null ? settableBeanProperty.J(obj, obj2) : obj;
    }

    public void C0(BeanPropertyMap beanPropertyMap, SettableBeanProperty[] settableBeanPropertyArr, SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        int length = beanPropertyMap.y.length;
        for (int i = 1; i <= length; i += 2) {
            Object[] objArr = beanPropertyMap.y;
            if (objArr[i] == settableBeanProperty) {
                objArr[i] = settableBeanProperty2;
                beanPropertyMap.Y1[beanPropertyMap.b(settableBeanProperty)] = settableBeanProperty2;
                if (settableBeanPropertyArr != null) {
                    int length2 = settableBeanPropertyArr.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        if (settableBeanPropertyArr[i3] == settableBeanProperty) {
                            settableBeanPropertyArr[i3] = settableBeanProperty2;
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException(i0.d.a.a.a.y0(i0.d.a.a.a.P0("No entry '"), settableBeanProperty.x.q, "' found, can't replace"));
    }

    public abstract BeanDeserializerBase D0();

    public Object E0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        d<Object> y0 = y0();
        if (y0 == null || this.Z1.c()) {
            return this.Z1.q(deserializationContext, jsonParser.i() == JsonToken.VALUE_TRUE);
        }
        Object E = this.Z1.E(deserializationContext, y0.d(jsonParser, deserializationContext));
        if (this.g2 != null) {
            O0(deserializationContext, E);
        }
        return E;
    }

    public Object F0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonParser.NumberType M = jsonParser.M();
        if (M == JsonParser.NumberType.DOUBLE || M == JsonParser.NumberType.FLOAT) {
            d<Object> y0 = y0();
            if (y0 == null || this.Z1.d()) {
                return this.Z1.v(deserializationContext, jsonParser.F());
            }
            Object E = this.Z1.E(deserializationContext, y0.d(jsonParser, deserializationContext));
            if (this.g2 != null) {
                O0(deserializationContext, E);
            }
            return E;
        } else if (M == JsonParser.NumberType.BIG_DECIMAL) {
            d<Object> y02 = y0();
            if (y02 == null || this.Z1.a()) {
                return this.Z1.n(deserializationContext, jsonParser.E());
            }
            Object E2 = this.Z1.E(deserializationContext, y02.d(jsonParser, deserializationContext));
            if (this.g2 != null) {
                O0(deserializationContext, E2);
            }
            return E2;
        } else {
            deserializationContext.O(this.y.c, this.Z1, jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.N());
            throw null;
        }
    }

    public Object G0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this.q2 != null) {
            return H0(jsonParser, deserializationContext);
        }
        d<Object> y0 = y0();
        JsonParser.NumberType M = jsonParser.M();
        if (M == JsonParser.NumberType.INT) {
            if (y0 == null || this.Z1.e()) {
                return this.Z1.w(deserializationContext, jsonParser.I());
            }
            Object E = this.Z1.E(deserializationContext, y0.d(jsonParser, deserializationContext));
            if (this.g2 != null) {
                O0(deserializationContext, E);
            }
            return E;
        } else if (M == JsonParser.NumberType.LONG) {
            if (y0 == null || this.Z1.e()) {
                return this.Z1.x(deserializationContext, jsonParser.J());
            }
            Object E2 = this.Z1.E(deserializationContext, y0.d(jsonParser, deserializationContext));
            if (this.g2 != null) {
                O0(deserializationContext, E2);
            }
            return E2;
        } else if (M != JsonParser.NumberType.BIG_INTEGER) {
            deserializationContext.O(this.y.c, this.Z1, jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.N());
            throw null;
        } else if (y0 == null || this.Z1.b()) {
            return this.Z1.p(deserializationContext, jsonParser.l());
        } else {
            Object E3 = this.Z1.E(deserializationContext, y0.d(jsonParser, deserializationContext));
            if (this.g2 != null) {
                O0(deserializationContext, E3);
            }
            return E3;
        }
    }

    public Object H0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object d = this.q2.y.d(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this.q2;
        h E = deserializationContext.E(d, objectIdReader.q, objectIdReader.x);
        Object d3 = E.d.d(E.b);
        E.a = d3;
        if (d3 != null) {
            return d3;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + d + "] (for " + this.y + ").", jsonParser.w(), E);
    }

    public Object I0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        d<Object> y0 = y0();
        if (y0 != null) {
            Object E = this.Z1.E(deserializationContext, y0.d(jsonParser, deserializationContext));
            if (this.g2 != null) {
                O0(deserializationContext, E);
            }
            return E;
        } else if (this.c2 != null) {
            return z0(jsonParser, deserializationContext);
        } else {
            Class<?> cls = this.y.c;
            if (f.z(cls)) {
                deserializationContext.O(cls, (ValueInstantiator) null, jsonParser, "non-static inner classes like this can only by instantiated using default, no-argument constructor", new Object[0]);
                throw null;
            }
            deserializationContext.O(cls, this.Z1, jsonParser, "cannot deserialize from Object value (no delegate- or property-based Creator)", new Object[0]);
            throw null;
        }
    }

    public Object J0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this.q2 != null) {
            return H0(jsonParser, deserializationContext);
        }
        d<Object> y0 = y0();
        if (y0 == null || this.Z1.h()) {
            return M(jsonParser, deserializationContext);
        }
        Object E = this.Z1.E(deserializationContext, y0.d(jsonParser, deserializationContext));
        if (this.g2 != null) {
            O0(deserializationContext, E);
        }
        return E;
    }

    public void K0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        Class<?> cls;
        if (deserializationContext.d0(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)) {
            Collection<Object> l = l();
            int i = IgnoredPropertyException.Y1;
            if (obj instanceof Class) {
                cls = (Class) obj;
            } else {
                cls = obj.getClass();
            }
            Class<?> cls2 = cls;
            JsonParser jsonParser2 = jsonParser;
            IgnoredPropertyException ignoredPropertyException = new IgnoredPropertyException(jsonParser2, String.format("Ignored field \"%s\" (class %s) encountered; mapper configured not to allow this", new Object[]{str, cls2.getName()}), jsonParser.w(), cls2, str, l);
            ignoredPropertyException.g(obj, str);
            throw ignoredPropertyException;
        }
        jsonParser.U0();
    }

    public Object L0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, r rVar) throws IOException {
        d<Object> dVar;
        synchronized (this) {
            HashMap<ClassKey, d<Object>> hashMap = this.n2;
            dVar = hashMap == null ? null : hashMap.get(new ClassKey(obj.getClass()));
        }
        if (dVar == null && (dVar = deserializationContext.F(deserializationContext.q(obj.getClass()))) != null) {
            synchronized (this) {
                if (this.n2 == null) {
                    this.n2 = new HashMap<>();
                }
                this.n2.put(new ClassKey(obj.getClass()), dVar);
            }
        }
        if (dVar != null) {
            if (rVar != null) {
                rVar.U();
                JsonParser f1 = rVar.f1();
                f1.M0();
                obj = dVar.e(f1, deserializationContext, obj);
            }
            return jsonParser != null ? dVar.e(jsonParser, deserializationContext, obj) : obj;
        }
        if (rVar != null) {
            M0(deserializationContext, obj, rVar);
        }
        return jsonParser != null ? e(jsonParser, deserializationContext, obj) : obj;
    }

    public Object M0(DeserializationContext deserializationContext, Object obj, r rVar) throws IOException {
        rVar.U();
        JsonParser f1 = rVar.f1();
        while (f1.M0() != JsonToken.END_OBJECT) {
            String f = f1.f();
            f1.M0();
            x0(f1, deserializationContext, obj, f);
        }
        return obj;
    }

    public void N0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (v.Z1(str, this.i2, this.j2)) {
            K0(jsonParser, deserializationContext, obj, str);
            return;
        }
        SettableAnyProperty settableAnyProperty = this.h2;
        if (settableAnyProperty != null) {
            try {
                settableAnyProperty.b(jsonParser, deserializationContext, obj, str);
            } catch (Exception e) {
                T0(e, obj, str, deserializationContext);
                throw null;
            }
        } else {
            x0(jsonParser, deserializationContext, obj, str);
        }
    }

    public void O0(DeserializationContext deserializationContext, Object obj) throws IOException {
        ValueInjector[] valueInjectorArr = this.g2;
        if (valueInjectorArr.length > 0) {
            ValueInjector valueInjector = valueInjectorArr[0];
            deserializationContext.z(valueInjector.Y1, valueInjector, obj);
            throw null;
        }
    }

    public BeanDeserializerBase P0(BeanPropertyMap beanPropertyMap) {
        StringBuilder P0 = i0.d.a.a.a.P0("Class ");
        P0.append(getClass().getName());
        P0.append(" does not override `withBeanProperties()`, needs to");
        throw new UnsupportedOperationException(P0.toString());
    }

    public abstract BeanDeserializerBase Q0(Set<String> set, Set<String> set2);

    public abstract BeanDeserializerBase R0(boolean z);

    public abstract BeanDeserializerBase S0(ObjectIdReader objectIdReader);

    public void T0(Throwable th, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        f.I(th);
        boolean z = deserializationContext == null || deserializationContext.d0(DeserializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JsonProcessingException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            f.K(th);
        }
        throw JsonMappingException.k(th, obj, str);
    }

    public Object U0(Throwable th, DeserializationContext deserializationContext) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        f.I(th);
        if (!(th instanceof IOException)) {
            if (!(deserializationContext == null || deserializationContext.d0(DeserializationFeature.WRAP_EXCEPTIONS))) {
                f.K(th);
            }
            deserializationContext.N(this.y.c, (Object) null, th);
            throw null;
        }
        throw ((IOException) th);
    }

    /* JADX WARNING: type inference failed for: r7v10, types: [com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.d<?> a(com.fasterxml.jackson.databind.DeserializationContext r14, com.fasterxml.jackson.databind.BeanProperty r15) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r13 = this;
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r0 = r13.q2
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r14.G()
            boolean r2 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.Y(r15, r1)
            r3 = 0
            if (r2 == 0) goto L_0x0012
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r15.a()
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0098
            i0.f.a.c.n.n r6 = r1.G(r2)
            if (r6 == 0) goto L_0x0098
            i0.f.a.c.n.n r0 = r1.H(r2, r6)
            java.lang.Class<? extends com.fasterxml.jackson.annotation.ObjectIdGenerator<?>> r6 = r0.c
            i0.f.a.a.z r12 = r14.m(r2, r0)
            java.lang.Class<com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator> r7 = com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator.class
            if (r6 != r7) goto L_0x0077
            com.fasterxml.jackson.databind.PropertyName r6 = r0.b
            java.lang.String r7 = r6.q
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r8 = r13.f2
            if (r8 != 0) goto L_0x0035
            r8 = r3
            goto L_0x0039
        L_0x0035:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r8 = r8.v(r7)
        L_0x0039:
            if (r8 != 0) goto L_0x0048
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator r9 = r13.c2
            if (r9 == 0) goto L_0x0048
            java.util.HashMap<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> r8 = r9.c
            java.lang.Object r7 = r8.get(r7)
            r8 = r7
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r8 = (com.fasterxml.jackson.databind.deser.SettableBeanProperty) r8
        L_0x0048:
            if (r8 == 0) goto L_0x0056
            com.fasterxml.jackson.databind.JavaType r6 = r8.y
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator r7 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator
            java.lang.Class<?> r9 = r0.e
            r7.<init>(r9)
            r9 = r7
            r11 = r8
            goto L_0x008d
        L_0x0056:
            com.fasterxml.jackson.databind.JavaType r15 = r13.y
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Class<?> r1 = r15.c
            java.lang.String r1 = i0.f.a.c.t.f.E(r1)
            r0[r4] = r1
            java.lang.String r1 = i0.f.a.c.t.f.C(r6)
            r0[r5] = r1
            java.lang.String r1 = "Invalid Object Id definition for %s: cannot find property with name %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            com.fasterxml.jackson.core.JsonParser r14 = r14.Z1
            com.fasterxml.jackson.databind.exc.InvalidDefinitionException r1 = new com.fasterxml.jackson.databind.exc.InvalidDefinitionException
            r1.<init>((com.fasterxml.jackson.core.JsonParser) r14, (java.lang.String) r0, (com.fasterxml.jackson.databind.JavaType) r15)
            throw r1
        L_0x0077:
            com.fasterxml.jackson.databind.JavaType r6 = r14.q(r6)
            com.fasterxml.jackson.databind.type.TypeFactory r7 = r14.i()
            java.lang.Class<com.fasterxml.jackson.annotation.ObjectIdGenerator> r8 = com.fasterxml.jackson.annotation.ObjectIdGenerator.class
            com.fasterxml.jackson.databind.JavaType[] r6 = r7.p(r6, r8)
            r6 = r6[r4]
            com.fasterxml.jackson.annotation.ObjectIdGenerator r7 = r14.l(r2, r0)
            r11 = r3
            r9 = r7
        L_0x008d:
            r7 = r6
            i0.f.a.c.d r10 = r14.F(r7)
            com.fasterxml.jackson.databind.PropertyName r8 = r0.b
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r0 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.a(r7, r8, r9, r10, r11, r12)
        L_0x0098:
            if (r0 == 0) goto L_0x00a3
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r6 = r13.q2
            if (r0 == r6) goto L_0x00a3
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase r0 = r13.S0(r0)
            goto L_0x00a4
        L_0x00a3:
            r0 = r13
        L_0x00a4:
            if (r2 == 0) goto L_0x010f
            com.fasterxml.jackson.databind.DeserializationConfig r6 = r14.q
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r7 = r1.T(r6, r2)
            boolean r8 = r7.q
            if (r8 == 0) goto L_0x00b8
            boolean r8 = r13.k2
            if (r8 != 0) goto L_0x00b8
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase r0 = r0.R0(r5)
        L_0x00b8:
            java.util.Set r7 = r7.c()
            java.util.Set<java.lang.String> r8 = r0.i2
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L_0x00c6
            r7 = r8
            goto L_0x00d8
        L_0x00c6:
            if (r8 == 0) goto L_0x00d8
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x00cf
            goto L_0x00d8
        L_0x00cf:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>(r8)
            r9.addAll(r7)
            r7 = r9
        L_0x00d8:
            java.util.Set<java.lang.String> r9 = r0.j2
            com.fasterxml.jackson.annotation.JsonIncludeProperties$Value r1 = r1.W(r6, r2)
            java.util.Set<java.lang.String> r1 = r1.d
            if (r9 != 0) goto L_0x00e3
            goto L_0x0107
        L_0x00e3:
            if (r1 != 0) goto L_0x00e7
            r1 = r9
            goto L_0x0107
        L_0x00e7:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00f0:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0106
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r10 = r9.contains(r6)
            if (r10 == 0) goto L_0x00f0
            r2.add(r6)
            goto L_0x00f0
        L_0x0106:
            r1 = r2
        L_0x0107:
            if (r7 != r8) goto L_0x010b
            if (r1 == r9) goto L_0x010f
        L_0x010b:
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase r0 = r0.Q0(r7, r1)
        L_0x010f:
            com.fasterxml.jackson.databind.JavaType r1 = r13.y
            java.lang.Class<?> r1 = r1.c
            com.fasterxml.jackson.annotation.JsonFormat$Value r14 = r13.t0(r14, r15, r1)
            if (r14 == 0) goto L_0x0142
            com.fasterxml.jackson.annotation.JsonFormat$Shape r15 = r14.q
            com.fasterxml.jackson.annotation.JsonFormat$Shape r1 = com.fasterxml.jackson.annotation.JsonFormat.Shape.ANY
            if (r15 == r1) goto L_0x0120
            r4 = r5
        L_0x0120:
            if (r4 == 0) goto L_0x0123
            r3 = r15
        L_0x0123:
            com.fasterxml.jackson.annotation.JsonFormat$Feature r15 = com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES
            java.lang.Boolean r14 = r14.b(r15)
            if (r14 == 0) goto L_0x0142
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r15 = r13.f2
            boolean r14 = r14.booleanValue()
            boolean r1 = r15.c
            if (r1 != r14) goto L_0x0137
            r1 = r15
            goto L_0x013c
        L_0x0137:
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r1 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap
            r1.<init>(r15, r14)
        L_0x013c:
            if (r1 == r15) goto L_0x0142
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase r0 = r0.P0(r1)
        L_0x0142:
            if (r3 != 0) goto L_0x0146
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = r13.Y1
        L_0x0146:
            com.fasterxml.jackson.annotation.JsonFormat$Shape r14 = com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY
            if (r3 != r14) goto L_0x014e
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase r0 = r0.D0()
        L_0x014e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.a(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):i0.f.a.c.d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0164, code lost:
        if (r6.b != false) goto L_0x019b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0096 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x01f2 A[EDGE_INSN: B:179:0x01f2->B:99:0x01f2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(com.fasterxml.jackson.databind.DeserializationContext r25) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r24 = this;
            r0 = r24
            r2 = r25
            com.fasterxml.jackson.databind.deser.ValueInstantiator r1 = r0.Z1
            boolean r1 = r1.g()
            if (r1 == 0) goto L_0x0038
            com.fasterxml.jackson.databind.deser.ValueInstantiator r1 = r0.Z1
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r2.q
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r1 = r1.M(r4)
            java.util.Set<java.lang.String> r4 = r0.i2
            if (r4 != 0) goto L_0x001c
            java.util.Set<java.lang.String> r4 = r0.j2
            if (r4 == 0) goto L_0x0039
        L_0x001c:
            int r4 = r1.length
            r5 = 0
        L_0x001e:
            if (r5 >= r4) goto L_0x0039
            r6 = r1[r5]
            com.fasterxml.jackson.databind.PropertyName r6 = r6.x
            java.lang.String r6 = r6.q
            java.util.Set<java.lang.String> r8 = r0.i2
            java.util.Set<java.lang.String> r9 = r0.j2
            boolean r6 = h0.b0.v.Z1(r6, r8, r9)
            if (r6 == 0) goto L_0x0035
            r6 = r1[r5]
            r6.H()
        L_0x0035:
            int r5 = r5 + 1
            goto L_0x001e
        L_0x0038:
            r1 = 0
        L_0x0039:
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r4 = r0.f2
            java.util.Iterator r4 = r4.iterator()
        L_0x003f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x008e
            java.lang.Object r5 = r4.next()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r5 = (com.fasterxml.jackson.databind.deser.SettableBeanProperty) r5
            boolean r6 = r5.A()
            if (r6 != 0) goto L_0x003f
            com.fasterxml.jackson.databind.AnnotationIntrospector r6 = r25.G()
            if (r6 == 0) goto L_0x007b
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r8 = r5.a()
            java.lang.Object r6 = r6.i(r8)
            if (r6 == 0) goto L_0x007b
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r8 = r5.a()
            i0.f.a.c.t.g r6 = r2.g(r8, r6)
            com.fasterxml.jackson.databind.type.TypeFactory r8 = r25.i()
            com.fasterxml.jackson.databind.JavaType r8 = r6.b(r8)
            i0.f.a.c.d r9 = r2.C(r8)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r10 = new com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            r10.<init>(r6, r8, r9)
            goto L_0x007c
        L_0x007b:
            r10 = 0
        L_0x007c:
            if (r10 != 0) goto L_0x0084
            com.fasterxml.jackson.databind.JavaType r6 = r5.y
            i0.f.a.c.d r10 = r2.C(r6)
        L_0x0084:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r6 = r5.T(r10)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r8 = r0.f2
            r0.C0(r8, r1, r5, r6)
            goto L_0x003f
        L_0x008e:
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r4 = r0.f2
            java.util.Iterator r4 = r4.iterator()
            r8 = 0
            r9 = 0
        L_0x0096:
            boolean r5 = r4.hasNext()
            r10 = 1
            if (r5 == 0) goto L_0x0283
            java.lang.Object r5 = r4.next()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r5 = (com.fasterxml.jackson.databind.deser.SettableBeanProperty) r5
            i0.f.a.c.d r11 = r5.y()
            com.fasterxml.jackson.databind.JavaType r12 = r5.y
            i0.f.a.c.d r11 = r2.Q(r11, r5, r12)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r11 = r5.T(r11)
            java.lang.String r12 = r11.w()
            if (r12 != 0) goto L_0x00b8
            goto L_0x00dc
        L_0x00b8:
            i0.f.a.c.d r13 = r11.y()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r13 = r13.h(r12)
            if (r13 == 0) goto L_0x0264
            com.fasterxml.jackson.databind.JavaType r14 = r0.y
            com.fasterxml.jackson.databind.JavaType r15 = r13.y
            com.fasterxml.jackson.databind.JavaType r6 = r11.y
            boolean r6 = r6.G()
            java.lang.Class<?> r3 = r15.c
            java.lang.Class<?> r7 = r14.c
            boolean r3 = r3.isAssignableFrom(r7)
            if (r3 == 0) goto L_0x023e
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty r3 = new com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty
            r3.<init>(r11, r12, r13, r6)
            r11 = r3
        L_0x00dc:
            boolean r3 = r11 instanceof com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty
            if (r3 != 0) goto L_0x00fc
            i0.f.a.c.n.n r3 = r11.x()
            i0.f.a.c.d r6 = r11.y()
            if (r6 != 0) goto L_0x00ed
            r6 = 0
            goto L_0x00f1
        L_0x00ed:
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r6 = r6.m()
        L_0x00f1:
            if (r3 != 0) goto L_0x00f6
            if (r6 != 0) goto L_0x00f6
            goto L_0x00fc
        L_0x00f6:
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty r6 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty
            r6.<init>((com.fasterxml.jackson.databind.deser.SettableBeanProperty) r11, (i0.f.a.c.n.n) r3)
            r11 = r6
        L_0x00fc:
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r3 = r11.a()
            if (r3 == 0) goto L_0x0127
            com.fasterxml.jackson.databind.AnnotationIntrospector r6 = r25.G()
            com.fasterxml.jackson.databind.util.NameTransformer r3 = r6.m0(r3)
            if (r3 == 0) goto L_0x0127
            boolean r6 = r11 instanceof com.fasterxml.jackson.databind.deser.CreatorProperty
            if (r6 != 0) goto L_0x0111
            goto L_0x0128
        L_0x0111:
            com.fasterxml.jackson.databind.JavaType r1 = r0.y
            java.lang.Object[] r3 = new java.lang.Object[r10]
            com.fasterxml.jackson.databind.PropertyName r4 = r11.x
            java.lang.String r4 = r4.q
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "Cannot define Creator property \"%s\" as `@JsonUnwrapped`: combination not yet supported"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.n(r1, r3)
            r1 = 0
            throw r1
        L_0x0127:
            r3 = 0
        L_0x0128:
            if (r3 == 0) goto L_0x014e
            i0.f.a.c.d r6 = r11.y()
            i0.f.a.c.d r3 = r6.w(r3)
            if (r3 == r6) goto L_0x014e
            if (r3 == 0) goto L_0x014e
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r3 = r11.T(r3)
            if (r9 != 0) goto L_0x0142
            i0.f.a.c.l.m.i r5 = new i0.f.a.c.l.m.i
            r5.<init>()
            r9 = r5
        L_0x0142:
            java.util.List<com.fasterxml.jackson.databind.deser.SettableBeanProperty> r5 = r9.a
            r5.add(r3)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r5 = r0.f2
            r5.y(r3)
            goto L_0x0096
        L_0x014e:
            com.fasterxml.jackson.databind.PropertyMetadata r3 = r11.f()
            com.fasterxml.jackson.databind.PropertyMetadata$a r6 = r3.a2
            if (r6 == 0) goto L_0x018a
            i0.f.a.c.d r7 = r11.y()
            com.fasterxml.jackson.databind.DeserializationConfig r12 = r2.q
            java.lang.Boolean r12 = r7.v(r12)
            if (r12 != 0) goto L_0x0167
            boolean r7 = r6.b
            if (r7 == 0) goto L_0x0175
            goto L_0x019b
        L_0x0167:
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x0175
            boolean r3 = r6.b
            if (r3 != 0) goto L_0x019b
            r2.M(r7)
            goto L_0x019b
        L_0x0175:
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r6 = r6.a
            com.fasterxml.jackson.databind.MapperFeature r7 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r7 = r2.e0(r7)
            r6.g(r7)
            boolean r7 = r11 instanceof com.fasterxml.jackson.databind.deser.impl.SetterlessProperty
            if (r7 != 0) goto L_0x018a
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty r7 = new com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty
            r7.<init>(r11, r6)
            r11 = r7
        L_0x018a:
            com.fasterxml.jackson.annotation.Nulls r3 = r3.b2
            i0.f.a.c.d r6 = r11.y()
            i0.f.a.c.l.i r3 = r0.O(r2, r11, r3, r6)
            if (r3 == 0) goto L_0x019b
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r3 = r11.Q(r3)
            r11 = r3
        L_0x019b:
            i0.f.a.c.d r3 = r11.y()
            boolean r6 = r3 instanceof com.fasterxml.jackson.databind.deser.BeanDeserializerBase
            if (r6 == 0) goto L_0x01f2
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase r3 = (com.fasterxml.jackson.databind.deser.BeanDeserializerBase) r3
            com.fasterxml.jackson.databind.deser.ValueInstantiator r3 = r3.Z1
            boolean r3 = r3.k()
            if (r3 != 0) goto L_0x01f2
            com.fasterxml.jackson.databind.JavaType r3 = r11.y
            java.lang.Class<?> r3 = r3.c
            java.lang.Class r6 = i0.f.a.c.t.f.r(r3)
            if (r6 == 0) goto L_0x01f2
            com.fasterxml.jackson.databind.JavaType r7 = r0.y
            java.lang.Class<?> r7 = r7.c
            if (r6 != r7) goto L_0x01f2
            java.lang.reflect.Constructor[] r3 = r3.getConstructors()
            int r7 = r3.length
            r12 = 0
        L_0x01c3:
            if (r12 >= r7) goto L_0x01f2
            r13 = r3[r12]
            java.lang.Class[] r14 = r13.getParameterTypes()
            int r15 = r14.length
            if (r15 != r10) goto L_0x01ef
            r15 = 0
            r14 = r14[r15]
            boolean r14 = r6.equals(r14)
            if (r14 == 0) goto L_0x01ef
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r2.q
            boolean r3 = r3.b()
            if (r3 == 0) goto L_0x01e8
            com.fasterxml.jackson.databind.MapperFeature r3 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r3 = r2.e0(r3)
            i0.f.a.c.t.f.e(r13, r3)
        L_0x01e8:
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty r3 = new com.fasterxml.jackson.databind.deser.impl.InnerClassProperty
            r3.<init>(r11, r13)
            r11 = r3
            goto L_0x01f2
        L_0x01ef:
            int r12 = r12 + 1
            goto L_0x01c3
        L_0x01f2:
            if (r11 == r5) goto L_0x01f9
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r3 = r0.f2
            r0.C0(r3, r1, r5, r11)
        L_0x01f9:
            boolean r3 = r11.C()
            if (r3 == 0) goto L_0x0096
            i0.f.a.c.p.b r3 = r11.z()
            com.fasterxml.jackson.annotation.JsonTypeInfo$As r5 = r3.k()
            com.fasterxml.jackson.annotation.JsonTypeInfo$As r6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY
            if (r5 != r6) goto L_0x0096
            if (r8 != 0) goto L_0x0215
            com.fasterxml.jackson.databind.JavaType r5 = r0.y
            i0.f.a.c.l.m.d$a r6 = new i0.f.a.c.l.m.d$a
            r6.<init>(r5)
            r8 = r6
        L_0x0215:
            java.util.List<i0.f.a.c.l.m.d$b> r5 = r8.b
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.util.List<i0.f.a.c.l.m.d$b> r6 = r8.b
            i0.f.a.c.l.m.d$b r7 = new i0.f.a.c.l.m.d$b
            r7.<init>(r11, r3)
            r6.add(r7)
            com.fasterxml.jackson.databind.PropertyName r6 = r11.x
            java.lang.String r6 = r6.q
            r8.a(r6, r5)
            java.lang.String r3 = r3.h()
            r8.a(r3, r5)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r3 = r0.f2
            r3.y(r11)
            goto L_0x0096
        L_0x023e:
            com.fasterxml.jackson.databind.JavaType r1 = r0.y
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = i0.f.a.c.t.f.D(r12)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = i0.f.a.c.t.f.t(r15)
            r3[r10] = r4
            java.lang.Class<?> r4 = r14.c
            java.lang.String r4 = r4.getName()
            r5 = 2
            r3[r5] = r4
            java.lang.String r4 = "Cannot handle managed/back reference %s: back reference type (%s) not compatible with managed type (%s)"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.n(r1, r3)
            r1 = 0
            throw r1
        L_0x0264:
            r1 = 0
            r5 = 2
            com.fasterxml.jackson.databind.JavaType r3 = r0.y
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String r5 = i0.f.a.c.t.f.D(r12)
            r6 = 0
            r4[r6] = r5
            com.fasterxml.jackson.databind.JavaType r5 = r11.y
            java.lang.String r5 = i0.f.a.c.t.f.t(r5)
            r4[r10] = r5
            java.lang.String r5 = "Cannot handle managed/back reference %s: no back reference property found from type %s"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r2.n(r3, r4)
            throw r1
        L_0x0283:
            com.fasterxml.jackson.databind.deser.SettableAnyProperty r3 = r0.h2
            if (r3 == 0) goto L_0x02b5
            i0.f.a.c.d<java.lang.Object> r4 = r3.y
            if (r4 == 0) goto L_0x028d
            r4 = r10
            goto L_0x028e
        L_0x028d:
            r4 = 0
        L_0x028e:
            if (r4 != 0) goto L_0x02b5
            com.fasterxml.jackson.databind.JavaType r4 = r3.x
            com.fasterxml.jackson.databind.BeanProperty r5 = r3.c
            i0.f.a.c.d r22 = r2.y(r4, r5)
            com.fasterxml.jackson.databind.deser.SettableAnyProperty r4 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty
            com.fasterxml.jackson.databind.BeanProperty r5 = r3.c
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r6 = r3.d
            com.fasterxml.jackson.databind.JavaType r7 = r3.x
            i0.f.a.c.h r11 = r3.Z1
            i0.f.a.c.p.b r3 = r3.Y1
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r11
            r23 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r0.h2 = r4
        L_0x02b5:
            com.fasterxml.jackson.databind.deser.ValueInstantiator r3 = r0.Z1
            boolean r3 = r3.l()
            if (r3 == 0) goto L_0x02f3
            com.fasterxml.jackson.databind.deser.ValueInstantiator r3 = r0.Z1
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r2.q
            com.fasterxml.jackson.databind.JavaType r3 = r3.J(r4)
            if (r3 == 0) goto L_0x02d4
            com.fasterxml.jackson.databind.deser.ValueInstantiator r4 = r0.Z1
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r4 = r4.I()
            i0.f.a.c.d r3 = r0.A0(r2, r3, r4)
            r0.a2 = r3
            goto L_0x02f3
        L_0x02d4:
            com.fasterxml.jackson.databind.JavaType r1 = r0.y
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = i0.f.a.c.t.f.t(r1)
            r5 = 0
            r3[r5] = r4
            com.fasterxml.jackson.databind.deser.ValueInstantiator r4 = r0.Z1
            java.lang.String r4 = i0.f.a.c.t.f.f(r4)
            r3[r10] = r4
            java.lang.String r4 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.n(r1, r3)
            r1 = 0
            throw r1
        L_0x02f3:
            com.fasterxml.jackson.databind.deser.ValueInstantiator r3 = r0.Z1
            boolean r3 = r3.i()
            if (r3 == 0) goto L_0x0331
            com.fasterxml.jackson.databind.deser.ValueInstantiator r3 = r0.Z1
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r2.q
            com.fasterxml.jackson.databind.JavaType r3 = r3.G(r4)
            if (r3 == 0) goto L_0x0312
            com.fasterxml.jackson.databind.deser.ValueInstantiator r4 = r0.Z1
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r4 = r4.F()
            i0.f.a.c.d r3 = r0.A0(r2, r3, r4)
            r0.b2 = r3
            goto L_0x0331
        L_0x0312:
            com.fasterxml.jackson.databind.JavaType r1 = r0.y
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = i0.f.a.c.t.f.t(r1)
            r7 = 0
            r3[r7] = r4
            com.fasterxml.jackson.databind.deser.ValueInstantiator r4 = r0.Z1
            java.lang.String r4 = i0.f.a.c.t.f.f(r4)
            r3[r10] = r4
            java.lang.String r4 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.n(r1, r3)
            r1 = 0
            throw r1
        L_0x0331:
            r7 = 0
            if (r1 == 0) goto L_0x036a
            com.fasterxml.jackson.databind.deser.ValueInstantiator r3 = r0.Z1
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r4 = r0.f2
            int r5 = r1.length
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r6 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[r5]
            r11 = r7
        L_0x033c:
            if (r11 >= r5) goto L_0x035b
            r12 = r1[r11]
            boolean r13 = r12.A()
            if (r13 != 0) goto L_0x0356
            boolean r13 = r12.G()
            if (r13 != 0) goto L_0x0356
            com.fasterxml.jackson.databind.JavaType r13 = r12.y
            i0.f.a.c.d r13 = r2.y(r13, r12)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r12 = r12.T(r13)
        L_0x0356:
            r6[r11] = r12
            int r11 = r11 + 1
            goto L_0x033c
        L_0x035b:
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator r11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator
            boolean r5 = r4.c
            r12 = 1
            r1 = r11
            r2 = r25
            r4 = r6
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.c2 = r11
        L_0x036a:
            if (r8 == 0) goto L_0x03a1
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r1 = r0.f2
            java.util.List<i0.f.a.c.l.m.d$b> r2 = r8.b
            int r2 = r2.size()
            i0.f.a.c.l.m.d$b[] r13 = new i0.f.a.c.l.m.d.b[r2]
            r5 = r7
        L_0x0377:
            if (r5 >= r2) goto L_0x0390
            java.util.List<i0.f.a.c.l.m.d$b> r3 = r8.b
            java.lang.Object r3 = r3.get(r5)
            i0.f.a.c.l.m.d$b r3 = (i0.f.a.c.l.m.d.b) r3
            java.lang.String r4 = r3.c
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r4 = r1.v(r4)
            if (r4 == 0) goto L_0x038b
            r3.d = r4
        L_0x038b:
            r13[r5] = r3
            int r5 = r5 + 1
            goto L_0x0377
        L_0x0390:
            i0.f.a.c.l.m.d r1 = new i0.f.a.c.l.m.d
            com.fasterxml.jackson.databind.JavaType r12 = r8.a
            java.util.Map<java.lang.String, java.lang.Object> r14 = r8.c
            r15 = 0
            r16 = 0
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            r0.p2 = r1
            r0.d2 = r10
        L_0x03a1:
            r0.o2 = r9
            if (r9 == 0) goto L_0x03a7
            r0.d2 = r10
        L_0x03a7:
            boolean r1 = r0.e2
            if (r1 == 0) goto L_0x03b0
            boolean r1 = r0.d2
            if (r1 != 0) goto L_0x03b0
            r7 = r10
        L_0x03b0:
            r0.e2 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.c(com.fasterxml.jackson.databind.DeserializationContext):void");
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, i0.f.a.c.p.b bVar) throws IOException {
        Object Q;
        if (this.q2 != null) {
            if (jsonParser.a() && (Q = jsonParser.Q()) != null) {
                return B0(jsonParser, deserializationContext, bVar.d(jsonParser, deserializationContext), Q);
            }
            JsonToken i = jsonParser.i();
            if (i != null) {
                if (i.isScalarValue()) {
                    return H0(jsonParser, deserializationContext);
                }
                if (i == JsonToken.START_OBJECT) {
                    i = jsonParser.M0();
                }
                if (i == JsonToken.FIELD_NAME) {
                    this.q2.b();
                }
            }
        }
        return bVar.d(jsonParser, deserializationContext);
    }

    public SettableBeanProperty h(String str) {
        Map<String, SettableBeanProperty> map = this.m2;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public AccessPattern i() {
        return AccessPattern.DYNAMIC;
    }

    public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
        try {
            return this.Z1.C(deserializationContext);
        } catch (IOException e) {
            f.H(deserializationContext, e);
            throw null;
        }
    }

    public Collection<Object> l() {
        ArrayList arrayList = new ArrayList();
        Iterator<SettableBeanProperty> it = this.f2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().x.q);
        }
        return arrayList;
    }

    public ObjectIdReader m() {
        return this.q2;
    }

    public Class<?> n() {
        return this.y.c;
    }

    public boolean p() {
        return true;
    }

    public LogicalType q() {
        return LogicalType.POJO;
    }

    public ValueInstantiator u0() {
        return this.Z1;
    }

    public Boolean v(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public JavaType v0() {
        return this.y;
    }

    public void x0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (this.k2) {
            jsonParser.U0();
            return;
        }
        if (v.Z1(str, this.i2, this.j2)) {
            K0(jsonParser, deserializationContext, obj, str);
        }
        super.x0(jsonParser, deserializationContext, obj, str);
    }

    public final d<Object> y0() {
        d<Object> dVar = this.a2;
        return dVar == null ? this.b2 : dVar;
    }

    public abstract Object z0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, boolean z) {
        super(beanDeserializerBase.y);
        this.y = beanDeserializerBase.y;
        this.Z1 = beanDeserializerBase.Z1;
        this.a2 = beanDeserializerBase.a2;
        this.b2 = beanDeserializerBase.b2;
        this.c2 = beanDeserializerBase.c2;
        this.f2 = beanDeserializerBase.f2;
        this.m2 = beanDeserializerBase.m2;
        this.i2 = beanDeserializerBase.i2;
        this.k2 = z;
        this.j2 = beanDeserializerBase.j2;
        this.h2 = beanDeserializerBase.h2;
        this.g2 = beanDeserializerBase.g2;
        this.q2 = beanDeserializerBase.q2;
        this.d2 = beanDeserializerBase.d2;
        this.o2 = beanDeserializerBase.o2;
        this.l2 = beanDeserializerBase.l2;
        this.Y1 = beanDeserializerBase.Y1;
        this.e2 = beanDeserializerBase.e2;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase.y);
        d<Object> w;
        d<Object> w2;
        this.y = beanDeserializerBase.y;
        this.Z1 = beanDeserializerBase.Z1;
        this.a2 = beanDeserializerBase.a2;
        this.b2 = beanDeserializerBase.b2;
        this.c2 = beanDeserializerBase.c2;
        this.m2 = beanDeserializerBase.m2;
        this.i2 = beanDeserializerBase.i2;
        this.k2 = nameTransformer != null || beanDeserializerBase.k2;
        this.j2 = beanDeserializerBase.j2;
        this.h2 = beanDeserializerBase.h2;
        this.g2 = beanDeserializerBase.g2;
        this.q2 = beanDeserializerBase.q2;
        this.d2 = beanDeserializerBase.d2;
        i iVar = beanDeserializerBase.o2;
        if (nameTransformer != null) {
            if (iVar != null) {
                ArrayList arrayList = new ArrayList(iVar.a.size());
                for (SettableBeanProperty next : iVar.a) {
                    SettableBeanProperty R = next.R(nameTransformer.a(next.x.q));
                    d<Object> y2 = R.y();
                    if (!(y2 == null || (w2 = y2.w(nameTransformer)) == y2)) {
                        R = R.T(w2);
                    }
                    arrayList.add(R);
                }
                iVar = new i(arrayList);
            }
            BeanPropertyMap beanPropertyMap = beanDeserializerBase.f2;
            Objects.requireNonNull(beanPropertyMap);
            if (nameTransformer != NameTransformer.c) {
                ArrayList arrayList2 = new ArrayList(r3);
                for (SettableBeanProperty settableBeanProperty : beanPropertyMap.Y1) {
                    if (settableBeanProperty == null) {
                        arrayList2.add(settableBeanProperty);
                    } else {
                        SettableBeanProperty R2 = settableBeanProperty.R(nameTransformer.a(settableBeanProperty.x.q));
                        d<Object> y3 = R2.y();
                        if (!(y3 == null || (w = y3.w(nameTransformer)) == y3)) {
                            R2 = R2.T(w);
                        }
                        arrayList2.add(R2);
                    }
                }
                beanPropertyMap = new BeanPropertyMap(beanPropertyMap.c, (Collection<SettableBeanProperty>) arrayList2, beanPropertyMap.Z1, beanPropertyMap.b2);
            }
            this.f2 = beanPropertyMap;
        } else {
            this.f2 = beanDeserializerBase.f2;
        }
        this.o2 = iVar;
        this.l2 = beanDeserializerBase.l2;
        this.Y1 = beanDeserializerBase.Y1;
        this.e2 = false;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase.y);
        this.y = beanDeserializerBase.y;
        this.Z1 = beanDeserializerBase.Z1;
        this.a2 = beanDeserializerBase.a2;
        this.b2 = beanDeserializerBase.b2;
        this.c2 = beanDeserializerBase.c2;
        this.m2 = beanDeserializerBase.m2;
        this.i2 = beanDeserializerBase.i2;
        this.k2 = beanDeserializerBase.k2;
        this.j2 = beanDeserializerBase.j2;
        this.h2 = beanDeserializerBase.h2;
        this.g2 = beanDeserializerBase.g2;
        this.d2 = beanDeserializerBase.d2;
        this.o2 = beanDeserializerBase.o2;
        this.l2 = beanDeserializerBase.l2;
        this.Y1 = beanDeserializerBase.Y1;
        this.q2 = objectIdReader;
        if (objectIdReader == null) {
            this.f2 = beanDeserializerBase.f2;
            this.e2 = beanDeserializerBase.e2;
            return;
        }
        this.f2 = beanDeserializerBase.f2.z(new ObjectIdValueProperty(objectIdReader, PropertyMetadata.c));
        this.e2 = false;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, Set<String> set, Set<String> set2) {
        super(beanDeserializerBase.y);
        this.y = beanDeserializerBase.y;
        this.Z1 = beanDeserializerBase.Z1;
        this.a2 = beanDeserializerBase.a2;
        this.b2 = beanDeserializerBase.b2;
        this.c2 = beanDeserializerBase.c2;
        this.m2 = beanDeserializerBase.m2;
        this.i2 = set;
        this.k2 = beanDeserializerBase.k2;
        this.j2 = set2;
        this.h2 = beanDeserializerBase.h2;
        this.g2 = beanDeserializerBase.g2;
        this.d2 = beanDeserializerBase.d2;
        this.o2 = beanDeserializerBase.o2;
        this.l2 = beanDeserializerBase.l2;
        this.Y1 = beanDeserializerBase.Y1;
        this.e2 = beanDeserializerBase.e2;
        this.q2 = beanDeserializerBase.q2;
        BeanPropertyMap beanPropertyMap = beanDeserializerBase.f2;
        Objects.requireNonNull(beanPropertyMap);
        if ((set != null && !set.isEmpty()) || set2 != null) {
            ArrayList arrayList = new ArrayList(r0);
            for (SettableBeanProperty settableBeanProperty : beanPropertyMap.Y1) {
                if (settableBeanProperty != null && !v.Z1(settableBeanProperty.x.q, set, set2)) {
                    arrayList.add(settableBeanProperty);
                }
            }
            beanPropertyMap = new BeanPropertyMap(beanPropertyMap.c, (Collection<SettableBeanProperty>) arrayList, beanPropertyMap.Z1, beanPropertyMap.b2);
        }
        this.f2 = beanPropertyMap;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase.y);
        this.y = beanDeserializerBase.y;
        this.Z1 = beanDeserializerBase.Z1;
        this.a2 = beanDeserializerBase.a2;
        this.b2 = beanDeserializerBase.b2;
        this.c2 = beanDeserializerBase.c2;
        this.f2 = beanPropertyMap;
        this.m2 = beanDeserializerBase.m2;
        this.i2 = beanDeserializerBase.i2;
        this.k2 = beanDeserializerBase.k2;
        this.j2 = beanDeserializerBase.j2;
        this.h2 = beanDeserializerBase.h2;
        this.g2 = beanDeserializerBase.g2;
        this.q2 = beanDeserializerBase.q2;
        this.d2 = beanDeserializerBase.d2;
        this.o2 = beanDeserializerBase.o2;
        this.l2 = beanDeserializerBase.l2;
        this.Y1 = beanDeserializerBase.Y1;
        this.e2 = beanDeserializerBase.e2;
    }
}
