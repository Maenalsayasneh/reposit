package com.clubhouse.android.ui.clubs;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.databinding.FragmentHalfClubRulesBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.l.a2;
import i0.e.b.g3.l.y0;
import i0.e.b.g3.l.z0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118F@\u0006X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/clubhouse/android/ui/clubs/HalfClubRulesFragment;", "Lcom/clubhouse/android/core/ui/BaseBottomSheetFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/ui/clubs/HalfClubRulesViewModel;", "t2", "Lm0/c;", "W0", "()Lcom/clubhouse/android/ui/clubs/HalfClubRulesViewModel;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentHalfClubRulesBinding;", "s2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "V0", "()Lcom/clubhouse/android/databinding/FragmentHalfClubRulesBinding;", "binding", "Lcom/clubhouse/android/ui/clubs/HalfClubRulesArgs;", "u2", "Lm0/o/c;", "U0", "()Lcom/clubhouse/android/ui/clubs/HalfClubRulesArgs;", "args", "<init>", "p2", "a", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: HalfClubRulesFragment.kt */
public final class HalfClubRulesFragment extends Hilt_HalfClubRulesFragment {
    public static final a p2 = new a((f) null);
    public static final /* synthetic */ k<Object>[] q2 = {m.c(new PropertyReference1Impl(m.a(HalfClubRulesFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentHalfClubRulesBinding;")), m.c(new PropertyReference1Impl(m.a(HalfClubRulesFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/clubs/HalfClubRulesViewModel;")), m.c(new PropertyReference1Impl(m.a(HalfClubRulesFragment.class), "args", "getArgs()Lcom/clubhouse/android/ui/clubs/HalfClubRulesArgs;"))};
    public static final String r2 = "club_rules_shown";
    public final FragmentViewBindingDelegate s2 = new FragmentViewBindingDelegate(FragmentHalfClubRulesBinding.class, this);
    public final c t2;
    public final m0.o.c u2;

    /* compiled from: HalfClubRulesFragment.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class b extends h<HalfClubRulesFragment, HalfClubRulesViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ d c;

        public b(d dVar, boolean z, l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new HalfClubRulesFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(a2.class), false, this.b);
        }
    }

    public HalfClubRulesFragment() {
        super(R.layout.fragment_half_club_rules);
        d a2 = m.a(HalfClubRulesViewModel.class);
        this.t2 = new b(a2, false, new HalfClubRulesFragment$special$$inlined$fragmentViewModel$default$1(this, a2, a2), a2).a(this, q2[1]);
        this.u2 = new i0.b.b.i();
    }

    public void J() {
        v.v2(W0(), new HalfClubRulesFragment$invalidate$1(this));
    }

    public final HalfClubRulesArgs U0() {
        return (HalfClubRulesArgs) this.u2.getValue(this, q2[2]);
    }

    public final FragmentHalfClubRulesBinding V0() {
        return (FragmentHalfClubRulesBinding) this.s2.getValue(this, q2[0]);
    }

    public final HalfClubRulesViewModel W0() {
        return (HalfClubRulesViewModel) this.t2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        v.U1(this);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(W0().l, new HalfClubRulesFragment$onViewCreated$1(this, (m0.l.c<? super HalfClubRulesFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        V0().b.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        EpoxyRecyclerView epoxyRecyclerView = V0().b;
        i.d(epoxyRecyclerView, "binding.clubRules");
        i0.e.b.d3.k.D(epoxyRecyclerView, this, new HalfClubRulesFragment$buildModels$1(this));
        if (i.a(U0().d, Boolean.TRUE)) {
            ((AmplitudeAnalytics) v.l(this)).a("Clubs-ViewedRules-Prompt");
            LinearLayout linearLayout = V0().a;
            i.d(linearLayout, "binding.clubActionButtonContainer");
            i0.e.b.d3.k.K(linearLayout);
            Button button = V0().d;
            i.d(button, "binding.primaryButton");
            p viewLifecycleOwner2 = getViewLifecycleOwner();
            i.d(viewLifecycleOwner2, "viewLifecycleOwner");
            i0.e.b.d3.k.H(button, q.a(viewLifecycleOwner2), new y0(this));
            Button button2 = V0().e;
            i.d(button2, "binding.secondaryButton");
            p viewLifecycleOwner3 = getViewLifecycleOwner();
            i.d(viewLifecycleOwner3, "viewLifecycleOwner");
            i0.e.b.d3.k.H(button2, q.a(viewLifecycleOwner3), new z0(this));
            return;
        }
        ((AmplitudeAnalytics) v.l(this)).b("Clubs-ViewedRules-Informational", i0.j.f.p.h.S2(new Pair("ClubId", Integer.valueOf(U0().c.getId()))));
    }
}
