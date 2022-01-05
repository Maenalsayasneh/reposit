package com.clubhouse.android.ui.hallway.feed;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.clubhouse.android.databinding.FragmentFeedBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.shared.ui.ImpressionTrackingEpoxyRecyclerView;
import com.clubhouse.android.ui.hallway.HallwayViewModel;
import com.clubhouse.app.R;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import h0.b.a.d;
import h0.q.q;
import i0.b.b.c0;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.p.c0.o;
import i0.e.b.g3.p.c0.v;
import i0.e.b.g3.p.c0.y;
import i0.e.b.g3.p.r;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010\fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010#R\u001d\u0010*\u001a\u00020%8B@\u0002X\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/clubhouse/android/ui/hallway/feed/FeedFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "()V", "J", "Lcom/clubhouse/android/data/models/local/channel/ChannelInFeed;", "channel", "R0", "(Lcom/clubhouse/android/data/models/local/channel/ChannelInFeed;)V", "Lcom/clubhouse/android/ui/hallway/feed/FeedViewModel;", "c2", "Lm0/c;", "P0", "()Lcom/clubhouse/android/ui/hallway/feed/FeedViewModel;", "feedViewModel", "Li0/e/a/b/a;", "a2", "Li0/e/a/b/a;", "N0", "()Li0/e/a/b/a;", "setActionTrailRecorder", "(Li0/e/a/b/a;)V", "actionTrailRecorder", "Lcom/clubhouse/android/ui/hallway/HallwayViewModel;", "d2", "Q0", "()Lcom/clubhouse/android/ui/hallway/HallwayViewModel;", "hallwayViewModel", "Lcom/clubhouse/android/databinding/FragmentFeedBinding;", "b2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "O0", "()Lcom/clubhouse/android/databinding/FragmentFeedBinding;", "binding", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: FeedFragment.kt */
public final class FeedFragment extends Hilt_FeedFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(FeedFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentFeedBinding;")), m.c(new PropertyReference1Impl(m.a(FeedFragment.class), "feedViewModel", "getFeedViewModel()Lcom/clubhouse/android/ui/hallway/feed/FeedViewModel;")), m.c(new PropertyReference1Impl(m.a(FeedFragment.class), "hallwayViewModel", "getHallwayViewModel()Lcom/clubhouse/android/ui/hallway/HallwayViewModel;"))};
    public i0.e.a.b.a a2;
    public final FragmentViewBindingDelegate b2 = new FragmentViewBindingDelegate(FragmentFeedBinding.class, this);
    public final c c2;
    public final c d2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<FeedFragment, FeedViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new FeedFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(v.class), false, this.b);
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class b extends h<FeedFragment, HallwayViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new FeedFragment$special$$inlined$parentFragmentViewModel$default$2$1(this), m.a(r.class), true, this.b);
        }
    }

    public FeedFragment() {
        super(R.layout.fragment_feed);
        d a3 = m.a(FeedViewModel.class);
        a aVar = new a(a3, false, new FeedFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3);
        k<Object>[] kVarArr = Z1;
        this.c2 = aVar.a(this, kVarArr[1]);
        d a4 = m.a(HallwayViewModel.class);
        this.d2 = new b(a4, true, new FeedFragment$special$$inlined$parentFragmentViewModel$default$1(this, a4, a4), a4).a(this, kVarArr[2]);
    }

    public void J() {
        h0.b0.v.u2(P0(), Q0(), new FeedFragment$invalidate$1(this));
    }

    public final i0.e.a.b.a N0() {
        i0.e.a.b.a aVar = this.a2;
        if (aVar != null) {
            return aVar;
        }
        i.m("actionTrailRecorder");
        throw null;
    }

    public final FragmentFeedBinding O0() {
        return (FragmentFeedBinding) this.b2.getValue(this, Z1[0]);
    }

    public final FeedViewModel P0() {
        return (FeedViewModel) this.c2.getValue();
    }

    public final HallwayViewModel Q0() {
        return (HallwayViewModel) this.d2.getValue();
    }

    public final void R0(ChannelInFeed channelInFeed) {
        i.e(channelInFeed, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        FeedFragment$showHideOption$2 feedFragment$showHideOption$2 = new FeedFragment$showHideOption$2(this, channelInFeed);
        i.e(this, "<this>");
        i.e(feedFragment$showHideOption$2, "f");
        d.a aVar = new d.a(requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
        feedFragment$showHideOption$2.invoke(aVar);
        aVar.g();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h0.b0.v.h1(this, P0(), FeedFragment$onCreate$1.c, h0.b0.v.q2(this, (String) null, 1, (Object) null), new FeedFragment$onCreate$2(this, (m0.l.c<? super FeedFragment$onCreate$2>) null), (p) null, 8, (Object) null);
    }

    public void onResume() {
        super.onResume();
        P0().p(y.a);
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        O0().f.setProgressBackgroundColorSchemeColor(h0.i.b.a.getColor(requireContext(), R.color.clubhouse_eggshell));
        O0().f.setOnRefreshListener(new o(this));
        SwipeRefreshLayout swipeRefreshLayout = O0().f;
        int progressViewStartOffset = O0().f.getProgressViewStartOffset();
        int progressViewEndOffset = O0().f.getProgressViewEndOffset();
        swipeRefreshLayout.n2 = true;
        swipeRefreshLayout.t2 = progressViewStartOffset;
        swipeRefreshLayout.u2 = progressViewEndOffset;
        swipeRefreshLayout.E2 = true;
        swipeRefreshLayout.i();
        swipeRefreshLayout.y = false;
        Button button = O0().g;
        i.d(button, "binding.startRoom");
        h0.q.p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button, q.a(viewLifecycleOwner), new i0.e.b.g3.p.c0.c(this));
        O0().c.setOnClickListener(new i0.e.b.g3.p.c0.b(this));
        RecyclerView.k itemAnimator = O0().d.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setRemoveDuration(0);
        }
        ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView = O0().d;
        i.d(impressionTrackingEpoxyRecyclerView, "binding.channelList");
        i0.e.b.d3.k.D(impressionTrackingEpoxyRecyclerView, this, new FeedFragment$buildModels$1(this));
        h0.b0.v.j1(this, P0(), FeedFragment$onViewCreated$4.c, FeedFragment$onViewCreated$5.c, c0.a, new FeedFragment$onViewCreated$6(this, (m0.l.c<? super FeedFragment$onViewCreated$6>) null));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(P0().l, new FeedFragment$onViewCreated$7(this, (m0.l.c<? super FeedFragment$onViewCreated$7>) null));
        h0.q.p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner2));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(Q0().l, new FeedFragment$onViewCreated$8(this, (m0.l.c<? super FeedFragment$onViewCreated$8>) null));
        h0.q.p viewLifecycleOwner3 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner3, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, q.a(viewLifecycleOwner3));
        h0.b0.v.p0(this, "languages_updated_result", new FeedFragment$onViewCreated$9(this));
        O0().a.setOnClickListener(new i0.e.b.g3.p.c0.a(this));
    }
}
