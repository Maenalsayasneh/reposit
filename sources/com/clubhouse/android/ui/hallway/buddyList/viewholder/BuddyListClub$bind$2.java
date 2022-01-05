package com.clubhouse.android.ui.hallway.buddyList.viewholder;

import com.clubhouse.android.data.models.local.club.ClubInStatus;
import com.clubhouse.android.data.models.local.user.BasicUser;
import i0.b.a.o;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BuddyListClub.kt */
public final class BuddyListClub$bind$2 extends Lambda implements l<o, i> {
    public final /* synthetic */ BuddyListClub c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuddyListClub$bind$2(BuddyListClub buddyListClub) {
        super(1);
        this.c = buddyListClub;
    }

    public Object invoke(Object obj) {
        List<BasicUser> list;
        o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$safeWithModels");
        BuddyListClub buddyListClub = this.c;
        ClubInStatus clubInStatus = buddyListClub.j;
        if (!(clubInStatus == null || (list = clubInStatus.d) == null)) {
            for (BasicUser basicUser : list) {
                i0.e.b.g3.p.b0.x.i iVar = new i0.e.b.g3.p.b0.x.i();
                iVar.M(new Number[]{basicUser.getId()});
                iVar.N(basicUser.d);
                iVar.O(basicUser.x);
                iVar.L(buddyListClub.k);
                oVar.add(iVar);
            }
        }
        return i.a;
    }
}
