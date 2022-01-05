package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.a;
import k0.b.c;
import k0.b.e;
import k0.b.q;

public final class CompletableSubscribeOn extends a {
    public final e a;
    public final q b;

    public static final class SubscribeOnObserver extends AtomicReference<k0.b.w.a> implements c, k0.b.w.a, Runnable {
        public final c c;
        public final SequentialDisposable d = new SequentialDisposable();
        public final e q;

        public SubscribeOnObserver(c cVar, e eVar) {
            this.c = cVar;
            this.q = eVar;
        }

        public void a(k0.b.w.a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }

        public void dispose() {
            DisposableHelper.dispose(this);
            SequentialDisposable sequentialDisposable = this.d;
            Objects.requireNonNull(sequentialDisposable);
            DisposableHelper.dispose(sequentialDisposable);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((k0.b.w.a) get());
        }

        public void onComplete() {
            this.c.onComplete();
        }

        public void onError(Throwable th) {
            this.c.onError(th);
        }

        public void run() {
            this.q.a(this);
        }
    }

    public CompletableSubscribeOn(e eVar, q qVar) {
        this.a = eVar;
        this.b = qVar;
    }

    public void e(c cVar) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(cVar, this.a);
        cVar.a(subscribeOnObserver);
        k0.b.w.a b2 = this.b.b(subscribeOnObserver);
        SequentialDisposable sequentialDisposable = subscribeOnObserver.d;
        Objects.requireNonNull(sequentialDisposable);
        DisposableHelper.replace(sequentialDisposable, b2);
    }
}
