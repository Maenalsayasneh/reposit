package com.clubhouse.android.ui.clubs.nominations;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.databinding.FragmentClubNominationsBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.l.a3.e;
import i0.e.b.g3.l.a3.f;
import i0.e.b.g3.l.a3.q;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/clubhouse/android/ui/clubs/nominations/ClubNominationsFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/ui/clubs/nominations/ClubNominationsViewModel;", "b2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/clubs/nominations/ClubNominationsViewModel;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentClubNominationsBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentClubNominationsBinding;", "binding", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ClubNominationsFragment.kt */
public final class ClubNominationsFragment extends Hilt_ClubNominationsFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(ClubNominationsFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentClubNominationsBinding;")), m.c(new PropertyReference1Impl(m.a(ClubNominationsFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/clubs/nominations/ClubNominationsViewModel;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentClubNominationsBinding.class, this);
    public final c b2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<ClubNominationsFragment, ClubNominationsViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new ClubNominationsFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(q.class), false, this.b);
        }
    }

    public ClubNominationsFragment() {
        super(R.layout.fragment_club_nominations);
        d a3 = m.a(ClubNominationsViewModel.class);
        this.b2 = new a(a3, false, new ClubNominationsFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
    }

    public void J() {
        v.v2(O0(), new ClubNominationsFragment$invalidate$1(this));
    }

    public final FragmentClubNominationsBinding N0() {
        return (FragmentClubNominationsBinding) this.a2.getValue(this, Z1[0]);
    }

    public final ClubNominationsViewModel O0() {
        return (ClubNominationsViewModel) this.b2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        N0().b.setOnClickListener(new i0.e.b.g3.l.a3.a(this));
        Button button = N0().a;
        i.d(button, "binding.approveAll");
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button, h0.q.q.a(viewLifecycleOwner), new e(this));
        Button button2 = N0().f;
        i.d(button2, "binding.rejectAll");
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button2, h0.q.q.a(viewLifecycleOwner2), new f(this));
        EpoxyRecyclerView epoxyRecyclerView = N0().e;
        i.d(epoxyRecyclerView, "binding.nominationsList");
        i0.e.b.d3.k.D(epoxyRecyclerView, this, new ClubNominationsFragment$buildModels$1(this));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(O0().l, new ClubNominationsFragment$onViewCreated$4(this, (m0.l.c<? super ClubNominationsFragment$onViewCreated$4>) null));
        p viewLifecycleOwner3 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner3, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, h0.q.q.a(viewLifecycleOwner3));
    }
}
