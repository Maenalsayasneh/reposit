package i0.e.b.g3.p.c0;

import android.view.View;
import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.clubhouse.android.ui.hallway.feed.FeedFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class h implements View.OnLongClickListener {
    public final /* synthetic */ FeedFragment c;
    public final /* synthetic */ ChannelInFeed d;

    public /* synthetic */ h(FeedFragment feedFragment, ChannelInFeed channelInFeed) {
        this.c = feedFragment;
        this.d = channelInFeed;
    }

    public final boolean onLongClick(View view) {
        FeedFragment feedFragment = this.c;
        ChannelInFeed channelInFeed = this.d;
        i.e(feedFragment, "this$0");
        i.e(channelInFeed, "$channel");
        feedFragment.R0(channelInFeed);
        return true;
    }
}
