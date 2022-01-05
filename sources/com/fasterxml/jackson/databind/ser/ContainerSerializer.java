package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import i0.f.a.c.p.e;

public abstract class ContainerSerializer<T> extends StdSerializer<T> {
    public ContainerSerializer(Class<T> cls) {
        super(cls);
    }

    public abstract ContainerSerializer<?> v(e eVar);

    public ContainerSerializer(JavaType javaType) {
        super(javaType);
    }

    public ContainerSerializer(Class<?> cls, boolean z) {
        super(cls, z);
    }

    public ContainerSerializer(ContainerSerializer<?> containerSerializer) {
        super(containerSerializer.d, false);
    }
}
