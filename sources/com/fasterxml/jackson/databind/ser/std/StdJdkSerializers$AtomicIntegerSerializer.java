package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import i0.f.a.c.i;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class StdJdkSerializers$AtomicIntegerSerializer extends StdScalarSerializer<AtomicInteger> {
    public StdJdkSerializers$AtomicIntegerSerializer() {
        super(AtomicInteger.class, false);
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.g0(((AtomicInteger) obj).get());
    }
}
