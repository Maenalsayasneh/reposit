package com.fasterxml.jackson.databind.ser.std;

import i0.f.a.c.j.a;

@a
public class ToStringSerializer extends ToStringSerializerBase {
    public static final ToStringSerializer q = new ToStringSerializer();

    public ToStringSerializer() {
        super(Object.class);
    }

    public final String v(Object obj) {
        return obj.toString();
    }

    public ToStringSerializer(Class<?> cls) {
        super(cls);
    }
}
