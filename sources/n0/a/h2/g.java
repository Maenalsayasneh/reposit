package n0.a.h2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.ThreadContextKt;
import m0.l.c;
import m0.l.e;
import m0.l.f.a.b;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.a0;
import n0.a.d0;
import n0.a.l0;
import n0.a.m;
import n0.a.n;
import n0.a.s0;
import n0.a.y1;

/* compiled from: DispatchedContinuation.kt */
public final class g<T> extends l0<T> implements b, c<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater x = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation");
    public final c<T> Y1;
    public Object Z1 = h.a;
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;
    public final Object a2 = ThreadContextKt.b(getContext());
    public final d0 y;

    public g(d0 d0Var, c<? super T> cVar) {
        super(-1);
        this.y = d0Var;
        this.Y1 = cVar;
    }

    public void a(Object obj, Throwable th) {
        if (obj instanceof a0) {
            ((a0) obj).b.invoke(th);
        }
    }

    public c<T> b() {
        return this;
    }

    public Object g() {
        Object obj = this.Z1;
        this.Z1 = h.a;
        return obj;
    }

    public b getCallerFrame() {
        c<T> cVar = this.Y1;
        if (cVar instanceof b) {
            return (b) cVar;
        }
        return null;
    }

    public e getContext() {
        return this.Y1.getContext();
    }

    public final n<T> h() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = h.b;
                return null;
            } else if (obj instanceof n) {
                if (x.compareAndSet(this, obj, h.b)) {
                    return (n) obj;
                }
            } else if (obj != h.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(i.k("Inconsistent state ", obj).toString());
            }
        }
    }

    public final boolean i() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean j(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            t tVar = h.b;
            if (i.a(obj, tVar)) {
                if (x.compareAndSet(this, tVar, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (x.compareAndSet(this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public final void k() {
        do {
        } while (this._reusableCancellableContinuation == h.b);
        Object obj = this._reusableCancellableContinuation;
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar != null) {
            nVar.k();
        }
    }

    public final Throwable l(m<?> mVar) {
        t tVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            tVar = h.b;
            if (obj != tVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(i.k("Inconsistent state ", obj).toString());
                } else if (x.compareAndSet(this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!x.compareAndSet(this, tVar, mVar));
        return null;
    }

    public void resumeWith(Object obj) {
        e context;
        Object c;
        e context2 = this.Y1.getContext();
        Object f4 = a.f4(obj, (l) null, 1);
        if (this.y.Q(context2)) {
            this.Z1 = f4;
            this.q = 0;
            this.y.I(context2, this);
            return;
        }
        y1 y1Var = y1.a;
        s0 a = y1.a();
        if (a.b0()) {
            this.Z1 = f4;
            this.q = 0;
            a.Y(this);
            return;
        }
        a.Z(true);
        try {
            context = getContext();
            c = ThreadContextKt.c(context, this.a2);
            this.Y1.resumeWith(obj);
            ThreadContextKt.a(context, c);
            do {
            } while (a.d0());
        } catch (Throwable th) {
            try {
                f(th, (Throwable) null);
            } catch (Throwable th2) {
                a.T(true);
                throw th2;
            }
        }
        a.T(true);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("DispatchedContinuation[");
        P0.append(this.y);
        P0.append(", ");
        P0.append(a.Z3(this.Y1));
        P0.append(']');
        return P0.toString();
    }
}
