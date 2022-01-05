package i0.e.b.g3.p.c0;

import android.view.View;
import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.channels.ChannelNavigation;
import com.clubhouse.android.ui.hallway.feed.FeedFragment;
import i0.e.a.b.a;

/* compiled from: lambda */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ FeedFragment c;
    public final /* synthetic */ ChannelInFeed d;

    public /* synthetic */ i(FeedFragment feedFragment, ChannelInFeed channelInFeed) {
        this.c = feedFragment;
        this.d = channelInFeed;
    }

    public final void onClick(View view) {
        FeedFragment feedFragment = this.c;
        ChannelInFeed channelInFeed = this.d;
        m0.n.b.i.e(feedFragment, "this$0");
        m0.n.b.i.e(channelInFeed, "$channel");
        a N0 = feedFragment.N0();
        SourceLocation sourceLocation = SourceLocation.HALLWAY;
        N0.a(sourceLocation, channelInFeed.Y1);
        ChannelNavigation.b(feedFragment, channelInFeed.a2, channelInFeed, sourceLocation);
    }
}
