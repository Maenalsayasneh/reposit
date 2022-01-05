package com.clubhouse.android.ui.hallway.feed;

import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.p.c0.p;
import i0.e.b.g3.p.c0.q;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: FeedFragment.kt */
public final class FeedFragment$showHideOption$2 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ FeedFragment c;
    public final /* synthetic */ ChannelInFeed d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedFragment$showHideOption$2(FeedFragment feedFragment, ChannelInFeed channelInFeed) {
        super(1);
        this.c = feedFragment;
        this.d = channelInFeed;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.e(R.string.hide_this_room);
        aVar.c(R.string.cancel, p.c);
        aVar.d(R.string.ok, new q(this.c, this.d));
        return i.a;
    }
}
