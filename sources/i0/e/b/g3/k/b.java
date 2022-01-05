package i0.e.b.g3.k;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.ui.channels.ChannelFragment;
import i0.e.b.z2.g.w;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ ChannelFragment c;

    public /* synthetic */ b(ChannelFragment channelFragment) {
        this.c = channelFragment;
    }

    public final void onClick(View view) {
        ChannelFragment channelFragment = this.c;
        k<Object>[] kVarArr = ChannelFragment.Z1;
        i.e(channelFragment, "this$0");
        ConstraintLayout constraintLayout = channelFragment.Q0().y.a;
        i.d(constraintLayout, "binding.waveSocialUpsell.root");
        i0.e.b.d3.k.m(constraintLayout);
        channelFragment.S0().p(w.a);
    }
}
