package i0.e.c.e;

import android.view.View;
import com.clubhouse.backchannel.create.BackchannelCreateChatFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ BackchannelCreateChatFragment c;

    public /* synthetic */ a(BackchannelCreateChatFragment backchannelCreateChatFragment) {
        this.c = backchannelCreateChatFragment;
    }

    public final void onClick(View view) {
        BackchannelCreateChatFragment backchannelCreateChatFragment = this.c;
        k<Object>[] kVarArr = BackchannelCreateChatFragment.Z1;
        i.e(backchannelCreateChatFragment, "this$0");
        h0.o.a.k activity = backchannelCreateChatFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }
}
