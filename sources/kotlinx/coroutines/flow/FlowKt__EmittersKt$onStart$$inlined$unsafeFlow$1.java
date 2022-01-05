package kotlinx.coroutines.flow;

import m0.n.a.p;
import n0.a.g2.d;

/* compiled from: SafeCollector.common.kt */
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 implements d<T> {
    public final /* synthetic */ p c;
    public final /* synthetic */ d d;

    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(p pVar, d dVar) {
        this.c = pVar;
        this.d = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(n0.a.g2.e<? super T> r7, m0.l.c<? super m0.i> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            i0.j.f.p.h.d4(r8)
            goto L_0x007a
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            java.lang.Object r7 = r0.Y1
            kotlinx.coroutines.flow.internal.SafeCollector r7 = (kotlinx.coroutines.flow.internal.SafeCollector) r7
            java.lang.Object r2 = r0.y
            n0.a.g2.e r2 = (n0.a.g2.e) r2
            java.lang.Object r4 = r0.x
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 r4 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1) r4
            i0.j.f.p.h.d4(r8)     // Catch:{ all -> 0x0042 }
            goto L_0x0065
        L_0x0042:
            r8 = move-exception
            goto L_0x007f
        L_0x0044:
            i0.j.f.p.h.d4(r8)
            m0.l.e r8 = r0.getContext()
            kotlinx.coroutines.flow.internal.SafeCollector r2 = new kotlinx.coroutines.flow.internal.SafeCollector
            r2.<init>(r7, r8)
            m0.n.a.p r8 = r6.c     // Catch:{ all -> 0x007d }
            r0.x = r6     // Catch:{ all -> 0x007d }
            r0.y = r7     // Catch:{ all -> 0x007d }
            r0.Y1 = r2     // Catch:{ all -> 0x007d }
            r0.d = r4     // Catch:{ all -> 0x007d }
            java.lang.Object r8 = r8.invoke(r2, r0)     // Catch:{ all -> 0x007d }
            if (r8 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r4 = r6
            r5 = r2
            r2 = r7
            r7 = r5
        L_0x0065:
            r7.releaseIntercepted()
            n0.a.g2.d r7 = r4.d
            r8 = 0
            r0.x = r8
            r0.y = r8
            r0.Y1 = r8
            r0.d = r3
            java.lang.Object r7 = r7.collect(r2, r0)
            if (r7 != r1) goto L_0x007a
            return r1
        L_0x007a:
            m0.i r7 = m0.i.a
            return r7
        L_0x007d:
            r8 = move-exception
            r7 = r2
        L_0x007f:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.collect(n0.a.g2.e, m0.l.c):java.lang.Object");
    }
}
