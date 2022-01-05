package com.clubhouse.android.ui.clubs.create.topics;

import h0.b0.v;
import i0.e.b.g3.l.v2.z.d;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubTopicsFragment.kt */
public final class ClubTopicsFragment$handleBackNavigation$1 extends Lambda implements l<d, i> {
    public final /* synthetic */ ClubTopicsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubTopicsFragment$handleBackNavigation$1(ClubTopicsFragment clubTopicsFragment) {
        super(1);
        this.c = clubTopicsFragment;
    }

    public Object invoke(Object obj) {
        d dVar = (d) obj;
        m0.n.b.i.e(dVar, "it");
        v.V1(this.c, "selected_topics_result", dVar.c);
        v.c1(this.c);
        return i.a;
    }
}
