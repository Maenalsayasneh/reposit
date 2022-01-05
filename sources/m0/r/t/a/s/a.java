package m0.r.t.a.s;

import java.util.Iterator;

/* compiled from: ConsPStack */
public final class a<E> implements Iterable<E> {
    public static final a<Object> c = new a<>();
    public final E d;
    public final a<E> q;
    public final int x;

    /* renamed from: m0.r.t.a.s.a$a  reason: collision with other inner class name */
    /* compiled from: ConsPStack */
    public static class C0277a<E> implements Iterator<E> {
        public a<E> c;

        public C0277a(a<E> aVar) {
            this.c = aVar;
        }

        public boolean hasNext() {
            return this.c.x > 0;
        }

        public E next() {
            a<E> aVar = this.c;
            E e = aVar.d;
            this.c = aVar.q;
            return e;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public a() {
        this.x = 0;
        this.d = null;
        this.q = null;
    }

    public final a<E> b(Object obj) {
        if (this.x == 0) {
            return this;
        }
        if (this.d.equals(obj)) {
            return this.q;
        }
        a<E> b = this.q.b(obj);
        if (b == this.q) {
            return this;
        }
        return new a<>(this.d, b);
    }

    public final a<E> c(int i) {
        if (i < 0 || i > this.x) {
            throw new IndexOutOfBoundsException();
        } else if (i == 0) {
            return this;
        } else {
            return this.q.c(i - 1);
        }
    }

    public Iterator<E> iterator() {
        return new C0277a(c(0));
    }

    public a(E e, a<E> aVar) {
        this.d = e;
        this.q = aVar;
        this.x = aVar.x + 1;
    }
}
