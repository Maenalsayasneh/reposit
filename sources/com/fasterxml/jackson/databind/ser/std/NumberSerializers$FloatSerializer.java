package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import java.io.IOException;

@a
public class NumberSerializers$FloatSerializer extends NumberSerializers$Base<Object> {
    public static final NumberSerializers$FloatSerializer q = new NumberSerializers$FloatSerializer();

    public NumberSerializers$FloatSerializer() {
        super(Float.class, JsonParser.NumberType.FLOAT, "number");
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.f0(((Float) obj).floatValue());
    }
}
