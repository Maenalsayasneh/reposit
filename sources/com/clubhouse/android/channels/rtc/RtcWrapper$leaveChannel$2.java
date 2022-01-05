package com.clubhouse.android.channels.rtc;

import io.agora.rtc.RtcEngine;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: RtcWrapper.kt */
public final class RtcWrapper$leaveChannel$2 extends Lambda implements l<RtcEngine, i> {
    public static final RtcWrapper$leaveChannel$2 c = new RtcWrapper$leaveChannel$2();

    public RtcWrapper$leaveChannel$2() {
        super(1);
    }

    public Object invoke(Object obj) {
        RtcEngine rtcEngine = (RtcEngine) obj;
        m0.n.b.i.e(rtcEngine, "it");
        rtcEngine.leaveChannel();
        return i.a;
    }
}
