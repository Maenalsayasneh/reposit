package com.clubhouse.backchannel.chat;

import com.clubhouse.backchannel.R;
import h0.b.a.d;
import i0.e.c.c.o;
import i0.e.c.c.p;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BackchannelChatFragment.kt */
public final class BackchannelChatFragment$promptForRetry$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ BackchannelChatFragment c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatFragment$promptForRetry$1(BackchannelChatFragment backchannelChatFragment, String str) {
        super(1);
        this.c = backchannelChatFragment;
        this.d = str;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.e(R.string.not_delivered);
        aVar.b(R.string.try_again_send_message);
        aVar.d(R.string.retry, new p(this.c, this.d));
        aVar.c(R.string.cancel, o.c);
        return i.a;
    }
}
