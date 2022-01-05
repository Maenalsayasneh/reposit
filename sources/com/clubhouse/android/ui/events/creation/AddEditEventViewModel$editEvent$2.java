package com.clubhouse.android.ui.events.creation;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.EventInClub;
import i0.e.b.g3.o.w0.w;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.r.m;
import n0.a.d0;

/* compiled from: AddEditEventViewModel.kt */
public final class AddEditEventViewModel$editEvent$2 extends Lambda implements l<w, i> {
    public final /* synthetic */ AddEditEventViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventViewModel$editEvent$2(AddEditEventViewModel addEditEventViewModel) {
        super(1);
        this.c = addEditEventViewModel;
    }

    public Object invoke(Object obj) {
        EventInClub eventInClub;
        String str;
        w wVar = (w) obj;
        m0.n.b.i.e(wVar, "state");
        EventInClub eventInClub2 = wVar.a;
        if (eventInClub2 == null) {
            eventInClub = null;
        } else {
            String str2 = wVar.d;
            String str3 = str2 == null ? "" : str2;
            String str4 = wVar.e;
            if (str4 == null) {
                str = "";
            } else {
                str = str4;
            }
            eventInClub = EventInClub.d(eventInClub2, wVar.m, false, false, (Boolean) null, (String) null, 0, str, str3, (List) null, wVar.g, false, (String) null, (String) null, false, (Map) null, (String) null, 64830);
        }
        if (eventInClub != null) {
            AddEditEventViewModel addEditEventViewModel = this.c;
            MavericksViewModel.f(addEditEventViewModel, new AddEditEventViewModel$editEvent$2$1$1(wVar, addEditEventViewModel, eventInClub, (c<? super AddEditEventViewModel$editEvent$2$1$1>) null), (d0) null, (m) null, new AddEditEventViewModel$editEvent$2$1$2(wVar, addEditEventViewModel, eventInClub, eventInClub), 3, (Object) null);
        }
        return i.a;
    }
}
