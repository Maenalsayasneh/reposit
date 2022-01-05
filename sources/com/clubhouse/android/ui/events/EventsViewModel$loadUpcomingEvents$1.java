package com.clubhouse.android.ui.events;

import androidx.paging.PageFetcher;
import androidx.paging.Pager$flow$1;
import androidx.paging.Pager$flow$2;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.repos.EventRepo;
import com.clubhouse.android.data.repos.EventRepo$getPagedEvents$1;
import g0.a.b.b.a;
import h0.u.e0;
import h0.u.v;
import h0.u.w;
import i0.j.f.p.h;
import java.util.Map;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import n0.a.f0;
import n0.a.g2.d;

@c(c = "com.clubhouse.android.ui.events.EventsViewModel$loadUpcomingEvents$1", f = "EventsViewModel.kt", l = {167}, m = "invokeSuspend")
/* compiled from: EventsViewModel.kt */
public final class EventsViewModel$loadUpcomingEvents$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ EventsViewModel d;

    @c(c = "com.clubhouse.android.ui.events.EventsViewModel$loadUpcomingEvents$1$1", f = "EventsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.events.EventsViewModel$loadUpcomingEvents$1$1  reason: invalid class name */
    /* compiled from: EventsViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w<EventInClub>, m0.l.c<? super i>, Object> {
        public /* synthetic */ Object c;

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(eventsViewModel, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(eventsViewModel, (m0.l.c) obj2);
            r02.c = (w) obj;
            i iVar = i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final w wVar = (w) this.c;
            EventsViewModel eventsViewModel = eventsViewModel;
            AnonymousClass1 r1 = new l<EventsViewState, EventsViewState>() {
                public Object invoke(Object obj) {
                    EventsViewState eventsViewState = (EventsViewState) obj;
                    m0.n.b.i.e(eventsViewState, "$this$setState");
                    return EventsViewState.copy$default(eventsViewState, (EventsFilteringType) null, wVar, (Map) null, 0, 13, (Object) null);
                }
            };
            int i = EventsViewModel.m;
            eventsViewModel.m(r1);
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsViewModel$loadUpcomingEvents$1(EventsViewModel eventsViewModel, m0.l.c<? super EventsViewModel$loadUpcomingEvents$1> cVar) {
        super(2, cVar);
        this.d = eventsViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new EventsViewModel$loadUpcomingEvents$1(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new EventsViewModel$loadUpcomingEvents$1(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        l lVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            EventRepo eventRepo = this.d.o;
            Objects.requireNonNull(eventRepo);
            v vVar = new v(25, 10, false, 25, 0, 0, 52);
            EventRepo$getPagedEvents$1 eventRepo$getPagedEvents$1 = new EventRepo$getPagedEvents$1(eventRepo);
            m0.n.b.i.e(vVar, "config");
            m0.n.b.i.e(eventRepo$getPagedEvents$1, "pagingSourceFactory");
            m0.n.b.i.e(vVar, "config");
            m0.n.b.i.e(eventRepo$getPagedEvents$1, "pagingSourceFactory");
            if (eventRepo$getPagedEvents$1 instanceof e0) {
                lVar = new Pager$flow$1(eventRepo$getPagedEvents$1);
            } else {
                lVar = new Pager$flow$2(eventRepo$getPagedEvents$1, (m0.l.c) null);
            }
            d<w<w<Value>>> h = a.h(new PageFetcher(lVar, (Object) null, vVar).c, this.d.c);
            final EventsViewModel eventsViewModel = this.d;
            AnonymousClass1 r1 = new AnonymousClass1((m0.l.c<? super AnonymousClass1>) null);
            this.c = 1;
            if (m0.r.t.a.r.m.a1.a.E0(h, r1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
