package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.local.EventInClub;
import g0.a.b.b.a;
import h0.u.w;
import i0.b.b.j;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import m0.l.c;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: EventsViewModel.kt */
public final class EventsViewState implements j {
    public final EventsFilteringType a;
    public final w<EventInClub> b;
    public final Map<Integer, EventInClub> c;
    public final int d;
    public final w<EventInClub> e;

    public EventsViewState() {
        this((EventsFilteringType) null, (w) null, (Map) null, 0, 15, (f) null);
    }

    public EventsViewState(EventsFilteringType eventsFilteringType, w<EventInClub> wVar, Map<Integer, EventInClub> map, int i) {
        i.e(eventsFilteringType, "eventsFilteringType");
        i.e(wVar, "eventsData");
        i.e(map, "updatedEvents");
        this.a = eventsFilteringType;
        this.b = wVar;
        this.c = map;
        this.d = i;
        this.e = a.d0(wVar, new EventsViewState$actualEventsData$1(this, (c<? super EventsViewState$actualEventsData$1>) null));
    }

    public static EventsViewState copy$default(EventsViewState eventsViewState, EventsFilteringType eventsFilteringType, w<EventInClub> wVar, Map<Integer, EventInClub> map, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            eventsFilteringType = eventsViewState.a;
        }
        if ((i2 & 2) != 0) {
            wVar = eventsViewState.b;
        }
        if ((i2 & 4) != 0) {
            map = eventsViewState.c;
        }
        if ((i2 & 8) != 0) {
            i = eventsViewState.d;
        }
        Objects.requireNonNull(eventsViewState);
        i.e(eventsFilteringType, "eventsFilteringType");
        i.e(wVar, "eventsData");
        i.e(map, "updatedEvents");
        return new EventsViewState(eventsFilteringType, wVar, map, i);
    }

    public final EventsFilteringType component1() {
        return this.a;
    }

    public final Map<Integer, EventInClub> component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventsViewState)) {
            return false;
        }
        EventsViewState eventsViewState = (EventsViewState) obj;
        return this.a == eventsViewState.a && i.a(this.b, eventsViewState.b) && i.a(this.c, eventsViewState.c) && this.d == eventsViewState.d;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return Integer.hashCode(this.d) + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EventsViewState(eventsFilteringType=");
        P0.append(this.a);
        P0.append(", eventsData=");
        P0.append(this.b);
        P0.append(", updatedEvents=");
        P0.append(this.c);
        P0.append(", emptyCounter=");
        return i0.d.a.a.a.s0(P0, this.d, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EventsViewState(EventsFilteringType eventsFilteringType, w wVar, Map map, int i, int i2, f fVar) {
        this((i2 & 1) != 0 ? EventsFilteringType.UpcomingForYou : eventsFilteringType, (i2 & 2) != 0 ? w.c.a() : wVar, (i2 & 4) != 0 ? new HashMap() : map, (i2 & 8) != 0 ? 0 : i);
    }
}
