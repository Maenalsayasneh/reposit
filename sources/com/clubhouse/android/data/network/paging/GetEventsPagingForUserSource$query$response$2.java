package com.clubhouse.android.data.network.paging;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: GetEventsPagingForUserSource.kt */
public final class GetEventsPagingForUserSource$query$response$2 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ GetEventsPagingForUserSource c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetEventsPagingForUserSource$query$response$2(GetEventsPagingForUserSource getEventsPagingForUserSource) {
        super(1);
        this.c = getEventsPagingForUserSource;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.e).a("Server-GetEventsForUser-Error");
        return i.a;
    }
}
