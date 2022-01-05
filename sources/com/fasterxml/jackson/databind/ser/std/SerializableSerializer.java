package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import i0.f.a.c.f;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.p.e;
import java.io.IOException;

@a
public class SerializableSerializer extends StdSerializer<f> {
    public static final SerializableSerializer q = new SerializableSerializer();

    public SerializableSerializer() {
        super(f.class);
    }

    public boolean d(i iVar, Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            return ((f.a) fVar).e(iVar);
        }
        return false;
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        ((f) obj).b(jsonGenerator, iVar);
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        ((f) obj).c(jsonGenerator, iVar, eVar);
    }
}
