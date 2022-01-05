package com.clubhouse.android.data.network.paging;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: GetNotificationsPagingSource.kt */
public final class GetNotificationsPagingSource$query$response$1 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ GetNotificationsPagingSource c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetNotificationsPagingSource$query$response$1(GetNotificationsPagingSource getNotificationsPagingSource) {
        super(1);
        this.c = getNotificationsPagingSource;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.d).a("Server-GetNotifications-Error");
        return i.a;
    }
}
