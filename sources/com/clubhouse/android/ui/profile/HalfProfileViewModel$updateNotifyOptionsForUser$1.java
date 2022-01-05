package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.UserRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.profile.HalfProfileViewModel$updateNotifyOptionsForUser$1", f = "HalfProfileViewModel.kt", l = {408}, m = "invokeSuspend")
/* compiled from: HalfProfileViewModel.kt */
public final class HalfProfileViewModel$updateNotifyOptionsForUser$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ HalfProfileViewModel d;
    public final /* synthetic */ int q;
    public final /* synthetic */ FollowNotificationType x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileViewModel$updateNotifyOptionsForUser$1(HalfProfileViewModel halfProfileViewModel, int i, FollowNotificationType followNotificationType, m0.l.c<? super HalfProfileViewModel$updateNotifyOptionsForUser$1> cVar) {
        super(1, cVar);
        this.d = halfProfileViewModel;
        this.q = i;
        this.x = followNotificationType;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new HalfProfileViewModel$updateNotifyOptionsForUser$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new HalfProfileViewModel$updateNotifyOptionsForUser$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            UserRepo userRepo = this.d.s;
            int i2 = this.q;
            FollowNotificationType followNotificationType = this.x;
            this.c = 1;
            obj = userRepo.A(i2, followNotificationType, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
