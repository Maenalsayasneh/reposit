package com.clubhouse.android.ui.profile;

import i0.e.b.g3.u.n4;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: HalfProfileContainerViewModel.kt */
public final class HalfProfileContainerViewModel$setExpanded$1 extends Lambda implements l<n4, n4> {
    public final /* synthetic */ boolean c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileContainerViewModel$setExpanded$1(boolean z) {
        super(1);
        this.c = z;
    }

    public Object invoke(Object obj) {
        n4 n4Var = (n4) obj;
        i.e(n4Var, "$this$setState");
        return n4.copy$default(n4Var, (HalfProfileArgs) null, this.c, 1, (Object) null);
    }
}
