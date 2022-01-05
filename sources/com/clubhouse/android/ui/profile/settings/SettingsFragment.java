package com.clubhouse.android.ui.profile.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.databinding.FragmentSettingsBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.shared.preferences.DeviceSharedPreferences;
import com.clubhouse.app.R;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.a3.f.e;
import i0.e.b.g3.u.z5.a0;
import i0.e.b.g3.u.z5.b0;
import i0.e.b.g3.u.z5.d1;
import i0.e.b.g3.u.z5.k0;
import i0.e.b.g3.u.z5.l0;
import i0.e.b.g3.u.z5.r;
import i0.e.b.g3.u.z5.s;
import i0.e.b.g3.u.z5.t;
import i0.e.b.g3.u.z5.u;
import i0.e.b.g3.u.z5.w;
import i0.e.b.g3.u.z5.x;
import i0.e.b.g3.u.z5.y;
import i0.e.b.g3.u.z5.z;
import i0.e.b.g3.u.z5.z0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010\u000fJ#\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\u00020\u00198F@\u0006X\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010$\u001a\u00020\u001f8F@\u0006X\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/clubhouse/android/ui/profile/settings/SettingsFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "", "url", "title", "Lm0/i;", "P0", "(II)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "()V", "J", "Lcom/clubhouse/android/shared/preferences/DeviceSharedPreferences;", "a2", "Lcom/clubhouse/android/shared/preferences/DeviceSharedPreferences;", "getDevicePreferences", "()Lcom/clubhouse/android/shared/preferences/DeviceSharedPreferences;", "setDevicePreferences", "(Lcom/clubhouse/android/shared/preferences/DeviceSharedPreferences;)V", "devicePreferences", "Lcom/clubhouse/android/ui/profile/settings/SettingsViewModel;", "c2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/profile/settings/SettingsViewModel;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentSettingsBinding;", "b2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentSettingsBinding;", "binding", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: SettingsFragment.kt */
public final class SettingsFragment extends Hilt_SettingsFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(SettingsFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentSettingsBinding;")), m.c(new PropertyReference1Impl(m.a(SettingsFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/profile/settings/SettingsViewModel;"))};
    public DeviceSharedPreferences a2;
    public final FragmentViewBindingDelegate b2 = new FragmentViewBindingDelegate(FragmentSettingsBinding.class, this);
    public final c c2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<SettingsFragment, SettingsViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new SettingsFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(d1.class), false, this.b);
        }
    }

    public SettingsFragment() {
        super(R.layout.fragment_settings);
        d a3 = m.a(SettingsViewModel.class);
        this.c2 = new a(a3, false, new SettingsFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
    }

    public void J() {
        v.v2(O0(), new SettingsFragment$invalidate$1(this));
    }

    public final FragmentSettingsBinding N0() {
        return (FragmentSettingsBinding) this.b2.getValue(this, Z1[0]);
    }

    public final SettingsViewModel O0() {
        return (SettingsViewModel) this.c2.getValue();
    }

    public final void P0(int i, int i2) {
        e.b(this, getString(i));
        ((AmplitudeAnalytics) v.l(this)).b("Settings-Info-TappedInfo", i0.j.f.p.h.S2(new Pair(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, getString(i2))));
    }

    public void onResume() {
        super.onResume();
        ConstraintLayout constraintLayout = N0().o;
        i.d(constraintLayout, "binding.notificationReactivateRoot");
        i0.e.b.e3.d dVar = i0.e.b.e3.d.a;
        Context requireContext = requireContext();
        i.d(requireContext, "requireContext()");
        i0.e.b.d3.k.L(constraintLayout, Boolean.valueOf(!dVar.a(requireContext)));
        O0().p(z0.a);
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(O0().l, new SettingsFragment$onViewCreated$1(this, (m0.l.c<? super SettingsFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        N0().d.setOnClickListener(new i0.e.b.g3.u.z5.v(this));
        ConstraintLayout constraintLayout = N0().a;
        i.d(constraintLayout, "binding.accountRoot");
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        i0.e.b.d3.k.H(constraintLayout, q.a(viewLifecycleOwner2), new l0(this));
        N0().i.setOnClickListener(new x(this));
        N0().k.setOnClickListener(new r(this));
        N0().C.setOnClickListener(new k0(this));
        N0().g.setOnClickListener(new b0(this));
        N0().h.setOnClickListener(new i0.e.b.g3.u.z5.p(this));
        N0().A.setOnClickListener(new u(this));
        N0().w.setOnClickListener(new z(this));
        N0().m.setOnClickListener(new w(this));
        N0().p.setOnClickListener(new a0(this));
        N0().t.setOnCheckedChangeListener(new y(this));
        N0().x.setOnCheckedChangeListener(new i0.e.b.g3.u.z5.q(this));
        N0().z.setOnCheckedChangeListener(new t(this));
        N0().e.setText(getString(R.string.build_string, "1.0.8", 4734));
        N0().q.setOnClickListener(new s(this));
        v.p0(this, "languages_updated_result", new SettingsFragment$onViewCreated$17(this));
    }
}
