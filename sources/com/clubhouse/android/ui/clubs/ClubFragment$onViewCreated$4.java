package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.Topic;
import i0.e.b.g3.l.v2.y;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$onViewCreated$4 extends Lambda implements l<List<? extends Topic>, i> {
    public final /* synthetic */ ClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$onViewCreated$4(ClubFragment clubFragment) {
        super(1);
        this.c = clubFragment;
    }

    public Object invoke(Object obj) {
        List list = (List) obj;
        m0.n.b.i.e(list, "topics");
        this.c.T0().p(new y(list));
        return i.a;
    }
}
