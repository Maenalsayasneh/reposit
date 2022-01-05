package com.clubhouse.backchannel.chat;

import com.clubhouse.android.user.model.User;
import com.clubhouse.backchannel.R;
import h0.b.a.d;
import i0.e.c.c.q;
import i0.e.c.c.r;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BackchannelChatFragment.kt */
public final class BackchannelChatFragment$showBlockDialog$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ BackchannelChatFragment c;
    public final /* synthetic */ User d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatFragment$showBlockDialog$1(BackchannelChatFragment backchannelChatFragment, User user) {
        super(1);
        this.c = backchannelChatFragment;
        this.d = user;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.a.d = this.c.getString(R.string.block_confirmation_title, this.d.getName());
        aVar.b(R.string.block_confirmation_body);
        aVar.d(R.string.block, new r(this.c, this.d));
        aVar.c(R.string.cancel, q.c);
        return i.a;
    }
}
