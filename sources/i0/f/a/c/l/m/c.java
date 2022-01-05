package i0.f.a.c.l.m;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import i0.f.a.c.d;
import java.io.IOException;

/* compiled from: ErrorThrowingDeserializer */
public class c extends d<Object> {
    public final Error c;

    public c(NoClassDefFoundError noClassDefFoundError) {
        this.c = noClassDefFoundError;
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        throw this.c;
    }
}
