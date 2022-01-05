package i0.e.b.g3.n;

import android.view.View;
import com.clubhouse.android.ui.creation.CreateChannelFragment;
import com.clubhouse.android.ui.creation.CreateChannelFragment$showStartRoomConfirmationIfNecessary$1;
import h0.b0.v;

/* compiled from: lambda */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ CreateChannelFragment c;

    public /* synthetic */ i(CreateChannelFragment createChannelFragment) {
        this.c = createChannelFragment;
    }

    public final void onClick(View view) {
        CreateChannelFragment createChannelFragment = this.c;
        CreateChannelFragment.a aVar = CreateChannelFragment.p2;
        m0.n.b.i.e(createChannelFragment, "this$0");
        v.v2(createChannelFragment.W0(), new CreateChannelFragment$showStartRoomConfirmationIfNecessary$1(createChannelFragment));
    }
}
