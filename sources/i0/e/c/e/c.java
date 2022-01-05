package i0.e.c.e;

import android.view.View;
import com.clubhouse.android.user.model.User;
import com.clubhouse.backchannel.create.BackchannelCreateChatFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ BackchannelCreateChatFragment c;
    public final /* synthetic */ User d;

    public /* synthetic */ c(BackchannelCreateChatFragment backchannelCreateChatFragment, User user) {
        this.c = backchannelCreateChatFragment;
        this.d = user;
    }

    public final void onClick(View view) {
        BackchannelCreateChatFragment backchannelCreateChatFragment = this.c;
        User user = this.d;
        i.e(backchannelCreateChatFragment, "this$0");
        i.e(user, "$user");
        k<Object>[] kVarArr = BackchannelCreateChatFragment.Z1;
        backchannelCreateChatFragment.O0().p(new i(user));
    }
}
