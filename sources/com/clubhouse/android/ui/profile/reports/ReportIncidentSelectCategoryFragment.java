package com.clubhouse.android.ui.profile.reports;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.databinding.FragmentReportIncidentSelectCategoryBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.u.y5.l0;
import i0.e.b.g3.u.y5.p0;
import i0.e.b.g3.u.y5.q0;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8F@\u0006X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118F@\u0006X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/clubhouse/android/ui/profile/reports/ReportIncidentSelectCategoryFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Li0/e/b/g3/u/y5/q0;", "b2", "Lm0/c;", "O0", "()Li0/e/b/g3/u/y5/q0;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentReportIncidentSelectCategoryBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentReportIncidentSelectCategoryBinding;", "binding", "Lcom/clubhouse/android/ui/profile/reports/ReportIncidentSelectCategoryContainerViewModel;", "c2", "getContainerViewModel", "()Lcom/clubhouse/android/ui/profile/reports/ReportIncidentSelectCategoryContainerViewModel;", "containerViewModel", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ReportIncidentSelectCategoryFragment.kt */
public final class ReportIncidentSelectCategoryFragment extends Hilt_ReportIncidentSelectCategoryFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(ReportIncidentSelectCategoryFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentReportIncidentSelectCategoryBinding;")), m.c(new PropertyReference1Impl(m.a(ReportIncidentSelectCategoryFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/profile/reports/ReportIncidentSelectCategoryViewModel;")), m.c(new PropertyReference1Impl(m.a(ReportIncidentSelectCategoryFragment.class), "containerViewModel", "getContainerViewModel()Lcom/clubhouse/android/ui/profile/reports/ReportIncidentSelectCategoryContainerViewModel;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentReportIncidentSelectCategoryBinding.class, this);
    public final c b2;
    public final c c2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<ReportIncidentSelectCategoryFragment, q0> {
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
            return g.a.b(fragment, kVar, this.a, new ReportIncidentSelectCategoryFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(p0.class), false, this.b);
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class b extends h<ReportIncidentSelectCategoryFragment, ReportIncidentSelectCategoryContainerViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new ReportIncidentSelectCategoryFragment$special$$inlined$parentFragmentViewModel$default$2$1(this), m.a(l0.class), true, this.b);
        }
    }

    public ReportIncidentSelectCategoryFragment() {
        super(R.layout.fragment_report_incident_select_category);
        d a3 = m.a(q0.class);
        a aVar = new a(a3, false, new ReportIncidentSelectCategoryFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3);
        k<Object>[] kVarArr = Z1;
        this.b2 = aVar.a(this, kVarArr[1]);
        d a4 = m.a(ReportIncidentSelectCategoryContainerViewModel.class);
        this.c2 = new b(a4, true, new ReportIncidentSelectCategoryFragment$special$$inlined$parentFragmentViewModel$default$1(this, a4, a4), a4).a(this, kVarArr[2]);
    }

    public void J() {
        v.v2(O0(), new ReportIncidentSelectCategoryFragment$invalidate$1(this));
    }

    public final FragmentReportIncidentSelectCategoryBinding N0() {
        return (FragmentReportIncidentSelectCategoryBinding) this.a2.getValue(this, Z1[0]);
    }

    public final q0 O0() {
        return (q0) this.b2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        N0().b.setOnClickListener(new i0.e.b.g3.u.y5.h(this));
        N0().d.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        EpoxyRecyclerView epoxyRecyclerView = N0().d;
        i.d(epoxyRecyclerView, "binding.reportReasonsList");
        i0.e.b.d3.k.E(epoxyRecyclerView, new ReportIncidentSelectCategoryFragment$onViewCreated$2(this));
    }
}
