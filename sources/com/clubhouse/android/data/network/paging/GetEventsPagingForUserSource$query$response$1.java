package com.clubhouse.android.data.network.paging;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.GetEventsResponse;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: GetEventsPagingForUserSource.kt */
public final class GetEventsPagingForUserSource$query$response$1 extends Lambda implements l<GetEventsResponse, i> {
    public final /* synthetic */ GetEventsPagingForUserSource c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetEventsPagingForUserSource$query$response$1(GetEventsPagingForUserSource getEventsPagingForUserSource) {
        super(1);
        this.c = getEventsPagingForUserSource;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((GetEventsResponse) obj, "it");
        ((AmplitudeAnalytics) this.c.e).a("Server-GetEventsForUser-Success");
        return i.a;
    }
}
