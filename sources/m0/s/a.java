package m0.s;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import m0.n.b.i;

/* compiled from: SequencesJVM.kt */
public final class a<T> implements h<T> {
    public final AtomicReference<h<T>> a;

    public a(h<? extends T> hVar) {
        i.e(hVar, "sequence");
        this.a = new AtomicReference<>(hVar);
    }

    public Iterator<T> iterator() {
        h andSet = this.a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
