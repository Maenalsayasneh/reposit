package io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import k0.b.w.a;

public final class SequentialDisposable extends AtomicReference<a> implements a {
    public SequentialDisposable() {
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((a) get());
    }

    public SequentialDisposable(a aVar) {
        lazySet(aVar);
    }
}
