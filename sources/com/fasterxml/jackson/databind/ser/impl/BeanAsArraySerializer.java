package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import i0.f.a.c.r.k.a;
import java.io.Closeable;
import java.io.IOException;
import java.util.Set;

public class BeanAsArraySerializer extends BeanSerializerBase {
    public final BeanSerializerBase e2;

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, Set<String> set, Set<String> set2) {
        super(beanSerializerBase, set, set2);
        this.e2 = beanSerializerBase;
    }

    public BeanSerializerBase C(Set set, Set set2) {
        return new BeanAsArraySerializer((BeanSerializerBase) this, (Set<String>) set, (Set<String>) set2);
    }

    public BeanSerializerBase E(Object obj) {
        return new BeanAsArraySerializer((BeanSerializerBase) this, this.c2, obj);
    }

    public BeanSerializerBase F(a aVar) {
        return this.e2.F(aVar);
    }

    public BeanSerializerBase G(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        return this;
    }

    public final void H(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        String str = "[anySetter]";
        BeanPropertyWriter[] beanPropertyWriterArr = this.Y1;
        if (beanPropertyWriterArr == null || iVar.x == null) {
            beanPropertyWriterArr = this.y;
        }
        try {
            for (BeanPropertyWriter beanPropertyWriter : beanPropertyWriterArr) {
                if (beanPropertyWriter == null) {
                    jsonGenerator.c0();
                } else {
                    beanPropertyWriter.m(obj, jsonGenerator, iVar);
                }
            }
        } catch (Exception e) {
            if (0 != beanPropertyWriterArr.length) {
                str = beanPropertyWriterArr[0].x.d;
            }
            q(iVar, e, obj, str);
            throw null;
        } catch (StackOverflowError e3) {
            JsonMappingException jsonMappingException = new JsonMappingException((Closeable) jsonGenerator, "Infinite recursion (StackOverflowError)", (Throwable) e3);
            if (0 != beanPropertyWriterArr.length) {
                str = beanPropertyWriterArr[0].x.d;
            }
            jsonMappingException.f(new JsonMappingException.Reference(obj, str));
            throw jsonMappingException;
        }
    }

    public final void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        if (iVar.Y(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) {
            BeanPropertyWriter[] beanPropertyWriterArr = this.Y1;
            if (beanPropertyWriterArr == null || iVar.x == null) {
                beanPropertyWriterArr = this.y;
            }
            boolean z = true;
            if (beanPropertyWriterArr.length != 1) {
                z = false;
            }
            if (z) {
                H(obj, jsonGenerator, iVar);
                return;
            }
        }
        jsonGenerator.K0(obj);
        H(obj, jsonGenerator, iVar);
        jsonGenerator.T();
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        if (this.c2 != null) {
            v(obj, jsonGenerator, iVar, eVar);
            return;
        }
        WritableTypeId x = x(eVar, obj, JsonToken.START_ARRAY);
        eVar.e(jsonGenerator, x);
        jsonGenerator.w(obj);
        H(obj, jsonGenerator, iVar);
        eVar.f(jsonGenerator, x);
    }

    public g<Object> h(NameTransformer nameTransformer) {
        return this.e2.h(nameTransformer);
    }

    public String toString() {
        return i0.d.a.a.a.W(this.d, i0.d.a.a.a.P0("BeanAsArraySerializer for "));
    }

    public BeanSerializerBase y() {
        return this;
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, a aVar, Object obj) {
        super(beanSerializerBase, aVar, obj);
        this.e2 = beanSerializerBase;
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase) {
        super(beanSerializerBase, (a) null, beanSerializerBase.a2);
        this.e2 = beanSerializerBase;
    }
}
