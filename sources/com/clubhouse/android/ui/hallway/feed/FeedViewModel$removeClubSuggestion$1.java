package com.clubhouse.android.ui.hallway.feed;

import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.ChannelRepo;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.j.g;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.hallway.feed.FeedViewModel$removeClubSuggestion$1", f = "FeedViewModel.kt", l = {329}, m = "invokeSuspend")
/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$removeClubSuggestion$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ FeedViewModel d;
    public final /* synthetic */ Club q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$removeClubSuggestion$1(FeedViewModel feedViewModel, Club club, m0.l.c<? super FeedViewModel$removeClubSuggestion$1> cVar) {
        super(1, cVar);
        this.d = feedViewModel;
        this.q = club;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new FeedViewModel$removeClubSuggestion$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new FeedViewModel$removeClubSuggestion$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ChannelRepo channelRepo = this.d.s;
            Integer num = new Integer(this.q.getId());
            Map<String, Object> c2 = this.q.c();
            if (c2 == null) {
                c2 = g.o();
            }
            this.c = 1;
            obj = channelRepo.o(num, (Integer) null, c2, this);
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
