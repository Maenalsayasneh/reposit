package k0.b.z.e.c;

import i0.j.f.p.h;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import k0.b.o;
import k0.b.p;
import k0.b.y.d;

/* compiled from: ObservableDoOnEach */
public final class c<T> extends a<T, T> {
    public final d<? super T> d;
    public final d<? super Throwable> q;
    public final k0.b.y.a x;
    public final k0.b.y.a y;

    /* compiled from: ObservableDoOnEach */
    public static final class a<T> implements p<T>, k0.b.w.a {
        public k0.b.w.a Y1;
        public boolean Z1;
        public final p<? super T> c;
        public final d<? super T> d;
        public final d<? super Throwable> q;
        public final k0.b.y.a x;
        public final k0.b.y.a y;

        public a(p<? super T> pVar, d<? super T> dVar, d<? super Throwable> dVar2, k0.b.y.a aVar, k0.b.y.a aVar2) {
            this.c = pVar;
            this.d = dVar;
            this.q = dVar2;
            this.x = aVar;
            this.y = aVar2;
        }

        public void a(k0.b.w.a aVar) {
            if (DisposableHelper.validate(this.Y1, aVar)) {
                this.Y1 = aVar;
                this.c.a(this);
            }
        }

        public void b(T t) {
            if (!this.Z1) {
                try {
                    this.d.b(t);
                    this.c.b(t);
                } catch (Throwable th) {
                    h.c4(th);
                    this.Y1.dispose();
                    onError(th);
                }
            }
        }

        public void dispose() {
            this.Y1.dispose();
        }

        public boolean isDisposed() {
            return this.Y1.isDisposed();
        }

        public void onComplete() {
            if (!this.Z1) {
                try {
                    this.x.run();
                    this.Z1 = true;
                    this.c.onComplete();
                    try {
                        this.y.run();
                    } catch (Throwable th) {
                        h.c4(th);
                        RxJavaPlugins.onError(th);
                    }
                } catch (Throwable th2) {
                    h.c4(th2);
                    onError(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.Z1) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.Z1 = true;
            try {
                this.q.b(th);
            } catch (Throwable th2) {
                h.c4(th2);
                th = new CompositeException(th, th2);
            }
            this.c.onError(th);
            try {
                this.y.run();
            } catch (Throwable th3) {
                h.c4(th3);
                RxJavaPlugins.onError(th3);
            }
        }
    }

    public c(o<T> oVar, d<? super T> dVar, d<? super Throwable> dVar2, k0.b.y.a aVar, k0.b.y.a aVar2) {
        super(oVar);
        this.d = dVar;
        this.q = dVar2;
        this.x = aVar;
        this.y = aVar2;
    }

    public void u(p<? super T> pVar) {
        this.c.c(new a(pVar, this.d, this.q, this.x, this.y));
    }
}
