package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import i0.f.a.c.t.f;
import java.io.Closeable;

public class MismatchedInputException extends JsonMappingException {
    public MismatchedInputException(JsonParser jsonParser, String str, JsonLocation jsonLocation) {
        super((Closeable) jsonParser, str, jsonLocation);
    }

    public MismatchedInputException(JsonParser jsonParser, String str, Class<?> cls) {
        super(jsonParser, str);
    }

    public MismatchedInputException(JsonParser jsonParser, String str) {
        super(jsonParser, str);
        f.G((JavaType) null);
    }

    public MismatchedInputException(JsonParser jsonParser, String str, JavaType javaType) {
        super(jsonParser, str);
        f.G(javaType);
    }
}
