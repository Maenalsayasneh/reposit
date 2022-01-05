package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.p.e;
import java.io.IOException;

@a
public final class StringSerializer extends StdScalarSerializer<Object> {
    public StringSerializer() {
        super(String.class, false);
    }

    public boolean d(i iVar, Object obj) {
        return ((String) obj).isEmpty();
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.Q0((String) obj);
    }

    public final void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        jsonGenerator.Q0((String) obj);
    }
}
