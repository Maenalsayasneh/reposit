package com.clubhouse.android.ui.activity;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.data.repos.ActivityRepo;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import n0.a.g2.d;

@c(c = "com.clubhouse.android.ui.activity.ActivityViewModel$getActionableNotifications$1", f = "ActivityViewModel.kt", l = {93}, m = "invokeSuspend")
/* compiled from: ActivityViewModel.kt */
public final class ActivityViewModel$getActionableNotifications$1 extends SuspendLambda implements l<m0.l.c<? super d<? extends List<? extends ActionableNotification>>>, Object> {
    public int c;
    public final /* synthetic */ ActivityViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityViewModel$getActionableNotifications$1(ActivityViewModel activityViewModel, m0.l.c<? super ActivityViewModel$getActionableNotifications$1> cVar) {
        super(1, cVar);
        this.d = activityViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ActivityViewModel$getActionableNotifications$1(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new ActivityViewModel$getActionableNotifications$1(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ActivityRepo activityRepo = this.d.n;
            this.c = 1;
            obj = activityRepo.a(this);
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
