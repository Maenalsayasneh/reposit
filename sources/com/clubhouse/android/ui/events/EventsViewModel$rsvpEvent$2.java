package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import h0.u.w;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.o.b0;
import i0.e.b.g3.o.c0;
import j$.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: EventsViewModel.kt */
public final class EventsViewModel$rsvpEvent$2 extends Lambda implements p<EventsViewState, b<? extends EmptySuccessResponse>, EventsViewState> {
    public final /* synthetic */ EventsViewModel c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ EventInClub q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsViewModel$rsvpEvent$2(EventsViewModel eventsViewModel, boolean z, EventInClub eventInClub) {
        super(2);
        this.c = eventsViewModel;
        this.d = z;
        this.q = eventInClub;
    }

    public Object invoke(Object obj, Object obj2) {
        EventsViewState eventsViewState = (EventsViewState) obj;
        b bVar = (b) obj2;
        i.e(eventsViewState, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            EventsViewModel eventsViewModel = this.c;
            final EventInClub eventInClub = this.q;
            final boolean z = this.d;
            eventsViewModel.m(new l<EventsViewState, EventsViewState>() {
                public Object invoke(Object obj) {
                    EventsViewState eventsViewState = (EventsViewState) obj;
                    i.e(eventsViewState, "$this$setState");
                    return EventsViewState.copy$default(eventsViewState, (EventsFilteringType) null, (w) null, g.c0(eventsViewState.c, new Pair(Integer.valueOf(EventInClub.this.Y1), EventInClub.d(EventInClub.this, (ClubWithAdmin) null, false, false, Boolean.valueOf(!z), (String) null, 0, (String) null, (String) null, (List) null, (OffsetDateTime) null, false, (String) null, (String) null, false, (Map) null, (String) null, 65527))), 0, 11, (Object) null);
                }
            });
            if (this.d) {
                this.c.o(new c0(this.q));
            } else {
                this.c.o(new b0(this.q));
            }
        }
        if (bVar instanceof c) {
            this.c.o(new d((String) null, 1));
        }
        return eventsViewState;
    }
}
