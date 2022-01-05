package com.clubhouse.backchannel.members;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.c.i.o;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;

/* compiled from: BackchannelMembersViewModel.kt */
public final class BackchannelMembersViewModel$removeMember$2 extends Lambda implements p<i0.e.c.i.p, b<? extends i>, i0.e.c.i.p> {
    public final /* synthetic */ BackchannelMembersViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelMembersViewModel$removeMember$2(BackchannelMembersViewModel backchannelMembersViewModel) {
        super(2);
        this.c = backchannelMembersViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        i0.e.c.i.p pVar = (i0.e.c.i.p) obj;
        b bVar = (b) obj2;
        m0.n.b.i.e(pVar, "$this$execute");
        m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            this.c.o(o.a);
        }
        if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return i0.e.c.i.p.copy$default(pVar, (String) null, (b) null, bVar instanceof f, 3, (Object) null);
    }
}
