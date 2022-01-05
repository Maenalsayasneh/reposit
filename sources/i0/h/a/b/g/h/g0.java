package i0.h.a.b.g.h;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class g0<K> implements Iterator<Map.Entry<K, Object>> {
    public Iterator<Map.Entry<K, Object>> c;

    public g0(Iterator<Map.Entry<K, Object>> it) {
        this.c = it;
    }

    public final boolean hasNext() {
        return this.c.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.c.next();
        return next.getValue() instanceof d0 ? new e0(next, (f0) null) : next;
    }

    public final void remove() {
        this.c.remove();
    }
}
