package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.r.d;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

@a
public class NumberSerializer extends StdScalarSerializer<Number> implements d {
    public static final NumberSerializer q = new NumberSerializer(Number.class);

    public static final class BigDecimalAsStringSerializer extends ToStringSerializerBase {
        public static final BigDecimalAsStringSerializer q = new BigDecimalAsStringSerializer();

        public BigDecimalAsStringSerializer() {
            super(BigDecimal.class);
        }

        public boolean d(i iVar, Object obj) {
            return false;
        }

        public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            String str;
            if (jsonGenerator.n(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN)) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                int scale = bigDecimal.scale();
                if (scale >= -9999 && scale <= 9999) {
                    str = bigDecimal.toPlainString();
                } else {
                    iVar.b0(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[]{Integer.valueOf(bigDecimal.scale()), 9999, 9999}), new Object[0]);
                    throw null;
                }
            } else {
                str = obj.toString();
            }
            jsonGenerator.Q0(str);
        }

        public String v(Object obj) {
            throw new IllegalStateException();
        }
    }

    public NumberSerializer(Class<? extends Number> cls) {
        super(cls, false);
        Class<BigInteger> cls2 = BigInteger.class;
    }

    public g<?> a(i iVar, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value m = m(iVar, beanProperty, this.d);
        if (m == null || m.q.ordinal() != 8) {
            return this;
        }
        if (this.d == BigDecimal.class) {
            return BigDecimalAsStringSerializer.q;
        }
        return ToStringSerializer.q;
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        Number number = (Number) obj;
        if (number instanceof BigDecimal) {
            jsonGenerator.n0((BigDecimal) number);
        } else if (number instanceof BigInteger) {
            jsonGenerator.p0((BigInteger) number);
        } else if (number instanceof Long) {
            jsonGenerator.i0(number.longValue());
        } else if (number instanceof Double) {
            jsonGenerator.d0(number.doubleValue());
        } else if (number instanceof Float) {
            jsonGenerator.f0(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            jsonGenerator.g0(number.intValue());
        } else {
            jsonGenerator.m0(number.toString());
        }
    }
}
