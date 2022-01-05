package i0.e.c.e;

import android.view.View;
import com.clubhouse.android.ui.backchannel.CreateChatArgs;
import com.clubhouse.backchannel.create.BackchannelCreateChatFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ BackchannelCreateChatFragment c;

    public /* synthetic */ d(BackchannelCreateChatFragment backchannelCreateChatFragment) {
        this.c = backchannelCreateChatFragment;
    }

    public final void onClick(View view) {
        BackchannelCreateChatFragment backchannelCreateChatFragment = this.c;
        k<Object>[] kVarArr = BackchannelCreateChatFragment.Z1;
        i.e(backchannelCreateChatFragment, "this$0");
        backchannelCreateChatFragment.O0().p(new g(((CreateChatArgs) backchannelCreateChatFragment.c2.getValue(backchannelCreateChatFragment, BackchannelCreateChatFragment.Z1[2])).c));
    }
}
