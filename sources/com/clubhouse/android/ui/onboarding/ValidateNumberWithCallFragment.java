package com.clubhouse.android.ui.onboarding;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.afollestad.assent.Permission;
import com.afollestad.assent.rationale.RationaleHandler;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.databinding.FragmentValidateNumberCallBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.a.a.b;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.r.a0;
import i0.e.b.g3.r.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/clubhouse/android/ui/onboarding/ValidateNumberWithCallFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/databinding/FragmentValidateNumberCallBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentValidateNumberCallBinding;", "binding", "Lcom/clubhouse/android/ui/onboarding/ValidateNumberWithCallViewModel;", "b2", "Lm0/c;", "getViewModel", "()Lcom/clubhouse/android/ui/onboarding/ValidateNumberWithCallViewModel;", "viewModel", "Lcom/clubhouse/android/ui/onboarding/ValidateNumberArgs;", "c2", "Lm0/o/c;", "getArgs", "()Lcom/clubhouse/android/ui/onboarding/ValidateNumberArgs;", "args", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ValidateNumberWithCallFragment.kt */
public final class ValidateNumberWithCallFragment extends Hilt_ValidateNumberWithCallFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(ValidateNumberWithCallFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentValidateNumberCallBinding;")), m.c(new PropertyReference1Impl(m.a(ValidateNumberWithCallFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/onboarding/ValidateNumberWithCallViewModel;")), m.c(new PropertyReference1Impl(m.a(ValidateNumberWithCallFragment.class), "args", "getArgs()Lcom/clubhouse/android/ui/onboarding/ValidateNumberArgs;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentValidateNumberCallBinding.class, this);
    public final c b2;
    public final m0.o.c c2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<ValidateNumberWithCallFragment, ValidateNumberWithCallViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new ValidateNumberWithCallFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(o2.class), false, this.b);
        }
    }

    public ValidateNumberWithCallFragment() {
        super(R.layout.fragment_validate_number_call);
        d a3 = m.a(ValidateNumberWithCallViewModel.class);
        this.b2 = new a(a3, false, new ValidateNumberWithCallFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
        this.c2 = new i0.b.b.i();
    }

    public void J() {
    }

    public final FragmentValidateNumberCallBinding N0() {
        return (FragmentValidateNumberCallBinding) this.a2.getValue(this, Z1[0]);
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(((ValidateNumberWithCallViewModel) this.b2.getValue()).l, new ValidateNumberWithCallFragment$onViewCreated$1(this, (m0.l.c<? super ValidateNumberWithCallFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        N0().a.setOnClickListener(new a0(this));
        ((AmplitudeAnalytics) v.l(this)).a("Onboarding-PhoneVerifyCall-Start");
        b.a(this, new Permission[]{Permission.READ_CALL_LOG}, 0, (RationaleHandler) null, new ValidateNumberWithCallFragment$onViewCreated$3(this), 6);
    }
}
