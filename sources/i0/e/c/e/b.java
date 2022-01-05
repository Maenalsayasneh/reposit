package i0.e.c.e;

import android.view.View;
import com.clubhouse.android.user.model.User;
import com.clubhouse.backchannel.create.BackchannelCreateChatFragment;
import i0.e.b.a3.d.a;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ BackchannelCreateChatFragment c;
    public final /* synthetic */ a d;

    public /* synthetic */ b(BackchannelCreateChatFragment backchannelCreateChatFragment, a aVar) {
        this.c = backchannelCreateChatFragment;
        this.d = aVar;
    }

    public final void onClick(View view) {
        BackchannelCreateChatFragment backchannelCreateChatFragment = this.c;
        a aVar = this.d;
        i.e(backchannelCreateChatFragment, "this$0");
        i.e(aVar, "$user");
        k<Object>[] kVarArr = BackchannelCreateChatFragment.Z1;
        backchannelCreateChatFragment.N0().g.setText((CharSequence) null);
        backchannelCreateChatFragment.O0().p(new i((User) aVar.a));
    }
}
