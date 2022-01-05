package i0.e.b.g3.k.y0;

import android.view.View;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.channels.ChannelFragment$showOwnFullProfile$1;
import com.clubhouse.android.ui.channels.ChannelFragment$showOwnFullProfileWithAutoJumpToEditBio$1;
import com.clubhouse.android.ui.channels.ChannelFragment$showOwnFullProfileWithAutoJumpToEditPhoto$1;
import com.clubhouse.android.ui.channels.views.ChannelCtaBar;
import h0.b0.v;
import i0.e.b.d3.k;
import i0.e.b.z2.g.t;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ChannelFragment d;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ ChannelCtaBar x;

    public /* synthetic */ c(boolean z, ChannelFragment channelFragment, boolean z2, ChannelCtaBar channelCtaBar) {
        this.c = z;
        this.d = channelFragment;
        this.q = z2;
        this.x = channelCtaBar;
    }

    public final void onClick(View view) {
        boolean z = this.c;
        ChannelFragment channelFragment = this.d;
        boolean z2 = this.q;
        ChannelCtaBar channelCtaBar = this.x;
        i.e(channelFragment, "$this_bindCtaBar");
        i.e(channelCtaBar, "$ctaBar");
        if (z) {
            v.v2(channelFragment.S0(), new ChannelFragment$showOwnFullProfileWithAutoJumpToEditPhoto$1(channelFragment));
        } else if (z2) {
            v.v2(channelFragment.S0(), new ChannelFragment$showOwnFullProfileWithAutoJumpToEditBio$1(channelFragment));
        } else {
            v.v2(channelFragment.S0(), new ChannelFragment$showOwnFullProfile$1(channelFragment));
        }
        i.e(channelFragment, "<this>");
        channelFragment.I0().a();
        k.m(channelCtaBar);
        channelFragment.S0().p(t.a);
    }
}
