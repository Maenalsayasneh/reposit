package h0.f;

import java.util.Map;

/* compiled from: ArraySet */
public class b extends g<E, E> {
    public final /* synthetic */ c d;

    public b(c cVar) {
        this.d = cVar;
    }

    public void a() {
        this.d.clear();
    }

    public Object b(int i, int i2) {
        return this.d.a2[i];
    }

    public Map<E, E> c() {
        throw new UnsupportedOperationException("not a map");
    }

    public int d() {
        return this.d.b2;
    }

    public int e(Object obj) {
        return this.d.indexOf(obj);
    }

    public int f(Object obj) {
        return this.d.indexOf(obj);
    }

    public void g(E e, E e2) {
        this.d.add(e);
    }

    public void h(int i) {
        this.d.k(i);
    }

    public E i(int i, E e) {
        throw new UnsupportedOperationException("not a map");
    }
}
