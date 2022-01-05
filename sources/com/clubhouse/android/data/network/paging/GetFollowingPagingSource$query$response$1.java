package com.clubhouse.android.data.network.paging;

import com.clubhouse.analytics.AmplitudeAnalytics;
import i0.d.a.a.a;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: GetFollowingPagingSource.kt */
public final class GetFollowingPagingSource$query$response$1 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ GetFollowingPagingSource c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetFollowingPagingSource$query$response$1(GetFollowingPagingSource getFollowingPagingSource) {
        super(1);
        this.c = getFollowingPagingSource;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        GetFollowingPagingSource getFollowingPagingSource = this.c;
        ((AmplitudeAnalytics) getFollowingPagingSource.e).b("Server-GetFollowing-Error", a.m1("UserId", Integer.valueOf(getFollowingPagingSource.c)));
        return i.a;
    }
}
