package com.clubhouse.backchannel.inbox;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.airbnb.mvrx.DeliveryMode;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.databinding.FragmentBackchannelInboxBinding;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.a.o;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.c.h.b;
import i0.e.c.h.e;
import i0.e.c.h.f;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/clubhouse/backchannel/inbox/BackchannelInboxFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "()V", "J", "Lcom/clubhouse/backchannel/databinding/FragmentBackchannelInboxBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "O0", "()Lcom/clubhouse/backchannel/databinding/FragmentBackchannelInboxBinding;", "binding", "Li0/b/a/o;", "d2", "Li0/b/a/o;", "requestsController", "c2", "chatsController", "Lcom/clubhouse/backchannel/inbox/BackchannelInboxViewModel;", "b2", "Lm0/c;", "P0", "()Lcom/clubhouse/backchannel/inbox/BackchannelInboxViewModel;", "viewModel", "<init>", "backchannel_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: BackchannelInboxFragment.kt */
public final class BackchannelInboxFragment extends Hilt_BackchannelInboxFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(BackchannelInboxFragment.class), "binding", "getBinding()Lcom/clubhouse/backchannel/databinding/FragmentBackchannelInboxBinding;")), m.c(new PropertyReference1Impl(m.a(BackchannelInboxFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/backchannel/inbox/BackchannelInboxViewModel;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentBackchannelInboxBinding.class, this);
    public final c b2;
    public o c2;
    public o d2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<BackchannelInboxFragment, BackchannelInboxViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new BackchannelInboxFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(i0.e.c.h.k.class), false, this.b);
        }
    }

    public BackchannelInboxFragment() {
        super(R.layout.fragment_backchannel_inbox);
        d a3 = m.a(BackchannelInboxViewModel.class);
        this.b2 = new a(a3, false, new BackchannelInboxFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
    }

    public static final void N0(BackchannelInboxFragment backchannelInboxFragment, o oVar, i0.e.c.f.b.a.a aVar) {
        Objects.requireNonNull(backchannelInboxFragment);
        i0.e.c.h.p.c cVar = new i0.e.c.h.p.c();
        cVar.N(aVar.a);
        cVar.L(aVar);
        cVar.M(new e(backchannelInboxFragment, aVar));
        cVar.O(new i0.e.c.h.d(backchannelInboxFragment, aVar));
        oVar.add(cVar);
    }

    public void J() {
        v.v2(P0(), new BackchannelInboxFragment$invalidate$1(this));
    }

    public final FragmentBackchannelInboxBinding O0() {
        return (FragmentBackchannelInboxBinding) this.a2.getValue(this, Z1[0]);
    }

    public final BackchannelInboxViewModel P0() {
        return (BackchannelInboxViewModel) this.b2.getValue();
    }

    public void onResume() {
        super.onResume();
        P0().p(i0.e.c.h.l.a);
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        O0().h.setBackgroundColor(v.t0(this));
        O0().g.setBackgroundColor(v.t0(this));
        this.c2 = new BackchannelInboxFragment$onViewCreated$1(this);
        this.d2 = new BackchannelInboxFragment$onViewCreated$2(this);
        O0().a.setOnClickListener(new b(this));
        O0().e.setNestedScrollingEnabled(false);
        O0().e.setOnRefreshListener(new i0.e.c.h.c(this));
        ImageView imageView = O0().b;
        i.d(imageView, "binding.createChat");
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        i0.e.b.d3.k.H(imageView, q.a(viewLifecycleOwner), new f(this));
        ImageView imageView2 = O0().f;
        i.d(imageView2, "binding.settings");
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        i0.e.b.d3.k.H(imageView2, q.a(viewLifecycleOwner2), new i0.e.c.h.a(this));
        v.l1(this, P0(), BackchannelInboxFragment$onViewCreated$7.c, (DeliveryMode) null, new BackchannelInboxFragment$onViewCreated$8(this, (m0.l.c<? super BackchannelInboxFragment$onViewCreated$8>) null), 2, (Object) null);
        v.l1(this, P0(), BackchannelInboxFragment$onViewCreated$9.c, (DeliveryMode) null, new BackchannelInboxFragment$onViewCreated$10(this, (m0.l.c<? super BackchannelInboxFragment$onViewCreated$10>) null), 2, (Object) null);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(P0().l, new BackchannelInboxFragment$onViewCreated$11(this, (m0.l.c<? super BackchannelInboxFragment$onViewCreated$11>) null));
        p viewLifecycleOwner3 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner3, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner3));
    }
}
