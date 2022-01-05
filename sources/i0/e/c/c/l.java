package i0.e.c.c;

import android.view.View;
import com.clubhouse.backchannel.chat.BackchannelChatFragment;
import com.clubhouse.backchannel.chat.BackchannelChatFragment$showBlockDialog$1;
import com.clubhouse.core.ui.R;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import h0.b.a.d;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class l implements View.OnClickListener {
    public final /* synthetic */ BackchannelChatFragment c;
    public final /* synthetic */ ChatMember d;

    public /* synthetic */ l(BackchannelChatFragment backchannelChatFragment, ChatMember chatMember) {
        this.c = backchannelChatFragment;
        this.d = chatMember;
    }

    public final void onClick(View view) {
        BackchannelChatFragment backchannelChatFragment = this.c;
        ChatMember chatMember = this.d;
        i.e(backchannelChatFragment, "this$0");
        i.e(chatMember, "$user");
        k<Object>[] kVarArr = BackchannelChatFragment.Z1;
        BackchannelChatFragment$showBlockDialog$1 backchannelChatFragment$showBlockDialog$1 = new BackchannelChatFragment$showBlockDialog$1(backchannelChatFragment, chatMember);
        i.e(backchannelChatFragment, "<this>");
        i.e(backchannelChatFragment$showBlockDialog$1, "f");
        d.a aVar = new d.a(backchannelChatFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
        backchannelChatFragment$showBlockDialog$1.invoke(aVar);
        aVar.g();
    }
}
