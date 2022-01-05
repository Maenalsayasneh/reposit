package i0.f.a.c.l;

import com.fasterxml.jackson.core.JsonLocation;
import i0.f.a.c.t.f;

/* compiled from: UnresolvedId */
public class k {
    public final Object a;
    public final JsonLocation b;
    public final Class<?> c;

    public k(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this.a = obj;
        this.c = cls;
        this.b = jsonLocation;
    }

    public String toString() {
        return String.format("Object id [%s] (for %s) at %s", new Object[]{this.a, f.E(this.c), this.b});
    }
}
