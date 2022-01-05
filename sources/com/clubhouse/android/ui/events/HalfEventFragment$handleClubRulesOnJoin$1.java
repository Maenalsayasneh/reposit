package com.clubhouse.android.ui.events;

import com.clubhouse.android.core.ui.Banner;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.ui.events.HalfEventFragment;
import i0.e.b.g3.o.x;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfEventFragment.kt */
public final class HalfEventFragment$handleClubRulesOnJoin$1 extends Lambda implements l<Boolean, i> {
    public final /* synthetic */ HalfEventFragment c;
    public final /* synthetic */ Club d;
    public final /* synthetic */ Banner q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventFragment$handleClubRulesOnJoin$1(HalfEventFragment halfEventFragment, Club club, Banner banner) {
        super(1);
        this.c = halfEventFragment;
        this.d = club;
        this.q = banner;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            HalfEventFragment halfEventFragment = this.c;
            HalfEventFragment.b bVar = HalfEventFragment.p2;
            halfEventFragment.V0().p(new x(this.d.getId()));
            this.q.dismiss();
        }
        return i.a;
    }
}
