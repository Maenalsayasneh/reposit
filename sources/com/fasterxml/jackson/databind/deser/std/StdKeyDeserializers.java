package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import i0.f.a.c.b;
import i0.f.a.c.l.h;
import i0.f.a.c.t.f;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class StdKeyDeserializers implements h, Serializable {
    public i0.f.a.c.h a(JavaType javaType, DeserializationConfig deserializationConfig, b bVar) throws JsonMappingException {
        StdKeyDeserializer.StringKD stringKD;
        int i;
        Class<?> cls = javaType.c;
        if (cls.isPrimitive()) {
            cls = f.N(cls);
        }
        Class<Object> cls2 = Object.class;
        Class<String> cls3 = String.class;
        if (cls == cls3 || cls == cls2 || cls == CharSequence.class || cls == Serializable.class) {
            if (cls == cls3) {
                stringKD = StdKeyDeserializer.StringKD.x;
            } else if (cls != cls2) {
                return new StdKeyDeserializer.StringKD(cls);
            } else {
                stringKD = StdKeyDeserializer.StringKD.y;
            }
            return stringKD;
        }
        if (cls == UUID.class) {
            i = 12;
        } else if (cls == Integer.class) {
            i = 5;
        } else if (cls == Long.class) {
            i = 6;
        } else if (cls == Date.class) {
            i = 10;
        } else if (cls == Calendar.class) {
            i = 11;
        } else if (cls == Boolean.class) {
            i = 1;
        } else if (cls == Byte.class) {
            i = 2;
        } else if (cls == Character.class) {
            i = 4;
        } else if (cls == Short.class) {
            i = 3;
        } else if (cls == Float.class) {
            i = 7;
        } else if (cls == Double.class) {
            i = 8;
        } else if (cls == URI.class) {
            i = 13;
        } else if (cls == URL.class) {
            i = 14;
        } else if (cls == Class.class) {
            i = 15;
        } else if (cls == Locale.class) {
            return new StdKeyDeserializer(9, cls, FromStringDeserializer.B0(Locale.class));
        } else {
            if (cls == Currency.class) {
                return new StdKeyDeserializer(16, cls, FromStringDeserializer.B0(Currency.class));
            }
            if (cls != byte[].class) {
                return null;
            }
            i = 17;
        }
        return new StdKeyDeserializer(i, cls);
    }
}
