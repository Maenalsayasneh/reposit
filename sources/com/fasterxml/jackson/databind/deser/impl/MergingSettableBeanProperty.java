package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;

public class MergingSettableBeanProperty extends SettableBeanProperty.Delegating {
    public final AnnotatedMember i2;

    public MergingSettableBeanProperty(SettableBeanProperty settableBeanProperty, AnnotatedMember annotatedMember) {
        super(settableBeanProperty);
        this.i2 = annotatedMember;
    }

    public void I(Object obj, Object obj2) throws IOException {
        if (obj2 != null) {
            this.h2.I(obj, obj2);
        }
    }

    public Object J(Object obj, Object obj2) throws IOException {
        return obj2 != null ? this.h2.J(obj, obj2) : obj;
    }

    public SettableBeanProperty V(SettableBeanProperty settableBeanProperty) {
        return new MergingSettableBeanProperty(settableBeanProperty, this.i2);
    }

    public void k(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object obj2;
        Object l = this.i2.l(obj);
        if (l == null) {
            obj2 = this.h2.i(jsonParser, deserializationContext);
        } else {
            obj2 = this.h2.m(jsonParser, deserializationContext, l);
        }
        if (obj2 != l) {
            this.h2.I(obj, obj2);
        }
    }

    public Object l(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object obj2;
        Object l = this.i2.l(obj);
        if (l == null) {
            obj2 = this.h2.i(jsonParser, deserializationContext);
        } else {
            obj2 = this.h2.m(jsonParser, deserializationContext, l);
        }
        return (obj2 == l || obj2 == null) ? obj : this.h2.J(obj, obj2);
    }
}
