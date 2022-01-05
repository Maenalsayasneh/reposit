package n0.a.h2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.n.b.f;

/* compiled from: LockFreeTaskQueue.kt */
public final class n<E> {
    public static final a a = new a((f) null);
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final t d = new t("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;
    public final int e;
    public final boolean f;
    public final int g;
    public /* synthetic */ AtomicReferenceArray h;

    /* compiled from: LockFreeTaskQueue.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    public static final class b {
        public final int a;

        public b(int i) {
            this.a = i;
        }
    }

    static {
        Class<n> cls = n.class;
        b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        c = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public n(int i, boolean z) {
        this.e = i;
        this.f = z;
        int i2 = i - 1;
        this.g = i2;
        this.h = new AtomicReferenceArray(i);
        boolean z2 = false;
        if (i2 <= 1073741823) {
            if (!((i & i2) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int a(E e2) {
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (j & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.g;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (this.f || this.h.get(i2 & i3) == null) {
                if (c.compareAndSet(this, j, (-1152921503533105153L & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    this.h.set(i2 & i3, e2);
                    n nVar = this;
                    while ((nVar._state & 1152921504606846976L) != 0) {
                        nVar = nVar.e();
                        Object obj = nVar.h.get(nVar.g & i2);
                        if (!(obj instanceof b) || ((b) obj).a != i2) {
                            nVar = null;
                            continue;
                        } else {
                            nVar.h.set(nVar.g & i2, e2);
                            continue;
                        }
                        if (nVar == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else {
                int i4 = this.e;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    public final boolean b() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!c.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j = this._state;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    public final boolean d() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n0.a.h2.n<E> e() {
        /*
            r10 = this;
        L_0x0000:
            long r2 = r10._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            long r6 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = c
            r1 = r10
            r4 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r6
        L_0x001a:
            java.lang.Object r0 = r10._next
            n0.a.h2.n r0 = (n0.a.h2.n) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = b
            r1 = 0
            n0.a.h2.n r4 = new n0.a.h2.n
            int r5 = r10.e
            int r5 = r5 * 2
            boolean r6 = r10.f
            r4.<init>(r5, r6)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r2
            r7 = 0
            long r5 = r5 >> r7
            int r5 = (int) r5
            r6 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r6 = r6 & r2
            r8 = 30
            long r6 = r6 >> r8
            int r6 = (int) r6
        L_0x0040:
            int r7 = r10.g
            r8 = r5 & r7
            r7 = r7 & r6
            if (r8 == r7) goto L_0x005f
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r10.h
            java.lang.Object r7 = r7.get(r8)
            if (r7 != 0) goto L_0x0054
            n0.a.h2.n$b r7 = new n0.a.h2.n$b
            r7.<init>(r5)
        L_0x0054:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r4.h
            int r9 = r4.g
            r9 = r9 & r5
            r8.set(r9, r7)
            int r5 = r5 + 1
            goto L_0x0040
        L_0x005f:
            r5 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r5 = r5 & r2
            r4._state = r5
            r0.compareAndSet(r10, r1, r4)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.h2.n.e():n0.a.h2.n");
    }

    public final Object f() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return d;
            }
            int i = (int) ((j & 1073741823) >> 0);
            int i2 = this.g;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.h.get(i4);
            if (obj == null) {
                if (this.f) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                long j2 = ((long) ((i + 1) & 1073741823)) << 0;
                Object obj2 = obj;
                if (c.compareAndSet(this, j, (j & -1073741824) | j2)) {
                    this.h.set(this.g & i, (Object) null);
                    return obj2;
                } else if (this.f) {
                    n nVar = this;
                    while (true) {
                        long j3 = nVar._state;
                        int i5 = (int) ((j3 & 1073741823) >> 0);
                        if ((j3 & 1152921504606846976L) != 0) {
                            nVar = nVar.e();
                        } else {
                            if (c.compareAndSet(nVar, j3, (j3 & -1073741824) | j2)) {
                                nVar.h.set(nVar.g & i5, (Object) null);
                                nVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (nVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
