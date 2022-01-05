package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.n.b;
import i0.f.a.c.n.j;
import i0.f.a.c.p.e;
import i0.f.a.c.t.a;

public class AttributePropertyWriter extends VirtualBeanPropertyWriter {
    public final String n2;

    public AttributePropertyWriter(String str, j jVar, a aVar, JavaType javaType) {
        super(jVar, aVar, javaType, (g<?>) null, (e) null, (JavaType) null, jVar.l(), (Class<?>[]) null);
        this.n2 = str;
    }

    public Object p(Object obj, JsonGenerator jsonGenerator, i iVar) throws Exception {
        return iVar.Q(this.n2);
    }

    public VirtualBeanPropertyWriter q(MapperConfig<?> mapperConfig, b bVar, j jVar, JavaType javaType) {
        throw new IllegalStateException("Should not be called on this type");
    }
}
