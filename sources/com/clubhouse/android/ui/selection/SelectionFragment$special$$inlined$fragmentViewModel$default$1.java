package com.clubhouse.android.ui.selection;

import androidx.fragment.app.Fragment;
import h0.b0.v;
import h0.q.o0;
import h0.x.a;
import i0.b.b.k;
import i0.b.b.x;
import i0.e.b.g3.x.f;
import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.d;

/* compiled from: MavericksExtensions.kt */
public final class SelectionFragment$special$$inlined$fragmentViewModel$default$1 extends Lambda implements l<k<SelectionViewModel, f>, SelectionViewModel> {
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ d d;
    public final /* synthetic */ d q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionFragment$special$$inlined$fragmentViewModel$default$1(Fragment fragment, d dVar, d dVar2) {
        super(1);
        this.c = fragment;
        this.d = dVar;
        this.q = dVar2;
    }

    public Object invoke(Object obj) {
        k kVar = (k) obj;
        i.e(kVar, "stateFactory");
        h0.o.a.k requireActivity = this.c.requireActivity();
        i.d(requireActivity, "requireActivity()");
        i0.b.b.d dVar = new i0.b.b.d(requireActivity, v.a(this.c), this.c, (o0) null, (a) null, 24);
        String name = h.l1(this.q).getName();
        i.d(name, "viewModelClass.java.name");
        return x.a(x.a, h.l1(this.d), f.class, dVar, name, false, kVar, 16);
    }
}
