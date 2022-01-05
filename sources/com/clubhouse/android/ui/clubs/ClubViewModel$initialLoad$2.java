package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import h0.u.w;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.g3.l.v1;
import i0.e.b.g3.l.y2.a;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ClubViewModel.kt */
public final class ClubViewModel$initialLoad$2 extends Lambda implements p<v1, b<? extends GetClubResponse>, v1> {
    public final /* synthetic */ ClubViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubViewModel$initialLoad$2(ClubViewModel clubViewModel) {
        super(2);
        this.c = clubViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        ClubWithAdmin clubWithAdmin;
        v1 v1Var = (v1) obj;
        b bVar = (b) obj2;
        i.e(v1Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            f0 f0Var = (f0) bVar;
            ClubViewModel.q(this.c, ((GetClubResponse) f0Var.b).c.x);
            ClubViewModel.r(this.c, Integer.valueOf(((GetClubResponse) f0Var.b).c.x));
        }
        GetClubResponse getClubResponse = (GetClubResponse) bVar.a();
        GetClubResponse getClubResponse2 = (GetClubResponse) bVar.a();
        Integer num = null;
        if (!(getClubResponse2 == null || (clubWithAdmin = getClubResponse2.c) == null)) {
            num = Integer.valueOf(clubWithAdmin.x);
        }
        return v1.copy$default(v1Var, num == null ? v1Var.a : num, (ClubArgs) null, bVar, (b) null, getClubResponse, (w) null, false, (a) null, 234, (Object) null);
    }
}
