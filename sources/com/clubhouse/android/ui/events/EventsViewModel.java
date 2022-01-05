package com.clubhouse.android.ui.events;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.repos.EventRepo;
import com.clubhouse.android.shared.auth.UserManager;
import h0.u.w;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.g3.o.a0;
import i0.e.b.g3.o.p0;
import i0.e.b.g3.o.q0;
import i0.e.b.g3.o.r0;
import i0.e.b.g3.o.v0;
import i0.e.b.g3.o.y;
import i0.j.f.p.h;
import java.util.Map;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: EventsViewModel.kt */
public final class EventsViewModel extends i0.e.b.a3.b.a<EventsViewState> {
    public static final /* synthetic */ int m = 0;
    public UserManager n;
    public EventRepo o;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.events.EventsViewModel$1", f = "EventsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.events.EventsViewModel$1  reason: invalid class name */
    /* compiled from: EventsViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ EventsViewModel d;

        {
            this.d = r1;
        }

        public final m0.l.c<m0.i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, (m0.l.c) obj2);
            r02.c = (c) obj;
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final c cVar = (c) this.c;
            if (cVar instanceof y) {
                EventsViewModel eventsViewModel = this.d;
                r0 r0Var = r0.a;
                int i = EventsViewModel.m;
                eventsViewModel.o(r0Var);
                this.d.m(new l<EventsViewState, EventsViewState>() {
                    public Object invoke(Object obj) {
                        EventsViewState eventsViewState = (EventsViewState) obj;
                        i.e(eventsViewState, "$this$setState");
                        return EventsViewState.copy$default(eventsViewState, ((y) cVar).a, w.c.a(), (Map) null, eventsViewState.d + 1, 4, (Object) null);
                    }
                });
                this.d.q();
            } else if (cVar instanceof q0) {
                EventsViewModel eventsViewModel2 = this.d;
                r0 r0Var2 = r0.a;
                int i2 = EventsViewModel.m;
                eventsViewModel2.o(r0Var2);
                this.d.m(AnonymousClass2.c);
                this.d.q();
            } else if (cVar instanceof p0) {
                EventsViewModel eventsViewModel3 = this.d;
                p0 p0Var = (p0) cVar;
                EventInClub eventInClub = p0Var.a;
                Map<String, Object> map = p0Var.b;
                int i3 = EventsViewModel.m;
                Objects.requireNonNull(eventsViewModel3);
                Boolean bool = eventInClub.x;
                if (bool == null) {
                    z = false;
                } else {
                    z = bool.booleanValue();
                }
                MavericksViewModel.f(eventsViewModel3, new EventsViewModel$rsvpEvent$1(eventsViewModel3, eventInClub, z, map, (m0.l.c<? super EventsViewModel$rsvpEvent$1>) null), (d0) null, (m) null, new EventsViewModel$rsvpEvent$2(eventsViewModel3, z, eventInClub), 3, (Object) null);
            } else if (cVar instanceof a0) {
                EventsViewModel eventsViewModel4 = this.d;
                EventInClub eventInClub2 = ((a0) cVar).a;
                int i4 = EventsViewModel.m;
                Objects.requireNonNull(eventsViewModel4);
                MavericksViewModel.f(eventsViewModel4, new EventsViewModel$deleteEvent$1(eventsViewModel4, eventInClub2, (m0.l.c<? super EventsViewModel$deleteEvent$1>) null), (d0) null, (m) null, new EventsViewModel$deleteEvent$2(eventsViewModel4), 3, (Object) null);
            } else if (cVar instanceof v0) {
                this.d.q();
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsViewModel(EventsViewState eventsViewState, i0.e.b.f3.i.a aVar, UserManager userManager, i0.e.a.a aVar2) {
        super(eventsViewState);
        i.e(eventsViewState, "initialState");
        i.e(aVar, "userComponentHandler");
        i.e(userManager, "userManager");
        i.e(aVar2, "analytics");
        this.n = userManager;
        this.o = ((i0.e.b.c3.i.a) h.L0(aVar, i0.e.b.c3.i.a.class)).o();
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
        ((AmplitudeAnalytics) aVar2).a("Bulletin-Loaded");
    }

    public final void q() {
        n(new EventsViewModel$loadEvents$1(this));
    }

    /* compiled from: EventsViewModel.kt */
    public static final class a implements v<EventsViewModel, EventsViewState> {
        public final /* synthetic */ i0.e.b.c3.h.c<EventsViewModel, EventsViewState> a = new i0.e.b.c3.h.c<>(EventsViewModel.class);

        public a() {
        }

        public EventsViewModel create(j0 j0Var, EventsViewState eventsViewState) {
            i.e(j0Var, "viewModelContext");
            i.e(eventsViewState, "state");
            return this.a.create(j0Var, eventsViewState);
        }

        public EventsViewState initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
