package i0.e.b.g3.p.c0;

import android.view.MenuItem;
import com.clubhouse.android.data.models.local.ReportTarget;
import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.clubhouse.android.ui.hallway.feed.FeedFragment;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryArgs;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import h0.b.f.m0;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.p.o;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class d implements m0.a {
    public final /* synthetic */ FeedFragment a;
    public final /* synthetic */ ChannelInFeed b;

    public /* synthetic */ d(FeedFragment feedFragment, ChannelInFeed channelInFeed) {
        this.a = feedFragment;
        this.b = channelInFeed;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        FeedFragment feedFragment = this.a;
        ChannelInFeed channelInFeed = this.b;
        i.e(feedFragment, "this$0");
        i.e(channelInFeed, "$channel");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.hide_this_room) {
            feedFragment.R0(channelInFeed);
            return true;
        } else if (itemId != R.id.report_room_title) {
            return true;
        } else {
            k<Object>[] kVarArr = FeedFragment.Z1;
            ReportIncidentSelectCategoryArgs reportIncidentSelectCategoryArgs = new ReportIncidentSelectCategoryArgs((User) null, channelInFeed.a2, channelInFeed, (String) null, (Integer) null, v.R1(feedFragment), ReportTarget.CHANNEL_TOPIC, 25);
            i.e(reportIncidentSelectCategoryArgs, "mavericksArg");
            v.a1(feedFragment, new o(reportIncidentSelectCategoryArgs), (q) null, 2);
            return true;
        }
    }
}
