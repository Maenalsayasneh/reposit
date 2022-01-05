package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.events.EventsViewState$actualEventsData$1", f = "EventsViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: EventsViewModel.kt */
public final class EventsViewState$actualEventsData$1 extends SuspendLambda implements p<EventInClub, m0.l.c<? super EventInClub>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ EventsViewState d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsViewState$actualEventsData$1(EventsViewState eventsViewState, m0.l.c<? super EventsViewState$actualEventsData$1> cVar) {
        super(2, cVar);
        this.d = eventsViewState;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        EventsViewState$actualEventsData$1 eventsViewState$actualEventsData$1 = new EventsViewState$actualEventsData$1(this.d, cVar);
        eventsViewState$actualEventsData$1.c = obj;
        return eventsViewState$actualEventsData$1;
    }

    public Object invoke(Object obj, Object obj2) {
        EventsViewState$actualEventsData$1 eventsViewState$actualEventsData$1 = new EventsViewState$actualEventsData$1(this.d, (m0.l.c) obj2);
        eventsViewState$actualEventsData$1.c = (EventInClub) obj;
        return eventsViewState$actualEventsData$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        EventInClub eventInClub = (EventInClub) this.c;
        EventInClub eventInClub2 = this.d.c.get(new Integer(eventInClub.Y1));
        return eventInClub2 == null ? eventInClub : eventInClub2;
    }
}
