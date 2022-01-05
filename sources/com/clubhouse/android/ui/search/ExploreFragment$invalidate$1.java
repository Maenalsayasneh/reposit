package com.clubhouse.android.ui.search;

import android.widget.Button;
import com.google.android.material.tabs.TabLayout;
import h0.q.p;
import h0.q.q;
import h0.u.w;
import i0.e.b.b3.b.e.j;
import i0.e.b.g3.w.z;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.k;
import m0.r.t.a.r.m.a1.a;
import n0.a.f1;

/* compiled from: ExploreFragment.kt */
public final class ExploreFragment$invalidate$1 extends Lambda implements l<z, f1> {
    public final /* synthetic */ ExploreFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreFragment$invalidate$1(ExploreFragment exploreFragment) {
        super(1);
        this.c = exploreFragment;
    }

    public Object invoke(Object obj) {
        z zVar = (z) obj;
        i.e(zVar, "state");
        ExploreFragment exploreFragment = this.c;
        k<Object>[] kVarArr = ExploreFragment.Z1;
        TabLayout tabLayout = exploreFragment.N0().g;
        i.d(tabLayout, "binding.resultTabs");
        Mode mode = zVar.b;
        Mode mode2 = Mode.SUGGESTED;
        boolean z = false;
        i0.e.b.d3.k.q(tabLayout, Boolean.valueOf(mode == mode2));
        Button button = this.c.N0().c;
        i.d(button, "binding.cancel");
        if (zVar.b == mode2) {
            z = true;
        }
        i0.e.b.d3.k.q(button, Boolean.valueOf(z));
        this.c.N0().d.setText(this.c.getString(zVar.b.getEmptyText()));
        Mode mode3 = zVar.b;
        if (mode3 == Mode.CLUBS) {
            TabLayout tabLayout2 = this.c.N0().g;
            TabLayout.g gVar = this.c.f2;
            if (gVar != null) {
                tabLayout2.l(gVar, true);
            } else {
                i.m("clubTab");
                throw null;
            }
        } else if (mode3 == Mode.PEOPLE) {
            TabLayout tabLayout3 = this.c.N0().g;
            TabLayout.g gVar2 = this.c.e2;
            if (gVar2 != null) {
                tabLayout3.l(gVar2, true);
            } else {
                i.m("peopleTab");
                throw null;
            }
        }
        w<j> wVar = zVar.a;
        if (wVar == null) {
            return null;
        }
        ExploreFragment exploreFragment2 = this.c;
        p viewLifecycleOwner = exploreFragment2.getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        return a.E2(q.a(viewLifecycleOwner), (e) null, (CoroutineStart) null, new ExploreFragment$invalidate$1$1$1(zVar, exploreFragment2, wVar, (c<? super ExploreFragment$invalidate$1$1$1>) null), 3, (Object) null);
    }
}
