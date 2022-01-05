package k0.b.z.e.c;

import i0.j.f.p.h;
import java.util.Objects;
import k0.b.o;
import k0.b.p;
import k0.b.y.e;

/* compiled from: ObservableMap */
public final class m<T, U> extends a<T, U> {
    public final e<? super T, ? extends U> d;

    /* compiled from: ObservableMap */
    public static final class a<T, U> extends k0.b.z.d.a<T, U> {
        public final e<? super T, ? extends U> Y1;

        public a(p<? super U> pVar, e<? super T, ? extends U> eVar) {
            super(pVar);
            this.Y1 = eVar;
        }

        public void b(T t) {
            if (!this.x) {
                if (this.y != 0) {
                    this.c.b(null);
                    return;
                }
                try {
                    Object apply = this.Y1.apply(t);
                    Objects.requireNonNull(apply, "The mapper function returned a null value.");
                    this.c.b(apply);
                } catch (Throwable th) {
                    h.c4(th);
                    this.d.dispose();
                    onError(th);
                }
            }
        }

        public U poll() throws Exception {
            T poll = this.q.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.Y1.apply(poll);
            Objects.requireNonNull(apply, "The mapper function returned a null value.");
            return apply;
        }

        public int requestFusion(int i) {
            return c(i);
        }
    }

    public m(o<T> oVar, e<? super T, ? extends U> eVar) {
        super(oVar);
        this.d = eVar;
    }

    public void u(p<? super U> pVar) {
        this.c.c(new a(pVar, this.d));
    }
}
