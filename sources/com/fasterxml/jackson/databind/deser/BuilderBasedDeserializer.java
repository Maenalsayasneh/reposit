package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.NameTransformer;
import h0.b0.v;
import i0.f.a.c.b;
import i0.f.a.c.d;
import i0.f.a.c.l.a;
import i0.f.a.c.l.m.f;
import i0.f.a.c.l.m.g;
import i0.f.a.c.t.r;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class BuilderBasedDeserializer extends BeanDeserializerBase {
    public final AnnotatedMethod r2;
    public final JavaType s2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuilderBasedDeserializer(a aVar, b bVar, JavaType javaType, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, Set<String> set2, boolean z2) {
        super(aVar, bVar, beanPropertyMap, map, set, z, set2, z2);
        this.s2 = javaType;
        this.r2 = aVar.m;
        if (this.q2 != null) {
            StringBuilder P0 = i0.d.a.a.a.P0("Cannot use Object Id with Builder-based deserialization (type ");
            P0.append(bVar.a);
            P0.append(")");
            throw new IllegalArgumentException(P0.toString());
        }
    }

    public BeanDeserializerBase D0() {
        return new BeanAsArrayBuilderDeserializer(this, this.s2, this.f2.Y1, this.r2);
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
        return Z0(deserializationContext, A);
    }

    public BeanDeserializerBase P0(BeanPropertyMap beanPropertyMap) {
        return new BuilderBasedDeserializer(this, beanPropertyMap);
    }

    public BeanDeserializerBase Q0(Set<String> set, Set<String> set2) {
        return new BuilderBasedDeserializer(this, set, set2);
    }

    public BeanDeserializerBase R0(boolean z) {
        return new BuilderBasedDeserializer(this, z);
    }

    public BeanDeserializerBase S0(ObjectIdReader objectIdReader) {
        return new BuilderBasedDeserializer(this, objectIdReader);
    }

    public Object V0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> cls;
        if (!this.d2) {
            Object C = this.Z1.C(deserializationContext);
            if (this.g2 != null) {
                O0(deserializationContext, C);
            }
            if (this.l2 && (cls = deserializationContext.Y1) != null) {
                return Y0(jsonParser, deserializationContext, C, cls);
            }
            while (jsonParser.i() == JsonToken.FIELD_NAME) {
                String f = jsonParser.f();
                jsonParser.M0();
                SettableBeanProperty v = this.f2.v(f);
                if (v != null) {
                    try {
                        C = v.l(jsonParser, deserializationContext, C);
                    } catch (Exception e) {
                        T0(e, C, f, deserializationContext);
                        throw null;
                    }
                } else {
                    N0(jsonParser, deserializationContext, C, f);
                }
                jsonParser.M0();
            }
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
                                gVar.h = new f.c(gVar.h, v2.i(jsonParser, deserializationContext), v2);
                            } else if (v.Z1(f2, this.i2, this.j2)) {
                                K0(jsonParser, deserializationContext, this.y.c, f2);
                            } else {
                                rVar.k2.p(f2);
                                rVar.U0(f2);
                                rVar.i1(jsonParser);
                                SettableAnyProperty settableAnyProperty = this.h2;
                                if (settableAnyProperty != null) {
                                    gVar.c(settableAnyProperty, f2, settableAnyProperty.a(jsonParser, deserializationContext));
                                }
                            }
                        } else if (gVar.b(c, c.i(jsonParser, deserializationContext))) {
                            jsonParser.M0();
                            try {
                                Object a = propertyBasedCreator.a(deserializationContext, gVar);
                                if (a.getClass() != this.y.c) {
                                    return L0(jsonParser, deserializationContext, a, rVar);
                                }
                                return X0(jsonParser, deserializationContext, a, rVar);
                            } catch (Exception e2) {
                                T0(e2, this.y.c, f2, deserializationContext);
                                throw null;
                            }
                        }
                    }
                    i = jsonParser.M0();
                }
                rVar.U();
                try {
                    Object a2 = propertyBasedCreator.a(deserializationContext, gVar);
                    this.o2.a(deserializationContext, a2, rVar);
                    return a2;
                } catch (Exception e3) {
                    U0(e3, deserializationContext);
                    throw null;
                }
            } else {
                r rVar2 = new r(jsonParser, deserializationContext);
                rVar2.M0();
                Object C2 = this.Z1.C(deserializationContext);
                if (this.g2 != null) {
                    O0(deserializationContext, C2);
                }
                Class<?> cls2 = this.l2 ? deserializationContext.Y1 : null;
                while (jsonParser.i() == JsonToken.FIELD_NAME) {
                    String f3 = jsonParser.f();
                    jsonParser.M0();
                    SettableBeanProperty v3 = this.f2.v(f3);
                    if (v3 != null) {
                        if (cls2 == null || v3.N(cls2)) {
                            try {
                                C2 = v3.l(jsonParser, deserializationContext, C2);
                            } catch (Exception e4) {
                                T0(e4, C2, f3, deserializationContext);
                                throw null;
                            }
                        } else {
                            jsonParser.U0();
                        }
                    } else if (v.Z1(f3, this.i2, this.j2)) {
                        K0(jsonParser, deserializationContext, C2, f3);
                    } else {
                        rVar2.k2.p(f3);
                        rVar2.U0(f3);
                        rVar2.i1(jsonParser);
                        SettableAnyProperty settableAnyProperty2 = this.h2;
                        if (settableAnyProperty2 != null) {
                            try {
                                settableAnyProperty2.b(jsonParser, deserializationContext, C2, f3);
                            } catch (Exception e5) {
                                T0(e5, C2, f3, deserializationContext);
                                throw null;
                            }
                        }
                    }
                    jsonParser.M0();
                }
                rVar2.U();
                this.o2.a(deserializationContext, C2, rVar2);
                return C2;
            }
        } else if (this.p2 == null) {
            return I0(jsonParser, deserializationContext);
        } else {
            if (this.c2 == null) {
                return W0(jsonParser, deserializationContext, this.Z1.C(deserializationContext));
            }
            JavaType javaType = this.s2;
            deserializationContext.n(javaType, String.format("Deserialization (of %s) with Builder, External type id, @JsonCreator not yet implemented", new Object[]{javaType}));
            throw null;
        }
    }

    public Object W0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Class<?> cls = this.l2 ? deserializationContext.Y1 : null;
        i0.f.a.c.l.m.d dVar = new i0.f.a.c.l.m.d(this.p2);
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
                        obj = v.l(jsonParser, deserializationContext, obj);
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

    public Object X0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, r rVar) throws IOException {
        Class<?> cls = this.l2 ? deserializationContext.Y1 : null;
        JsonToken i = jsonParser.i();
        while (i == JsonToken.FIELD_NAME) {
            String f = jsonParser.f();
            SettableBeanProperty v = this.f2.v(f);
            jsonParser.M0();
            if (v != null) {
                if (cls == null || v.N(cls)) {
                    try {
                        obj = v.l(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        T0(e, obj, f, deserializationContext);
                        throw null;
                    }
                } else {
                    jsonParser.U0();
                }
            } else if (v.Z1(f, this.i2, this.j2)) {
                K0(jsonParser, deserializationContext, obj, f);
            } else {
                rVar.k2.p(f);
                rVar.U0(f);
                rVar.i1(jsonParser);
                SettableAnyProperty settableAnyProperty = this.h2;
                if (settableAnyProperty != null) {
                    settableAnyProperty.b(jsonParser, deserializationContext, obj, f);
                }
            }
            i = jsonParser.M0();
        }
        rVar.U();
        this.o2.a(deserializationContext, obj, rVar);
        return obj;
    }

    public final Object Y0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) throws IOException {
        JsonToken i = jsonParser.i();
        while (i == JsonToken.FIELD_NAME) {
            String f = jsonParser.f();
            jsonParser.M0();
            SettableBeanProperty v = this.f2.v(f);
            if (v == null) {
                N0(jsonParser, deserializationContext, obj, f);
            } else if (!v.N(cls)) {
                jsonParser.U0();
            } else {
                try {
                    obj = v.l(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    T0(e, obj, f, deserializationContext);
                    throw null;
                }
            }
            i = jsonParser.M0();
        }
        return obj;
    }

    public Object Z0(DeserializationContext deserializationContext, Object obj) throws IOException {
        AnnotatedMethod annotatedMethod = this.r2;
        if (annotatedMethod == null) {
            return obj;
        }
        try {
            return annotatedMethod.x.invoke(obj, (Object[]) null);
        } catch (Exception e) {
            U0(e, deserializationContext);
            throw null;
        }
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.I0()) {
            jsonParser.M0();
            if (!this.e2) {
                return Z0(deserializationContext, V0(jsonParser, deserializationContext));
            }
            Object C = this.Z1.C(deserializationContext);
            while (jsonParser.i() == JsonToken.FIELD_NAME) {
                String f = jsonParser.f();
                jsonParser.M0();
                SettableBeanProperty v = this.f2.v(f);
                if (v != null) {
                    try {
                        C = v.l(jsonParser, deserializationContext, C);
                    } catch (Exception e) {
                        T0(e, C, f, deserializationContext);
                        throw null;
                    }
                } else {
                    N0(jsonParser, deserializationContext, C, f);
                }
                jsonParser.M0();
            }
            return Z0(deserializationContext, C);
        }
        switch (jsonParser.k()) {
            case 2:
            case 5:
                return Z0(deserializationContext, V0(jsonParser, deserializationContext));
            case 3:
                return I(jsonParser, deserializationContext);
            case 6:
                return Z0(deserializationContext, J0(jsonParser, deserializationContext));
            case 7:
                return Z0(deserializationContext, G0(jsonParser, deserializationContext));
            case 8:
                return Z0(deserializationContext, F0(jsonParser, deserializationContext));
            case 9:
            case 10:
                return Z0(deserializationContext, E0(jsonParser, deserializationContext));
            case 12:
                return jsonParser.G();
            default:
                JavaType javaType = this.q;
                if (javaType == null) {
                    javaType = deserializationContext.q(this.d);
                }
                deserializationContext.T(javaType, jsonParser);
                throw null;
        }
    }

    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        JavaType javaType = this.s2;
        Class<?> cls = this.y.c;
        Class<?> cls2 = obj.getClass();
        if (cls.isAssignableFrom(cls2)) {
            deserializationContext.n(javaType, String.format("Deserialization of %s by passing existing Builder (%s) instance not supported", new Object[]{javaType, cls.getName()}));
            throw null;
        }
        deserializationContext.n(javaType, String.format("Deserialization of %s by passing existing instance (of %s) not supported", new Object[]{javaType, cls2.getName()}));
        throw null;
    }

    public Boolean v(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public d<Object> w(NameTransformer nameTransformer) {
        return new BuilderBasedDeserializer(this, nameTransformer);
    }

    public Object z0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> cls;
        PropertyBasedCreator propertyBasedCreator = this.c2;
        g gVar = new g(jsonParser, deserializationContext, propertyBasedCreator.a, this.q2);
        Class<?> cls2 = this.l2 ? deserializationContext.Y1 : null;
        JsonToken i = jsonParser.i();
        r rVar = null;
        while (i == JsonToken.FIELD_NAME) {
            String f = jsonParser.f();
            jsonParser.M0();
            SettableBeanProperty c = propertyBasedCreator.c(f);
            if (!gVar.d(f) || c != null) {
                if (c == null) {
                    SettableBeanProperty v = this.f2.v(f);
                    if (v != null) {
                        gVar.h = new f.c(gVar.h, v.i(jsonParser, deserializationContext), v);
                    } else if (v.Z1(f, this.i2, this.j2)) {
                        K0(jsonParser, deserializationContext, this.y.c, f);
                    } else {
                        SettableAnyProperty settableAnyProperty = this.h2;
                        if (settableAnyProperty != null) {
                            gVar.c(settableAnyProperty, f, settableAnyProperty.a(jsonParser, deserializationContext));
                        } else {
                            if (rVar == null) {
                                rVar = new r(jsonParser, deserializationContext);
                            }
                            rVar.k2.p(f);
                            rVar.U0(f);
                            rVar.i1(jsonParser);
                        }
                    }
                } else if (cls2 != null && !c.N(cls2)) {
                    jsonParser.U0();
                } else if (gVar.b(c, c.i(jsonParser, deserializationContext))) {
                    jsonParser.M0();
                    try {
                        Object a = propertyBasedCreator.a(deserializationContext, gVar);
                        if (a.getClass() != this.y.c) {
                            return L0(jsonParser, deserializationContext, a, rVar);
                        }
                        if (rVar != null) {
                            M0(deserializationContext, a, rVar);
                        }
                        if (this.g2 != null) {
                            O0(deserializationContext, a);
                        }
                        if (this.o2 != null) {
                            if (jsonParser.y0(JsonToken.START_OBJECT)) {
                                jsonParser.M0();
                            }
                            r rVar2 = new r(jsonParser, deserializationContext);
                            rVar2.M0();
                            return X0(jsonParser, deserializationContext, a, rVar2);
                        } else if (this.p2 != null) {
                            return W0(jsonParser, deserializationContext, a);
                        } else {
                            if (this.l2 && (cls = deserializationContext.Y1) != null) {
                                return Y0(jsonParser, deserializationContext, a, cls);
                            }
                            JsonToken i2 = jsonParser.i();
                            if (i2 == JsonToken.START_OBJECT) {
                                i2 = jsonParser.M0();
                            }
                            while (i2 == JsonToken.FIELD_NAME) {
                                String f2 = jsonParser.f();
                                jsonParser.M0();
                                SettableBeanProperty v2 = this.f2.v(f2);
                                if (v2 != null) {
                                    try {
                                        a = v2.l(jsonParser, deserializationContext, a);
                                    } catch (Exception e) {
                                        T0(e, a, f2, deserializationContext);
                                        throw null;
                                    }
                                } else {
                                    N0(jsonParser, deserializationContext, a, f2);
                                }
                                i2 = jsonParser.M0();
                            }
                            return a;
                        }
                    } catch (Exception e2) {
                        T0(e2, this.y.c, f, deserializationContext);
                        throw null;
                    }
                }
            }
            i = jsonParser.M0();
        }
        try {
            Object a2 = propertyBasedCreator.a(deserializationContext, gVar);
            if (rVar != null) {
                if (a2.getClass() != this.y.c) {
                    return L0((JsonParser) null, deserializationContext, a2, rVar);
                }
                M0(deserializationContext, a2, rVar);
            }
            return a2;
        } catch (Exception e3) {
            U0(e3, deserializationContext);
            throw null;
        }
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, boolean z) {
        super((BeanDeserializerBase) builderBasedDeserializer, z);
        this.r2 = builderBasedDeserializer.r2;
        this.s2 = builderBasedDeserializer.s2;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, NameTransformer nameTransformer) {
        super((BeanDeserializerBase) builderBasedDeserializer, nameTransformer);
        this.r2 = builderBasedDeserializer.r2;
        this.s2 = builderBasedDeserializer.s2;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, ObjectIdReader objectIdReader) {
        super((BeanDeserializerBase) builderBasedDeserializer, objectIdReader);
        this.r2 = builderBasedDeserializer.r2;
        this.s2 = builderBasedDeserializer.s2;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, Set<String> set, Set<String> set2) {
        super(builderBasedDeserializer, set, set2);
        this.r2 = builderBasedDeserializer.r2;
        this.s2 = builderBasedDeserializer.s2;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, BeanPropertyMap beanPropertyMap) {
        super((BeanDeserializerBase) builderBasedDeserializer, beanPropertyMap);
        this.r2 = builderBasedDeserializer.r2;
        this.s2 = builderBasedDeserializer.s2;
    }
}
