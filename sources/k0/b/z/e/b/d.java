package k0.b.z.e.b;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import k0.b.i;
import k0.b.k;
import k0.b.y.e;

/* compiled from: MaybeMap */
public final class d<T, R> extends a<T, R> {
    public final e<? super T, ? extends R> b;

    /* compiled from: MaybeMap */
    public static final class a<T, R> implements i<T>, k0.b.w.a {
        public final i<? super R> c;
        public final e<? super T, ? extends R> d;
        public k0.b.w.a q;

        public a(i<? super R> iVar, e<? super T, ? extends R> eVar) {
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
            k0.b.w.a aVar = this.q;
            this.q = DisposableHelper.DISPOSED;
            aVar.dispose();
        }

        public boolean isDisposed() {
            return this.q.isDisposed();
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
                Objects.requireNonNull(apply, "The mapper returned a null item");
                this.c.onSuccess(apply);
            } catch (Throwable th) {
                h.c4(th);
                this.c.onError(th);
            }
        }
    }

    public d(k<T> kVar, e<? super T, ? extends R> eVar) {
        super(kVar);
        this.b = eVar;
    }

    public void c(i<? super R> iVar) {
        this.a.a(new a(iVar, this.b));
    }
}
