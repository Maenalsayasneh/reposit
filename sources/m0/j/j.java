package m0.j;

import java.util.Iterator;
import m0.s.h;

/* compiled from: Sequences.kt */
public final class j implements h<T> {
    public final /* synthetic */ Iterable a;

    public j(Iterable iterable) {
        this.a = iterable;
    }

    public Iterator<T> iterator() {
        return this.a.iterator();
    }
}
