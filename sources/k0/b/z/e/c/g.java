package k0.b.z.e.c;

import i0.j.f.p.h;
import k0.b.o;
import k0.b.p;
import k0.b.y.f;

/* compiled from: ObservableFilter */
public final class g<T> extends a<T, T> {
    public final f<? super T> d;

    /* compiled from: ObservableFilter */
    public static final class a<T> extends k0.b.z.d.a<T, T> {
        public final f<? super T> Y1;

        public a(p<? super T> pVar, f<? super T> fVar) {
            super(pVar);
            this.Y1 = fVar;
        }

        public void b(T t) {
            if (this.y == 0) {
                try {
                    if (this.Y1.test(t)) {
                        this.c.b(t);
                    }
                } catch (Throwable th) {
                    h.c4(th);
                    this.d.dispose();
                    onError(th);
                }
            } else {
                this.c.b(null);
            }
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public T poll() throws java.lang.Exception {
            /*
                r2 = this;
            L_0x0000:
                k0.b.z.c.b<T> r0 = r2.q
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto L_0x0010
                k0.b.y.f<? super T> r1 = r2.Y1
                boolean r1 = r1.test(r0)
                if (r1 == 0) goto L_0x0000
            L_0x0010:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: k0.b.z.e.c.g.a.poll():java.lang.Object");
        }

        public int requestFusion(int i) {
            return c(i);
        }
    }

    public g(o<T> oVar, f<? super T> fVar) {
        super(oVar);
        this.d = fVar;
    }

    public void u(p<? super T> pVar) {
        this.c.c(new a(pVar, this.d));
    }
}
