package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import i0.f.a.c.r.k.a;
import java.io.IOException;
import java.io.Serializable;
import java.util.Set;

public class UnwrappingBeanSerializer extends BeanSerializerBase implements Serializable {
    public final NameTransformer e2;

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, a aVar, Object obj) {
        super((BeanSerializerBase) unwrappingBeanSerializer, aVar, obj);
        this.e2 = unwrappingBeanSerializer.e2;
    }

    public BeanSerializerBase C(Set<String> set, Set<String> set2) {
        return new UnwrappingBeanSerializer(this, set, set2);
    }

    public BeanSerializerBase E(Object obj) {
        return new UnwrappingBeanSerializer(this, this.c2, obj);
    }

    public BeanSerializerBase F(a aVar) {
        return new UnwrappingBeanSerializer(this, aVar);
    }

    public BeanSerializerBase G(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        return new UnwrappingBeanSerializer(this, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    public final void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.w(obj);
        if (this.c2 != null) {
            w(obj, jsonGenerator, iVar, false);
            return;
        }
        Object obj2 = this.a2;
        if (obj2 != null) {
            if (this.Y1 != null) {
                Class<?> cls = iVar.x;
            }
            n(iVar, obj2, obj);
            throw null;
        }
        A(obj, jsonGenerator, iVar);
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        if (iVar.Y(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            iVar.p(this.d, "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
        }
        jsonGenerator.w(obj);
        if (this.c2 != null) {
            v(obj, jsonGenerator, iVar, eVar);
            return;
        }
        Object obj2 = this.a2;
        if (obj2 != null) {
            BeanPropertyWriter[] beanPropertyWriterArr = this.Y1;
            n(iVar, obj2, obj);
            throw null;
        }
        A(obj, jsonGenerator, iVar);
    }

    public g<Object> h(NameTransformer nameTransformer) {
        return new UnwrappingBeanSerializer((BeanSerializerBase) this, nameTransformer);
    }

    public String toString() {
        return i0.d.a.a.a.W(this.d, i0.d.a.a.a.P0("UnwrappingBeanSerializer for "));
    }

    public BeanSerializerBase y() {
        return this;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, Set<String> set, Set<String> set2) {
        super((BeanSerializerBase) unwrappingBeanSerializer, set, set2);
        this.e2 = unwrappingBeanSerializer.e2;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super((BeanSerializerBase) unwrappingBeanSerializer, beanPropertyWriterArr, beanPropertyWriterArr2);
        this.e2 = unwrappingBeanSerializer.e2;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, a aVar) {
        super((BeanSerializerBase) unwrappingBeanSerializer, aVar, unwrappingBeanSerializer.a2);
        this.e2 = unwrappingBeanSerializer.e2;
    }

    public UnwrappingBeanSerializer(BeanSerializerBase beanSerializerBase, NameTransformer nameTransformer) {
        super(beanSerializerBase, BeanSerializerBase.z(beanSerializerBase.y, nameTransformer), BeanSerializerBase.z(beanSerializerBase.Y1, nameTransformer));
        this.e2 = nameTransformer;
    }
}
