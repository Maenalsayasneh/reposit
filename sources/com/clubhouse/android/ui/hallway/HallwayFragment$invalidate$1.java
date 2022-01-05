package com.clubhouse.android.ui.hallway;

import android.widget.FrameLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.UserSelf;
import h0.b0.v;
import i0.e.b.g3.p.d;
import i0.e.b.g3.p.e;
import i0.e.b.g3.p.r;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: HallwayFragment.kt */
public final class HallwayFragment$invalidate$1 extends Lambda implements l<r, i> {
    public final /* synthetic */ HallwayFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HallwayFragment$invalidate$1(HallwayFragment hallwayFragment) {
        super(1);
        this.c = hallwayFragment;
    }

    public Object invoke(Object obj) {
        r rVar = (r) obj;
        m0.n.b.i.e(rVar, "state");
        HallwayFragment hallwayFragment = this.c;
        k<Object>[] kVarArr = HallwayFragment.Z1;
        v.v2(hallwayFragment.P0(), new HallwayFragment$setNotificationBadge$1(hallwayFragment));
        FrameLayout frameLayout = this.c.N0().d;
        m0.n.b.i.d(frameLayout, "binding.loading");
        i0.e.b.d3.k.L(frameLayout, Boolean.valueOf(rVar.b));
        UserSelf a = rVar.d.a();
        if (a == null) {
            return null;
        }
        HallwayFragment hallwayFragment2 = this.c;
        AvatarView avatarView = hallwayFragment2.N0().e;
        m0.n.b.i.d(avatarView, "binding.me");
        v.S0(avatarView, a.d, a.b, 0.0f, 4);
        hallwayFragment2.N0().e.setOnClickListener(new d(hallwayFragment2, a));
        hallwayFragment2.N0().e.setOnLongClickListener(new e(hallwayFragment2));
        return i.a;
    }
}
