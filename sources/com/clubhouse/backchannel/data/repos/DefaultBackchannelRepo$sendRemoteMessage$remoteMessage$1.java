package com.clubhouse.backchannel.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$sendRemoteMessage$remoteMessage$1 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ DefaultBackchannelRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$sendRemoteMessage$remoteMessage$1(DefaultBackchannelRepo defaultBackchannelRepo) {
        super(1);
        this.c = defaultBackchannelRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.b).a("Server-SendChatMessage-Error");
        return i.a;
    }
}
