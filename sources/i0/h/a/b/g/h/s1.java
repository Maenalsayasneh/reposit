package i0.h.a.b.g.h;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public class s1 extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ n1 c;

    public s1(n1 n1Var, m1 m1Var) {
        this.c = n1Var;
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.c.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.c.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.c.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new t1(this.c, (m1) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.c.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.c.size();
    }
}
