package kotlinx.coroutines.flow;

import m0.n.a.q;
import n0.a.g2.d;

/* compiled from: SafeCollector.common.kt */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 implements d<T> {
    public final /* synthetic */ d c;
    public final /* synthetic */ q d;

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(d dVar, q qVar) {
        this.c = dVar;
        this.d = qVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(n0.a.g2.e<? super T> r8, m0.l.c<? super m0.i> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0052
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r8 = r0.x
            kotlinx.coroutines.flow.internal.SafeCollector r8 = (kotlinx.coroutines.flow.internal.SafeCollector) r8
            i0.j.f.p.h.d4(r9)     // Catch:{ all -> 0x0032 }
            goto L_0x007e
        L_0x0032:
            r9 = move-exception
            goto L_0x0086
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003c:
            java.lang.Object r8 = r0.x
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            i0.j.f.p.h.d4(r9)
            goto L_0x00a0
        L_0x0044:
            java.lang.Object r8 = r0.y
            n0.a.g2.e r8 = (n0.a.g2.e) r8
            java.lang.Object r2 = r0.x
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r2 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) r2
            i0.j.f.p.h.d4(r9)     // Catch:{ all -> 0x0050 }
            goto L_0x0065
        L_0x0050:
            r8 = move-exception
            goto L_0x008c
        L_0x0052:
            i0.j.f.p.h.d4(r9)
            n0.a.g2.d r9 = r7.c     // Catch:{ all -> 0x008a }
            r0.x = r7     // Catch:{ all -> 0x008a }
            r0.y = r8     // Catch:{ all -> 0x008a }
            r0.d = r5     // Catch:{ all -> 0x008a }
            java.lang.Object r9 = r9.collect(r8, r0)     // Catch:{ all -> 0x008a }
            if (r9 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r2 = r7
        L_0x0065:
            m0.l.e r9 = r0.getContext()
            kotlinx.coroutines.flow.internal.SafeCollector r4 = new kotlinx.coroutines.flow.internal.SafeCollector
            r4.<init>(r8, r9)
            m0.n.a.q r8 = r2.d     // Catch:{ all -> 0x0084 }
            r0.x = r4     // Catch:{ all -> 0x0084 }
            r0.y = r6     // Catch:{ all -> 0x0084 }
            r0.d = r3     // Catch:{ all -> 0x0084 }
            java.lang.Object r8 = r8.invoke(r4, r6, r0)     // Catch:{ all -> 0x0084 }
            if (r8 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r8 = r4
        L_0x007e:
            r8.releaseIntercepted()
            m0.i r8 = m0.i.a
            return r8
        L_0x0084:
            r9 = move-exception
            r8 = r4
        L_0x0086:
            r8.releaseIntercepted()
            throw r9
        L_0x008a:
            r8 = move-exception
            r2 = r7
        L_0x008c:
            n0.a.g2.c0 r9 = new n0.a.g2.c0
            r9.<init>(r8)
            m0.n.a.q r2 = r2.d
            r0.x = r8
            r0.y = r6
            r0.d = r4
            java.lang.Object r9 = m0.r.t.a.r.m.a1.a.G(r9, r2, r8, r0)
            if (r9 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.collect(n0.a.g2.e, m0.l.c):java.lang.Object");
    }
}
