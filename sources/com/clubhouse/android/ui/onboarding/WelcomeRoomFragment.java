package com.clubhouse.android.ui.onboarding;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$epoxyView$3;
import com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$epoxyView$4;
import com.clubhouse.android.databinding.FragmentWelcomeRoomBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.r.d0;
import i0.e.b.g3.r.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/clubhouse/android/ui/onboarding/WelcomeRoomFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/airbnb/epoxy/LifecycleAwareEpoxyViewBinder;", "c2", "Lm0/c;", "getWelcomeChannelViewBinder", "()Lcom/airbnb/epoxy/LifecycleAwareEpoxyViewBinder;", "welcomeChannelViewBinder", "Lcom/clubhouse/android/ui/onboarding/WelcomeRoomViewModel;", "a2", "O0", "()Lcom/clubhouse/android/ui/onboarding/WelcomeRoomViewModel;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentWelcomeRoomBinding;", "b2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "getBinding", "()Lcom/clubhouse/android/databinding/FragmentWelcomeRoomBinding;", "binding", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: WelcomeRoomFragment.kt */
public final class WelcomeRoomFragment extends Hilt_WelcomeRoomFragment {
    public static final /* synthetic */ k<Object>[] Z1;
    public final c a2;
    public final FragmentViewBindingDelegate b2 = new FragmentViewBindingDelegate(FragmentWelcomeRoomBinding.class, this);
    public final c c2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<WelcomeRoomFragment, WelcomeRoomViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new WelcomeRoomFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(y2.class), false, this.b);
        }
    }

    static {
        k<Object>[] kVarArr = new k[3];
        kVarArr[0] = m.c(new PropertyReference1Impl(m.a(WelcomeRoomFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/onboarding/WelcomeRoomViewModel;"));
        kVarArr[1] = m.c(new PropertyReference1Impl(m.a(WelcomeRoomFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentWelcomeRoomBinding;"));
        Z1 = kVarArr;
    }

    public WelcomeRoomFragment() {
        super(R.layout.fragment_welcome_room);
        d a3 = m.a(WelcomeRoomViewModel.class);
        this.a2 = new a(a3, false, new WelcomeRoomFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[0]);
        WelcomeRoomFragment$welcomeChannelViewBinder$2 welcomeRoomFragment$welcomeChannelViewBinder$2 = new WelcomeRoomFragment$welcomeChannelViewBinder$2(this);
        EpoxyViewBinderExtensionsKt$epoxyView$3 epoxyViewBinderExtensionsKt$epoxyView$3 = EpoxyViewBinderExtensionsKt$epoxyView$3.c;
        i.e(this, "$this$epoxyView");
        i.e(epoxyViewBinderExtensionsKt$epoxyView$3, "initializer");
        i.e(welcomeRoomFragment$welcomeChannelViewBinder$2, "modelProvider");
        this.c2 = i0.j.f.p.h.H2(new EpoxyViewBinderExtensionsKt$epoxyView$4(this, R.id.welcome_channel, false, false, epoxyViewBinderExtensionsKt$epoxyView$3, welcomeRoomFragment$welcomeChannelViewBinder$2));
    }

    public static final FragmentWelcomeRoomBinding N0(WelcomeRoomFragment welcomeRoomFragment) {
        return (FragmentWelcomeRoomBinding) welcomeRoomFragment.b2.getValue(welcomeRoomFragment, Z1[1]);
    }

    public void J() {
        v.v2(O0(), new WelcomeRoomFragment$invalidate$1(this));
    }

    public final WelcomeRoomViewModel O0() {
        return (WelcomeRoomViewModel) this.a2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        v.h1(this, O0(), WelcomeRoomFragment$onViewCreated$1.c, v.q2(this, (String) null, 1, (Object) null), (p) null, new WelcomeRoomFragment$onViewCreated$2(this, (m0.l.c<? super WelcomeRoomFragment$onViewCreated$2>) null), 4, (Object) null);
        Button button = ((FragmentWelcomeRoomBinding) this.b2.getValue(this, Z1[1])).d;
        i.d(button, "binding.noThanks");
        h0.q.p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button, q.a(viewLifecycleOwner), new d0(this));
    }
}
