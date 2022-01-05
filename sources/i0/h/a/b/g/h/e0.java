package i0.h.a.b.g.h;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class e0<K> implements Map.Entry<K, Object> {
    public Map.Entry<K, d0> c;

    public e0(Map.Entry entry, f0 f0Var) {
        this.c = entry;
    }

    public final K getKey() {
        return this.c.getKey();
    }

    public final Object getValue() {
        if (this.c.getValue() == null) {
            return null;
        }
        int i = d0.a;
        throw new NoSuchMethodError();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof y0) {
            d0 value = this.c.getValue();
            y0 y0Var = value.b;
            value.b = (y0) obj;
            return y0Var;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
