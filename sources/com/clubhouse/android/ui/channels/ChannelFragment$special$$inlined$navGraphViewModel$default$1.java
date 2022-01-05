package com.clubhouse.android.ui.channels;

import androidx.fragment.app.Fragment;
import com.clubhouse.android.ui.NavigationViewModel;
import h0.b0.v;
import h0.t.f;
import h0.x.a;
import i0.b.b.k;
import i0.b.b.x;
import i0.e.b.g3.h;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;
import m0.r.d;

/* compiled from: MavericksExtensions.kt */
public final class ChannelFragment$special$$inlined$navGraphViewModel$default$1 extends Lambda implements p<k<NavigationViewModel, h>, f, NavigationViewModel> {
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ d d;
    public final /* synthetic */ d q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$special$$inlined$navGraphViewModel$default$1(Fragment fragment, d dVar, d dVar2) {
        super(2);
        this.c = fragment;
        this.d = dVar;
        this.q = dVar2;
    }

    public Object invoke(Object obj, Object obj2) {
        k kVar = (k) obj;
        f fVar = (f) obj2;
        i.e(kVar, "stateFactory");
        i.e(fVar, "backStackEntry");
        x xVar = x.a;
        Class l1 = i0.j.f.p.h.l1(this.d);
        h0.o.a.k requireActivity = this.c.requireActivity();
        i.d(requireActivity, "requireActivity()");
        Object a = v.a(this.c);
        Fragment fragment = this.c;
        a aVar = fVar.y.b;
        i.d(aVar, "backStackEntry.savedStateRegistry");
        i0.b.b.d dVar = new i0.b.b.d(requireActivity, a, fragment, fVar, aVar);
        String name = i0.j.f.p.h.l1(this.q).getName();
        i.d(name, "viewModelClass.java.name");
        return x.a(xVar, l1, h.class, dVar, name, false, kVar, 16);
    }
}
