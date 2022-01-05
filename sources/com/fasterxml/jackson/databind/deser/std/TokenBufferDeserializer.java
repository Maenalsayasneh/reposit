package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.type.LogicalType;
import i0.f.a.c.j.a;
import i0.f.a.c.t.r;
import java.io.IOException;

@a
public class TokenBufferDeserializer extends StdScalarDeserializer<r> {
    public TokenBufferDeserializer() {
        super((Class<?>) r.class);
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonToken M0;
        r rVar = new r(jsonParser, (DeserializationContext) null);
        if (!jsonParser.y0(JsonToken.FIELD_NAME)) {
            rVar.i1(jsonParser);
        } else {
            rVar.M0();
            do {
                rVar.i1(jsonParser);
                M0 = jsonParser.M0();
            } while (M0 == JsonToken.FIELD_NAME);
            JsonToken jsonToken = JsonToken.END_OBJECT;
            if (M0 == jsonToken) {
                rVar.U();
            } else {
                String b = deserializationContext.b("Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + M0, new Object[0]);
                throw deserializationContext.u0(deserializationContext.Z1, r.class, jsonToken, b);
            }
        }
        return rVar;
    }

    public LogicalType q() {
        return LogicalType.Untyped;
    }
}
