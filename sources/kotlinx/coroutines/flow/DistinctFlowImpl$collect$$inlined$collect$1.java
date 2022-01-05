package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;
import n0.a.g2.e;

/* compiled from: Collect.kt */
public final class DistinctFlowImpl$collect$$inlined$collect$1 implements e<T> {
    public final /* synthetic */ DistinctFlowImpl c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ e q;

    public DistinctFlowImpl$collect$$inlined$collect$1(DistinctFlowImpl distinctFlowImpl, Ref$ObjectRef ref$ObjectRef, e eVar) {
        this.c = distinctFlowImpl;
        this.d = ref$ObjectRef;
        this.q = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(T r6, m0.l.c<? super m0.i> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.DistinctFlowImpl$collect$$inlined$collect$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.DistinctFlowImpl$collect$$inlined$collect$1$1 r0 = (kotlinx.coroutines.flow.DistinctFlowImpl$collect$$inlined$collect$1.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.DistinctFlowImpl$collect$$inlined$collect$1$1 r0 = new kotlinx.coroutines.flow.DistinctFlowImpl$collect$$inlined$collect$1$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r7)
            goto L_0x0061
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            i0.j.f.p.h.d4(r7)
            kotlinx.coroutines.flow.DistinctFlowImpl r7 = r5.c
            m0.n.a.l<T, java.lang.Object> r7 = r7.d
            java.lang.Object r7 = r7.invoke(r6)
            kotlin.jvm.internal.Ref$ObjectRef r2 = r5.d
            T r2 = r2.c
            n0.a.h2.t r4 = n0.a.g2.d0.n.a
            if (r2 == r4) goto L_0x0052
            kotlinx.coroutines.flow.DistinctFlowImpl r4 = r5.c
            m0.n.a.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.q
            java.lang.Object r2 = r4.invoke(r2, r7)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0061
        L_0x0052:
            kotlin.jvm.internal.Ref$ObjectRef r2 = r5.d
            r2.c = r7
            n0.a.g2.e r7 = r5.q
            r0.d = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L_0x0061
            return r1
        L_0x0061:
            m0.i r6 = m0.i.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.DistinctFlowImpl$collect$$inlined$collect$1.emit(java.lang.Object, m0.l.c):java.lang.Object");
    }
}
