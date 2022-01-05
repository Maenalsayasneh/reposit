package com.clubhouse.android.data.network;

import com.clubhouse.analytics.AmplitudeAnalytics;
import i0.j.f.p.h;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: MeDataSource.kt */
public final class MeDataSource$makeRequest$2 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ MeDataSource c;
    public final /* synthetic */ long d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeDataSource$makeRequest$2(MeDataSource meDataSource, long j) {
        super(1);
        this.c = meDataSource;
        this.d = j;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.g).b("Server-Me-Error", h.S2(new Pair("request_duration", Long.valueOf(System.currentTimeMillis() - this.d))));
        return i.a;
    }
}
