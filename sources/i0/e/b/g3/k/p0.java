package i0.e.b.g3.k;

import android.content.DialogInterface;
import com.clubhouse.android.channels.analytics.LeaveReason;
import com.clubhouse.android.ui.channels.ChannelFragment;
import i0.e.b.z2.g.c0;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class p0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ChannelFragment c;

    public /* synthetic */ p0(ChannelFragment channelFragment) {
        this.c = channelFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ChannelFragment channelFragment = this.c;
        i.e(channelFragment, "this$0");
        channelFragment.S0().p(new c0(LeaveReason.LEAVE_BUTTON));
    }
}
