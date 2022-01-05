package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.exc.InvalidNullException;
import i0.f.a.c.l.i;
import i0.f.a.c.t.f;
import java.io.Serializable;
import java.lang.annotation.Annotation;

public class NullsFailProvider implements i, Serializable {
    public final PropertyName c;
    public final JavaType d;

    public NullsFailProvider(PropertyName propertyName, JavaType javaType) {
        this.c = propertyName;
        this.d = javaType;
    }

    public static NullsFailProvider a(JavaType javaType) {
        return new NullsFailProvider((PropertyName) null, javaType);
    }

    public Object b(DeserializationContext deserializationContext) throws JsonMappingException {
        String str;
        PropertyName propertyName = this.c;
        int i = InvalidNullException.x;
        Object[] objArr = new Object[1];
        Annotation[] annotationArr = f.a;
        if (propertyName == null) {
            str = "<UNKNOWN>";
        } else {
            str = String.format("\"%s\"", new Object[]{propertyName});
        }
        objArr[0] = str;
        throw new InvalidNullException(deserializationContext, String.format("Invalid `null` value encountered for property %s", objArr), propertyName);
    }
}
