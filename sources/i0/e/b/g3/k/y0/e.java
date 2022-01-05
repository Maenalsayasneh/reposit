package i0.e.b.g3.k.y0;

import android.view.View;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.channels.views.ChannelCtaBar;
import i0.e.b.d3.k;
import i0.e.b.z2.g.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ BasicUser d;
    public final /* synthetic */ ChannelCtaBar q;

    public /* synthetic */ e(ChannelFragment channelFragment, BasicUser basicUser, ChannelCtaBar channelCtaBar) {
        this.c = channelFragment;
        this.d = basicUser;
        this.q = channelCtaBar;
    }

    public final void onClick(View view) {
        ChannelFragment channelFragment = this.c;
        BasicUser basicUser = this.d;
        ChannelCtaBar channelCtaBar = this.q;
        i.e(channelFragment, "$this_bindCtaBar");
        i.e(basicUser, "$user");
        i.e(channelCtaBar, "$ctaBar");
        channelFragment.S0().p(new v(basicUser, SourceLocation.WELCOME_ROOM));
        k.m(channelCtaBar);
    }
}
