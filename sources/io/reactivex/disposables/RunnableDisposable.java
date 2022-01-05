package io.reactivex.disposables;

import k0.b.w.a;

public final class RunnableDisposable implements a {
    public RunnableDisposable(Runnable runnable) {
        super(runnable);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [io.reactivex.disposables.RunnableDisposable, java.util.concurrent.atomic.AtomicReference] */
    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            ((Runnable) andSet).run();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [io.reactivex.disposables.RunnableDisposable, java.util.concurrent.atomic.AtomicReference] */
    public final boolean isDisposed() {
        return get() == null;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [io.reactivex.disposables.RunnableDisposable, java.util.concurrent.atomic.AtomicReference] */
    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("RunnableDisposable(disposed=");
        P0.append(isDisposed());
        P0.append(", ");
        P0.append(get());
        P0.append(")");
        return P0.toString();
    }
}
