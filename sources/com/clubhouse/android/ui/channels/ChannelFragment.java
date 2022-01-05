package com.clubhouse.android.ui.channels;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1;
import androidx.recyclerview.widget.GridLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.mvrx.DeliveryMode;
import com.clubhouse.android.channels.model.AudienceType;
import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.channels.repos.SpeakerStateDataSource;
import com.clubhouse.android.core.ui.SafeMotionLayout;
import com.clubhouse.android.databinding.FragmentChannelBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.ui.ChannelDisplayState;
import com.clubhouse.android.ui.NavigationViewModel;
import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.b.b.k0;
import i0.e.b.g3.k.f;
import i0.e.b.g3.k.s0;
import i0.e.b.g3.k.y;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0004R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u00020\u00158\u0016@\u0016XD¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001a8@@\u0000X\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\u00020 8B@\u0002X\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010.\u001a\u00020*8B@\u0002X\u0002¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/clubhouse/android/ui/channels/ChannelFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Lm0/i;", "O0", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "P0", "Li0/e/a/b/a;", "a2", "Li0/e/a/b/a;", "getActionTrailRecorder", "()Li0/e/a/b/a;", "setActionTrailRecorder", "(Li0/e/a/b/a;)V", "actionTrailRecorder", "", "shouldAdjustResize", "Z", "J0", "()Z", "Lcom/clubhouse/android/channels/mvi/ChannelViewModel;", "d2", "Lm0/c;", "S0", "()Lcom/clubhouse/android/channels/mvi/ChannelViewModel;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentChannelBinding;", "b2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "Q0", "()Lcom/clubhouse/android/databinding/FragmentChannelBinding;", "binding", "Lh0/a/b;", "e2", "Lh0/a/b;", "collapseOnBackPress", "Lcom/clubhouse/android/ui/NavigationViewModel;", "c2", "R0", "()Lcom/clubhouse/android/ui/NavigationViewModel;", "navigationViewModel", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ChannelFragment.kt */
public final class ChannelFragment extends Hilt_ChannelFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(ChannelFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentChannelBinding;")), m.c(new PropertyReference1Impl(m.a(ChannelFragment.class), "navigationViewModel", "getNavigationViewModel()Lcom/clubhouse/android/ui/NavigationViewModel;")), m.c(new PropertyReference1Impl(m.a(ChannelFragment.class), "viewModel", "getViewModel$app_productionRelease()Lcom/clubhouse/android/channels/mvi/ChannelViewModel;"))};
    public i0.e.a.b.a a2;
    public final FragmentViewBindingDelegate b2 = new FragmentViewBindingDelegate(FragmentChannelBinding.class, this);
    public final c c2;
    public final c d2;
    public h0.a.b e2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<ChannelFragment, ChannelViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new ChannelFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(i0.e.b.z2.g.l.class), false, this.b);
        }
    }

    /* compiled from: MavericksExtensions.kt */
    public static final class b extends h<ChannelFragment, NavigationViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ p b;
        public final /* synthetic */ d c;

        public b(d dVar, int i, p pVar, d dVar2) {
            this.a = dVar;
            this.b = pVar;
            this.c = dVar2;
        }

        public c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            k0 k0Var = g.a;
            if (k0Var instanceof i0.b.b.l0.a) {
                return ((i0.b.b.l0.a) k0Var).a(fragment, kVar, this.a, new ChannelFragment$special$$inlined$navGraphViewModel$default$2$1(this), m.a(i0.e.b.g3.h.class), R.id.main_graph, this.b);
            }
            throw new IllegalStateException("Navigation ViewModels require that Mavericks.viewModelDelegateFactory have an implementation of NavigationViewModelDelegateFactory.\n \n To setup the default factory configuration, you can use the default factory DefaultNavigationViewModelDelegateFactory.\n DefaultNavigationViewModelDelegateFactory also implements DefaultViewModelDelegateFactory by default.\n \n Mavericks.viewModelDelegateFactory = DefaultNavigationViewModelDelegateFactory()");
        }
    }

    public ChannelFragment() {
        super(R.layout.fragment_channel);
        d a3 = m.a(NavigationViewModel.class);
        b bVar = new b(a3, R.id.main_graph, new ChannelFragment$special$$inlined$navGraphViewModel$default$1(this, a3, a3), a3);
        k<Object>[] kVarArr = Z1;
        this.c2 = bVar.a(this, kVarArr[1]);
        d a4 = m.a(ChannelViewModel.class);
        this.d2 = new a(a4, false, new ChannelFragment$special$$inlined$fragmentViewModel$default$1(this, a4, a4), a4).a(this, kVarArr[2]);
    }

    public static final void N0(ChannelFragment channelFragment, ActionSheetBuilder actionSheetBuilder, AudienceType audienceType, boolean z) {
        Objects.requireNonNull(channelFragment);
        actionSheetBuilder.a(new ChannelFragment$audienceOption$1(audienceType, channelFragment, z));
    }

    public void J() {
        v.v2(S0(), new ChannelFragment$invalidate$1(this));
    }

    public boolean J0() {
        return false;
    }

    public final void O0() {
        R0().q(ChannelDisplayState.COLLAPSED);
        SafeMotionLayout safeMotionLayout = Q0().a;
        i.d(safeMotionLayout, "binding.root");
        int endState = Q0().a.getEndState();
        ChannelFragment$collapse$1 channelFragment$collapse$1 = new ChannelFragment$collapse$1(this);
        i.e(safeMotionLayout, "<this>");
        i.e(channelFragment$collapse$1, "f");
        safeMotionLayout.setTransitionListener(new i0.e.b.a3.f.p(endState, channelFragment$collapse$1));
        Button button = Q0().o;
        i.d(button, "binding.iconLeave");
        i0.e.b.d3.k.K(button);
        View view = Q0().g;
        i.d(view, "binding.collapsedVirtualBackground");
        i0.e.b.d3.k.K(view);
        Q0().a.I();
        h0.a.b bVar = this.e2;
        if (bVar != null) {
            bVar.a = false;
        } else {
            i.m("collapseOnBackPress");
            throw null;
        }
    }

    public final void P0() {
        LifecycleCoroutineScope a3 = q.a(this);
        ChannelFragment$expand$1 channelFragment$expand$1 = new ChannelFragment$expand$1(this, (m0.l.c<? super ChannelFragment$expand$1>) null);
        i.e(channelFragment$expand$1, "block");
        m0.r.t.a.r.m.a1.a.E2(a3, (e) null, (CoroutineStart) null, new LifecycleCoroutineScope$launchWhenStarted$1(a3, channelFragment$expand$1, (m0.l.c) null), 3, (Object) null);
    }

    public final FragmentChannelBinding Q0() {
        return (FragmentChannelBinding) this.b2.getValue(this, Z1[0]);
    }

    public final NavigationViewModel R0() {
        return (NavigationViewModel) this.c2.getValue();
    }

    public final ChannelViewModel S0() {
        return (ChannelViewModel) this.d2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        i.d(onBackPressedDispatcher, "requireActivity().onBackPressedDispatcher");
        this.e2 = g0.a.b.b.a.a(onBackPressedDispatcher, this, false, new ChannelFragment$onViewCreated$1(this), 2);
        R0().q(ChannelDisplayState.EXPANDED);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(S0().l, new ChannelFragment$onViewCreated$2(this, (m0.l.c<? super ChannelFragment$onViewCreated$2>) null));
        h0.q.p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        v.l1(this, R0(), ChannelFragment$onViewCreated$3.c, (DeliveryMode) null, new ChannelFragment$onViewCreated$4(this, (m0.l.c<? super ChannelFragment$onViewCreated$4>) null), 2, (Object) null);
        Q0().w.setOnRefreshListener(new i0.e.b.g3.k.c(this));
        Q0().f.setOnClickListener(new i0.e.b.g3.k.d(this));
        Q0().g.setOnClickListener(new f(this));
        Button button = Q0().t;
        i.d(button, "binding.leaveButton");
        h0.q.p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button, q.a(viewLifecycleOwner2), new y(this));
        Button button2 = Q0().o;
        i.d(button2, "binding.iconLeave");
        h0.q.p viewLifecycleOwner3 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner3, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button2, q.a(viewLifecycleOwner3), new i0.e.b.g3.k.e(this));
        ImageView imageView = Q0().r;
        i.d(imageView, "binding.iconRaiseHand");
        h0.q.p viewLifecycleOwner4 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner4, "viewLifecycleOwner");
        i0.e.b.d3.k.H(imageView, q.a(viewLifecycleOwner4), new i0.e.b.g3.k.q(this));
        Q0().n.setOnClickListener(new s0(this));
        Q0().s.setOnClickListener(new i0.e.b.g3.k.h(this));
        Q0().p.setOnClickListener(new i0.e.b.g3.k.i(this));
        Q0().q.setOnClickListener(new i0.e.b.g3.k.a(this));
        Q0().h.setOnClickListener(new i0.e.b.g3.k.g(this));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 12);
        Q0().e.setLayoutManager(gridLayoutManager);
        EpoxyRecyclerView epoxyRecyclerView = Q0().e;
        i.d(epoxyRecyclerView, "binding.channelUserList");
        i0.e.b.d3.k.D(epoxyRecyclerView, this, new ChannelFragment$buildModels$1(gridLayoutManager, this));
        SpeakerStateDataSource speakerStateDataSource = S0().A;
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(speakerStateDataSource.b(speakerStateDataSource.b.b()), new ChannelFragment$onViewCreated$16(this, (m0.l.c<? super ChannelFragment$onViewCreated$16>) null));
        h0.q.p viewLifecycleOwner5 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner5, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, q.a(viewLifecycleOwner5));
        h0.q.p viewLifecycleOwner6 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner6, "viewLifecycleOwner");
        viewLifecycleOwner6.getLifecycle().a(new ChannelFragment$onViewCreated$$inlined$observeResume$1(this));
        Q0().k.setOnClickListener(new i0.e.b.g3.k.v(this));
    }
}
