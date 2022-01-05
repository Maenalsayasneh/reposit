package com.clubhouse.android.channels.mvi;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;
import n0.a.g2.d;

@c(c = "com.clubhouse.android.channels.mvi.ChannelViewModel$startStateUpdates$1", f = "ChannelViewModel.kt", l = {596}, m = "invokeSuspend")
/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$startStateUpdates$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ ChannelViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$startStateUpdates$1(ChannelViewModel channelViewModel, m0.l.c<? super ChannelViewModel$startStateUpdates$1> cVar) {
        super(2, cVar);
        this.d = channelViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ChannelViewModel$startStateUpdates$1(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ChannelViewModel$startStateUpdates$1(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            d h = this.d.r.h();
            ChannelViewModel$startStateUpdates$1$invokeSuspend$$inlined$collect$1 channelViewModel$startStateUpdates$1$invokeSuspend$$inlined$collect$1 = new ChannelViewModel$startStateUpdates$1$invokeSuspend$$inlined$collect$1(this.d);
            this.c = 1;
            if (h.collect(channelViewModel$startStateUpdates$1$invokeSuspend$$inlined$collect$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
