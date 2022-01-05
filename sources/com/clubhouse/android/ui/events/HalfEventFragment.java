package com.clubhouse.android.ui.events;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.mvrx.DeliveryMode;
import com.clubhouse.android.databinding.FragmentHalfEventBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.a.o;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.o.l0;
import i0.e.b.g3.o.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.i;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.m;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u00020\u001f8B@\u0002X\u0002¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/clubhouse/android/ui/events/HalfEventFragment;", "Lcom/clubhouse/android/core/ui/BaseBottomSheetFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/ui/events/HalfEventViewModel;", "u2", "Lm0/c;", "V0", "()Lcom/clubhouse/android/ui/events/HalfEventViewModel;", "viewModel", "Li0/e/a/b/a;", "s2", "Li0/e/a/b/a;", "getActionTrailRecorder", "()Li0/e/a/b/a;", "setActionTrailRecorder", "(Li0/e/a/b/a;)V", "actionTrailRecorder", "Lcom/clubhouse/android/databinding/FragmentHalfEventBinding;", "t2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "U0", "()Lcom/clubhouse/android/databinding/FragmentHalfEventBinding;", "binding", "Lcom/clubhouse/android/ui/events/EventsViewModel;", "v2", "getEventsViewModel", "()Lcom/clubhouse/android/ui/events/EventsViewModel;", "eventsViewModel", "<init>", "p2", "b", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: HalfEventFragment.kt */
public final class HalfEventFragment extends Hilt_HalfEventFragment {
    public static final b p2 = new b((f) null);
    public static final /* synthetic */ k<Object>[] q2 = {m.c(new PropertyReference1Impl(m.a(HalfEventFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentHalfEventBinding;")), m.c(new PropertyReference1Impl(m.a(HalfEventFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/events/HalfEventViewModel;")), m.c(new PropertyReference1Impl(m.a(HalfEventFragment.class), "eventsViewModel", "getEventsViewModel()Lcom/clubhouse/android/ui/events/EventsViewModel;"))};
    public static final String r2 = "event_following_result";
    public i0.e.a.b.a s2;
    public final FragmentViewBindingDelegate t2 = new FragmentViewBindingDelegate(FragmentHalfEventBinding.class, this);
    public final m0.c u2;
    public final m0.c v2;

    /* compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements l<o, i> {
        public final /* synthetic */ int c;
        public final /* synthetic */ Object d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, Object obj) {
            super(1);
            this.c = i;
            this.d = obj;
        }

        public final Object invoke(Object obj) {
            int i = this.c;
            if (i == 0) {
                o oVar = (o) obj;
                m0.n.b.i.e(oVar, "$this$safeWithModels");
                HalfEventFragment halfEventFragment = (HalfEventFragment) this.d;
                b bVar = HalfEventFragment.p2;
                v.v2(halfEventFragment.V0(), new HalfEventFragment$buildEventsModels$1(oVar, halfEventFragment));
                return i.a;
            } else if (i == 1) {
                o oVar2 = (o) obj;
                m0.n.b.i.e(oVar2, "$this$safeWithModels");
                HalfEventFragment halfEventFragment2 = (HalfEventFragment) this.d;
                b bVar2 = HalfEventFragment.p2;
                v.v2(halfEventFragment2.V0(), new HalfEventFragment$buildEventClubActionModels$1(oVar2, halfEventFragment2));
                return i.a;
            } else {
                throw null;
            }
        }
    }

    /* compiled from: HalfEventFragment.kt */
    public static final class b {
        public b(f fVar) {
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class c extends h<HalfEventFragment, HalfEventViewModel> {
        public final /* synthetic */ m0.r.d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ m0.r.d c;

        public c(m0.r.d dVar, boolean z, l lVar, m0.r.d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public m0.c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            m0.n.b.i.e(fragment, "thisRef");
            m0.n.b.i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new HalfEventFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(l0.class), false, this.b);
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class d extends h<HalfEventFragment, EventsViewModel> {
        public final /* synthetic */ m0.r.d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ m0.r.d c;

        public d(m0.r.d dVar, boolean z, l lVar, m0.r.d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public m0.c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            m0.n.b.i.e(fragment, "thisRef");
            m0.n.b.i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new HalfEventFragment$special$$inlined$parentFragmentViewModel$default$2$1(this), m.a(EventsViewState.class), true, this.b);
        }
    }

    public HalfEventFragment() {
        super(R.layout.fragment_half_event);
        m0.r.d a2 = m.a(HalfEventViewModel.class);
        c cVar = new c(a2, false, new HalfEventFragment$special$$inlined$fragmentViewModel$default$1(this, a2, a2), a2);
        k<Object>[] kVarArr = q2;
        this.u2 = cVar.a(this, kVarArr[1]);
        m0.r.d a3 = m.a(EventsViewModel.class);
        this.v2 = new d(a3, true, new HalfEventFragment$special$$inlined$parentFragmentViewModel$default$1(this, a3, a3), a3).a(this, kVarArr[2]);
    }

    public void J() {
        v.v2(V0(), new HalfEventFragment$invalidate$1(this));
    }

    public final FragmentHalfEventBinding U0() {
        return (FragmentHalfEventBinding) this.t2.getValue(this, q2[0]);
    }

    public final HalfEventViewModel V0() {
        return (HalfEventViewModel) this.u2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        m0.n.b.i.e(view, "view");
        super.onViewCreated(view, bundle);
        v.U1(this);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(V0().l, new HalfEventFragment$onViewCreated$1(this, (m0.l.c<? super HalfEventFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(((EventsViewModel) this.v2.getValue()).l, new HalfEventFragment$onViewCreated$2(this, (m0.l.c<? super HalfEventFragment$onViewCreated$2>) null));
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, q.a(viewLifecycleOwner2));
        v.h1(this, V0(), HalfEventFragment$onViewCreated$3.c, (DeliveryMode) null, new HalfEventFragment$onViewCreated$4(this, (m0.l.c<? super HalfEventFragment$onViewCreated$4>) null), new HalfEventFragment$onViewCreated$5(this, (m0.l.c<? super HalfEventFragment$onViewCreated$5>) null), 2, (Object) null);
        Button button = U0().d;
        m0.n.b.i.d(button, "binding.joinCreateRoomButton");
        p viewLifecycleOwner3 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner3, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button, q.a(viewLifecycleOwner3), new u(this));
        U0().e.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        EpoxyRecyclerView epoxyRecyclerView = U0().e;
        m0.n.b.i.d(epoxyRecyclerView, "binding.singleEventList");
        i0.e.b.d3.k.E(epoxyRecyclerView, new a(0, this));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 43);
        U0().b.setLayoutManager(gridLayoutManager);
        EpoxyRecyclerView epoxyRecyclerView2 = U0().b;
        m0.n.b.i.d(epoxyRecyclerView2, "binding.eventActionsList");
        i0.e.b.d3.k.D(epoxyRecyclerView2, this, new HalfEventFragment$buildEventActionModels$1(gridLayoutManager, this));
        U0().c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        EpoxyRecyclerView epoxyRecyclerView3 = U0().c;
        m0.n.b.i.d(epoxyRecyclerView3, "binding.eventClubActionsList");
        i0.e.b.d3.k.E(epoxyRecyclerView3, new a(1, this));
    }
}
