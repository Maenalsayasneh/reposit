package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.c;
import m0.g;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: LazyJVM.kt */
public final class SafePublicationLazyImpl<T> implements c<T>, Serializable {
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> c = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "q");
    public volatile a<? extends T> d;
    public volatile Object q = g.a;

    public SafePublicationLazyImpl(a<? extends T> aVar) {
        i.e(aVar, "initializer");
        this.d = aVar;
    }

    public T getValue() {
        T t = this.q;
        T t2 = g.a;
        if (t != t2) {
            return t;
        }
        a<? extends T> aVar = this.d;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (c.compareAndSet(this, t2, invoke)) {
                this.d = null;
                return invoke;
            }
        }
        return this.q;
    }

    public String toString() {
        return this.q != g.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
