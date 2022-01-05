package m0.s;

import java.util.Iterator;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: Sequences.kt */
public final class q<T, R> implements h<R> {
    public final h<T> a;
    public final l<T, R> b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, m0.n.b.s.a {
        public final Iterator<T> c;
        public final /* synthetic */ q d;

        public a(q qVar) {
            this.d = qVar;
            this.c = qVar.a.iterator();
        }

        public boolean hasNext() {
            return this.c.hasNext();
        }

        public R next() {
            return this.d.b.invoke(this.c.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q(h<? extends T> hVar, l<? super T, ? extends R> lVar) {
        i.e(hVar, "sequence");
        i.e(lVar, "transformer");
        this.a = hVar;
        this.b = lVar;
    }

    public Iterator<R> iterator() {
        return new a(this);
    }
}
