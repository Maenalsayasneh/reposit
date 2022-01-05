package k0.b.z.e.a;

import i0.j.f.p.h;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import k0.b.c;
import k0.b.y.d;

/* compiled from: CompletablePeek */
public final class e extends k0.b.a {
    public final k0.b.e a;
    public final d<? super k0.b.w.a> b;
    public final d<? super Throwable> c;
    public final k0.b.y.a d;
    public final k0.b.y.a e;
    public final k0.b.y.a f;
    public final k0.b.y.a g;

    /* compiled from: CompletablePeek */
    public final class a implements c, k0.b.w.a {
        public final c c;
        public k0.b.w.a d;

        public a(c cVar) {
            this.c = cVar;
        }

        public void a(k0.b.w.a aVar) {
            try {
                e.this.b.b(aVar);
                if (DisposableHelper.validate(this.d, aVar)) {
                    this.d = aVar;
                    this.c.a(this);
                }
            } catch (Throwable th) {
                h.c4(th);
                aVar.dispose();
                this.d = DisposableHelper.DISPOSED;
                EmptyDisposable.error(th, this.c);
            }
        }

        public void dispose() {
            try {
                e.this.g.run();
            } catch (Throwable th) {
                h.c4(th);
                RxJavaPlugins.onError(th);
            }
            this.d.dispose();
        }

        public boolean isDisposed() {
            return this.d.isDisposed();
        }

        public void onComplete() {
            if (this.d != DisposableHelper.DISPOSED) {
                try {
                    e.this.d.run();
                    e.this.e.run();
                    this.c.onComplete();
                    try {
                        e.this.f.run();
                    } catch (Throwable th) {
                        h.c4(th);
                        RxJavaPlugins.onError(th);
                    }
                } catch (Throwable th2) {
                    h.c4(th2);
                    this.c.onError(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.d == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th);
                return;
            }
            try {
                e.this.c.b(th);
                e.this.e.run();
            } catch (Throwable th2) {
                h.c4(th2);
                th = new CompositeException(th, th2);
            }
            this.c.onError(th);
            try {
                e.this.f.run();
            } catch (Throwable th3) {
                h.c4(th3);
                RxJavaPlugins.onError(th3);
            }
        }
    }

    public e(k0.b.e eVar, d<? super k0.b.w.a> dVar, d<? super Throwable> dVar2, k0.b.y.a aVar, k0.b.y.a aVar2, k0.b.y.a aVar3, k0.b.y.a aVar4) {
        this.a = eVar;
        this.b = dVar;
        this.c = dVar2;
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
        this.g = aVar4;
    }

    public void e(c cVar) {
        this.a.a(new a(cVar));
    }
}
