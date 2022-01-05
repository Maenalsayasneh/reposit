package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import java.io.IOException;

public class RawSerializer<T> extends StdSerializer<T> {
    public RawSerializer(Class<?> cls) {
        super(cls, false);
    }

    public void f(T t, JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.F0(t.toString());
    }

    public void g(T t, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        WritableTypeId e = eVar.e(jsonGenerator, eVar.d(t, JsonToken.VALUE_EMBEDDED_OBJECT));
        jsonGenerator.F0(t.toString());
        eVar.f(jsonGenerator, e);
    }
}
