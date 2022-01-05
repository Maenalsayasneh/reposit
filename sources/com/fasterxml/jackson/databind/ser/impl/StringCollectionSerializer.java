package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.p.e;
import java.io.IOException;
import java.util.Collection;

@a
public class StringCollectionSerializer extends StaticListSerializerBase<Collection<String>> {
    public static final StringCollectionSerializer x = new StringCollectionSerializer();

    public StringCollectionSerializer() {
        super(Collection.class);
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        Collection collection = (Collection) obj;
        int size = collection.size();
        if (size != 1 || ((this.q != null || !iVar.Y(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.q != Boolean.TRUE)) {
            jsonGenerator.L0(collection, size);
            w(collection, jsonGenerator, iVar);
            jsonGenerator.T();
            return;
        }
        w(collection, jsonGenerator, iVar);
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        Collection collection = (Collection) obj;
        WritableTypeId e = eVar.e(jsonGenerator, eVar.d(collection, JsonToken.START_ARRAY));
        jsonGenerator.w(collection);
        w(collection, jsonGenerator, iVar);
        eVar.f(jsonGenerator, e);
    }

    public g<?> v(BeanProperty beanProperty, Boolean bool) {
        return new StringCollectionSerializer(this, bool);
    }

    public final void w(Collection<String> collection, JsonGenerator jsonGenerator, i iVar) throws IOException {
        int i = 0;
        try {
            for (String next : collection) {
                if (next == null) {
                    iVar.z(jsonGenerator);
                } else {
                    jsonGenerator.Q0(next);
                }
                i++;
            }
        } catch (Exception e) {
            p(iVar, e, collection, 0);
            throw null;
        }
    }

    public StringCollectionSerializer(StringCollectionSerializer stringCollectionSerializer, Boolean bool) {
        super(stringCollectionSerializer, bool);
    }
}
