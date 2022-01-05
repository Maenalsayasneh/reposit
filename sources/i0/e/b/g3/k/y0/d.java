package i0.e.b.g3.k.y0;

import android.view.View;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.channels.ChannelFragment$showChannelAudienceOptions$1;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ ChannelFragment c;

    public /* synthetic */ d(ChannelFragment channelFragment) {
        this.c = channelFragment;
    }

    public final void onClick(View view) {
        ChannelFragment channelFragment = this.c;
        i.e(channelFragment, "$this_bindCtaBar");
        v.v2(channelFragment.S0(), new ChannelFragment$showChannelAudienceOptions$1(channelFragment));
    }
}
