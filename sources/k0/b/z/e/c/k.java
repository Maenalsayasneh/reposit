package k0.b.z.e.c;

import k0.b.c;
import k0.b.o;
import k0.b.p;

/* compiled from: ObservableIgnoreElementsCompletable */
public final class k<T> extends k0.b.a {
    public final o<T> a;

    /* compiled from: ObservableIgnoreElementsCompletable */
    public static final class a<T> implements p<T>, k0.b.w.a {
        public final c c;
        public k0.b.w.a d;

        public a(c cVar) {
            this.c = cVar;
        }

        public void a(k0.b.w.a aVar) {
            this.d = aVar;
            this.c.a(this);
        }

        public void b(T t) {
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

    public k(o<T> oVar) {
        this.a = oVar;
    }

    public void e(c cVar) {
        this.a.c(new a(cVar));
    }
}
