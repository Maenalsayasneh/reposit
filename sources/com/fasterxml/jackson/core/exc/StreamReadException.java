package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;

public abstract class StreamReadException extends JsonProcessingException {
    public transient JsonParser d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamReadException(JsonParser jsonParser, String str) {
        super(str, jsonParser == null ? null : jsonParser.w());
        this.d = jsonParser;
    }

    /* renamed from: d */
    public JsonParser c() {
        return this.d;
    }

    public String getMessage() {
        return super.getMessage();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamReadException(JsonParser jsonParser, String str, Throwable th) {
        super(str, jsonParser == null ? null : jsonParser.w(), th);
        this.d = jsonParser;
    }

    public StreamReadException(JsonParser jsonParser, String str, JsonLocation jsonLocation) {
        super(str, jsonLocation, (Throwable) null);
        this.d = jsonParser;
    }
}
