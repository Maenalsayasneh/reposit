package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import java.io.IOException;

public class UnknownSerializer extends StdSerializer<Object> {
    public UnknownSerializer() {
        super(Object.class);
    }

    public boolean d(i iVar, Object obj) {
        return true;
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        if (iVar.Y(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            v(iVar, obj);
        }
        jsonGenerator.O0(obj, 0);
        jsonGenerator.U();
    }

    public final void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        if (iVar.Y(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            v(iVar, obj);
        }
        eVar.f(jsonGenerator, eVar.e(jsonGenerator, eVar.d(obj, JsonToken.START_OBJECT)));
    }

    public void v(i iVar, Object obj) throws JsonMappingException {
        iVar.p(this.d, String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", new Object[]{obj.getClass().getName()}));
    }

    public UnknownSerializer(Class<?> cls) {
        super(cls, false);
    }
}
