package com.clubhouse.android.ui.hallway.feed;

import com.clubhouse.android.data.models.local.club.Club;
import i0.e.b.g3.p.c0.w;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.r.k;

/* compiled from: FeedFragment.kt */
public final class FeedFragment$buildModels$1$1$2$7$4$2 extends Lambda implements a<i> {
    public final /* synthetic */ FeedFragment c;
    public final /* synthetic */ Club d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedFragment$buildModels$1$1$2$7$4$2(FeedFragment feedFragment, Club club) {
        super(0);
        this.c = feedFragment;
        this.d = club;
    }

    public Object invoke() {
        FeedFragment feedFragment = this.c;
        k<Object>[] kVarArr = FeedFragment.Z1;
        FeedViewModel P0 = feedFragment.P0();
        Club club = this.d;
        m0.n.b.i.d(club, "club");
        P0.p(new w(club, (String) null, 2));
        return i.a;
    }
}
