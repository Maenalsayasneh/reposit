package com.clubhouse.android.data.network.paging;

import com.clubhouse.analytics.AmplitudeAnalytics;
import i0.d.a.a.a;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: GetClubMembersPagingSource.kt */
public final class GetClubMembersPagingSource$query$response$1 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ GetClubMembersPagingSource c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetClubMembersPagingSource$query$response$1(GetClubMembersPagingSource getClubMembersPagingSource) {
        super(1);
        this.c = getClubMembersPagingSource;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        GetClubMembersPagingSource getClubMembersPagingSource = this.c;
        ((AmplitudeAnalytics) getClubMembersPagingSource.e).b("Server-GetClubMembers-Error", a.m1("ClubId", Integer.valueOf(getClubMembersPagingSource.c)));
        return i.a;
    }
}
