package h0.u;

import java.util.List;
import m0.j.a;

/* compiled from: ItemSnapshotList.kt */
public final class i<T> extends a<T> {
    public final int c;
    public final int d;
    public final List<T> q;

    public i(int i, int i2, List<? extends T> list) {
        m0.n.b.i.e(list, "items");
        this.c = i;
        this.d = i2;
        this.q = list;
    }

    public int b() {
        return this.q.size() + this.c + this.d;
    }

    public T get(int i) {
        int i2 = this.c;
        if (i >= 0 && i2 > i) {
            return null;
        }
        int size = this.q.size() + i2;
        if (i2 <= i && size > i) {
            return this.q.get(i - this.c);
        }
        int size2 = this.q.size() + this.c;
        int b = b();
        if (size2 <= i && b > i) {
            return null;
        }
        StringBuilder Q0 = i0.d.a.a.a.Q0("Illegal attempt to access index ", i, " in ItemSnapshotList of size ");
        Q0.append(b());
        throw new IndexOutOfBoundsException(Q0.toString());
    }
}
