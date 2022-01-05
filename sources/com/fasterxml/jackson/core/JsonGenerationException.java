package com.fasterxml.jackson.core;

public class JsonGenerationException extends JsonProcessingException {
    public transient JsonGenerator d;

    public JsonGenerationException(String str, JsonGenerator jsonGenerator) {
        super(str, (JsonLocation) null);
        this.d = jsonGenerator;
    }

    public Object c() {
        return this.d;
    }
}
