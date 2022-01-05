package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import i0.f.a.c.d;
import i0.f.a.c.l.i;
import java.io.IOException;

public final class ObjectIdValueProperty extends SettableBeanProperty {
    public final ObjectIdReader h2;

    public ObjectIdValueProperty(ObjectIdReader objectIdReader, PropertyMetadata propertyMetadata) {
        super(objectIdReader.d, objectIdReader.c, propertyMetadata, objectIdReader.y);
        this.h2 = objectIdReader;
    }

    public void I(Object obj, Object obj2) throws IOException {
        J(obj, obj2);
    }

    public Object J(Object obj, Object obj2) throws IOException {
        SettableBeanProperty settableBeanProperty = this.h2.Y1;
        if (settableBeanProperty != null) {
            return settableBeanProperty.J(obj, obj2);
        }
        throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
    }

    public SettableBeanProperty O(PropertyName propertyName) {
        return new ObjectIdValueProperty(this, propertyName);
    }

    public SettableBeanProperty Q(i iVar) {
        return new ObjectIdValueProperty(this, this.a2, iVar);
    }

    public SettableBeanProperty T(d<?> dVar) {
        d<Object> dVar2 = this.a2;
        if (dVar2 == dVar) {
            return this;
        }
        i iVar = this.c2;
        if (dVar2 == iVar) {
            iVar = dVar;
        }
        return new ObjectIdValueProperty(this, dVar, iVar);
    }

    public AnnotatedMember a() {
        return null;
    }

    public void k(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        l(jsonParser, deserializationContext, obj);
    }

    public Object l(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (jsonParser.y0(JsonToken.VALUE_NULL)) {
            return null;
        }
        Object d = this.a2.d(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this.h2;
        deserializationContext.E(d, objectIdReader.q, objectIdReader.x).b(obj);
        SettableBeanProperty settableBeanProperty = this.h2.Y1;
        return settableBeanProperty != null ? settableBeanProperty.J(obj, d) : obj;
    }

    public ObjectIdValueProperty(ObjectIdValueProperty objectIdValueProperty, d<?> dVar, i iVar) {
        super(objectIdValueProperty, dVar, iVar);
        this.h2 = objectIdValueProperty.h2;
    }

    public ObjectIdValueProperty(ObjectIdValueProperty objectIdValueProperty, PropertyName propertyName) {
        super(objectIdValueProperty, propertyName);
        this.h2 = objectIdValueProperty.h2;
    }
}
