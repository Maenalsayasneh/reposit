package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import com.clubhouse.android.data.models.remote.response.GetEventsResponse;
import h0.u.w;
import i0.b.b.b;
import i0.e.b.g3.l.v1;
import i0.e.b.g3.l.y2.a;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ClubViewModel.kt */
public final class ClubViewModel$loadEvents$2 extends Lambda implements p<v1, b<? extends GetEventsResponse>, v1> {
    public static final ClubViewModel$loadEvents$2 c = new ClubViewModel$loadEvents$2();

    public ClubViewModel$loadEvents$2() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        v1 v1Var = (v1) obj;
        b bVar = (b) obj2;
        i.e(v1Var, "$this$execute");
        i.e(bVar, "it");
        return v1.copy$default(v1Var, (Integer) null, (ClubArgs) null, (b) null, bVar, (GetClubResponse) null, (w) null, false, (a) null, 247, (Object) null);
    }
}
