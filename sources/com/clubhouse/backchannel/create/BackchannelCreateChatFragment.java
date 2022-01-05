package com.clubhouse.backchannel.create;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.mvrx.DeliveryMode;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.databinding.FragmentBackchannelCreateChatBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u00020\u00118\u0016@\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/clubhouse/backchannel/create/BackchannelCreateChatFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/ui/backchannel/CreateChatArgs;", "c2", "Lm0/o/c;", "getArgs", "()Lcom/clubhouse/android/ui/backchannel/CreateChatArgs;", "args", "", "d2", "Z", "K0", "()Z", "shouldShowKeyboard", "Lcom/clubhouse/backchannel/databinding/FragmentBackchannelCreateChatBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/backchannel/databinding/FragmentBackchannelCreateChatBinding;", "binding", "Lcom/clubhouse/backchannel/create/BackchannelCreateChatViewModel;", "b2", "Lm0/c;", "O0", "()Lcom/clubhouse/backchannel/create/BackchannelCreateChatViewModel;", "viewModel", "<init>", "backchannel_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: BackchannelCreateChatFragment.kt */
public final class BackchannelCreateChatFragment extends Hilt_BackchannelCreateChatFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(BackchannelCreateChatFragment.class), "binding", "getBinding()Lcom/clubhouse/backchannel/databinding/FragmentBackchannelCreateChatBinding;")), m.c(new PropertyReference1Impl(m.a(BackchannelCreateChatFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/backchannel/create/BackchannelCreateChatViewModel;")), m.c(new PropertyReference1Impl(m.a(BackchannelCreateChatFragment.class), "args", "getArgs()Lcom/clubhouse/android/ui/backchannel/CreateChatArgs;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentBackchannelCreateChatBinding.class, this);
    public final c b2;
    public final m0.o.c c2;
    public final boolean d2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<BackchannelCreateChatFragment, BackchannelCreateChatViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new BackchannelCreateChatFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(i0.e.c.e.h.class), false, this.b);
        }
    }

    public BackchannelCreateChatFragment() {
        super(R.layout.fragment_backchannel_create_chat);
        d a3 = m.a(BackchannelCreateChatViewModel.class);
        this.b2 = new a(a3, false, new BackchannelCreateChatFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
        this.c2 = new i0.b.b.i();
        this.d2 = true;
    }

    public void J() {
        v.v2(O0(), new BackchannelCreateChatFragment$invalidate$1(this));
    }

    public boolean K0() {
        return this.d2;
    }

    public final FragmentBackchannelCreateChatBinding N0() {
        return (FragmentBackchannelCreateChatBinding) this.a2.getValue(this, Z1[0]);
    }

    public final BackchannelCreateChatViewModel O0() {
        return (BackchannelCreateChatViewModel) this.b2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        N0().a.setBackgroundColor(v.t0(this));
        N0().h.setBackgroundColor(v.t0(this));
        N0().b.setOnClickListener(new i0.e.c.e.a(this));
        EpoxyRecyclerView epoxyRecyclerView = N0().f;
        i.d(epoxyRecyclerView, "binding.results");
        i0.e.b.d3.k.D(epoxyRecyclerView, this, new BackchannelCreateChatFragment$onViewCreated$2(this));
        N0().f.setItemAnimator((RecyclerView.k) null);
        EditText editText = N0().g;
        i.d(editText, "binding.search");
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(i0.e.b.d3.k.f(editText), new BackchannelCreateChatFragment$onViewCreated$3(this, (m0.l.c<? super BackchannelCreateChatFragment$onViewCreated$3>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        FloatingActionButton floatingActionButton = N0().c;
        i.d(floatingActionButton, "binding.create");
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        i0.e.b.d3.k.H(floatingActionButton, q.a(viewLifecycleOwner2), new i0.e.c.e.d(this));
        v.g(this, new BackchannelCreateChatFragment$onViewCreated$5(this));
        v.h1(this, O0(), BackchannelCreateChatFragment$onViewCreated$6.c, (DeliveryMode) null, new BackchannelCreateChatFragment$onViewCreated$7(this, (m0.l.c<? super BackchannelCreateChatFragment$onViewCreated$7>) null), new BackchannelCreateChatFragment$onViewCreated$8(this, (m0.l.c<? super BackchannelCreateChatFragment$onViewCreated$8>) null), 2, (Object) null);
    }
}
