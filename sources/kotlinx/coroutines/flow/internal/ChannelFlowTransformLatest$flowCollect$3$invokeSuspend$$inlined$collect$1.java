package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.Ref$ObjectRef;
import n0.a.f0;
import n0.a.g2.e;

/* compiled from: Collect.kt */
public final class ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1 implements e<T> {
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ f0 d;
    public final /* synthetic */ ChannelFlowTransformLatest q;
    public final /* synthetic */ e x;

    public ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1(Ref$ObjectRef ref$ObjectRef, f0 f0Var, ChannelFlowTransformLatest channelFlowTransformLatest, e eVar) {
        this.c = ref$ObjectRef;
        this.d = f0Var;
        this.q = channelFlowTransformLatest;
        this.x = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(T r8, m0.l.c<? super m0.i> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r8 = r0.Y1
            n0.a.f1 r8 = (n0.a.f1) r8
            java.lang.Object r8 = r0.y
            java.lang.Object r0 = r0.x
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1) r0
            i0.j.f.p.h.d4(r9)
            goto L_0x005d
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            i0.j.f.p.h.d4(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = r7.c
            T r9 = r9.c
            n0.a.f1 r9 = (n0.a.f1) r9
            if (r9 != 0) goto L_0x0045
            goto L_0x005c
        L_0x0045:
            kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
            r2.<init>()
            r9.b(r2)
            r0.x = r7
            r0.y = r8
            r0.Y1 = r9
            r0.d = r3
            java.lang.Object r9 = r9.l(r0)
            if (r9 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r0 = r7
        L_0x005d:
            kotlin.jvm.internal.Ref$ObjectRef r9 = r0.c
            n0.a.f0 r1 = r0.d
            r2 = 0
            kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest r5 = r0.q
            n0.a.g2.e r0 = r0.x
            r6 = 0
            r4.<init>(r5, r0, r8, r6)
            r5 = 1
            n0.a.f1 r8 = m0.r.t.a.r.m.a1.a.E2(r1, r2, r3, r4, r5, r6)
            r9.c = r8
            m0.i r8 = m0.i.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1.emit(java.lang.Object, m0.l.c):java.lang.Object");
    }
}
