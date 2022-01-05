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
import java.util.List;

@a
public final class IndexedStringListSerializer extends StaticListSerializerBase<List<String>> {
    public static final IndexedStringListSerializer x = new IndexedStringListSerializer();

    public IndexedStringListSerializer() {
        super(List.class);
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        List list = (List) obj;
        int size = list.size();
        if (size != 1 || ((this.q != null || !iVar.Y(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.q != Boolean.TRUE)) {
            jsonGenerator.L0(list, size);
            w(list, jsonGenerator, iVar, size);
            jsonGenerator.T();
            return;
        }
        w(list, jsonGenerator, iVar, 1);
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        List list = (List) obj;
        WritableTypeId e = eVar.e(jsonGenerator, eVar.d(list, JsonToken.START_ARRAY));
        jsonGenerator.w(list);
        w(list, jsonGenerator, iVar, list.size());
        eVar.f(jsonGenerator, e);
    }

    public g<?> v(BeanProperty beanProperty, Boolean bool) {
        return new IndexedStringListSerializer(this, bool);
    }

    public final void w(List<String> list, JsonGenerator jsonGenerator, i iVar, int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            try {
                String str = list.get(i2);
                if (str == null) {
                    iVar.z(jsonGenerator);
                } else {
                    jsonGenerator.Q0(str);
                }
                i2++;
            } catch (Exception e) {
                p(iVar, e, list, i2);
                throw null;
            }
        }
    }

    public IndexedStringListSerializer(IndexedStringListSerializer indexedStringListSerializer, Boolean bool) {
        super(indexedStringListSerializer, bool);
    }
}
