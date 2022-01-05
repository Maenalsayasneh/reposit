package com.clubhouse.android.ui.hallway.feed;

import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.hallway.feed.FeedViewModel$hideChannel$1", f = "FeedViewModel.kt", l = {457}, m = "invokeSuspend")
/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$hideChannel$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ FeedViewModel d;
    public final /* synthetic */ ChannelInFeed q;
    public final /* synthetic */ boolean x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$hideChannel$1(FeedViewModel feedViewModel, ChannelInFeed channelInFeed, boolean z, m0.l.c<? super FeedViewModel$hideChannel$1> cVar) {
        super(1, cVar);
        this.d = feedViewModel;
        this.q = channelInFeed;
        this.x = z;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new FeedViewModel$hideChannel$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new FeedViewModel$hideChannel$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            this.c = 1;
            obj = this.d.s.n(this.q.a2, !this.x, this);
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
