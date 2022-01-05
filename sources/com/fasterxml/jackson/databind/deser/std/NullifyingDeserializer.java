package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import i0.f.a.c.p.b;
import java.io.IOException;

public class NullifyingDeserializer extends StdDeserializer<Object> {
    public static final NullifyingDeserializer x = new NullifyingDeserializer();

    public NullifyingDeserializer() {
        super((Class<?>) Object.class);
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.y0(JsonToken.FIELD_NAME)) {
            while (true) {
                JsonToken M0 = jsonParser.M0();
                if (M0 == null || M0 == JsonToken.END_OBJECT) {
                    return null;
                }
                jsonParser.U0();
            }
        } else {
            jsonParser.U0();
            return null;
        }
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        int k = jsonParser.k();
        if (k == 1 || k == 3 || k == 5) {
            return bVar.b(jsonParser, deserializationContext);
        }
        return null;
    }

    public Boolean v(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }
}
