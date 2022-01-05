package io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicInteger;
import k0.b.z.c.b;

public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements b<T> {
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
