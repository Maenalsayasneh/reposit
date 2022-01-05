package i0.h.c.j;

import i0.h.c.q.b;
import java.util.Set;

/* compiled from: AbstractComponentContainer */
public abstract class a implements e {
    public <T> T a(Class<T> cls) {
        b<T> b = b(cls);
        if (b == null) {
            return null;
        }
        return b.get();
    }

    public <T> Set<T> d(Class<T> cls) {
        return c(cls).get();
    }
}
