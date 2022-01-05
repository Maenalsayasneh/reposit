package com.clubhouse.backchannel.create;

import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import h0.b0.v;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;
import m0.r.k;

/* compiled from: BackchannelCreateChatFragment.kt */
public final class BackchannelCreateChatFragment$onViewCreated$5 extends Lambda implements p<Boolean, Integer, i> {
    public final /* synthetic */ BackchannelCreateChatFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelCreateChatFragment$onViewCreated$5(BackchannelCreateChatFragment backchannelCreateChatFragment) {
        super(2);
        this.c = backchannelCreateChatFragment;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        BackchannelCreateChatFragment backchannelCreateChatFragment = this.c;
        k<Object>[] kVarArr = BackchannelCreateChatFragment.Z1;
        FloatingActionButton floatingActionButton = backchannelCreateChatFragment.N0().c;
        m0.n.b.i.d(floatingActionButton, "binding.create");
        i0.e.b.d3.k.G(floatingActionButton, intValue);
        EpoxyRecyclerView epoxyRecyclerView = this.c.N0().f;
        m0.n.b.i.d(epoxyRecyclerView, "binding.results");
        v.W1(epoxyRecyclerView, intValue);
        return i.a;
    }
}
