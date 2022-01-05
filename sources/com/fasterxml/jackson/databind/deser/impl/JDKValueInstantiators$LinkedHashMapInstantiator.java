package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedHashMap;

public class JDKValueInstantiators$LinkedHashMapInstantiator extends ValueInstantiator.Base implements Serializable {
    public static final JDKValueInstantiators$LinkedHashMapInstantiator d = new JDKValueInstantiators$LinkedHashMapInstantiator();

    public JDKValueInstantiators$LinkedHashMapInstantiator() {
        super((Class<?>) LinkedHashMap.class);
    }

    public Object C(DeserializationContext deserializationContext) throws IOException {
        return new LinkedHashMap();
    }

    public boolean k() {
        return true;
    }

    public boolean m() {
        return true;
    }
}
