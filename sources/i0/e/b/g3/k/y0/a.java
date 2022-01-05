package i0.e.b.g3.k.y0;

import android.content.Context;
import android.view.View;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.channels.views.ChannelCtaBar;
import com.clubhouse.android.ui.channels.views.ChannelCtaBarKt$bindCtaBar$5$2;
import com.clubhouse.android.ui.channels.views.ChannelCtaBarKt$bindCtaBar$5$3;
import h0.b0.v;
import i0.e.b.d3.k;
import i0.e.b.z2.g.b0;
import i0.e.b.z2.g.l;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ l c;
    public final /* synthetic */ ChannelFragment d;
    public final /* synthetic */ ChannelCtaBar q;

    public /* synthetic */ a(l lVar, ChannelFragment channelFragment, ChannelCtaBar channelCtaBar) {
        this.c = lVar;
        this.d = channelFragment;
        this.q = channelCtaBar;
    }

    public final void onClick(View view) {
        String str;
        Club i;
        Club i2;
        l lVar = this.c;
        ChannelFragment channelFragment = this.d;
        ChannelCtaBar channelCtaBar = this.q;
        i.e(lVar, "$state");
        i.e(channelFragment, "$this_bindCtaBar");
        i.e(channelCtaBar, "$ctaBar");
        if (lVar.z) {
            Channel channel = lVar.u;
            if (!(channel == null || (i2 = channel.i()) == null)) {
                channelFragment.S0().p(new b0(i2, (String) null, 2));
            }
        } else {
            Context requireContext = channelFragment.requireContext();
            i.d(requireContext, "requireContext()");
            Channel channel2 = lVar.u;
            if (channel2 == null || (i = channel2.i()) == null || (str = i.getName()) == null) {
                str = "";
            }
            v.d2(channelFragment, requireContext, str, new ChannelCtaBarKt$bindCtaBar$5$2(lVar, channelFragment), new ChannelCtaBarKt$bindCtaBar$5$3(lVar, channelFragment));
        }
        k.m(channelCtaBar);
    }
}
