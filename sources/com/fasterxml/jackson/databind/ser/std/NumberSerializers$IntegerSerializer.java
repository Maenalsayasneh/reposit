package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.p.e;
import java.io.IOException;

@a
public class NumberSerializers$IntegerSerializer extends NumberSerializers$Base<Object> {
    public NumberSerializers$IntegerSerializer(Class<?> cls) {
        super(cls, JsonParser.NumberType.INT, "integer");
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.g0(((Integer) obj).intValue());
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        f(obj, jsonGenerator, iVar);
    }
}
