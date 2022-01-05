package i0.e.b.g3.p.c0;

import android.view.View;
import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.clubhouse.android.ui.hallway.feed.FeedFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ FeedFragment c;
    public final /* synthetic */ ChannelInFeed d;

    public /* synthetic */ e(FeedFragment feedFragment, ChannelInFeed channelInFeed) {
        this.c = feedFragment;
        this.d = channelInFeed;
    }

    public final void onClick(View view) {
        FeedFragment feedFragment = this.c;
        ChannelInFeed channelInFeed = this.d;
        i.e(feedFragment, "this$0");
        i.e(channelInFeed, "$channel");
        k<Object>[] kVarArr = FeedFragment.Z1;
        feedFragment.P0().r(channelInFeed, true);
    }
}
