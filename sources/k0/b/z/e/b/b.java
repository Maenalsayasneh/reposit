package k0.b.z.e.b;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.DisposableHelper;
import k0.b.g;
import k0.b.i;
import k0.b.r;
import k0.b.t;
import k0.b.y.f;

/* compiled from: MaybeFilterSingle */
public final class b<T> extends g<T> {
    public final r<T> a;
    public final f<? super T> b;

    /* compiled from: MaybeFilterSingle */
    public static final class a<T> implements t<T>, k0.b.w.a {
        public final i<? super T> c;
        public final f<? super T> d;
        public k0.b.w.a q;

        public a(i<? super T> iVar, f<? super T> fVar) {
            this.c = iVar;
            this.d = fVar;
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

        public void onError(Throwable th) {
            this.c.onError(th);
        }

        public void onSuccess(T t) {
            try {
                if (this.d.test(t)) {
                    this.c.onSuccess(t);
                } else {
                    this.c.onComplete();
                }
            } catch (Throwable th) {
                h.c4(th);
                this.c.onError(th);
            }
        }
    }

    public b(r<T> rVar, f<? super T> fVar) {
        this.a = rVar;
        this.b = fVar;
    }

    public void c(i<? super T> iVar) {
        this.a.a(new a(iVar, this.b));
    }
}
