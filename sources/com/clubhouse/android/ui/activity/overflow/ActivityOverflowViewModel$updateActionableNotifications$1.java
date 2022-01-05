package com.clubhouse.android.ui.activity.overflow;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import i0.e.b.g3.j.k0.g;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ActivityOverflowViewModel.kt */
public final class ActivityOverflowViewModel$updateActionableNotifications$1 extends Lambda implements l<g, i> {
    public final /* synthetic */ ActivityOverflowViewModel c;
    public final /* synthetic */ ActionableNotification d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityOverflowViewModel$updateActionableNotifications$1(ActivityOverflowViewModel activityOverflowViewModel, ActionableNotification actionableNotification) {
        super(1);
        this.c = activityOverflowViewModel;
        this.d = actionableNotification;
    }

    public Object invoke(Object obj) {
        g gVar = (g) obj;
        m0.n.b.i.e(gVar, "state");
        List<ActionableNotification> list = gVar.a;
        ActivityOverflowViewModel activityOverflowViewModel = this.c;
        ActionableNotification actionableNotification = this.d;
        activityOverflowViewModel.o.d.e.setValue(Integer.valueOf(list.size() - 1));
        activityOverflowViewModel.n.c(actionableNotification);
        return i.a;
    }
}
