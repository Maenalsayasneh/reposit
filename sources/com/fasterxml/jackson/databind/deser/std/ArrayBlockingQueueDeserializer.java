package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import i0.f.a.c.d;
import i0.f.a.c.l.i;
import i0.f.a.c.p.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueDeserializer extends CollectionDeserializer {
    public ArrayBlockingQueueDeserializer(JavaType javaType, d<Object> dVar, b bVar, ValueInstantiator valueInstantiator) {
        super(javaType, dVar, bVar, valueInstantiator);
    }

    public Collection<Object> A0(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        if (collection == null) {
            collection = new ArrayList<>();
        }
        Collection<Object> A0 = super.A0(jsonParser, deserializationContext, collection);
        if (A0.isEmpty()) {
            return new ArrayBlockingQueue(1, false);
        }
        return new ArrayBlockingQueue(A0.size(), false, A0);
    }

    public Collection<Object> B0(DeserializationContext deserializationContext) throws IOException {
        return null;
    }

    public CollectionDeserializer D0(d dVar, d dVar2, b bVar, i iVar, Boolean bool) {
        return new ArrayBlockingQueueDeserializer(this.x, dVar2, bVar, this.c2, dVar, iVar, bool);
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        return bVar.c(jsonParser, deserializationContext);
    }

    public ArrayBlockingQueueDeserializer(JavaType javaType, d<Object> dVar, b bVar, ValueInstantiator valueInstantiator, d<Object> dVar2, i iVar, Boolean bool) {
        super(javaType, dVar, bVar, valueInstantiator, dVar2, iVar, bool);
    }
}
