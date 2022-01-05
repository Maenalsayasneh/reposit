package com.clubhouse.android.ui.profile;

import com.clubhouse.android.ui.profile.HalfProfileFragment;
import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: ViewModelDelegateProvider.kt */
public final class HalfProfileFragment$special$$inlined$parentFragmentViewModel$default$4$1 extends Lambda implements a<String> {
    public final /* synthetic */ HalfProfileFragment.e c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$special$$inlined$parentFragmentViewModel$default$4$1(HalfProfileFragment.e eVar) {
        super(0);
        this.c = eVar;
    }

    public Object invoke() {
        String name = h.l1(this.c.c).getName();
        i.d(name, "viewModelClass.java.name");
        return name;
    }
}
