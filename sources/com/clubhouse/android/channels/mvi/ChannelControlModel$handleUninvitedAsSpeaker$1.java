package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.channels.pubsub.PubNubClient;
import com.clubhouse.android.channels.rtc.RtcWrapper;
import i0.e.b.z2.f.b;
import i0.e.b.z2.g.k;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

/* compiled from: ChannelControlModel.kt */
public final class ChannelControlModel$handleUninvitedAsSpeaker$1 extends Lambda implements l<k, i> {
    public final /* synthetic */ ChannelControlModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.channels.mvi.ChannelControlModel$handleUninvitedAsSpeaker$1$1", f = "ChannelControlModel.kt", l = {474}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.channels.mvi.ChannelControlModel$handleUninvitedAsSpeaker$1$1  reason: invalid class name */
    /* compiled from: ChannelControlModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements p<f0, c<? super i>, Object> {
        public int c;

        public final c<i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(kVar, cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            f0 f0Var = (f0) obj;
            return new AnonymousClass1(kVar, (c) obj2).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                ChannelControlModel channelControlModel = ChannelControlModel.this;
                RtcWrapper rtcWrapper = channelControlModel.p;
                b bVar = new b(channelControlModel.q.a, (String) null, kVar.a, false, false, (Boolean) null, (Boolean) null, 98);
                this.c = 1;
                if (rtcWrapper.b(bVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PubNubClient pubNubClient = (PubNubClient) ChannelControlModel.this.r;
            pubNubClient.a.unsubscribe().channels(h.L2(pubNubClient.i)).execute();
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelControlModel$handleUninvitedAsSpeaker$1(ChannelControlModel channelControlModel) {
        super(1);
        this.c = channelControlModel;
    }

    public Object invoke(Object obj) {
        final k kVar = (k) obj;
        m0.n.b.i.e(kVar, "state");
        final ChannelControlModel channelControlModel = this.c;
        a.E2(channelControlModel.c, (e) null, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 3, (Object) null);
        return i.a;
    }
}
