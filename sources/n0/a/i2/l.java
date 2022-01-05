package n0.a.i2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: WorkQueue.kt */
public final class l {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a;
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    public final AtomicReferenceArray<h> e = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<l> cls = l.class;
        a = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        b = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        c = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        d = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public final h a(h hVar, boolean z) {
        if (z) {
            return b(hVar);
        }
        h hVar2 = (h) a.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final h b(h hVar) {
        boolean z = true;
        if (hVar.d.z() != 1) {
            z = false;
        }
        if (z) {
            d.incrementAndGet(this);
        }
        if (c() == 127) {
            return hVar;
        }
        int i = this.producerIndex & 127;
        while (this.e.get(i) != null) {
            Thread.yield();
        }
        this.e.lazySet(i, hVar);
        b.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int d() {
        return this.lastScheduledTask != null ? c() + 1 : c();
    }

    public final h e() {
        h hVar = (h) a.getAndSet(this, (Object) null);
        return hVar == null ? f() : hVar;
    }

    public final h f() {
        h andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (c.compareAndSet(this, i, i + 1) && (andSet = this.e.getAndSet(i2, (Object) null)) != null) {
                boolean z = true;
                if (andSet.d.z() != 1) {
                    z = false;
                }
                if (z) {
                    d.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final long g(l lVar) {
        int i = lVar.consumerIndex;
        int i2 = lVar.producerIndex;
        AtomicReferenceArray<h> atomicReferenceArray = lVar.e;
        while (true) {
            boolean z = true;
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (lVar.blockingTasksInBuffer == 0) {
                break;
            }
            h hVar = atomicReferenceArray.get(i3);
            if (hVar != null) {
                if (hVar.d.z() != 1) {
                    z = false;
                }
                if (z && atomicReferenceArray.compareAndSet(i3, hVar, (Object) null)) {
                    d.decrementAndGet(lVar);
                    a(hVar, false);
                    return -1;
                }
            }
            i++;
        }
        return h(lVar, true);
    }

    public final long h(l lVar, boolean z) {
        h hVar;
        do {
            hVar = (h) lVar.lastScheduledTask;
            if (hVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (hVar.d.z() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a2 = k.e.a() - hVar.c;
            long j = k.a;
            if (a2 < j) {
                return j - a2;
            }
        } while (!a.compareAndSet(lVar, hVar, (Object) null));
        a(hVar, false);
        return -1;
    }
}
