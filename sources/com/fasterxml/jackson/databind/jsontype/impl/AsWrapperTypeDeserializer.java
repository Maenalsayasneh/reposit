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

public class AsWrapperTypeDeserializer extends TypeDeserializerBase implements Serializable {
    public AsWrapperTypeDeserializer(JavaType javaType, c cVar, String str, boolean z, JavaType javaType2) {
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
        return beanProperty == this.q ? this : new AsWrapperTypeDeserializer(this, beanProperty);
    }

    public JsonTypeInfo.As k() {
        return JsonTypeInfo.As.WRAPPER_OBJECT;
    }

    public Object v(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object g02;
        if (jsonParser.b() && (g02 = jsonParser.g0()) != null) {
            return m(jsonParser, deserializationContext, g02);
        }
        JsonToken i = jsonParser.i();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (i == jsonToken) {
            JsonToken M0 = jsonParser.M0();
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (M0 != jsonToken2) {
                JavaType javaType = this.d;
                StringBuilder P0 = a.P0("need JSON String that contains type id (for subtype of ");
                P0.append(q());
                P0.append(")");
                deserializationContext.p0(javaType, jsonToken2, P0.toString(), new Object[0]);
                throw null;
            }
        } else if (i != JsonToken.FIELD_NAME) {
            JavaType javaType2 = this.d;
            StringBuilder P02 = a.P0("need JSON Object to contain As.WRAPPER_OBJECT type information for class ");
            P02.append(q());
            deserializationContext.p0(javaType2, jsonToken, P02.toString(), new Object[0]);
            throw null;
        }
        String Z = jsonParser.Z();
        d<Object> p = p(deserializationContext, Z);
        jsonParser.M0();
        h hVar = jsonParser;
        if (this.Y1) {
            boolean y0 = jsonParser.y0(jsonToken);
            hVar = jsonParser;
            if (y0) {
                r rVar = new r((i0.f.a.b.d) null, false);
                rVar.M0();
                rVar.b0(this.y);
                rVar.Q0(Z);
                jsonParser.e();
                h W0 = h.W0(false, rVar.g1(jsonParser), jsonParser);
                W0.M0();
                hVar = W0;
            }
        }
        Object d = p.d(hVar, deserializationContext);
        JsonToken M02 = hVar.M0();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (M02 == jsonToken3) {
            return d;
        }
        deserializationContext.p0(this.d, jsonToken3, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        throw null;
    }

    public AsWrapperTypeDeserializer(AsWrapperTypeDeserializer asWrapperTypeDeserializer, BeanProperty beanProperty) {
        super(asWrapperTypeDeserializer, beanProperty);
    }
}
