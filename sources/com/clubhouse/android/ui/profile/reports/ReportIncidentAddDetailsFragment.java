package com.clubhouse.android.ui.profile.reports;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.databinding.FragmentReportIncidentAddDetailsBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import com.squareup.picasso.Picasso;
import h0.a.f.b;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.c3.e;
import i0.e.b.g3.u.y5.f;
import i0.e.b.g3.u.y5.k0;
import i0.o.a.t;
import i0.o.a.u;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00158F@\u0006X\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010 \u001a\u00020\u001b8F@\u0006X\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/clubhouse/android/ui/profile/reports/ReportIncidentAddDetailsFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Landroid/net/Uri;", "uri", "P0", "(Landroid/net/Uri;)V", "Lh0/a/f/b;", "", "kotlin.jvm.PlatformType", "c2", "Lh0/a/f/b;", "getGalleryImage", "Lcom/clubhouse/android/ui/profile/reports/ReportIncidentAddDetailsViewModel;", "b2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/profile/reports/ReportIncidentAddDetailsViewModel;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentReportIncidentAddDetailsBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentReportIncidentAddDetailsBinding;", "binding", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ReportIncidentAddDetailsFragment.kt */
public final class ReportIncidentAddDetailsFragment extends Hilt_ReportIncidentAddDetailsFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(ReportIncidentAddDetailsFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentReportIncidentAddDetailsBinding;")), m.c(new PropertyReference1Impl(m.a(ReportIncidentAddDetailsFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/profile/reports/ReportIncidentAddDetailsViewModel;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentReportIncidentAddDetailsBinding.class, this);
    public final c b2;
    public final b<String> c2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<ReportIncidentAddDetailsFragment, ReportIncidentAddDetailsViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new ReportIncidentAddDetailsFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(k0.class), false, this.b);
        }
    }

    public ReportIncidentAddDetailsFragment() {
        super(R.layout.fragment_report_incident_add_details);
        d a3 = m.a(ReportIncidentAddDetailsViewModel.class);
        this.b2 = new a(a3, false, new ReportIncidentAddDetailsFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
        b<String> registerForActivityResult = registerForActivityResult(new h0.a.f.d.b(), new i0.e.b.g3.u.y5.c(this));
        i.d(registerForActivityResult, "registerForActivityResult(ActivityResultContracts.GetContent()) {\n            it?.let {\n                showScreenshot(it)\n                viewModel.processIntent(AddPhoto(it))\n            }\n        }");
        this.c2 = registerForActivityResult;
    }

    public void J() {
        v.v2(O0(), new ReportIncidentAddDetailsFragment$invalidate$1(this));
    }

    public final FragmentReportIncidentAddDetailsBinding N0() {
        return (FragmentReportIncidentAddDetailsBinding) this.a2.getValue(this, Z1[0]);
    }

    public final ReportIncidentAddDetailsViewModel O0() {
        return (ReportIncidentAddDetailsViewModel) this.b2.getValue();
    }

    public final void P0(Uri uri) {
        m0.i iVar = null;
        if (uri != null) {
            Context requireContext = requireContext();
            i.d(requireContext, "requireContext()");
            i.e(requireContext, "<this>");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService = requireContext.getSystemService("window");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            Context requireContext2 = requireContext();
            i.d(requireContext2, "requireContext()");
            i.e(requireContext2, "<this>");
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            Object systemService2 = requireContext2.getSystemService("window");
            Objects.requireNonNull(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService2).getDefaultDisplay().getMetrics(displayMetrics2);
            ViewGroup.LayoutParams layoutParams = N0().k.getLayoutParams();
            layoutParams.width = (displayMetrics.widthPixels * 3) / 8;
            layoutParams.height = (displayMetrics2.heightPixels * 3) / 8;
            Button button = N0().b;
            i.d(button, "binding.attachImage");
            i0.e.b.d3.k.p(button);
            ImageView imageView = N0().j;
            i.d(imageView, "binding.screenshot");
            i0.e.b.g3.z.b bVar = new i0.e.b.g3.z.b(Float.valueOf(getResources().getDimension(R.dimen.roundable_rect_radius)), getResources().getDimension(R.dimen.roundable_rect_border_width));
            i.e(imageView, "<this>");
            i.e(bVar, "transformation");
            String valueOf = String.valueOf(uri);
            i.e(imageView, "<this>");
            i.e(bVar, "transformation");
            Picasso d = ((e) i0.j.f.p.h.K0(imageView.getContext().getApplicationContext(), e.class)).d();
            if (valueOf.length() == 0) {
                d.b(imageView);
                imageView.setImageDrawable((Drawable) null);
            } else {
                u e = d.e(valueOf);
                e.d = true;
                t.b bVar2 = e.c;
                Objects.requireNonNull(bVar2);
                if (bVar.b() != null) {
                    if (bVar2.e == null) {
                        bVar2.e = new ArrayList(2);
                    }
                    bVar2.e.add(bVar);
                    e.b(imageView, (i0.o.a.e) null);
                } else {
                    throw new IllegalArgumentException("Transformation key must not be null.");
                }
            }
            FrameLayout frameLayout = N0().k;
            i.d(frameLayout, "binding.screenshotContainer");
            i0.e.b.d3.k.K(frameLayout);
            iVar = m0.i.a;
        }
        if (iVar == null) {
            Button button2 = N0().b;
            i.d(button2, "binding.attachImage");
            i0.e.b.d3.k.K(button2);
            FrameLayout frameLayout2 = N0().k;
            i.d(frameLayout2, "binding.screenshotContainer");
            i0.e.b.d3.k.p(frameLayout2);
            N0().m.setText(getResources().getString(R.string.if_the_incident_is_visible));
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(O0().l, new ReportIncidentAddDetailsFragment$onViewCreated$1(this, (m0.l.c<? super ReportIncidentAddDetailsFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        N0().d.setOnClickListener(new i0.e.b.g3.u.y5.d(this));
        TextView textView = N0().l;
        i.d(textView, "binding.submit");
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        i0.e.b.d3.k.H(textView, q.a(viewLifecycleOwner2), new f(this));
        N0().k.setOnClickListener(new i0.e.b.g3.u.y5.a(this));
        Button button = N0().b;
        i.d(button, "binding.attachImage");
        p viewLifecycleOwner3 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner3, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button, q.a(viewLifecycleOwner3), new i0.e.b.g3.u.y5.b(this));
        v.v2(O0(), new ReportIncidentAddDetailsFragment$onViewCreated$6(this));
    }
}
