package com.clubhouse.android.ui.events.creation;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.EventInClub;
import i0.e.b.g3.o.w0.w;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.r.m;
import n0.a.d0;

/* compiled from: AddEditEventViewModel.kt */
public final class AddEditEventViewModel$deleteEvent$2 extends Lambda implements l<w, i> {
    public final /* synthetic */ AddEditEventViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventViewModel$deleteEvent$2(AddEditEventViewModel addEditEventViewModel) {
        super(1);
        this.c = addEditEventViewModel;
    }

    public Object invoke(Object obj) {
        w wVar = (w) obj;
        m0.n.b.i.e(wVar, "state");
        EventInClub eventInClub = wVar.a;
        if (eventInClub != null) {
            int i = eventInClub.Y1;
            AddEditEventViewModel addEditEventViewModel = this.c;
            MavericksViewModel.f(addEditEventViewModel, new AddEditEventViewModel$deleteEvent$2$1$1(addEditEventViewModel, i, (c<? super AddEditEventViewModel$deleteEvent$2$1$1>) null), (d0) null, (m) null, new AddEditEventViewModel$deleteEvent$2$1$2(addEditEventViewModel, wVar), 3, (Object) null);
        }
        return i.a;
    }
}
