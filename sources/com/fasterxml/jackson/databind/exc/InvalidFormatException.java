package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;

public class InvalidFormatException extends MismatchedInputException {
    public final Object x;

    public InvalidFormatException(JsonParser jsonParser, String str, Object obj, Class<?> cls) {
        super(jsonParser, str, cls);
        this.x = obj;
    }
}
