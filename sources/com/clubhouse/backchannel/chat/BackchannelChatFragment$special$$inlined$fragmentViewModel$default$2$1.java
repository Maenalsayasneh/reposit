package com.clubhouse.backchannel.chat;

import com.clubhouse.backchannel.chat.BackchannelChatFragment;
import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: ViewModelDelegateProvider.kt */
public final class BackchannelChatFragment$special$$inlined$fragmentViewModel$default$2$1 extends Lambda implements a<String> {
    public final /* synthetic */ BackchannelChatFragment.c c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatFragment$special$$inlined$fragmentViewModel$default$2$1(BackchannelChatFragment.c cVar) {
        super(0);
        this.c = cVar;
    }

    public Object invoke() {
        String name = h.l1(this.c.c).getName();
        i.d(name, "viewModelClass.java.name");
        return name;
    }
}
