package m0.j;

import java.util.AbstractList;
import java.util.List;
import m0.n.b.s.c;

/* compiled from: AbstractMutableList.kt */
public abstract class b<E> extends AbstractList<E> implements List<E>, c {
    public abstract int b();

    public abstract E c(int i);

    public final /* bridge */ E remove(int i) {
        return c(i);
    }

    public final /* bridge */ int size() {
        return b();
    }
}
