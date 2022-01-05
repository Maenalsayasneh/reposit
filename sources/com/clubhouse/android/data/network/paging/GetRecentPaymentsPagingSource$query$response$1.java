package com.clubhouse.android.data.network.paging;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.PaginatedGetRecentPaymentsResponse;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: GetRecentPaymentsPagingSource.kt */
public final class GetRecentPaymentsPagingSource$query$response$1 extends Lambda implements l<PaginatedGetRecentPaymentsResponse, i> {
    public final /* synthetic */ GetRecentPaymentsPagingSource c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetRecentPaymentsPagingSource$query$response$1(GetRecentPaymentsPagingSource getRecentPaymentsPagingSource) {
        super(1);
        this.c = getRecentPaymentsPagingSource;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((PaginatedGetRecentPaymentsResponse) obj, "it");
        ((AmplitudeAnalytics) this.c.d).a("Server-GetRecentPayments-Success");
        return i.a;
    }
}
