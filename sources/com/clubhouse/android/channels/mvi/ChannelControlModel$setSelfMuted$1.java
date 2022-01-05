package com.clubhouse.android.channels.mvi;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.channels.rtc.RtcWrapper;
import i0.e.b.z2.f.b;
import i0.e.b.z2.g.k;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.r.m;
import n0.a.d0;

/* compiled from: ChannelControlModel.kt */
public final class ChannelControlModel$setSelfMuted$1 extends Lambda implements l<k, i> {
    public final /* synthetic */ ChannelControlModel c;
    public final /* synthetic */ boolean d;

    @m0.l.f.a.c(c = "com.clubhouse.android.channels.mvi.ChannelControlModel$setSelfMuted$1$1", f = "ChannelControlModel.kt", l = {622}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.channels.mvi.ChannelControlModel$setSelfMuted$1$1  reason: invalid class name */
    /* compiled from: ChannelControlModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super i>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(kVar, z, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(kVar, z, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                ChannelControlModel channelControlModel = ChannelControlModel.this;
                RtcWrapper rtcWrapper = channelControlModel.p;
                int i2 = channelControlModel.q.a;
                k kVar = kVar;
                b bVar = new b(i2, (String) null, kVar.a, ChannelControlModel.q(channelControlModel, kVar.d), z, (Boolean) null, (Boolean) null, 98);
                this.c = 1;
                if (rtcWrapper.b(bVar, this) == coroutineSingletons) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelControlModel$setSelfMuted$1(ChannelControlModel channelControlModel, boolean z) {
        super(1);
        this.c = channelControlModel;
        this.d = z;
    }

    public Object invoke(Object obj) {
        final k kVar = (k) obj;
        m0.n.b.i.e(kVar, "state");
        final ChannelControlModel channelControlModel = this.c;
        final boolean z = this.d;
        MavericksViewModel.f(channelControlModel, new AnonymousClass1((c<? super AnonymousClass1>) null), (d0) null, (m) null, AnonymousClass2.c, 3, (Object) null);
        return i.a;
    }
}
