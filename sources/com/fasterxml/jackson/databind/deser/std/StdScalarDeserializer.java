package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import i0.f.a.c.p.b;
import java.io.IOException;

public abstract class StdScalarDeserializer<T> extends StdDeserializer<T> {
    public StdScalarDeserializer(Class<?> cls) {
        super(cls);
    }

    public T e(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException {
        deserializationContext.M(this);
        return d(jsonParser, deserializationContext);
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        return bVar.e(jsonParser, deserializationContext);
    }

    public AccessPattern i() {
        return AccessPattern.CONSTANT;
    }

    public LogicalType q() {
        return LogicalType.OtherScalar;
    }

    public Boolean v(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public StdScalarDeserializer(StdScalarDeserializer<?> stdScalarDeserializer) {
        super((StdDeserializer<?>) stdScalarDeserializer);
    }
}
