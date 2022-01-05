package com.clubhouse.android.data.network.paging;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: SearchUsersPagingSource.kt */
public final class SearchUsersPagingSource$query$response$1 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ SearchUsersPagingSource c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchUsersPagingSource$query$response$1(SearchUsersPagingSource searchUsersPagingSource) {
        super(1);
        this.c = searchUsersPagingSource;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.e).a("Server-SearchUsers-Error");
        return i.a;
    }
}
