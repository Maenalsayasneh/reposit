package com.clubhouse.android.ui.activity;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import n0.a.g2.d;

@c(c = "com.clubhouse.android.ui.activity.ActivityViewModel$getActionableNotifications$3", f = "ActivityViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: ActivityViewModel.kt */
public final class ActivityViewModel$getActionableNotifications$3 extends SuspendLambda implements l<m0.l.c<? super d<? extends List<? extends ActionableNotification>>>, Object> {
    public final /* synthetic */ ActivityViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityViewModel$getActionableNotifications$3(ActivityViewModel activityViewModel, m0.l.c<? super ActivityViewModel$getActionableNotifications$3> cVar) {
        super(1, cVar);
        this.c = activityViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ActivityViewModel$getActionableNotifications$3(this.c, cVar);
    }

    public Object invoke(Object obj) {
        ActivityViewModel activityViewModel = this.c;
        new ActivityViewModel$getActionableNotifications$3(activityViewModel, (m0.l.c) obj);
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        return activityViewModel.n.c.a;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        return this.c.n.c.a;
    }
}
