package com.clubhouse.android.ui.selection;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.core.ui.R;
import com.clubhouse.core.ui.databinding.FragmentSelectionBinding;
import h0.b0.v;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.x.f;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/clubhouse/android/ui/selection/SelectionFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/ui/selection/SelectionViewModel;", "b2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/selection/SelectionViewModel;", "viewModel", "Lcom/clubhouse/core/ui/databinding/FragmentSelectionBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/core/ui/databinding/FragmentSelectionBinding;", "binding", "<init>", "core-ui_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: SelectionFragment.kt */
public final class SelectionFragment extends Hilt_SelectionFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(SelectionFragment.class), "binding", "getBinding()Lcom/clubhouse/core/ui/databinding/FragmentSelectionBinding;")), m.c(new PropertyReference1Impl(m.a(SelectionFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/selection/SelectionViewModel;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentSelectionBinding.class, this);
    public final c b2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<SelectionFragment, SelectionViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new SelectionFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(f.class), false, this.b);
        }
    }

    public SelectionFragment() {
        super(R.layout.fragment_selection);
        d a3 = m.a(SelectionViewModel.class);
        this.b2 = new a(a3, false, new SelectionFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
    }

    public void J() {
        v.v2(O0(), new SelectionFragment$invalidate$1(this));
    }

    public final FragmentSelectionBinding N0() {
        return (FragmentSelectionBinding) this.a2.getValue(this, Z1[0]);
    }

    public final SelectionViewModel O0() {
        return (SelectionViewModel) this.b2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        N0().a.setOnClickListener(new i0.e.b.g3.x.a(this));
        N0().d.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        EpoxyRecyclerView epoxyRecyclerView = N0().d;
        i.d(epoxyRecyclerView, "binding.selectionList");
        i0.e.b.d3.k.E(epoxyRecyclerView, new SelectionFragment$initSelection$1(this));
    }
}
