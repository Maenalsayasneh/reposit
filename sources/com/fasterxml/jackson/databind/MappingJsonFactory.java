package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import i0.f.a.b.d;

public class MappingJsonFactory extends JsonFactory {
    public MappingJsonFactory(ObjectMapper objectMapper) {
        super(objectMapper);
    }

    public d f() {
        return (ObjectMapper) this.c2;
    }
}
