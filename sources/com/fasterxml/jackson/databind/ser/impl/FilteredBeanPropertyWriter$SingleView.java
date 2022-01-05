package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import i0.f.a.c.g;
import i0.f.a.c.i;
import java.io.Serializable;
import java.util.Objects;

public final class FilteredBeanPropertyWriter$SingleView extends BeanPropertyWriter implements Serializable {
    public final BeanPropertyWriter n2;
    public final Class<?> o2;

    public FilteredBeanPropertyWriter$SingleView(BeanPropertyWriter beanPropertyWriter, Class<?> cls) {
        super(beanPropertyWriter, beanPropertyWriter.x);
        this.n2 = beanPropertyWriter;
        this.o2 = cls;
    }

    public void i(g<Object> gVar) {
        this.n2.i(gVar);
    }

    public void k(g<Object> gVar) {
        this.n2.k(gVar);
    }

    public BeanPropertyWriter l(NameTransformer nameTransformer) {
        return new FilteredBeanPropertyWriter$SingleView(this.n2.l(nameTransformer), this.o2);
    }

    public void m(Object obj, JsonGenerator jsonGenerator, i iVar) throws Exception {
        Class<?> cls = iVar.x;
        if (cls == null || this.o2.isAssignableFrom(cls)) {
            this.n2.m(obj, jsonGenerator, iVar);
            return;
        }
        g<Object> gVar = this.n2.g2;
        if (gVar != null) {
            gVar.f(null, jsonGenerator, iVar);
        } else {
            jsonGenerator.c0();
        }
    }

    public void n(Object obj, JsonGenerator jsonGenerator, i iVar) throws Exception {
        Class<?> cls = iVar.x;
        if (cls == null || this.o2.isAssignableFrom(cls)) {
            this.n2.n(obj, jsonGenerator, iVar);
            return;
        }
        Objects.requireNonNull(this.n2);
        Objects.requireNonNull(jsonGenerator);
    }
}
