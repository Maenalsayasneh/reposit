package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.user.UserInClub;
import i0.e.b.b3.b.e.f;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.clubs.ClubViewState$updateClubMemberRole$1", f = "ClubViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: ClubViewModel.kt */
public final class ClubViewState$updateClubMemberRole$1 extends SuspendLambda implements p<f, m0.l.c<? super f>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ClubRole q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubViewState$updateClubMemberRole$1(int i, ClubRole clubRole, m0.l.c<? super ClubViewState$updateClubMemberRole$1> cVar) {
        super(2, cVar);
        this.d = i;
        this.q = clubRole;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ClubViewState$updateClubMemberRole$1 clubViewState$updateClubMemberRole$1 = new ClubViewState$updateClubMemberRole$1(this.d, this.q, cVar);
        clubViewState$updateClubMemberRole$1.c = obj;
        return clubViewState$updateClubMemberRole$1;
    }

    public Object invoke(Object obj, Object obj2) {
        ClubViewState$updateClubMemberRole$1 clubViewState$updateClubMemberRole$1 = new ClubViewState$updateClubMemberRole$1(this.d, this.q, (m0.l.c) obj2);
        clubViewState$updateClubMemberRole$1.c = (f) obj;
        return clubViewState$updateClubMemberRole$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        f fVar = (f) this.c;
        if (fVar.g.getId().intValue() != this.d) {
            return fVar;
        }
        UserInClub userInClub = fVar.g;
        ClubRole clubRole = this.q;
        return f.g(fVar, UserInClub.a(userInClub, clubRole == ClubRole.ADMIN, false, false, clubRole == ClubRole.LEADER, (String) null, 0, (String) null, (String) null, (String) null, 502), false, false, false, 14);
    }
}
