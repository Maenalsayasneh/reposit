package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import i0.d.a.a.a;
import i0.f.a.b.m.h;
import i0.f.a.c.d;
import i0.f.a.c.p.b;
import i0.f.a.c.p.c;
import i0.f.a.c.t.r;
import java.io.IOException;
import java.io.Serializable;

public class AsArrayTypeDeserializer extends TypeDeserializerBase implements Serializable {
    public AsArrayTypeDeserializer(JavaType javaType, c cVar, String str, boolean z, JavaType javaType2) {
        super(javaType, cVar, str, z, javaType2);
    }

    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return v(jsonParser, deserializationContext);
    }

    public Object c(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return v(jsonParser, deserializationContext);
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return v(jsonParser, deserializationContext);
    }

    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return v(jsonParser, deserializationContext);
    }

    public b f(BeanProperty beanProperty) {
        return beanProperty == this.q ? this : new AsArrayTypeDeserializer(this, beanProperty);
    }

    public JsonTypeInfo.As k() {
        return JsonTypeInfo.As.WRAPPER_ARRAY;
    }

    public Object v(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        JsonToken jsonToken;
        Object g02;
        if (jsonParser.b() && (g02 = jsonParser.g0()) != null) {
            return m(jsonParser, deserializationContext, g02);
        }
        boolean F0 = jsonParser.F0();
        if (jsonParser.F0()) {
            JsonToken M0 = jsonParser.M0();
            JsonToken jsonToken2 = JsonToken.VALUE_STRING;
            if (M0 == jsonToken2) {
                str = jsonParser.Z();
                jsonParser.M0();
            } else {
                deserializationContext.p0(this.d, jsonToken2, "need JSON String that contains type id (for subtype of %s)", q());
                throw null;
            }
        } else if (this.x != null) {
            str = this.c.f();
        } else {
            JavaType javaType = this.d;
            JsonToken jsonToken3 = JsonToken.START_ARRAY;
            StringBuilder P0 = a.P0("need JSON Array to contain As.WRAPPER_ARRAY type information for class ");
            P0.append(q());
            deserializationContext.p0(javaType, jsonToken3, P0.toString(), new Object[0]);
            throw null;
        }
        d<Object> p = p(deserializationContext, str);
        h hVar = jsonParser;
        if (this.Y1) {
            hVar = jsonParser;
            if (!(this instanceof AsExternalTypeDeserializer)) {
                boolean y0 = jsonParser.y0(JsonToken.START_OBJECT);
                hVar = jsonParser;
                if (y0) {
                    r rVar = new r((i0.f.a.b.d) null, false);
                    rVar.M0();
                    rVar.b0(this.y);
                    rVar.Q0(str);
                    jsonParser.e();
                    h W0 = h.W0(false, rVar.g1(jsonParser), jsonParser);
                    W0.M0();
                    hVar = W0;
                }
            }
        }
        if (F0 && hVar.i() == JsonToken.END_ARRAY) {
            return p.b(deserializationContext);
        }
        Object d = p.d(hVar, deserializationContext);
        if (!F0 || hVar.M0() == (jsonToken = JsonToken.END_ARRAY)) {
            return d;
        }
        deserializationContext.p0(this.d, jsonToken, "expected closing END_ARRAY after type information and deserialized value", new Object[0]);
        throw null;
    }

    public AsArrayTypeDeserializer(AsArrayTypeDeserializer asArrayTypeDeserializer, BeanProperty beanProperty) {
        super(asArrayTypeDeserializer, beanProperty);
    }
}
