package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.p.e;
import java.io.IOException;

@a
public class NullSerializer extends StdSerializer<Object> {
    public static final NullSerializer q = new NullSerializer();

    public NullSerializer() {
        super(Object.class);
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.c0();
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        jsonGenerator.c0();
    }
}
