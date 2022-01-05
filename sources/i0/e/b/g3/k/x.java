package i0.e.b.g3.k;

import android.view.View;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.channels.ChannelNavigation$showEditPhotoFragment$1;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class x implements View.OnLongClickListener {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ UserInChannel d;

    public /* synthetic */ x(ChannelFragment channelFragment, UserInChannel userInChannel) {
        this.c = channelFragment;
        this.d = userInChannel;
    }

    public final boolean onLongClick(View view) {
        ChannelFragment channelFragment = this.c;
        UserInChannel userInChannel = this.d;
        i.e(channelFragment, "this$0");
        i.e(userInChannel, "$self");
        i.e(channelFragment, "<this>");
        i.e(userInChannel, "user");
        v.G(channelFragment, new ChannelNavigation$showEditPhotoFragment$1(userInChannel));
        return true;
    }
}
