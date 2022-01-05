package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;

public class ValueInjector extends BeanProperty.Std {
    public final Object Y1;

    public ValueInjector(PropertyName propertyName, JavaType javaType, AnnotatedMember annotatedMember, Object obj) {
        super(propertyName, javaType, (PropertyName) null, annotatedMember, PropertyMetadata.d);
        this.Y1 = obj;
    }
}
