package com.clubhouse.android.ui.clubs.invites;

import h0.a.b;
import h0.b0.v;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: GrowClubFragment.kt */
public final class GrowClubFragment$onViewCreated$1 extends Lambda implements l<b, i> {
    public final /* synthetic */ GrowClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrowClubFragment$onViewCreated$1(GrowClubFragment growClubFragment) {
        super(1);
        this.c = growClubFragment;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((b) obj, "$this$addCallback");
        GrowClubFragment growClubFragment = this.c;
        k<Object>[] kVarArr = GrowClubFragment.Z1;
        v.v2(growClubFragment.R0(), new GrowClubFragment$handleBackNavigation$1(growClubFragment));
        return i.a;
    }
}
