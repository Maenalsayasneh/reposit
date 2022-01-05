package com.clubhouse.android.ui.events;

import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import com.clubhouse.app.R;
import h0.b0.v;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: EventsFragment.kt */
public final class EventsFragment$showEventsOptions$1 extends Lambda implements l<EventsViewState, i> {
    public final /* synthetic */ EventsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsFragment$showEventsOptions$1(EventsFragment eventsFragment) {
        super(1);
        this.c = eventsFragment;
    }

    public Object invoke(Object obj) {
        final EventsViewState eventsViewState = (EventsViewState) obj;
        m0.n.b.i.e(eventsViewState, "state");
        final EventsFragment eventsFragment = this.c;
        v.e(eventsFragment, new l<ActionSheetBuilder, i>() {
            public Object invoke(Object obj) {
                ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
                m0.n.b.i.e(actionSheetBuilder, "$this$actionSheet");
                actionSheetBuilder.a = EventsFragment.this.getString(R.string.what_would_you_like_to_see);
                actionSheetBuilder.c = true;
                EventsFilteringType[] values = EventsFilteringType.values();
                EventsFragment eventsFragment = EventsFragment.this;
                EventsViewState eventsViewState = eventsViewState;
                ArrayList arrayList = new ArrayList(2);
                for (int i = 0; i < 2; i++) {
                    arrayList.add(Boolean.valueOf(actionSheetBuilder.a(new EventsFragment$showEventsOptions$1$1$1$1(eventsFragment, values[i], eventsViewState))));
                }
                return i.a;
            }
        });
        return i.a;
    }
}
