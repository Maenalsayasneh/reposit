package i0.e.b.g3.p.b0;

import android.view.View;
import com.clubhouse.android.ui.hallway.buddyList.BuddyListFragment;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.q;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ BuddyListFragment c;

    public /* synthetic */ a(BuddyListFragment buddyListFragment) {
        this.c = buddyListFragment;
    }

    public final void onClick(View view) {
        BuddyListFragment buddyListFragment = this.c;
        k<Object>[] kVarArr = BuddyListFragment.Z1;
        i.e(buddyListFragment, "this$0");
        v.a1(buddyListFragment, new h0.t.a(R.id.action_buddyListFragment_to_exploreFragment), (q) null, 2);
    }
}
