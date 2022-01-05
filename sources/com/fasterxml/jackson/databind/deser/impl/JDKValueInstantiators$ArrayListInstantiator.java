package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class JDKValueInstantiators$ArrayListInstantiator extends ValueInstantiator.Base implements Serializable {
    public static final JDKValueInstantiators$ArrayListInstantiator d = new JDKValueInstantiators$ArrayListInstantiator();

    public JDKValueInstantiators$ArrayListInstantiator() {
        super((Class<?>) ArrayList.class);
    }

    public Object C(DeserializationContext deserializationContext) throws IOException {
        return new ArrayList();
    }

    public boolean k() {
        return true;
    }

    public boolean m() {
        return true;
    }
}
