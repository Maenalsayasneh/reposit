package com.clubhouse.android.ui.clubs.invites;

import com.clubhouse.android.ui.clubs.invites.GrowClubFragment;
import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: ViewModelDelegateProvider.kt */
public final class GrowClubFragment$special$$inlined$fragmentViewModel$default$4$1 extends Lambda implements a<String> {
    public final /* synthetic */ GrowClubFragment.b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrowClubFragment$special$$inlined$fragmentViewModel$default$4$1(GrowClubFragment.b bVar) {
        super(0);
        this.c = bVar;
    }

    public Object invoke() {
        String name = h.l1(this.c.c).getName();
        i.d(name, "viewModelClass.java.name");
        return name;
    }
}
