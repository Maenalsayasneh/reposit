package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

public class FailingDeserializer extends StdDeserializer<Object> {
    public final String x;

    public FailingDeserializer(String str) {
        super((Class<?>) Object.class);
        this.x = str;
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.m0(this, this.x, new Object[0]);
        throw null;
    }
}
