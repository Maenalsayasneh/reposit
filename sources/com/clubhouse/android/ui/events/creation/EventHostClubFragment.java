package com.clubhouse.android.ui.events.creation;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.databinding.FragmentHostClubBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.o.w0.s;
import i0.e.b.g3.o.w0.w;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/clubhouse/android/ui/events/creation/EventHostClubFragment;", "Lcom/clubhouse/android/core/ui/BaseExpandedBottomSheetFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/databinding/FragmentHostClubBinding;", "q2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "U0", "()Lcom/clubhouse/android/databinding/FragmentHostClubBinding;", "binding", "Lcom/clubhouse/android/ui/events/creation/AddEditEventViewModel;", "r2", "Lm0/c;", "V0", "()Lcom/clubhouse/android/ui/events/creation/AddEditEventViewModel;", "viewModel", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: EventHostClubFragment.kt */
public final class EventHostClubFragment extends Hilt_EventHostClubFragment {
    public static final /* synthetic */ k<Object>[] p2 = {m.c(new PropertyReference1Impl(m.a(EventHostClubFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentHostClubBinding;")), m.c(new PropertyReference1Impl(m.a(EventHostClubFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/events/creation/AddEditEventViewModel;"))};
    public final FragmentViewBindingDelegate q2 = new FragmentViewBindingDelegate(FragmentHostClubBinding.class, this);
    public final c r2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<EventHostClubFragment, AddEditEventViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ d c;

        public a(d dVar, boolean z, l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new EventHostClubFragment$special$$inlined$parentFragmentViewModel$default$2$1(this), m.a(w.class), true, this.b);
        }
    }

    public EventHostClubFragment() {
        super(R.layout.fragment_host_club);
        d a2 = m.a(AddEditEventViewModel.class);
        this.r2 = new a(a2, true, new EventHostClubFragment$special$$inlined$parentFragmentViewModel$default$1(this, a2, a2), a2).a(this, p2[1]);
    }

    public void J() {
        v.v2(V0(), new EventHostClubFragment$invalidate$1(this));
    }

    public final FragmentHostClubBinding U0() {
        return (FragmentHostClubBinding) this.q2.getValue(this, p2[0]);
    }

    public final AddEditEventViewModel V0() {
        return (AddEditEventViewModel) this.r2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        U0().a.setOnClickListener(new s(this));
        U0().b.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        EpoxyRecyclerView epoxyRecyclerView = U0().b;
        i.d(epoxyRecyclerView, "binding.hostsClubList");
        i0.e.b.d3.k.E(epoxyRecyclerView, new EventHostClubFragment$initHosts$1(this));
    }
}
