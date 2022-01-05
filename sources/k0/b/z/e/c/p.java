package k0.b.z.e.c;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import k0.b.o;
import k0.b.r;
import k0.b.t;
import k0.b.z.b.a;

/* compiled from: ObservableToListSingle */
public final class p<T, U extends Collection<? super T>> extends r<U> {
    public final o<T> a;
    public final Callable<U> b;

    /* compiled from: ObservableToListSingle */
    public static final class a<T, U extends Collection<? super T>> implements k0.b.p<T>, k0.b.w.a {
        public final t<? super U> c;
        public U d;
        public k0.b.w.a q;

        public a(t<? super U> tVar, U u) {
            this.c = tVar;
            this.d = u;
        }

        public void a(k0.b.w.a aVar) {
            if (DisposableHelper.validate(this.q, aVar)) {
                this.q = aVar;
                this.c.a(this);
            }
        }

        public void b(T t) {
            this.d.add(t);
        }

        public void dispose() {
            this.q.dispose();
        }

        public boolean isDisposed() {
            return this.q.isDisposed();
        }

        public void onComplete() {
            U u = this.d;
            this.d = null;
            this.c.onSuccess(u);
        }

        public void onError(Throwable th) {
            this.d = null;
            this.c.onError(th);
        }
    }

    public p(o<T> oVar, int i) {
        this.a = oVar;
        this.b = new a.b(i);
    }

    public void b(t<? super U> tVar) {
        try {
            U call = this.b.call();
            Objects.requireNonNull(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.a.c(new a(tVar, (Collection) call));
        } catch (Throwable th) {
            h.c4(th);
            EmptyDisposable.error(th, (t<?>) tVar);
        }
    }
}
