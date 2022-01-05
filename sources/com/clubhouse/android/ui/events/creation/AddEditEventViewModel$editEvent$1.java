package com.clubhouse.android.ui.events.creation;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.user.model.UserSelf;
import i0.e.b.g3.o.w0.w;
import j$.time.OffsetDateTime;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: AddEditEventViewModel.kt */
public final class AddEditEventViewModel$editEvent$1 extends Lambda implements l<w, w> {
    public static final AddEditEventViewModel$editEvent$1 c = new AddEditEventViewModel$editEvent$1();

    public AddEditEventViewModel$editEvent$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        w wVar = (w) obj;
        i.e(wVar, "$this$setState");
        return w.copy$default(wVar, (EventInClub) null, (String) null, (String) null, (String) null, (String) null, 0, (OffsetDateTime) null, false, false, (List) null, false, (UserSelf) null, (ClubWithAdmin) null, (List) null, true, 16383, (Object) null);
    }
}
