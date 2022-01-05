package i0.e.b.g3.k;

import android.view.View;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.channels.ChannelFragment$showChannelOptions$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class m implements View.OnClickListener {
    public final /* synthetic */ ChannelFragment c;

    public /* synthetic */ m(ChannelFragment channelFragment) {
        this.c = channelFragment;
    }

    public final void onClick(View view) {
        ChannelFragment channelFragment = this.c;
        i.e(channelFragment, "this$0");
        k<Object>[] kVarArr = ChannelFragment.Z1;
        v.v2(channelFragment.S0(), new ChannelFragment$showChannelOptions$1(channelFragment));
    }
}
