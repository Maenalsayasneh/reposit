package com.clubhouse.android.ui.events;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.databinding.FragmentEventsBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.shared.preferences.Key;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.q;
import h0.v.a.g;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.b.h;
import i0.e.b.g3.o.d0;
import i0.e.b.g3.o.e0;
import i0.e.b.g3.o.q0;
import i0.e.b.g3.o.v0;
import j$.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.i;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b#\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00060\u001fR\u00020\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/clubhouse/android/ui/events/EventsFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Li0/e/b/f3/k/b;", "a2", "Li0/e/b/f3/k/b;", "O0", "()Li0/e/b/f3/k/b;", "setUserPrefs", "(Li0/e/b/f3/k/b;)V", "userPrefs", "Lcom/clubhouse/android/databinding/FragmentEventsBinding;", "b2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentEventsBinding;", "binding", "Lcom/clubhouse/android/ui/events/EventsViewModel;", "c2", "Lm0/c;", "P0", "()Lcom/clubhouse/android/ui/events/EventsViewModel;", "viewModel", "Lcom/clubhouse/android/ui/events/EventsFragment$PagingController;", "d2", "Lcom/clubhouse/android/ui/events/EventsFragment$PagingController;", "pagedController", "<init>", "b", "PagingController", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: EventsFragment.kt */
public final class EventsFragment extends Hilt_EventsFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(EventsFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentEventsBinding;")), m.c(new PropertyReference1Impl(m.a(EventsFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/events/EventsViewModel;"))};
    public i0.e.b.f3.k.b a2;
    public final FragmentViewBindingDelegate b2 = new FragmentViewBindingDelegate(FragmentEventsBinding.class, this);
    public final m0.c c2;
    public final PagingController d2;

    /* compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements l<EventInClub, i> {
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
                EventInClub eventInClub = (EventInClub) obj;
                m0.n.b.i.e(eventInClub, "event");
                v.a1((EventsFragment) this.d, e0.a.a(new HalfEventArgs((String) null, Integer.valueOf(eventInClub.Y1), (String) null, (String) null, (EventInClub) null, (SourceLocation) null, (Map) null, 125)), (q) null, 2);
                k<Object>[] kVarArr = EventsFragment.Z1;
                ((EventsFragment) this.d).P0().p(q0.a);
                return i.a;
            } else if (i == 1) {
                EventInClub eventInClub2 = (EventInClub) obj;
                m0.n.b.i.e(eventInClub2, "event");
                k<Object>[] kVarArr2 = EventsFragment.Z1;
                ((EventsFragment) this.d).P0().p(new v0(eventInClub2));
                return i.a;
            } else {
                throw null;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\u00052\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/clubhouse/android/ui/events/EventsFragment$PagingController;", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "Lcom/clubhouse/android/data/models/local/EventInClub;", "Landroid/view/View;", "view", "Lm0/i;", "showTooltipIfNeeded", "(Landroid/view/View;)V", "", "Li0/b/a/t;", "models", "addModels", "(Ljava/util/List;)V", "", "currentPosition", "item", "buildItemModel", "(ILcom/clubhouse/android/data/models/local/EventInClub;)Li0/b/a/t;", "", "latestReadableDateFormat", "Ljava/lang/String;", "getLatestReadableDateFormat", "()Ljava/lang/String;", "setLatestReadableDateFormat", "(Ljava/lang/String;)V", "<init>", "(Lcom/clubhouse/android/ui/events/EventsFragment;)V", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* compiled from: EventsFragment.kt */
    public final class PagingController extends PagingDataEpoxyController<EventInClub> {
        private String latestReadableDateFormat = "";
        public final /* synthetic */ EventsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PagingController(EventsFragment eventsFragment) {
            super((Handler) null, (Handler) null, (g.e) null, 7, (f) null);
            m0.n.b.i.e(eventsFragment, "this$0");
            this.this$0 = eventsFragment;
        }

        /* access modifiers changed from: private */
        public final void showTooltipIfNeeded(View view) {
            i0.e.b.f3.k.b O0 = this.this$0.O0();
            Key key = Key.KEY_SHOW_BELL_TOOLTIP;
            if (!O0.a(key, false)) {
                if (view != null) {
                    m0.n.b.i.e(view, "<this>");
                    g0.a.b.b.a.y0(view, view.getResources().getString(R.string.great_we_ll_tell));
                    view.performLongClick();
                }
                this.this$0.O0().g(key, true);
            }
        }

        public void addModels(List<? extends t<?>> list) {
            m0.n.b.i.e(list, "models");
            EventsFragment eventsFragment = this.this$0;
            k<Object>[] kVarArr = EventsFragment.Z1;
            v.v2(eventsFragment.P0(), new EventsFragment$PagingController$addModels$1(list, this, this.this$0));
        }

        public final String getLatestReadableDateFormat() {
            return this.latestReadableDateFormat;
        }

        public final void setLatestReadableDateFormat(String str) {
            m0.n.b.i.e(str, "<set-?>");
            this.latestReadableDateFormat = str;
        }

        public t<?> buildItemModel(int i, EventInClub eventInClub) {
            String str;
            OffsetDateTime offsetDateTime;
            String str2 = "";
            if (i == 0) {
                this.latestReadableDateFormat = str2;
            }
            if (eventInClub == null || (offsetDateTime = eventInClub.c2) == null) {
                str = null;
            } else {
                Context requireContext = this.this$0.requireContext();
                m0.n.b.i.d(requireContext, "requireContext()");
                str = v.J1(offsetDateTime, requireContext);
            }
            if (m0.n.b.i.a(this.latestReadableDateFormat, str)) {
                return new b(eventInClub, (String) null, 2);
            }
            if (str != null) {
                str2 = str;
            }
            this.latestReadableDateFormat = str2;
            return new b(eventInClub, str);
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class c extends h<EventsFragment, EventsViewModel> {
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
            m0.n.b.i.e(fragment, "thisRef");
            m0.n.b.i.e(kVar, "property");
            return i0.b.b.g.a.b(fragment, kVar, this.a, new EventsFragment$special$$inlined$parentFragmentViewModel$default$2$1(this), m.a(EventsViewState.class), true, this.b);
        }
    }

    public EventsFragment() {
        super(R.layout.fragment_events);
        d a3 = m.a(EventsViewModel.class);
        this.c2 = new c(a3, true, new EventsFragment$special$$inlined$parentFragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
        this.d2 = new PagingController(this);
    }

    public void J() {
        v.v2(P0(), new EventsFragment$invalidate$1(this));
    }

    public final FragmentEventsBinding N0() {
        return (FragmentEventsBinding) this.b2.getValue(this, Z1[0]);
    }

    public final i0.e.b.f3.k.b O0() {
        i0.e.b.f3.k.b bVar = this.a2;
        if (bVar != null) {
            return bVar;
        }
        m0.n.b.i.m("userPrefs");
        throw null;
    }

    public final EventsViewModel P0() {
        return (EventsViewModel) this.c2.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            java.lang.String r0 = "view"
            m0.n.b.i.e(r14, r0)
            super.onViewCreated(r14, r15)
            android.os.Bundle r14 = r13.getArguments()
            r15 = 1
            r0 = 0
            java.lang.String r1 = "eventHashId"
            if (r14 != 0) goto L_0x0013
            goto L_0x001b
        L_0x0013:
            boolean r2 = r14.containsKey(r1)
            if (r2 != r15) goto L_0x001b
            r2 = r15
            goto L_0x001c
        L_0x001b:
            r2 = r0
        L_0x001c:
            java.lang.String r3 = "mavericks:arg"
            if (r2 != 0) goto L_0x0031
            if (r14 != 0) goto L_0x0023
            goto L_0x002b
        L_0x0023:
            boolean r14 = r14.containsKey(r3)
            if (r14 != r15) goto L_0x002b
            r14 = r15
            goto L_0x002c
        L_0x002b:
            r14 = r0
        L_0x002c:
            if (r14 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r15
        L_0x0032:
            r2 = 0
            if (r14 == 0) goto L_0x008a
            r14 = 2131362578(0x7f0a0312, float:1.834494E38)
            h0.b0.v.d1(r13, r14)
            android.os.Bundle r14 = r13.getArguments()
            if (r14 != 0) goto L_0x0043
            r3 = r2
            goto L_0x0049
        L_0x0043:
            android.os.Parcelable r3 = r14.getParcelable(r3)
            com.clubhouse.android.ui.events.HalfEventArgs r3 = (com.clubhouse.android.ui.events.HalfEventArgs) r3
        L_0x0049:
            if (r14 != 0) goto L_0x004d
            r5 = r2
            goto L_0x0052
        L_0x004d:
            java.lang.String r1 = r14.getString(r1)
            r5 = r1
        L_0x0052:
            if (r14 != 0) goto L_0x0056
            r7 = r2
            goto L_0x005d
        L_0x0056:
            java.lang.String r1 = "clubSlug"
            java.lang.String r1 = r14.getString(r1)
            r7 = r1
        L_0x005d:
            if (r14 != 0) goto L_0x0061
            r8 = r2
            goto L_0x0068
        L_0x0061:
            java.lang.String r1 = "inviteCode"
            java.lang.String r14 = r14.getString(r1)
            r8 = r14
        L_0x0068:
            if (r3 != 0) goto L_0x0076
            com.clubhouse.android.ui.events.HalfEventArgs r3 = new com.clubhouse.android.ui.events.HalfEventArgs
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 114(0x72, float:1.6E-43)
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0076:
            java.lang.String r14 = "<this>"
            m0.n.b.i.e(r13, r14)
            java.lang.String r14 = "args"
            m0.n.b.i.e(r3, r14)
            i0.e.b.g3.o.e0$e r14 = i0.e.b.g3.o.e0.a
            h0.t.l r14 = r14.a(r3)
            r1 = 2
            h0.b0.v.a1(r13, r14, r2, r1)
        L_0x008a:
            com.clubhouse.android.ui.events.EventsViewModel r14 = r13.P0()
            n0.a.g2.t<i0.e.b.a3.b.b> r14 = r14.l
            com.clubhouse.android.ui.events.EventsFragment$onViewCreated$1 r1 = new com.clubhouse.android.ui.events.EventsFragment$onViewCreated$1
            r1.<init>(r13, r2)
            kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r3 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1
            r3.<init>(r14, r1)
            h0.q.p r14 = r13.getViewLifecycleOwner()
            java.lang.String r1 = "viewLifecycleOwner"
            m0.n.b.i.d(r14, r1)
            androidx.lifecycle.LifecycleCoroutineScope r14 = h0.q.q.a(r14)
            m0.r.t.a.r.m.a1.a.F2(r3, r14)
            com.clubhouse.android.ui.events.EventsFragment$a r14 = new com.clubhouse.android.ui.events.EventsFragment$a
            r14.<init>(r0, r13)
            java.lang.String r3 = "event_create_result"
            h0.b0.v.p0(r13, r3, r14)
            com.clubhouse.android.ui.events.EventsFragment$onViewCreated$3 r14 = new com.clubhouse.android.ui.events.EventsFragment$onViewCreated$3
            r14.<init>(r13)
            java.lang.String r3 = "event_deletion_result"
            h0.b0.v.p0(r13, r3, r14)
            com.clubhouse.android.ui.events.EventsFragment$a r14 = new com.clubhouse.android.ui.events.EventsFragment$a
            r14.<init>(r15, r13)
            java.lang.String r3 = "event_update_result"
            h0.b0.v.p0(r13, r3, r14)
            com.clubhouse.android.databinding.FragmentEventsBinding r14 = r13.N0()
            android.widget.ImageView r14 = r14.b
            i0.e.b.g3.o.l r3 = new i0.e.b.g3.o.l
            r3.<init>(r13)
            r14.setOnClickListener(r3)
            com.clubhouse.android.databinding.FragmentEventsBinding r14 = r13.N0()
            android.widget.TextView r14 = r14.f
            i0.e.b.g3.o.k r3 = new i0.e.b.g3.o.k
            r3.<init>(r13)
            r14.setOnClickListener(r3)
            com.clubhouse.android.databinding.FragmentEventsBinding r14 = r13.N0()
            android.widget.ImageView r14 = r14.a
            java.lang.String r3 = "binding.addEditEvent"
            m0.n.b.i.d(r14, r3)
            h0.q.p r3 = r13.getViewLifecycleOwner()
            m0.n.b.i.d(r3, r1)
            androidx.lifecycle.LifecycleCoroutineScope r3 = h0.q.q.a(r3)
            i0.e.b.g3.o.j r4 = new i0.e.b.g3.o.j
            r4.<init>(r13)
            i0.e.b.d3.k.H(r14, r3, r4)
            com.clubhouse.android.databinding.FragmentEventsBinding r14 = r13.N0()
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r14 = r14.e
            android.content.Context r3 = r13.requireContext()
            r4 = 2131099713(0x7f060041, float:1.7811787E38)
            int r3 = h0.i.b.a.getColor(r3, r4)
            r14.setProgressBackgroundColorSchemeColor(r3)
            com.clubhouse.android.databinding.FragmentEventsBinding r14 = r13.N0()
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r14 = r14.e
            i0.e.b.g3.o.i r3 = new i0.e.b.g3.o.i
            r3.<init>(r13)
            r14.setOnRefreshListener(r3)
            com.clubhouse.android.databinding.FragmentEventsBinding r14 = r13.N0()
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r14 = r14.e
            com.clubhouse.android.databinding.FragmentEventsBinding r3 = r13.N0()
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r3 = r3.e
            int r3 = r3.getProgressViewStartOffset()
            com.clubhouse.android.databinding.FragmentEventsBinding r4 = r13.N0()
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r4 = r4.e
            int r4 = r4.getProgressViewEndOffset()
            r14.n2 = r15
            r14.t2 = r3
            r14.u2 = r4
            r14.E2 = r15
            r14.i()
            r14.y = r0
            com.clubhouse.android.databinding.FragmentEventsBinding r14 = r13.N0()
            com.airbnb.epoxy.EpoxyRecyclerView r14 = r14.d
            com.clubhouse.android.ui.events.EventsFragment$PagingController r3 = r13.d2
            r14.setController(r3)
            com.clubhouse.android.databinding.FragmentEventsBinding r14 = r13.N0()
            com.airbnb.epoxy.EpoxyRecyclerView r14 = r14.d
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r4 = r13.requireContext()
            r3.<init>(r4, r15, r0)
            r14.setLayoutManager(r3)
            com.clubhouse.android.ui.events.EventsFragment$PagingController r14 = r13.d2
            n0.a.g2.d r14 = h0.b0.v.f1(r14)
            com.clubhouse.android.ui.events.EventsFragment$onViewCreated$9 r15 = new com.clubhouse.android.ui.events.EventsFragment$onViewCreated$9
            r15.<init>(r13, r2)
            kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1
            r0.<init>(r14, r15)
            h0.q.p r14 = r13.getViewLifecycleOwner()
            m0.n.b.i.d(r14, r1)
            androidx.lifecycle.LifecycleCoroutineScope r14 = h0.q.q.a(r14)
            m0.r.t.a.r.m.a1.a.F2(r0, r14)
            com.clubhouse.android.ui.events.EventsViewModel r14 = r13.P0()
            i0.e.b.g3.o.q0 r15 = i0.e.b.g3.o.q0.a
            r14.p(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.events.EventsFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* compiled from: EventsFragment.kt */
    public static final class b extends BaseEpoxyModelWithHolder<i0.e.b.a3.f.d> {
        public final EventInClub j;
        public final String k;

        public b(EventInClub eventInClub, String str) {
            this.j = eventInClub;
            this.k = str;
        }

        public r E(ViewParent viewParent) {
            m0.n.b.i.e(viewParent, "parent");
            return new d0();
        }

        public int o() {
            return 0;
        }

        public b(EventInClub eventInClub, String str, int i) {
            int i2 = i & 2;
            this.j = eventInClub;
            this.k = null;
        }
    }
}
