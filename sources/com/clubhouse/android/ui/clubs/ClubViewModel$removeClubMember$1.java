package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.e.b.g3.l.v1;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.clubs.ClubViewModel$removeClubMember$1", f = "ClubViewModel.kt", l = {280, 281}, m = "invokeSuspend")
/* compiled from: ClubViewModel.kt */
public final class ClubViewModel$removeClubMember$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ ClubViewModel d;
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubViewModel$removeClubMember$1(ClubViewModel clubViewModel, int i, m0.l.c<? super ClubViewModel$removeClubMember$1> cVar) {
        super(1, cVar);
        this.d = clubViewModel;
        this.q = i;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ClubViewModel$removeClubMember$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new ClubViewModel$removeClubMember$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
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
        } else if (i == 2) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Integer num = ((v1) obj).a;
        if (num != null) {
            int intValue = num.intValue();
            ClubRepo clubRepo = this.d.q;
            int i2 = this.q;
            this.c = 2;
            obj = clubRepo.u(intValue, i2, this);
            return obj == coroutineSingletons ? coroutineSingletons : obj;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
