package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import i0.f.a.c.d;
import i0.f.a.c.p.b;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

public final class TypeWrappedDeserializer extends d<Object> implements Serializable {
    public final b c;
    public final d<Object> d;

    public TypeWrappedDeserializer(b bVar, d<?> dVar) {
        this.c = bVar;
        this.d = dVar;
    }

    public Object b(DeserializationContext deserializationContext) throws JsonMappingException {
        return this.d.b(deserializationContext);
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this.d.f(jsonParser, deserializationContext, this.c);
    }

    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return this.d.e(jsonParser, deserializationContext, obj);
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
        return this.d.k(deserializationContext);
    }

    public Collection<Object> l() {
        return this.d.l();
    }

    public Class<?> n() {
        return this.d.n();
    }

    public LogicalType q() {
        return this.d.q();
    }

    public Boolean v(DeserializationConfig deserializationConfig) {
        return this.d.v(deserializationConfig);
    }
}
