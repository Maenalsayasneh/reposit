package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.r.d;
import java.math.BigDecimal;

public abstract class NumberSerializers$Base<T> extends StdScalarSerializer<T> implements d {
    public NumberSerializers$Base(Class<?> cls, JsonParser.NumberType numberType, String str) {
        super(cls, false);
        if (numberType != JsonParser.NumberType.INT && numberType != JsonParser.NumberType.LONG) {
            JsonParser.NumberType numberType2 = JsonParser.NumberType.BIG_INTEGER;
        }
    }

    public g<?> a(i iVar, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value m = m(iVar, beanProperty, this.d);
        if (m == null || m.q.ordinal() != 8) {
            return this;
        }
        if (this.d != BigDecimal.class) {
            return ToStringSerializer.q;
        }
        NumberSerializer numberSerializer = NumberSerializer.q;
        return NumberSerializer.BigDecimalAsStringSerializer.q;
    }
}
