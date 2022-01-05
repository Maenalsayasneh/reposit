package com.clubhouse.android.ui.clubs.create.topics;

import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import com.airbnb.mvrx.DeliveryMode;
import com.clubhouse.android.databinding.FragmentInterestsBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.b.b.g;
import i0.b.b.h;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/clubhouse/android/ui/clubs/create/topics/ClubTopicsFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/databinding/FragmentInterestsBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "getBinding", "()Lcom/clubhouse/android/databinding/FragmentInterestsBinding;", "binding", "Lcom/clubhouse/android/ui/clubs/create/topics/ClubTopicsViewModel;", "b2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/clubs/create/topics/ClubTopicsViewModel;", "viewModel", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ClubTopicsFragment.kt */
public final class ClubTopicsFragment extends Hilt_ClubTopicsFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(ClubTopicsFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentInterestsBinding;")), m.c(new PropertyReference1Impl(m.a(ClubTopicsFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/clubs/create/topics/ClubTopicsViewModel;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentInterestsBinding.class, this);
    public final c b2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<ClubTopicsFragment, ClubTopicsViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new ClubTopicsFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(i0.e.b.g3.l.v2.z.d.class), false, this.b);
        }
    }

    public ClubTopicsFragment() {
        super(R.layout.fragment_interests);
        d a3 = m.a(ClubTopicsViewModel.class);
        this.b2 = new a(a3, false, new ClubTopicsFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
    }

    public static final FragmentInterestsBinding N0(ClubTopicsFragment clubTopicsFragment) {
        return (FragmentInterestsBinding) clubTopicsFragment.a2.getValue(clubTopicsFragment, Z1[0]);
    }

    public void J() {
        v.v2(O0(), new ClubTopicsFragment$invalidate$1(this));
    }

    public final ClubTopicsViewModel O0() {
        return (ClubTopicsViewModel) this.b2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        i.d(onBackPressedDispatcher, "requireActivity().onBackPressedDispatcher");
        g0.a.b.b.a.a(onBackPressedDispatcher, this, false, new ClubTopicsFragment$onViewCreated$1(this), 2);
        ((FragmentInterestsBinding) this.a2.getValue(this, Z1[0])).a.setOnClickListener(new i0.e.b.g3.l.v2.z.a(this));
        v.l1(this, O0(), ClubTopicsFragment$onViewCreated$3.c, (DeliveryMode) null, new ClubTopicsFragment$onViewCreated$4(this, (m0.l.c<? super ClubTopicsFragment$onViewCreated$4>) null), 2, (Object) null);
    }
}
