package com.clubhouse.android.ui.profile;

import com.clubhouse.android.ui.profile.ProfileFragment;
import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: ViewModelDelegateProvider.kt */
public final class ProfileFragment$special$$inlined$parentFragmentViewModel$default$2$1 extends Lambda implements a<String> {
    public final /* synthetic */ ProfileFragment.c c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$special$$inlined$parentFragmentViewModel$default$2$1(ProfileFragment.c cVar) {
        super(0);
        this.c = cVar;
    }

    public Object invoke() {
        String name = h.l1(this.c.c).getName();
        i.d(name, "viewModelClass.java.name");
        return name;
    }
}
