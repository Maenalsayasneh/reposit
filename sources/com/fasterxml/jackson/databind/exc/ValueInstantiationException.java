package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.Closeable;

public class ValueInstantiationException extends JsonMappingException {
    public ValueInstantiationException(JsonParser jsonParser, String str, JavaType javaType, Throwable th) {
        super((Closeable) jsonParser, str, th);
    }
}
