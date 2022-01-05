package i0.e.b.g3.p.b0;

import android.content.DialogInterface;
import android.widget.FrameLayout;
import com.clubhouse.android.ui.hallway.buddyList.BuddyListFragment;
import i0.e.b.a3.b.c;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class l implements DialogInterface.OnClickListener {
    public final /* synthetic */ BuddyListFragment c;
    public final /* synthetic */ c d;

    public /* synthetic */ l(BuddyListFragment buddyListFragment, c cVar) {
        this.c = buddyListFragment;
        this.d = cVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BuddyListFragment buddyListFragment = this.c;
        c cVar = this.d;
        i.e(buddyListFragment, "this$0");
        i.e(cVar, "$startChannelIntent");
        k<Object>[] kVarArr = BuddyListFragment.Z1;
        FrameLayout frameLayout = buddyListFragment.N0().g;
        i.d(frameLayout, "binding.roomLoading");
        i0.e.b.d3.k.K(frameLayout);
        buddyListFragment.O0().p(cVar);
        dialogInterface.cancel();
    }
}
