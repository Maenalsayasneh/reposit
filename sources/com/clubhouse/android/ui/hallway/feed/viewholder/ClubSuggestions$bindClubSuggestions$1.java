package com.clubhouse.android.ui.hallway.feed.viewholder;

import com.clubhouse.android.data.models.local.club.Club;
import i0.b.a.o;
import i0.e.b.g3.p.c0.e0.q;
import i0.e.b.g3.p.c0.e0.r;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubSuggestions.kt */
public final class ClubSuggestions$bindClubSuggestions$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ r c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubSuggestions$bindClubSuggestions$1(r rVar) {
        super(1);
        this.c = rVar;
    }

    public Object invoke(Object obj) {
        o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$safeWithModels");
        r rVar = this.c;
        List<? extends Club> list = rVar.k;
        if (list != null) {
            for (Club club : list) {
                q qVar = new q();
                qVar.t(Integer.valueOf(club.getId()));
                ClubSuggestions$bindClubSuggestions$1$1$1$1$1 clubSuggestions$bindClubSuggestions$1$1$1$1$1 = new ClubSuggestions$bindClubSuggestions$1$1$1$1$1(rVar, club);
                qVar.w();
                qVar.i = clubSuggestions$bindClubSuggestions$1$1$1$1$1;
                qVar.w();
                qVar.j = club;
                l<? super Club, i> lVar = rVar.l;
                qVar.w();
                qVar.k = lVar;
                k kVar = new k(0, rVar);
                qVar.w();
                qVar.l = kVar;
                k kVar2 = new k(1, rVar);
                qVar.w();
                qVar.m = kVar2;
                l<? super Club, i> lVar2 = rVar.p;
                qVar.w();
                qVar.n = lVar2;
                oVar.add(qVar);
            }
        }
        return i.a;
    }
}
