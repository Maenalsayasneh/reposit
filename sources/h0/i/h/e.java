package h0.i.h;

/* compiled from: Pools */
public class e<T> extends d<T> {
    public final Object c = new Object();

    public e(int i) {
        super(i);
    }

    public T a() {
        T a;
        synchronized (this.c) {
            a = super.a();
        }
        return a;
    }

    public boolean b(T t) {
        boolean b;
        synchronized (this.c) {
            b = super.b(t);
        }
        return b;
    }
}
