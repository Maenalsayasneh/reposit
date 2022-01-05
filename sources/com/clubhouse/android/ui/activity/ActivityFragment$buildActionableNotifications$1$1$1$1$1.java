package com.clubhouse.android.ui.activity;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import i0.e.b.g3.j.j0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ActivityFragment.kt */
public final class ActivityFragment$buildActionableNotifications$1$1$1$1$1 extends Lambda implements l<Boolean, i> {
    public final /* synthetic */ ActivityFragment c;
    public final /* synthetic */ ActionableNotification d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityFragment$buildActionableNotifications$1$1$1$1$1(ActivityFragment activityFragment, ActionableNotification actionableNotification) {
        super(1);
        this.c = activityFragment;
        this.d = actionableNotification;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ActivityFragment activityFragment = this.c;
            k<Object>[] kVarArr = ActivityFragment.Z1;
            activityFragment.O0().p(new j0(this.d));
        }
        return i.a;
    }
}
