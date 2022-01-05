package io.reactivex.internal.operators.maybe;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.i;
import k0.b.k;
import k0.b.y.e;
import k0.b.z.e.b.a;

public final class MaybeFlatten<T, R> extends a<T, R> {
    public final e<? super T, ? extends k<? extends R>> b;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<k0.b.w.a> implements i<T>, k0.b.w.a {
        public final i<? super R> c;
        public final e<? super T, ? extends k<? extends R>> d;
        public k0.b.w.a q;

        public final class a implements i<R> {
            public a() {
            }

            public void a(k0.b.w.a aVar) {
                DisposableHelper.setOnce(FlatMapMaybeObserver.this, aVar);
            }

            public void onComplete() {
                FlatMapMaybeObserver.this.c.onComplete();
            }

            public void onError(Throwable th) {
                FlatMapMaybeObserver.this.c.onError(th);
            }

            public void onSuccess(R r) {
                FlatMapMaybeObserver.this.c.onSuccess(r);
            }
        }

        public FlatMapMaybeObserver(i<? super R> iVar, e<? super T, ? extends k<? extends R>> eVar) {
            this.c = iVar;
            this.d = eVar;
        }

        public void a(k0.b.w.a aVar) {
            if (DisposableHelper.validate(this.q, aVar)) {
                this.q = aVar;
                this.c.a(this);
            }
        }

        public void dispose() {
            DisposableHelper.dispose(this);
            this.q.dispose();
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
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                k kVar = (k) apply;
                if (!isDisposed()) {
                    kVar.a(new a());
                }
            } catch (Exception e) {
                h.c4(e);
                this.c.onError(e);
            }
        }
    }

    public MaybeFlatten(k<T> kVar, e<? super T, ? extends k<? extends R>> eVar) {
        super(kVar);
        this.b = eVar;
    }

    public void c(i<? super R> iVar) {
        this.a.a(new FlatMapMaybeObserver(iVar, this.b));
    }
}
