package com.clubhouse.android.ui.profile.reports;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SpinnerAdapter;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.data.models.local.user.ReportReason;
import com.clubhouse.android.databinding.FragmentReportProfileLegacyBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.u.y5.a0;
import i0.e.b.g3.u.y5.c0;
import i0.e.b.g3.u.y5.e1;
import i0.e.b.g3.u.y5.w;
import i0.e.b.g3.u.y5.x;
import i0.e.b.g3.u.y5.y;
import i0.e.b.g3.u.y5.z;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR$\u0010\u0010\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118F@\u0006X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178F@\u0006X\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/clubhouse/android/ui/profile/reports/ReportProfileLegacyFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lh0/a/f/b;", "", "kotlin.jvm.PlatformType", "e2", "Lh0/a/f/b;", "getGalleryImage", "Lcom/clubhouse/android/ui/profile/reports/ReportProfileLegacyViewModel;", "d2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/profile/reports/ReportProfileLegacyViewModel;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentReportProfileLegacyBinding;", "c2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentReportProfileLegacyBinding;", "binding", "<init>", "Z1", "a", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ReportProfileLegacyFragment.kt */
public final class ReportProfileLegacyFragment extends Hilt_ReportProfileLegacyFragment {
    public static final a Z1 = new a((f) null);
    public static final /* synthetic */ k<Object>[] a2 = {m.c(new PropertyReference1Impl(m.a(ReportProfileLegacyFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentReportProfileLegacyBinding;")), m.c(new PropertyReference1Impl(m.a(ReportProfileLegacyFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/profile/reports/ReportProfileLegacyViewModel;"))};
    public static final String b2 = "ShowBlockUser";
    public final FragmentViewBindingDelegate c2 = new FragmentViewBindingDelegate(FragmentReportProfileLegacyBinding.class, this);
    public final c d2;
    public final h0.a.f.b<String> e2;

    /* compiled from: ReportProfileLegacyFragment.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class b extends h<ReportProfileLegacyFragment, ReportProfileLegacyViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new ReportProfileLegacyFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(e1.class), false, this.b);
        }
    }

    public ReportProfileLegacyFragment() {
        super(R.layout.fragment_report_profile_legacy);
        d a3 = m.a(ReportProfileLegacyViewModel.class);
        this.d2 = new b(a3, false, new ReportProfileLegacyFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, a2[1]);
        h0.a.f.b<String> registerForActivityResult = registerForActivityResult(new h0.a.f.d.b(), new x(this));
        i.d(registerForActivityResult, "registerForActivityResult(ActivityResultContracts.GetContent()) {\n            it?.let {\n                binding.attachImage.hide()\n                binding.attachedImage.show()\n                binding.attachedImage.load(it)\n                viewModel.processIntent(AddPhoto(it))\n            }\n        }");
        this.e2 = registerForActivityResult;
    }

    public void J() {
        v.v2(O0(), new ReportProfileLegacyFragment$invalidate$1(this));
    }

    public final FragmentReportProfileLegacyBinding N0() {
        return (FragmentReportProfileLegacyBinding) this.c2.getValue(this, a2[0]);
    }

    public final ReportProfileLegacyViewModel O0() {
        return (ReportProfileLegacyViewModel) this.d2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        ReportReason[] values = ReportReason.values();
        ArrayList arrayList = new ArrayList(19);
        for (int i = 0; i < 19; i++) {
            arrayList.add(getString(values[i].getDisplayName()));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        N0().l.setAdapter((SpinnerAdapter) arrayAdapter);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(O0().l, new ReportProfileLegacyFragment$onViewCreated$1(this, (m0.l.c<? super ReportProfileLegacyFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        N0().d.setOnClickListener(new a0(this));
        N0().f.setOnClickListener(new c0(this));
        Button button = N0().m;
        i.d(button, "binding.submit");
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button, q.a(viewLifecycleOwner2), new w(this, arrayAdapter));
        N0().b.setOnClickListener(new y(this));
        CardView cardView = N0().a;
        i.d(cardView, "binding.attachImage");
        p viewLifecycleOwner3 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner3, "viewLifecycleOwner");
        i0.e.b.d3.k.H(cardView, q.a(viewLifecycleOwner3), new z(this));
    }
}
