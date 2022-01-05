package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDeserializer extends StdScalarDeserializer<AtomicInteger> {
    public AtomicIntegerDeserializer() {
        super((Class<?>) AtomicInteger.class);
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        if (jsonParser.D0()) {
            return new AtomicInteger(jsonParser.I());
        }
        Integer h02 = h0(jsonParser, deserializationContext, AtomicInteger.class);
        if (h02 == null) {
            return null;
        }
        return new AtomicInteger(h02.intValue());
    }

    public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicInteger();
    }

    public LogicalType q() {
        return LogicalType.Integer;
    }
}
