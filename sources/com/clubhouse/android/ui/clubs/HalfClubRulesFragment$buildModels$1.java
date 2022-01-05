package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.club.ClubRule;
import com.clubhouse.android.ui.clubs.HalfClubRulesFragment;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.g3.l.a2;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfClubRulesFragment.kt */
public final class HalfClubRulesFragment$buildModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ HalfClubRulesFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfClubRulesFragment$buildModels$1(HalfClubRulesFragment halfClubRulesFragment) {
        super(1);
        this.c = halfClubRulesFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        HalfClubRulesFragment halfClubRulesFragment = this.c;
        HalfClubRulesFragment.a aVar = HalfClubRulesFragment.p2;
        v.v2(halfClubRulesFragment.W0(), new l<a2, i>() {
            public Object invoke(Object obj) {
                a2 a2Var = (a2) obj;
                m0.n.b.i.e(a2Var, "state");
                List<ClubRule> list = a2Var.d;
                o oVar = o.this;
                for (ClubRule clubRule : list) {
                    i0.e.b.g3.l.c3.v vVar = new i0.e.b.g3.l.c3.v();
                    vVar.M(clubRule.c);
                    vVar.N(clubRule.c);
                    vVar.L(clubRule.d);
                    oVar.add(vVar);
                }
                return i.a;
            }
        });
        return i.a;
    }
}
