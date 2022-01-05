package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import i0.f.a.c.j.a;
import i0.f.a.c.p.b;
import java.io.IOException;

@a
public class StringDeserializer extends StdScalarDeserializer<String> {
    public static final StringDeserializer x = new StringDeserializer();

    public StringDeserializer() {
        super((Class<?>) String.class);
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        return d(jsonParser, deserializationContext);
    }

    public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
        return "";
    }

    public boolean p() {
        return true;
    }

    public LogicalType q() {
        return LogicalType.Textual;
    }

    /* renamed from: y0 */
    public String d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String r02;
        if (jsonParser.y0(JsonToken.VALUE_STRING)) {
            return jsonParser.Z();
        }
        JsonToken i = jsonParser.i();
        if (i == JsonToken.START_ARRAY) {
            return (String) I(jsonParser, deserializationContext);
        }
        if (i == JsonToken.VALUE_EMBEDDED_OBJECT) {
            Object G = jsonParser.G();
            if (G == null) {
                return null;
            }
            if (G instanceof byte[]) {
                return deserializationContext.I().g((byte[]) G, false);
            }
            return G.toString();
        } else if (i == JsonToken.START_OBJECT) {
            deserializationContext.V(this.d, jsonParser);
            throw null;
        } else if (i.isScalarValue() && (r02 = jsonParser.r0()) != null) {
            return r02;
        } else {
            deserializationContext.V(this.d, jsonParser);
            throw null;
        }
    }
}
