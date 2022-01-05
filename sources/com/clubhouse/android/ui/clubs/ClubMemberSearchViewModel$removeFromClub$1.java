package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.e.b.g3.l.s1;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.clubs.ClubMemberSearchViewModel$removeFromClub$1", f = "ClubMemberSearchViewModel.kt", l = {187, 187}, m = "invokeSuspend")
/* compiled from: ClubMemberSearchViewModel.kt */
public final class ClubMemberSearchViewModel$removeFromClub$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public Object c;
    public int d;
    public final /* synthetic */ ClubMemberSearchViewModel q;
    public final /* synthetic */ int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubMemberSearchViewModel$removeFromClub$1(ClubMemberSearchViewModel clubMemberSearchViewModel, int i, m0.l.c<? super ClubMemberSearchViewModel$removeFromClub$1> cVar) {
        super(1, cVar);
        this.q = clubMemberSearchViewModel;
        this.x = i;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ClubMemberSearchViewModel$removeFromClub$1(this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new ClubMemberSearchViewModel$removeFromClub$1(this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        ClubRepo clubRepo;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            ClubMemberSearchViewModel clubMemberSearchViewModel = this.q;
            clubRepo = clubMemberSearchViewModel.p;
            this.c = clubRepo;
            this.d = 1;
            obj = clubMemberSearchViewModel.e(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            clubRepo = (ClubRepo) this.c;
            h.d4(obj);
        } else if (i == 2) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = ((s1) obj).a;
        int i3 = this.x;
        this.c = null;
        this.d = 2;
        obj = clubRepo.u(i2, i3, this);
        return obj == coroutineSingletons ? coroutineSingletons : obj;
    }
}
