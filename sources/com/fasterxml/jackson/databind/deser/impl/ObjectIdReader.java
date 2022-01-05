package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import i0.f.a.a.z;
import i0.f.a.c.d;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

public class ObjectIdReader implements Serializable {
    public final SettableBeanProperty Y1;
    public final JavaType c;
    public final PropertyName d;
    public final ObjectIdGenerator<?> q;
    public final z x;
    public final d<Object> y;

    public ObjectIdReader(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, d<?> dVar, SettableBeanProperty settableBeanProperty, z zVar) {
        this.c = javaType;
        this.d = propertyName;
        this.q = objectIdGenerator;
        this.x = zVar;
        this.y = dVar;
        this.Y1 = settableBeanProperty;
    }

    public static ObjectIdReader a(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, d<?> dVar, SettableBeanProperty settableBeanProperty, z zVar) {
        return new ObjectIdReader(javaType, propertyName, objectIdGenerator, dVar, settableBeanProperty, zVar);
    }

    public boolean b() {
        Objects.requireNonNull(this.q);
        return false;
    }

    public Object c(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this.y.d(jsonParser, deserializationContext);
    }
}
