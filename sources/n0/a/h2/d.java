package n0.a.h2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: Atomic.kt */
public abstract class d<T> extends p {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = c.a;

    public d<?> a() {
        return this;
    }

    public final Object c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == c.a) {
            obj2 = e(i(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(T t, Object obj);

    public final Object e(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = c.a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (a.compareAndSet(this, obj3, obj)) {
            return obj;
        }
        return this._consensus;
    }

    public final Object f() {
        return this._consensus;
    }

    public long g() {
        return 0;
    }

    public final boolean h() {
        return this._consensus != c.a;
    }

    public abstract Object i(T t);
}
