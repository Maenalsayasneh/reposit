package k0.b.z.e.c;

import io.reactivex.internal.disposables.DisposableHelper;
import k0.b.o;
import k0.b.p;

/* compiled from: ObservableHide */
public final class j<T> extends a<T, T> {

    /* compiled from: ObservableHide */
    public static final class a<T> implements p<T>, k0.b.w.a {
        public final p<? super T> c;
        public k0.b.w.a d;

        public a(p<? super T> pVar) {
            this.c = pVar;
        }

        public void a(k0.b.w.a aVar) {
            if (DisposableHelper.validate(this.d, aVar)) {
                this.d = aVar;
                this.c.a(this);
            }
        }

        public void b(T t) {
            this.c.b(t);
        }

        public void dispose() {
            this.d.dispose();
        }

        public boolean isDisposed() {
            return this.d.isDisposed();
        }

        public void onComplete() {
            this.c.onComplete();
        }

        public void onError(Throwable th) {
            this.c.onError(th);
        }
    }

    public j(o<T> oVar) {
        super(oVar);
    }

    public void u(p<? super T> pVar) {
        this.c.c(new a(pVar));
    }
}
