package io.reactivex.internal.operators.single;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.a;
import k0.b.c;
import k0.b.r;
import k0.b.t;
import k0.b.y.e;

public final class SingleFlatMapCompletable<T> extends a {
    public final r<T> a;
    public final e<? super T, ? extends k0.b.e> b;

    public static final class FlatMapCompletableObserver<T> extends AtomicReference<k0.b.w.a> implements t<T>, c, k0.b.w.a {
        public final c c;
        public final e<? super T, ? extends k0.b.e> d;

        public FlatMapCompletableObserver(c cVar, e<? super T, ? extends k0.b.e> eVar) {
            this.c = cVar;
            this.d = eVar;
        }

        public void a(k0.b.w.a aVar) {
            DisposableHelper.replace(this, aVar);
        }

        public void dispose() {
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

        public void onSuccess(T t) {
            try {
                Object apply = this.d.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                k0.b.e eVar = (k0.b.e) apply;
                if (!isDisposed()) {
                    eVar.a(this);
                }
            } catch (Throwable th) {
                h.c4(th);
                this.c.onError(th);
            }
        }
    }

    public SingleFlatMapCompletable(r<T> rVar, e<? super T, ? extends k0.b.e> eVar) {
        this.a = rVar;
        this.b = eVar;
    }

    public void e(c cVar) {
        FlatMapCompletableObserver flatMapCompletableObserver = new FlatMapCompletableObserver(cVar, this.b);
        cVar.a(flatMapCompletableObserver);
        this.a.a(flatMapCompletableObserver);
    }
}
