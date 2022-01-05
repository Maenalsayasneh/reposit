package i0.e.b.g3.k.y0;

import android.view.View;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.channels.views.ChannelCtaBar;
import i0.e.b.d3.k;
import i0.e.b.z2.g.a;
import i0.e.b.z2.g.l;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ l c;
    public final /* synthetic */ ChannelCtaBar d;
    public final /* synthetic */ ChannelFragment q;

    public /* synthetic */ b(l lVar, ChannelCtaBar channelCtaBar, ChannelFragment channelFragment) {
        this.c = lVar;
        this.d = channelCtaBar;
        this.q = channelFragment;
    }

    public final void onClick(View view) {
        Club i;
        l lVar = this.c;
        ChannelCtaBar channelCtaBar = this.d;
        ChannelFragment channelFragment = this.q;
        i.e(lVar, "$state");
        i.e(channelCtaBar, "$ctaBar");
        i.e(channelFragment, "$this_bindCtaBar");
        Channel channel = lVar.u;
        if (!(channel == null || (i = channel.i()) == null)) {
            channelFragment.S0().p(new a(i));
        }
        k.m(channelCtaBar);
    }
}
