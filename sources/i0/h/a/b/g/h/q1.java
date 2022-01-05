package i0.h.a.b.g.h;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class q1 implements Comparable<q1>, Map.Entry<K, V> {
    public final K c;
    public V d;
    public final /* synthetic */ n1 q;

    public q1(n1 n1Var, Map.Entry<K, V> entry) {
        V value = entry.getValue();
        this.q = n1Var;
        this.c = (Comparable) entry.getKey();
        this.d = value;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.c.compareTo(((q1) obj).c);
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        K k = this.c;
        Object key = entry.getKey();
        if (k == null) {
            z = key == null;
        } else {
            z = k.equals(key);
        }
        if (z) {
            V v = this.d;
            Object value = entry.getValue();
            if (v == null) {
                z2 = value == null;
            } else {
                z2 = v.equals(value);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object getKey() {
        return this.c;
    }

    public final V getValue() {
        return this.d;
    }

    public final int hashCode() {
        K k = this.c;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.d;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        n1 n1Var = this.q;
        int i = n1.c;
        n1Var.i();
        V v2 = this.d;
        this.d = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 1);
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public q1(n1 n1Var, K k, V v) {
        this.q = n1Var;
        this.c = k;
        this.d = v;
    }
}
