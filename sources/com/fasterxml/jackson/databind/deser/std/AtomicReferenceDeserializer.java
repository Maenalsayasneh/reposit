package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import i0.f.a.c.d;
import i0.f.a.c.p.b;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceDeserializer extends ReferenceTypeDeserializer<AtomicReference<Object>> {
    public AtomicReferenceDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, b bVar, d<?> dVar) {
        super(javaType, valueInstantiator, bVar, dVar);
    }

    public Object b(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicReference(this.Z1.b(deserializationContext));
    }

    public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicReference(this.Z1.b(deserializationContext));
    }

    public Boolean v(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }
}
