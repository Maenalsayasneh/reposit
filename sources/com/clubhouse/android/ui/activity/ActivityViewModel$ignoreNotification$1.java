package com.clubhouse.android.ui.activity;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.ActivityRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.activity.ActivityViewModel$ignoreNotification$1", f = "ActivityViewModel.kt", l = {174}, m = "invokeSuspend")
/* compiled from: ActivityViewModel.kt */
public final class ActivityViewModel$ignoreNotification$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ ActivityViewModel d;
    public final /* synthetic */ ActionableNotification q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityViewModel$ignoreNotification$1(ActivityViewModel activityViewModel, ActionableNotification actionableNotification, m0.l.c<? super ActivityViewModel$ignoreNotification$1> cVar) {
        super(1, cVar);
        this.d = activityViewModel;
        this.q = actionableNotification;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ActivityViewModel$ignoreNotification$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new ActivityViewModel$ignoreNotification$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
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
