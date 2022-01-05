package com.clubhouse.android.ui.profile;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.airbnb.mvrx.DeliveryMode;
import com.clubhouse.android.core.ui.BaseBottomSheetFragment;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.b.b.g;
import i0.b.b.h;
import i0.b.b.q;
import i0.e.b.g3.u.n4;
import i0.e.b.g3.u.p;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0017\u0010\u0010J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00118F@\u0006X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/clubhouse/android/ui/profile/HalfProfileContainerFragment;", "Lcom/clubhouse/android/core/ui/BaseBottomSheetFragment;", "Li0/b/b/q;", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Li0/h/a/c/g/d;", "R0", "(Landroid/os/Bundle;)Li0/h/a/c/g/d;", "J", "()V", "Lcom/clubhouse/android/ui/profile/HalfProfileContainerViewModel;", "m2", "Lm0/c;", "getViewModel", "()Lcom/clubhouse/android/ui/profile/HalfProfileContainerViewModel;", "viewModel", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: HalfProfileContainerFragment.kt */
public final class HalfProfileContainerFragment extends BaseBottomSheetFragment implements q {
    public static final /* synthetic */ k<Object>[] l2 = {m.c(new PropertyReference1Impl(m.a(HalfProfileContainerFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/profile/HalfProfileContainerViewModel;"))};
    public final c m2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<HalfProfileContainerFragment, HalfProfileContainerViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new HalfProfileContainerFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(n4.class), false, this.b);
        }
    }

    public HalfProfileContainerFragment() {
        super(R.layout.fragment_half_profile_container);
        d a2 = m.a(HalfProfileContainerViewModel.class);
        this.m2 = new a(a2, false, new HalfProfileContainerFragment$special$$inlined$fragmentViewModel$default$1(this, a2, a2), a2).a(this, l2[0]);
    }

    public void J() {
    }

    public Dialog L0(Bundle bundle) {
        i0.h.a.c.g.d R0 = super.L0(bundle);
        R0.setOnKeyListener(new p(this));
        return R0;
    }

    public i0.h.a.c.g.d R0(Bundle bundle) {
        i0.h.a.c.g.d R0 = super.L0(bundle);
        R0.setOnKeyListener(new p(this));
        return R0;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        N0(0, 2132017462);
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        v.U1(this);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(((HalfProfileContainerViewModel) this.m2.getValue()).l, new HalfProfileContainerFragment$onViewCreated$1(this, (m0.l.c<? super HalfProfileContainerFragment$onViewCreated$1>) null));
        h0.q.p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, h0.q.q.a(viewLifecycleOwner));
        v.l1(this, (HalfProfileContainerViewModel) this.m2.getValue(), HalfProfileContainerFragment$onViewCreated$2.c, (DeliveryMode) null, new HalfProfileContainerFragment$onViewCreated$3(this, (m0.l.c<? super HalfProfileContainerFragment$onViewCreated$3>) null), 2, (Object) null);
        h0.o.a.k activity = getActivity();
        if (activity != null) {
            activity.setIntent((Intent) null);
        }
        Fragment I = getChildFragmentManager().I(R.id.profile_host);
        Objects.requireNonNull(I, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavController J0 = ((NavHostFragment) I).J0();
        h0.t.m c = J0.f().c(R.navigation.main_graph);
        c.u(R.id.halfProfileFragment);
        J0.o(c, getArguments());
    }
}
