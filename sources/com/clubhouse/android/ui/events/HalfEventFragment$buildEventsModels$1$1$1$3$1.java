package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import com.clubhouse.android.ui.events.HalfEventFragment;
import com.clubhouse.app.R;
import i0.e.b.g3.i.c;
import i0.e.b.g3.o.a0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: HalfEventFragment.kt */
public final class HalfEventFragment$buildEventsModels$1$1$1$3$1 extends Lambda implements l<ActionSheetBuilder, i> {
    public final /* synthetic */ EventInClub c;
    public final /* synthetic */ HalfEventFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventFragment$buildEventsModels$1$1$1$3$1(EventInClub eventInClub, HalfEventFragment halfEventFragment) {
        super(1);
        this.c = eventInClub;
        this.d = halfEventFragment;
    }

    public Object invoke(Object obj) {
        ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
        m0.n.b.i.e(actionSheetBuilder, "$this$actionSheet");
        final EventInClub eventInClub = this.c;
        actionSheetBuilder.a = eventInClub.a2;
        final HalfEventFragment halfEventFragment = this.d;
        actionSheetBuilder.a(new l<c, i>() {
            public Object invoke(Object obj) {
                c cVar = (c) obj;
                m0.n.b.i.e(cVar, "$this$action");
                String string = HalfEventFragment.this.getString(R.string.delete_event);
                m0.n.b.i.d(string, "getString(R.string.delete_event)");
                cVar.b(string);
                final HalfEventFragment halfEventFragment = HalfEventFragment.this;
                final EventInClub eventInClub = eventInClub;
                cVar.a(new a<i>() {
                    public Object invoke() {
                        HalfEventFragment halfEventFragment = HalfEventFragment.this;
                        HalfEventFragment.b bVar = HalfEventFragment.p2;
                        halfEventFragment.V0().p(new a0(eventInClub));
                        return i.a;
                    }
                });
                return i.a;
            }
        });
        return i.a;
    }
}
