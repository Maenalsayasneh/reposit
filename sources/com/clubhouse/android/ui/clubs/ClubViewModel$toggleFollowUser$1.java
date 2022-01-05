package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.UserRepo;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.clubs.ClubViewModel$toggleFollowUser$1", f = "ClubViewModel.kt", l = {232, 234}, m = "invokeSuspend")
/* compiled from: ClubViewModel.kt */
public final class ClubViewModel$toggleFollowUser$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ ClubViewModel d;
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubViewModel$toggleFollowUser$1(ClubViewModel clubViewModel, int i, m0.l.c<? super ClubViewModel$toggleFollowUser$1> cVar) {
        super(1, cVar);
        this.d = clubViewModel;
        this.q = i;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ClubViewModel$toggleFollowUser$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new ClubViewModel$toggleFollowUser$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            if (this.d.r.t(this.q)) {
                UserRepo userRepo = this.d.r;
                int i2 = this.q;
                this.c = 1;
                obj = userRepo.x(i2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                UserRepo userRepo2 = this.d.r;
                int i3 = this.q;
                SourceLocation sourceLocation = SourceLocation.CLUB;
                this.c = 2;
                obj = UserRepo.j(userRepo2, i3, sourceLocation, (Map) null, this, 4, (Object) null);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return (EmptySuccessResponse) obj;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else if (i == 2) {
            h.d4(obj);
            return (EmptySuccessResponse) obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (EmptySuccessResponse) obj;
    }
}
