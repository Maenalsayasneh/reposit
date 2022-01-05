package com.clubhouse.android.ui.events;

import i0.e.b.g3.i.c;
import i0.e.b.g3.o.y;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;
import m0.r.k;

/* compiled from: EventsFragment.kt */
public final class EventsFragment$showEventsOptions$1$1$1$1 extends Lambda implements l<c, i> {
    public final /* synthetic */ EventsFragment c;
    public final /* synthetic */ EventsFilteringType d;
    public final /* synthetic */ EventsViewState q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsFragment$showEventsOptions$1$1$1$1(EventsFragment eventsFragment, EventsFilteringType eventsFilteringType, EventsViewState eventsViewState) {
        super(1);
        this.c = eventsFragment;
        this.d = eventsFilteringType;
        this.q = eventsViewState;
    }

    public Object invoke(Object obj) {
        c cVar = (c) obj;
        m0.n.b.i.e(cVar, "$this$action");
        String string = this.c.getString(this.d.getTitle());
        m0.n.b.i.d(string, "getString(it.title)");
        cVar.b(string);
        EventsFilteringType eventsFilteringType = this.q.a;
        final EventsFilteringType eventsFilteringType2 = this.d;
        cVar.f = eventsFilteringType == eventsFilteringType2;
        final EventsFragment eventsFragment = this.c;
        cVar.a(new a<i>() {
            public Object invoke() {
                EventsFragment eventsFragment = EventsFragment.this;
                k<Object>[] kVarArr = EventsFragment.Z1;
                eventsFragment.P0().p(new y(eventsFilteringType2));
                return i.a;
            }
        });
        return i.a;
    }
}
