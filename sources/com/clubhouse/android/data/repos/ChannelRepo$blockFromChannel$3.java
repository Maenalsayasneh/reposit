package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import i0.d.a.a.a;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelRepo.kt */
public final class ChannelRepo$blockFromChannel$3 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ ChannelRepo c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelRepo$blockFromChannel$3(ChannelRepo channelRepo, String str) {
        super(1);
        this.c = channelRepo;
        this.d = str;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.c).b("Server-BlockFromChannel-Error", a.n1(Include.INCLUDE_CHANNEL_PARAM_VALUE, this.d));
        return i.a;
    }
}
