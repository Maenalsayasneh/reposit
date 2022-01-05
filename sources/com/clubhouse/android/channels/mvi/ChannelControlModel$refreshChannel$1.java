package com.clubhouse.android.channels.mvi;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.channels.analytics.LeaveReason;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ChannelInRoom;
import com.clubhouse.android.data.models.local.channel.ClipsPermission;
import com.clubhouse.android.data.models.local.channel.HandraisePermission;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.repos.ChannelRepo;
import h0.b0.v;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.b3.a.a.c.a;
import i0.e.b.b3.a.a.c.d;
import i0.e.b.z2.g.c0;
import i0.e.b.z2.g.k;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.d0;

/* compiled from: ChannelControlModel.kt */
public final class ChannelControlModel$refreshChannel$1 extends Lambda implements l<k, i> {
    public final /* synthetic */ ChannelControlModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.channels.mvi.ChannelControlModel$refreshChannel$1$2", f = "ChannelControlModel.kt", l = {346}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.channels.mvi.ChannelControlModel$refreshChannel$1$2  reason: invalid class name */
    /* compiled from: ChannelControlModel.kt */
    public final class AnonymousClass2 extends SuspendLambda implements l<c<? super ChannelInRoom>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass2(kVar, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass2(kVar, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                ChannelRepo channelRepo = ChannelControlModel.this.m;
                String str = kVar.a;
                this.c = 1;
                obj = channelRepo.j(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelControlModel$refreshChannel$1(ChannelControlModel channelControlModel) {
        super(1);
        this.c = channelControlModel;
    }

    public Object invoke(Object obj) {
        final k kVar = (k) obj;
        m0.n.b.i.e(kVar, "it");
        this.c.m(AnonymousClass1.c);
        final ChannelControlModel channelControlModel = this.c;
        AnonymousClass2 r3 = new AnonymousClass2((c<? super AnonymousClass2>) null);
        final ChannelControlModel channelControlModel2 = this.c;
        MavericksViewModel.f(channelControlModel, r3, (d0) null, (m) null, new p<k, b<? extends ChannelInRoom>, k>() {
            public Object invoke(Object obj, Object obj2) {
                k kVar = (k) obj;
                b bVar = (b) obj2;
                m0.n.b.i.e(kVar, "$this$execute");
                m0.n.b.i.e(bVar, "it");
                if (!(bVar instanceof f0)) {
                    return k.copy$default(kVar, (String) null, (Channel) null, (SourceLocation) null, (a) null, (d) null, false, false, false, false, (HandraisePermission) null, (ClipsPermission) null, (List) null, false, 0, false, false, false, 130943, (Object) null);
                }
                ChannelInRoom channelInRoom = (ChannelInRoom) ((f0) bVar).b;
                ChannelControlModel.this.m.e.setValue(channelInRoom);
                if (channelInRoom.E()) {
                    ChannelControlModel.this.p(new c0(LeaveReason.CHANNEL_REFRESH));
                }
                return k.copy$default(kVar, (String) null, channelInRoom, (SourceLocation) null, v.s1(channelInRoom, ChannelControlModel.this.q.a), (d) null, false, false, false, channelInRoom.z(), channelInRoom.w(), channelInRoom.v0(), (List) null, false, 0, false, false, false, 129141, (Object) null);
            }
        }, 3, (Object) null);
        return i.a;
    }
}
