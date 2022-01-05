package kotlin;

import java.io.Serializable;
import m0.c;
import m0.g;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: LazyJVM.kt */
public final class SynchronizedLazyImpl<T> implements c<T>, Serializable {
    public a<? extends T> c;
    public volatile Object d = g.a;
    public final Object q = this;

    public SynchronizedLazyImpl(a aVar, Object obj, int i) {
        int i2 = i & 2;
        i.e(aVar, "initializer");
        this.c = aVar;
    }

    public T getValue() {
        T t;
        T t2 = this.d;
        T t3 = g.a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.q) {
            t = this.d;
            if (t == t3) {
                a aVar = this.c;
                i.c(aVar);
                t = aVar.invoke();
                this.d = t;
                this.c = null;
            }
        }
        return t;
    }

    public String toString() {
        return this.d != g.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
