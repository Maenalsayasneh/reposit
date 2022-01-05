package i0.e.b.g3.k.y0;

import android.view.View;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.channels.views.ChannelCtaBar;
import com.clubhouse.android.ui.channels.views.ChannelCtaBarKt$bindCtaBar$6$1;
import h0.b0.v;
import i0.e.b.d3.k;
import i0.e.b.z2.g.i1;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ ChannelCtaBar d;

    public /* synthetic */ f(ChannelFragment channelFragment, ChannelCtaBar channelCtaBar) {
        this.c = channelFragment;
        this.d = channelCtaBar;
    }

    public final void onClick(View view) {
        ChannelFragment channelFragment = this.c;
        ChannelCtaBar channelCtaBar = this.d;
        i.e(channelFragment, "$this_bindCtaBar");
        i.e(channelCtaBar, "$ctaBar");
        v.G(channelFragment, ChannelCtaBarKt$bindCtaBar$6$1.c);
        channelFragment.S0().p(i1.a);
        k.m(channelCtaBar);
    }
}
