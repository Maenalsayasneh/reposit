package i0.h.a.b.g.h;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class t1 implements Iterator<Map.Entry<K, V>> {
    public int c = -1;
    public boolean d;
    public Iterator<Map.Entry<K, V>> q;
    public final /* synthetic */ n1 x;

    public t1(n1 n1Var, m1 m1Var) {
        this.x = n1Var;
    }

    public final Iterator<Map.Entry<K, V>> a() {
        if (this.q == null) {
            this.q = this.x.x.entrySet().iterator();
        }
        return this.q;
    }

    public final boolean hasNext() {
        if (this.c + 1 < this.x.q.size() || (!this.x.x.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.d = true;
        int i = this.c + 1;
        this.c = i;
        if (i < this.x.q.size()) {
            return this.x.q.get(this.c);
        }
        return (Map.Entry) a().next();
    }

    public final void remove() {
        if (this.d) {
            this.d = false;
            n1 n1Var = this.x;
            int i = n1.c;
            n1Var.i();
            if (this.c < this.x.q.size()) {
                n1 n1Var2 = this.x;
                int i2 = this.c;
                this.c = i2 - 1;
                n1Var2.g(i2);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
