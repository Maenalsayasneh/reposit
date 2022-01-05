package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import java.io.IOException;

public abstract class ToStringSerializerBase extends StdSerializer<Object> {
    public ToStringSerializerBase(Class<?> cls) {
        super(cls, false);
    }

    public boolean d(i iVar, Object obj) {
        return v(obj).isEmpty();
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.Q0(v(obj));
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        WritableTypeId e = eVar.e(jsonGenerator, eVar.d(obj, JsonToken.VALUE_STRING));
        f(obj, jsonGenerator, iVar);
        eVar.f(jsonGenerator, e);
    }

    public abstract String v(Object obj);
}
