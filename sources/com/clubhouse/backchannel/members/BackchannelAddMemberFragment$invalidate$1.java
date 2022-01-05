package com.clubhouse.backchannel.members;

import android.widget.FrameLayout;
import i0.b.b.f;
import i0.e.c.i.p;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: BackchannelAddMemberFragment.kt */
public final class BackchannelAddMemberFragment$invalidate$1 extends Lambda implements l<p, i> {
    public final /* synthetic */ BackchannelAddMemberFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelAddMemberFragment$invalidate$1(BackchannelAddMemberFragment backchannelAddMemberFragment) {
        super(1);
        this.c = backchannelAddMemberFragment;
    }

    public Object invoke(Object obj) {
        p pVar = (p) obj;
        m0.n.b.i.e(pVar, "state");
        BackchannelAddMemberFragment backchannelAddMemberFragment = this.c;
        k<Object>[] kVarArr = BackchannelAddMemberFragment.p2;
        FrameLayout frameLayout = backchannelAddMemberFragment.U0().b;
        m0.n.b.i.d(frameLayout, "binding.loading");
        i0.e.b.d3.k.L(frameLayout, Boolean.valueOf(pVar.c || (pVar.b instanceof f)));
        this.c.U0().c.g();
        return i.a;
    }
}
