package com.clubhouse.android.ui.activity.overflow;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.j.k0.g;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ActivityOverflowViewModel.kt */
public final class ActivityOverflowViewModel$ignoreNotification$2 extends Lambda implements p<g, b<? extends EmptySuccessResponse>, g> {
    public final /* synthetic */ ActivityOverflowViewModel c;
    public final /* synthetic */ ActionableNotification d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityOverflowViewModel$ignoreNotification$2(ActivityOverflowViewModel activityOverflowViewModel, ActionableNotification actionableNotification) {
        super(2);
        this.c = activityOverflowViewModel;
        this.d = actionableNotification;
    }

    public Object invoke(Object obj, Object obj2) {
        g gVar = (g) obj;
        b bVar = (b) obj2;
        i.e(gVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            ActivityOverflowViewModel activityOverflowViewModel = this.c;
            ActionableNotification actionableNotification = this.d;
            Objects.requireNonNull(activityOverflowViewModel);
            activityOverflowViewModel.n(new ActivityOverflowViewModel$updateActionableNotifications$1(activityOverflowViewModel, actionableNotification));
        }
        if (bVar instanceof c) {
            this.c.o(new d((String) null, 1));
        }
        return gVar;
    }
}
