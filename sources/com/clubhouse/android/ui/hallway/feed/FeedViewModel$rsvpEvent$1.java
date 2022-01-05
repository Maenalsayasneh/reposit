package com.clubhouse.android.ui.hallway.feed;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.EventRepo;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.hallway.feed.FeedViewModel$rsvpEvent$1", f = "FeedViewModel.kt", l = {212}, m = "invokeSuspend")
/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$rsvpEvent$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ FeedViewModel d;
    public final /* synthetic */ EventInClub q;
    public final /* synthetic */ boolean x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$rsvpEvent$1(FeedViewModel feedViewModel, EventInClub eventInClub, boolean z, m0.l.c<? super FeedViewModel$rsvpEvent$1> cVar) {
        super(1, cVar);
        this.d = feedViewModel;
        this.q = eventInClub;
        this.x = z;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new FeedViewModel$rsvpEvent$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new FeedViewModel$rsvpEvent$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            this.c = 1;
            obj = EventRepo.g(this.d.v, this.q.Y1, !this.x, (Map) null, this, 4);
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
