package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import java.io.IOException;

public abstract class StdScalarSerializer<T> extends StdSerializer<T> {
    public StdScalarSerializer(Class<T> cls) {
        super(cls);
    }

    public void g(T t, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        WritableTypeId e = eVar.e(jsonGenerator, eVar.d(t, JsonToken.VALUE_STRING));
        f(t, jsonGenerator, iVar);
        eVar.f(jsonGenerator, e);
    }

    public StdScalarSerializer(Class<?> cls, boolean z) {
        super(cls);
    }
}
