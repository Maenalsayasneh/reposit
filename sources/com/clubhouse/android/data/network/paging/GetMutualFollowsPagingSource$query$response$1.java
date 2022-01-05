package com.clubhouse.android.data.network.paging;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.GetMutualFollowsResponse;
import i0.d.a.a.a;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: GetMutualFollowsPagingSource.kt */
public final class GetMutualFollowsPagingSource$query$response$1 extends Lambda implements l<GetMutualFollowsResponse, i> {
    public final /* synthetic */ GetMutualFollowsPagingSource c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetMutualFollowsPagingSource$query$response$1(GetMutualFollowsPagingSource getMutualFollowsPagingSource) {
        super(1);
        this.c = getMutualFollowsPagingSource;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((GetMutualFollowsResponse) obj, "it");
        GetMutualFollowsPagingSource getMutualFollowsPagingSource = this.c;
        ((AmplitudeAnalytics) getMutualFollowsPagingSource.e).b("Server-GetMutualFollows-Success", a.m1("UserId", Integer.valueOf(getMutualFollowsPagingSource.c)));
        return i.a;
    }
}
