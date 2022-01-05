package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.l;
import k0.b.p;
import k0.b.q;
import k0.b.w.a;
import k0.b.z.g.i;

public final class ObservableInterval extends l<Long> {
    public final q c;
    public final long d;
    public final long q;
    public final TimeUnit x;

    public static final class IntervalObserver extends AtomicReference<a> implements a, Runnable {
        public final p<? super Long> c;
        public long d;

        public IntervalObserver(p<? super Long> pVar) {
            this.c = pVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        public void run() {
            if (get() != DisposableHelper.DISPOSED) {
                p<? super Long> pVar = this.c;
                long j = this.d;
                this.d = 1 + j;
                pVar.b(Long.valueOf(j));
            }
        }
    }

    public ObservableInterval(long j, long j2, TimeUnit timeUnit, q qVar) {
        this.d = j;
        this.q = j2;
        this.x = timeUnit;
        this.c = qVar;
    }

    public void u(p<? super Long> pVar) {
        IntervalObserver intervalObserver = new IntervalObserver(pVar);
        pVar.a(intervalObserver);
        q qVar = this.c;
        if (qVar instanceof i) {
            q.c a = qVar.a();
            DisposableHelper.setOnce(intervalObserver, a);
            a.d(intervalObserver, this.d, this.q, this.x);
            return;
        }
        DisposableHelper.setOnce(intervalObserver, qVar.d(intervalObserver, this.d, this.q, this.x));
    }
}
