package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: NotificationRepo.kt */
public final class NotificationRepo$updateNotificationEnableTrending$2 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ NotificationRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationRepo$updateNotificationEnableTrending$2(NotificationRepo notificationRepo) {
        super(1);
        this.c = notificationRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.b).a("Server-UpdateNotifications-Error");
        return i.a;
    }
}
