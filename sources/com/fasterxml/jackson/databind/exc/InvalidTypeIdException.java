package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;

public class InvalidTypeIdException extends MismatchedInputException {
    public InvalidTypeIdException(JsonParser jsonParser, String str, JavaType javaType, String str2) {
        super(jsonParser, str);
    }
}
