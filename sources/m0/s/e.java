package m0.s;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: Sequences.kt */
public final class e<T> implements h<T> {
    public final h<T> a;
    public final boolean b;
    public final l<T, Boolean> c;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, m0.n.b.s.a {
        public final Iterator<T> c;
        public int d = -1;
        public T q;
        public final /* synthetic */ e x;

        public a(e eVar) {
            this.x = eVar;
            this.c = eVar.a.iterator();
        }

        public final void a() {
            while (this.c.hasNext()) {
                T next = this.c.next();
                if (this.x.c.invoke(next).booleanValue() == this.x.b) {
                    this.q = next;
                    this.d = 1;
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

    public e(h<? extends T> hVar, boolean z, l<? super T, Boolean> lVar) {
        i.e(hVar, "sequence");
        i.e(lVar, "predicate");
        this.a = hVar;
        this.b = z;
        this.c = lVar;
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
