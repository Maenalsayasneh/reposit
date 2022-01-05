package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import i0.f.a.c.p.b;
import i0.f.a.c.p.c;

public class AsExternalTypeDeserializer extends AsArrayTypeDeserializer {
    public AsExternalTypeDeserializer(JavaType javaType, c cVar, String str, boolean z, JavaType javaType2) {
        super(javaType, cVar, str, z, javaType2);
    }

    public b f(BeanProperty beanProperty) {
        if (beanProperty == this.q) {
            return this;
        }
        return new AsExternalTypeDeserializer(this, beanProperty);
    }

    public JsonTypeInfo.As k() {
        return JsonTypeInfo.As.EXTERNAL_PROPERTY;
    }

    public AsExternalTypeDeserializer(AsExternalTypeDeserializer asExternalTypeDeserializer, BeanProperty beanProperty) {
        super(asExternalTypeDeserializer, beanProperty);
    }
}
