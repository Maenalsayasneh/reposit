package com.clubhouse.backchannel.members;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.databinding.FragmentBackchannelAddMemberBinding;
import h0.b0.v;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.c.i.b;
import i0.e.c.i.p;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/clubhouse/backchannel/members/BackchannelAddMemberFragment;", "Lcom/clubhouse/android/core/ui/BaseExpandedBottomSheetFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/backchannel/databinding/FragmentBackchannelAddMemberBinding;", "r2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "U0", "()Lcom/clubhouse/backchannel/databinding/FragmentBackchannelAddMemberBinding;", "binding", "Lcom/clubhouse/backchannel/members/BackchannelMembersViewModel;", "q2", "Lm0/c;", "V0", "()Lcom/clubhouse/backchannel/members/BackchannelMembersViewModel;", "viewModel", "<init>", "backchannel_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: BackchannelAddMemberFragment.kt */
public final class BackchannelAddMemberFragment extends Hilt_BackchannelAddMemberFragment {
    public static final /* synthetic */ k<Object>[] p2 = {m.c(new PropertyReference1Impl(m.a(BackchannelAddMemberFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/backchannel/members/BackchannelMembersViewModel;")), m.c(new PropertyReference1Impl(m.a(BackchannelAddMemberFragment.class), "binding", "getBinding()Lcom/clubhouse/backchannel/databinding/FragmentBackchannelAddMemberBinding;"))};
    public final c q2;
    public final FragmentViewBindingDelegate r2 = new FragmentViewBindingDelegate(FragmentBackchannelAddMemberBinding.class, this);

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<BackchannelAddMemberFragment, BackchannelMembersViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new BackchannelAddMemberFragment$special$$inlined$parentFragmentViewModel$default$2$1(this), m.a(p.class), true, this.b);
        }
    }

    public BackchannelAddMemberFragment() {
        super(R.layout.fragment_backchannel_add_member);
        d a2 = m.a(BackchannelMembersViewModel.class);
        this.q2 = new a(a2, true, new BackchannelAddMemberFragment$special$$inlined$parentFragmentViewModel$default$1(this, a2, a2), a2).a(this, p2[0]);
    }

    public void J() {
        v.v2(V0(), new BackchannelAddMemberFragment$invalidate$1(this));
    }

    public final FragmentBackchannelAddMemberBinding U0() {
        return (FragmentBackchannelAddMemberBinding) this.r2.getValue(this, p2[1]);
    }

    public final BackchannelMembersViewModel V0() {
        return (BackchannelMembersViewModel) this.q2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        EpoxyRecyclerView epoxyRecyclerView = U0().c;
        i.d(epoxyRecyclerView, "binding.results");
        i0.e.b.d3.k.D(epoxyRecyclerView, this, new BackchannelAddMemberFragment$onViewCreated$1(this));
        U0().a.setOnClickListener(new b(this));
        EditText editText = U0().d;
        i.d(editText, "binding.search");
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(i0.e.b.d3.k.f(editText), new BackchannelAddMemberFragment$onViewCreated$3(this, (m0.l.c<? super BackchannelAddMemberFragment$onViewCreated$3>) null));
        h0.q.p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(V0().l, new BackchannelAddMemberFragment$onViewCreated$4(this, (m0.l.c<? super BackchannelAddMemberFragment$onViewCreated$4>) null));
        h0.q.p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, q.a(viewLifecycleOwner2));
    }
}
