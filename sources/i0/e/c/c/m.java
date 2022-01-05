package i0.e.c.c;

import android.view.View;
import android.widget.FrameLayout;
import com.clubhouse.backchannel.chat.BackchannelChatFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class m implements View.OnClickListener {
    public final /* synthetic */ BackchannelChatFragment c;

    public /* synthetic */ m(BackchannelChatFragment backchannelChatFragment) {
        this.c = backchannelChatFragment;
    }

    public final void onClick(View view) {
        BackchannelChatFragment backchannelChatFragment = this.c;
        k<Object>[] kVarArr = BackchannelChatFragment.Z1;
        i.e(backchannelChatFragment, "this$0");
        backchannelChatFragment.P0().p(h0.a);
        FrameLayout frameLayout = backchannelChatFragment.O0().g;
        i.d(frameLayout, "binding.roomLoading");
        i0.e.b.d3.k.K(frameLayout);
    }
}
