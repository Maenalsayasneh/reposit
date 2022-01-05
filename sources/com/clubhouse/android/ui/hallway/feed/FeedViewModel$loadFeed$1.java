package com.clubhouse.android.ui.hallway.feed;

import com.clubhouse.android.data.repos.ChannelRepo;
import i0.e.b.b3.a.a.d.a.e;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.hallway.feed.FeedViewModel$loadFeed$1", f = "FeedViewModel.kt", l = {374}, m = "invokeSuspend")
/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$loadFeed$1 extends SuspendLambda implements l<m0.l.c<? super List<? extends e>>, Object> {
    public int c;
    public final /* synthetic */ FeedViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$loadFeed$1(FeedViewModel feedViewModel, m0.l.c<? super FeedViewModel$loadFeed$1> cVar) {
        super(1, cVar);
        this.d = feedViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new FeedViewModel$loadFeed$1(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new FeedViewModel$loadFeed$1(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ChannelRepo channelRepo = this.d.s;
            this.c = 1;
            obj = channelRepo.l(this);
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
