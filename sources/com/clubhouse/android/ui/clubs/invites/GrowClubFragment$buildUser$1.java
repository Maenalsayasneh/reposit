package com.clubhouse.android.ui.clubs.invites;

import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.ui.clubs.invites.AddableListUser;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.l.x2.c;
import i0.e.b.g3.l.x2.d;
import i0.e.b.g3.l.x2.j;
import i0.e.b.g3.l.x2.t;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: GrowClubFragment.kt */
public final class GrowClubFragment$buildUser$1 extends Lambda implements l<t, j> {
    public final /* synthetic */ m c;
    public final /* synthetic */ GrowClubFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrowClubFragment$buildUser$1(m mVar, GrowClubFragment growClubFragment) {
        super(1);
        this.c = mVar;
        this.d = growClubFragment;
    }

    public Object invoke(Object obj) {
        t tVar = (t) obj;
        i.e(tVar, "state");
        j jVar = new j();
        jVar.t(this.c.g.getId());
        UserInList userInList = this.c.g;
        jVar.w();
        jVar.j = userInList;
        String str = this.c.g.c;
        jVar.w();
        jVar.k = str;
        boolean contains = tVar.e.contains(this.c.g.getId());
        jVar.w();
        jVar.o = contains;
        AddableListUser.AddMethod addMethod = AddableListUser.AddMethod.INVITE;
        jVar.w();
        jVar.m = addMethod;
        boolean contains2 = tVar.f.contains(this.c.g.getId());
        jVar.w();
        jVar.n = contains2;
        c cVar = new c(this.d, this.c);
        jVar.w();
        jVar.p = cVar;
        d dVar = new d(this.d, this.c);
        jVar.w();
        jVar.l = dVar;
        return jVar;
    }
}
