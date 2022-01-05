package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.data.models.remote.response.AudienceReplyResponse;
import com.clubhouse.android.data.repos.ChannelRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.channels.mvi.ChannelViewModel$raiseHand$1$1$1", f = "ChannelViewModel.kt", l = {371}, m = "invokeSuspend")
/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$raiseHand$1$1$1 extends SuspendLambda implements l<m0.l.c<? super AudienceReplyResponse>, Object> {
    public int c;
    public final /* synthetic */ ChannelViewModel d;
    public final /* synthetic */ i0.e.b.z2.g.l q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$raiseHand$1$1$1(ChannelViewModel channelViewModel, i0.e.b.z2.g.l lVar, m0.l.c<? super ChannelViewModel$raiseHand$1$1$1> cVar) {
        super(1, cVar);
        this.d = channelViewModel;
        this.q = lVar;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ChannelViewModel$raiseHand$1$1$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new ChannelViewModel$raiseHand$1$1$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ChannelRepo channelRepo = this.d.s;
            String str = this.q.t;
            this.c = 1;
            obj = channelRepo.y(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
