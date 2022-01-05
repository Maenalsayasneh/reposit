package i0.e.b.g3.p.c0;

import android.view.View;
import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.clubhouse.android.ui.hallway.feed.FeedFragment;
import com.clubhouse.android.ui.hallway.feed.FeedFragment$buildModels$1$1$2$4$3$1;
import h0.b.f.m0;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class j implements View.OnClickListener {
    public final /* synthetic */ FeedFragment c;
    public final /* synthetic */ ChannelInFeed d;

    public /* synthetic */ j(FeedFragment feedFragment, ChannelInFeed channelInFeed) {
        this.c = feedFragment;
        this.d = channelInFeed;
    }

    public final void onClick(View view) {
        FeedFragment feedFragment = this.c;
        ChannelInFeed channelInFeed = this.d;
        i.e(feedFragment, "this$0");
        i.e(channelInFeed, "$channel");
        i.d(view, "view");
        FeedFragment$buildModels$1$1$2$4$3$1 feedFragment$buildModels$1$1$2$4$3$1 = new FeedFragment$buildModels$1$1$2$4$3$1(channelInFeed, feedFragment);
        i.e(feedFragment, "<this>");
        i.e(view, "anchor");
        i.e(feedFragment$buildModels$1$1$2$4$3$1, "f");
        m0 m0Var = new m0(feedFragment.requireContext(), view);
        feedFragment$buildModels$1$1$2$4$3$1.invoke(m0Var);
        if (!m0Var.d.f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }
}
