package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import i0.f.a.c.n.j;
import java.io.Serializable;

public abstract class PropertyWriter extends ConcreteBeanPropertyBase implements Serializable {
    public PropertyWriter(PropertyMetadata propertyMetadata) {
        super(propertyMetadata);
    }

    public PropertyWriter(j jVar) {
        super(jVar.f());
    }

    public PropertyWriter(PropertyWriter propertyWriter) {
        super((ConcreteBeanPropertyBase) propertyWriter);
    }
}
