package i0.e.b.g3.k;

import android.view.View;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.channels.ChannelFragment$bindWaveUpsell$1$1;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class r implements View.OnClickListener {
    public final /* synthetic */ ChannelFragment c;

    public /* synthetic */ r(ChannelFragment channelFragment) {
        this.c = channelFragment;
    }

    public final void onClick(View view) {
        ChannelFragment channelFragment = this.c;
        k<Object>[] kVarArr = ChannelFragment.Z1;
        i.e(channelFragment, "this$0");
        ChannelFragment$bindWaveUpsell$1$1 channelFragment$bindWaveUpsell$1$1 = new ChannelFragment$bindWaveUpsell$1$1(channelFragment);
        i.e(channelFragment, "<this>");
        i.e(channelFragment$bindWaveUpsell$1$1, "f");
        d.a aVar = new d.a(channelFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
        channelFragment$bindWaveUpsell$1$1.invoke(aVar);
        aVar.g();
    }
}
