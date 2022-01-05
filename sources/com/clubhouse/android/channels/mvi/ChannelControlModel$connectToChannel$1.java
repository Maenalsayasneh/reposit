package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.channels.pubsub.PubNubClient;
import com.clubhouse.android.channels.rtc.RtcWrapper;
import com.clubhouse.android.channels.rtc.RtcWrapper$joinChannel$2;
import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.android.shared.preferences.Key;
import i0.e.b.b3.a.a.c.a;
import i0.e.b.f3.k.b;
import i0.e.b.z2.f.f;
import i0.e.b.z2.g.k;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.channels.mvi.ChannelControlModel$connectToChannel$1", f = "ChannelControlModel.kt", l = {300}, m = "invokeSuspend")
/* compiled from: ChannelControlModel.kt */
public final class ChannelControlModel$connectToChannel$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ ChannelControlModel d;
    public final /* synthetic */ ChannelInRoomWithAccess q;
    public final /* synthetic */ a x;
    public final /* synthetic */ k y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelControlModel$connectToChannel$1(ChannelControlModel channelControlModel, ChannelInRoomWithAccess channelInRoomWithAccess, a aVar, k kVar, m0.l.c<? super ChannelControlModel$connectToChannel$1> cVar) {
        super(2, cVar);
        this.d = channelControlModel;
        this.q = channelInRoomWithAccess;
        this.x = aVar;
        this.y = kVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ChannelControlModel$connectToChannel$1(this.d, this.q, this.x, this.y, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ChannelControlModel$connectToChannel$1(this.d, this.q, this.x, this.y, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ChannelControlModel channelControlModel = this.d;
            RtcWrapper rtcWrapper = channelControlModel.p;
            int i2 = channelControlModel.q.a;
            ChannelInRoomWithAccess channelInRoomWithAccess = this.q;
            String str = channelInRoomWithAccess.r2;
            String str2 = channelInRoomWithAccess.d2;
            boolean q2 = ChannelControlModel.q(channelControlModel, this.x);
            boolean z = false;
            boolean z2 = !ChannelControlModel.q(this.d, this.x) || this.x.k.size() > 2;
            Boolean valueOf = Boolean.valueOf(this.y.o);
            if (this.y.p) {
                b bVar = this.d.v;
                Objects.requireNonNull(bVar);
                if (bVar.a(Key.SPATIAL_AUDIO, true)) {
                    z = true;
                }
            }
            i0.e.b.z2.f.b bVar2 = new i0.e.b.z2.f.b(i2, str, str2, q2, z2, valueOf, Boolean.valueOf(z));
            this.c = 1;
            Objects.requireNonNull(rtcWrapper);
            Object e = rtcWrapper.e(new RtcWrapper$joinChannel$2(bVar2, rtcWrapper), this);
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
        ChannelControlModel channelControlModel2 = this.d;
        i0.e.b.z2.h.a aVar = channelControlModel2.r;
        ChannelInRoomWithAccess channelInRoomWithAccess2 = this.q;
        ((PubNubClient) aVar).b(new f(channelInRoomWithAccess2.d2, channelInRoomWithAccess2.t2, channelInRoomWithAccess2.s2, channelInRoomWithAccess2.v2, channelInRoomWithAccess2.u2, channelInRoomWithAccess2.w2, this.x.i(channelControlModel2.q.a)));
        return i.a;
    }
}
