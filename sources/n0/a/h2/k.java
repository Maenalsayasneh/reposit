package n0.a.h2;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.n.b.i;

/* compiled from: LockFreeLinkedList.kt */
public class k {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater q;
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class a extends b {
        public final void a(d<?> dVar, Object obj) {
            k g;
            boolean z = obj == null;
            k f = f();
            if (f != null && (g = g()) != null) {
                if (k.c.compareAndSet(f, dVar, z ? l(f, g) : g) && z) {
                    d(f, g);
                }
            }
        }

        public final Object b(d<?> dVar) {
            while (true) {
                k k = k(dVar);
                if (k == null) {
                    return c.b;
                }
                Object obj = k._next;
                if (obj == dVar || dVar.h()) {
                    return null;
                }
                if (obj instanceof p) {
                    p pVar = (p) obj;
                    if (dVar.b(pVar)) {
                        return c.b;
                    }
                    pVar.c(k);
                } else {
                    Object c = c(k);
                    if (c != null) {
                        return c;
                    }
                    if (j(k, obj)) {
                        continue;
                    } else {
                        c cVar = new c(k, (k) obj, this);
                        if (k.c.compareAndSet(k, obj, cVar)) {
                            try {
                                if (cVar.c(k) != l.a) {
                                    return null;
                                }
                            } catch (Throwable th) {
                                k.c.compareAndSet(k, cVar, obj);
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        public abstract Object c(k kVar);

        public abstract void d(k kVar, k kVar2);

        public abstract void e(c cVar);

        public abstract k f();

        public abstract k g();

        public Object h(c cVar) {
            e(cVar);
            return null;
        }

        public void i(k kVar) {
        }

        public abstract boolean j(k kVar, Object obj);

        public abstract k k(p pVar);

        public abstract Object l(k kVar, k kVar2);
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class b extends d<k> {
        public final k b;
        public k c;

        public b(k kVar) {
            this.b = kVar;
        }

        public void d(Object obj, Object obj2) {
            k kVar = (k) obj;
            boolean z = obj2 == null;
            k kVar2 = z ? this.b : this.c;
            if (kVar2 != null && k.c.compareAndSet(kVar, this, kVar2) && z) {
                k kVar3 = this.b;
                k kVar4 = this.c;
                i.c(kVar4);
                kVar3.u(kVar4);
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static final class c extends p {
        public final k a;
        public final k b;
        public final a c;

        public c(k kVar, k kVar2, a aVar) {
            this.a = kVar;
            this.b = kVar2;
            this.c = aVar;
        }

        public d<?> a() {
            d<?> dVar = this.c.a;
            if (dVar != null) {
                return dVar;
            }
            i.m("atomicOp");
            throw null;
        }

        public Object c(Object obj) {
            Object obj2;
            Object obj3;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            k kVar = (k) obj;
            Object h = this.c.h(this);
            Object obj4 = l.a;
            if (h == obj4) {
                k kVar2 = this.b;
                if (k.c.compareAndSet(kVar, this, k.r(kVar2))) {
                    this.c.i(kVar);
                    kVar2.t((p) null);
                }
                return obj4;
            }
            if (h != null) {
                obj2 = a().e(h);
            } else {
                obj2 = a().f();
            }
            if (obj2 == c.a) {
                obj3 = a();
            } else if (obj2 == null) {
                obj3 = this.c.l(kVar, this.b);
            } else {
                obj3 = this.b;
            }
            k.c.compareAndSet(kVar, this, obj3);
            return null;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("PrepareOp(op=");
            P0.append(a());
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static class d<T> extends a {
        public static final /* synthetic */ AtomicReferenceFieldUpdater b;
        public static final /* synthetic */ AtomicReferenceFieldUpdater c;
        private volatile /* synthetic */ Object _affectedNode = null;
        private volatile /* synthetic */ Object _originalNext = null;
        public final k d;

        static {
            Class<Object> cls = Object.class;
            Class<d> cls2 = d.class;
            b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_affectedNode");
            c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_originalNext");
        }

        public d(k kVar) {
            this.d = kVar;
        }

        public Object c(k kVar) {
            if (kVar == this.d) {
                return j.b;
            }
            return null;
        }

        public final void d(k kVar, k kVar2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.c;
            kVar2.t((p) null);
        }

        public void e(c cVar) {
            b.compareAndSet(this, (Object) null, cVar.a);
            c.compareAndSet(this, (Object) null, cVar.b);
        }

        public final k f() {
            return (k) this._affectedNode;
        }

        public final k g() {
            return (k) this._originalNext;
        }

        public final boolean j(k kVar, Object obj) {
            if (!(obj instanceof q)) {
                return false;
            }
            ((q) obj).a.C();
            return true;
        }

        public final k k(p pVar) {
            k kVar = this.d;
            while (true) {
                Object obj = kVar._next;
                if (!(obj instanceof p)) {
                    return (k) obj;
                }
                p pVar2 = (p) obj;
                if (pVar.b(pVar2)) {
                    return null;
                }
                pVar2.c(this.d);
            }
        }

        public final Object l(k kVar, k kVar2) {
            return k.r(kVar2);
        }

        public final T m() {
            T t = (k) this._affectedNode;
            i.c(t);
            return t;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<k> cls2 = k.class;
        c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        d = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        q = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    public static final q r(k kVar) {
        q qVar = (q) kVar._removedRef;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(kVar);
        q.lazySet(kVar, qVar2);
        return qVar2;
    }

    public final void B() {
        ((q) v()).a.t((p) null);
    }

    public final void C() {
        k kVar = this;
        while (true) {
            Object v = kVar.v();
            if (!(v instanceof q)) {
                kVar.t((p) null);
                return;
            }
            kVar = ((q) v).a;
        }
    }

    public boolean D() {
        return v() instanceof q;
    }

    public boolean E() {
        return F() == null;
    }

    public final k F() {
        Object v;
        k kVar;
        q qVar;
        do {
            v = v();
            if (v instanceof q) {
                return ((q) v).a;
            }
            if (v == this) {
                return (k) v;
            }
            kVar = (k) v;
            qVar = (q) kVar._removedRef;
            if (qVar == null) {
                qVar = new q(kVar);
                q.lazySet(kVar, qVar);
            }
        } while (!c.compareAndSet(this, v, qVar));
        kVar.t((p) null);
        return null;
    }

    public final int G(k kVar, k kVar2, b bVar) {
        d.lazySet(kVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        atomicReferenceFieldUpdater.lazySet(kVar, kVar2);
        bVar.c = kVar2;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, kVar2, bVar)) {
            return 0;
        }
        return bVar.c(this) == null ? 1 : 2;
    }

    public final boolean s(k kVar, k kVar2) {
        d.lazySet(kVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        atomicReferenceFieldUpdater.lazySet(kVar, kVar2);
        if (!atomicReferenceFieldUpdater.compareAndSet(this, kVar2, kVar)) {
            return false;
        }
        kVar.u(kVar2);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: n0.a.h2.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: n0.a.h2.k} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (c.compareAndSet(r3, r2, ((n0.a.h2.q) r4).a) != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n0.a.h2.k t(n0.a.h2.p r8) {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7._prev
            n0.a.h2.k r0 = (n0.a.h2.k) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = d
            boolean r0 = r1.compareAndSet(r7, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r7.D()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r8) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof n0.a.h2.p
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0032
            r0 = r4
            n0.a.h2.p r0 = (n0.a.h2.p) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            n0.a.h2.p r4 = (n0.a.h2.p) r4
            r4.c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof n0.a.h2.q
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = c
            n0.a.h2.q r4 = (n0.a.h2.q) r4
            n0.a.h2.k r4 = r4.a
            boolean r2 = r5.compareAndSet(r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            n0.a.h2.k r2 = (n0.a.h2.k) r2
            goto L_0x0007
        L_0x0052:
            r3 = r4
            n0.a.h2.k r3 = (n0.a.h2.k) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.h2.k.t(n0.a.h2.p):n0.a.h2.k");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    public final void u(k kVar) {
        k kVar2;
        do {
            kVar2 = (k) kVar._prev;
            if (v() != kVar) {
                return;
            }
        } while (!d.compareAndSet(kVar, kVar2, this));
        if (D()) {
            kVar.t((p) null);
        }
    }

    public final Object v() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).c(this);
        }
    }

    public final k w() {
        Object v = v();
        q qVar = v instanceof q ? (q) v : null;
        return qVar == null ? (k) v : qVar.a;
    }

    public final k y() {
        k t = t((p) null);
        if (t == null) {
            Object obj = this._prev;
            while (true) {
                t = (k) obj;
                if (!t.D()) {
                    break;
                }
                obj = t._prev;
            }
        }
        return t;
    }
}
