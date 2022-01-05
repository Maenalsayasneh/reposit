package com.clubhouse.backchannel.archive;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.e.b.a3.b.d;
import i0.e.c.b.f;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;

/* compiled from: BackchannelArchiveViewModel.kt */
public final class BackchannelArchiveViewModel$unarchiveChat$3 extends Lambda implements p<f, b<? extends i>, f> {
    public final /* synthetic */ BackchannelArchiveViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelArchiveViewModel$unarchiveChat$3(BackchannelArchiveViewModel backchannelArchiveViewModel) {
        super(2);
        this.c = backchannelArchiveViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        f fVar = (f) obj;
        b bVar = (b) obj2;
        m0.n.b.i.e(fVar, "$this$execute");
        m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return fVar;
    }
}
