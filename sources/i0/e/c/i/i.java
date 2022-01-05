package i0.e.c.i;

import android.content.DialogInterface;
import com.clubhouse.backchannel.members.BackchannelChatMembersFragment;
import com.clubhouse.backchannel.members.BackchannelMembersViewModel;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;

/* compiled from: lambda */
public final /* synthetic */ class i implements DialogInterface.OnClickListener {
    public final /* synthetic */ BackchannelChatMembersFragment c;
    public final /* synthetic */ ChatMember d;

    public /* synthetic */ i(BackchannelChatMembersFragment backchannelChatMembersFragment, ChatMember chatMember) {
        this.c = backchannelChatMembersFragment;
        this.d = chatMember;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BackchannelChatMembersFragment backchannelChatMembersFragment = this.c;
        ChatMember chatMember = this.d;
        m0.n.b.i.e(backchannelChatMembersFragment, "this$0");
        m0.n.b.i.e(chatMember, "$member");
        ((BackchannelMembersViewModel) backchannelChatMembersFragment.q2.getValue()).p(new q(chatMember.getId().intValue()));
    }
}
