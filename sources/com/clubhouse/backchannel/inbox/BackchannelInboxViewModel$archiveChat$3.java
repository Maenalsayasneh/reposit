package com.clubhouse.backchannel.inbox;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.e.b.a3.b.d;
import i0.e.c.h.k;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;

/* compiled from: BackchannelInboxViewModel.kt */
public final class BackchannelInboxViewModel$archiveChat$3 extends Lambda implements p<k, b<? extends i>, k> {
    public final /* synthetic */ BackchannelInboxViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelInboxViewModel$archiveChat$3(BackchannelInboxViewModel backchannelInboxViewModel) {
        super(2);
        this.c = backchannelInboxViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        k kVar = (k) obj;
        b bVar = (b) obj2;
        m0.n.b.i.e(kVar, "$this$execute");
        m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return kVar;
    }
}
