package com.clubhouse.android.ui.search;

import com.google.android.material.tabs.TabLayout;
import i0.e.b.g3.w.f0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ExploreFragment.kt */
public final class ExploreFragment$onViewCreated$4 extends Lambda implements l<TabLayout.g, i> {
    public final /* synthetic */ ExploreFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreFragment$onViewCreated$4(ExploreFragment exploreFragment) {
        super(1);
        this.c = exploreFragment;
    }

    public Object invoke(Object obj) {
        TabLayout.g gVar = (TabLayout.g) obj;
        boolean z = true;
        if (gVar != null && gVar.d == 0) {
            ExploreFragment exploreFragment = this.c;
            k<Object>[] kVarArr = ExploreFragment.Z1;
            exploreFragment.O0().p(new f0(Mode.PEOPLE));
        } else {
            if (gVar == null || gVar.d != 1) {
                z = false;
            }
            if (z) {
                ExploreFragment exploreFragment2 = this.c;
                k<Object>[] kVarArr2 = ExploreFragment.Z1;
                exploreFragment2.O0().p(new f0(Mode.CLUBS));
            }
        }
        return i.a;
    }
}
