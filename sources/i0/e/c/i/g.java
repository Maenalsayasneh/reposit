package i0.e.c.i;

import android.view.View;
import com.clubhouse.backchannel.members.BackchannelChatMembersFragment;
import com.clubhouse.backchannel.members.BackchannelChatMembersFragment$showRemoveConfirmation$1;
import com.clubhouse.backchannel.members.BackchannelChatMembersFragment$showRemoveConfirmation$2;
import com.clubhouse.core.ui.R;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import h0.b.a.d;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ BackchannelChatMembersFragment c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ChatMember q;

    public /* synthetic */ g(BackchannelChatMembersFragment backchannelChatMembersFragment, boolean z, ChatMember chatMember) {
        this.c = backchannelChatMembersFragment;
        this.d = z;
        this.q = chatMember;
    }

    public final void onClick(View view) {
        BackchannelChatMembersFragment backchannelChatMembersFragment = this.c;
        boolean z = this.d;
        ChatMember chatMember = this.q;
        i.e(backchannelChatMembersFragment, "this$0");
        i.e(chatMember, "$member");
        k<Object>[] kVarArr = BackchannelChatMembersFragment.p2;
        if (z) {
            BackchannelChatMembersFragment$showRemoveConfirmation$1 backchannelChatMembersFragment$showRemoveConfirmation$1 = new BackchannelChatMembersFragment$showRemoveConfirmation$1(backchannelChatMembersFragment, chatMember);
            i.e(backchannelChatMembersFragment, "<this>");
            i.e(backchannelChatMembersFragment$showRemoveConfirmation$1, "f");
            d.a aVar = new d.a(backchannelChatMembersFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            backchannelChatMembersFragment$showRemoveConfirmation$1.invoke(aVar);
            aVar.g();
            return;
        }
        BackchannelChatMembersFragment$showRemoveConfirmation$2 backchannelChatMembersFragment$showRemoveConfirmation$2 = new BackchannelChatMembersFragment$showRemoveConfirmation$2(backchannelChatMembersFragment, chatMember);
        i.e(backchannelChatMembersFragment, "<this>");
        i.e(backchannelChatMembersFragment$showRemoveConfirmation$2, "f");
        d.a aVar2 = new d.a(backchannelChatMembersFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
        backchannelChatMembersFragment$showRemoveConfirmation$2.invoke(aVar2);
        aVar2.g();
    }
}
