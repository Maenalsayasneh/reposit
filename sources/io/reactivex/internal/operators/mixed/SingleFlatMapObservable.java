package io.reactivex.internal.operators.mixed;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.l;
import k0.b.o;
import k0.b.p;
import k0.b.r;
import k0.b.t;
import k0.b.w.a;
import k0.b.y.e;

public final class SingleFlatMapObservable<T, R> extends l<R> {
    public final r<T> c;
    public final e<? super T, ? extends o<? extends R>> d;

    public static final class FlatMapObserver<T, R> extends AtomicReference<a> implements p<R>, t<T>, a {
        public final p<? super R> c;
        public final e<? super T, ? extends o<? extends R>> d;

        public FlatMapObserver(p<? super R> pVar, e<? super T, ? extends o<? extends R>> eVar) {
            this.c = pVar;
            this.d = eVar;
        }

        public void a(a aVar) {
            DisposableHelper.replace(this, aVar);
        }

        public void b(R r) {
            this.c.b(r);
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((a) get());
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
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                ((o) apply).c(this);
            } catch (Throwable th) {
                h.c4(th);
                this.c.onError(th);
            }
        }
    }

    public SingleFlatMapObservable(r<T> rVar, e<? super T, ? extends o<? extends R>> eVar) {
        this.c = rVar;
        this.d = eVar;
    }

    public void u(p<? super R> pVar) {
        FlatMapObserver flatMapObserver = new FlatMapObserver(pVar, this.d);
        pVar.a(flatMapObserver);
        this.c.a(flatMapObserver);
    }
}
