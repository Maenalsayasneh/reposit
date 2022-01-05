package com.clubhouse.android.ui.channels.users.ping;

import com.clubhouse.android.data.models.remote.response.InviteToExistingChannelResponse;
import com.clubhouse.android.data.repos.ChannelRepo;
import com.clubhouse.android.user.model.User;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.channels.users.ping.PingUserViewModel$pingUser$1", f = "PingUserViewModel.kt", l = {82}, m = "invokeSuspend")
/* compiled from: PingUserViewModel.kt */
public final class PingUserViewModel$pingUser$1 extends SuspendLambda implements l<m0.l.c<? super InviteToExistingChannelResponse>, Object> {
    public int c;
    public final /* synthetic */ PingUserViewModel d;
    public final /* synthetic */ String q;
    public final /* synthetic */ User x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PingUserViewModel$pingUser$1(PingUserViewModel pingUserViewModel, String str, User user, m0.l.c<? super PingUserViewModel$pingUser$1> cVar) {
        super(1, cVar);
        this.d = pingUserViewModel;
        this.q = str;
        this.x = user;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new PingUserViewModel$pingUser$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new PingUserViewModel$pingUser$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ChannelRepo channelRepo = this.d.p;
            String str = this.q;
            int intValue = this.x.getId().intValue();
            this.c = 1;
            obj = channelRepo.q(str, intValue, this);
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
