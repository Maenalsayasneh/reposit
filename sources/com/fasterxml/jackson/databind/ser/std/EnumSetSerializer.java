package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetSerializer extends AsArraySerializerBase<EnumSet<? extends Enum<?>>> {
    public EnumSetSerializer(JavaType javaType) {
        super((Class<?>) EnumSet.class, javaType, true, (e) null, (g<Object>) null);
    }

    public boolean d(i iVar, Object obj) {
        return ((EnumSet) obj).isEmpty();
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        EnumSet enumSet = (EnumSet) obj;
        int size = enumSet.size();
        if (size != 1 || ((this.Y1 != null || !iVar.Y(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.Y1 != Boolean.TRUE)) {
            jsonGenerator.L0(enumSet, size);
            x(enumSet, jsonGenerator, iVar);
            jsonGenerator.T();
            return;
        }
        x(enumSet, jsonGenerator, iVar);
    }

    public ContainerSerializer v(e eVar) {
        return this;
    }

    public AsArraySerializerBase y(BeanProperty beanProperty, e eVar, g gVar, Boolean bool) {
        return new EnumSetSerializer(this, beanProperty, eVar, gVar, bool);
    }

    /* renamed from: z */
    public void x(EnumSet<? extends Enum<?>> enumSet, JsonGenerator jsonGenerator, i iVar) throws IOException {
        g<Object> gVar = this.a2;
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            Enum enumR = (Enum) it.next();
            if (gVar == null) {
                gVar = iVar.C(enumR.getDeclaringClass(), this.x);
            }
            gVar.f(enumR, jsonGenerator, iVar);
        }
    }

    public EnumSetSerializer(EnumSetSerializer enumSetSerializer, BeanProperty beanProperty, e eVar, g<?> gVar, Boolean bool) {
        super((AsArraySerializerBase<?>) enumSetSerializer, beanProperty, eVar, gVar, bool);
    }
}
