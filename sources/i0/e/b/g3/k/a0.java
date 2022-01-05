package i0.e.b.g3.k;

import android.view.View;
import com.clubhouse.android.ui.channels.ChannelFragment;
import i0.e.b.a3.f.j;
import i0.e.b.z2.g.b;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a0 implements View.OnClickListener {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ long d;
    public final /* synthetic */ j q;

    public /* synthetic */ a0(ChannelFragment channelFragment, long j, j jVar) {
        this.c = channelFragment;
        this.d = j;
        this.q = jVar;
    }

    public final void onClick(View view) {
        ChannelFragment channelFragment = this.c;
        long j = this.d;
        j jVar = this.q;
        i.e(channelFragment, "this$0");
        i.e(jVar, "$this_showBanner");
        channelFragment.S0().p(new b(j));
        jVar.a.d(jVar);
    }
}
