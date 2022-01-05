package n0.a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m0.l.c;
import m0.l.e;
import n0.a.h2.r;

/* compiled from: Builders.common.kt */
public final class k0<T> extends r<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater x = AtomicIntegerFieldUpdater.newUpdater(k0.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public k0(e eVar, c<? super T> cVar) {
        super(eVar, cVar);
    }

    public void D(Object obj) {
        t0(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t0(java.lang.Object r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L_0x0016
            if (r0 != r2) goto L_0x000a
            goto L_0x001f
        L_0x000a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0016:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = x
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L_0x0000
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            return
        L_0x0022:
            m0.l.c<T> r0 = r4.q
            m0.l.c r0 = i0.j.f.p.h.b2(r0)
            m0.l.c<T> r1 = r4.q
            java.lang.Object r5 = m0.r.t.a.r.m.a1.a.d3(r5, r1)
            r1 = 0
            n0.a.h2.h.b(r0, r5, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.k0.t0(java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object w0() {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3._decision
            r1 = 0
            if (r0 == 0) goto L_0x0015
            r2 = 2
            if (r0 != r2) goto L_0x0009
            goto L_0x001f
        L_0x0009:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0015:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = x
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            return r0
        L_0x0024:
            java.lang.Object r0 = r3.a0()
            java.lang.Object r0 = n0.a.j1.a(r0)
            boolean r1 = r0 instanceof n0.a.z
            if (r1 != 0) goto L_0x0031
            return r0
        L_0x0031:
            n0.a.z r0 = (n0.a.z) r0
            java.lang.Throwable r0 = r0.b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.k0.w0():java.lang.Object");
    }
}
