package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.android.ui.profile.settings.DeactivateFragment;
import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: ViewModelDelegateProvider.kt */
public final class DeactivateFragment$special$$inlined$fragmentViewModel$default$2$1 extends Lambda implements a<String> {
    public final /* synthetic */ DeactivateFragment.a c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeactivateFragment$special$$inlined$fragmentViewModel$default$2$1(DeactivateFragment.a aVar) {
        super(0);
        this.c = aVar;
    }

    public Object invoke() {
        String name = h.l1(this.c.c).getName();
        i.d(name, "viewModelClass.java.name");
        return name;
    }
}
