package com.clubhouse.android.ui.search;

import com.google.android.material.tabs.TabLayout;
import i0.e.b.g3.w.f0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ExploreV2Fragment.kt */
public final class ExploreV2Fragment$onViewCreated$6 extends Lambda implements l<TabLayout.g, i> {
    public final /* synthetic */ ExploreV2Fragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreV2Fragment$onViewCreated$6(ExploreV2Fragment exploreV2Fragment) {
        super(1);
        this.c = exploreV2Fragment;
    }

    public Object invoke(Object obj) {
        TabLayout.g gVar = (TabLayout.g) obj;
        boolean z = true;
        if (gVar != null && gVar.d == 0) {
            ExploreV2Fragment exploreV2Fragment = this.c;
            k<Object>[] kVarArr = ExploreV2Fragment.Z1;
            exploreV2Fragment.P0().p(new f0(Mode.TOP));
        } else {
            if (gVar != null && gVar.d == 1) {
                ExploreV2Fragment exploreV2Fragment2 = this.c;
                k<Object>[] kVarArr2 = ExploreV2Fragment.Z1;
                exploreV2Fragment2.P0().p(new f0(Mode.PEOPLE));
            } else {
                if (gVar != null && gVar.d == 2) {
                    ExploreV2Fragment exploreV2Fragment3 = this.c;
                    k<Object>[] kVarArr3 = ExploreV2Fragment.Z1;
                    exploreV2Fragment3.P0().p(new f0(Mode.CLUBS));
                } else {
                    if (gVar != null && gVar.d == 3) {
                        ExploreV2Fragment exploreV2Fragment4 = this.c;
                        k<Object>[] kVarArr4 = ExploreV2Fragment.Z1;
                        exploreV2Fragment4.P0().p(new f0(Mode.ROOMS));
                    } else {
                        if (gVar == null || gVar.d != 4) {
                            z = false;
                        }
                        if (z) {
                            ExploreV2Fragment exploreV2Fragment5 = this.c;
                            k<Object>[] kVarArr5 = ExploreV2Fragment.Z1;
                            exploreV2Fragment5.P0().p(new f0(Mode.EVENTS));
                        }
                    }
                }
            }
        }
        return i.a;
    }
}
