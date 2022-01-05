package i0.e.c.i;

import android.view.View;
import com.clubhouse.backchannel.members.BackchannelChatMembersFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ BackchannelChatMembersFragment c;

    public /* synthetic */ c(BackchannelChatMembersFragment backchannelChatMembersFragment) {
        this.c = backchannelChatMembersFragment;
    }

    public final void onClick(View view) {
        BackchannelChatMembersFragment backchannelChatMembersFragment = this.c;
        k<Object>[] kVarArr = BackchannelChatMembersFragment.p2;
        i.e(backchannelChatMembersFragment, "this$0");
        backchannelChatMembersFragment.dismiss();
    }
}
