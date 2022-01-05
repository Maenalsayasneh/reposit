package m0.s;

import java.util.Iterator;
import m0.n.b.i;

/* compiled from: Sequences.kt */
public final class b<T> implements h<T>, c<T> {
    public final h<T> a;
    public final int b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, m0.n.b.s.a {
        public final Iterator<T> c;
        public int d;

        public a(b bVar) {
            this.c = bVar.a.iterator();
            this.d = bVar.b;
        }

        public final void a() {
            while (this.d > 0 && this.c.hasNext()) {
                this.c.next();
                this.d--;
            }
        }

        public boolean hasNext() {
            a();
            return this.c.hasNext();
        }

        public T next() {
            a();
            return this.c.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(h<? extends T> hVar, int i) {
        i.e(hVar, "sequence");
        this.a = hVar;
        this.b = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    public h<T> a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new b(this, i) : new b(this.a, i2);
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
