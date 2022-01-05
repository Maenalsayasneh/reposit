package i0.e.b.g3.k;

import android.content.DialogInterface;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.ui.channels.ChannelFragment;
import i0.e.b.z2.g.o;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class e0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ UserInChannel d;

    public /* synthetic */ e0(ChannelFragment channelFragment, UserInChannel userInChannel) {
        this.c = channelFragment;
        this.d = userInChannel;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ChannelFragment channelFragment = this.c;
        UserInChannel userInChannel = this.d;
        i.e(channelFragment, "this$0");
        i.e(userInChannel, "$user");
        channelFragment.S0().p(new o(userInChannel));
    }
}
