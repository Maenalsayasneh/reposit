package i0.e.b.g3.k;

import android.view.View;
import com.clubhouse.android.channels.analytics.LeaveReason;
import com.clubhouse.android.ui.channels.ChannelFragment;
import i0.e.b.a3.f.j;
import i0.e.b.z2.g.c0;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class u implements View.OnClickListener {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ j d;

    public /* synthetic */ u(ChannelFragment channelFragment, j jVar) {
        this.c = channelFragment;
        this.d = jVar;
    }

    public final void onClick(View view) {
        ChannelFragment channelFragment = this.c;
        j jVar = this.d;
        i.e(channelFragment, "this$0");
        i.e(jVar, "$this_showBanner");
        channelFragment.S0().p(new c0(LeaveReason.LEAVE_WELCOME_ROOM));
        jVar.a.d(jVar);
    }
}
