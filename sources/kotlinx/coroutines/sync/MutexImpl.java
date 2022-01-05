package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.i;
import n0.a.h2.d;
import n0.a.h2.k;
import n0.a.h2.p;
import n0.a.m;
import n0.a.o0;

/* compiled from: Mutex.kt */
public final class MutexImpl implements n0.a.k2.b {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state;

    /* compiled from: Mutex.kt */
    public final class LockCont extends a {
        public final m<i> y;

        public LockCont(Object obj, m<? super i> mVar) {
            super(MutexImpl.this, obj);
            this.y = mVar;
        }

        public void H(Object obj) {
            this.y.O(obj);
        }

        public Object J() {
            return this.y.z(i.a, (Object) null, new MutexImpl$LockCont$tryResumeLockWaiter$1(MutexImpl.this, this));
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("LockCont[");
            P0.append(this.x);
            P0.append(", ");
            P0.append(this.y);
            P0.append("] for ");
            P0.append(MutexImpl.this);
            return P0.toString();
        }
    }

    /* compiled from: Mutex.kt */
    public abstract class a extends k implements o0 {
        public final Object x;

        public a(MutexImpl mutexImpl, Object obj) {
            this.x = obj;
        }

        public abstract void H(Object obj);

        public abstract Object J();

        public final void dispose() {
            E();
        }
    }

    /* compiled from: Mutex.kt */
    public static final class b extends n0.a.h2.i {
        public Object x;

        public b(Object obj) {
            this.x = obj;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("LockedQueue[");
            P0.append(this.x);
            P0.append(']');
            return P0.toString();
        }
    }

    /* compiled from: Mutex.kt */
    public static final class c extends d<MutexImpl> {
        public final b b;

        public c(b bVar) {
            this.b = bVar;
        }

        public void d(Object obj, Object obj2) {
            MutexImpl.a.compareAndSet((MutexImpl) obj, this, obj2 == null ? n0.a.k2.d.e : this.b);
        }

        public Object i(Object obj) {
            MutexImpl mutexImpl = (MutexImpl) obj;
            b bVar = this.b;
            if (bVar.v() == bVar) {
                return null;
            }
            return n0.a.k2.d.a;
        }
    }

    public MutexImpl(boolean z) {
        this._state = z ? n0.a.k2.d.d : n0.a.k2.d.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r11 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.Object r11, m0.l.c<? super m0.i> r12) {
        /*
            r10 = this;
        L_0x0000:
            java.lang.Object r11 = r10._state
            boolean r0 = r11 instanceof n0.a.k2.a
            java.lang.String r1 = "Already locked by "
            java.lang.String r2 = "Illegal state "
            r3 = 0
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0023
            r0 = r11
            n0.a.k2.a r0 = (n0.a.k2.a) r0
            java.lang.Object r0 = r0.a
            n0.a.h2.t r6 = n0.a.k2.d.c
            if (r0 == r6) goto L_0x0017
            goto L_0x0032
        L_0x0017:
            n0.a.k2.a r0 = n0.a.k2.d.d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = a
            boolean r11 = r6.compareAndSet(r10, r11, r0)
            if (r11 == 0) goto L_0x0000
            r11 = r4
            goto L_0x0033
        L_0x0023:
            boolean r0 = r11 instanceof kotlinx.coroutines.sync.MutexImpl.b
            if (r0 == 0) goto L_0x00f8
            kotlinx.coroutines.sync.MutexImpl$b r11 = (kotlinx.coroutines.sync.MutexImpl.b) r11
            java.lang.Object r11 = r11.x
            if (r11 == 0) goto L_0x002f
            r11 = r4
            goto L_0x0030
        L_0x002f:
            r11 = r3
        L_0x0030:
            if (r11 == 0) goto L_0x00ea
        L_0x0032:
            r11 = r3
        L_0x0033:
            if (r11 == 0) goto L_0x0038
            m0.i r11 = m0.i.a
            return r11
        L_0x0038:
            m0.l.c r11 = i0.j.f.p.h.b2(r12)
            n0.a.n r11 = m0.r.t.a.r.m.a1.a.T1(r11)
            kotlinx.coroutines.sync.MutexImpl$LockCont r0 = new kotlinx.coroutines.sync.MutexImpl$LockCont
            r0.<init>(r5, r11)
        L_0x0045:
            java.lang.Object r6 = r10._state
            boolean r7 = r6 instanceof n0.a.k2.a
            if (r7 == 0) goto L_0x0078
            r7 = r6
            n0.a.k2.a r7 = (n0.a.k2.a) r7
            java.lang.Object r8 = r7.a
            n0.a.h2.t r9 = n0.a.k2.d.c
            if (r8 == r9) goto L_0x0061
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = a
            kotlinx.coroutines.sync.MutexImpl$b r9 = new kotlinx.coroutines.sync.MutexImpl$b
            java.lang.Object r7 = r7.a
            r9.<init>(r7)
            r8.compareAndSet(r10, r6, r9)
            goto L_0x0045
        L_0x0061:
            n0.a.k2.a r7 = n0.a.k2.d.d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = a
            boolean r6 = r8.compareAndSet(r10, r6, r7)
            if (r6 == 0) goto L_0x0045
            m0.i r0 = m0.i.a
            kotlinx.coroutines.sync.MutexImpl$lockSuspend$2$1$1 r1 = new kotlinx.coroutines.sync.MutexImpl$lockSuspend$2$1$1
            r1.<init>(r10, r5)
            int r2 = r11.q
            r11.B(r0, r2, r1)
            goto L_0x00ab
        L_0x0078:
            boolean r7 = r6 instanceof kotlinx.coroutines.sync.MutexImpl.b
            if (r7 == 0) goto L_0x00d1
            r7 = r6
            kotlinx.coroutines.sync.MutexImpl$b r7 = (kotlinx.coroutines.sync.MutexImpl.b) r7
            java.lang.Object r7 = r7.x
            if (r7 == 0) goto L_0x0085
            r7 = r4
            goto L_0x0086
        L_0x0085:
            r7 = r3
        L_0x0086:
            if (r7 == 0) goto L_0x00c3
            r7 = r6
            n0.a.h2.k r7 = (n0.a.h2.k) r7
            n0.a.k2.c r8 = new n0.a.k2.c
            r8.<init>(r0, r10, r6)
        L_0x0090:
            n0.a.h2.k r6 = r7.y()
            int r6 = r6.G(r0, r7, r8)
            if (r6 == r4) goto L_0x00a0
            r9 = 2
            if (r6 == r9) goto L_0x009e
            goto L_0x0090
        L_0x009e:
            r6 = r3
            goto L_0x00a1
        L_0x00a0:
            r6 = r4
        L_0x00a1:
            if (r6 == 0) goto L_0x0045
            n0.a.q1 r1 = new n0.a.q1
            r1.<init>(r0)
            r11.p(r1)
        L_0x00ab:
            java.lang.Object r11 = r11.o()
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r11 != r0) goto L_0x00b8
            java.lang.String r1 = "frame"
            m0.n.b.i.e(r12, r1)
        L_0x00b8:
            if (r11 != r0) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            m0.i r11 = m0.i.a
        L_0x00bd:
            if (r11 != r0) goto L_0x00c0
            return r11
        L_0x00c0:
            m0.i r11 = m0.i.a
            return r11
        L_0x00c3:
            java.lang.String r11 = m0.n.b.i.k(r1, r5)
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L_0x00d1:
            boolean r7 = r6 instanceof n0.a.h2.p
            if (r7 == 0) goto L_0x00dc
            n0.a.h2.p r6 = (n0.a.h2.p) r6
            r6.c(r10)
            goto L_0x0045
        L_0x00dc:
            java.lang.String r11 = m0.n.b.i.k(r2, r6)
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L_0x00ea:
            java.lang.String r11 = m0.n.b.i.k(r1, r5)
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L_0x00f8:
            boolean r0 = r11 instanceof n0.a.h2.p
            if (r0 == 0) goto L_0x0103
            n0.a.h2.p r11 = (n0.a.h2.p) r11
            r11.c(r10)
            goto L_0x0000
        L_0x0103:
            java.lang.String r11 = m0.n.b.i.k(r2, r11)
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.MutexImpl.a(java.lang.Object, m0.l.c):java.lang.Object");
    }

    public void b(Object obj) {
        k kVar;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof n0.a.k2.a) {
                if (obj == null) {
                    if (((n0.a.k2.a) obj2).a == n0.a.k2.d.c) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    n0.a.k2.a aVar = (n0.a.k2.a) obj2;
                    if (aVar.a != obj) {
                        z = false;
                    }
                    if (!z) {
                        StringBuilder P0 = i0.d.a.a.a.P0("Mutex is locked by ");
                        P0.append(aVar.a);
                        P0.append(" but expected ");
                        P0.append(obj);
                        throw new IllegalStateException(P0.toString().toString());
                    }
                }
                if (a.compareAndSet(this, obj2, n0.a.k2.d.e)) {
                    return;
                }
            } else if (obj2 instanceof p) {
                ((p) obj2).c(this);
            } else if (obj2 instanceof b) {
                if (obj != null) {
                    b bVar = (b) obj2;
                    if (bVar.x != obj) {
                        z = false;
                    }
                    if (!z) {
                        StringBuilder P02 = i0.d.a.a.a.P0("Mutex is locked by ");
                        P02.append(bVar.x);
                        P02.append(" but expected ");
                        P02.append(obj);
                        throw new IllegalStateException(P02.toString().toString());
                    }
                }
                b bVar2 = (b) obj2;
                while (true) {
                    kVar = (k) bVar2.v();
                    if (kVar == bVar2) {
                        kVar = null;
                        break;
                    } else if (kVar.E()) {
                        break;
                    } else {
                        kVar.B();
                    }
                }
                if (kVar == null) {
                    c cVar = new c(bVar2);
                    if (a.compareAndSet(this, obj2, cVar) && cVar.c(this) == null) {
                        return;
                    }
                } else {
                    a aVar2 = (a) kVar;
                    Object J = aVar2.J();
                    if (J != null) {
                        Object obj3 = aVar2.x;
                        if (obj3 == null) {
                            obj3 = n0.a.k2.d.b;
                        }
                        bVar2.x = obj3;
                        aVar2.H(J);
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(m0.n.b.i.k("Illegal state ", obj2).toString());
            }
        }
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof n0.a.k2.a) {
                StringBuilder P0 = i0.d.a.a.a.P0("Mutex[");
                P0.append(((n0.a.k2.a) obj).a);
                P0.append(']');
                return P0.toString();
            } else if (obj instanceof p) {
                ((p) obj).c(this);
            } else if (obj instanceof b) {
                StringBuilder P02 = i0.d.a.a.a.P0("Mutex[");
                P02.append(((b) obj).x);
                P02.append(']');
                return P02.toString();
            } else {
                throw new IllegalStateException(m0.n.b.i.k("Illegal state ", obj).toString());
            }
        }
    }
}
