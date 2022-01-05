package com.clubhouse.android.ui.events.creation;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import i0.b.a.o;
import i0.e.b.g3.o.w0.p0.k;
import i0.e.b.g3.o.w0.q;
import i0.e.b.g3.o.w0.r;
import i0.e.b.g3.o.w0.w;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: EventHostClubFragment.kt */
public final class EventHostClubFragment$buildHostsModels$1 extends Lambda implements l<w, i> {
    public final /* synthetic */ o c;
    public final /* synthetic */ EventHostClubFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventHostClubFragment$buildHostsModels$1(o oVar, EventHostClubFragment eventHostClubFragment) {
        super(1);
        this.c = oVar;
        this.d = eventHostClubFragment;
    }

    public Object invoke(Object obj) {
        w wVar = (w) obj;
        m0.n.b.i.e(wVar, "state");
        o oVar = this.c;
        EventHostClubFragment eventHostClubFragment = this.d;
        i0.e.b.g3.o.w0.p0.o oVar2 = new i0.e.b.g3.o.w0.p0.o();
        oVar2.J("No Host Club");
        oVar2.L(wVar.m == null);
        oVar2.K(new r(eventHostClubFragment));
        oVar.add(oVar2);
        List<ClubWithAdmin> list = wVar.n;
        o oVar3 = this.c;
        EventHostClubFragment eventHostClubFragment2 = this.d;
        for (ClubWithAdmin clubWithAdmin : list) {
            k kVar = new k();
            kVar.I(m0.n.b.i.k("divider", Integer.valueOf(clubWithAdmin.x)));
            oVar3.add(kVar);
            i0.e.b.g3.o.w0.p0.l lVar = new i0.e.b.g3.o.w0.p0.l();
            lVar.K(new Number[]{Integer.valueOf(clubWithAdmin.x)});
            lVar.J(clubWithAdmin);
            ClubWithAdmin clubWithAdmin2 = wVar.m;
            lVar.M(clubWithAdmin2 != null && clubWithAdmin2.x == clubWithAdmin.x);
            lVar.L(new q(eventHostClubFragment2, clubWithAdmin));
            oVar3.add(lVar);
        }
        return i.a;
    }
}
