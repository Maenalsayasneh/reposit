package com.clubhouse.android.data.network;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BuddyListDataSource.kt */
public final class BuddyListDataSource$makeRequest$response$1 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ BuddyListDataSource c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuddyListDataSource$makeRequest$response$1(BuddyListDataSource buddyListDataSource) {
        super(1);
        this.c = buddyListDataSource;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.f).a("Server-GetOnlineFriends-Error");
        return i.a;
    }
}
