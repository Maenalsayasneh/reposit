package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1;
import m0.n.a.l;
import m0.n.a.p;
import n0.a.f2.g;
import n0.a.f2.m;
import n0.a.f2.q;
import n0.a.h2.k;
import n0.a.h2.s;
import n0.a.h2.t;
import n0.a.n;
import n0.a.o;
import n0.a.o0;

/* compiled from: AbstractChannel.kt */
public abstract class AbstractChannel<E> extends n0.a.f2.b<E> implements n0.a.f2.d<E> {

    /* compiled from: AbstractChannel.kt */
    public static final class a<E> implements n0.a.f2.f<E> {
        public final AbstractChannel<E> a;
        public Object b = n0.a.f2.a.d;

        public a(AbstractChannel<E> abstractChannel) {
            this.a = abstractChannel;
        }

        public Object a(m0.l.c<? super Boolean> cVar) {
            OnUndeliveredElementKt$bindCancellationFun$1 onUndeliveredElementKt$bindCancellationFun$1;
            Object obj = this.b;
            t tVar = n0.a.f2.a.d;
            if (obj != tVar) {
                return Boolean.valueOf(b(obj));
            }
            Object D = this.a.D();
            this.b = D;
            if (D != tVar) {
                return Boolean.valueOf(b(D));
            }
            n<? super Boolean> T1 = m0.r.t.a.r.m.a1.a.T1(i0.j.f.p.h.b2(cVar));
            d dVar = new d(this, T1);
            while (true) {
                if (this.a.x(dVar)) {
                    AbstractChannel<E> abstractChannel = this.a;
                    Objects.requireNonNull(abstractChannel);
                    T1.p(new f(dVar));
                    break;
                }
                Object D2 = this.a.D();
                this.b = D2;
                if (D2 instanceof n0.a.f2.h) {
                    n0.a.f2.h hVar = (n0.a.f2.h) D2;
                    if (hVar.x == null) {
                        T1.resumeWith(Boolean.FALSE);
                    } else {
                        T1.resumeWith(i0.j.f.p.h.l0(hVar.N()));
                    }
                } else if (D2 != n0.a.f2.a.d) {
                    Boolean bool = Boolean.TRUE;
                    l<E, m0.i> lVar = this.a.d;
                    if (lVar == null) {
                        onUndeliveredElementKt$bindCancellationFun$1 = null;
                    } else {
                        onUndeliveredElementKt$bindCancellationFun$1 = new OnUndeliveredElementKt$bindCancellationFun$1(lVar, D2, T1.Z1);
                    }
                    T1.B(bool, T1.q, onUndeliveredElementKt$bindCancellationFun$1);
                }
            }
            Object o = T1.o();
            if (o == CoroutineSingletons.COROUTINE_SUSPENDED) {
                m0.n.b.i.e(cVar, "frame");
            }
            return o;
        }

        public final boolean b(Object obj) {
            if (!(obj instanceof n0.a.f2.h)) {
                return true;
            }
            n0.a.f2.h hVar = (n0.a.f2.h) obj;
            if (hVar.x == null) {
                return false;
            }
            Throwable N = hVar.N();
            String str = s.a;
            throw N;
        }

        public E next() {
            E e = this.b;
            if (!(e instanceof n0.a.f2.h)) {
                E e2 = n0.a.f2.a.d;
                if (e != e2) {
                    this.b = e2;
                    return e;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            Throwable N = ((n0.a.f2.h) e).N();
            String str = s.a;
            throw N;
        }
    }

    /* compiled from: AbstractChannel.kt */
    public static class b<E> extends m<E> {
        public final n0.a.m<Object> x;
        public final int y;

        public b(n0.a.m<Object> mVar, int i) {
            this.x = mVar;
            this.y = i;
        }

        public void J(n0.a.f2.h<?> hVar) {
            if (this.y == 1) {
                this.x.resumeWith(new n0.a.f2.g(new g.a(hVar.x)));
            } else {
                this.x.resumeWith(i0.j.f.p.h.l0(hVar.N()));
            }
        }

        public void k(E e) {
            this.x.O(o.a);
        }

        public t o(E e, k.c cVar) {
            if (this.x.z(this.y == 1 ? new n0.a.f2.g(e) : e, (Object) null, H(e)) == null) {
                return null;
            }
            return o.a;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ReceiveElement@");
            P0.append(m0.r.t.a.r.m.a1.a.M1(this));
            P0.append("[receiveMode=");
            return i0.d.a.a.a.s0(P0, this.y, ']');
        }
    }

    /* compiled from: AbstractChannel.kt */
    public static final class c<E> extends b<E> {
        public final l<E, m0.i> Y1;

        public c(n0.a.m<Object> mVar, int i, l<? super E, m0.i> lVar) {
            super(mVar, i);
            this.Y1 = lVar;
        }

        public l<Throwable, m0.i> H(E e) {
            return new OnUndeliveredElementKt$bindCancellationFun$1(this.Y1, e, this.x.getContext());
        }
    }

    /* compiled from: AbstractChannel.kt */
    public static class d<E> extends m<E> {
        public final a<E> x;
        public final n0.a.m<Boolean> y;

        public d(a<E> aVar, n0.a.m<? super Boolean> mVar) {
            this.x = aVar;
            this.y = mVar;
        }

        public l<Throwable, m0.i> H(E e) {
            l<E, m0.i> lVar = this.x.a.d;
            if (lVar == null) {
                return null;
            }
            return new OnUndeliveredElementKt$bindCancellationFun$1(lVar, e, this.y.getContext());
        }

        public void J(n0.a.f2.h<?> hVar) {
            Object obj;
            if (hVar.x == null) {
                obj = this.y.c(Boolean.FALSE, (Object) null);
            } else {
                obj = this.y.x(hVar.N());
            }
            if (obj != null) {
                this.x.b = hVar;
                this.y.O(obj);
            }
        }

        public void k(E e) {
            this.x.b = e;
            this.y.O(o.a);
        }

        public t o(E e, k.c cVar) {
            if (this.y.z(Boolean.TRUE, (Object) null, H(e)) == null) {
                return null;
            }
            return o.a;
        }

        public String toString() {
            return m0.n.b.i.k("ReceiveHasNext@", m0.r.t.a.r.m.a1.a.M1(this));
        }
    }

    /* compiled from: AbstractChannel.kt */
    public static final class e<R, E> extends m<E> implements o0 {
        public final p<Object, m0.l.c<? super R>, Object> Y1;
        public final int Z1;
        public final AbstractChannel<E> x;
        public final n0.a.j2.c<R> y;

        public e(AbstractChannel<E> abstractChannel, n0.a.j2.c<? super R> cVar, p<Object, ? super m0.l.c<? super R>, ? extends Object> pVar, int i) {
            this.x = abstractChannel;
            this.y = cVar;
            this.Y1 = pVar;
            this.Z1 = i;
        }

        public l<Throwable, m0.i> H(E e) {
            l<E, m0.i> lVar = this.x.d;
            if (lVar == null) {
                return null;
            }
            return new OnUndeliveredElementKt$bindCancellationFun$1(lVar, e, this.y.j().getContext());
        }

        public void J(n0.a.f2.h<?> hVar) {
            if (this.y.e()) {
                int i = this.Z1;
                if (i == 0) {
                    this.y.m(hVar.N());
                } else if (i == 1) {
                    m0.r.t.a.r.m.a1.a.I3(this.Y1, new n0.a.f2.g(new g.a(hVar.x)), this.y.j(), (l) null, 4);
                }
            }
        }

        public void dispose() {
            if (E()) {
                Objects.requireNonNull(this.x);
            }
        }

        public void k(E e) {
            p<Object, m0.l.c<? super R>, Object> pVar = this.Y1;
            E gVar = this.Z1 == 1 ? new n0.a.f2.g(e) : e;
            m0.l.c<R> j = this.y.j();
            try {
                n0.a.h2.h.a(i0.j.f.p.h.b2(i0.j.f.p.h.f0(pVar, gVar, j)), m0.i.a, H(e));
            } catch (Throwable th) {
                m0.r.t.a.r.m.a1.a.C(j, th);
                throw null;
            }
        }

        public t o(E e, k.c cVar) {
            return (t) this.y.b((k.c) null);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ReceiveSelect@");
            P0.append(m0.r.t.a.r.m.a1.a.M1(this));
            P0.append('[');
            P0.append(this.y);
            P0.append(",receiveMode=");
            return i0.d.a.a.a.s0(P0, this.Z1, ']');
        }
    }

    /* compiled from: AbstractChannel.kt */
    public final class f extends n0.a.f {
        public final m<?> c;

        public f(m<?> mVar) {
            this.c = mVar;
        }

        public void a(Throwable th) {
            if (this.c.E()) {
                Objects.requireNonNull(AbstractChannel.this);
            }
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            if (this.c.E()) {
                Objects.requireNonNull(AbstractChannel.this);
            }
            return m0.i.a;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("RemoveReceiveOnCancel[");
            P0.append(this.c);
            P0.append(']');
            return P0.toString();
        }
    }

    /* compiled from: AbstractChannel.kt */
    public static final class g<E> extends k.d<q> {
        public g(n0.a.h2.i iVar) {
            super(iVar);
        }

        public Object c(k kVar) {
            if (kVar instanceof n0.a.f2.h) {
                return kVar;
            }
            if (!(kVar instanceof q)) {
                return n0.a.f2.a.d;
            }
            return null;
        }

        public Object h(k.c cVar) {
            t L = ((q) cVar.a).L(cVar);
            if (L == null) {
                return n0.a.h2.l.a;
            }
            Object obj = n0.a.h2.c.b;
            if (L == obj) {
                return obj;
            }
            return null;
        }

        public void i(k kVar) {
            ((q) kVar).M();
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static final class h extends k.b {
        public final /* synthetic */ AbstractChannel d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(k kVar, AbstractChannel abstractChannel) {
            super(kVar);
            this.d = abstractChannel;
        }

        public Object i(Object obj) {
            k kVar = (k) obj;
            if (this.d.z()) {
                return null;
            }
            return n0.a.h2.j.a;
        }
    }

    /* compiled from: AbstractChannel.kt */
    public static final class i implements n0.a.j2.b<E> {
        public final /* synthetic */ AbstractChannel<E> c;

        public i(AbstractChannel<E> abstractChannel) {
            this.c = abstractChannel;
        }

        public <R> void d(n0.a.j2.c<? super R> cVar, p<? super E, ? super m0.l.c<? super R>, ? extends Object> pVar) {
            AbstractChannel.w(this.c, cVar, 0, pVar);
        }
    }

    /* compiled from: AbstractChannel.kt */
    public static final class j implements n0.a.j2.b<n0.a.f2.g<? extends E>> {
        public final /* synthetic */ AbstractChannel<E> c;

        public j(AbstractChannel<E> abstractChannel) {
            this.c = abstractChannel;
        }

        public <R> void d(n0.a.j2.c<? super R> cVar, p<? super n0.a.f2.g<? extends E>, ? super m0.l.c<? super R>, ? extends Object> pVar) {
            AbstractChannel.w(this.c, cVar, 1, pVar);
        }
    }

    public AbstractChannel(l<? super E, m0.i> lVar) {
        super(lVar);
    }

    public static final void w(AbstractChannel abstractChannel, n0.a.j2.c cVar, int i2, p pVar) {
        Objects.requireNonNull(abstractChannel);
        while (!cVar.i()) {
            if (!(abstractChannel.q.w() instanceof q) && abstractChannel.z()) {
                e eVar = new e(abstractChannel, cVar, pVar, i2);
                boolean x = abstractChannel.x(eVar);
                if (x) {
                    cVar.q(eVar);
                }
                if (x) {
                    return;
                }
            } else {
                Object E = abstractChannel.E(cVar);
                Object obj = n0.a.j2.d.a;
                if (E != n0.a.j2.d.b) {
                    if (!(E == n0.a.f2.a.d || E == n0.a.h2.c.b)) {
                        boolean z = E instanceof n0.a.f2.h;
                        if (z) {
                            if (i2 == 0) {
                                Throwable N = ((n0.a.f2.h) E).N();
                                String str = s.a;
                                throw N;
                            } else if (i2 == 1 && cVar.e()) {
                                m0.r.t.a.r.m.a1.a.J3(pVar, new n0.a.f2.g(new g.a(((n0.a.f2.h) E).x)), cVar.j());
                            }
                        } else if (i2 == 1) {
                            if (z) {
                                E = new g.a(((n0.a.f2.h) E).x);
                            }
                            m0.r.t.a.r.m.a1.a.J3(pVar, new n0.a.f2.g(E), cVar.j());
                        } else {
                            m0.r.t.a.r.m.a1.a.J3(pVar, E, cVar.j());
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public boolean A() {
        k w = this.q.w();
        n0.a.f2.h hVar = null;
        n0.a.f2.h hVar2 = w instanceof n0.a.f2.h ? (n0.a.f2.h) w : null;
        if (hVar2 != null) {
            i(hVar2);
            hVar = hVar2;
        }
        return hVar != null && z();
    }

    public void B(boolean z) {
        n0.a.f2.h<?> f2 = f();
        if (f2 != null) {
            Object obj = null;
            while (true) {
                k y = f2.y();
                if (y instanceof n0.a.h2.i) {
                    C(obj, f2);
                    return;
                } else if (!y.E()) {
                    y.B();
                } else {
                    obj = m0.r.t.a.r.m.a1.a.U2(obj, (q) y);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    public void C(Object obj, n0.a.f2.h<?> hVar) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((q) obj).K(hVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = size - 1;
                    ((q) arrayList.get(size)).K(hVar);
                    if (i2 >= 0) {
                        size = i2;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public Object D() {
        while (true) {
            q v = v();
            if (v == null) {
                return n0.a.f2.a.d;
            }
            if (v.L((k.c) null) != null) {
                v.H();
                return v.J();
            }
            v.M();
        }
    }

    public Object E(n0.a.j2.c<?> cVar) {
        g gVar = new g(this.q);
        Object n = cVar.n(gVar);
        if (n != null) {
            return n;
        }
        ((q) gVar.m()).H();
        return ((q) gVar.m()).J();
    }

    public final void b(CancellationException cancellationException) {
        if (!A()) {
            if (cancellationException == null) {
                cancellationException = new CancellationException(m0.n.b.i.k(getClass().getSimpleName(), " was cancelled"));
            }
            B(o(cancellationException));
        }
    }

    public final n0.a.j2.b<E> g() {
        return new i(this);
    }

    public final n0.a.j2.b<n0.a.f2.g<E>> h() {
        return new j(this);
    }

    public n0.a.j2.b<E> j() {
        return new ReceiveChannel$onReceiveOrNull$1(this);
    }

    public final Object m() {
        Object D = D();
        if (D == n0.a.f2.a.d) {
            return n0.a.f2.g.b;
        }
        return D instanceof n0.a.f2.h ? new g.a(((n0.a.f2.h) D).x) : D;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(m0.l.c<? super n0.a.f2.g<? extends E>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            i0.j.f.p.h.d4(r7)
            goto L_0x00a8
        L_0x0028:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0030:
            i0.j.f.p.h.d4(r7)
            java.lang.Object r7 = r6.D()
            n0.a.h2.t r2 = n0.a.f2.a.d
            if (r7 == r2) goto L_0x004a
            boolean r0 = r7 instanceof n0.a.f2.h
            if (r0 == 0) goto L_0x0049
            n0.a.f2.h r7 = (n0.a.f2.h) r7
            java.lang.Throwable r7 = r7.x
            n0.a.f2.g$a r0 = new n0.a.f2.g$a
            r0.<init>(r7)
            r7 = r0
        L_0x0049:
            return r7
        L_0x004a:
            r0.q = r3
            m0.l.c r7 = i0.j.f.p.h.b2(r0)
            n0.a.n r7 = m0.r.t.a.r.m.a1.a.T1(r7)
            m0.n.a.l<E, m0.i> r2 = r6.d
            if (r2 != 0) goto L_0x005e
            kotlinx.coroutines.channels.AbstractChannel$b r2 = new kotlinx.coroutines.channels.AbstractChannel$b
            r2.<init>(r7, r3)
            goto L_0x0065
        L_0x005e:
            kotlinx.coroutines.channels.AbstractChannel$c r2 = new kotlinx.coroutines.channels.AbstractChannel$c
            m0.n.a.l<E, m0.i> r4 = r6.d
            r2.<init>(r7, r3, r4)
        L_0x0065:
            boolean r4 = r6.x(r2)
            if (r4 == 0) goto L_0x0074
            kotlinx.coroutines.channels.AbstractChannel$f r3 = new kotlinx.coroutines.channels.AbstractChannel$f
            r3.<init>(r2)
            r7.p(r3)
            goto L_0x0098
        L_0x0074:
            java.lang.Object r4 = r6.D()
            boolean r5 = r4 instanceof n0.a.f2.h
            if (r5 == 0) goto L_0x0082
            n0.a.f2.h r4 = (n0.a.f2.h) r4
            r2.J(r4)
            goto L_0x0098
        L_0x0082:
            n0.a.h2.t r5 = n0.a.f2.a.d
            if (r4 == r5) goto L_0x0065
            int r5 = r2.y
            if (r5 != r3) goto L_0x0090
            n0.a.f2.g r3 = new n0.a.f2.g
            r3.<init>(r4)
            goto L_0x0091
        L_0x0090:
            r3 = r4
        L_0x0091:
            m0.n.a.l r2 = r2.H(r4)
            r7.y(r3, r2)
        L_0x0098:
            java.lang.Object r7 = r7.o()
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r7 != r2) goto L_0x00a5
            java.lang.String r2 = "frame"
            m0.n.b.i.e(r0, r2)
        L_0x00a5:
            if (r7 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            n0.a.f2.g r7 = (n0.a.f2.g) r7
            java.lang.Object r7 = r7.c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractChannel.n(m0.l.c):java.lang.Object");
    }

    public n0.a.f2.o<E> q() {
        n0.a.f2.o<E> q = super.q();
        if (q != null) {
            boolean z = q instanceof n0.a.f2.h;
        }
        return q;
    }

    public boolean x(m<? super E> mVar) {
        int G;
        k y;
        if (y()) {
            n0.a.h2.i iVar = this.q;
            do {
                y = iVar.y();
                if (!(!(y instanceof q))) {
                    return false;
                }
            } while (!y.s(mVar, iVar));
        } else {
            n0.a.h2.i iVar2 = this.q;
            h hVar = new h(mVar, this);
            do {
                k y2 = iVar2.y();
                if (!(!(y2 instanceof q))) {
                    return false;
                }
                G = y2.G(mVar, iVar2, hVar);
                if (G != 1) {
                }
            } while (G != 2);
            return false;
        }
        return true;
    }

    public abstract boolean y();

    public abstract boolean z();
}
