package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.EnumValues;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.r.d;
import java.io.IOException;
import java.util.Objects;

@a
public class EnumSerializer extends StdScalarSerializer<Enum<?>> implements d {
    public static final /* synthetic */ int q = 0;
    public final EnumValues x;
    public final Boolean y;

    public EnumSerializer(EnumValues enumValues, Boolean bool) {
        super(enumValues.c, false);
        this.x = enumValues;
        this.y = bool;
    }

    public static Boolean v(Class<?> cls, JsonFormat.Value value, boolean z, Boolean bool) {
        JsonFormat.Shape shape = value == null ? null : value.q;
        if (shape == null || shape == JsonFormat.Shape.ANY || shape == JsonFormat.Shape.SCALAR) {
            return bool;
        }
        if (shape == JsonFormat.Shape.STRING || shape == JsonFormat.Shape.NATURAL) {
            return Boolean.FALSE;
        }
        if (shape.isNumeric() || shape == JsonFormat.Shape.ARRAY) {
            return Boolean.TRUE;
        }
        Object[] objArr = new Object[3];
        objArr[0] = shape;
        objArr[1] = cls.getName();
        objArr[2] = z ? "class" : "property";
        throw new IllegalArgumentException(String.format("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", objArr));
    }

    public g<?> a(i iVar, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value m = m(iVar, beanProperty, this.d);
        if (m != null) {
            Boolean v = v(this.d, m, false, this.y);
            if (!Objects.equals(v, this.y)) {
                return new EnumSerializer(this.x, v);
            }
        }
        return this;
    }

    public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        boolean z;
        Enum enumR = (Enum) obj;
        Boolean bool = this.y;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = iVar.Y(SerializationFeature.WRITE_ENUMS_USING_INDEX);
        }
        if (z) {
            jsonGenerator.g0(enumR.ordinal());
        } else if (iVar.Y(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
            jsonGenerator.Q0(enumR.toString());
        } else {
            jsonGenerator.P0(this.x.d[enumR.ordinal()]);
        }
    }
}
