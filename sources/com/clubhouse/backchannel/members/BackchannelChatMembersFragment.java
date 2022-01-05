package com.clubhouse.backchannel.members;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.chat.BackchannelChatViewModel;
import com.clubhouse.backchannel.databinding.FragmentBackchannelMembersBinding;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.c.c.y;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/clubhouse/backchannel/members/BackchannelChatMembersFragment;", "Lcom/clubhouse/android/core/ui/BaseExpandedBottomSheetFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/backchannel/members/BackchannelMembersViewModel;", "q2", "Lm0/c;", "getViewModel", "()Lcom/clubhouse/backchannel/members/BackchannelMembersViewModel;", "viewModel", "Lcom/clubhouse/backchannel/chat/BackchannelChatViewModel;", "r2", "getChatViewModel", "()Lcom/clubhouse/backchannel/chat/BackchannelChatViewModel;", "chatViewModel", "Lcom/clubhouse/backchannel/databinding/FragmentBackchannelMembersBinding;", "s2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "U0", "()Lcom/clubhouse/backchannel/databinding/FragmentBackchannelMembersBinding;", "binding", "<init>", "backchannel_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: BackchannelChatMembersFragment.kt */
public final class BackchannelChatMembersFragment extends Hilt_BackchannelChatMembersFragment {
    public static final /* synthetic */ k<Object>[] p2 = {m.c(new PropertyReference1Impl(m.a(BackchannelChatMembersFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/backchannel/members/BackchannelMembersViewModel;")), m.c(new PropertyReference1Impl(m.a(BackchannelChatMembersFragment.class), "chatViewModel", "getChatViewModel()Lcom/clubhouse/backchannel/chat/BackchannelChatViewModel;")), m.c(new PropertyReference1Impl(m.a(BackchannelChatMembersFragment.class), "binding", "getBinding()Lcom/clubhouse/backchannel/databinding/FragmentBackchannelMembersBinding;"))};
    public final c q2;
    public final c r2;
    public final FragmentViewBindingDelegate s2 = new FragmentViewBindingDelegate(FragmentBackchannelMembersBinding.class, this);

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<BackchannelChatMembersFragment, BackchannelMembersViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new BackchannelChatMembersFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(p.class), false, this.b);
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class b extends h<BackchannelChatMembersFragment, BackchannelChatViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ d c;

        public b(d dVar, boolean z, l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new BackchannelChatMembersFragment$special$$inlined$parentFragmentViewModel$default$2$1(this), m.a(y.class), true, this.b);
        }
    }

    public BackchannelChatMembersFragment() {
        super(R.layout.fragment_backchannel_members);
        d a2 = m.a(BackchannelMembersViewModel.class);
        a aVar = new a(a2, false, new BackchannelChatMembersFragment$special$$inlined$fragmentViewModel$default$1(this, a2, a2), a2);
        k<Object>[] kVarArr = p2;
        this.q2 = aVar.a(this, kVarArr[0]);
        d a3 = m.a(BackchannelChatViewModel.class);
        this.r2 = new b(a3, true, new BackchannelChatMembersFragment$special$$inlined$parentFragmentViewModel$default$1(this, a3, a3), a3).a(this, kVarArr[1]);
    }

    public void J() {
        U0().b.g();
    }

    public final FragmentBackchannelMembersBinding U0() {
        return (FragmentBackchannelMembersBinding) this.s2.getValue(this, p2[2]);
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        EpoxyRecyclerView epoxyRecyclerView = U0().b;
        i.d(epoxyRecyclerView, "binding.membersList");
        i0.e.b.d3.k.D(epoxyRecyclerView, this, new BackchannelChatMembersFragment$buildModels$1(this));
        U0().b.setItemAnimator((RecyclerView.k) null);
        U0().a.setOnClickListener(new i0.e.c.i.c(this));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(((BackchannelMembersViewModel) this.q2.getValue()).l, new BackchannelChatMembersFragment$onViewCreated$2(this, (m0.l.c<? super BackchannelChatMembersFragment$onViewCreated$2>) null));
        h0.q.p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
    }
}
