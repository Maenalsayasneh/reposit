package com.clubhouse.android.channels.mvi;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.channels.mvi.ChannelViewModel$presentWaveUpsellAfterDelay$1", f = "ChannelViewModel.kt", l = {230, 232}, m = "invokeSuspend")
/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$presentWaveUpsellAfterDelay$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ ChannelViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$presentWaveUpsellAfterDelay$1(ChannelViewModel channelViewModel, m0.l.c<? super ChannelViewModel$presentWaveUpsellAfterDelay$1> cVar) {
        super(2, cVar);
        this.d = channelViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ChannelViewModel$presentWaveUpsellAfterDelay$1(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ChannelViewModel$presentWaveUpsellAfterDelay$1(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001c
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            i0.j.f.p.h.d4(r7)
            goto L_0x0047
        L_0x0010:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0018:
            i0.j.f.p.h.d4(r7)
            goto L_0x0030
        L_0x001c:
            i0.j.f.p.h.d4(r7)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r4 = 5
            long r4 = r7.toMillis(r4)
            r6.c = r3
            java.lang.Object r7 = m0.r.t.a.r.m.a1.a.d1(r4, r6)
            if (r7 != r0) goto L_0x0030
            return r0
        L_0x0030:
            com.clubhouse.android.channels.mvi.ChannelViewModel r7 = r6.d
            m0.c r7 = r7.x
            java.lang.Object r7 = r7.getValue()
            i0.e.e.k.b.a r7 = (i0.e.e.k.b.a) r7
            n0.a.g2.d r7 = r7.f()
            r6.c = r2
            java.lang.Object r7 = m0.r.t.a.r.m.a1.a.v1(r7, r6)
            if (r7 != r0) goto L_0x0047
            return r0
        L_0x0047:
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L_0x004d
            r7 = 0
            goto L_0x0051
        L_0x004d:
            int r7 = r7.intValue()
        L_0x0051:
            com.clubhouse.android.channels.mvi.ChannelViewModel r0 = r6.d
            com.clubhouse.android.channels.mvi.ChannelViewModel$presentWaveUpsellAfterDelay$1$1 r1 = new com.clubhouse.android.channels.mvi.ChannelViewModel$presentWaveUpsellAfterDelay$1$1
            r1.<init>(r7, r0)
            int r7 = com.clubhouse.android.channels.mvi.ChannelViewModel.m
            r0.n(r1)
            m0.i r7 = m0.i.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.channels.mvi.ChannelViewModel$presentWaveUpsellAfterDelay$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
