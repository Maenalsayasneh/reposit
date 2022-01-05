package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.data.models.remote.response.InviteToNewChannelResponse;
import com.clubhouse.android.data.repos.ChannelRepo;
import com.clubhouse.android.user.model.User;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.channels.mvi.ChannelViewModel$inviteToNewChannel$1", f = "ChannelViewModel.kt", l = {488}, m = "invokeSuspend")
/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$inviteToNewChannel$1 extends SuspendLambda implements l<m0.l.c<? super InviteToNewChannelResponse>, Object> {
    public int c;
    public final /* synthetic */ ChannelViewModel d;
    public final /* synthetic */ User q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$inviteToNewChannel$1(ChannelViewModel channelViewModel, User user, m0.l.c<? super ChannelViewModel$inviteToNewChannel$1> cVar) {
        super(1, cVar);
        this.d = channelViewModel;
        this.q = user;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ChannelViewModel$inviteToNewChannel$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new ChannelViewModel$inviteToNewChannel$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ChannelRepo channelRepo = this.d.s;
            int intValue = this.q.getId().intValue();
            this.c = 1;
            obj = channelRepo.r(intValue, this);
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
