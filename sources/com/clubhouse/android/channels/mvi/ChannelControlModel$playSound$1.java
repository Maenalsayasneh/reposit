package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.channels.rtc.RtcWrapper;
import com.clubhouse.android.channels.rtc.RtcWrapper$playSound$2;
import com.clubhouse.android.channels.rtc.Sound;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.channels.mvi.ChannelControlModel$playSound$1", f = "ChannelControlModel.kt", l = {636}, m = "invokeSuspend")
/* compiled from: ChannelControlModel.kt */
public final class ChannelControlModel$playSound$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ ChannelControlModel d;
    public final /* synthetic */ Sound q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelControlModel$playSound$1(ChannelControlModel channelControlModel, Sound sound, m0.l.c<? super ChannelControlModel$playSound$1> cVar) {
        super(2, cVar);
        this.d = channelControlModel;
        this.q = sound;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ChannelControlModel$playSound$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ChannelControlModel$playSound$1(this.d, this.q, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            RtcWrapper rtcWrapper = this.d.p;
            Sound sound = this.q;
            this.c = 1;
            Objects.requireNonNull(rtcWrapper);
            Object e = rtcWrapper.e(new RtcWrapper$playSound$2(rtcWrapper, sound), this);
            if (e != coroutineSingletons) {
                e = i.a;
            }
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
