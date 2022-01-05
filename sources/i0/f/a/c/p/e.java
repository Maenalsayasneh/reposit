package i0.f.a.c.p;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import i0.f.a.b.m.k;
import java.io.IOException;

/* compiled from: TypeSerializer */
public abstract class e {
    public abstract e a(BeanProperty beanProperty);

    public abstract String b();

    public abstract JsonTypeInfo.As c();

    public WritableTypeId d(Object obj, JsonToken jsonToken) {
        WritableTypeId writableTypeId = new WritableTypeId(obj, jsonToken);
        int ordinal = c().ordinal();
        if (ordinal == 0) {
            writableTypeId.e = WritableTypeId.Inclusion.METADATA_PROPERTY;
            writableTypeId.d = b();
        } else if (ordinal == 1) {
            writableTypeId.e = WritableTypeId.Inclusion.WRAPPER_OBJECT;
        } else if (ordinal == 2) {
            writableTypeId.e = WritableTypeId.Inclusion.WRAPPER_ARRAY;
        } else if (ordinal == 3) {
            writableTypeId.e = WritableTypeId.Inclusion.PARENT_PROPERTY;
            writableTypeId.d = b();
        } else if (ordinal == 4) {
            writableTypeId.e = WritableTypeId.Inclusion.PAYLOAD_PROPERTY;
            writableTypeId.d = b();
        } else {
            k.a();
            throw null;
        }
        return writableTypeId;
    }

    public abstract WritableTypeId e(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException;

    public abstract WritableTypeId f(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException;
}
