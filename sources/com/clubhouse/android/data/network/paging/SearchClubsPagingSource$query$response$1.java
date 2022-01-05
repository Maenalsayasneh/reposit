package com.clubhouse.android.data.network.paging;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: SearchClubsPagingSource.kt */
public final class SearchClubsPagingSource$query$response$1 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ SearchClubsPagingSource c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchClubsPagingSource$query$response$1(SearchClubsPagingSource searchClubsPagingSource) {
        super(1);
        this.c = searchClubsPagingSource;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.e).a("Server-SearchClubs-Error");
        return i.a;
    }
}
