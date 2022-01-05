package com.clubhouse.android.channels.mvi;

import i0.j.f.p.h;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

@c(c = "com.clubhouse.android.channels.mvi.ChannelViewModel$startFollowPromptUpdates$1", f = "ChannelViewModel.kt", l = {252}, m = "invokeSuspend")
/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$startFollowPromptUpdates$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ ChannelViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$startFollowPromptUpdates$1(ChannelViewModel channelViewModel, m0.l.c<? super ChannelViewModel$startFollowPromptUpdates$1> cVar) {
        super(2, cVar);
        this.d = channelViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ChannelViewModel$startFollowPromptUpdates$1(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ChannelViewModel$startFollowPromptUpdates$1(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ChannelViewModel channelViewModel = this.d;
            AnonymousClass1 r1 = AnonymousClass1.c;
            int i2 = ChannelViewModel.m;
            channelViewModel.m(r1);
            long millis = TimeUnit.MINUTES.toMillis(2);
            this.c = 1;
            if (a.d1(millis, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ChannelViewModel channelViewModel2 = this.d;
        int i3 = ChannelViewModel.m;
        channelViewModel2.q();
        return i.a;
    }
}
