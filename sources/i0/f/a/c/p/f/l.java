package i0.f.a.c.p.f;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import i0.f.a.c.p.c;
import i0.f.a.c.p.e;
import java.io.IOException;
import java.util.Objects;

/* compiled from: TypeSerializerBase */
public abstract class l extends e {
    public final c a;
    public final BeanProperty b;

    public l(c cVar, BeanProperty beanProperty) {
        this.a = cVar;
        this.b = beanProperty;
    }

    public String b() {
        return null;
    }

    public WritableTypeId e(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        String str;
        if (writableTypeId.c == null) {
            Object obj = writableTypeId.a;
            Class<?> cls = writableTypeId.b;
            if (cls == null) {
                str = this.a.a(obj);
            } else {
                str = this.a.e(obj, cls);
            }
            writableTypeId.c = str;
        }
        Objects.requireNonNull(jsonGenerator);
        Object obj2 = writableTypeId.c;
        JsonToken jsonToken = writableTypeId.f;
        if (jsonGenerator.f()) {
            writableTypeId.g = false;
            jsonGenerator.S0(obj2);
        } else {
            String valueOf = obj2 instanceof String ? (String) obj2 : String.valueOf(obj2);
            writableTypeId.g = true;
            WritableTypeId.Inclusion inclusion = writableTypeId.e;
            if (jsonToken != JsonToken.START_OBJECT && inclusion.requiresObjectContext()) {
                inclusion = WritableTypeId.Inclusion.WRAPPER_ARRAY;
                writableTypeId.e = inclusion;
            }
            int ordinal = inclusion.ordinal();
            if (ordinal == 1) {
                jsonGenerator.M0();
                jsonGenerator.b0(valueOf);
            } else if (ordinal == 2) {
                jsonGenerator.N0(writableTypeId.a);
                jsonGenerator.b0(writableTypeId.d);
                jsonGenerator.Q0(valueOf);
                return writableTypeId;
            } else if (!(ordinal == 3 || ordinal == 4)) {
                jsonGenerator.I0();
                jsonGenerator.Q0(valueOf);
            }
        }
        if (jsonToken == JsonToken.START_OBJECT) {
            jsonGenerator.N0(writableTypeId.a);
        } else if (jsonToken == JsonToken.START_ARRAY) {
            jsonGenerator.I0();
        }
        return writableTypeId;
    }

    public WritableTypeId f(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        Objects.requireNonNull(jsonGenerator);
        JsonToken jsonToken = writableTypeId.f;
        if (jsonToken == JsonToken.START_OBJECT) {
            jsonGenerator.U();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            jsonGenerator.T();
        }
        if (writableTypeId.g) {
            int ordinal = writableTypeId.e.ordinal();
            if (ordinal == 0) {
                jsonGenerator.T();
            } else if (!(ordinal == 2 || ordinal == 3)) {
                if (ordinal != 4) {
                    jsonGenerator.U();
                } else {
                    Object obj = writableTypeId.c;
                    String valueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
                    jsonGenerator.b0(writableTypeId.d);
                    jsonGenerator.Q0(valueOf);
                }
            }
        }
        return writableTypeId;
    }
}
