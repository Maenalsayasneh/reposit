package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamReadException;

public class JsonParseException extends StreamReadException {
    public JsonParseException(JsonParser jsonParser, String str) {
        super(jsonParser, str);
    }

    public Object c() {
        return this.d;
    }

    public JsonParser d() {
        return this.d;
    }

    public String getMessage() {
        return super.getMessage();
    }

    public JsonParseException(JsonParser jsonParser, String str, Throwable th) {
        super(jsonParser, str, th);
    }

    public JsonParseException(JsonParser jsonParser, String str, JsonLocation jsonLocation) {
        super((JsonParser) null, str, jsonLocation);
    }
}
