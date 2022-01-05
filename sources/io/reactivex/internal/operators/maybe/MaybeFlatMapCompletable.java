package io.reactivex.internal.operators.maybe;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.a;
import k0.b.c;
import k0.b.i;
import k0.b.k;
import k0.b.y.e;

public final class MaybeFlatMapCompletable<T> extends a {
    public final k<T> a;
    public final e<? super T, ? extends k0.b.e> b;

    public static final class FlatMapCompletableObserver<T> extends AtomicReference<k0.b.w.a> implements i<T>, c, k0.b.w.a {
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
                onError(th);
            }
        }
    }

    public MaybeFlatMapCompletable(k<T> kVar, e<? super T, ? extends k0.b.e> eVar) {
        this.a = kVar;
        this.b = eVar;
    }

    public void e(c cVar) {
        FlatMapCompletableObserver flatMapCompletableObserver = new FlatMapCompletableObserver(cVar, this.b);
        cVar.a(flatMapCompletableObserver);
        this.a.a(flatMapCompletableObserver);
    }
}
