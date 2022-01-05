package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongDeserializer extends StdScalarDeserializer<AtomicLong> {
    public AtomicLongDeserializer() {
        super((Class<?>) AtomicLong.class);
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        if (jsonParser.D0()) {
            return new AtomicLong(jsonParser.J());
        }
        Long i02 = i0(jsonParser, deserializationContext, AtomicLong.class);
        if (i02 == null) {
            return null;
        }
        return new AtomicLong((long) i02.intValue());
    }

    public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicLong();
    }

    public LogicalType q() {
        return LogicalType.Integer;
    }
}
