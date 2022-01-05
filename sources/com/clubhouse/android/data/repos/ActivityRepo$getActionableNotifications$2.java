package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ActivityRepo.kt */
public final class ActivityRepo$getActionableNotifications$2 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ ActivityRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityRepo$getActionableNotifications$2(ActivityRepo activityRepo) {
        super(1);
        this.c = activityRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.d).a("Server-GetActionableNotifications-Error");
        return i.a;
    }
}
