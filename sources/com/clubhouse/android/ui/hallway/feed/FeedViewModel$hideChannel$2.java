package com.clubhouse.android.ui.hallway.feed;

import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.p.c0.v;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$hideChannel$2 extends Lambda implements p<v, b<? extends EmptySuccessResponse>, v> {
    public final /* synthetic */ FeedViewModel c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ChannelInFeed q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$hideChannel$2(FeedViewModel feedViewModel, boolean z, ChannelInFeed channelInFeed) {
        super(2);
        this.c = feedViewModel;
        this.d = z;
        this.q = channelInFeed;
    }

    public Object invoke(Object obj, Object obj2) {
        v vVar = (v) obj;
        b bVar = (b) obj2;
        i.e(vVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            FeedViewModel feedViewModel = this.c;
            boolean z = this.d;
            ChannelInFeed channelInFeed = this.q;
            Objects.requireNonNull(feedViewModel);
            feedViewModel.m(new FeedViewModel$updateFeedItemsCacheOnHide$1(z, channelInFeed, feedViewModel));
        }
        if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return vVar;
    }
}
