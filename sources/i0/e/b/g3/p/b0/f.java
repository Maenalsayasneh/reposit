package i0.e.b.g3.p.b0;

import android.view.View;
import com.clubhouse.android.ui.hallway.buddyList.BuddyListFragment;
import com.clubhouse.wave.data.models.local.ReceivedWave;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ BuddyListFragment c;
    public final /* synthetic */ ReceivedWave d;

    public /* synthetic */ f(BuddyListFragment buddyListFragment, ReceivedWave receivedWave) {
        this.c = buddyListFragment;
        this.d = receivedWave;
    }

    public final void onClick(View view) {
        BuddyListFragment buddyListFragment = this.c;
        ReceivedWave receivedWave = this.d;
        i.e(buddyListFragment, "this$0");
        i.e(receivedWave, "$wave");
        k<Object>[] kVarArr = BuddyListFragment.Z1;
        buddyListFragment.O0().p(new o(receivedWave));
    }
}
