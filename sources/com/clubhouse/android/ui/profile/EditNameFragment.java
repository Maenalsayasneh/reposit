package com.clubhouse.android.ui.profile;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.databinding.FragmentCollectNameBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.ui.onboarding.CollectNameUtil;
import com.clubhouse.android.ui.onboarding.CollectNameUtil$invalidateViews$1;
import com.clubhouse.android.ui.onboarding.CollectNameViewModel;
import com.clubhouse.app.R;
import com.google.android.material.button.MaterialButton;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.r.o0;
import i0.e.b.g3.u.b;
import i0.e.b.g3.u.e;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001e\u001a\u00020\u00198\u0016@\u0016XD¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010$\u001a\u00020\u001f8B@\u0002X\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010*\u001a\u00020%8B@\u0002X\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/clubhouse/android/ui/profile/EditNameFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/ui/onboarding/CollectNameUtil;", "c2", "Lcom/clubhouse/android/ui/onboarding/CollectNameUtil;", "O0", "()Lcom/clubhouse/android/ui/onboarding/CollectNameUtil;", "setCollectNameHelper", "(Lcom/clubhouse/android/ui/onboarding/CollectNameUtil;)V", "collectNameHelper", "Lcom/clubhouse/android/ui/onboarding/CollectNameViewModel;", "b2", "Lm0/c;", "getViewModel", "()Lcom/clubhouse/android/ui/onboarding/CollectNameViewModel;", "viewModel", "", "d2", "Z", "K0", "()Z", "shouldShowKeyboard", "Lcom/clubhouse/android/ui/profile/EditNameArgs;", "e2", "Lm0/o/c;", "getArgs", "()Lcom/clubhouse/android/ui/profile/EditNameArgs;", "args", "Lcom/clubhouse/android/databinding/FragmentCollectNameBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentCollectNameBinding;", "binding", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: EditNameFragment.kt */
public final class EditNameFragment extends Hilt_EditNameFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(EditNameFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentCollectNameBinding;")), m.c(new PropertyReference1Impl(m.a(EditNameFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/onboarding/CollectNameViewModel;")), m.c(new PropertyReference1Impl(m.a(EditNameFragment.class), "args", "getArgs()Lcom/clubhouse/android/ui/profile/EditNameArgs;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentCollectNameBinding.class, this);
    public final c b2;
    public CollectNameUtil c2;
    public final boolean d2;
    public final m0.o.c e2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<EditNameFragment, CollectNameViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new EditNameFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(o0.class), false, this.b);
        }
    }

    public EditNameFragment() {
        super(R.layout.fragment_collect_name);
        d a3 = m.a(CollectNameViewModel.class);
        this.b2 = new a(a3, false, new EditNameFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
        this.d2 = true;
        this.e2 = new i0.b.b.i();
    }

    public void J() {
        CollectNameUtil O0 = O0();
        v.v2(O0.c, new CollectNameUtil$invalidateViews$1(O0));
    }

    public boolean K0() {
        return this.d2;
    }

    public final FragmentCollectNameBinding N0() {
        return (FragmentCollectNameBinding) this.a2.getValue(this, Z1[0]);
    }

    public final CollectNameUtil O0() {
        CollectNameUtil collectNameUtil = this.c2;
        if (collectNameUtil != null) {
            return collectNameUtil;
        }
        i.m("collectNameHelper");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        CollectNameUtil collectNameUtil = new CollectNameUtil(this, N0(), (CollectNameViewModel) this.b2.getValue());
        i.e(collectNameUtil, "<set-?>");
        this.c2 = collectNameUtil;
        O0().b();
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(((CollectNameViewModel) this.b2.getValue()).l, new EditNameFragment$initEffectsHandler$1(this, (m0.l.c<? super EditNameFragment$initEffectsHandler$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        Toolbar toolbar = N0().g;
        i.d(toolbar, "binding.toolbar");
        i0.e.b.d3.k.K(toolbar);
        N0().a.setOnClickListener(new b(this));
        N0().f.setText(getString(R.string.correct_your_full_name));
        N0().e.setText(getString(R.string.update));
        ((MaterialButton) N0().e).setIcon((Drawable) null);
        N0().e.setOnClickListener(new e(this));
        m0.o.c cVar = this.e2;
        k<Object>[] kVarArr = Z1;
        String str = ((EditNameArgs) cVar.getValue(this, kVarArr[2])).c;
        if (str != null) {
            N0().b.setText(str);
        }
        String str2 = ((EditNameArgs) this.e2.getValue(this, kVarArr[2])).d;
        if (str2 != null) {
            N0().c.setText(str2);
        }
    }
}
