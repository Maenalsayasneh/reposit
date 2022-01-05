package com.clubhouse.android.ui.activity;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import h0.u.w;
import i0.e.b.g3.j.d0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: ActivityViewModel.kt */
public final class ActivityViewModel$updateActionableNotifications$1 extends Lambda implements l<d0, i> {
    public final /* synthetic */ ActivityViewModel c;
    public final /* synthetic */ ActionableNotification d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityViewModel$updateActionableNotifications$1(ActivityViewModel activityViewModel, ActionableNotification actionableNotification) {
        super(1);
        this.c = activityViewModel;
        this.d = actionableNotification;
    }

    public Object invoke(Object obj) {
        final d0 d0Var = (d0) obj;
        m0.n.b.i.e(d0Var, "state");
        this.c.p.d.e.setValue(Integer.valueOf((d0Var.c.size() + d0Var.b.size()) - 1));
        this.c.n.c(this.d);
        ActivityViewModel activityViewModel = this.c;
        final ActionableNotification actionableNotification = this.d;
        activityViewModel.m(new l<d0, d0>() {
            public Object invoke(Object obj) {
                d0 d0Var = (d0) obj;
                m0.n.b.i.e(d0Var, "$this$setState");
                return d0.copy$default(d0Var, (w) null, g.Q(d0.this.b, actionableNotification), (List) null, 5, (Object) null);
            }
        });
        return i.a;
    }
}
