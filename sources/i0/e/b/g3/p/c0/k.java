package i0.e.b.g3.p.c0;

import android.view.View;
import com.clubhouse.android.ui.hallway.feed.FeedFragment;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.a;
import h0.t.q;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ FeedFragment c;

    public /* synthetic */ k(FeedFragment feedFragment) {
        this.c = feedFragment;
    }

    public final void onClick(View view) {
        FeedFragment feedFragment = this.c;
        i.e(feedFragment, "this$0");
        v.a1(feedFragment, new a(R.id.action_feedFragment_to_languagesFragment), (q) null, 2);
        m0.r.k<Object>[] kVarArr = FeedFragment.Z1;
        feedFragment.P0().p(b0.a);
    }
}
