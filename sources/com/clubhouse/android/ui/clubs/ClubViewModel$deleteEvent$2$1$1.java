package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import com.clubhouse.android.data.models.remote.response.GetEventsResponse;
import h0.u.w;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.g3.l.v1;
import i0.e.b.g3.l.y2.a;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: ClubViewModel.kt */
public final class ClubViewModel$deleteEvent$2$1$1 extends Lambda implements l<v1, v1> {
    public final /* synthetic */ GetEventsResponse c;
    public final /* synthetic */ EventInClub d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubViewModel$deleteEvent$2$1$1(GetEventsResponse getEventsResponse, EventInClub eventInClub) {
        super(1);
        this.c = getEventsResponse;
        this.d = eventInClub;
    }

    public Object invoke(Object obj) {
        List<T> list;
        v1 v1Var = (v1) obj;
        i.e(v1Var, "$this$setState");
        GetEventsResponse getEventsResponse = this.c;
        List<EventInClub> list2 = getEventsResponse.a;
        if (list2 == null) {
            list = null;
        } else {
            list = g.Q(list2, this.d);
        }
        return v1.copy$default(v1Var, (Integer) null, (ClubArgs) null, (b) null, new f0(new GetEventsResponse(list, getEventsResponse.b, getEventsResponse.c, getEventsResponse.d)), (GetClubResponse) null, (w) null, false, (a) null, 247, (Object) null);
    }
}
