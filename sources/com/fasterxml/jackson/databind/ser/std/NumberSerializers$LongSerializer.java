package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import java.io.IOException;

@a
public class NumberSerializers$LongSerializer extends NumberSerializers$Base<Object> {
    public NumberSerializers$LongSerializer(Class<?> cls) {
        super(cls, JsonParser.NumberType.LONG, "number");
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.i0(((Long) obj).longValue());
    }
}
