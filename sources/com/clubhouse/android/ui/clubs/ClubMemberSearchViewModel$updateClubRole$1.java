package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.user.UserInClub;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.e.b.g3.l.s1;
import i0.j.f.p.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.clubs.ClubMemberSearchViewModel$updateClubRole$1", f = "ClubMemberSearchViewModel.kt", l = {129, 131, 132, 135, 136}, m = "invokeSuspend")
/* compiled from: ClubMemberSearchViewModel.kt */
public final class ClubMemberSearchViewModel$updateClubRole$1 extends SuspendLambda implements l<m0.l.c<? super Object>, Object> {
    public int c;
    public final /* synthetic */ ClubMemberSearchViewModel d;
    public final /* synthetic */ ClubRole q;
    public final /* synthetic */ UserInClub x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubMemberSearchViewModel$updateClubRole$1(ClubMemberSearchViewModel clubMemberSearchViewModel, ClubRole clubRole, UserInClub userInClub, m0.l.c<? super ClubMemberSearchViewModel$updateClubRole$1> cVar) {
        super(1, cVar);
        this.d = clubMemberSearchViewModel;
        this.q = clubRole;
        this.x = userInClub;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ClubMemberSearchViewModel$updateClubRole$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new ClubMemberSearchViewModel$updateClubRole$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ClubMemberSearchViewModel clubMemberSearchViewModel = this.d;
            this.c = 1;
            obj = clubMemberSearchViewModel.e(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else if (i == 2 || i == 3 || i == 4 || i == 5) {
            h.d4(obj);
            return obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = ((s1) obj).a;
        int ordinal = this.q.ordinal();
        if (ordinal == 0) {
            ClubRepo clubRepo = this.d.p;
            int intValue = this.x.getId().intValue();
            this.c = 2;
            Object b = clubRepo.b(i2, intValue, this);
            return b == coroutineSingletons ? coroutineSingletons : b;
        } else if (ordinal == 1) {
            ClubRepo clubRepo2 = this.d.p;
            int intValue2 = this.x.getId().intValue();
            this.c = 3;
            Object c2 = clubRepo2.c(i2, intValue2, this);
            if (c2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            return c2;
        } else if (ordinal == 2) {
            UserInClub userInClub = this.x;
            if (userInClub.c) {
                ClubRepo clubRepo3 = this.d.p;
                int intValue3 = userInClub.getId().intValue();
                this.c = 4;
                Object s = clubRepo3.s(i2, intValue3, this);
                if (s == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return s;
            } else if (!userInClub.x) {
                return i.a;
            } else {
                ClubRepo clubRepo4 = this.d.p;
                int intValue4 = userInClub.getId().intValue();
                this.c = 5;
                Object t = clubRepo4.t(i2, intValue4, this);
                if (t == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return t;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
