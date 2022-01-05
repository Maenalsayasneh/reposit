package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import i0.f.a.b.m.h;
import i0.f.a.c.d;
import i0.f.a.c.l.e;
import i0.f.a.c.p.b;
import i0.f.a.c.p.c;
import i0.f.a.c.t.r;
import java.io.IOException;
import java.util.Objects;

public class AsPropertyTypeDeserializer extends AsArrayTypeDeserializer {
    public final JsonTypeInfo.As b2;
    public final String c2;

    public AsPropertyTypeDeserializer(JavaType javaType, c cVar, String str, boolean z, JavaType javaType2, JsonTypeInfo.As as) {
        super(javaType, cVar, str, z, javaType2);
        this.c2 = String.format("missing type id property '%s'", new Object[]{this.y});
        this.b2 = as;
    }

    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.y0(JsonToken.START_ARRAY)) {
            return v(jsonParser, deserializationContext);
        }
        return d(jsonParser, deserializationContext);
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object g02;
        if (jsonParser.b() && (g02 = jsonParser.g0()) != null) {
            return m(jsonParser, deserializationContext, g02);
        }
        JsonToken i = jsonParser.i();
        r rVar = null;
        if (i == JsonToken.START_OBJECT) {
            i = jsonParser.M0();
        } else if (i != JsonToken.FIELD_NAME) {
            return x(jsonParser, deserializationContext, (r) null, this.c2);
        }
        boolean e0 = deserializationContext.e0(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (i == JsonToken.FIELD_NAME) {
            String f = jsonParser.f();
            jsonParser.M0();
            if (f.equals(this.y) || (e0 && f.equalsIgnoreCase(this.y))) {
                return w(jsonParser, deserializationContext, rVar, jsonParser.Z());
            }
            if (rVar == null) {
                rVar = new r(jsonParser, deserializationContext);
            }
            rVar.k2.p(f);
            rVar.U0(f);
            rVar.i1(jsonParser);
            i = jsonParser.M0();
        }
        return x(jsonParser, deserializationContext, rVar, this.c2);
    }

    public b f(BeanProperty beanProperty) {
        return beanProperty == this.q ? this : new AsPropertyTypeDeserializer(this, beanProperty);
    }

    public JsonTypeInfo.As k() {
        return this.b2;
    }

    public Object w(JsonParser jsonParser, DeserializationContext deserializationContext, r rVar, String str) throws IOException {
        d<Object> p = p(deserializationContext, str);
        if (this.Y1) {
            if (rVar == null) {
                rVar = new r(jsonParser, deserializationContext);
            }
            rVar.b0(jsonParser.f());
            rVar.Q0(str);
        }
        if (rVar != null) {
            jsonParser.e();
            jsonParser = h.W0(false, rVar.g1(jsonParser), jsonParser);
        }
        jsonParser.M0();
        return p.d(jsonParser, deserializationContext);
    }

    public Object x(JsonParser jsonParser, DeserializationContext deserializationContext, r rVar, String str) throws IOException {
        if (!(this.x != null)) {
            Object a = b.a(jsonParser, deserializationContext, this.d);
            if (a != null) {
                return a;
            }
            if (jsonParser.F0()) {
                return v(jsonParser, deserializationContext);
            }
            if (jsonParser.y0(JsonToken.VALUE_STRING) && deserializationContext.d0(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.Z().trim().isEmpty()) {
                return null;
            }
        }
        d<Object> n = n(deserializationContext);
        if (n == null) {
            JavaType javaType = this.d;
            for (i0.f.a.c.t.h hVar = deserializationContext.q.g2; hVar != null; hVar = hVar.b) {
                Objects.requireNonNull((e) hVar.a);
            }
            throw new InvalidTypeIdException(deserializationContext.Z1, deserializationContext.a(String.format("Could not resolve subtype of %s", new Object[]{javaType}), str), javaType, (String) null);
        }
        if (rVar != null) {
            rVar.U();
            jsonParser = rVar.g1(jsonParser);
            jsonParser.M0();
        }
        return n.d(jsonParser, deserializationContext);
    }

    public AsPropertyTypeDeserializer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, BeanProperty beanProperty) {
        super(asPropertyTypeDeserializer, beanProperty);
        String str;
        BeanProperty beanProperty2 = this.q;
        if (beanProperty2 == null) {
            str = String.format("missing type id property '%s'", new Object[]{this.y});
        } else {
            str = String.format("missing type id property '%s' (for POJO property '%s')", new Object[]{this.y, beanProperty2.getName()});
        }
        this.c2 = str;
        this.b2 = asPropertyTypeDeserializer.b2;
    }
}
