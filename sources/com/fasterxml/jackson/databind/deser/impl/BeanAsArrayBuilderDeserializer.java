package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.NameTransformer;
import i0.f.a.c.d;
import i0.f.a.c.l.m.f;
import i0.f.a.c.l.m.g;
import java.io.IOException;
import java.util.Set;

public class BeanAsArrayBuilderDeserializer extends BeanDeserializerBase {
    public final BeanDeserializerBase r2;
    public final SettableBeanProperty[] s2;
    public final AnnotatedMethod t2;
    public final JavaType u2;

    public BeanAsArrayBuilderDeserializer(BeanDeserializerBase beanDeserializerBase, JavaType javaType, SettableBeanProperty[] settableBeanPropertyArr, AnnotatedMethod annotatedMethod) {
        super(beanDeserializerBase, beanDeserializerBase.k2);
        this.r2 = beanDeserializerBase;
        this.u2 = javaType;
        this.s2 = settableBeanPropertyArr;
        this.t2 = annotatedMethod;
    }

    public BeanDeserializerBase D0() {
        return this;
    }

    public BeanDeserializerBase P0(BeanPropertyMap beanPropertyMap) {
        return new BeanAsArrayBuilderDeserializer(this.r2.P0(beanPropertyMap), this.u2, this.s2, this.t2);
    }

    public BeanDeserializerBase Q0(Set<String> set, Set<String> set2) {
        return new BeanAsArrayBuilderDeserializer(this.r2.Q0(set, set2), this.u2, this.s2, this.t2);
    }

    public BeanDeserializerBase R0(boolean z) {
        return new BeanAsArrayBuilderDeserializer(this.r2.R0(z), this.u2, this.s2, this.t2);
    }

    public BeanDeserializerBase S0(ObjectIdReader objectIdReader) {
        return new BeanAsArrayBuilderDeserializer(this.r2.S0(objectIdReader), this.u2, this.s2, this.t2);
    }

    public Object V0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JavaType javaType = this.q;
        if (javaType == null) {
            javaType = deserializationContext.q(this.d);
        }
        DeserializationContext deserializationContext2 = deserializationContext;
        deserializationContext2.U(javaType, jsonParser.i(), jsonParser, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", this.y.c.getName(), jsonParser.i());
        throw null;
    }

    public final Object W0(DeserializationContext deserializationContext, Object obj) throws IOException {
        try {
            return this.t2.x.invoke(obj, (Object[]) null);
        } catch (Exception e) {
            U0(e, deserializationContext);
            throw null;
        }
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj;
        if (!jsonParser.F0()) {
            V0(jsonParser, deserializationContext);
            throw null;
        } else if (!this.e2) {
            if (this.d2) {
                obj = I0(jsonParser, deserializationContext);
            } else {
                Object C = this.Z1.C(deserializationContext);
                if (this.g2 != null) {
                    O0(deserializationContext, C);
                }
                Class<?> cls = this.l2 ? deserializationContext.Y1 : null;
                SettableBeanProperty[] settableBeanPropertyArr = this.s2;
                int length = settableBeanPropertyArr.length;
                int i = 0;
                while (true) {
                    JsonToken M0 = jsonParser.M0();
                    JsonToken jsonToken = JsonToken.END_ARRAY;
                    if (M0 == jsonToken) {
                        break;
                    } else if (i != length) {
                        SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                        i++;
                        if (settableBeanProperty == null || (cls != null && !settableBeanProperty.N(cls))) {
                            jsonParser.U0();
                        } else {
                            try {
                                settableBeanProperty.l(jsonParser, deserializationContext, C);
                            } catch (Exception e) {
                                T0(e, C, settableBeanProperty.x.q, deserializationContext);
                                throw null;
                            }
                        }
                    } else if (this.k2 || !deserializationContext.d0(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                        while (jsonParser.M0() != JsonToken.END_ARRAY) {
                            jsonParser.U0();
                        }
                    } else {
                        deserializationContext.q0(this, jsonToken, "Unexpected JSON value(s); expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                        throw null;
                    }
                }
                obj = C;
            }
            return W0(deserializationContext, obj);
        } else {
            Object C2 = this.Z1.C(deserializationContext);
            SettableBeanProperty[] settableBeanPropertyArr2 = this.s2;
            int length2 = settableBeanPropertyArr2.length;
            int i2 = 0;
            while (jsonParser.M0() != JsonToken.END_ARRAY) {
                if (i2 != length2) {
                    SettableBeanProperty settableBeanProperty2 = settableBeanPropertyArr2[i2];
                    if (settableBeanProperty2 != null) {
                        try {
                            C2 = settableBeanProperty2.l(jsonParser, deserializationContext, C2);
                        } catch (Exception e2) {
                            T0(e2, C2, settableBeanProperty2.x.q, deserializationContext);
                            throw null;
                        }
                    } else {
                        jsonParser.U0();
                    }
                    i2++;
                } else if (this.k2 || !deserializationContext.d0(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    while (jsonParser.M0() != JsonToken.END_ARRAY) {
                        jsonParser.U0();
                    }
                    return W0(deserializationContext, C2);
                } else {
                    deserializationContext.n0(this.y.c, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length2));
                    throw null;
                }
            }
            return W0(deserializationContext, C2);
        }
    }

    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return this.r2.e(jsonParser, deserializationContext, obj);
    }

    public Boolean v(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public d<Object> w(NameTransformer nameTransformer) {
        return this.r2.w(nameTransformer);
    }

    public final Object z0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        PropertyBasedCreator propertyBasedCreator = this.c2;
        g gVar = new g(jsonParser, deserializationContext, propertyBasedCreator.a, this.q2);
        SettableBeanProperty[] settableBeanPropertyArr = this.s2;
        int length = settableBeanPropertyArr.length;
        Class<?> cls = this.l2 ? deserializationContext.Y1 : null;
        Object obj = null;
        int i = 0;
        while (jsonParser.M0() != JsonToken.END_ARRAY) {
            SettableBeanProperty settableBeanProperty = i < length ? settableBeanPropertyArr[i] : null;
            if (settableBeanProperty == null) {
                jsonParser.U0();
            } else if (cls != null && !settableBeanProperty.N(cls)) {
                jsonParser.U0();
            } else if (obj != null) {
                try {
                    obj = settableBeanProperty.l(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    T0(e, obj, settableBeanProperty.x.q, deserializationContext);
                    throw null;
                }
            } else {
                String str = settableBeanProperty.x.q;
                SettableBeanProperty c = propertyBasedCreator.c(str);
                if (!gVar.d(str) || c != null) {
                    if (c == null) {
                        gVar.h = new f.c(gVar.h, settableBeanProperty.i(jsonParser, deserializationContext), settableBeanProperty);
                    } else if (gVar.b(c, c.i(jsonParser, deserializationContext))) {
                        try {
                            obj = propertyBasedCreator.a(deserializationContext, gVar);
                            Class<?> cls2 = obj.getClass();
                            JavaType javaType = this.y;
                            if (cls2 != javaType.c) {
                                deserializationContext.n(javaType, String.format("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", new Object[]{i0.f.a.c.t.f.t(javaType), obj.getClass().getName()}));
                                throw null;
                            }
                        } catch (Exception e2) {
                            T0(e2, this.y.c, str, deserializationContext);
                            throw null;
                        }
                    } else {
                        continue;
                    }
                }
            }
            i++;
        }
        if (obj != null) {
            return obj;
        }
        try {
            return propertyBasedCreator.a(deserializationContext, gVar);
        } catch (Exception e3) {
            U0(e3, deserializationContext);
            throw null;
        }
    }
}
