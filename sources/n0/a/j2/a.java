package n0.a.j2;

import i0.j.f.p.h;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1;
import m0.n.a.l;
import m0.n.b.r;
import n0.a.f1;
import n0.a.g1;
import n0.a.h2.i;
import n0.a.h2.k;
import n0.a.h2.p;
import n0.a.o;
import n0.a.o0;
import n0.a.z;

/* compiled from: Select.kt */
public final class a<R> extends i implements c<R>, m0.l.c<R>, m0.l.f.a.b {
    public static final /* synthetic */ AtomicReferenceFieldUpdater x;
    public static final /* synthetic */ AtomicReferenceFieldUpdater y;
    public final m0.l.c<R> Y1;
    private volatile /* synthetic */ Object _parentHandle = null;
    public volatile /* synthetic */ Object _result = d.c;
    public volatile /* synthetic */ Object _state = d.a;

    /* renamed from: n0.a.j2.a$a  reason: collision with other inner class name */
    /* compiled from: Select.kt */
    public static final class C0279a extends n0.a.h2.d<Object> {
        public final a<?> b;
        public final n0.a.h2.b c;
        public final long d;

        public C0279a(a<?> aVar, n0.a.h2.b bVar) {
            this.b = aVar;
            this.c = bVar;
            e eVar = d.e;
            Objects.requireNonNull(eVar);
            this.d = e.a.incrementAndGet(eVar);
            bVar.a = this;
        }

        public void d(Object obj, Object obj2) {
            Object obj3;
            boolean z = obj2 == null;
            if (z) {
                obj3 = null;
            } else {
                Object obj4 = d.a;
                obj3 = d.a;
            }
            if (a.x.compareAndSet(this.b, this, obj3) && z) {
                this.b.H();
            }
            this.c.a(this, obj2);
        }

        public long g() {
            return this.d;
        }

        public Object i(Object obj) {
            Object obj2;
            if (obj == null) {
                a<?> aVar = this.b;
                while (true) {
                    Object obj3 = aVar._state;
                    obj2 = null;
                    if (obj3 != this) {
                        if (!(obj3 instanceof p)) {
                            Object obj4 = d.a;
                            Object obj5 = d.a;
                            if (obj3 != obj5) {
                                obj2 = d.b;
                                break;
                            }
                            if (a.x.compareAndSet(this.b, obj5, this)) {
                                break;
                            }
                        } else {
                            ((p) obj3).c(this.b);
                        }
                    } else {
                        break;
                    }
                }
                if (obj2 != null) {
                    return obj2;
                }
            }
            try {
                return this.c.b(this);
            } catch (Throwable th) {
                if (obj == null) {
                    a<?> aVar2 = this.b;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.x;
                    Object obj6 = d.a;
                    atomicReferenceFieldUpdater.compareAndSet(aVar2, this, d.a);
                }
                throw th;
            }
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("AtomicSelectOp(sequence=");
            P0.append(this.d);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: Select.kt */
    public static final class b extends k {
        public final o0 x;

        public b(o0 o0Var) {
            this.x = o0Var;
        }
    }

    /* compiled from: Select.kt */
    public static final class c extends p {
        public final k.c a;

        public c(k.c cVar) {
            this.a = cVar;
        }

        public n0.a.h2.d<?> a() {
            return this.a.a();
        }

        public Object c(Object obj) {
            Object obj2;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
            a aVar = (a) obj;
            k.c cVar = this.a;
            cVar.c.e(cVar);
            Object e = this.a.a().e((Object) null);
            if (e == null) {
                obj2 = this.a.c;
            } else {
                Object obj3 = d.a;
                obj2 = d.a;
            }
            a.x.compareAndSet(aVar, this, obj2);
            return e;
        }
    }

    /* compiled from: Select.kt */
    public final class d extends g1 {
        public d() {
        }

        public void H(Throwable th) {
            if (a.this.e()) {
                a.this.m(J().v());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            H((Throwable) obj);
            return m0.i.a;
        }
    }

    /* compiled from: Runnable.kt */
    public static final class e implements Runnable {
        public final /* synthetic */ a c;
        public final /* synthetic */ l d;

        public e(a aVar, l lVar) {
            this.c = aVar;
            this.d = lVar;
        }

        public final void run() {
            if (this.c.e()) {
                l lVar = this.d;
                a aVar = this.c;
                Objects.requireNonNull(aVar);
                m0.r.t.a.r.m.a1.a.H3(lVar, aVar);
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<a> cls2 = a.class;
        x = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_state");
        y = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_result");
    }

    public a(m0.l.c<? super R> cVar) {
        this.Y1 = cVar;
        Object obj = d.a;
    }

    public final void H() {
        o0 o0Var = (o0) this._parentHandle;
        if (o0Var != null) {
            o0Var.dispose();
        }
        for (k kVar = (k) v(); !m0.n.b.i.a(kVar, this); kVar = kVar.w()) {
            if (kVar instanceof b) {
                ((b) kVar).x.dispose();
            }
        }
    }

    public final Object J() {
        if (!i()) {
            m0.l.e context = getContext();
            int i = f1.k;
            f1 f1Var = (f1) context.get(f1.a.c);
            if (f1Var != null) {
                o0 p2 = m0.r.t.a.r.m.a1.a.p2(f1Var, true, false, new d(), 2, (Object) null);
                this._parentHandle = p2;
                if (i()) {
                    p2.dispose();
                }
            }
        }
        Object obj = this._result;
        Object obj2 = d.a;
        Object obj3 = d.c;
        if (obj == obj3) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, coroutineSingletons)) {
                return coroutineSingletons;
            }
            obj = this._result;
        }
        if (obj == d.d) {
            throw new IllegalStateException("Already resumed");
        } else if (!(obj instanceof z)) {
            return obj;
        } else {
            throw ((z) obj).b;
        }
    }

    public final void K(Throwable th) {
        if (e()) {
            resumeWith(h.l0(th));
        } else if (!(th instanceof CancellationException)) {
            Object J = J();
            if (!(J instanceof z) || ((z) J).b != th) {
                m0.r.t.a.r.m.a1.a.b2(getContext(), th);
            }
        }
    }

    public void L(long j, l<? super m0.l.c<? super R>, ? extends Object> lVar) {
        if (j > 0) {
            q(m0.r.t.a.r.m.a1.a.K1(getContext()).C(j, new e(this, lVar), getContext()));
        } else if (e()) {
            m0.n.b.i.e(this, "completion");
            try {
                r.c(lVar, 1);
                Object invoke = ((FlowKt__DelayKt$debounceInternal$1$3$1) lVar).invoke(this);
                if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    resumeWith(invoke);
                }
            } catch (Throwable th) {
                resumeWith(h.l0(th));
            }
        }
    }

    public Object b(k.c cVar) {
        while (true) {
            Object obj = this._state;
            Object obj2 = d.a;
            Object obj3 = d.a;
            if (obj == obj3) {
                if (cVar == null) {
                    if (x.compareAndSet(this, obj3, (Object) null)) {
                        break;
                    }
                } else {
                    c cVar2 = new c(cVar);
                    if (x.compareAndSet(this, obj3, cVar2)) {
                        Object c2 = cVar2.c(this);
                        if (c2 != null) {
                            return c2;
                        }
                    }
                }
            } else if (obj instanceof p) {
                if (cVar != null) {
                    n0.a.h2.d<?> a = cVar.a();
                    if ((a instanceof C0279a) && ((C0279a) a).b == this) {
                        throw new IllegalStateException("Cannot use matching select clauses on the same object".toString());
                    } else if (a.b((p) obj)) {
                        return n0.a.h2.c.b;
                    }
                }
                ((p) obj).c(this);
            } else if (cVar != null && obj == cVar.c) {
                return o.a;
            } else {
                return null;
            }
        }
        H();
        return o.a;
    }

    public boolean e() {
        Object b2 = b((k.c) null);
        if (b2 == o.a) {
            return true;
        }
        if (b2 == null) {
            return false;
        }
        throw new IllegalStateException(m0.n.b.i.k("Unexpected trySelectIdempotent result ", b2).toString());
    }

    public m0.l.f.a.b getCallerFrame() {
        m0.l.c<R> cVar = this.Y1;
        if (cVar instanceof m0.l.f.a.b) {
            return (m0.l.f.a.b) cVar;
        }
        return null;
    }

    public m0.l.e getContext() {
        return this.Y1.getContext();
    }

    public boolean i() {
        while (true) {
            Object obj = this._state;
            Object obj2 = d.a;
            if (obj == d.a) {
                return false;
            }
            if (!(obj instanceof p)) {
                return true;
            }
            ((p) obj).c(this);
        }
    }

    public m0.l.c<R> j() {
        return this;
    }

    public void m(Throwable th) {
        while (true) {
            Object obj = this._result;
            Object obj2 = d.a;
            Object obj3 = d.c;
            if (obj == obj3) {
                if (y.compareAndSet(this, obj3, new z(th, false, 2))) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj != coroutineSingletons) {
                    throw new IllegalStateException("Already resumed");
                } else if (y.compareAndSet(this, coroutineSingletons, d.d)) {
                    h.b2(this.Y1).resumeWith(h.l0(th));
                    return;
                }
            }
        }
    }

    public Object n(n0.a.h2.b bVar) {
        return new C0279a(this, bVar).c((Object) null);
    }

    public void q(o0 o0Var) {
        b bVar = new b(o0Var);
        if (!i()) {
            do {
            } while (!y().s(bVar, this));
            if (!i()) {
                return;
            }
        }
        o0Var.dispose();
    }

    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this._result;
            Object obj3 = d.a;
            Object obj4 = d.c;
            if (obj2 == obj4) {
                if (y.compareAndSet(this, obj4, m0.r.t.a.r.m.a1.a.f4(obj, (l) null, 1))) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj2 != coroutineSingletons) {
                    throw new IllegalStateException("Already resumed");
                } else if (y.compareAndSet(this, coroutineSingletons, d.d)) {
                    if (obj instanceof Result.Failure) {
                        m0.l.c<R> cVar = this.Y1;
                        Throwable a = Result.a(obj);
                        m0.n.b.i.c(a);
                        cVar.resumeWith(h.l0(a));
                        return;
                    }
                    this.Y1.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SelectInstance(state=");
        P0.append(this._state);
        P0.append(", result=");
        P0.append(this._result);
        P0.append(')');
        return P0.toString();
    }
}
