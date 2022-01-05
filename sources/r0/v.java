package r0;

import java.util.concurrent.atomic.AtomicReference;
import m0.n.b.i;

/* compiled from: SegmentPool.kt */
public final class v {
    public static final u a = new u(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference<u>[] c;
    public static final v d = new v();

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference<u>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        c = atomicReferenceArr;
    }

    public static final void a(u uVar) {
        i.e(uVar, "segment");
        if (!(uVar.f == null && uVar.g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!uVar.d) {
            Thread currentThread = Thread.currentThread();
            i.d(currentThread, "Thread.currentThread()");
            AtomicReference<u> atomicReference = c[(int) (currentThread.getId() & (((long) b) - 1))];
            u uVar2 = atomicReference.get();
            if (uVar2 != a) {
                int i = uVar2 != null ? uVar2.c : 0;
                if (i < 65536) {
                    uVar.f = uVar2;
                    uVar.b = 0;
                    uVar.c = i + 8192;
                    if (!atomicReference.compareAndSet(uVar2, uVar)) {
                        uVar.f = null;
                    }
                }
            }
        }
    }

    public static final u b() {
        Thread currentThread = Thread.currentThread();
        i.d(currentThread, "Thread.currentThread()");
        AtomicReference<u> atomicReference = c[(int) (currentThread.getId() & (((long) b) - 1))];
        u uVar = a;
        u andSet = atomicReference.getAndSet(uVar);
        if (andSet == uVar) {
            return new u();
        }
        if (andSet == null) {
            atomicReference.set((Object) null);
            return new u();
        }
        atomicReference.set(andSet.f);
        andSet.f = null;
        andSet.c = 0;
        return andSet;
    }
}
