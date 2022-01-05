package com.clubhouse.android.ui.hallway.buddyList;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.databinding.FragmentBuddyListBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.p.b0.n;
import i0.e.b.g3.p.b0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u00020\u000b8\u0016@\u0016XD¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/clubhouse/android/ui/hallway/buddyList/BuddyListFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "", "shouldAdjustResize", "Z", "J0", "()Z", "Lcom/clubhouse/android/databinding/FragmentBuddyListBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentBuddyListBinding;", "binding", "Lcom/clubhouse/android/ui/hallway/buddyList/BuddyListViewModel;", "b2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/hallway/buddyList/BuddyListViewModel;", "viewModel", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: BuddyListFragment.kt */
public final class BuddyListFragment extends Hilt_BuddyListFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(BuddyListFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentBuddyListBinding;")), m.c(new PropertyReference1Impl(m.a(BuddyListFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/hallway/buddyList/BuddyListViewModel;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentBuddyListBinding.class, this);
    public final c b2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<BuddyListFragment, BuddyListViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new BuddyListFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(q.class), false, this.b);
        }
    }

    public BuddyListFragment() {
        super(R.layout.fragment_buddy_list);
        d a3 = m.a(BuddyListViewModel.class);
        this.b2 = new a(a3, false, new BuddyListFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
    }

    public void J() {
        v.v2(O0(), new BuddyListFragment$invalidate$1(this));
    }

    public boolean J0() {
        return false;
    }

    public final FragmentBuddyListBinding N0() {
        return (FragmentBuddyListBinding) this.a2.getValue(this, Z1[0]);
    }

    public final BuddyListViewModel O0() {
        return (BuddyListViewModel) this.b2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(O0().l, new BuddyListFragment$onViewCreated$1(this, (m0.l.c<? super BuddyListFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, h0.q.q.a(viewLifecycleOwner));
        TextView textView = N0().d;
        i.d(textView, "binding.exploreButton");
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        i0.e.b.d3.k.H(textView, h0.q.q.a(viewLifecycleOwner2), new i0.e.b.g3.p.b0.a(this));
        CardView cardView = N0().f;
        i.d(cardView, "binding.retryButton");
        p viewLifecycleOwner3 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner3, "viewLifecycleOwner");
        i0.e.b.d3.k.H(cardView, h0.q.q.a(viewLifecycleOwner3), new n(this));
        N0().e.setProgressBackgroundColorSchemeColor(h0.i.b.a.getColor(requireContext(), R.color.clubhouse_eggshell));
        N0().e.setOnRefreshListener(new i0.e.b.g3.p.b0.k(this));
        p viewLifecycleOwner4 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner4, "viewLifecycleOwner");
        h0.q.q.a(viewLifecycleOwner4).c(new BuddyListFragment$onViewCreated$5(this, (m0.l.c<? super BuddyListFragment$onViewCreated$5>) null));
    }
}
