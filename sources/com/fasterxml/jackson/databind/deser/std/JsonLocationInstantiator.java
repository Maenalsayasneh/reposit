package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.c.p.b;
import i0.f.a.c.t.a;

public class JsonLocationInstantiator extends ValueInstantiator.Base {
    public JsonLocationInstantiator() {
        super((Class<?>) JsonLocation.class);
    }

    public static CreatorProperty O(String str, JavaType javaType, int i) {
        return CreatorProperty.V(PropertyName.a(str), javaType, (PropertyName) null, (b) null, (a) null, (AnnotatedParameter) null, i, (JacksonInject.Value) null, PropertyMetadata.c);
    }

    public SettableBeanProperty[] M(DeserializationConfig deserializationConfig) {
        JavaType d = deserializationConfig.d(Integer.TYPE);
        JavaType d2 = deserializationConfig.d(Long.TYPE);
        return new SettableBeanProperty[]{O("sourceRef", deserializationConfig.d.d.b((i0.f.a.c.s.a) null, Object.class, TypeFactory.q), 0), O("byteOffset", d2, 1), O("charOffset", d2, 2), O("lineNr", d, 3), O("columnNr", d, 4)};
    }

    public Object y(DeserializationContext deserializationContext, Object[] objArr) {
        long j;
        long j2;
        int i;
        int i2;
        Object obj = objArr[0];
        Number number = objArr[1];
        if (number == null) {
            j = 0;
        } else {
            j = number.longValue();
        }
        Number number2 = objArr[2];
        if (number2 == null) {
            j2 = 0;
        } else {
            j2 = number2.longValue();
        }
        Number number3 = objArr[3];
        if (number3 == null) {
            i = 0;
        } else {
            i = number3.intValue();
        }
        Number number4 = objArr[4];
        if (number4 == null) {
            i2 = 0;
        } else {
            i2 = number4.intValue();
        }
        return new JsonLocation(obj, j, j2, i, i2);
    }
}
