package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import m0.i;
import m0.l.e;
import m0.n.b.f;
import n0.a.j0;
import n0.a.l1;
import n0.a.m;
import n0.a.m0;
import n0.a.n;
import n0.a.n1;
import n0.a.o0;

/* compiled from: HandlerDispatcher.kt */
public final class HandlerContext extends n0.a.e2.a implements j0 {
    private volatile HandlerContext _immediate;
    public final Handler d;
    public final String q;
    public final boolean x;
    public final HandlerContext y;

    /* compiled from: Job.kt */
    public static final class a implements o0 {
        public final /* synthetic */ HandlerContext c;
        public final /* synthetic */ Runnable d;

        public a(HandlerContext handlerContext, Runnable runnable) {
            this.c = handlerContext;
            this.d = runnable;
        }

        public void dispose() {
            this.c.d.removeCallbacks(this.d);
        }
    }

    /* compiled from: Runnable.kt */
    public static final class b implements Runnable {
        public final /* synthetic */ m c;
        public final /* synthetic */ HandlerContext d;

        public b(m mVar, HandlerContext handlerContext) {
            this.c = mVar;
            this.d = handlerContext;
        }

        public final void run() {
            this.c.A(this.d, i.a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerContext(Handler handler, String str, boolean z) {
        super((f) null);
        HandlerContext handlerContext = null;
        this.d = handler;
        this.q = str;
        this.x = z;
        this._immediate = z ? this : handlerContext;
        HandlerContext handlerContext2 = this._immediate;
        if (handlerContext2 == null) {
            handlerContext2 = new HandlerContext(handler, str, true);
            this._immediate = handlerContext2;
        }
        this.y = handlerContext2;
    }

    public o0 C(long j, Runnable runnable, e eVar) {
        if (this.d.postDelayed(runnable, m0.q.i.a(j, 4611686018427387903L))) {
            return new a(this, runnable);
        }
        Y(eVar, runnable);
        return n1.c;
    }

    public void I(e eVar, Runnable runnable) {
        if (!this.d.post(runnable)) {
            Y(eVar, runnable);
        }
    }

    public boolean Q(e eVar) {
        return !this.x || !m0.n.b.i.a(Looper.myLooper(), this.d.getLooper());
    }

    public l1 T() {
        return this.y;
    }

    public final void Y(e eVar, Runnable runnable) {
        m0.r.t.a.r.m.a1.a.l0(eVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        m0.c.I(eVar, runnable);
    }

    public void e(long j, m<? super i> mVar) {
        b bVar = new b(mVar, this);
        if (this.d.postDelayed(bVar, m0.q.i.a(j, 4611686018427387903L))) {
            ((n) mVar).p(new HandlerContext$scheduleResumeAfterDelay$1(this, bVar));
            return;
        }
        Y(((n) mVar).Z1, bVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof HandlerContext) && ((HandlerContext) obj).d == this.d;
    }

    public int hashCode() {
        return System.identityHashCode(this.d);
    }

    public String toString() {
        String U = U();
        if (U != null) {
            return U;
        }
        String str = this.q;
        if (str == null) {
            str = this.d.toString();
        }
        return this.x ? m0.n.b.i.k(str, ".immediate") : str;
    }
}
