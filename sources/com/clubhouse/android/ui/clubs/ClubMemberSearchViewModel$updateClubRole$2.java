package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.user.UserInClub;
import com.clubhouse.app.R;
import g0.a.b.b.a;
import h0.u.w;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.b3.b.e.f;
import i0.e.b.g3.l.s1;
import kotlin.jvm.internal.Lambda;
import m0.l.c;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ClubMemberSearchViewModel.kt */
public final class ClubMemberSearchViewModel$updateClubRole$2 extends Lambda implements p<s1, b<? extends Object>, s1> {
    public final /* synthetic */ UserInClub c;
    public final /* synthetic */ ClubRole d;
    public final /* synthetic */ ClubMemberSearchViewModel q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubMemberSearchViewModel$updateClubRole$2(UserInClub userInClub, ClubRole clubRole, ClubMemberSearchViewModel clubMemberSearchViewModel) {
        super(2);
        this.c = userInClub;
        this.d = clubRole;
        this.q = clubMemberSearchViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        s1 s1Var = (s1) obj;
        b bVar = (b) obj2;
        i.e(s1Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            w wVar = s1Var.f;
            if (wVar != null) {
                int intValue = this.c.getId().intValue();
                ClubRole clubRole = this.d;
                i.e(wVar, "memberList");
                i.e(clubRole, "role");
                wVar = a.d0(wVar, new ClubMemberSearchViewState$updateClubMemberRole$1(intValue, clubRole, (c<? super ClubMemberSearchViewState$updateClubMemberRole$1>) null));
            }
            w<f> wVar2 = s1Var.d;
            int intValue2 = this.c.getId().intValue();
            ClubRole clubRole2 = this.d;
            i.e(wVar2, "memberList");
            i.e(clubRole2, "role");
            return s1.copy$default(s1Var, 0, false, false, a.d0(wVar2, new ClubMemberSearchViewState$updateClubMemberRole$1(intValue2, clubRole2, (c<? super ClubMemberSearchViewState$updateClubMemberRole$1>) null)), (String) null, wVar, 23, (Object) null);
        } else if (!(bVar instanceof i0.b.b.c)) {
            return s1Var;
        } else {
            ClubMemberSearchViewModel clubMemberSearchViewModel = this.q;
            String message = ((i0.b.b.c) bVar).b.getMessage();
            if (message == null) {
                message = this.q.n.getString(R.string.update_club_role_error);
                i.d(message, "resources.getString(R.string.update_club_role_error)");
            }
            clubMemberSearchViewModel.o(new d(message));
            return s1Var;
        }
    }
}
