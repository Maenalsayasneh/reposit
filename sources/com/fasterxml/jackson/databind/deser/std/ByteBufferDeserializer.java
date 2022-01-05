package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.type.LogicalType;
import i0.f.a.b.a;
import i0.f.a.c.t.e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

public class ByteBufferDeserializer extends StdScalarDeserializer<ByteBuffer> {
    public ByteBufferDeserializer() {
        super((Class<?>) ByteBuffer.class);
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        Objects.requireNonNull(jsonParser);
        return ByteBuffer.wrap(jsonParser.n(a.b));
    }

    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        e eVar = new e(byteBuffer);
        jsonParser.Q0(deserializationContext.I(), eVar);
        eVar.close();
        return byteBuffer;
    }

    public LogicalType q() {
        return LogicalType.Binary;
    }
}
