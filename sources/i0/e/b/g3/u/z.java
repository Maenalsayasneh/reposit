package i0.e.b.g3.u;

import android.view.MenuItem;
import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.ui.profile.HalfProfileFragment;
import com.clubhouse.android.ui.profile.HalfProfileFragment$inChannelMenuListener$1$1;
import h0.b.f.m0;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class z implements m0.a {
    public final /* synthetic */ HalfProfileFragment a;

    public /* synthetic */ z(HalfProfileFragment halfProfileFragment) {
        this.a = halfProfileFragment;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        HalfProfileFragment halfProfileFragment = this.a;
        HalfProfileFragment.b bVar = HalfProfileFragment.Z1;
        i.e(halfProfileFragment, "this$0");
        ChannelViewModel channelViewModel = halfProfileFragment.j2;
        if (channelViewModel == null) {
            return false;
        }
        return ((Boolean) v.u2(halfProfileFragment.U0(), channelViewModel, new HalfProfileFragment$inChannelMenuListener$1$1(menuItem, halfProfileFragment))).booleanValue();
    }
}
