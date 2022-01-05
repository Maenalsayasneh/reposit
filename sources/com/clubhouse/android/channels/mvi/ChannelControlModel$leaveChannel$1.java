package com.clubhouse.android.channels.mvi;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.channels.analytics.LeaveReason;
import com.clubhouse.android.channels.pubsub.PubNubClient;
import i0.e.b.z2.g.k;
import i0.j.f.p.h;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.r.m;
import m0.r.t.a.r.m.a1.a;
import n0.a.d0;
import n0.a.f1;

/* compiled from: ChannelControlModel.kt */
public final class ChannelControlModel$leaveChannel$1 extends Lambda implements l<k, i> {
    public final /* synthetic */ ChannelControlModel c;
    public final /* synthetic */ LeaveReason d;

    @m0.l.f.a.c(c = "com.clubhouse.android.channels.mvi.ChannelControlModel$leaveChannel$1$2", f = "ChannelControlModel.kt", l = {404, 405, 407}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.channels.mvi.ChannelControlModel$leaveChannel$1$2  reason: invalid class name */
    /* compiled from: ChannelControlModel.kt */
    public final class AnonymousClass2 extends SuspendLambda implements l<c<? super i>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass2(kVar, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass2(kVar, (c) obj).invokeSuspend(i.a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r5.c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0023
                if (r1 == r4) goto L_0x001f
                if (r1 == r3) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                i0.j.f.p.h.d4(r6)
                goto L_0x0057
            L_0x0013:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001b:
                i0.j.f.p.h.d4(r6)
                goto L_0x0044
            L_0x001f:
                i0.j.f.p.h.d4(r6)
                goto L_0x0033
            L_0x0023:
                i0.j.f.p.h.d4(r6)
                com.clubhouse.android.channels.mvi.ChannelControlModel r6 = com.clubhouse.android.channels.mvi.ChannelControlModel.this
                com.clubhouse.android.channels.rtc.RtcWrapper r6 = r6.p
                r5.c = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L_0x0033
                return r0
            L_0x0033:
                com.clubhouse.android.channels.mvi.ChannelControlModel r6 = com.clubhouse.android.channels.mvi.ChannelControlModel.this
                com.clubhouse.android.data.repos.ChannelRepo r6 = r6.m
                i0.e.b.z2.g.k r1 = r11
                java.lang.String r1 = r1.a
                r5.c = r3
                java.lang.Object r6 = r6.t(r1, r5)
                if (r6 != r0) goto L_0x0044
                return r0
            L_0x0044:
                i0.e.b.z2.g.k r6 = r11
                boolean r6 = r6.t
                if (r6 == 0) goto L_0x0057
                com.clubhouse.android.channels.mvi.ChannelControlModel r6 = com.clubhouse.android.channels.mvi.ChannelControlModel.this
                i0.e.e.k.b.a r6 = r6.o
                r5.c = r2
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L_0x0057
                return r0
            L_0x0057:
                m0.i r6 = m0.i.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.channels.mvi.ChannelControlModel$leaveChannel$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelControlModel$leaveChannel$1(ChannelControlModel channelControlModel, LeaveReason leaveReason) {
        super(1);
        this.c = channelControlModel;
        this.d = leaveReason;
    }

    public Object invoke(Object obj) {
        final k kVar = (k) obj;
        m0.n.b.i.e(kVar, "it");
        if (!kVar.g) {
            this.c.m(AnonymousClass1.c);
            PubNubClient pubNubClient = (PubNubClient) this.c.r;
            pubNubClient.a.presence().channels((List<String>) h.L2(pubNubClient.j)).connected(false).execute();
            pubNubClient.a.unsubscribeAll();
            if (this.d != LeaveReason.SCOPE_RELEASE) {
                this.c.m.e.setValue(null);
            }
            f1 f1Var = this.c.s.g;
            if (f1Var != null) {
                a.o0(f1Var, (CancellationException) null, 1, (Object) null);
            }
            final ChannelControlModel channelControlModel = this.c;
            MavericksViewModel.f(channelControlModel, new AnonymousClass2((c<? super AnonymousClass2>) null), (d0) null, (m) null, AnonymousClass3.c, 3, (Object) null);
        }
        return i.a;
    }
}
