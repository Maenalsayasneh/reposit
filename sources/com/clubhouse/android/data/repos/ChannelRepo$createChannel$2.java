package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.android.data.models.remote.request.CreateChannelRequest;
import i0.e.a.a;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: ChannelRepo.kt */
public final class ChannelRepo$createChannel$2 extends Lambda implements l<ChannelInRoomWithAccess, i> {
    public final /* synthetic */ ChannelRepo c;
    public final /* synthetic */ CreateChannelRequest d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelRepo$createChannel$2(ChannelRepo channelRepo, CreateChannelRequest createChannelRequest) {
        super(1);
        this.c = channelRepo;
        this.d = createChannelRequest;
    }

    public Object invoke(Object obj) {
        Boolean bool;
        String str;
        String str2;
        String str3;
        String str4;
        m0.n.b.i.e((ChannelInRoomWithAccess) obj, "it");
        ((AmplitudeAnalytics) this.c.c).a("Server-CreateChannel-Success");
        a aVar = this.c.c;
        Pair[] pairArr = new Pair[6];
        String str5 = this.d.f;
        boolean z = false;
        if (str5 == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(str5.length() > 0);
        }
        Boolean bool2 = Boolean.TRUE;
        String str6 = "YES";
        pairArr[0] = new Pair("HasTopic", m0.n.b.i.a(bool, bool2) ? str6 : "NO");
        if (m0.n.b.i.a(Boolean.valueOf(!this.d.c.isEmpty()), bool2)) {
            str = str6;
        } else {
            str = "NO";
        }
        pairArr[1] = new Pair("IsMulticast", str);
        if (m0.n.b.i.a(Boolean.valueOf(this.d.e != null), bool2)) {
            str2 = str6;
        } else {
            str2 = "NO";
        }
        pairArr[2] = new Pair("IsEvent", str2);
        if (m0.n.b.i.a(Boolean.valueOf(this.d.a), bool2)) {
            str3 = str6;
        } else {
            str3 = "NO";
        }
        pairArr[3] = new Pair("IsSocialMode", str3);
        if (m0.n.b.i.a(Boolean.valueOf(this.d.b), bool2)) {
            str4 = str6;
        } else {
            str4 = "NO";
        }
        pairArr[4] = new Pair("IsClosed", str4);
        if (this.c.e.getValue() != null) {
            z = true;
        }
        if (!m0.n.b.i.a(Boolean.valueOf(z), bool2)) {
            str6 = "NO";
        }
        pairArr[5] = new Pair("LeaveExisting", str6);
        ((AmplitudeAnalytics) aVar).b("Channel-Start", g.N(pairArr));
        return i.a;
    }
}
