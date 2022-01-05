package com.clubhouse.android.data.network.paging;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: GetEventsPagingSource.kt */
public final class GetEventsPagingSource$query$response$2 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ GetEventsPagingSource c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetEventsPagingSource$query$response$2(GetEventsPagingSource getEventsPagingSource) {
        super(1);
        this.c = getEventsPagingSource;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.d).a("Server-GetEvents-Error");
        return i.a;
    }
}
