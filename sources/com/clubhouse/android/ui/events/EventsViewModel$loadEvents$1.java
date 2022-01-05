package com.clubhouse.android.ui.events;

import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.r.t.a.r.m.a1.a;

/* compiled from: EventsViewModel.kt */
public final class EventsViewModel$loadEvents$1 extends Lambda implements l<EventsViewState, i> {
    public final /* synthetic */ EventsViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsViewModel$loadEvents$1(EventsViewModel eventsViewModel) {
        super(1);
        this.c = eventsViewModel;
    }

    public Object invoke(Object obj) {
        EventsViewState eventsViewState = (EventsViewState) obj;
        m0.n.b.i.e(eventsViewState, "it");
        if (eventsViewState.a == EventsFilteringType.MyEvents) {
            EventsViewModel eventsViewModel = this.c;
            a.E2(eventsViewModel.c, (e) null, (CoroutineStart) null, new EventsViewModel$loadForUserEvents$1(eventsViewModel, (c<? super EventsViewModel$loadForUserEvents$1>) null), 3, (Object) null);
        } else {
            EventsViewModel eventsViewModel2 = this.c;
            a.E2(eventsViewModel2.c, (e) null, (CoroutineStart) null, new EventsViewModel$loadUpcomingEvents$1(eventsViewModel2, (c<? super EventsViewModel$loadUpcomingEvents$1>) null), 3, (Object) null);
        }
        return i.a;
    }
}
