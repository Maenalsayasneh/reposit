package com.clubhouse.backchannel.inbox;

import com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f;
import i0.e.b.a3.b.d;
import i0.e.c.h.k;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;

/* compiled from: BackchannelInboxViewModel.kt */
public final class BackchannelInboxViewModel$refresh$2 extends Lambda implements p<k, b<? extends i>, k> {
    public final /* synthetic */ BackchannelInboxViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelInboxViewModel$refresh$2(BackchannelInboxViewModel backchannelInboxViewModel) {
        super(2);
        this.c = backchannelInboxViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        k kVar = (k) obj;
        b bVar = (b) obj2;
        m0.n.b.i.e(kVar, "$this$execute");
        m0.n.b.i.e(bVar, "it");
        boolean z = bVar instanceof c;
        if (z) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return k.copy$default(kVar, (List) null, (List) null, bVar instanceof f, z, false, false, (ChatDestination) null, 115, (Object) null);
    }
}
