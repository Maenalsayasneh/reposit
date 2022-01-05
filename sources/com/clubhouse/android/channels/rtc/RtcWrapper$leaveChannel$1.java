package com.clubhouse.android.channels.rtc;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.channels.rtc.RtcWrapper", f = "RtcWrapper.kt", l = {143}, m = "leaveChannel")
/* compiled from: RtcWrapper.kt */
public final class RtcWrapper$leaveChannel$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ RtcWrapper q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcWrapper$leaveChannel$1(RtcWrapper rtcWrapper, m0.l.c<? super RtcWrapper$leaveChannel$1> cVar) {
        super(cVar);
        this.q = rtcWrapper;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.c(this);
    }
}
