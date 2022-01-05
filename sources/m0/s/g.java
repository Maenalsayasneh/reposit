package m0.s;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: Sequences.kt */
public final class g<T> implements h<T> {
    public final m0.n.a.a<T> a;
    public final l<T, T> b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, m0.n.b.s.a {
        public T c;
        public int d = -2;
        public final /* synthetic */ g q;

        public a(g gVar) {
            this.q = gVar;
        }

        public final void a() {
            T t;
            if (this.d == -2) {
                t = this.q.a.invoke();
            } else {
                l<T, T> lVar = this.q.b;
                T t2 = this.c;
                i.c(t2);
                t = lVar.invoke(t2);
            }
            this.c = t;
            this.d = t == null ? 0 : 1;
        }

        public boolean hasNext() {
            if (this.d < 0) {
                a();
            }
            return this.d == 1;
        }

        public T next() {
            if (this.d < 0) {
                a();
            }
            if (this.d != 0) {
                T t = this.c;
                Objects.requireNonNull(t, "null cannot be cast to non-null type T");
                this.d = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(m0.n.a.a<? extends T> aVar, l<? super T, ? extends T> lVar) {
        i.e(aVar, "getInitialValue");
        i.e(lVar, "getNextValue");
        this.a = aVar;
        this.b = lVar;
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
