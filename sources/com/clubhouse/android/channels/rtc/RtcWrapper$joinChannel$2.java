package com.clubhouse.android.channels.rtc;

import com.clubhouse.analytics.AmplitudeAnalytics;
import i0.e.b.z2.f.b;
import io.agora.rtc.Constants;
import io.agora.rtc.RtcEngine;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: RtcWrapper.kt */
public final class RtcWrapper$joinChannel$2 extends Lambda implements l<RtcEngine, i> {
    public final /* synthetic */ b c;
    public final /* synthetic */ RtcWrapper d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcWrapper$joinChannel$2(b bVar, RtcWrapper rtcWrapper) {
        super(1);
        this.c = bVar;
        this.d = rtcWrapper;
    }

    public Object invoke(Object obj) {
        RtcEngine rtcEngine = (RtcEngine) obj;
        m0.n.b.i.e(rtcEngine, "it");
        Boolean bool = this.c.f;
        Boolean bool2 = Boolean.TRUE;
        rtcEngine.setLogFilter(m0.n.b.i.a(bool, bool2) ? Constants.LOG_FILTER_DEBUG : 15);
        rtcEngine.setClientRole(this.c.d ? 1 : 2);
        RtcWrapper rtcWrapper = this.d;
        RtcWrapper rtcWrapper2 = RtcWrapper.a;
        rtcWrapper.m = RtcWrapper.c && m0.n.b.i.a(this.c.g, bool2);
        if (this.d.m) {
            RtcWrapper rtcWrapper3 = RtcWrapper.a;
            rtcEngine.setPlaybackAudioFrameParameters(48000, 2, 2, RtcWrapper.b * 2);
            this.d.initProcessing(rtcEngine.getNativeHandle());
            this.d.enableAudioSpatialization(true);
        }
        b bVar = this.c;
        if (rtcEngine.joinChannel(bVar.b, bVar.c, (String) null, bVar.a) < 0) {
            ((AmplitudeAnalytics) this.d.g).a("AgoraRTC-Join-Error");
        }
        RtcWrapper.a(this.d, rtcEngine, this.c.e);
        return i.a;
    }
}
