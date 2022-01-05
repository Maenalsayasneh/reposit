package com.clubhouse.android.channels.rtc;

import i0.e.b.z2.f.b;
import io.agora.rtc.RtcEngine;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: RtcWrapper.kt */
public final class RtcWrapper$changeRole$2 extends Lambda implements l<RtcEngine, i> {
    public final /* synthetic */ b c;
    public final /* synthetic */ RtcWrapper d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcWrapper$changeRole$2(b bVar, RtcWrapper rtcWrapper) {
        super(1);
        this.c = bVar;
        this.d = rtcWrapper;
    }

    public Object invoke(Object obj) {
        RtcEngine rtcEngine = (RtcEngine) obj;
        m0.n.b.i.e(rtcEngine, "it");
        String str = this.c.b;
        if (str != null) {
            rtcEngine.renewToken(str);
        }
        rtcEngine.setClientRole(this.c.d ? 1 : 2);
        RtcWrapper.a(this.d, rtcEngine, this.c.e);
        return i.a;
    }
}
