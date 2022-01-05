package n0.a.f2;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.UndeliveredElementException;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.b.r;
import n0.a.f2.g;
import n0.a.h2.j;
import n0.a.h2.k;
import n0.a.h2.s;
import n0.a.h2.t;
import n0.a.n;
import n0.a.o;
import n0.a.q1;

/* compiled from: AbstractChannel.kt */
public abstract class b<E> implements r<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "onCloseHandler");
    public final l<E, i> d;
    private volatile /* synthetic */ Object onCloseHandler = null;
    public final n0.a.h2.i q = new n0.a.h2.i();

    /* compiled from: AbstractChannel.kt */
    public static final class a<E> extends q {
        public final E x;

        public a(E e) {
            this.x = e;
        }

        public void H() {
        }

        public Object J() {
            return this.x;
        }

        public void K(h<?> hVar) {
        }

        public t L(k.c cVar) {
            t tVar = o.a;
            if (cVar != null) {
                cVar.c.e(cVar);
            }
            return tVar;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("SendBuffered@");
            P0.append(m0.r.t.a.r.m.a1.a.M1(this));
            P0.append('(');
            P0.append(this.x);
            P0.append(')');
            return P0.toString();
        }
    }

    /* renamed from: n0.a.f2.b$b  reason: collision with other inner class name */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C0278b extends k.b {
        public final /* synthetic */ b d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0278b(k kVar, b bVar) {
            super(kVar);
            this.d = bVar;
        }

        public Object i(Object obj) {
            k kVar = (k) obj;
            if (this.d.l()) {
                return null;
            }
            return j.a;
        }
    }

    public b(l<? super E, i> lVar) {
        this.d = lVar;
    }

    public static final void a(b bVar, c cVar, Object obj, h hVar) {
        UndeliveredElementException j02;
        bVar.i(hVar);
        Throwable P = hVar.P();
        l<E, i> lVar = bVar.d;
        if (lVar == null || (j02 = m0.r.t.a.r.m.a1.a.j0(lVar, obj, (UndeliveredElementException) null, 2)) == null) {
            ((n) cVar).resumeWith(h.l0(P));
            return;
        }
        h.m(j02, P);
        ((n) cVar).resumeWith(h.l0(j02));
    }

    public Object c(q qVar) {
        boolean z;
        k y;
        if (k()) {
            n0.a.h2.i iVar = this.q;
            do {
                y = iVar.y();
                if (y instanceof o) {
                    return y;
                }
            } while (!y.s(qVar, iVar));
            return null;
        }
        n0.a.h2.i iVar2 = this.q;
        C0278b bVar = new C0278b(qVar, this);
        while (true) {
            k y2 = iVar2.y();
            if (!(y2 instanceof o)) {
                int G = y2.G(qVar, iVar2, bVar);
                z = true;
                if (G != 1) {
                    if (G == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return y2;
            }
        }
        if (!z) {
            return a.e;
        }
        return null;
    }

    public String d() {
        return "";
    }

    public final h<?> f() {
        k y = this.q.y();
        h<?> hVar = y instanceof h ? (h) y : null;
        if (hVar == null) {
            return null;
        }
        i(hVar);
        return hVar;
    }

    public final void i(h<?> hVar) {
        Object obj = null;
        while (true) {
            k y = hVar.y();
            m mVar = y instanceof m ? (m) y : null;
            if (mVar == null) {
                break;
            } else if (!mVar.E()) {
                mVar.B();
            } else {
                obj = m0.r.t.a.r.m.a1.a.U2(obj, mVar);
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((m) obj).J(hVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    ((m) arrayList.get(size)).J(hVar);
                    if (i >= 0) {
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public abstract boolean k();

    public abstract boolean l();

    public boolean o(Throwable th) {
        boolean z;
        Object obj;
        t tVar;
        h hVar = new h(th);
        n0.a.h2.i iVar = this.q;
        while (true) {
            k y = iVar.y();
            if (!(y instanceof h)) {
                if (y.s(hVar, iVar)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            hVar = (h) this.q.y();
        }
        i(hVar);
        if (z && (obj = this.onCloseHandler) != null && obj != (tVar = a.f) && c.compareAndSet(this, obj, tVar)) {
            r.c(obj, 1);
            ((l) obj).invoke(th);
        }
        return z;
    }

    public boolean offer(E e) {
        UndeliveredElementException j02;
        try {
            Object s = s(e);
            if (!(s instanceof g.c)) {
                return true;
            }
            Throwable a2 = g.a(s);
            if (a2 == null) {
                return false;
            }
            String str = s.a;
            throw a2;
        } catch (Throwable th) {
            l<E, i> lVar = this.d;
            if (lVar == null || (j02 = m0.r.t.a.r.m.a1.a.j0(lVar, e, (UndeliveredElementException) null, 2)) == null) {
                throw th;
            }
            h.m(j02, th);
            throw j02;
        }
    }

    public Object p(E e) {
        o q2;
        do {
            q2 = q();
            if (q2 == null) {
                return a.c;
            }
        } while (q2.o(e, (k.c) null) == null);
        q2.k(e);
        return q2.d();
    }

    public o<E> q() {
        k kVar;
        k F;
        n0.a.h2.i iVar = this.q;
        while (true) {
            kVar = (k) iVar.v();
            if (kVar != iVar && (kVar instanceof o)) {
                if (((((o) kVar) instanceof h) && !kVar.D()) || (F = kVar.F()) == null) {
                    break;
                }
                F.C();
            }
        }
        kVar = null;
        return (o) kVar;
    }

    public void r(l<? super Throwable, i> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, lVar)) {
            Object obj = this.onCloseHandler;
            if (obj == a.f) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException(m0.n.b.i.k("Another handler was already registered: ", obj));
        }
        h<?> f = f();
        if (f != null && atomicReferenceFieldUpdater.compareAndSet(this, lVar, a.f)) {
            lVar.invoke(f.x);
        }
    }

    public final Object s(E e) {
        g.a aVar;
        Object p = p(e);
        if (p == a.b) {
            return i.a;
        }
        if (p == a.c) {
            h<?> f = f();
            if (f == null) {
                return g.b;
            }
            i(f);
            aVar = new g.a(f.P());
        } else if (p instanceof h) {
            h hVar = (h) p;
            i(hVar);
            aVar = new g.a(hVar.P());
        } else {
            throw new IllegalStateException(m0.n.b.i.k("trySend returned ", p).toString());
        }
        return aVar;
    }

    public final Object t(E e, c<? super i> cVar) {
        q qVar;
        if (p(e) == a.b) {
            return i.a;
        }
        n<? super i> T1 = m0.r.t.a.r.m.a1.a.T1(h.b2(cVar));
        while (true) {
            if (!(this.q.w() instanceof o) && l()) {
                if (this.d == null) {
                    qVar = new s(e, T1);
                } else {
                    qVar = new t(e, T1, this.d);
                }
                Object c2 = c(qVar);
                if (c2 == null) {
                    T1.p(new q1(qVar));
                    break;
                } else if (c2 instanceof h) {
                    a(this, T1, e, (h) c2);
                    break;
                } else if (c2 != a.e && !(c2 instanceof m)) {
                    throw new IllegalStateException(m0.n.b.i.k("enqueueSend returned ", c2).toString());
                }
            }
            Object p = p(e);
            if (p == a.b) {
                T1.resumeWith(i.a);
                break;
            } else if (p != a.c) {
                if (p instanceof h) {
                    a(this, T1, e, (h) p);
                } else {
                    throw new IllegalStateException(m0.n.b.i.k("offerInternal returned ", p).toString());
                }
            }
        }
        Object o = T1.o();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (o == coroutineSingletons) {
            m0.n.b.i.e(cVar, "frame");
        }
        if (o != coroutineSingletons) {
            o = i.a;
        }
        if (o == coroutineSingletons) {
            return o;
        }
        return i.a;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(m0.r.t.a.r.m.a1.a.M1(this));
        sb.append('{');
        k w = this.q.w();
        if (w == this.q) {
            str = "EmptyQueue";
        } else {
            if (w instanceof h) {
                str2 = w.toString();
            } else if (w instanceof m) {
                str2 = "ReceiveQueued";
            } else if (w instanceof q) {
                str2 = "SendQueued";
            } else {
                str2 = m0.n.b.i.k("UNEXPECTED:", w);
            }
            k y = this.q.y();
            if (y != w) {
                StringBuilder S0 = i0.d.a.a.a.S0(str2, ",queueSize=");
                n0.a.h2.i iVar = this.q;
                int i = 0;
                for (k kVar = (k) iVar.v(); !m0.n.b.i.a(kVar, iVar); kVar = kVar.w()) {
                    if (kVar instanceof k) {
                        i++;
                    }
                }
                S0.append(i);
                str = S0.toString();
                if (y instanceof h) {
                    str = str + ",closedForSend=" + y;
                }
            } else {
                str = str2;
            }
        }
        sb.append(str);
        sb.append('}');
        sb.append(d());
        return sb.toString();
    }

    public final boolean u() {
        return f() != null;
    }

    public final q v() {
        k kVar;
        k F;
        n0.a.h2.i iVar = this.q;
        while (true) {
            kVar = (k) iVar.v();
            if (kVar != iVar && (kVar instanceof q)) {
                if (((((q) kVar) instanceof h) && !kVar.D()) || (F = kVar.F()) == null) {
                    break;
                }
                F.C();
            }
        }
        kVar = null;
        return (q) kVar;
    }
}
