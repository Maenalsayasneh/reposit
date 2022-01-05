package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

public class UnsupportedTypeDeserializer extends StdDeserializer<Object> {
    public final JavaType x;
    public final String y;

    public UnsupportedTypeDeserializer(JavaType javaType, String str) {
        super(javaType);
        this.x = javaType;
        this.y = str;
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.n(this.x, this.y);
        throw null;
    }
}
