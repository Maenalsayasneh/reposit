package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import i0.f.a.c.i;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

public class StdJdkSerializers$AtomicLongSerializer extends StdScalarSerializer<AtomicLong> {
    public StdJdkSerializers$AtomicLongSerializer() {
        super(AtomicLong.class, false);
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.i0(((AtomicLong) obj).get());
    }
}
