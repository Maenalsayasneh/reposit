package com.clubhouse.backchannel.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import i0.e.c.f.b.a.d;
import i0.e.c.f.b.a.j;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$fetchChatMessages$2$response$1 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ DefaultBackchannelRepo c;
    public final /* synthetic */ String d;
    public final /* synthetic */ j q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$fetchChatMessages$2$response$1(DefaultBackchannelRepo defaultBackchannelRepo, String str, j jVar) {
        super(1);
        this.c = defaultBackchannelRepo;
        this.d = str;
        this.q = jVar;
    }

    public Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        m0.n.b.i.e(exc, "it");
        ((AmplitudeAnalytics) this.c.b).a("Server-GetChatMessages-Error");
        DefaultBackchannelRepo defaultBackchannelRepo = this.c;
        String str = this.d;
        j jVar = this.q;
        defaultBackchannelRepo.C(str, jVar, new d(jVar, new Error(exc)));
        return i.a;
    }
}
