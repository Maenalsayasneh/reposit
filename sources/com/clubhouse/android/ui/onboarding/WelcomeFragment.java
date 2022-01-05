package com.clubhouse.android.ui.onboarding;

import android.os.Bundle;
import android.view.View;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.databinding.FragmentWelcomeBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.a;
import i0.e.b.g3.r.c0;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/clubhouse/android/ui/onboarding/WelcomeFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/databinding/FragmentWelcomeBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "getBinding", "()Lcom/clubhouse/android/databinding/FragmentWelcomeBinding;", "binding", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: WelcomeFragment.kt */
public final class WelcomeFragment extends Hilt_WelcomeFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(WelcomeFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentWelcomeBinding;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentWelcomeBinding.class, this);

    public WelcomeFragment() {
        super(R.layout.fragment_welcome);
    }

    public void J() {
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        ((FragmentWelcomeBinding) this.a2.getValue(this, Z1[0])).a.setOnClickListener(new c0(this, new a(R.id.action_welcomeFragment_to_collectPhoneNumberFragment)));
        ((AmplitudeAnalytics) v.l(this)).a("Onboarding-Start");
    }
}
