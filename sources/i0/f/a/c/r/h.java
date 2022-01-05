package i0.f.a.c.r;

import com.fasterxml.jackson.databind.JavaType;
import i0.f.a.c.g;
import i0.f.a.c.r.k.c;
import i0.f.a.c.t.t;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SerializerCache */
public final class h {
    public final HashMap<t, g<Object>> a = new HashMap<>(64);
    public final AtomicReference<c> b = new AtomicReference<>();

    public g<Object> a(JavaType javaType) {
        g<Object> gVar;
        synchronized (this) {
            gVar = this.a.get(new t(javaType, false));
        }
        return gVar;
    }

    public g<Object> b(Class<?> cls) {
        g<Object> gVar;
        synchronized (this) {
            gVar = this.a.get(new t(cls, false));
        }
        return gVar;
    }
}
