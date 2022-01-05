package i0.e.c.c;

import android.view.View;
import com.clubhouse.backchannel.chat.BackchannelChatFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ BackchannelChatFragment c;

    public /* synthetic */ b(BackchannelChatFragment backchannelChatFragment) {
        this.c = backchannelChatFragment;
    }

    public final void onClick(View view) {
        BackchannelChatFragment backchannelChatFragment = this.c;
        k<Object>[] kVarArr = BackchannelChatFragment.Z1;
        i.e(backchannelChatFragment, "this$0");
        h0.o.a.k activity = backchannelChatFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }
}
