package kotlinx.coroutines.flow;

import n0.a.g2.d;

/* compiled from: SafeCollector.common.kt */
public final class FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 implements d<T> {
    public final /* synthetic */ Object[] c;

    public FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(Object[] objArr) {
        this.c = objArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(n0.a.g2.e<? super T> r8, m0.l.c<? super m0.i> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            int r8 = r0.Z1
            int r2 = r0.Y1
            java.lang.Object r4 = r0.y
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.x
            n0.a.g2.e r5 = (n0.a.g2.e) r5
            i0.j.f.p.h.d4(r9)
            r9 = r5
            goto L_0x0047
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003c:
            i0.j.f.p.h.d4(r9)
            java.lang.Object[] r9 = r7.c
            r2 = 0
            int r4 = r9.length
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L_0x0047:
            if (r2 >= r8) goto L_0x005e
            r5 = r4[r2]
            int r2 = r2 + 1
            r0.x = r9
            r0.y = r4
            r0.Y1 = r2
            r0.Z1 = r8
            r0.d = r3
            java.lang.Object r5 = r9.emit(r5, r0)
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x005e:
            m0.i r8 = m0.i.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.collect(n0.a.g2.e, m0.l.c):java.lang.Object");
    }
}
