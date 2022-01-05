package k0.b.z.e.b;

import i0.j.f.p.h;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import k0.b.i;
import k0.b.k;
import k0.b.y.d;

/* compiled from: MaybePeek */
public final class e<T> extends a<T, T> {
    public final k0.b.y.a b;
    public final k0.b.y.a c;
    public final k0.b.y.a d;

    /* compiled from: MaybePeek */
    public static final class a<T> implements i<T>, k0.b.w.a {
        public final i<? super T> c;
        public final e<T> d;
        public k0.b.w.a q;

        public a(i<? super T> iVar, e<T> eVar) {
            this.c = iVar;
            this.d = eVar;
        }

        public void a(k0.b.w.a aVar) {
            if (DisposableHelper.validate(this.q, aVar)) {
                try {
                    Objects.requireNonNull(this.d);
                    this.q = aVar;
                    this.c.a(this);
                } catch (Throwable th) {
                    h.c4(th);
                    aVar.dispose();
                    this.q = DisposableHelper.DISPOSED;
                    EmptyDisposable.error(th, (i<?>) this.c);
                }
            }
        }

        public void b() {
            try {
                this.d.c.run();
            } catch (Throwable th) {
                h.c4(th);
                RxJavaPlugins.onError(th);
            }
        }

        public void c(Throwable th) {
            try {
                Objects.requireNonNull(this.d);
            } catch (Throwable th2) {
                h.c4(th2);
                th = new CompositeException(th, th2);
            }
            this.q = DisposableHelper.DISPOSED;
            this.c.onError(th);
            b();
        }

        public void dispose() {
            try {
                this.d.d.run();
            } catch (Throwable th) {
                h.c4(th);
                RxJavaPlugins.onError(th);
            }
            this.q.dispose();
            this.q = DisposableHelper.DISPOSED;
        }

        public boolean isDisposed() {
            return this.q.isDisposed();
        }

        public void onComplete() {
            k0.b.w.a aVar = this.q;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (aVar != disposableHelper) {
                try {
                    this.d.b.run();
                    this.q = disposableHelper;
                    this.c.onComplete();
                    b();
                } catch (Throwable th) {
                    h.c4(th);
                    c(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.q == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th);
            } else {
                c(th);
            }
        }

        public void onSuccess(T t) {
            k0.b.w.a aVar = this.q;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (aVar != disposableHelper) {
                try {
                    Objects.requireNonNull(this.d);
                    this.q = disposableHelper;
                    this.c.onSuccess(t);
                    b();
                } catch (Throwable th) {
                    h.c4(th);
                    c(th);
                }
            }
        }
    }

    public e(k<T> kVar, d<? super k0.b.w.a> dVar, d<? super T> dVar2, d<? super Throwable> dVar3, k0.b.y.a aVar, k0.b.y.a aVar2, k0.b.y.a aVar3) {
        super(kVar);
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
    }

    public void c(i<? super T> iVar) {
        this.a.a(new a(iVar, this));
    }
}
