package n0.a;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobSupport;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.l.f.a.b;
import m0.n.a.l;
import m0.r.t.a.r.m.a1.a;
import n0.a.f1;
import n0.a.h2.g;
import n0.a.h2.t;

/* compiled from: CancellableContinuationImpl.kt */
public class n<T> extends l0<T> implements m<T>, b {
    public static final /* synthetic */ AtomicIntegerFieldUpdater x = AtomicIntegerFieldUpdater.newUpdater(n.class, "_decision");
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state");
    public final c<T> Y1;
    public final e Z1;
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = e.c;
    public o0 a2;

    public n(c<? super T> cVar, int i) {
        super(i);
        this.Y1 = cVar;
        this.Z1 = cVar.getContext();
    }

    public void A(d0 d0Var, T t) {
        d0 d0Var2;
        c<T> cVar = this.Y1;
        g gVar = cVar instanceof g ? (g) cVar : null;
        if (gVar == null) {
            d0Var2 = null;
        } else {
            d0Var2 = gVar.y;
        }
        B(t, d0Var2 == d0Var ? 4 : this.q, (l<? super Throwable, i>) null);
    }

    public final void B(Object obj, int i, l<? super Throwable, i> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof o1) {
            } else {
                if (obj2 instanceof p) {
                    p pVar = (p) obj2;
                    Objects.requireNonNull(pVar);
                    if (p.c.compareAndSet(pVar, 0, 1)) {
                        if (lVar != null) {
                            j(lVar, pVar.b);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(m0.n.b.i.k("Already resumed, but proposed with update ", obj).toString());
            }
        } while (!y.compareAndSet(this, obj2, C((o1) obj2, obj, i, lVar, (Object) null)));
        l();
        m(i);
    }

    public final Object C(o1 o1Var, Object obj, int i, l<? super Throwable, i> lVar, Object obj2) {
        if (obj instanceof z) {
            return obj;
        }
        if (!a.t2(i) && obj2 == null) {
            return obj;
        }
        if (lVar == null && ((!(o1Var instanceof k) || (o1Var instanceof f)) && obj2 == null)) {
            return obj;
        }
        return new y(obj, o1Var instanceof k ? (k) o1Var : null, lVar, obj2, (Throwable) null, 16);
    }

    public final t D(Object obj, Object obj2, l<? super Throwable, i> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof o1) {
            } else if (!(obj3 instanceof y) || obj2 == null || ((y) obj3).d != obj2) {
                return null;
            } else {
                return o.a;
            }
        } while (!y.compareAndSet(this, obj3, C((o1) obj3, obj, this.q, lVar, obj2)));
        l();
        return o.a;
    }

    public boolean I(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof o1)) {
                return false;
            }
            z = obj instanceof k;
        } while (!y.compareAndSet(this, obj, new p(this, th, z)));
        k kVar = z ? (k) obj : null;
        if (kVar != null) {
            i(kVar, th);
        }
        l();
        m(this.q);
        return true;
    }

    public void O(Object obj) {
        m(this.q);
    }

    public void a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof o1) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof z)) {
                if (obj2 instanceof y) {
                    y yVar = (y) obj2;
                    if (!(yVar.e != null)) {
                        if (y.compareAndSet(this, obj2, y.a(yVar, (Object) null, (k) null, (l) null, (Object) null, th, 15))) {
                            k kVar = yVar.b;
                            if (kVar != null) {
                                i(kVar, th);
                            }
                            l<Throwable, i> lVar = yVar.c;
                            if (lVar != null) {
                                j(lVar, th);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (y.compareAndSet(this, obj2, new y(obj2, (k) null, (l) null, (Object) null, th, 14))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final c<T> b() {
        return this.Y1;
    }

    public Object c(T t, Object obj) {
        return D(t, obj, (l<? super Throwable, i>) null);
    }

    public Throwable d(Object obj) {
        Throwable d = super.d(obj);
        if (d == null) {
            return null;
        }
        return d;
    }

    public <T> T e(Object obj) {
        return obj instanceof y ? ((y) obj).a : obj;
    }

    public Object g() {
        return this._state;
    }

    public b getCallerFrame() {
        c<T> cVar = this.Y1;
        if (cVar instanceof b) {
            return (b) cVar;
        }
        return null;
    }

    public e getContext() {
        return this.Z1;
    }

    public final void h(l<? super Throwable, i> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            a.b2(this.Z1, new CompletionHandlerException(m0.n.b.i.k("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void i(k kVar, Throwable th) {
        try {
            kVar.a(th);
        } catch (Throwable th2) {
            a.b2(this.Z1, new CompletionHandlerException(m0.n.b.i.k("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void j(l<? super Throwable, i> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            a.b2(this.Z1, new CompletionHandlerException(m0.n.b.i.k("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    public final void k() {
        o0 o0Var = this.a2;
        if (o0Var != null) {
            o0Var.dispose();
            this.a2 = n1.c;
        }
    }

    public final void l() {
        if (!s()) {
            k();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(int r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            if (r0 != r1) goto L_0x000a
            r0 = r2
            goto L_0x0020
        L_0x000a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0016:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = x
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r2, r3)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            m0.l.c r0 = r4.b()
            r3 = 4
            if (r5 != r3) goto L_0x002b
            r2 = r1
        L_0x002b:
            if (r2 != 0) goto L_0x007f
            boolean r3 = r0 instanceof n0.a.h2.g
            if (r3 == 0) goto L_0x007f
            boolean r5 = m0.r.t.a.r.m.a1.a.t2(r5)
            int r3 = r4.q
            boolean r3 = m0.r.t.a.r.m.a1.a.t2(r3)
            if (r5 != r3) goto L_0x007f
            r5 = r0
            n0.a.h2.g r5 = (n0.a.h2.g) r5
            n0.a.d0 r5 = r5.y
            m0.l.e r0 = r0.getContext()
            boolean r2 = r5.Q(r0)
            if (r2 == 0) goto L_0x0050
            r5.I(r0, r4)
            goto L_0x0082
        L_0x0050:
            n0.a.y1 r5 = n0.a.y1.a
            n0.a.s0 r5 = n0.a.y1.a()
            boolean r0 = r5.b0()
            if (r0 == 0) goto L_0x0060
            r5.Y(r4)
            goto L_0x0082
        L_0x0060:
            r5.Z(r1)
            m0.l.c r0 = r4.b()     // Catch:{ all -> 0x0071 }
            m0.r.t.a.r.m.a1.a.k3(r4, r0, r1)     // Catch:{ all -> 0x0071 }
        L_0x006a:
            boolean r0 = r5.d0()     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x006a
            goto L_0x0076
        L_0x0071:
            r0 = move-exception
            r2 = 0
            r4.f(r0, r2)     // Catch:{ all -> 0x007a }
        L_0x0076:
            r5.T(r1)
            goto L_0x0082
        L_0x007a:
            r0 = move-exception
            r5.T(r1)
            throw r0
        L_0x007f:
            m0.r.t.a.r.m.a1.a.k3(r4, r0, r2)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.n.m(int):void");
    }

    public Throwable n(f1 f1Var) {
        return ((JobSupport) f1Var).v();
    }

    public final Object o() {
        boolean z;
        boolean s = s();
        while (true) {
            int i = this._decision;
            z = false;
            if (i == 0) {
                if (x.compareAndSet(this, 0, 1)) {
                    z = true;
                    break;
                }
            } else if (i != 2) {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z) {
            if (this.a2 == null) {
                r();
            }
            if (s) {
                v();
            }
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        if (s) {
            v();
        }
        Object obj = this._state;
        if (obj instanceof z) {
            throw ((z) obj).b;
        }
        if (a.t2(this.q)) {
            e eVar = this.Z1;
            int i2 = f1.k;
            f1 f1Var = (f1) eVar.get(f1.a.c);
            if (f1Var != null && !f1Var.a()) {
                CancellationException v = f1Var.v();
                a(obj, v);
                throw v;
            }
        }
        return e(obj);
    }

    public void p(l<? super Throwable, i> lVar) {
        k c1Var = lVar instanceof k ? (k) lVar : new c1(lVar);
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof e)) {
                Throwable th = null;
                if (!(obj instanceof k)) {
                    boolean z = obj instanceof z;
                    boolean z2 = true;
                    if (z) {
                        z zVar = (z) obj;
                        Objects.requireNonNull(zVar);
                        if (!z.a.compareAndSet(zVar, 0, 1)) {
                            t(lVar, obj);
                            throw null;
                        } else if (obj instanceof p) {
                            if (!z) {
                                zVar = null;
                            }
                            if (zVar != null) {
                                th = zVar.b;
                            }
                            h(lVar, th);
                            return;
                        } else {
                            return;
                        }
                    } else if (obj instanceof y) {
                        y yVar = (y) obj;
                        if (yVar.b != null) {
                            t(lVar, obj);
                            throw null;
                        } else if (!(c1Var instanceof f)) {
                            Throwable th2 = yVar.e;
                            if (th2 == null) {
                                z2 = false;
                            }
                            if (z2) {
                                h(lVar, th2);
                                return;
                            } else {
                                if (y.compareAndSet(this, obj, y.a(yVar, (Object) null, c1Var, (l) null, (Object) null, (Throwable) null, 29))) {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else if (!(c1Var instanceof f)) {
                        if (y.compareAndSet(this, obj, new y(obj, c1Var, (l) null, (Object) null, (Throwable) null, 28))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    t(lVar, obj);
                    throw null;
                }
            } else if (y.compareAndSet(this, obj, c1Var)) {
                return;
            }
        }
    }

    public void q() {
        o0 r = r();
        if (r != null && (!(this._state instanceof o1))) {
            r.dispose();
            this.a2 = n1.c;
        }
    }

    public final o0 r() {
        e eVar = this.Z1;
        int i = f1.k;
        f1 f1Var = (f1) eVar.get(f1.a.c);
        if (f1Var == null) {
            return null;
        }
        o0 p2 = a.p2(f1Var, true, false, new q(this), 2, (Object) null);
        this.a2 = p2;
        return p2;
    }

    public void resumeWith(Object obj) {
        Throwable a = Result.a(obj);
        if (a != null) {
            obj = new z(a, false, 2);
        }
        B(obj, this.q, (l<? super Throwable, i>) null);
    }

    public final boolean s() {
        return (this.q == 2) && ((g) this.Y1).i();
    }

    public final void t(l<? super Throwable, i> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(u());
        sb.append('(');
        sb.append(a.Z3(this.Y1));
        sb.append("){");
        Object obj = this._state;
        if (obj instanceof o1) {
            str = "Active";
        } else {
            str = obj instanceof p ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(a.M1(this));
        return sb.toString();
    }

    public String u() {
        return "CancellableContinuation";
    }

    public final void v() {
        c<T> cVar = this.Y1;
        Throwable th = null;
        g gVar = cVar instanceof g ? (g) cVar : null;
        if (gVar != null) {
            th = gVar.l(this);
        }
        if (th != null) {
            k();
            I(th);
        }
    }

    public final boolean w() {
        Object obj = this._state;
        if (!(obj instanceof y) || ((y) obj).d == null) {
            this._decision = 0;
            this._state = e.c;
            return true;
        }
        k();
        return false;
    }

    public Object x(Throwable th) {
        return D(new z(th, false, 2), (Object) null, (l<? super Throwable, i>) null);
    }

    public void y(T t, l<? super Throwable, i> lVar) {
        B(t, this.q, lVar);
    }

    public Object z(T t, Object obj, l<? super Throwable, i> lVar) {
        return D(t, obj, lVar);
    }
}
