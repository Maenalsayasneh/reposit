package i0.h.a.b.g.h;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class y1 extends AbstractList<String> implements h0, RandomAccess {
    public final h0 c;

    public y1(h0 h0Var) {
        this.c = h0Var;
    }

    public final List<?> d() {
        return this.c.d();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.c.get(i);
    }

    public final Iterator<String> iterator() {
        return new a2(this);
    }

    public final h0 l() {
        return this;
    }

    public final ListIterator<String> listIterator(int i) {
        return new b2(this, i);
    }

    public final int size() {
        return this.c.size();
    }
}
