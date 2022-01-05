package m0.r.t.a.r.h;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList */
public class r extends AbstractList<String> implements RandomAccess, j {
    public final j c;

    /* compiled from: UnmodifiableLazyStringList */
    public class a implements ListIterator<String> {
        public ListIterator<String> c;
        public final /* synthetic */ int d;

        public a(int i) {
            this.d = i;
            this.c = r.this.c.listIterator(i);
        }

        public void add(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.c.hasNext();
        }

        public boolean hasPrevious() {
            return this.c.hasPrevious();
        }

        public Object next() {
            return this.c.next();
        }

        public int nextIndex() {
            return this.c.nextIndex();
        }

        public Object previous() {
            return this.c.previous();
        }

        public int previousIndex() {
            return this.c.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public void set(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList */
    public class b implements Iterator<String> {
        public Iterator<String> c;

        public b() {
            this.c = r.this.c.iterator();
        }

        public boolean hasNext() {
            return this.c.hasNext();
        }

        public Object next() {
            return this.c.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public r(j jVar) {
        this.c = jVar;
    }

    public Object get(int i) {
        return (String) this.c.get(i);
    }

    public List<?> h() {
        return this.c.h();
    }

    public Iterator<String> iterator() {
        return new b();
    }

    public ListIterator<String> listIterator(int i) {
        return new a(i);
    }

    public c m(int i) {
        return this.c.m(i);
    }

    public j p() {
        return this;
    }

    public void q(c cVar) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.c.size();
    }
}
