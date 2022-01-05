package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.o;
import k0.b.p;
import k0.b.q;

public final class ObservableSubscribeOn<T> extends k0.b.z.e.c.a<T, T> {
    public final q d;

    public static final class SubscribeOnObserver<T> extends AtomicReference<k0.b.w.a> implements p<T>, k0.b.w.a {
        public final p<? super T> c;
        public final AtomicReference<k0.b.w.a> d = new AtomicReference<>();

        public SubscribeOnObserver(p<? super T> pVar) {
            this.c = pVar;
        }

        public void a(k0.b.w.a aVar) {
            DisposableHelper.setOnce(this.d, aVar);
        }

        public void b(T t) {
            this.c.b(t);
        }

        public void dispose() {
            DisposableHelper.dispose(this.d);
            DisposableHelper.dispose(this);
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
    }

    public final class a implements Runnable {
        public final SubscribeOnObserver<T> c;

        public a(SubscribeOnObserver<T> subscribeOnObserver) {
            this.c = subscribeOnObserver;
        }

        public void run() {
            ObservableSubscribeOn.this.c.c(this.c);
        }
    }

    public ObservableSubscribeOn(o<T> oVar, q qVar) {
        super(oVar);
        this.d = qVar;
    }

    public void u(p<? super T> pVar) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(pVar);
        pVar.a(subscribeOnObserver);
        DisposableHelper.setOnce(subscribeOnObserver, this.d.b(new a(subscribeOnObserver)));
    }
}
