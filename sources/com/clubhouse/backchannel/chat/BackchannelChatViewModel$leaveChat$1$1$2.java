package com.clubhouse.backchannel.chat;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.c.c.a0;
import i0.e.c.c.y;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;

/* compiled from: BackchannelChatViewModel.kt */
public final class BackchannelChatViewModel$leaveChat$1$1$2 extends Lambda implements p<y, b<? extends i>, y> {
    public final /* synthetic */ BackchannelChatViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatViewModel$leaveChat$1$1$2(BackchannelChatViewModel backchannelChatViewModel) {
        super(2);
        this.c = backchannelChatViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        b bVar = (b) obj2;
        m0.n.b.i.e(yVar, "$this$execute");
        m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            BackchannelChatViewModel backchannelChatViewModel = this.c;
            a0 a0Var = a0.a;
            int i = BackchannelChatViewModel.m;
            backchannelChatViewModel.o(a0Var);
        }
        if (bVar instanceof c) {
            BackchannelChatViewModel backchannelChatViewModel2 = this.c;
            d dVar = new d(((c) bVar).b.getMessage());
            int i2 = BackchannelChatViewModel.m;
            backchannelChatViewModel2.o(dVar);
        }
        return yVar;
    }
}
