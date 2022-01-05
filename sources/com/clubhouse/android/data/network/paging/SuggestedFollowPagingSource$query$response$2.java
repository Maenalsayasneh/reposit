package com.clubhouse.android.data.network.paging;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: SuggestedFollowPagingSource.kt */
public final class SuggestedFollowPagingSource$query$response$2 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ SuggestedFollowPagingSource c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestedFollowPagingSource$query$response$2(SuggestedFollowPagingSource suggestedFollowPagingSource) {
        super(1);
        this.c = suggestedFollowPagingSource;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.g).a("Server-GetSuggestedFollowsAll-Error");
        return i.a;
    }
}
