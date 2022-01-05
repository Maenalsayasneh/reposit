package i0.e.b.g3.k;

import android.content.DialogInterface;
import com.clubhouse.android.channels.model.AudienceType;
import com.clubhouse.android.ui.channels.ChannelFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ChannelFragment c;

    public /* synthetic */ d0(ChannelFragment channelFragment) {
        this.c = channelFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ChannelFragment channelFragment = this.c;
        i.e(channelFragment, "this$0");
        channelFragment.S0().p(new i0.e.b.z2.g.i(AudienceType.Open));
    }
}
