package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import i0.f.a.b.a;
import i0.f.a.c.i;
import i0.f.a.c.t.d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

public class ByteBufferSerializer extends StdScalarSerializer<ByteBuffer> {
    public ByteBufferSerializer() {
        super(ByteBuffer.class);
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (byteBuffer.hasArray()) {
            int position = byteBuffer.position();
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + position;
            int limit = byteBuffer.limit() - position;
            Objects.requireNonNull(jsonGenerator);
            jsonGenerator.M(a.b, array, arrayOffset, limit);
            return;
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (asReadOnlyBuffer.position() > 0) {
            asReadOnlyBuffer.rewind();
        }
        d dVar = new d(asReadOnlyBuffer);
        jsonGenerator.J(dVar, asReadOnlyBuffer.remaining());
        dVar.close();
    }
}
