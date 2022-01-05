package com.clubhouse.backchannel.chat;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.c.c.a0;
import i0.e.c.c.y;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: BackchannelChatViewModel.kt */
public final class BackchannelChatViewModel$blockUser$2 extends Lambda implements p<y, b<? extends EmptySuccessResponse>, y> {
    public final /* synthetic */ BackchannelChatViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatViewModel$blockUser$2(BackchannelChatViewModel backchannelChatViewModel) {
        super(2);
        this.c = backchannelChatViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        b bVar = (b) obj2;
        i.e(yVar, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            this.c.o(a0.a);
        }
        if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return yVar;
    }
}
