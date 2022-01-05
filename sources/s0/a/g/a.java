package s0.a.g;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class a<T> implements Iterator<T> {
    public final T[] c;
    public int d = 0;

    public a(T[] tArr) {
        this.c = tArr;
    }

    public boolean hasNext() {
        return this.d < this.c.length;
    }

    public T next() {
        int i = this.d;
        T[] tArr = this.c;
        if (i != tArr.length) {
            this.d = i + 1;
            return tArr[i];
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Out of elements: ");
        P0.append(this.d);
        throw new NoSuchElementException(P0.toString());
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove element from an Array.");
    }
}
