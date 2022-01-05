package m0.s;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: Sequences.kt */
public final class p<T> implements h<T> {
    public final h<T> a;
    public final l<T, Boolean> b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, m0.n.b.s.a {
        public final Iterator<T> c;
        public int d = -1;
        public T q;
        public final /* synthetic */ p x;

        public a(p pVar) {
            this.x = pVar;
            this.c = pVar.a.iterator();
        }

        public final void a() {
            if (this.c.hasNext()) {
                T next = this.c.next();
                if (this.x.b.invoke(next).booleanValue()) {
                    this.d = 1;
                    this.q = next;
                    return;
                }
            }
            this.d = 0;
        }

        public boolean hasNext() {
            if (this.d == -1) {
                a();
            }
            return this.d == 1;
        }

        public T next() {
            if (this.d == -1) {
                a();
            }
            if (this.d != 0) {
                T t = this.q;
                this.q = null;
                this.d = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public p(h<? extends T> hVar, l<? super T, Boolean> lVar) {
        i.e(hVar, "sequence");
        i.e(lVar, "predicate");
        this.a = hVar;
        this.b = lVar;
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
