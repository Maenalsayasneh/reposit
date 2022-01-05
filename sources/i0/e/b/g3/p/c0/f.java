package i0.e.b.g3.p.c0;

import android.view.View;
import com.clubhouse.android.ui.hallway.feed.FeedFragment;
import com.clubhouse.android.ui.hallway.feed.FeedViewModel;
import com.clubhouse.android.ui.hallway.feed.FeedViewModel$toggleBlockedChannels$1;
import java.util.Objects;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ FeedFragment c;

    public /* synthetic */ f(FeedFragment feedFragment) {
        this.c = feedFragment;
    }

    public final void onClick(View view) {
        FeedFragment feedFragment = this.c;
        i.e(feedFragment, "this$0");
        k<Object>[] kVarArr = FeedFragment.Z1;
        FeedViewModel P0 = feedFragment.P0();
        Objects.requireNonNull(P0);
        P0.m(new FeedViewModel$toggleBlockedChannels$1(P0));
    }
}
