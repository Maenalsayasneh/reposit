package i0.e.c.c;

import android.view.View;
import com.clubhouse.backchannel.chat.BackchannelChatFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ BackchannelChatFragment c;

    public /* synthetic */ n(BackchannelChatFragment backchannelChatFragment) {
        this.c = backchannelChatFragment;
    }

    public final void onClick(View view) {
        BackchannelChatFragment backchannelChatFragment = this.c;
        k<Object>[] kVarArr = BackchannelChatFragment.Z1;
        i.e(backchannelChatFragment, "this$0");
        backchannelChatFragment.P0().p(new f0(backchannelChatFragment.O0().f.getText().toString()));
        backchannelChatFragment.O0().f.getText().clear();
    }
}
