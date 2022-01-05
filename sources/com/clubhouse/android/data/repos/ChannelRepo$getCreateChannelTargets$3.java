package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelRepo.kt */
public final class ChannelRepo$getCreateChannelTargets$3 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ ChannelRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelRepo$getCreateChannelTargets$3(ChannelRepo channelRepo) {
        super(1);
        this.c = channelRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.c).a("Server-GetCreateChannelTargets-Error");
        return i.a;
    }
}
