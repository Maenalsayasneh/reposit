package com.clubhouse.backchannel.inbox;

import i0.e.c.f.b.a.a;
import i0.e.c.h.k;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BackchannelInboxFragment.kt */
public final class BackchannelInboxFragment$onViewCreated$1$buildModels$1 extends Lambda implements l<k, i> {
    public final /* synthetic */ BackchannelInboxFragment c;
    public final /* synthetic */ BackchannelInboxFragment$onViewCreated$1 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelInboxFragment$onViewCreated$1$buildModels$1(BackchannelInboxFragment backchannelInboxFragment, BackchannelInboxFragment$onViewCreated$1 backchannelInboxFragment$onViewCreated$1) {
        super(1);
        this.c = backchannelInboxFragment;
        this.d = backchannelInboxFragment$onViewCreated$1;
    }

    public Object invoke(Object obj) {
        k kVar = (k) obj;
        m0.n.b.i.e(kVar, "state");
        List<a> list = kVar.a;
        BackchannelInboxFragment backchannelInboxFragment = this.c;
        BackchannelInboxFragment$onViewCreated$1 backchannelInboxFragment$onViewCreated$1 = this.d;
        for (a N0 : list) {
            BackchannelInboxFragment.N0(backchannelInboxFragment, backchannelInboxFragment$onViewCreated$1, N0);
        }
        return i.a;
    }
}
