package com.clubhouse.android.ui.clubs.create.topics;

import h0.a.b;
import h0.b0.v;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ClubTopicsFragment.kt */
public final class ClubTopicsFragment$onViewCreated$1 extends Lambda implements l<b, i> {
    public final /* synthetic */ ClubTopicsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubTopicsFragment$onViewCreated$1(ClubTopicsFragment clubTopicsFragment) {
        super(1);
        this.c = clubTopicsFragment;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((b) obj, "$this$addCallback");
        ClubTopicsFragment clubTopicsFragment = this.c;
        k<Object>[] kVarArr = ClubTopicsFragment.Z1;
        v.v2(clubTopicsFragment.O0(), new ClubTopicsFragment$handleBackNavigation$1(clubTopicsFragment));
        return i.a;
    }
}
