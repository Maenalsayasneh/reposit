package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import k0.b.a;
import k0.b.c;
import k0.b.e;

public final class CompletableConcatArray extends a {
    public final e[] a;

    public static final class ConcatInnerObserver extends AtomicInteger implements c {
        public final c c;
        public final e[] d;
        public int q;
        public final SequentialDisposable x = new SequentialDisposable();

        public ConcatInnerObserver(c cVar, e[] eVarArr) {
            this.c = cVar;
            this.d = eVarArr;
        }

        public void a(k0.b.w.a aVar) {
            SequentialDisposable sequentialDisposable = this.x;
            Objects.requireNonNull(sequentialDisposable);
            DisposableHelper.replace(sequentialDisposable, aVar);
        }

        public void b() {
            if (!this.x.isDisposed() && getAndIncrement() == 0) {
                e[] eVarArr = this.d;
                while (!this.x.isDisposed()) {
                    int i = this.q;
                    this.q = i + 1;
                    if (i == eVarArr.length) {
                        this.c.onComplete();
                        return;
                    }
                    eVarArr[i].a(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void onComplete() {
            b();
        }

        public void onError(Throwable th) {
            this.c.onError(th);
        }
    }

    public CompletableConcatArray(e[] eVarArr) {
        this.a = eVarArr;
    }

    public void e(c cVar) {
        ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(cVar, this.a);
        cVar.a(concatInnerObserver.x);
        concatInnerObserver.b();
    }
}
