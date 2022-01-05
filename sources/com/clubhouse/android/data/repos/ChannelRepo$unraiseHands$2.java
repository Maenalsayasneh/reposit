package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.AudienceReplyResponse;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import i0.d.a.a.a;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelRepo.kt */
public final class ChannelRepo$unraiseHands$2 extends Lambda implements l<AudienceReplyResponse, i> {
    public final /* synthetic */ ChannelRepo c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelRepo$unraiseHands$2(ChannelRepo channelRepo, String str) {
        super(1);
        this.c = channelRepo;
        this.d = str;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((AudienceReplyResponse) obj, "it");
        ((AmplitudeAnalytics) this.c.c).b("Server-AudienceReply-UnraiseHands-Success", a.n1(Include.INCLUDE_CHANNEL_PARAM_VALUE, this.d));
        return i.a;
    }
}
