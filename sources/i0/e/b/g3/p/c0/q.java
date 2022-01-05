package i0.e.b.g3.p.c0;

import android.content.DialogInterface;
import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.hallway.feed.FeedFragment;
import com.clubhouse.android.ui.hallway.feed.FeedViewModel;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class q implements DialogInterface.OnClickListener {
    public final /* synthetic */ FeedFragment c;
    public final /* synthetic */ ChannelInFeed d;

    public /* synthetic */ q(FeedFragment feedFragment, ChannelInFeed channelInFeed) {
        this.c = feedFragment;
        this.d = channelInFeed;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FeedFragment feedFragment = this.c;
        ChannelInFeed channelInFeed = this.d;
        i.e(feedFragment, "this$0");
        i.e(channelInFeed, "$channel");
        k<Object>[] kVarArr = FeedFragment.Z1;
        FeedViewModel P0 = feedFragment.P0();
        int i2 = FeedViewModel.m;
        P0.r(channelInFeed, false);
        feedFragment.N0().b(SourceLocation.HALLWAY, channelInFeed.Y1);
    }
}
