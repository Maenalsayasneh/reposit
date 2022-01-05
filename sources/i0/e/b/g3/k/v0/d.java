package i0.e.b.g3.k.v0;

import android.view.MenuItem;
import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.data.models.local.channel.HandraisePermission;
import com.clubhouse.android.ui.channels.raisedhands.RaisedHandsQueueFragment;
import com.clubhouse.app.R;
import h0.b.f.m0;
import i0.e.b.z2.g.h;
import i0.e.b.z2.g.l;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d implements m0.a {
    public final /* synthetic */ RaisedHandsQueueFragment a;
    public final /* synthetic */ l b;

    public /* synthetic */ d(RaisedHandsQueueFragment raisedHandsQueueFragment, l lVar) {
        this.a = raisedHandsQueueFragment;
        this.b = lVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        HandraisePermission handraisePermission;
        RaisedHandsQueueFragment raisedHandsQueueFragment = this.a;
        l lVar = this.b;
        i.e(raisedHandsQueueFragment, "this$0");
        i.e(lVar, "$state");
        if (R.id.handraise_menu_off == menuItem.getItemId()) {
            ((ChannelViewModel) raisedHandsQueueFragment.n2.getValue()).p(new h(false, lVar.E));
        } else {
            HandraisePermission[] values = HandraisePermission.values();
            int i = 0;
            while (true) {
                if (i >= 3) {
                    handraisePermission = null;
                    break;
                }
                handraisePermission = values[i];
                if (handraisePermission.getMenuID() == menuItem.getItemId()) {
                    break;
                }
                i++;
            }
            if (handraisePermission != null) {
                ((ChannelViewModel) raisedHandsQueueFragment.n2.getValue()).p(new h(true, handraisePermission));
            }
        }
        return true;
    }
}
