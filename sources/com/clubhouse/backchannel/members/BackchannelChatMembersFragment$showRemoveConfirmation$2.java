package com.clubhouse.backchannel.members;

import com.clubhouse.backchannel.R;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import h0.b.a.d;
import i0.e.c.i.j;
import i0.e.c.i.k;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BackchannelChatMembersFragment.kt */
public final class BackchannelChatMembersFragment$showRemoveConfirmation$2 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ BackchannelChatMembersFragment c;
    public final /* synthetic */ ChatMember d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatMembersFragment$showRemoveConfirmation$2(BackchannelChatMembersFragment backchannelChatMembersFragment, ChatMember chatMember) {
        super(1);
        this.c = backchannelChatMembersFragment;
        this.d = chatMember;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.a.d = this.c.getString(R.string.confirm_remove_user, this.d.Y1);
        aVar.c(R.string.cancel, j.c);
        aVar.d(R.string.remove, new k(this.c, this.d));
        return i.a;
    }
}
