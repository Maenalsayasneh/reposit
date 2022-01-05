package com.clubhouse.android.data.network.paging;

import com.clubhouse.analytics.AmplitudeAnalytics;
import i0.d.a.a.a;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: GetFollowersPagingSource.kt */
public final class GetFollowersPagingSource$query$response$1 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ GetFollowersPagingSource c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetFollowersPagingSource$query$response$1(GetFollowersPagingSource getFollowersPagingSource) {
        super(1);
        this.c = getFollowersPagingSource;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        GetFollowersPagingSource getFollowersPagingSource = this.c;
        ((AmplitudeAnalytics) getFollowersPagingSource.e).b("Server-GetFollowers-Error", a.m1("UserId", Integer.valueOf(getFollowersPagingSource.c)));
        return i.a;
    }
}
