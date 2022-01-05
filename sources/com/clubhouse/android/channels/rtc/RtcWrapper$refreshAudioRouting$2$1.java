package com.clubhouse.android.channels.rtc;

import io.agora.rtc.RtcEngine;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: RtcWrapper.kt */
public final class RtcWrapper$refreshAudioRouting$2$1 extends Lambda implements l<RtcEngine, i> {
    public static final RtcWrapper$refreshAudioRouting$2$1 c = new RtcWrapper$refreshAudioRouting$2$1();

    public RtcWrapper$refreshAudioRouting$2$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        RtcEngine rtcEngine = (RtcEngine) obj;
        m0.n.b.i.e(rtcEngine, "it");
        rtcEngine.setEnableSpeakerphone(true);
        return i.a;
    }
}
