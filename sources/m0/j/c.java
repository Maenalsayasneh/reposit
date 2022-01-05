package m0.j;

import java.util.AbstractSet;
import java.util.Set;
import m0.n.b.s.d;

/* compiled from: AbstractMutableSet.kt */
public abstract class c<E> extends AbstractSet<E> implements Set<E>, d {
    public abstract int b();

    public final /* bridge */ int size() {
        return b();
    }
}
