package kotlinx.coroutines.flow;

import n0.a.g2.d;

/* compiled from: SafeCollector.common.kt */
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1 implements d<T> {
    public final /* synthetic */ d c;
    public final /* synthetic */ int d;

    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1(d dVar, int i) {
        this.c = dVar;
        this.d = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(n0.a.g2.e<? super T> r7, m0.l.c<? super m0.i> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r7 = r0.x
            n0.a.g2.e r7 = (n0.a.g2.e) r7
            i0.j.f.p.h.d4(r8)     // Catch:{ AbortFlowException -> 0x004f }
            goto L_0x0054
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            i0.j.f.p.h.d4(r8)
            kotlin.jvm.internal.Ref$IntRef r8 = new kotlin.jvm.internal.Ref$IntRef
            r8.<init>()
            n0.a.g2.d r2 = r6.c     // Catch:{ AbortFlowException -> 0x004f }
            n0.a.g2.j r4 = new n0.a.g2.j     // Catch:{ AbortFlowException -> 0x004f }
            int r5 = r6.d     // Catch:{ AbortFlowException -> 0x004f }
            r4.<init>(r8, r5, r7)     // Catch:{ AbortFlowException -> 0x004f }
            r0.x = r7     // Catch:{ AbortFlowException -> 0x004f }
            r0.d = r3     // Catch:{ AbortFlowException -> 0x004f }
            java.lang.Object r7 = r2.collect(r4, r0)     // Catch:{ AbortFlowException -> 0x004f }
            if (r7 != r1) goto L_0x0054
            return r1
        L_0x004f:
            r8 = move-exception
            n0.a.g2.e<?> r0 = r8.c
            if (r0 != r7) goto L_0x0057
        L_0x0054:
            m0.i r7 = m0.i.a
            return r7
        L_0x0057:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.collect(n0.a.g2.e, m0.l.c):java.lang.Object");
    }
}
