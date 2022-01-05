package com.clubhouse.android.channels.mvi;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.android.data.models.local.channel.ClipsPermission;
import com.clubhouse.android.data.models.local.channel.HandraisePermission;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.repos.ChannelRepo;
import h0.b0.v;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.b3.a.a.c.a;
import i0.e.b.z2.g.k;
import i0.j.f.p.h;
import java.util.List;
import java.util.Map;
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
public final class ChannelControlModel$joinChannel$1 extends Lambda implements l<k, i> {
    public final /* synthetic */ ChannelControlModel c;
    public final /* synthetic */ SourceLocation d;

    @m0.l.f.a.c(c = "com.clubhouse.android.channels.mvi.ChannelControlModel$joinChannel$1$1", f = "ChannelControlModel.kt", l = {277}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.channels.mvi.ChannelControlModel$joinChannel$1$1  reason: invalid class name */
    /* compiled from: ChannelControlModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super ChannelInRoomWithAccess>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(kVar, sourceLocation, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(kVar, sourceLocation, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                ChannelRepo channelRepo = ChannelControlModel.this.m;
                k kVar = kVar;
                String str = kVar.a;
                Channel channel = kVar.b;
                Map<String, Object> map = null;
                ChannelInFeed channelInFeed = channel instanceof ChannelInFeed ? (ChannelInFeed) channel : null;
                if (channelInFeed != null) {
                    map = channelInFeed.Y1;
                }
                Map<String, Object> t2 = v.t2(map, sourceLocation);
                this.c = 1;
                obj = channelRepo.s(str, t2, this);
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
    public ChannelControlModel$joinChannel$1(ChannelControlModel channelControlModel, SourceLocation sourceLocation) {
        super(1);
        this.c = channelControlModel;
        this.d = sourceLocation;
    }

    public Object invoke(Object obj) {
        final k kVar = (k) obj;
        m0.n.b.i.e(kVar, "state");
        ChannelRepo channelRepo = this.c.m;
        channelRepo.e.setValue(kVar.b);
        final ChannelControlModel channelControlModel = this.c;
        final SourceLocation sourceLocation = this.d;
        AnonymousClass1 r3 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        final ChannelControlModel channelControlModel2 = this.c;
        MavericksViewModel.f(channelControlModel, r3, (d0) null, (m) null, new p<k, b<? extends ChannelInRoomWithAccess>, k>() {
            public Object invoke(Object obj, Object obj2) {
                k kVar = (k) obj;
                b bVar = (b) obj2;
                m0.n.b.i.e(kVar, "$this$execute");
                m0.n.b.i.e(bVar, "it");
                if (bVar instanceof f0) {
                    return ChannelControlModel.r(ChannelControlModel.this, kVar, (ChannelInRoomWithAccess) ((f0) bVar).b);
                }
                if (!(bVar instanceof i0.b.b.c)) {
                    return kVar;
                }
                ChannelControlModel.this.o(new d(((i0.b.b.c) bVar).b.getMessage()));
                ChannelControlModel.this.m.e.setValue(null);
                return k.copy$default(kVar, (String) null, (Channel) null, (SourceLocation) null, (a) null, (i0.e.b.b3.a.a.c.d) null, false, true, false, false, (HandraisePermission) null, (ClipsPermission) null, (List) null, false, 0, false, false, false, 131007, (Object) null);
            }
        }, 3, (Object) null);
        return i.a;
    }
}
