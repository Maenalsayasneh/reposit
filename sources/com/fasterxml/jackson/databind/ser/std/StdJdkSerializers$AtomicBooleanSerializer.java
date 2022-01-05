package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import i0.f.a.c.i;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public class StdJdkSerializers$AtomicBooleanSerializer extends StdScalarSerializer<AtomicBoolean> {
    public StdJdkSerializers$AtomicBooleanSerializer() {
        super(AtomicBoolean.class, false);
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.O(((AtomicBoolean) obj).get());
    }
}
