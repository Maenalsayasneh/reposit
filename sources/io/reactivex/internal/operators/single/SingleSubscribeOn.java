package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.q;
import k0.b.r;
import k0.b.t;
import k0.b.w.a;

public final class SingleSubscribeOn<T> extends r<T> {
    public final r<? extends T> a;
    public final q b;

    public static final class SubscribeOnObserver<T> extends AtomicReference<a> implements t<T>, a, Runnable {
        public final t<? super T> c;
        public final SequentialDisposable d = new SequentialDisposable();
        public final r<? extends T> q;

        public SubscribeOnObserver(t<? super T> tVar, r<? extends T> rVar) {
            this.c = tVar;
            this.q = rVar;
        }

        public void a(a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }

        public void dispose() {
            DisposableHelper.dispose(this);
            SequentialDisposable sequentialDisposable = this.d;
            Objects.requireNonNull(sequentialDisposable);
            DisposableHelper.dispose(sequentialDisposable);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((a) get());
        }

        public void onError(Throwable th) {
            this.c.onError(th);
        }

        public void onSuccess(T t) {
            this.c.onSuccess(t);
        }

        public void run() {
            this.q.a(this);
        }
    }

    public SingleSubscribeOn(r<? extends T> rVar, q qVar) {
        this.a = rVar;
        this.b = qVar;
    }

    public void b(t<? super T> tVar) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(tVar, this.a);
        tVar.a(subscribeOnObserver);
        a b2 = this.b.b(subscribeOnObserver);
        SequentialDisposable sequentialDisposable = subscribeOnObserver.d;
        Objects.requireNonNull(sequentialDisposable);
        DisposableHelper.replace(sequentialDisposable, b2);
    }
}
