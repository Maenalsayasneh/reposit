package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.channels.mvi.ChannelViewModel$acceptClubInvite$1", f = "ChannelViewModel.kt", l = {448}, m = "invokeSuspend")
/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$acceptClubInvite$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ ChannelViewModel d;
    public final /* synthetic */ Club q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$acceptClubInvite$1(ChannelViewModel channelViewModel, Club club, m0.l.c<? super ChannelViewModel$acceptClubInvite$1> cVar) {
        super(1, cVar);
        this.d = channelViewModel;
        this.q = club;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ChannelViewModel$acceptClubInvite$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new ChannelViewModel$acceptClubInvite$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ClubRepo clubRepo = this.d.u;
            int id = this.q.getId();
            this.c = 1;
            obj = clubRepo.a(id, this);
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
