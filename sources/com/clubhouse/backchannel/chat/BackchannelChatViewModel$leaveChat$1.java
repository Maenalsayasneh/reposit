package com.clubhouse.backchannel.chat;

import com.airbnb.mvrx.MavericksViewModel;
import i0.e.c.c.y;
import i0.e.c.f.b.a.a;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.r.m;
import n0.a.d0;

/* compiled from: BackchannelChatViewModel.kt */
public final class BackchannelChatViewModel$leaveChat$1 extends Lambda implements l<y, i> {
    public final /* synthetic */ BackchannelChatViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatViewModel$leaveChat$1(BackchannelChatViewModel backchannelChatViewModel) {
        super(1);
        this.c = backchannelChatViewModel;
    }

    public Object invoke(Object obj) {
        y yVar = (y) obj;
        m0.n.b.i.e(yVar, "state");
        a aVar = yVar.b;
        if (aVar != null) {
            BackchannelChatViewModel backchannelChatViewModel = this.c;
            MavericksViewModel.f(backchannelChatViewModel, new BackchannelChatViewModel$leaveChat$1$1$1(backchannelChatViewModel, aVar, (c<? super BackchannelChatViewModel$leaveChat$1$1$1>) null), (d0) null, (m) null, new BackchannelChatViewModel$leaveChat$1$1$2(backchannelChatViewModel), 3, (Object) null);
        }
        return i.a;
    }
}
