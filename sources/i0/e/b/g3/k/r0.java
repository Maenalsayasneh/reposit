package i0.e.b.g3.k;

import android.view.View;
import com.clubhouse.android.ui.channels.ChannelFragment;
import i0.e.b.a3.f.j;
import i0.e.b.z2.g.m0;
import i0.e.b.z2.g.y0;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class r0 implements View.OnClickListener {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ y0 d;
    public final /* synthetic */ j q;

    public /* synthetic */ r0(ChannelFragment channelFragment, y0 y0Var, j jVar) {
        this.c = channelFragment;
        this.d = y0Var;
        this.q = jVar;
    }

    public final void onClick(View view) {
        ChannelFragment channelFragment = this.c;
        y0 y0Var = this.d;
        j jVar = this.q;
        i.e(channelFragment, "this$0");
        i.e(y0Var, "$invite");
        i.e(jVar, "$this_showBanner");
        channelFragment.S0().p(new m0(y0Var.b));
        jVar.a.d(jVar);
    }
}
