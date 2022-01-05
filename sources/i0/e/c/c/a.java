package i0.e.c.c;

import android.view.View;
import com.clubhouse.backchannel.chat.BackchannelChatFragment;
import com.clubhouse.backchannel.chat.BackchannelChatFragment$onViewCreated$7$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ BackchannelChatFragment c;

    public /* synthetic */ a(BackchannelChatFragment backchannelChatFragment) {
        this.c = backchannelChatFragment;
    }

    public final void onClick(View view) {
        BackchannelChatFragment backchannelChatFragment = this.c;
        k<Object>[] kVarArr = BackchannelChatFragment.Z1;
        i.e(backchannelChatFragment, "this$0");
        v.v2(backchannelChatFragment.P0(), new BackchannelChatFragment$onViewCreated$7$1(backchannelChatFragment));
    }
}
