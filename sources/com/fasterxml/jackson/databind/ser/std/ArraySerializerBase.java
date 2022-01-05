package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import i0.f.a.c.r.d;
import java.io.IOException;
import java.util.Objects;

public abstract class ArraySerializerBase<T> extends ContainerSerializer<T> implements d {
    public final BeanProperty q;
    public final Boolean x;

    public ArraySerializerBase(Class<T> cls) {
        super(cls);
        this.q = null;
        this.x = null;
    }

    public g<?> a(i iVar, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value m;
        if (!(beanProperty == null || (m = m(iVar, beanProperty, this.d)) == null)) {
            Boolean b = m.b(JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
            if (!Objects.equals(b, this.x)) {
                return x(beanProperty, b);
            }
        }
        return this;
    }

    public final void g(T t, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        WritableTypeId e = eVar.e(jsonGenerator, eVar.d(t, JsonToken.START_ARRAY));
        jsonGenerator.w(t);
        y(t, jsonGenerator, iVar);
        eVar.f(jsonGenerator, e);
    }

    public final boolean w(i iVar) {
        Boolean bool = this.x;
        if (bool == null) {
            return iVar.Y(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
        }
        return bool.booleanValue();
    }

    public abstract g<?> x(BeanProperty beanProperty, Boolean bool);

    public abstract void y(T t, JsonGenerator jsonGenerator, i iVar) throws IOException;

    public ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase, BeanProperty beanProperty, Boolean bool) {
        super(arraySerializerBase.d, false);
        this.q = beanProperty;
        this.x = bool;
    }
}
