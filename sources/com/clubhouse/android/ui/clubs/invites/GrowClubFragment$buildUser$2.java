package com.clubhouse.android.ui.clubs.invites;

import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.ui.clubs.invites.AddableListUser;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.l.v1;
import i0.e.b.g3.l.x2.e;
import i0.e.b.g3.l.x2.f;
import i0.e.b.g3.l.x2.j;
import i0.e.b.g3.l.x2.t;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: GrowClubFragment.kt */
public final class GrowClubFragment$buildUser$2 extends Lambda implements p<v1, t, j> {
    public final /* synthetic */ m c;
    public final /* synthetic */ GrowClubFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrowClubFragment$buildUser$2(m mVar, GrowClubFragment growClubFragment) {
        super(2);
        this.c = mVar;
        this.d = growClubFragment;
    }

    public Object invoke(Object obj, Object obj2) {
        v1 v1Var = (v1) obj;
        t tVar = (t) obj2;
        i.e(v1Var, "clubState");
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
        AddableListUser.AddMethod addMethod = AddableListUser.AddMethod.NOMINATE;
        jVar.w();
        jVar.m = addMethod;
        boolean contains2 = tVar.f.contains(this.c.g.getId());
        jVar.w();
        jVar.n = contains2;
        f fVar = new f(this.d, this.c, v1Var);
        jVar.w();
        jVar.p = fVar;
        e eVar = new e(this.d, this.c);
        jVar.w();
        jVar.l = eVar;
        return jVar;
    }
}
