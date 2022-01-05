package i0.e.c.c;

import android.content.DialogInterface;
import com.clubhouse.android.user.model.User;
import com.clubhouse.backchannel.chat.BackchannelChatFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class r implements DialogInterface.OnClickListener {
    public final /* synthetic */ BackchannelChatFragment c;
    public final /* synthetic */ User d;

    public /* synthetic */ r(BackchannelChatFragment backchannelChatFragment, User user) {
        this.c = backchannelChatFragment;
        this.d = user;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BackchannelChatFragment backchannelChatFragment = this.c;
        User user = this.d;
        i.e(backchannelChatFragment, "this$0");
        i.e(user, "$user");
        k<Object>[] kVarArr = BackchannelChatFragment.Z1;
        backchannelChatFragment.P0().p(new z(user.getId().intValue()));
        dialogInterface.dismiss();
    }
}
