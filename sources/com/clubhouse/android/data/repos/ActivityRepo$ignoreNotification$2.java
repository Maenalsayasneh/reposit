package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ActivityRepo.kt */
public final class ActivityRepo$ignoreNotification$2 extends Lambda implements l<EmptySuccessResponse, i> {
    public final /* synthetic */ ActivityRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityRepo$ignoreNotification$2(ActivityRepo activityRepo) {
        super(1);
        this.c = activityRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((EmptySuccessResponse) obj, "it");
        ((AmplitudeAnalytics) this.c.d).a("Server-IgnoreActionableNotification-Success");
        return i.a;
    }
}
