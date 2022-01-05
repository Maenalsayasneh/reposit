package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;
import m0.n.a.p;
import n0.a.g2.e;

/* compiled from: Limit.kt */
public final class FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 implements e<T> {
    public final /* synthetic */ p c;
    public final /* synthetic */ Ref$ObjectRef d;

    public FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(p pVar, Ref$ObjectRef ref$ObjectRef) {
        this.c = pVar;
        this.d = ref$ObjectRef;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(T r5, m0.l.c<? super m0.i> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.AnonymousClass1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.y
            java.lang.Object r0 = r0.c
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) r0
            i0.j.f.p.h.d4(r6)
            goto L_0x0048
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            i0.j.f.p.h.d4(r6)
            m0.n.a.p r6 = r4.c
            r0.c = r4
            r0.y = r5
            r0.q = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r0 = r4
        L_0x0048:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0055
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.d
            r6.c = r5
            r3 = 0
        L_0x0055:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0062
            m0.i r5 = m0.i.a
            return r5
        L_0x0062:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.emit(java.lang.Object, m0.l.c):java.lang.Object");
    }
}
