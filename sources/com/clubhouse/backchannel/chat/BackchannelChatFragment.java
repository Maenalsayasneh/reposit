package com.clubhouse.backchannel.chat;

import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.mvrx.DeliveryMode;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.shared.ui.ImpressionTrackingEpoxyRecyclerView;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.databinding.FragmentBackchannelChatBinding;
import com.clubhouse.backchannel.ui.FadingEdgeCarousel;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.c.c.d0;
import i0.e.c.c.n;
import i0.e.c.c.y;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/clubhouse/backchannel/chat/BackchannelChatFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/backchannel/chat/BackchannelChatViewModel;", "c2", "Lm0/c;", "P0", "()Lcom/clubhouse/backchannel/chat/BackchannelChatViewModel;", "viewModel", "Lcom/clubhouse/backchannel/databinding/FragmentBackchannelChatBinding;", "b2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "O0", "()Lcom/clubhouse/backchannel/databinding/FragmentBackchannelChatBinding;", "binding", "Li0/e/b/z2/f/c;", "a2", "Li0/e/b/z2/f/c;", "getChannelNavigator", "()Li0/e/b/z2/f/c;", "setChannelNavigator", "(Li0/e/b/z2/f/c;)V", "channelNavigator", "<init>", "backchannel_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: BackchannelChatFragment.kt */
public final class BackchannelChatFragment extends Hilt_BackchannelChatFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(BackchannelChatFragment.class), "binding", "getBinding()Lcom/clubhouse/backchannel/databinding/FragmentBackchannelChatBinding;")), m.c(new PropertyReference1Impl(m.a(BackchannelChatFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/backchannel/chat/BackchannelChatViewModel;"))};
    public i0.e.b.z2.f.c a2;
    public final FragmentViewBindingDelegate b2 = new FragmentViewBindingDelegate(FragmentBackchannelChatBinding.class, this);
    public final m0.c c2;

    /* compiled from: ViewUtil.kt */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ View c;
        public final /* synthetic */ BackchannelChatFragment d;

        public a(View view, BackchannelChatFragment backchannelChatFragment) {
            this.c = view;
            this.d = backchannelChatFragment;
        }

        public void onGlobalLayout() {
            if (this.c.getMeasuredWidth() > 0 && this.c.getMeasuredHeight() > 0) {
                this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                BackchannelChatFragment backchannelChatFragment = this.d;
                k<Object>[] kVarArr = BackchannelChatFragment.Z1;
                backchannelChatFragment.O0().e.post(new b(this.d));
            }
        }
    }

    /* compiled from: BackchannelChatFragment.kt */
    public static final class b implements Runnable {
        public final /* synthetic */ BackchannelChatFragment c;

        public b(BackchannelChatFragment backchannelChatFragment) {
            this.c = backchannelChatFragment;
        }

        public final void run() {
            if (i0.e.b.d3.k.s(this.c)) {
                BackchannelChatFragment backchannelChatFragment = this.c;
                k<Object>[] kVarArr = BackchannelChatFragment.Z1;
                backchannelChatFragment.O0().e.scrollToPosition(0);
            }
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class c extends h<BackchannelChatFragment, BackchannelChatViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ d c;

        public c(d dVar, boolean z, l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public m0.c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new BackchannelChatFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(y.class), false, this.b);
        }
    }

    public BackchannelChatFragment() {
        super(R.layout.fragment_backchannel_chat);
        d a3 = m.a(BackchannelChatViewModel.class);
        this.c2 = new c(a3, false, new BackchannelChatFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
    }

    public static final void N0(BackchannelChatFragment backchannelChatFragment, i0.e.c.f.b.a.c cVar, int i) {
        Integer e;
        if (i == 4 && (e = cVar.e()) != null) {
            backchannelChatFragment.P0().p(new d0(e.intValue()));
        }
    }

    public void J() {
        v.v2(P0(), new BackchannelChatFragment$invalidate$1(this));
    }

    public final FragmentBackchannelChatBinding O0() {
        return (FragmentBackchannelChatBinding) this.b2.getValue(this, Z1[0]);
    }

    public final BackchannelChatViewModel P0() {
        return (BackchannelChatViewModel) this.c2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        O0().k.setBackgroundColor(v.t0(this));
        ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView = O0().e;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, true);
        linearLayoutManager.setStackFromEnd(true);
        impressionTrackingEpoxyRecyclerView.setLayoutManager(linearLayoutManager);
        ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView2 = O0().e;
        i.d(impressionTrackingEpoxyRecyclerView2, "binding.chatList");
        i0.e.b.d3.k.D(impressionTrackingEpoxyRecyclerView2, this, new BackchannelChatFragment$onViewCreated$2(this));
        O0().b.setOnClickListener(new i0.e.c.c.b(this));
        Button button = O0().h;
        i.d(button, "binding.send");
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button, q.a(viewLifecycleOwner), new n(this));
        Button button2 = O0().i;
        i.d(button2, "binding.startRoom");
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button2, q.a(viewLifecycleOwner2), new i0.e.c.c.m(this));
        EditText editText = O0().f;
        i.d(editText, "binding.composer");
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(i0.e.b.d3.k.M(editText), new BackchannelChatFragment$onViewCreated$6(this, (m0.l.c<? super BackchannelChatFragment$onViewCreated$6>) null));
        p viewLifecycleOwner3 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner3, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner3));
        Toolbar toolbar = O0().k;
        i.d(toolbar, "binding.toolbar");
        p viewLifecycleOwner4 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner4, "viewLifecycleOwner");
        i0.e.b.d3.k.H(toolbar, q.a(viewLifecycleOwner4), new i0.e.c.c.a(this));
        FadingEdgeCarousel fadingEdgeCarousel = O0().a;
        i.d(fadingEdgeCarousel, "binding.avatars");
        i0.e.b.d3.k.D(fadingEdgeCarousel, this, new BackchannelChatFragment$buildHeaderAvatars$1(this));
        O0().a.setItemSpacingDp(0);
        v.l1(this, P0(), BackchannelChatFragment$onViewCreated$8.c, (DeliveryMode) null, new BackchannelChatFragment$onViewCreated$9(this, (m0.l.c<? super BackchannelChatFragment$onViewCreated$9>) null), 2, (Object) null);
        v.g(this, new BackchannelChatFragment$onViewCreated$10(this));
        ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView3 = O0().e;
        i.d(impressionTrackingEpoxyRecyclerView3, "binding.chatList");
        impressionTrackingEpoxyRecyclerView3.getViewTreeObserver().addOnGlobalLayoutListener(new a(impressionTrackingEpoxyRecyclerView3, this));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(P0().l, new BackchannelChatFragment$onViewCreated$12(this, (m0.l.c<? super BackchannelChatFragment$onViewCreated$12>) null));
        p viewLifecycleOwner5 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner5, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, q.a(viewLifecycleOwner5));
        v.v2(P0(), new BackchannelChatFragment$onViewCreated$13(this));
    }
}
