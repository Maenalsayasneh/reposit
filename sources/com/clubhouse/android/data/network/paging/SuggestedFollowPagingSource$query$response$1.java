package com.clubhouse.android.data.network.paging;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.PaginatedUsersInListResponse;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: SuggestedFollowPagingSource.kt */
public final class SuggestedFollowPagingSource$query$response$1 extends Lambda implements l<PaginatedUsersInListResponse, i> {
    public final /* synthetic */ SuggestedFollowPagingSource c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestedFollowPagingSource$query$response$1(SuggestedFollowPagingSource suggestedFollowPagingSource) {
        super(1);
        this.c = suggestedFollowPagingSource;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((PaginatedUsersInListResponse) obj, "it");
        ((AmplitudeAnalytics) this.c.g).a("Server-GetSuggestedFollowsAll-Success");
        return i.a;
    }
}
