package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import i0.f.a.c.p.b;
import i0.f.a.c.t.f;
import java.io.IOException;
import java.lang.reflect.Constructor;

public final class InnerClassProperty extends SettableBeanProperty.Delegating {
    public final transient Constructor<?> i2;

    public InnerClassProperty(SettableBeanProperty settableBeanProperty, Constructor<?> constructor) {
        super(settableBeanProperty);
        this.i2 = constructor;
    }

    public SettableBeanProperty V(SettableBeanProperty settableBeanProperty) {
        if (settableBeanProperty == this.h2) {
            return this;
        }
        return new InnerClassProperty(settableBeanProperty, this.i2);
    }

    public void k(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object obj2;
        if (jsonParser.i() == JsonToken.VALUE_NULL) {
            obj2 = this.a2.b(deserializationContext);
        } else {
            b bVar = this.b2;
            if (bVar != null) {
                obj2 = this.a2.f(jsonParser, deserializationContext, bVar);
            } else {
                try {
                    Object newInstance = this.i2.newInstance(new Object[]{obj});
                    this.a2.e(jsonParser, deserializationContext, newInstance);
                    obj2 = newInstance;
                } catch (Exception e) {
                    f.L(e, String.format("Failed to instantiate class %s, problem: %s", new Object[]{this.i2.getDeclaringClass().getName(), e.getMessage()}));
                    throw null;
                }
            }
        }
        this.h2.I(obj, obj2);
    }

    public Object l(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return this.h2.J(obj, i(jsonParser, deserializationContext));
    }
}
