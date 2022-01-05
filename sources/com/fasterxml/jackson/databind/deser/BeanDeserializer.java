package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.util.NameTransformer;
import h0.b0.v;
import i0.f.a.c.b;
import i0.f.a.c.d;
import i0.f.a.c.l.e;
import i0.f.a.c.l.m.f;
import i0.f.a.c.l.m.g;
import i0.f.a.c.l.m.h;
import i0.f.a.c.t.r;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class BeanDeserializer extends BeanDeserializerBase implements Serializable {
    public transient Exception r2;
    public volatile transient NameTransformer s2;

    public static class a extends h.a {
        public final DeserializationContext c;
        public final SettableBeanProperty d;
        public Object e;

        public a(DeserializationContext deserializationContext, UnresolvedForwardReference unresolvedForwardReference, JavaType javaType, SettableBeanProperty settableBeanProperty) {
            super(unresolvedForwardReference, javaType);
            this.c = deserializationContext;
            this.d = settableBeanProperty;
        }

        public void a(Object obj, Object obj2) throws IOException {
            Object obj3 = this.e;
            if (obj3 != null) {
                this.d.I(obj3, obj2);
                return;
            }
            DeserializationContext deserializationContext = this.c;
            SettableBeanProperty settableBeanProperty = this.d;
            deserializationContext.k0(settableBeanProperty, "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved", settableBeanProperty.x.q, settableBeanProperty.q().getName());
            throw null;
        }
    }

    public BeanDeserializer(i0.f.a.c.l.a aVar, b bVar, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, HashSet<String> hashSet, boolean z, Set<String> set, boolean z2) {
        super(aVar, bVar, beanPropertyMap, map, hashSet, z, set, z2);
    }

    public BeanDeserializerBase D0() {
        return new BeanAsArrayDeserializer(this, this.f2.Y1);
    }

    public Object I(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        d<Object> dVar = this.b2;
        if (dVar == null && (dVar = this.a2) == null) {
            CoercionAction N = N(deserializationContext);
            boolean d0 = deserializationContext.d0(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
            if (d0 || N != CoercionAction.Fail) {
                JsonToken M0 = jsonParser.M0();
                JsonToken jsonToken = JsonToken.END_ARRAY;
                if (M0 == jsonToken) {
                    int ordinal = N.ordinal();
                    if (ordinal == 1 || ordinal == 2) {
                        return null;
                    }
                    if (ordinal == 3) {
                        return k(deserializationContext);
                    }
                    JavaType javaType = this.q;
                    if (javaType == null) {
                        javaType = deserializationContext.q(this.d);
                    }
                    deserializationContext.U(javaType, JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
                    throw null;
                } else if (d0) {
                    Object d = d(jsonParser, deserializationContext);
                    if (jsonParser.M0() == jsonToken) {
                        return d;
                    }
                    w0(deserializationContext);
                    throw null;
                }
            }
            JavaType javaType2 = this.q;
            if (javaType2 == null) {
                javaType2 = deserializationContext.q(this.d);
            }
            deserializationContext.T(javaType2, jsonParser);
            throw null;
        }
        Object A = this.Z1.A(deserializationContext, dVar.d(jsonParser, deserializationContext));
        if (this.g2 != null) {
            O0(deserializationContext, A);
        }
        return A;
    }

    public BeanDeserializerBase P0(BeanPropertyMap beanPropertyMap) {
        return new BeanDeserializer((BeanDeserializerBase) this, beanPropertyMap);
    }

    public BeanDeserializerBase Q0(Set set, Set set2) {
        return new BeanDeserializer(this, set, set2);
    }

    public BeanDeserializerBase R0(boolean z) {
        return new BeanDeserializer((BeanDeserializerBase) this, z);
    }

    public BeanDeserializerBase S0(ObjectIdReader objectIdReader) {
        return new BeanDeserializer((BeanDeserializerBase) this, objectIdReader);
    }

    public final Object V0(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws IOException {
        try {
            return settableBeanProperty.i(jsonParser, deserializationContext);
        } catch (Exception e) {
            T0(e, this.y.c, settableBeanProperty.x.q, deserializationContext);
            throw null;
        }
    }

    public Object W0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, i0.f.a.c.l.m.d dVar) throws IOException {
        Class<?> cls = this.l2 ? deserializationContext.Y1 : null;
        JsonToken i = jsonParser.i();
        while (i == JsonToken.FIELD_NAME) {
            String f = jsonParser.f();
            JsonToken M0 = jsonParser.M0();
            SettableBeanProperty v = this.f2.v(f);
            if (v != null) {
                if (M0.isScalarValue()) {
                    dVar.f(jsonParser, deserializationContext, f, obj);
                }
                if (cls == null || v.N(cls)) {
                    try {
                        v.k(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        T0(e, obj, f, deserializationContext);
                        throw null;
                    }
                } else {
                    jsonParser.U0();
                }
            } else if (v.Z1(f, this.i2, this.j2)) {
                K0(jsonParser, deserializationContext, obj, f);
            } else if (!dVar.e(jsonParser, deserializationContext, f, obj)) {
                SettableAnyProperty settableAnyProperty = this.h2;
                if (settableAnyProperty != null) {
                    try {
                        settableAnyProperty.b(jsonParser, deserializationContext, obj, f);
                    } catch (Exception e2) {
                        T0(e2, obj, f, deserializationContext);
                        throw null;
                    }
                } else {
                    x0(jsonParser, deserializationContext, obj, f);
                }
            }
            i = jsonParser.M0();
        }
        dVar.d(jsonParser, deserializationContext, obj);
        return obj;
    }

    public Object X0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> cls;
        Object Q;
        ObjectIdReader objectIdReader = this.q2;
        if (objectIdReader != null) {
            objectIdReader.b();
        }
        if (!this.d2) {
            Object C = this.Z1.C(deserializationContext);
            jsonParser.S0(C);
            if (jsonParser.a() && (Q = jsonParser.Q()) != null) {
                B0(jsonParser, deserializationContext, C, Q);
            }
            if (this.g2 != null) {
                O0(deserializationContext, C);
            }
            if (!this.l2 || (cls = deserializationContext.Y1) == null) {
                if (jsonParser.A0(5)) {
                    String f = jsonParser.f();
                    do {
                        jsonParser.M0();
                        SettableBeanProperty v = this.f2.v(f);
                        if (v != null) {
                            try {
                                v.k(jsonParser, deserializationContext, C);
                            } catch (Exception e) {
                                T0(e, C, f, deserializationContext);
                                throw null;
                            }
                        } else {
                            N0(jsonParser, deserializationContext, C, f);
                        }
                        f = jsonParser.K0();
                    } while (f != null);
                }
                return C;
            }
            Y0(jsonParser, deserializationContext, C, cls);
            return C;
        } else if (this.o2 != null) {
            d<Object> dVar = this.a2;
            if (dVar != null) {
                return this.Z1.E(deserializationContext, dVar.d(jsonParser, deserializationContext));
            }
            PropertyBasedCreator propertyBasedCreator = this.c2;
            if (propertyBasedCreator != null) {
                g gVar = new g(jsonParser, deserializationContext, propertyBasedCreator.a, this.q2);
                r rVar = new r(jsonParser, deserializationContext);
                rVar.M0();
                JsonToken i = jsonParser.i();
                while (i == JsonToken.FIELD_NAME) {
                    String f2 = jsonParser.f();
                    jsonParser.M0();
                    SettableBeanProperty c = propertyBasedCreator.c(f2);
                    if (!gVar.d(f2) || c != null) {
                        if (c == null) {
                            SettableBeanProperty v2 = this.f2.v(f2);
                            if (v2 != null) {
                                gVar.h = new f.c(gVar.h, V0(jsonParser, deserializationContext, v2), v2);
                            } else if (v.Z1(f2, this.i2, this.j2)) {
                                K0(jsonParser, deserializationContext, this.y.c, f2);
                            } else if (this.h2 == null) {
                                rVar.k2.p(f2);
                                rVar.U0(f2);
                                rVar.i1(jsonParser);
                            } else {
                                r e1 = r.e1(jsonParser);
                                rVar.k2.p(f2);
                                rVar.U0(f2);
                                rVar.d1(e1);
                                try {
                                    SettableAnyProperty settableAnyProperty = this.h2;
                                    gVar.c(settableAnyProperty, f2, settableAnyProperty.a(e1.h1(), deserializationContext));
                                } catch (Exception e2) {
                                    T0(e2, this.y.c, f2, deserializationContext);
                                    throw null;
                                }
                            }
                        } else if (gVar.b(c, V0(jsonParser, deserializationContext, c))) {
                            JsonToken M0 = jsonParser.M0();
                            try {
                                Object a2 = propertyBasedCreator.a(deserializationContext, gVar);
                                jsonParser.S0(a2);
                                while (M0 == JsonToken.FIELD_NAME) {
                                    rVar.i1(jsonParser);
                                    M0 = jsonParser.M0();
                                }
                                JsonToken jsonToken = JsonToken.END_OBJECT;
                                if (M0 == jsonToken) {
                                    rVar.U();
                                    if (a2.getClass() == this.y.c) {
                                        this.o2.a(deserializationContext, a2, rVar);
                                        return a2;
                                    }
                                    deserializationContext.k0(c, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                                    throw null;
                                }
                                deserializationContext.q0(this, jsonToken, "Attempted to unwrap '%s' value", this.y.c.getName());
                                throw null;
                            } catch (Exception e3) {
                                U0(e3, deserializationContext);
                                throw null;
                            }
                        }
                    }
                    i = jsonParser.M0();
                }
                try {
                    Object a3 = propertyBasedCreator.a(deserializationContext, gVar);
                    this.o2.a(deserializationContext, a3, rVar);
                    return a3;
                } catch (Exception e4) {
                    U0(e4, deserializationContext);
                    throw null;
                }
            } else {
                r rVar2 = new r(jsonParser, deserializationContext);
                rVar2.M0();
                Object C2 = this.Z1.C(deserializationContext);
                jsonParser.S0(C2);
                if (this.g2 != null) {
                    O0(deserializationContext, C2);
                }
                Class<?> cls2 = this.l2 ? deserializationContext.Y1 : null;
                String f3 = jsonParser.A0(5) ? jsonParser.f() : null;
                while (f3 != null) {
                    jsonParser.M0();
                    SettableBeanProperty v3 = this.f2.v(f3);
                    if (v3 != null) {
                        if (cls2 == null || v3.N(cls2)) {
                            try {
                                v3.k(jsonParser, deserializationContext, C2);
                            } catch (Exception e5) {
                                T0(e5, C2, f3, deserializationContext);
                                throw null;
                            }
                        } else {
                            jsonParser.U0();
                        }
                    } else if (v.Z1(f3, this.i2, this.j2)) {
                        K0(jsonParser, deserializationContext, C2, f3);
                    } else if (this.h2 == null) {
                        rVar2.k2.p(f3);
                        rVar2.U0(f3);
                        rVar2.i1(jsonParser);
                    } else {
                        r e12 = r.e1(jsonParser);
                        rVar2.k2.p(f3);
                        rVar2.U0(f3);
                        rVar2.d1(e12);
                        try {
                            this.h2.b(e12.h1(), deserializationContext, C2, f3);
                        } catch (Exception e6) {
                            T0(e6, C2, f3, deserializationContext);
                            throw null;
                        }
                    }
                    f3 = jsonParser.K0();
                }
                rVar2.U();
                this.o2.a(deserializationContext, C2, rVar2);
                return C2;
            }
        } else {
            i0.f.a.c.l.m.d dVar2 = this.p2;
            if (dVar2 == null) {
                return I0(jsonParser, deserializationContext);
            }
            if (this.c2 != null) {
                i0.f.a.c.l.m.d dVar3 = new i0.f.a.c.l.m.d(dVar2);
                PropertyBasedCreator propertyBasedCreator2 = this.c2;
                g gVar2 = new g(jsonParser, deserializationContext, propertyBasedCreator2.a, this.q2);
                Class<?> cls3 = this.l2 ? deserializationContext.Y1 : null;
                JsonToken i2 = jsonParser.i();
                while (i2 == JsonToken.FIELD_NAME) {
                    String f4 = jsonParser.f();
                    JsonToken M02 = jsonParser.M0();
                    SettableBeanProperty c2 = propertyBasedCreator2.c(f4);
                    if (!gVar2.d(f4) || c2 != null) {
                        if (c2 == null) {
                            SettableBeanProperty v4 = this.f2.v(f4);
                            if (v4 != null) {
                                if (M02.isScalarValue()) {
                                    dVar3.f(jsonParser, deserializationContext, f4, (Object) null);
                                }
                                if (cls3 == null || v4.N(cls3)) {
                                    gVar2.h = new f.c(gVar2.h, v4.i(jsonParser, deserializationContext), v4);
                                } else {
                                    jsonParser.U0();
                                }
                            } else if (!dVar3.e(jsonParser, deserializationContext, f4, (Object) null)) {
                                if (v.Z1(f4, this.i2, this.j2)) {
                                    K0(jsonParser, deserializationContext, this.y.c, f4);
                                } else {
                                    SettableAnyProperty settableAnyProperty2 = this.h2;
                                    if (settableAnyProperty2 != null) {
                                        gVar2.c(settableAnyProperty2, f4, settableAnyProperty2.a(jsonParser, deserializationContext));
                                    } else {
                                        x0(jsonParser, deserializationContext, this.d, f4);
                                    }
                                }
                            }
                        } else if (!dVar3.e(jsonParser, deserializationContext, f4, (Object) null) && gVar2.b(c2, V0(jsonParser, deserializationContext, c2))) {
                            jsonParser.M0();
                            try {
                                Object a4 = propertyBasedCreator2.a(deserializationContext, gVar2);
                                Class<?> cls4 = a4.getClass();
                                JavaType javaType = this.y;
                                if (cls4 == javaType.c) {
                                    W0(jsonParser, deserializationContext, a4, dVar3);
                                    return a4;
                                }
                                deserializationContext.n(javaType, String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", new Object[]{javaType, a4.getClass()}));
                                throw null;
                            } catch (Exception e7) {
                                T0(e7, this.y.c, f4, deserializationContext);
                                throw null;
                            }
                        }
                    }
                    i2 = jsonParser.M0();
                }
                try {
                    return dVar3.c(jsonParser, deserializationContext, gVar2, propertyBasedCreator2);
                } catch (Exception e8) {
                    U0(e8, deserializationContext);
                    throw null;
                }
            } else {
                d<Object> dVar4 = this.a2;
                if (dVar4 != null) {
                    return this.Z1.E(deserializationContext, dVar4.d(jsonParser, deserializationContext));
                }
                Object C3 = this.Z1.C(deserializationContext);
                W0(jsonParser, deserializationContext, C3, new i0.f.a.c.l.m.d(this.p2));
                return C3;
            }
        }
    }

    public final Object Y0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) throws IOException {
        if (jsonParser.A0(5)) {
            String f = jsonParser.f();
            do {
                jsonParser.M0();
                SettableBeanProperty v = this.f2.v(f);
                if (v == null) {
                    N0(jsonParser, deserializationContext, obj, f);
                } else if (!v.N(cls)) {
                    jsonParser.U0();
                } else {
                    try {
                        v.k(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        T0(e, obj, f, deserializationContext);
                        throw null;
                    }
                }
                f = jsonParser.K0();
            } while (f != null);
        }
        return obj;
    }

    public final Object Z0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object C = this.Z1.C(deserializationContext);
        jsonParser.S0(C);
        if (jsonParser.A0(5)) {
            String f = jsonParser.f();
            do {
                jsonParser.M0();
                SettableBeanProperty v = this.f2.v(f);
                if (v != null) {
                    try {
                        v.k(jsonParser, deserializationContext, C);
                    } catch (Exception e) {
                        T0(e, C, f, deserializationContext);
                        throw null;
                    }
                } else {
                    N0(jsonParser, deserializationContext, C, f);
                }
                f = jsonParser.K0();
            } while (f != null);
        }
        return C;
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object G;
        Object obj;
        if (!jsonParser.I0()) {
            JsonToken i = jsonParser.i();
            if (i != null) {
                switch (i.ordinal()) {
                    case 2:
                    case 5:
                        if (this.e2) {
                            return Z0(jsonParser, deserializationContext);
                        }
                        if (this.q2 != null) {
                            return X0(jsonParser, deserializationContext);
                        }
                        return X0(jsonParser, deserializationContext);
                    case 3:
                        return I(jsonParser, deserializationContext);
                    case 6:
                        if (this.q2 != null) {
                            G = H0(jsonParser, deserializationContext);
                        } else {
                            d<Object> y0 = y0();
                            if (y0 == null || this.Z1.h()) {
                                G = jsonParser.G();
                                if (G != null && !this.y.U(G.getClass())) {
                                    JavaType javaType = this.y;
                                    Class<?> cls = javaType.c;
                                    for (i0.f.a.c.t.h hVar = deserializationContext.q.g2; hVar != null; hVar = hVar.b) {
                                        Objects.requireNonNull((e) hVar.a);
                                        Object obj2 = e.a;
                                    }
                                    throw new InvalidFormatException(deserializationContext.Z1, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", new Object[]{i0.f.a.c.t.f.E(cls), i0.f.a.c.t.f.f(G)}), G, cls);
                                }
                            } else {
                                G = this.Z1.E(deserializationContext, y0.d(jsonParser, deserializationContext));
                                if (this.g2 != null) {
                                    O0(deserializationContext, G);
                                }
                            }
                        }
                        return G;
                    case 7:
                        return J0(jsonParser, deserializationContext);
                    case 8:
                        return G0(jsonParser, deserializationContext);
                    case 9:
                        return F0(jsonParser, deserializationContext);
                    case 10:
                    case 11:
                        return E0(jsonParser, deserializationContext);
                    case 12:
                        if (jsonParser.R0()) {
                            r rVar = new r(jsonParser, deserializationContext);
                            rVar.U();
                            JsonParser g1 = rVar.g1(jsonParser);
                            g1.M0();
                            if (this.e2) {
                                JsonToken jsonToken = JsonToken.END_OBJECT;
                                obj = Z0(g1, deserializationContext);
                            } else {
                                obj = X0(g1, deserializationContext);
                            }
                            g1.close();
                            return obj;
                        }
                        JavaType javaType2 = this.q;
                        if (javaType2 == null) {
                            javaType2 = deserializationContext.q(this.d);
                        }
                        deserializationContext.T(javaType2, jsonParser);
                        throw null;
                }
            }
            JavaType javaType3 = this.q;
            if (javaType3 == null) {
                javaType3 = deserializationContext.q(this.d);
            }
            deserializationContext.T(javaType3, jsonParser);
            throw null;
        } else if (this.e2) {
            jsonParser.M0();
            return Z0(jsonParser, deserializationContext);
        } else {
            jsonParser.M0();
            if (this.q2 != null) {
                return X0(jsonParser, deserializationContext);
            }
            return X0(jsonParser, deserializationContext);
        }
    }

    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        String str;
        Class<?> cls;
        jsonParser.S0(obj);
        if (this.g2 != null) {
            O0(deserializationContext, obj);
        }
        if (this.o2 != null) {
            JsonToken i = jsonParser.i();
            if (i == JsonToken.START_OBJECT) {
                i = jsonParser.M0();
            }
            r rVar = new r(jsonParser, deserializationContext);
            rVar.M0();
            Class<?> cls2 = this.l2 ? deserializationContext.Y1 : null;
            while (i == JsonToken.FIELD_NAME) {
                String f = jsonParser.f();
                SettableBeanProperty v = this.f2.v(f);
                jsonParser.M0();
                if (v != null) {
                    if (cls2 == null || v.N(cls2)) {
                        try {
                            v.k(jsonParser, deserializationContext, obj);
                        } catch (Exception e) {
                            T0(e, obj, f, deserializationContext);
                            throw null;
                        }
                    } else {
                        jsonParser.U0();
                    }
                } else if (v.Z1(f, this.i2, this.j2)) {
                    K0(jsonParser, deserializationContext, obj, f);
                } else if (this.h2 == null) {
                    rVar.k2.p(f);
                    rVar.U0(f);
                    rVar.i1(jsonParser);
                } else {
                    r e1 = r.e1(jsonParser);
                    rVar.k2.p(f);
                    rVar.U0(f);
                    rVar.d1(e1);
                    try {
                        this.h2.b(e1.h1(), deserializationContext, obj, f);
                    } catch (Exception e2) {
                        T0(e2, obj, f, deserializationContext);
                        throw null;
                    }
                }
                i = jsonParser.M0();
            }
            rVar.U();
            this.o2.a(deserializationContext, obj, rVar);
            return obj;
        }
        i0.f.a.c.l.m.d dVar = this.p2;
        if (dVar != null) {
            W0(jsonParser, deserializationContext, obj, new i0.f.a.c.l.m.d(dVar));
            return obj;
        }
        if (jsonParser.I0()) {
            str = jsonParser.K0();
            if (str == null) {
                return obj;
            }
        } else if (!jsonParser.A0(5)) {
            return obj;
        } else {
            str = jsonParser.f();
        }
        if (!this.l2 || (cls = deserializationContext.Y1) == null) {
            do {
                jsonParser.M0();
                SettableBeanProperty v2 = this.f2.v(str);
                if (v2 != null) {
                    try {
                        v2.k(jsonParser, deserializationContext, obj);
                    } catch (Exception e3) {
                        T0(e3, obj, str, deserializationContext);
                        throw null;
                    }
                } else {
                    N0(jsonParser, deserializationContext, obj, str);
                }
                str = jsonParser.K0();
            } while (str != null);
            return obj;
        }
        Y0(jsonParser, deserializationContext, obj, cls);
        return obj;
    }

    public d<Object> w(NameTransformer nameTransformer) {
        if (getClass() != BeanDeserializer.class || this.s2 == nameTransformer) {
            return this;
        }
        this.s2 = nameTransformer;
        try {
            return new BeanDeserializer((BeanDeserializerBase) this, nameTransformer);
        } finally {
            this.s2 = null;
        }
    }

    public Object z0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        PropertyBasedCreator propertyBasedCreator = this.c2;
        g gVar = new g(jsonParser, deserializationContext, propertyBasedCreator.a, this.q2);
        Class<?> cls = this.l2 ? deserializationContext.Y1 : null;
        JsonToken i = jsonParser.i();
        ArrayList<a> arrayList = null;
        r rVar = null;
        while (i == JsonToken.FIELD_NAME) {
            String f = jsonParser.f();
            jsonParser.M0();
            SettableBeanProperty c = propertyBasedCreator.c(f);
            if (!gVar.d(f) || c != null) {
                if (c == null) {
                    SettableBeanProperty v = this.f2.v(f);
                    if (v != null) {
                        try {
                            gVar.h = new f.c(gVar.h, V0(jsonParser, deserializationContext, v), v);
                        } catch (UnresolvedForwardReference e) {
                            a aVar = new a(deserializationContext, e, v.y, v);
                            e.x.a(aVar);
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                            }
                            arrayList.add(aVar);
                        }
                    } else if (v.Z1(f, this.i2, this.j2)) {
                        K0(jsonParser, deserializationContext, this.y.c, f);
                    } else {
                        SettableAnyProperty settableAnyProperty = this.h2;
                        if (settableAnyProperty != null) {
                            try {
                                gVar.c(settableAnyProperty, f, settableAnyProperty.a(jsonParser, deserializationContext));
                            } catch (Exception e2) {
                                T0(e2, this.y.c, f, deserializationContext);
                                throw null;
                            }
                        } else {
                            if (rVar == null) {
                                rVar = new r(jsonParser, deserializationContext);
                            }
                            rVar.k2.p(f);
                            rVar.U0(f);
                            rVar.i1(jsonParser);
                        }
                    }
                } else if (cls != null && !c.N(cls)) {
                    jsonParser.U0();
                } else if (gVar.b(c, V0(jsonParser, deserializationContext, c))) {
                    jsonParser.M0();
                    try {
                        Object a2 = propertyBasedCreator.a(deserializationContext, gVar);
                        if (a2 == null) {
                            Class<?> cls2 = this.y.c;
                            if (this.r2 == null) {
                                this.r2 = new NullPointerException("JSON Creator returned null");
                            }
                            deserializationContext.N(cls2, (Object) null, this.r2);
                            throw null;
                        }
                        jsonParser.S0(a2);
                        if (a2.getClass() != this.y.c) {
                            return L0(jsonParser, deserializationContext, a2, rVar);
                        }
                        if (rVar != null) {
                            M0(deserializationContext, a2, rVar);
                        }
                        return e(jsonParser, deserializationContext, a2);
                    } catch (Exception e3) {
                        U0(e3, deserializationContext);
                        throw null;
                    }
                }
            }
            i = jsonParser.M0();
        }
        try {
            Object a3 = propertyBasedCreator.a(deserializationContext, gVar);
            if (this.g2 != null) {
                O0(deserializationContext, a3);
            }
            if (arrayList != null) {
                for (a aVar2 : arrayList) {
                    aVar2.e = a3;
                }
            }
            if (rVar != null) {
                if (a3.getClass() != this.y.c) {
                    return L0((JsonParser) null, deserializationContext, a3, rVar);
                }
                M0(deserializationContext, a3, rVar);
            }
            return a3;
        } catch (Exception e4) {
            U0(e4, deserializationContext);
            throw null;
        }
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase) {
        super(beanDeserializerBase, beanDeserializerBase.k2);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, boolean z) {
        super(beanDeserializerBase, z);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase, nameTransformer);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase, objectIdReader);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, Set<String> set, Set<String> set2) {
        super(beanDeserializerBase, set, set2);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase, beanPropertyMap);
    }
}
