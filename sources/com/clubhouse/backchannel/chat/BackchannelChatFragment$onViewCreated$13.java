package com.clubhouse.backchannel.chat;

import androidx.core.app.NotificationManagerCompat;
import i0.e.c.c.y;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BackchannelChatFragment.kt */
public final class BackchannelChatFragment$onViewCreated$13 extends Lambda implements l<y, i> {
    public final /* synthetic */ BackchannelChatFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatFragment$onViewCreated$13(BackchannelChatFragment backchannelChatFragment) {
        super(1);
        this.c = backchannelChatFragment;
    }

    public Object invoke(Object obj) {
        y yVar = (y) obj;
        m0.n.b.i.e(yVar, "state");
        NotificationManagerCompat.from(this.c.requireContext()).cancel(yVar.a, 6534);
        return i.a;
    }
}
