package kotlin;

import java.io.Serializable;
import m0.c;
import m0.g;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: Lazy.kt */
public final class UnsafeLazyImpl<T> implements c<T>, Serializable {
    public a<? extends T> c;
    public Object d = g.a;

    public UnsafeLazyImpl(a<? extends T> aVar) {
        i.e(aVar, "initializer");
        this.c = aVar;
    }

    public T getValue() {
        if (this.d == g.a) {
            a<? extends T> aVar = this.c;
            i.c(aVar);
            this.d = aVar.invoke();
            this.c = null;
        }
        return this.d;
    }

    public String toString() {
        return this.d != g.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
