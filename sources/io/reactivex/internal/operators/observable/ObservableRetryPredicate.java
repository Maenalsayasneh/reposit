package io.reactivex.internal.operators.observable;

import androidx.recyclerview.widget.RecyclerView;
import i0.j.f.p.h;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import k0.b.l;
import k0.b.o;
import k0.b.p;
import k0.b.y.f;
import k0.b.z.e.c.a;

public final class ObservableRetryPredicate<T> extends a<T, T> {
    public final f<? super Throwable> d;
    public final long q;

    public static final class RepeatObserver<T> extends AtomicInteger implements p<T> {
        public final p<? super T> c;
        public final SequentialDisposable d;
        public final o<? extends T> q;
        public final f<? super Throwable> x;
        public long y;

        public RepeatObserver(p<? super T> pVar, long j, f<? super Throwable> fVar, SequentialDisposable sequentialDisposable, o<? extends T> oVar) {
            this.c = pVar;
            this.d = sequentialDisposable;
            this.q = oVar;
            this.x = fVar;
            this.y = j;
        }

        public void a(k0.b.w.a aVar) {
            SequentialDisposable sequentialDisposable = this.d;
            Objects.requireNonNull(sequentialDisposable);
            DisposableHelper.replace(sequentialDisposable, aVar);
        }

        public void b(T t) {
            this.c.b(t);
        }

        public void c() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.d.isDisposed()) {
                    this.q.c(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        public void onComplete() {
            this.c.onComplete();
        }

        public void onError(Throwable th) {
            long j = this.y;
            if (j != RecyclerView.FOREVER_NS) {
                this.y = j - 1;
            }
            if (j == 0) {
                this.c.onError(th);
                return;
            }
            try {
                if (!this.x.test(th)) {
                    this.c.onError(th);
                } else {
                    c();
                }
            } catch (Throwable th2) {
                h.c4(th2);
                this.c.onError(new CompositeException(th, th2));
            }
        }
    }

    public ObservableRetryPredicate(l<T> lVar, long j, f<? super Throwable> fVar) {
        super(lVar);
        this.d = fVar;
        this.q = j;
    }

    public void u(p<? super T> pVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        pVar.a(sequentialDisposable);
        new RepeatObserver(pVar, this.q, this.d, sequentialDisposable, this.c).c();
    }
}
