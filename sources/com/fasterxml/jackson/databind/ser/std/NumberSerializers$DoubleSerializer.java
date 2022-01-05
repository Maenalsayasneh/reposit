package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.p.e;
import java.io.IOException;

@a
public class NumberSerializers$DoubleSerializer extends NumberSerializers$Base<Object> {
    public NumberSerializers$DoubleSerializer(Class<?> cls) {
        super(cls, JsonParser.NumberType.DOUBLE, "number");
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.d0(((Double) obj).doubleValue());
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        Double d = (Double) obj;
        double doubleValue = d.doubleValue();
        if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
            WritableTypeId e = eVar.e(jsonGenerator, eVar.d(obj, JsonToken.VALUE_NUMBER_FLOAT));
            jsonGenerator.d0(d.doubleValue());
            eVar.f(jsonGenerator, e);
            return;
        }
        jsonGenerator.d0(d.doubleValue());
    }
}
