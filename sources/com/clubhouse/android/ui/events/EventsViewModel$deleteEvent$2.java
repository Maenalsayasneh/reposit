package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.o.u0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: EventsViewModel.kt */
public final class EventsViewModel$deleteEvent$2 extends Lambda implements p<EventsViewState, b<? extends EmptySuccessResponse>, EventsViewState> {
    public final /* synthetic */ EventsViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsViewModel$deleteEvent$2(EventsViewModel eventsViewModel) {
        super(2);
        this.c = eventsViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        EventsViewState eventsViewState = (EventsViewState) obj;
        b bVar = (b) obj2;
        i.e(eventsViewState, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            this.c.o(u0.a);
            this.c.q();
        }
        if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return eventsViewState;
    }
}
