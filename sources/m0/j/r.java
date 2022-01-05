package m0.j;

import i0.d.a.a.a;
import java.util.List;
import m0.n.b.i;
import m0.q.e;

/* compiled from: ReversedViews.kt */
public final class r<T> extends b<T> {
    public final List<T> c;

    public r(List<T> list) {
        i.e(list, "delegate");
        this.c = list;
    }

    public void add(int i, T t) {
        List<T> list = this.c;
        int size = size();
        if (i < 0 || size < i) {
            StringBuilder Q0 = a.Q0("Position index ", i, " must be in range [");
            Q0.append(new e(0, size()));
            Q0.append("].");
            throw new IndexOutOfBoundsException(Q0.toString());
        }
        list.add(size() - i, t);
    }

    public int b() {
        return this.c.size();
    }

    public T c(int i) {
        return this.c.remove(g.a(this, i));
    }

    public void clear() {
        this.c.clear();
    }

    public T get(int i) {
        return this.c.get(g.a(this, i));
    }

    public T set(int i, T t) {
        return this.c.set(g.a(this, i), t);
    }
}
