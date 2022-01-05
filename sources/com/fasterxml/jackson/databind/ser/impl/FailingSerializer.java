package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import i0.f.a.c.i;
import java.io.IOException;

public class FailingSerializer extends StdSerializer<Object> {
    public final String q;

    public FailingSerializer(String str) {
        super(Object.class);
        this.q = str;
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        iVar.b0(this.q, new Object[0]);
        throw null;
    }
}
