package com.clubhouse.android.ui.hallway.feed;

import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.JoinClubResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.e.a.b.a;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.hallway.feed.FeedViewModel$joinClub$1", f = "FeedViewModel.kt", l = {262}, m = "invokeSuspend")
/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$joinClub$1 extends SuspendLambda implements l<m0.l.c<? super JoinClubResponse>, Object> {
    public int c;
    public final /* synthetic */ FeedViewModel d;
    public final /* synthetic */ Club q;
    public final /* synthetic */ String x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$joinClub$1(FeedViewModel feedViewModel, Club club, String str, m0.l.c<? super FeedViewModel$joinClub$1> cVar) {
        super(1, cVar);
        this.d = feedViewModel;
        this.q = club;
        this.x = str;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new FeedViewModel$joinClub$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new FeedViewModel$joinClub$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            a aVar = this.d.o;
            SourceLocation sourceLocation = SourceLocation.HALLWAY;
            aVar.a(sourceLocation, this.q.c());
            ClubRepo clubRepo = this.d.u;
            int id = this.q.getId();
            String str = this.x;
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
