package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;

public class JDKValueInstantiators$HashMapInstantiator extends ValueInstantiator.Base implements Serializable {
    public static final JDKValueInstantiators$HashMapInstantiator d = new JDKValueInstantiators$HashMapInstantiator();

    public JDKValueInstantiators$HashMapInstantiator() {
        super((Class<?>) HashMap.class);
    }

    public Object C(DeserializationContext deserializationContext) throws IOException {
        return new HashMap();
    }

    public boolean k() {
        return true;
    }

    public boolean m() {
        return true;
    }
}
