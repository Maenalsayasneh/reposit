package i0.f.a.c.p;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;

/* compiled from: TypeDeserializer */
public abstract class b {
    public static Object a(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        Class<?> cls = javaType.c;
        Class<Boolean> cls2 = Boolean.class;
        JsonToken i = jsonParser.i();
        if (i == null) {
            return null;
        }
        switch (i.ordinal()) {
            case 7:
                if (cls.isAssignableFrom(String.class)) {
                    return jsonParser.Z();
                }
                return null;
            case 8:
                if (cls.isAssignableFrom(Integer.class)) {
                    return Integer.valueOf(jsonParser.I());
                }
                return null;
            case 9:
                if (cls.isAssignableFrom(Double.class)) {
                    return Double.valueOf(jsonParser.F());
                }
                return null;
            case 10:
                if (cls.isAssignableFrom(cls2)) {
                    return Boolean.TRUE;
                }
                return null;
            case 11:
                if (cls.isAssignableFrom(cls2)) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
    }

    public abstract Object b(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract Object c(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract b f(BeanProperty beanProperty);

    public abstract Class<?> g();

    public abstract String h();

    public abstract c i();

    public abstract JsonTypeInfo.As k();

    public boolean l() {
        return g() != null;
    }
}
