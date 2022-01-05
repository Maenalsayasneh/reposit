package com.clubhouse.android.ui.activity.overflow;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.ActivityRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.activity.overflow.ActivityOverflowViewModel$ignoreNotification$1", f = "ActivityOverflowViewModel.kt", l = {89}, m = "invokeSuspend")
/* compiled from: ActivityOverflowViewModel.kt */
public final class ActivityOverflowViewModel$ignoreNotification$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ ActivityOverflowViewModel d;
    public final /* synthetic */ ActionableNotification q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityOverflowViewModel$ignoreNotification$1(ActivityOverflowViewModel activityOverflowViewModel, ActionableNotification actionableNotification, m0.l.c<? super ActivityOverflowViewModel$ignoreNotification$1> cVar) {
        super(1, cVar);
        this.d = activityOverflowViewModel;
        this.q = actionableNotification;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ActivityOverflowViewModel$ignoreNotification$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new ActivityOverflowViewModel$ignoreNotification$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ActivityRepo activityRepo = this.d.n;
            long j = this.q.c;
            this.c = 1;
            obj = activityRepo.b(j, this);
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
