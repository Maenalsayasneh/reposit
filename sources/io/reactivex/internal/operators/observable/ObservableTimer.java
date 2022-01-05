package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.l;
import k0.b.p;
import k0.b.q;
import k0.b.w.a;

public final class ObservableTimer extends l<Long> {
    public final q c;
    public final long d;
    public final TimeUnit q;

    public static final class TimerObserver extends AtomicReference<a> implements a, Runnable {
        public final p<? super Long> c;

        public TimerObserver(p<? super Long> pVar) {
            this.c = pVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        public void run() {
            if (!isDisposed()) {
                this.c.b(0L);
                lazySet(EmptyDisposable.INSTANCE);
                this.c.onComplete();
            }
        }
    }

    public ObservableTimer(long j, TimeUnit timeUnit, q qVar) {
        this.d = j;
        this.q = timeUnit;
        this.c = qVar;
    }

    public void u(p<? super Long> pVar) {
        TimerObserver timerObserver = new TimerObserver(pVar);
        pVar.a(timerObserver);
        DisposableHelper.trySet(timerObserver, this.c.c(timerObserver, this.d, this.q));
    }
}
