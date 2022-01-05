package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.c;
import k0.b.e;

public final class CompletableAndThenCompletable extends k0.b.a {
    public final e a;
    public final e b;

    public static final class SourceObserver extends AtomicReference<k0.b.w.a> implements c, k0.b.w.a {
        public final c c;
        public final e d;

        public SourceObserver(c cVar, e eVar) {
            this.c = cVar;
            this.d = eVar;
        }

        public void a(k0.b.w.a aVar) {
            if (DisposableHelper.setOnce(this, aVar)) {
                this.c.a(this);
            }
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((k0.b.w.a) get());
        }

        public void onComplete() {
            this.d.a(new a(this, this.c));
        }

        public void onError(Throwable th) {
            this.c.onError(th);
        }
    }

    public static final class a implements c {
        public final AtomicReference<k0.b.w.a> c;
        public final c d;

        public a(AtomicReference<k0.b.w.a> atomicReference, c cVar) {
            this.c = atomicReference;
            this.d = cVar;
        }

        public void a(k0.b.w.a aVar) {
            DisposableHelper.replace(this.c, aVar);
        }

        public void onComplete() {
            this.d.onComplete();
        }

        public void onError(Throwable th) {
            this.d.onError(th);
        }
    }

    public CompletableAndThenCompletable(e eVar, e eVar2) {
        this.a = eVar;
        this.b = eVar2;
    }

    public void e(c cVar) {
        this.a.a(new SourceObserver(cVar, this.b));
    }
}
