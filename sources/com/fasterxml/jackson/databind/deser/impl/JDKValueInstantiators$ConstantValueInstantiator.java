package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.io.IOException;
import java.io.Serializable;

public class JDKValueInstantiators$ConstantValueInstantiator extends ValueInstantiator.Base implements Serializable {
    public final Object d;

    public JDKValueInstantiators$ConstantValueInstantiator(Object obj) {
        super(obj.getClass());
        this.d = obj;
    }

    public Object C(DeserializationContext deserializationContext) throws IOException {
        return this.d;
    }

    public boolean k() {
        return true;
    }

    public boolean m() {
        return true;
    }
}
