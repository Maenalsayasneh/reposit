package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.club.ClubRule;
import i0.e.b.g3.l.u2;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$onViewCreated$6 extends Lambda implements l<List<? extends ClubRule>, i> {
    public final /* synthetic */ ClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$onViewCreated$6(ClubFragment clubFragment) {
        super(1);
        this.c = clubFragment;
    }

    public Object invoke(Object obj) {
        List list = (List) obj;
        m0.n.b.i.e(list, "rules");
        this.c.T0().p(new u2(list));
        return i.a;
    }
}
