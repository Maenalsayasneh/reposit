package k0.b.z.e.b;

import io.reactivex.internal.disposables.DisposableHelper;
import k0.b.g;
import k0.b.i;
import k0.b.r;
import k0.b.t;

/* compiled from: MaybeFromSingle */
public final class c<T> extends g<T> {
    public final r<T> a;

    /* compiled from: MaybeFromSingle */
    public static final class a<T> implements t<T>, k0.b.w.a {
        public final i<? super T> c;
        public k0.b.w.a d;

        public a(i<? super T> iVar) {
            this.c = iVar;
        }

        public void a(k0.b.w.a aVar) {
            if (DisposableHelper.validate(this.d, aVar)) {
                this.d = aVar;
                this.c.a(this);
            }
        }

        public void dispose() {
            this.d.dispose();
            this.d = DisposableHelper.DISPOSED;
        }

        public boolean isDisposed() {
            return this.d.isDisposed();
        }

        public void onError(Throwable th) {
            this.d = DisposableHelper.DISPOSED;
            this.c.onError(th);
        }

        public void onSuccess(T t) {
            this.d = DisposableHelper.DISPOSED;
            this.c.onSuccess(t);
        }
    }

    public c(r<T> rVar) {
        this.a = rVar;
    }

    public void c(i<? super T> iVar) {
        this.a.a(new a(iVar));
    }
}
