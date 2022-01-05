package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import com.clubhouse.app.R;
import i0.e.b.g3.i.c;
import i0.e.b.g3.o.a0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;
import m0.r.k;

/* compiled from: EventsFragment.kt */
public final class EventsFragment$PagingController$addModels$1$1$2$1$3$1 extends Lambda implements l<ActionSheetBuilder, i> {
    public final /* synthetic */ EventInClub c;
    public final /* synthetic */ EventsFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsFragment$PagingController$addModels$1$1$2$1$3$1(EventInClub eventInClub, EventsFragment eventsFragment) {
        super(1);
        this.c = eventInClub;
        this.d = eventsFragment;
    }

    public Object invoke(Object obj) {
        ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
        m0.n.b.i.e(actionSheetBuilder, "$this$actionSheet");
        final EventInClub eventInClub = this.c;
        actionSheetBuilder.a = eventInClub.a2;
        final EventsFragment eventsFragment = this.d;
        actionSheetBuilder.a(new l<c, i>() {
            public Object invoke(Object obj) {
                c cVar = (c) obj;
                m0.n.b.i.e(cVar, "$this$action");
                String string = EventsFragment.this.getString(R.string.delete_event);
                m0.n.b.i.d(string, "getString(R.string.delete_event)");
                cVar.b(string);
                final EventsFragment eventsFragment = EventsFragment.this;
                final EventInClub eventInClub = eventInClub;
                cVar.a(new a<i>() {
                    public Object invoke() {
                        EventsFragment eventsFragment = EventsFragment.this;
                        k<Object>[] kVarArr = EventsFragment.Z1;
                        eventsFragment.P0().p(new a0(eventInClub));
                        return i.a;
                    }
                });
                return i.a;
            }
        });
        return i.a;
    }
}
