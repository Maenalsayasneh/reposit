package com.clubhouse.android.data.network.paging;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: GetFollowersFromNotificationPagingSource.kt */
public final class GetFollowersFromNotificationPagingSource$query$response$2 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ GetFollowersFromNotificationPagingSource c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetFollowersFromNotificationPagingSource$query$response$2(GetFollowersFromNotificationPagingSource getFollowersFromNotificationPagingSource) {
        super(1);
        this.c = getFollowersFromNotificationPagingSource;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.e).a("Server-GetFollowersWithNotificationId-Error");
        return i.a;
    }
}
