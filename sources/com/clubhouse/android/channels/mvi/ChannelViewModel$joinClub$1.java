package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.JoinClubResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.channels.mvi.ChannelViewModel$joinClub$1", f = "ChannelViewModel.kt", l = {468}, m = "invokeSuspend")
/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$joinClub$1 extends SuspendLambda implements l<m0.l.c<? super JoinClubResponse>, Object> {
    public int c;
    public final /* synthetic */ ChannelViewModel d;
    public final /* synthetic */ Club q;
    public final /* synthetic */ String x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$joinClub$1(ChannelViewModel channelViewModel, Club club, String str, m0.l.c<? super ChannelViewModel$joinClub$1> cVar) {
        super(1, cVar);
        this.d = channelViewModel;
        this.q = club;
        this.x = str;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ChannelViewModel$joinClub$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new ChannelViewModel$joinClub$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ClubRepo clubRepo = this.d.u;
            int id = this.q.getId();
            String str = this.x;
            SourceLocation sourceLocation = SourceLocation.CHANNEL;
            this.c = 1;
            obj = ClubRepo.o(clubRepo, id, str, sourceLocation, (Map) null, this, 8);
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
