package i0.b.a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: BoundViewHolders */
public class e implements Iterable<w> {
    public final h0.f.e<w> c = new h0.f.e<>();

    /* compiled from: BoundViewHolders */
    public class b implements Iterator<w> {
        public int c = 0;

        public b(a aVar) {
        }

        public boolean hasNext() {
            return this.c < e.this.c.r();
        }

        public Object next() {
            if (hasNext()) {
                h0.f.e<w> eVar = e.this.c;
                int i = this.c;
                this.c = i + 1;
                return eVar.s(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<w> iterator() {
        return new b((a) null);
    }
}
