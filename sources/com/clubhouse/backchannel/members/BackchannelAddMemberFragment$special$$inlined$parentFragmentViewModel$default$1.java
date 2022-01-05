package com.clubhouse.backchannel.members;

import androidx.fragment.app.Fragment;
import com.airbnb.mvrx.ViewModelDoesNotExistException;
import h0.b0.v;
import h0.q.o0;
import i0.b.b.k;
import i0.b.b.x;
import i0.d.a.a.a;
import i0.e.c.i.p;
import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.d;

/* compiled from: MavericksExtensions.kt */
public final class BackchannelAddMemberFragment$special$$inlined$parentFragmentViewModel$default$1 extends Lambda implements l<k<BackchannelMembersViewModel, p>, BackchannelMembersViewModel> {
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ d d;
    public final /* synthetic */ d q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelAddMemberFragment$special$$inlined$parentFragmentViewModel$default$1(Fragment fragment, d dVar, d dVar2) {
        super(1);
        this.c = fragment;
        this.d = dVar;
        this.q = dVar2;
    }

    public Object invoke(Object obj) {
        k kVar = (k) obj;
        i.e(kVar, "stateFactory");
        if (this.c.getParentFragment() != null) {
            Fragment parentFragment = this.c.getParentFragment();
            String G0 = a.G0(this.q, "viewModelClass.java.name");
            while (parentFragment != null) {
                try {
                    x xVar = x.a;
                    Class l1 = h.l1(this.d);
                    h0.o.a.k requireActivity = this.c.requireActivity();
                    i.d(requireActivity, "this.requireActivity()");
                    return x.a(xVar, l1, p.class, new i0.b.b.d(requireActivity, v.a(this.c), parentFragment, (o0) null, (h0.x.a) null, 24), G0, true, (k) null, 32);
                } catch (ViewModelDoesNotExistException unused) {
                    parentFragment = parentFragment.getParentFragment();
                }
            }
            Fragment parentFragment2 = this.c.getParentFragment();
            while (true) {
                if ((parentFragment2 != null ? parentFragment2.getParentFragment() : null) != null) {
                    parentFragment2 = parentFragment2.getParentFragment();
                } else {
                    h0.o.a.k requireActivity2 = this.c.requireActivity();
                    i.d(requireActivity2, "requireActivity()");
                    Object a = v.a(this.c);
                    i.c(parentFragment2);
                    return x.a(x.a, h.l1(this.d), p.class, new i0.b.b.d(requireActivity2, a, parentFragment2, (o0) null, (h0.x.a) null, 24), a.G0(this.q, "viewModelClass.java.name"), false, kVar, 16);
                }
            }
        } else {
            StringBuilder P0 = a.P0("There is no parent fragment for ");
            a.k(this.c, P0, " so view model ");
            throw new ViewModelDoesNotExistException(a.H0(this.d, P0, " could not be found."));
        }
    }
}
