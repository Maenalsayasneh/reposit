package com.clubhouse.android.ui.search;

import android.widget.TextView;
import com.clubhouse.app.R;
import com.google.android.material.tabs.TabLayout;
import i0.e.b.g3.w.y;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ExploreV2Fragment.kt */
public final class ExploreV2Fragment$invalidate$1 extends Lambda implements l<y, i> {
    public final /* synthetic */ ExploreV2Fragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreV2Fragment$invalidate$1(ExploreV2Fragment exploreV2Fragment) {
        super(1);
        this.c = exploreV2Fragment;
    }

    public Object invoke(Object obj) {
        y yVar = (y) obj;
        m0.n.b.i.e(yVar, "state");
        ExploreV2Fragment exploreV2Fragment = this.c;
        k<Object>[] kVarArr = ExploreV2Fragment.Z1;
        TabLayout tabLayout = exploreV2Fragment.O0().e;
        m0.n.b.i.d(tabLayout, "binding.resultTabs");
        boolean z = false;
        i0.e.b.d3.k.q(tabLayout, Boolean.valueOf(yVar.d.length() == 0));
        TextView textView = this.c.O0().b;
        if (yVar.d.length() == 0) {
            z = true;
        }
        textView.setText(z ? R.string.explore_v2_empty_state : R.string.focused_search_empty);
        Mode mode = yVar.c;
        if (mode == Mode.TOP) {
            TabLayout tabLayout2 = this.c.O0().e;
            TabLayout.g gVar = this.c.g2;
            if (gVar != null) {
                tabLayout2.l(gVar, true);
            } else {
                m0.n.b.i.m("topTab");
                throw null;
            }
        } else if (mode == Mode.PEOPLE) {
            TabLayout tabLayout3 = this.c.O0().e;
            TabLayout.g gVar2 = this.c.h2;
            if (gVar2 != null) {
                tabLayout3.l(gVar2, true);
            } else {
                m0.n.b.i.m("peopleTab");
                throw null;
            }
        } else if (mode == Mode.CLUBS) {
            TabLayout tabLayout4 = this.c.O0().e;
            TabLayout.g gVar3 = this.c.i2;
            if (gVar3 != null) {
                tabLayout4.l(gVar3, true);
            } else {
                m0.n.b.i.m("clubTab");
                throw null;
            }
        } else if (mode == Mode.ROOMS) {
            TabLayout tabLayout5 = this.c.O0().e;
            TabLayout.g gVar4 = this.c.j2;
            if (gVar4 != null) {
                tabLayout5.l(gVar4, true);
            } else {
                m0.n.b.i.m("roomTab");
                throw null;
            }
        } else if (mode == Mode.EVENTS) {
            TabLayout tabLayout6 = this.c.O0().e;
            TabLayout.g gVar5 = this.c.k2;
            if (gVar5 != null) {
                tabLayout6.l(gVar5, true);
            } else {
                m0.n.b.i.m("eventTab");
                throw null;
            }
        }
        return i.a;
    }
}
