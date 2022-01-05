package com.clubhouse.android.ui.hallway;

import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.airbnb.mvrx.DeliveryMode;
import com.clubhouse.android.core.ui.CustomSwipeViewPager;
import com.clubhouse.android.databinding.FragmentHallwayBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.shared.update.UpdatesCoordinator;
import com.clubhouse.android.ui.NavigationViewModel;
import com.clubhouse.android.ui.profile.reports.ReportIncidentThanksFragment;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.b.b.k0;
import i0.e.b.g3.p.b0.s;
import i0.e.b.g3.p.f;
import i0.e.b.g3.p.r;
import i0.e.b.g3.p.w;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u001c\u0010\r\u001a\u00020\f8\u0016@\u0016XD¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010$\u001a\u00020\u001f8B@\u0002X\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001d\u00101\u001a\u00020-8B@\u0002X\u0002¢\u0006\f\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/clubhouse/android/ui/hallway/HallwayFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "()V", "J", "", "shouldAdjustResize", "Z", "J0", "()Z", "Lcom/clubhouse/android/shared/update/UpdatesCoordinator;", "a2", "Lcom/clubhouse/android/shared/update/UpdatesCoordinator;", "getUpdatescoordinator", "()Lcom/clubhouse/android/shared/update/UpdatesCoordinator;", "setUpdatescoordinator", "(Lcom/clubhouse/android/shared/update/UpdatesCoordinator;)V", "updatescoordinator", "Lcom/clubhouse/android/ui/NavigationViewModel;", "e2", "Lm0/c;", "getNavigationViewModel", "()Lcom/clubhouse/android/ui/NavigationViewModel;", "navigationViewModel", "Lcom/clubhouse/android/databinding/FragmentHallwayBinding;", "c2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentHallwayBinding;", "binding", "Li0/e/b/f3/k/b;", "b2", "Li0/e/b/f3/k/b;", "O0", "()Li0/e/b/f3/k/b;", "setUserPrefs", "(Li0/e/b/f3/k/b;)V", "userPrefs", "Lcom/clubhouse/android/ui/hallway/HallwayViewModel;", "d2", "P0", "()Lcom/clubhouse/android/ui/hallway/HallwayViewModel;", "viewModel", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: HallwayFragment.kt */
public final class HallwayFragment extends Hilt_HallwayFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(HallwayFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentHallwayBinding;")), m.c(new PropertyReference1Impl(m.a(HallwayFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/hallway/HallwayViewModel;")), m.c(new PropertyReference1Impl(m.a(HallwayFragment.class), "navigationViewModel", "getNavigationViewModel()Lcom/clubhouse/android/ui/NavigationViewModel;"))};
    public UpdatesCoordinator a2;
    public i0.e.b.f3.k.b b2;
    public final FragmentViewBindingDelegate c2 = new FragmentViewBindingDelegate(FragmentHallwayBinding.class, this);
    public final c d2;
    public final c e2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<HallwayFragment, HallwayViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new HallwayFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(r.class), false, this.b);
        }
    }

    /* compiled from: MavericksExtensions.kt */
    public static final class b extends h<HallwayFragment, NavigationViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ p b;
        public final /* synthetic */ d c;

        public b(d dVar, int i, p pVar, d dVar2) {
            this.a = dVar;
            this.b = pVar;
            this.c = dVar2;
        }

        public c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            k0 k0Var = g.a;
            if (k0Var instanceof i0.b.b.l0.a) {
                return ((i0.b.b.l0.a) k0Var).a(fragment, kVar, this.a, new HallwayFragment$special$$inlined$navGraphViewModel$default$2$1(this), m.a(i0.e.b.g3.h.class), R.id.main_graph, this.b);
            }
            throw new IllegalStateException("Navigation ViewModels require that Mavericks.viewModelDelegateFactory have an implementation of NavigationViewModelDelegateFactory.\n \n To setup the default factory configuration, you can use the default factory DefaultNavigationViewModelDelegateFactory.\n DefaultNavigationViewModelDelegateFactory also implements DefaultViewModelDelegateFactory by default.\n \n Mavericks.viewModelDelegateFactory = DefaultNavigationViewModelDelegateFactory()");
        }
    }

    public HallwayFragment() {
        super(R.layout.fragment_hallway);
        d a3 = m.a(HallwayViewModel.class);
        a aVar = new a(a3, false, new HallwayFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3);
        k<Object>[] kVarArr = Z1;
        this.d2 = aVar.a(this, kVarArr[1]);
        d a4 = m.a(NavigationViewModel.class);
        this.e2 = new b(a4, R.id.main_graph, new HallwayFragment$special$$inlined$navGraphViewModel$default$1(this, a4, a4), a4).a(this, kVarArr[2]);
    }

    public void J() {
        v.v2(P0(), new HallwayFragment$invalidate$1(this));
    }

    public boolean J0() {
        return false;
    }

    public final FragmentHallwayBinding N0() {
        return (FragmentHallwayBinding) this.c2.getValue(this, Z1[0]);
    }

    public final i0.e.b.f3.k.b O0() {
        i0.e.b.f3.k.b bVar = this.b2;
        if (bVar != null) {
            return bVar;
        }
        i.m("userPrefs");
        throw null;
    }

    public final HallwayViewModel P0() {
        return (HallwayViewModel) this.d2.getValue();
    }

    public void onResume() {
        super.onResume();
        P0().p(s.a);
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        v.l1(this, (NavigationViewModel) this.e2.getValue(), HallwayFragment$onViewCreated$1.c, (DeliveryMode) null, new HallwayFragment$onViewCreated$2(this, (m0.l.c<? super HallwayFragment$onViewCreated$2>) null), 2, (Object) null);
        Objects.requireNonNull(ReportIncidentThanksFragment.Z1);
        v.p0(this, ReportIncidentThanksFragment.c2, new HallwayFragment$onViewCreated$3(this));
        boolean z = false;
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(m0.r.t.a.r.m.a1.a.K2(P0().l, ((NavigationViewModel) this.e2.getValue()).l), new HallwayFragment$onViewCreated$4(this, (m0.l.c<? super HallwayFragment$onViewCreated$4>) null));
        h0.q.p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        CustomSwipeViewPager customSwipeViewPager = N0().g;
        FragmentManager childFragmentManager = getChildFragmentManager();
        i.d(childFragmentManager, "childFragmentManager");
        customSwipeViewPager.setAdapter(new w(childFragmentManager));
        N0().g.setOffscreenPageLimit(0);
        N0().g.setCurrentItem(1);
        N0().g.addOnPageChangeListener(new i0.e.b.g3.p.h(this));
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        i.d(onBackPressedDispatcher, "requireActivity().onBackPressedDispatcher");
        g0.a.b.b.a.a(onBackPressedDispatcher, this, false, new HallwayFragment$setUpBuddyList$2(this), 2);
        N0().g.setPageTransformer(false, f.a);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(N0().g.getSwipeFlow(), new HallwayFragment$onViewCreated$5(this, (m0.l.c<? super HallwayFragment$onViewCreated$5>) null));
        h0.q.p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, q.a(viewLifecycleOwner2));
        N0().c.setOnClickListener(new i0.e.b.g3.p.c(this));
        N0().b.setOnClickListener(new i0.e.b.g3.p.a(this));
        N0().h.setOnClickListener(new i0.e.b.g3.p.b(this));
        N0().f.setOnClickListener(new i0.e.b.g3.p.g(this));
        UpdatesCoordinator updatesCoordinator = this.a2;
        if (updatesCoordinator != null) {
            if (updatesCoordinator.b.k() < 4734) {
                z = true;
            }
            if (z) {
                h0.q.p viewLifecycleOwner3 = getViewLifecycleOwner();
                i.d(viewLifecycleOwner3, "viewLifecycleOwner");
                m0.r.t.a.r.m.a1.a.E2(q.a(viewLifecycleOwner3), (e) null, (CoroutineStart) null, new HallwayFragment$onViewCreated$10(this, (m0.l.c<? super HallwayFragment$onViewCreated$10>) null), 3, (Object) null);
                return;
            }
            return;
        }
        i.m("updatescoordinator");
        throw null;
    }
}
