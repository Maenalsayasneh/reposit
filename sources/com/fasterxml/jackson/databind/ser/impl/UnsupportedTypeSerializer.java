package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import i0.f.a.c.i;
import java.io.IOException;

public class UnsupportedTypeSerializer extends StdSerializer<Object> {
    public final JavaType q;
    public final String x;

    public UnsupportedTypeSerializer(JavaType javaType, String str) {
        super(Object.class);
        this.q = javaType;
        this.x = str;
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        iVar.n(this.q, this.x);
        throw null;
    }
}
