package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import k0.b.p;
import k0.b.z.c.b;

public final class ObservableScalarXMap$ScalarDisposable<T> extends AtomicInteger implements b<T>, Runnable {
    public final p<? super T> c;
    public final T d;

    public ObservableScalarXMap$ScalarDisposable(p<? super T> pVar, T t) {
        this.c = pVar;
        this.d = t;
    }

    public void clear() {
        lazySet(3);
    }

    public void dispose() {
        set(3);
    }

    public boolean isDisposed() {
        return get() == 3;
    }

    public boolean isEmpty() {
        return get() != 1;
    }

    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public T poll() throws Exception {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.d;
    }

    public int requestFusion(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        lazySet(1);
        return 1;
    }

    public void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.c.b(this.d);
            if (get() == 2) {
                lazySet(3);
                this.c.onComplete();
            }
        }
    }
}
