package i0.e.b.g3.k;

import android.content.DialogInterface;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.channels.model.AudienceType;
import com.clubhouse.android.ui.channels.ChannelFragment;
import i0.e.b.z2.g.w;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class k implements DialogInterface.OnClickListener {
    public final /* synthetic */ ChannelFragment c;

    public /* synthetic */ k(ChannelFragment channelFragment) {
        this.c = channelFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ChannelFragment channelFragment = this.c;
        i.e(channelFragment, "this$0");
        m0.r.k<Object>[] kVarArr = ChannelFragment.Z1;
        ConstraintLayout constraintLayout = channelFragment.Q0().y.a;
        i.d(constraintLayout, "binding.waveSocialUpsell.root");
        i0.e.b.d3.k.m(constraintLayout);
        channelFragment.S0().p(w.a);
        channelFragment.S0().p(new i0.e.b.z2.g.i(AudienceType.Social));
    }
}
