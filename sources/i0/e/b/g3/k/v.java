package i0.e.b.g3.k;

import android.view.View;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.app.R;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class v implements View.OnClickListener {
    public final /* synthetic */ ChannelFragment c;

    public /* synthetic */ v(ChannelFragment channelFragment) {
        this.c = channelFragment;
    }

    public final void onClick(View view) {
        ChannelFragment channelFragment = this.c;
        k<Object>[] kVarArr = ChannelFragment.Z1;
        i.e(channelFragment, "this$0");
        i.e(channelFragment, "<this>");
        h0.t.i iVar = new h0.t.i(channelFragment.requireContext());
        iVar.e(R.navigation.main_graph);
        iVar.d(R.id.exploreFragment);
        iVar.a().send();
    }
}
