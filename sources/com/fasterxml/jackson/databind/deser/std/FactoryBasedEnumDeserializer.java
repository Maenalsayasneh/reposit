package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.type.LogicalType;
import i0.f.a.c.d;
import i0.f.a.c.l.c;
import i0.f.a.c.l.m.g;
import i0.f.a.c.p.b;
import i0.f.a.c.t.f;
import java.io.IOException;

public class FactoryBasedEnumDeserializer extends StdDeserializer<Object> implements c {
    public final AnnotatedMethod Y1;
    public final d<?> Z1;
    public final ValueInstantiator a2;
    public final SettableBeanProperty[] b2;
    public transient PropertyBasedCreator c2;
    public final JavaType x;
    public final boolean y;

    public FactoryBasedEnumDeserializer(Class<?> cls, AnnotatedMethod annotatedMethod, JavaType javaType, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        super(cls);
        this.Y1 = annotatedMethod;
        boolean z = true;
        this.y = true;
        this.x = javaType.c != String.class ? false : z ? null : javaType;
        this.Z1 = null;
        this.a2 = valueInstantiator;
        this.b2 = settableBeanPropertyArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.x;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.d<?> a(com.fasterxml.jackson.databind.DeserializationContext r3, com.fasterxml.jackson.databind.BeanProperty r4) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r2 = this;
            i0.f.a.c.d<?> r0 = r2.Z1
            if (r0 != 0) goto L_0x0016
            com.fasterxml.jackson.databind.JavaType r0 = r2.x
            if (r0 == 0) goto L_0x0016
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r1 = r2.b2
            if (r1 != 0) goto L_0x0016
            com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer r1 = new com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer
            i0.f.a.c.d r3 = r3.y(r0, r4)
            r1.<init>((com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer) r2, (i0.f.a.c.d<?>) r3)
            return r1
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer.a(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):i0.f.a.c.d");
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj;
        d<?> dVar = this.Z1;
        boolean z = true;
        if (dVar != null) {
            obj = dVar.d(jsonParser, deserializationContext);
        } else if (this.y) {
            JsonToken i = jsonParser.i();
            if (this.b2 != null) {
                if (!jsonParser.I0()) {
                    JavaType javaType = this.q;
                    if (javaType == null) {
                        javaType = deserializationContext.q(this.d);
                    }
                    deserializationContext.l0(javaType, "Input mismatch reading Enum %s: properties-based `@JsonCreator` (%s) expects JSON Object (JsonToken.START_OBJECT), got JsonToken.%s", f.t(javaType), this.Y1, jsonParser.i());
                    throw null;
                }
                if (this.c2 == null) {
                    this.c2 = PropertyBasedCreator.b(deserializationContext, this.a2, this.b2, deserializationContext.e0(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                }
                jsonParser.M0();
                PropertyBasedCreator propertyBasedCreator = this.c2;
                g gVar = new g(jsonParser, deserializationContext, propertyBasedCreator.a, (ObjectIdReader) null);
                JsonToken i2 = jsonParser.i();
                while (i2 == JsonToken.FIELD_NAME) {
                    String f = jsonParser.f();
                    jsonParser.M0();
                    SettableBeanProperty c = propertyBasedCreator.c(f);
                    if ((!gVar.d(f) || c != null) && c != null) {
                        try {
                            gVar.b(c, c.i(jsonParser, deserializationContext));
                        } catch (Exception e) {
                            Class<?> cls = this.d;
                            String str = c.x.q;
                            Throwable s = f.s(e);
                            f.I(s);
                            if (deserializationContext != null && !deserializationContext.d0(DeserializationFeature.WRAP_EXCEPTIONS)) {
                                z = false;
                            }
                            if (s instanceof IOException) {
                                if (!z || !(s instanceof JsonProcessingException)) {
                                    throw ((IOException) s);
                                }
                            } else if (!z) {
                                f.K(s);
                            }
                            throw JsonMappingException.k(s, cls, str);
                        }
                    }
                    i2 = jsonParser.M0();
                }
                return propertyBasedCreator.a(deserializationContext, gVar);
            } else if (i == JsonToken.VALUE_STRING || i == JsonToken.FIELD_NAME) {
                obj = jsonParser.Z();
            } else if (i == JsonToken.VALUE_NUMBER_INT) {
                obj = jsonParser.N();
            } else {
                obj = jsonParser.r0();
            }
        } else {
            jsonParser.U0();
            try {
                return this.Y1.x.invoke((Object) null, new Object[0]);
            } catch (Exception e2) {
                Throwable s2 = f.s(e2);
                f.J(s2);
                deserializationContext.N(this.d, (Object) null, s2);
                throw null;
            }
        }
        try {
            return this.Y1.x.invoke(this.d, new Object[]{obj});
        } catch (Exception e3) {
            Throwable s3 = f.s(e3);
            f.J(s3);
            if (deserializationContext.d0(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL) && (s3 instanceof IllegalArgumentException)) {
                return null;
            }
            deserializationContext.N(this.d, obj, s3);
            throw null;
        }
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        if (this.Z1 == null) {
            return d(jsonParser, deserializationContext);
        }
        return bVar.b(jsonParser, deserializationContext);
    }

    public boolean p() {
        return true;
    }

    public LogicalType q() {
        return LogicalType.Enum;
    }

    public ValueInstantiator u0() {
        return this.a2;
    }

    public Boolean v(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public FactoryBasedEnumDeserializer(Class<?> cls, AnnotatedMethod annotatedMethod) {
        super(cls);
        this.Y1 = annotatedMethod;
        this.y = false;
        this.x = null;
        this.Z1 = null;
        this.a2 = null;
        this.b2 = null;
    }

    public FactoryBasedEnumDeserializer(FactoryBasedEnumDeserializer factoryBasedEnumDeserializer, d<?> dVar) {
        super(factoryBasedEnumDeserializer.d);
        this.x = factoryBasedEnumDeserializer.x;
        this.Y1 = factoryBasedEnumDeserializer.Y1;
        this.y = factoryBasedEnumDeserializer.y;
        this.a2 = factoryBasedEnumDeserializer.a2;
        this.b2 = factoryBasedEnumDeserializer.b2;
        this.Z1 = dVar;
    }
}
