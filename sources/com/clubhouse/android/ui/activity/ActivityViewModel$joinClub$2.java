package com.clubhouse.android.ui.activity;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.j.d0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ActivityViewModel.kt */
public final class ActivityViewModel$joinClub$2 extends Lambda implements p<d0, b<? extends EmptySuccessResponse>, d0> {
    public final /* synthetic */ ActivityViewModel c;
    public final /* synthetic */ ActionableNotification d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityViewModel$joinClub$2(ActivityViewModel activityViewModel, ActionableNotification actionableNotification) {
        super(2);
        this.c = activityViewModel;
        this.d = actionableNotification;
    }

    public Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) obj;
        b bVar = (b) obj2;
        i.e(d0Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            ActivityViewModel.q(this.c, this.d);
        }
        if (bVar instanceof c) {
            this.c.o(new d((String) null, 1));
        }
        return d0Var;
    }
}
