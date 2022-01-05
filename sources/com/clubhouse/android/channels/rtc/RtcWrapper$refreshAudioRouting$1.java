package com.clubhouse.android.channels.rtc;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.channels.rtc.RtcWrapper", f = "RtcWrapper.kt", l = {187}, m = "refreshAudioRouting")
/* compiled from: RtcWrapper.kt */
public final class RtcWrapper$refreshAudioRouting$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public final /* synthetic */ RtcWrapper d;
    public int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcWrapper$refreshAudioRouting$1(RtcWrapper rtcWrapper, m0.l.c<? super RtcWrapper$refreshAudioRouting$1> cVar) {
        super(cVar);
        this.d = rtcWrapper;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.q |= Integer.MIN_VALUE;
        return this.d.d(this);
    }
}
