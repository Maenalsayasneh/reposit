package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import i0.d.a.a.a;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

public final class ManagedReferenceProperty extends SettableBeanProperty.Delegating {
    public final String i2;
    public final boolean j2;
    public final SettableBeanProperty k2;

    public ManagedReferenceProperty(SettableBeanProperty settableBeanProperty, String str, SettableBeanProperty settableBeanProperty2, boolean z) {
        super(settableBeanProperty);
        this.i2 = str;
        this.k2 = settableBeanProperty2;
        this.j2 = z;
    }

    public final void I(Object obj, Object obj2) throws IOException {
        J(obj, obj2);
    }

    public Object J(Object obj, Object obj2) throws IOException {
        if (obj2 != null) {
            if (!this.j2) {
                this.k2.I(obj2, obj);
            } else if (obj2 instanceof Object[]) {
                for (Object obj3 : (Object[]) obj2) {
                    if (obj3 != null) {
                        this.k2.I(obj3, obj);
                    }
                }
            } else if (obj2 instanceof Collection) {
                for (Object next : (Collection) obj2) {
                    if (next != null) {
                        this.k2.I(next, obj);
                    }
                }
            } else if (obj2 instanceof Map) {
                for (Object next2 : ((Map) obj2).values()) {
                    if (next2 != null) {
                        this.k2.I(next2, obj);
                    }
                }
            } else {
                StringBuilder P0 = a.P0("Unsupported container type (");
                P0.append(obj2.getClass().getName());
                P0.append(") when resolving reference '");
                throw new IllegalStateException(a.y0(P0, this.i2, "'"));
            }
        }
        return this.h2.J(obj, obj2);
    }

    public SettableBeanProperty V(SettableBeanProperty settableBeanProperty) {
        throw new IllegalStateException("Should never try to reset delegate");
    }

    public void k(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        J(obj, this.h2.i(jsonParser, deserializationContext));
    }

    public Object l(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return J(obj, i(jsonParser, deserializationContext));
    }

    public void n(DeserializationConfig deserializationConfig) {
        this.h2.n(deserializationConfig);
        this.k2.n(deserializationConfig);
    }
}
