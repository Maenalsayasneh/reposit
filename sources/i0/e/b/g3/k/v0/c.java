package i0.e.b.g3.k.v0;

import android.view.View;
import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.ui.channels.raisedhands.RaisedHandsQueueFragment;
import i0.e.b.z2.g.a0;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ RaisedHandsQueueFragment c;
    public final /* synthetic */ UserInChannel d;

    public /* synthetic */ c(RaisedHandsQueueFragment raisedHandsQueueFragment, UserInChannel userInChannel) {
        this.c = raisedHandsQueueFragment;
        this.d = userInChannel;
    }

    public final void onClick(View view) {
        RaisedHandsQueueFragment raisedHandsQueueFragment = this.c;
        UserInChannel userInChannel = this.d;
        i.e(raisedHandsQueueFragment, "this$0");
        i.e(userInChannel, "$user");
        ((ChannelViewModel) raisedHandsQueueFragment.n2.getValue()).p(new a0(userInChannel, true));
    }
}
