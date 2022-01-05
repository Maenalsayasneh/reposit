package i0.e.b.g3.k;

import android.os.Parcelable;
import android.view.View;
import com.clubhouse.android.di.FragmentName;
import com.clubhouse.android.ui.channels.ChannelFragment;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class z implements View.OnClickListener {
    public final /* synthetic */ ChannelFragment c;

    public /* synthetic */ z(ChannelFragment channelFragment) {
        this.c = channelFragment;
    }

    public final void onClick(View view) {
        ChannelFragment channelFragment = this.c;
        k<Object>[] kVarArr = ChannelFragment.Z1;
        i.e(channelFragment, "this$0");
        v.f(channelFragment, FragmentName.BACKCHANNEL_INBOX_MODAL, (Parcelable) null);
    }
}
