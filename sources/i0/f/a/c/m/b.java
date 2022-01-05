package i0.f.a.c.m;

import com.fasterxml.jackson.databind.ext.NioPathDeserializer;
import com.fasterxml.jackson.databind.ext.NioPathSerializer;
import i0.f.a.c.d;
import i0.f.a.c.g;
import java.nio.file.Path;

/* compiled from: Java7HandlersImpl */
public class b extends a {
    public final Class<?> b = Path.class;

    public d<?> a(Class<?> cls) {
        if (cls == this.b) {
            return new NioPathDeserializer();
        }
        return null;
    }

    public g<?> b(Class<?> cls) {
        if (this.b.isAssignableFrom(cls)) {
            return new NioPathSerializer();
        }
        return null;
    }
}
