package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelRepo.kt */
public final class ChannelRepo$hideChannel$2 extends Lambda implements l<EmptySuccessResponse, i> {
    public final /* synthetic */ ChannelRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelRepo$hideChannel$2(ChannelRepo channelRepo) {
        super(1);
        this.c = channelRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((EmptySuccessResponse) obj, "it");
        ((AmplitudeAnalytics) this.c.c).a("Server-HideChannel-Success");
        return i.a;
    }
}
