package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.channel.BaseChannelInRoom;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelRepo.kt */
public final class ChannelRepo$getWelcomeChannel$2 extends Lambda implements l<BaseChannelInRoom, i> {
    public final /* synthetic */ ChannelRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelRepo$getWelcomeChannel$2(ChannelRepo channelRepo) {
        super(1);
        this.c = channelRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((BaseChannelInRoom) obj, "it");
        ((AmplitudeAnalytics) this.c.c).a("Server-GetWelcomeChannel-Success");
        return i.a;
    }
}
