package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.user.UserInClub;
import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import com.clubhouse.app.R;
import g0.a.b.b.a;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.l.v1;
import kotlin.jvm.internal.Lambda;
import m0.l.c;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ClubViewModel.kt */
public final class ClubViewModel$updateClubRole$2 extends Lambda implements p<v1, b<? extends Object>, v1> {
    public final /* synthetic */ UserInClub c;
    public final /* synthetic */ ClubRole d;
    public final /* synthetic */ ClubViewModel q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubViewModel$updateClubRole$2(UserInClub userInClub, ClubRole clubRole, ClubViewModel clubViewModel) {
        super(2);
        this.c = userInClub;
        this.d = clubRole;
        this.q = clubViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        v1 v1Var = (v1) obj;
        b bVar = (b) obj2;
        i.e(v1Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            int intValue = this.c.getId().intValue();
            ClubRole clubRole = this.d;
            i.e(clubRole, "role");
            return v1.copy$default(v1Var, (Integer) null, (ClubArgs) null, (b) null, (b) null, (GetClubResponse) null, a.d0(v1Var.f, new ClubViewState$updateClubMemberRole$1(intValue, clubRole, (c<? super ClubViewState$updateClubMemberRole$1>) null)), false, (i0.e.b.g3.l.y2.a) null, 223, (Object) null);
        } else if (!(bVar instanceof i0.b.b.c)) {
            return v1Var;
        } else {
            ClubViewModel clubViewModel = this.q;
            String message = ((i0.b.b.c) bVar).b.getMessage();
            if (message == null) {
                message = this.q.o.getString(R.string.update_club_role_error);
                i.d(message, "resources.getString(R.string.update_club_role_error)");
            }
            clubViewModel.o(new d(message));
            return v1Var;
        }
    }
}
