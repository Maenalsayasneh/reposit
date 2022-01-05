package k0.b.z.e.c;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import k0.b.b0.c;
import k0.b.o;
import k0.b.p;
import k0.b.q;

/* compiled from: ObservableDelay */
public final class b<T> extends a<T, T> {
    public final long d;
    public final TimeUnit q;
    public final q x;
    public final boolean y;

    /* compiled from: ObservableDelay */
    public static final class a<T> implements p<T>, k0.b.w.a {
        public k0.b.w.a Y1;
        public final p<? super T> c;
        public final long d;
        public final TimeUnit q;
        public final q.c x;
        public final boolean y;

        /* renamed from: k0.b.z.e.c.b$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableDelay */
        public final class C0231a implements Runnable {
            public C0231a() {
            }

            public void run() {
                try {
                    a.this.c.onComplete();
                } finally {
                    a.this.x.dispose();
                }
            }
        }

        /* renamed from: k0.b.z.e.c.b$a$b  reason: collision with other inner class name */
        /* compiled from: ObservableDelay */
        public final class C0232b implements Runnable {
            public final Throwable c;

            public C0232b(Throwable th) {
                this.c = th;
            }

            public void run() {
                try {
                    a.this.c.onError(this.c);
                } finally {
                    a.this.x.dispose();
                }
            }
        }

        /* compiled from: ObservableDelay */
        public final class c implements Runnable {
            public final T c;

            public c(T t) {
                this.c = t;
            }

            public void run() {
                a.this.c.b(this.c);
            }
        }

        public a(p<? super T> pVar, long j, TimeUnit timeUnit, q.c cVar, boolean z) {
            this.c = pVar;
            this.d = j;
            this.q = timeUnit;
            this.x = cVar;
            this.y = z;
        }

        public void a(k0.b.w.a aVar) {
            if (DisposableHelper.validate(this.Y1, aVar)) {
                this.Y1 = aVar;
                this.c.a(this);
            }
        }

        public void b(T t) {
            this.x.c(new c(t), this.d, this.q);
        }

        public void dispose() {
            this.Y1.dispose();
            this.x.dispose();
        }

        public boolean isDisposed() {
            return this.x.isDisposed();
        }

        public void onComplete() {
            this.x.c(new C0231a(), this.d, this.q);
        }

        public void onError(Throwable th) {
            this.x.c(new C0232b(th), this.y ? this.d : 0, this.q);
        }
    }

    public b(o<T> oVar, long j, TimeUnit timeUnit, q qVar, boolean z) {
        super(oVar);
        this.d = j;
        this.q = timeUnit;
        this.x = qVar;
        this.y = z;
    }

    public void u(p<? super T> pVar) {
        c cVar;
        if (this.y) {
            cVar = pVar;
        } else {
            cVar = new c(pVar);
        }
        this.c.c(new a(cVar, this.d, this.q, this.x.a(), this.y));
    }
}
