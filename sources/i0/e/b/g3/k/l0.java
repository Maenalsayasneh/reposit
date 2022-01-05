package i0.e.b.g3.k;

import android.view.View;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.ui.channels.ChannelFragment;
import i0.e.b.a3.f.j;
import i0.e.b.z2.g.a0;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class l0 implements View.OnClickListener {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ UserInChannel d;
    public final /* synthetic */ j q;

    public /* synthetic */ l0(ChannelFragment channelFragment, UserInChannel userInChannel, j jVar) {
        this.c = channelFragment;
        this.d = userInChannel;
        this.q = jVar;
    }

    public final void onClick(View view) {
        ChannelFragment channelFragment = this.c;
        UserInChannel userInChannel = this.d;
        j jVar = this.q;
        i.e(channelFragment, "this$0");
        i.e(userInChannel, "$user");
        i.e(jVar, "$this_showBanner");
        channelFragment.S0().p(new a0(userInChannel, true));
        jVar.a.d(jVar);
    }
}
