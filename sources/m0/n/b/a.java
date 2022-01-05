package m0.n.b;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayIterator.kt */
public final class a<T> implements Iterator<T>, m0.n.b.s.a {
    public int c;
    public final T[] d;

    public a(T[] tArr) {
        i.e(tArr, "array");
        this.d = tArr;
    }

    public boolean hasNext() {
        return this.c < this.d.length;
    }

    public T next() {
        try {
            T[] tArr = this.d;
            int i = this.c;
            this.c = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
