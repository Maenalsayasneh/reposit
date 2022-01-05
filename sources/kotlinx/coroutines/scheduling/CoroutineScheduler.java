package kotlinx.coroutines.scheduling;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlin.random.Random;
import m0.n.b.i;
import n0.a.h2.t;
import n0.a.i2.c;
import n0.a.i2.f;
import n0.a.i2.h;
import n0.a.i2.j;
import n0.a.i2.k;
import n0.a.i2.l;

/* compiled from: CoroutineScheduler.kt */
public final class CoroutineScheduler implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");
    public static final /* synthetic */ AtomicIntegerFieldUpdater q = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");
    public static final t x = new t("NOT_IN_STACK");
    public final int Y1;
    public final long Z1;
    private volatile /* synthetic */ int _isTerminated;
    public final String a2;
    public final c b2;
    public final c c2;
    public volatile /* synthetic */ long controlState;
    public final AtomicReferenceArray<a> d2;
    private volatile /* synthetic */ long parkedWorkersStack;
    public final int y;

    /* compiled from: CoroutineScheduler.kt */
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    /* compiled from: CoroutineScheduler.kt */
    public final class a extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");
        public int Y1 = Random.d.b();
        public boolean Z1;
        public final l d = new l();
        private volatile int indexInArray;
        private volatile Object nextParkedWorker = CoroutineScheduler.x;
        public WorkerState q = WorkerState.DORMANT;
        public volatile /* synthetic */ int workerCtl = 0;
        public long x;
        public long y;

        public a(int i) {
            CoroutineScheduler.this = CoroutineScheduler.this;
            setDaemon(true);
            f(i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final n0.a.i2.h a(boolean r11) {
            /*
                r10 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r10.q
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r2 = 0
                r3 = 1
                if (r0 != r1) goto L_0x0009
                goto L_0x0032
            L_0x0009:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
            L_0x000b:
                long r6 = r0.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r1 = 42
                long r4 = r4 >> r1
                int r1 = (int) r4
                if (r1 != 0) goto L_0x001b
                r0 = r2
                goto L_0x002c
            L_0x001b:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.d
                r5 = r0
                boolean r1 = r4.compareAndSet(r5, r6, r8)
                if (r1 == 0) goto L_0x000b
                r0 = r3
            L_0x002c:
                if (r0 == 0) goto L_0x0034
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r10.q = r0
            L_0x0032:
                r0 = r3
                goto L_0x0035
            L_0x0034:
                r0 = r2
            L_0x0035:
                if (r0 == 0) goto L_0x006b
                if (r11 == 0) goto L_0x0060
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                int r11 = r11.y
                int r11 = r11 * 2
                int r11 = r10.d(r11)
                if (r11 != 0) goto L_0x0046
                goto L_0x0047
            L_0x0046:
                r3 = r2
            L_0x0047:
                if (r3 == 0) goto L_0x004f
                n0.a.i2.h r11 = r10.e()
                if (r11 != 0) goto L_0x006a
            L_0x004f:
                n0.a.i2.l r11 = r10.d
                n0.a.i2.h r11 = r11.e()
                if (r11 != 0) goto L_0x006a
                if (r3 != 0) goto L_0x0066
                n0.a.i2.h r11 = r10.e()
                if (r11 != 0) goto L_0x006a
                goto L_0x0066
            L_0x0060:
                n0.a.i2.h r11 = r10.e()
                if (r11 != 0) goto L_0x006a
            L_0x0066:
                n0.a.i2.h r11 = r10.i(r2)
            L_0x006a:
                return r11
            L_0x006b:
                if (r11 == 0) goto L_0x0080
                n0.a.i2.l r11 = r10.d
                n0.a.i2.h r11 = r11.e()
                if (r11 != 0) goto L_0x008a
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                n0.a.i2.c r11 = r11.c2
                java.lang.Object r11 = r11.d()
                n0.a.i2.h r11 = (n0.a.i2.h) r11
                goto L_0x008a
            L_0x0080:
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                n0.a.i2.c r11 = r11.c2
                java.lang.Object r11 = r11.d()
                n0.a.i2.h r11 = (n0.a.i2.h) r11
            L_0x008a:
                if (r11 != 0) goto L_0x0090
                n0.a.i2.h r11 = r10.i(r3)
            L_0x0090:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.a.a(boolean):n0.a.i2.h");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i) {
            int i2 = this.Y1;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.Y1 = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Integer.MAX_VALUE) % i;
        }

        public final h e() {
            if (d(2) == 0) {
                h hVar = (h) CoroutineScheduler.this.b2.d();
                return hVar == null ? (h) CoroutineScheduler.this.c2.d() : hVar;
            }
            h hVar2 = (h) CoroutineScheduler.this.c2.d();
            return hVar2 == null ? (h) CoroutineScheduler.this.b2.d() : hVar2;
        }

        public final void f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.a2);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(WorkerState workerState) {
            WorkerState workerState2 = this.q;
            boolean z = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z) {
                CoroutineScheduler.d.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.q = workerState;
            }
            return z;
        }

        public final h i(boolean z) {
            long j;
            int i = (int) (CoroutineScheduler.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int d2 = d(i);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long j2 = RecyclerView.FOREVER_NS;
            for (int i2 = 0; i2 < i; i2++) {
                d2++;
                if (d2 > i) {
                    d2 = 1;
                }
                a aVar = coroutineScheduler.d2.get(d2);
                if (!(aVar == null || aVar == this)) {
                    if (z) {
                        j = this.d.g(aVar.d);
                    } else {
                        l lVar = this.d;
                        l lVar2 = aVar.d;
                        Objects.requireNonNull(lVar);
                        h f = lVar2.f();
                        if (f != null) {
                            lVar.a(f, false);
                            j = -1;
                        } else {
                            j = lVar.h(lVar2, false);
                        }
                    }
                    if (j == -1) {
                        return this.d.e();
                    }
                    if (j > 0) {
                        j2 = Math.min(j2, j);
                    }
                }
            }
            if (j2 == RecyclerView.FOREVER_NS) {
                j2 = 0;
            }
            this.y = j2;
            return null;
        }

        public void run() {
            WorkerState workerState;
            WorkerState workerState2;
            loop0:
            while (true) {
                boolean z = false;
                while (!CoroutineScheduler.this.isTerminated() && this.q != (workerState = WorkerState.TERMINATED)) {
                    h a = a(this.Z1);
                    if (a == null) {
                        this.Z1 = false;
                        if (this.y == 0) {
                            if (this.nextParkedWorker != CoroutineScheduler.x) {
                                this.workerCtl = -1;
                                while (true) {
                                    if (!(this.nextParkedWorker != CoroutineScheduler.x) || this.workerCtl != -1 || CoroutineScheduler.this.isTerminated() || this.q == (workerState2 = WorkerState.TERMINATED)) {
                                        break;
                                    }
                                    h(WorkerState.PARKING);
                                    Thread.interrupted();
                                    if (this.x == 0) {
                                        this.x = System.nanoTime() + CoroutineScheduler.this.Z1;
                                    }
                                    LockSupport.parkNanos(CoroutineScheduler.this.Z1);
                                    if (System.nanoTime() - this.x >= 0) {
                                        this.x = 0;
                                        CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                                        synchronized (coroutineScheduler.d2) {
                                            if (!coroutineScheduler.isTerminated()) {
                                                if (((int) (coroutineScheduler.controlState & 2097151)) > coroutineScheduler.y) {
                                                    if (c.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        f(0);
                                                        coroutineScheduler.n(this, i, 0);
                                                        int andDecrement = (int) (CoroutineScheduler.d.getAndDecrement(coroutineScheduler) & 2097151);
                                                        if (andDecrement != i) {
                                                            a aVar = coroutineScheduler.d2.get(andDecrement);
                                                            i.c(aVar);
                                                            a aVar2 = aVar;
                                                            coroutineScheduler.d2.set(i, aVar2);
                                                            aVar2.f(i);
                                                            coroutineScheduler.n(aVar2, andDecrement, i);
                                                        }
                                                        coroutineScheduler.d2.set(andDecrement, (Object) null);
                                                        this.q = workerState2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                CoroutineScheduler.this.l(this);
                            }
                        } else if (!z) {
                            z = true;
                        } else {
                            h(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.y);
                            this.y = 0;
                        }
                    } else {
                        this.y = 0;
                        int z2 = a.d.z();
                        this.x = 0;
                        if (this.q == WorkerState.PARKING) {
                            this.q = WorkerState.BLOCKING;
                        }
                        if (z2 != 0 && h(WorkerState.BLOCKING)) {
                            CoroutineScheduler.this.v();
                        }
                        CoroutineScheduler.this.q(a);
                        if (z2 != 0) {
                            CoroutineScheduler.d.addAndGet(CoroutineScheduler.this, -2097152);
                            if (this.q != workerState) {
                                this.q = WorkerState.DORMANT;
                            }
                        }
                    }
                }
            }
            h(WorkerState.TERMINATED);
        }
    }

    public CoroutineScheduler(int i, int i2, long j, String str) {
        this.y = i;
        this.Y1 = i2;
        this.Z1 = j;
        this.a2 = str;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.b2 = new c();
                        this.c2 = new c();
                        this.parkedWorkersStack = 0;
                        this.d2 = new AtomicReferenceArray<>(i2 + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(i0.d.a.a.a.l0("Idle worker keep alive time ", j, " must be positive").toString());
                }
                throw new IllegalArgumentException(i0.d.a.a.a.g0("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(i0.d.a.a.a.h0("Max pool size ", i2, " should be greater than or equals to core pool size ", i).toString());
        }
        throw new IllegalArgumentException(i0.d.a.a.a.g0("Core pool size ", i, " should be at least 1").toString());
    }

    public static /* synthetic */ void i(CoroutineScheduler coroutineScheduler, Runnable runnable, n0.a.i2.i iVar, boolean z, int i) {
        f fVar = (i & 2) != 0 ? f.c : null;
        if ((i & 4) != 0) {
            z = false;
        }
        coroutineScheduler.f(runnable, fVar, z);
    }

    public final int a() {
        synchronized (this.d2) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            boolean z = false;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.y) {
                return 0;
            }
            if (i >= this.Y1) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 > 0 && this.d2.get(i3) == null) {
                a aVar = new a(i3);
                this.d2.set(i3, aVar);
                if (i3 == ((int) (2097151 & d.incrementAndGet(this)))) {
                    z = true;
                }
                if (z) {
                    aVar.start();
                    int i4 = i2 + 1;
                    return i4;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final h b(Runnable runnable, n0.a.i2.i iVar) {
        long a3 = k.e.a();
        if (!(runnable instanceof h)) {
            return new j(runnable, a3, iVar);
        }
        h hVar = (h) runnable;
        hVar.c = a3;
        hVar.d = iVar;
        return hVar;
    }

    public void close() {
        int i;
        h hVar;
        boolean z;
        if (q.compareAndSet(this, 0, 1)) {
            a e = e();
            synchronized (this.d2) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    a aVar = this.d2.get(i2);
                    i.c(aVar);
                    a aVar2 = aVar;
                    if (aVar2 != e) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000);
                        }
                        l lVar = aVar2.d;
                        c cVar = this.c2;
                        Objects.requireNonNull(lVar);
                        h hVar2 = (h) l.a.getAndSet(lVar, (Object) null);
                        if (hVar2 != null) {
                            cVar.a(hVar2);
                        }
                        do {
                            h f = lVar.f();
                            if (f == null) {
                                z = false;
                                continue;
                            } else {
                                cVar.a(f);
                                z = true;
                                continue;
                            }
                        } while (z);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.c2.b();
            this.b2.b();
            while (true) {
                if (e == null) {
                    hVar = null;
                } else {
                    hVar = e.a(true);
                }
                if (hVar == null && (hVar = (h) this.b2.d()) == null && (hVar = (h) this.c2.d()) == null) {
                    break;
                }
                q(hVar);
            }
            if (e != null) {
                e.h(WorkerState.TERMINATED);
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    public final a e() {
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar != null && i.a(CoroutineScheduler.this, this)) {
            return aVar;
        }
        return null;
    }

    public void execute(Runnable runnable) {
        i(this, runnable, (n0.a.i2.i) null, false, 6);
    }

    public final void f(Runnable runnable, n0.a.i2.i iVar, boolean z) {
        h hVar;
        boolean z2;
        h b = b(runnable, iVar);
        a e = e();
        boolean z3 = true;
        if (e == null || e.q == WorkerState.TERMINATED || (b.d.z() == 0 && e.q == WorkerState.BLOCKING)) {
            hVar = b;
        } else {
            e.Z1 = true;
            hVar = e.d.a(b, z);
        }
        if (hVar != null) {
            if (hVar.d.z() == 1) {
                z2 = this.c2.a(hVar);
            } else {
                z2 = this.b2.a(hVar);
            }
            if (!z2) {
                throw new RejectedExecutionException(i.k(this.a2, " was terminated"));
            }
        }
        if (!z || e == null) {
            z3 = false;
        }
        if (b.d.z() != 0) {
            long addAndGet = d.addAndGet(this, 2097152);
            if (!z3 && !y() && !w(addAndGet)) {
                y();
            }
        } else if (!z3) {
            v();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final int k(a aVar) {
        Object c3 = aVar.c();
        while (c3 != x) {
            if (c3 == null) {
                return 0;
            }
            a aVar2 = (a) c3;
            int b = aVar2.b();
            if (b != 0) {
                return b;
            }
            c3 = aVar2.c();
        }
        return -1;
    }

    public final boolean l(a aVar) {
        long j;
        int b;
        if (aVar.c() != x) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            b = aVar.b();
            aVar.g(this.d2.get((int) (2097151 & j)));
        } while (!c.compareAndSet(this, j, ((2097152 + j) & -2097152) | ((long) b)));
        return true;
    }

    public final void n(a aVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                i3 = i2 == 0 ? k(aVar) : i2;
            }
            if (i3 >= 0) {
                if (c.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    public final void q(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    public String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        int length = this.d2.length();
        int i5 = 0;
        if (1 < length) {
            i3 = 0;
            int i6 = 0;
            i2 = 0;
            i = 0;
            int i7 = 1;
            while (true) {
                int i8 = i7 + 1;
                a aVar = this.d2.get(i7);
                if (aVar != null) {
                    int d3 = aVar.d.d();
                    int ordinal = aVar.q.ordinal();
                    if (ordinal == 0) {
                        i6++;
                        StringBuilder sb = new StringBuilder();
                        sb.append(d3);
                        sb.append('c');
                        arrayList.add(sb.toString());
                    } else if (ordinal == 1) {
                        i3++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(d3);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    } else if (ordinal == 2) {
                        i5++;
                    } else if (ordinal == 3) {
                        i2++;
                        if (d3 > 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(d3);
                            sb3.append('d');
                            arrayList.add(sb3.toString());
                        }
                    } else if (ordinal == 4) {
                        i++;
                    }
                }
                if (i8 >= length) {
                    break;
                }
                i7 = i8;
            }
            i4 = i5;
            i5 = i6;
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        long j = this.controlState;
        return this.a2 + '@' + m0.r.t.a.r.m.a1.a.M1(this) + "[Pool Size {core = " + this.y + ", max = " + this.Y1 + "}, Worker States {CPU = " + i5 + ", blocking = " + i3 + ", parked = " + i4 + ", dormant = " + i2 + ", terminated = " + i + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.b2.c() + ", global blocking queue size = " + this.c2.c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.y - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    public final void v() {
        if (!y() && !w(this.controlState)) {
            y();
        }
    }

    public final boolean w(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.y) {
            int a3 = a();
            if (a3 == 1 && this.y > 1) {
                a();
            }
            if (a3 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        while (true) {
            long j = this.parkedWorkersStack;
            a aVar = this.d2.get((int) (2097151 & j));
            if (aVar == null) {
                aVar = null;
            } else {
                long j2 = (2097152 + j) & -2097152;
                int k = k(aVar);
                if (k < 0) {
                    continue;
                } else {
                    if (c.compareAndSet(this, j, ((long) k) | j2)) {
                        aVar.g(x);
                    } else {
                        continue;
                    }
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.c.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }
}
