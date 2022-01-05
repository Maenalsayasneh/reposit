package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import java.io.IOException;

@a
public class NumberSerializers$IntLikeSerializer extends NumberSerializers$Base<Object> {
    public static final NumberSerializers$IntLikeSerializer q = new NumberSerializers$IntLikeSerializer();

    public NumberSerializers$IntLikeSerializer() {
        super(Number.class, JsonParser.NumberType.INT, "integer");
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.g0(((Number) obj).intValue());
    }
}
