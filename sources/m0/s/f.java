package m0.s;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: Sequences.kt */
public final class f<T, R, E> implements h<E> {
    public final h<T> a;
    public final l<T, R> b;
    public final l<R, Iterator<E>> c;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<E>, m0.n.b.s.a {
        public final Iterator<T> c;
        public Iterator<? extends E> d;
        public final /* synthetic */ f q;

        public a(f fVar) {
            this.q = fVar;
            this.c = fVar.a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it = this.d;
            if (it != null && !it.hasNext()) {
                this.d = null;
            }
            while (true) {
                if (this.d == null) {
                    if (this.c.hasNext()) {
                        T next = this.c.next();
                        f fVar = this.q;
                        Iterator<? extends E> invoke = fVar.c.invoke(fVar.b.invoke(next));
                        if (invoke.hasNext()) {
                            this.d = invoke;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        public boolean hasNext() {
            return a();
        }

        public E next() {
            if (a()) {
                Iterator<? extends E> it = this.d;
                i.c(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(h<? extends T> hVar, l<? super T, ? extends R> lVar, l<? super R, ? extends Iterator<? extends E>> lVar2) {
        i.e(hVar, "sequence");
        i.e(lVar, "transformer");
        i.e(lVar2, "iterator");
        this.a = hVar;
        this.b = lVar;
        this.c = lVar2;
    }

    public Iterator<E> iterator() {
        return new a(this);
    }
}
