package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import i0.j.f.p.h;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelRepo.kt */
public final class ChannelRepo$getFeed$2 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ ChannelRepo c;
    public final /* synthetic */ long d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelRepo$getFeed$2(ChannelRepo channelRepo, long j) {
        super(1);
        this.c = channelRepo;
        this.d = j;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.c).b("Server-GetFeed-Error", h.S2(new Pair("request_duration", Long.valueOf(System.currentTimeMillis() - this.d))));
        return i.a;
    }
}
