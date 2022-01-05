package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.r.b;
import i0.f.a.c.r.k.a;
import java.io.IOException;
import java.util.Set;

public class BeanSerializer extends BeanSerializerBase {
    public BeanSerializer(JavaType javaType, b bVar, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType, bVar, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    public BeanSerializerBase C(Set<String> set, Set<String> set2) {
        return new BeanSerializer((BeanSerializerBase) this, set, set2);
    }

    public BeanSerializerBase E(Object obj) {
        return new BeanSerializer((BeanSerializerBase) this, this.c2, obj);
    }

    public BeanSerializerBase F(a aVar) {
        return new BeanSerializer((BeanSerializerBase) this, aVar, this.a2);
    }

    public BeanSerializerBase G(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        return new BeanSerializer((BeanSerializerBase) this, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    public final void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        if (this.c2 != null) {
            jsonGenerator.w(obj);
            w(obj, jsonGenerator, iVar, true);
            return;
        }
        jsonGenerator.N0(obj);
        Object obj2 = this.a2;
        if (obj2 != null) {
            if (this.Y1 != null) {
                Class<?> cls = iVar.x;
            }
            n(iVar, obj2, obj);
            throw null;
        }
        A(obj, jsonGenerator, iVar);
        jsonGenerator.U();
    }

    public g<Object> h(NameTransformer nameTransformer) {
        return new UnwrappingBeanSerializer((BeanSerializerBase) this, nameTransformer);
    }

    public String toString() {
        return i0.d.a.a.a.W(this.d, i0.d.a.a.a.P0("BeanSerializer for "));
    }

    public BeanSerializerBase y() {
        return (this.c2 == null && this.Z1 == null && this.a2 == null) ? new BeanAsArraySerializer(this) : this;
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, a aVar, Object obj) {
        super(beanSerializerBase, aVar, obj);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, Set<String> set, Set<String> set2) {
        super(beanSerializerBase, set, set2);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(beanSerializerBase, beanPropertyWriterArr, beanPropertyWriterArr2);
    }
}
