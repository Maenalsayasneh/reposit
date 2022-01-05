package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.q;
import k0.b.r;
import k0.b.t;
import k0.b.w.a;

public final class SingleObserveOn<T> extends r<T> {
    public final r<T> a;
    public final q b;

    public static final class ObserveOnSingleObserver<T> extends AtomicReference<a> implements t<T>, a, Runnable {
        public final t<? super T> c;
        public final q d;
        public T q;
        public Throwable x;

        public ObserveOnSingleObserver(t<? super T> tVar, q qVar) {
            this.c = tVar;
            this.d = qVar;
        }

        public void a(a aVar) {
            if (DisposableHelper.setOnce(this, aVar)) {
                this.c.a(this);
            }
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((a) get());
        }

        public void onError(Throwable th) {
            this.x = th;
            DisposableHelper.replace(this, this.d.b(this));
        }

        public void onSuccess(T t) {
            this.q = t;
            DisposableHelper.replace(this, this.d.b(this));
        }

        public void run() {
            Throwable th = this.x;
            if (th != null) {
                this.c.onError(th);
            } else {
                this.c.onSuccess(this.q);
            }
        }
    }

    public SingleObserveOn(r<T> rVar, q qVar) {
        this.a = rVar;
        this.b = qVar;
    }

    public void b(t<? super T> tVar) {
        this.a.a(new ObserveOnSingleObserver(tVar, this.b));
    }
}
