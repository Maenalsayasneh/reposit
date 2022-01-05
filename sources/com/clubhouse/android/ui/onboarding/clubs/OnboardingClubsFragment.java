package com.clubhouse.android.ui.onboarding.clubs;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.databinding.FragmentOnboardingSuggestionsBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.r.z2.b;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/clubhouse/android/ui/onboarding/clubs/OnboardingClubsFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/ui/onboarding/clubs/OnboardingClubsViewModel;", "a2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/onboarding/clubs/OnboardingClubsViewModel;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentOnboardingSuggestionsBinding;", "b2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentOnboardingSuggestionsBinding;", "binding", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: OnboardingClubsFragment.kt */
public final class OnboardingClubsFragment extends Hilt_OnboardingClubsFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(OnboardingClubsFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/onboarding/clubs/OnboardingClubsViewModel;")), m.c(new PropertyReference1Impl(m.a(OnboardingClubsFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentOnboardingSuggestionsBinding;"))};
    public final c a2;
    public final FragmentViewBindingDelegate b2 = new FragmentViewBindingDelegate(FragmentOnboardingSuggestionsBinding.class, this);

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<OnboardingClubsFragment, OnboardingClubsViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new OnboardingClubsFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(i0.e.b.g3.r.z2.h.class), false, this.b);
        }
    }

    public OnboardingClubsFragment() {
        super(R.layout.fragment_onboarding_suggestions);
        d a3 = m.a(OnboardingClubsViewModel.class);
        this.a2 = new a(a3, false, new OnboardingClubsFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[0]);
    }

    public void J() {
        v.v2(O0(), new OnboardingClubsFragment$invalidate$1(this));
    }

    public final FragmentOnboardingSuggestionsBinding N0() {
        return (FragmentOnboardingSuggestionsBinding) this.b2.getValue(this, Z1[1]);
    }

    public final OnboardingClubsViewModel O0() {
        return (OnboardingClubsViewModel) this.a2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        v.V(this);
        EpoxyRecyclerView epoxyRecyclerView = N0().f;
        i.d(epoxyRecyclerView, "binding.suggestionList");
        i0.e.b.d3.k.D(epoxyRecyclerView, this, new OnboardingClubsFragment$buildModels$1(this));
        N0().f.setItemSpacingDp(10);
        Button button = N0().b;
        i.d(button, "binding.chooseButton");
        i0.e.b.d3.k.j(button);
        Button button2 = N0().d;
        i.d(button2, "binding.nextButton");
        i0.e.b.d3.k.h(button2);
        N0().b.setOnClickListener(new i0.e.b.g3.r.z2.c(this));
        N0().d.setOnClickListener(new b(this));
        N0().e.setOnClickListener(new i0.e.b.g3.r.z2.a(this));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(O0().l, new OnboardingClubsFragment$onViewCreated$4(this, (m0.l.c<? super OnboardingClubsFragment$onViewCreated$4>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
    }
}
