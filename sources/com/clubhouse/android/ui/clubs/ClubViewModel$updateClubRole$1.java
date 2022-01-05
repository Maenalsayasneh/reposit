package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.user.UserInClub;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.e.b.g3.l.v1;
import i0.j.f.p.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.clubs.ClubViewModel$updateClubRole$1", f = "ClubViewModel.kt", l = {345, 347, 348, 351, 352}, m = "invokeSuspend")
/* compiled from: ClubViewModel.kt */
public final class ClubViewModel$updateClubRole$1 extends SuspendLambda implements l<m0.l.c<? super Object>, Object> {
    public int c;
    public final /* synthetic */ ClubViewModel d;
    public final /* synthetic */ ClubRole q;
    public final /* synthetic */ UserInClub x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubViewModel$updateClubRole$1(ClubViewModel clubViewModel, ClubRole clubRole, UserInClub userInClub, m0.l.c<? super ClubViewModel$updateClubRole$1> cVar) {
        super(1, cVar);
        this.d = clubViewModel;
        this.q = clubRole;
        this.x = userInClub;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ClubViewModel$updateClubRole$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new ClubViewModel$updateClubRole$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ClubViewModel clubViewModel = this.d;
            this.c = 1;
            obj = clubViewModel.e(this);
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
        Integer num = ((v1) obj).a;
        if (num != null) {
            int intValue = num.intValue();
            int ordinal = this.q.ordinal();
            if (ordinal == 0) {
                ClubRepo clubRepo = this.d.q;
                int intValue2 = this.x.getId().intValue();
                this.c = 2;
                Object b = clubRepo.b(intValue, intValue2, this);
                return b == coroutineSingletons ? coroutineSingletons : b;
            } else if (ordinal == 1) {
                ClubRepo clubRepo2 = this.d.q;
                int intValue3 = this.x.getId().intValue();
                this.c = 3;
                Object c2 = clubRepo2.c(intValue, intValue3, this);
                if (c2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return c2;
            } else if (ordinal == 2) {
                UserInClub userInClub = this.x;
                if (userInClub.c) {
                    ClubRepo clubRepo3 = this.d.q;
                    int intValue4 = userInClub.getId().intValue();
                    this.c = 4;
                    Object s = clubRepo3.s(intValue, intValue4, this);
                    if (s == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return s;
                } else if (!userInClub.x) {
                    return i.a;
                } else {
                    ClubRepo clubRepo4 = this.d.q;
                    int intValue5 = userInClub.getId().intValue();
                    this.c = 5;
                    Object t = clubRepo4.t(intValue, intValue5, this);
                    if (t == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return t;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
