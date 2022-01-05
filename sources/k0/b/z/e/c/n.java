package k0.b.z.e.c;

import i0.j.f.p.h;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import k0.b.o;
import k0.b.p;
import k0.b.y.e;

/* compiled from: ObservableOnErrorNext */
public final class n<T> extends a<T, T> {
    public final e<? super Throwable, ? extends o<? extends T>> d;

    /* compiled from: ObservableOnErrorNext */
    public static final class a<T> implements p<T> {
        public final p<? super T> c;
        public final e<? super Throwable, ? extends o<? extends T>> d;
        public final SequentialDisposable q = new SequentialDisposable();
        public boolean x;
        public boolean y;

        public a(p<? super T> pVar, e<? super Throwable, ? extends o<? extends T>> eVar, boolean z) {
            this.c = pVar;
            this.d = eVar;
        }

        public void a(k0.b.w.a aVar) {
            SequentialDisposable sequentialDisposable = this.q;
            Objects.requireNonNull(sequentialDisposable);
            DisposableHelper.replace(sequentialDisposable, aVar);
        }

        public void b(T t) {
            if (!this.y) {
                this.c.b(t);
            }
        }

        public void onComplete() {
            if (!this.y) {
                this.y = true;
                this.x = true;
                this.c.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.x) {
                this.x = true;
                try {
                    o oVar = (o) this.d.apply(th);
                    if (oVar == null) {
                        NullPointerException nullPointerException = new NullPointerException("Observable is null");
                        nullPointerException.initCause(th);
                        this.c.onError(nullPointerException);
                        return;
                    }
                    oVar.c(this);
                } catch (Throwable th2) {
                    h.c4(th2);
                    this.c.onError(new CompositeException(th, th2));
                }
            } else if (this.y) {
                RxJavaPlugins.onError(th);
            } else {
                this.c.onError(th);
            }
        }
    }

    public n(o<T> oVar, e<? super Throwable, ? extends o<? extends T>> eVar, boolean z) {
        super(oVar);
        this.d = eVar;
    }

    public void u(p<? super T> pVar) {
        a aVar = new a(pVar, this.d, false);
        pVar.a(aVar.q);
        this.c.c(aVar);
    }
}
