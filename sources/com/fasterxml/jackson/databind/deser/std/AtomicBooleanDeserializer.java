package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanDeserializer extends StdScalarDeserializer<AtomicBoolean> {
    public AtomicBooleanDeserializer() {
        super((Class<?>) AtomicBoolean.class);
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonToken i = jsonParser.i();
        if (i == JsonToken.VALUE_TRUE) {
            return new AtomicBoolean(true);
        }
        if (i == JsonToken.VALUE_FALSE) {
            return new AtomicBoolean(false);
        }
        Boolean Z = Z(jsonParser, deserializationContext, AtomicBoolean.class);
        if (Z == null) {
            return null;
        }
        return new AtomicBoolean(Z.booleanValue());
    }

    public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicBoolean(false);
    }

    public LogicalType q() {
        return LogicalType.Boolean;
    }
}
