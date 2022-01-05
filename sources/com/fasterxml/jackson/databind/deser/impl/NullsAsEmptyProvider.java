package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import i0.f.a.c.d;
import i0.f.a.c.l.i;
import java.io.Serializable;

public class NullsAsEmptyProvider implements i, Serializable {
    public final d<?> c;

    public NullsAsEmptyProvider(d<?> dVar) {
        this.c = dVar;
    }

    public Object b(DeserializationContext deserializationContext) throws JsonMappingException {
        return this.c.k(deserializationContext);
    }
}
