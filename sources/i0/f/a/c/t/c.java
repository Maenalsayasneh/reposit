package i0.f.a.c.t;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayIterator */
public class c<T> implements Iterator<T>, Iterable<T> {
    public final T[] c;
    public int d = 0;

    public c(T[] tArr) {
        this.c = tArr;
    }

    public boolean hasNext() {
        return this.d < this.c.length;
    }

    public Iterator<T> iterator() {
        return this;
    }

    public T next() {
        int i = this.d;
        T[] tArr = this.c;
        if (i < tArr.length) {
            this.d = i + 1;
            return tArr[i];
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
