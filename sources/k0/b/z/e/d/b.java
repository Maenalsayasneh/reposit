package k0.b.z.e.d;

import i0.j.f.p.h;
import java.util.Objects;
import k0.b.r;
import k0.b.t;
import k0.b.y.e;

/* compiled from: SingleMap */
public final class b<T, R> extends r<R> {
    public final r<? extends T> a;
    public final e<? super T, ? extends R> b;

    /* compiled from: SingleMap */
    public static final class a<T, R> implements t<T> {
        public final t<? super R> c;
        public final e<? super T, ? extends R> d;

        public a(t<? super R> tVar, e<? super T, ? extends R> eVar) {
            this.c = tVar;
            this.d = eVar;
        }

        public void a(k0.b.w.a aVar) {
            this.c.a(aVar);
        }

        public void onError(Throwable th) {
            this.c.onError(th);
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.d.apply(t);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.c.onSuccess(apply);
            } catch (Throwable th) {
                h.c4(th);
                this.c.onError(th);
            }
        }
    }

    public b(r<? extends T> rVar, e<? super T, ? extends R> eVar) {
        this.a = rVar;
        this.b = eVar;
    }

    public void b(t<? super R> tVar) {
        this.a.a(new a(tVar, this.b));
    }
}
