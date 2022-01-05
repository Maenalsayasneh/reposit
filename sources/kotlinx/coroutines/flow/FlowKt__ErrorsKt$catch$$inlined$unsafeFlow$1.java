package kotlinx.coroutines.flow;

import m0.n.a.q;
import n0.a.g2.d;

/* compiled from: SafeCollector.common.kt */
public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 implements d<T> {
    public final /* synthetic */ d c;
    public final /* synthetic */ q d;

    public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(d dVar, q qVar) {
        this.c = dVar;
        this.d = qVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(n0.a.g2.e<? super T> r6, m0.l.c<? super m0.i> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            i0.j.f.p.h.d4(r7)
            goto L_0x0065
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            java.lang.Object r6 = r0.y
            n0.a.g2.e r6 = (n0.a.g2.e) r6
            java.lang.Object r2 = r0.x
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 r2 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) r2
            i0.j.f.p.h.d4(r7)
            goto L_0x0051
        L_0x003e:
            i0.j.f.p.h.d4(r7)
            n0.a.g2.d r7 = r5.c
            r0.x = r5
            r0.y = r6
            r0.d = r4
            java.lang.Object r7 = m0.r.t.a.r.m.a1.a.u0(r7, r6, r0)
            if (r7 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r2 = r5
        L_0x0051:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L_0x0065
            m0.n.a.q r2 = r2.d
            r4 = 0
            r0.x = r4
            r0.y = r4
            r0.d = r3
            java.lang.Object r6 = r2.invoke(r6, r7, r0)
            if (r6 != r1) goto L_0x0065
            return r1
        L_0x0065:
            m0.i r6 = m0.i.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.collect(n0.a.g2.e, m0.l.c):java.lang.Object");
    }
}
