package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.request.ChangeHandraiseSettingsRequest;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import i0.e.a.a;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: ChannelRepo.kt */
public final class ChannelRepo$changeHandraisePermissions$2 extends Lambda implements l<EmptySuccessResponse, i> {
    public final /* synthetic */ ChannelRepo c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ChangeHandraiseSettingsRequest q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelRepo$changeHandraisePermissions$2(ChannelRepo channelRepo, String str, ChangeHandraiseSettingsRequest changeHandraiseSettingsRequest) {
        super(1);
        this.c = channelRepo;
        this.d = str;
        this.q = changeHandraiseSettingsRequest;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((EmptySuccessResponse) obj, "it");
        a aVar = this.c.c;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair(Include.INCLUDE_CHANNEL_PARAM_VALUE, this.d);
        pairArr[1] = new Pair("isEnabled", m0.n.b.i.a(Boolean.valueOf(this.q.b), Boolean.TRUE) ? "YES" : "NO");
        pairArr[2] = new Pair("handraisePermission", this.q.c);
        ((AmplitudeAnalytics) aVar).b("Server-ChangeHandraiseSettings-Success", g.N(pairArr));
        return i.a;
    }
}
