package com.clubhouse.android.data.network.paging;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.GetFollowersResponse;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: GetFollowersFromNotificationPagingSource.kt */
public final class GetFollowersFromNotificationPagingSource$query$response$1 extends Lambda implements l<GetFollowersResponse, i> {
    public final /* synthetic */ GetFollowersFromNotificationPagingSource c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetFollowersFromNotificationPagingSource$query$response$1(GetFollowersFromNotificationPagingSource getFollowersFromNotificationPagingSource) {
        super(1);
        this.c = getFollowersFromNotificationPagingSource;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((GetFollowersResponse) obj, "it");
        ((AmplitudeAnalytics) this.c.e).a(" Server-GetFollowersWithNotificationId-Success");
        return i.a;
    }
}
