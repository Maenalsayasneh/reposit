package com.clubhouse.backchannel.chat;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.c.c.y;
import i0.e.c.f.b.a.a;
import i0.e.c.f.b.a.j;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: BackchannelChatViewModel.kt */
public final class BackchannelChatViewModel$loadChat$2 extends Lambda implements p<y, b<? extends a>, y> {
    public final /* synthetic */ BackchannelChatViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatViewModel$loadChat$2(BackchannelChatViewModel backchannelChatViewModel) {
        super(2);
        this.c = backchannelChatViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        b bVar = (b) obj2;
        i.e(yVar, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            BackchannelChatViewModel backchannelChatViewModel = this.c;
            backchannelChatViewModel.o.n(backchannelChatViewModel.n.a, new j((Integer) null, (Integer) null, 3));
        }
        if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return yVar;
    }
}
