package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.EnumValues;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.r.k.b;
import i0.f.a.c.s.a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public abstract class StdKeySerializers {
    public static final g<Object> a = new StringKeySerializer();

    public static class Default extends StdSerializer<Object> {
        public final int q;

        public Default(int i, Class<?> cls) {
            super(cls, false);
            this.q = i;
        }

        public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            String str;
            switch (this.q) {
                case 1:
                    Date date = (Date) obj;
                    Objects.requireNonNull(iVar);
                    if (iVar.Y(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
                        jsonGenerator.b0(String.valueOf(date.getTime()));
                        return;
                    } else {
                        jsonGenerator.b0(iVar.x().format(date));
                        return;
                    }
                case 2:
                    long timeInMillis = ((Calendar) obj).getTimeInMillis();
                    Objects.requireNonNull(iVar);
                    if (iVar.Y(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
                        jsonGenerator.b0(String.valueOf(timeInMillis));
                        return;
                    } else {
                        jsonGenerator.b0(iVar.x().format(new Date(timeInMillis)));
                        return;
                    }
                case 3:
                    jsonGenerator.b0(((Class) obj).getName());
                    return;
                case 4:
                    if (iVar.Y(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                        str = obj.toString();
                    } else {
                        Enum enumR = (Enum) obj;
                        if (iVar.Y(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX)) {
                            str = String.valueOf(enumR.ordinal());
                        } else {
                            str = enumR.name();
                        }
                    }
                    jsonGenerator.b0(str);
                    return;
                case 5:
                case 6:
                    jsonGenerator.Y(((Number) obj).longValue());
                    return;
                case 7:
                    jsonGenerator.b0(iVar.q.d.e2.g((byte[]) obj, false));
                    return;
                default:
                    jsonGenerator.b0(obj.toString());
                    return;
            }
        }
    }

    public static class Dynamic extends StdSerializer<Object> {
        public transient b q = b.C0122b.b;

        public Dynamic() {
            super(String.class, false);
        }

        public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            Class<?> cls = obj.getClass();
            b bVar = this.q;
            g<Object> c = bVar.c(cls);
            if (c == null) {
                if (cls == Object.class) {
                    c = new Default(8, cls);
                    this.q = bVar.b(cls, c);
                } else {
                    c = iVar.E(iVar.q.d.d.b((a) null, cls, TypeFactory.q), (BeanProperty) null);
                    b b = bVar.b(cls, c);
                    if (bVar != b) {
                        this.q = b;
                    }
                }
            }
            c.f(obj, jsonGenerator, iVar);
        }
    }

    public static class EnumKeySerializer extends StdSerializer<Object> {
        public final EnumValues q;

        public EnumKeySerializer(Class<?> cls, EnumValues enumValues) {
            super(cls, false);
            this.q = enumValues;
        }

        public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            if (iVar.Y(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                jsonGenerator.b0(obj.toString());
                return;
            }
            Enum enumR = (Enum) obj;
            if (iVar.Y(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX)) {
                jsonGenerator.b0(String.valueOf(enumR.ordinal()));
            } else {
                jsonGenerator.Z(this.q.d[enumR.ordinal()]);
            }
        }
    }

    public static class StringKeySerializer extends StdSerializer<Object> {
        public StringKeySerializer() {
            super(String.class, false);
        }

        public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            jsonGenerator.b0((String) obj);
        }
    }

    static {
        new StdKeySerializer();
    }
}
