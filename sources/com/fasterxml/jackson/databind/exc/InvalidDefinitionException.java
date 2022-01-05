package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import i0.f.a.c.b;
import i0.f.a.c.n.j;

public class InvalidDefinitionException extends JsonMappingException {
    public InvalidDefinitionException(JsonParser jsonParser, String str, JavaType javaType) {
        super(jsonParser, str);
    }

    public InvalidDefinitionException(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        super(jsonGenerator, str);
    }

    public InvalidDefinitionException(JsonParser jsonParser, String str, b bVar, j jVar) {
        super(jsonParser, str);
    }

    public InvalidDefinitionException(JsonGenerator jsonGenerator, String str, b bVar, j jVar) {
        super(jsonGenerator, str);
    }
}
