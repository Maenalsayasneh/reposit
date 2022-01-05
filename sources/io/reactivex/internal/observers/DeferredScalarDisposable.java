package io.reactivex.internal.observers;

import k0.b.p;

public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {
    public final p<? super T> c;
    public T d;

    public DeferredScalarDisposable(p<? super T> pVar) {
        this.c = pVar;
    }

    public final void clear() {
        lazySet(32);
        this.d = null;
    }

    public void dispose() {
        set(4);
        this.d = null;
    }

    public final boolean isDisposed() {
        return get() == 4;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.d;
        this.d = null;
        lazySet(32);
        return t;
    }

    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }
}
