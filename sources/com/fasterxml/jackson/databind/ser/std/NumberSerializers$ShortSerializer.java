package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import java.io.IOException;

@a
public class NumberSerializers$ShortSerializer extends NumberSerializers$Base<Object> {
    public static final NumberSerializers$ShortSerializer q = new NumberSerializers$ShortSerializer();

    public NumberSerializers$ShortSerializer() {
        super(Short.class, JsonParser.NumberType.INT, "number");
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.r0(((Short) obj).shortValue());
    }
}
