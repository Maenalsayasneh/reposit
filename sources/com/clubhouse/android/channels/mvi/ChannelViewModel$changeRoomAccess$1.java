package com.clubhouse.android.channels.mvi;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.channels.model.AudienceType;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.repos.ChannelRepo;
import h0.b0.v;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.z2.g.i0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.d0;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$changeRoomAccess$1 extends Lambda implements l<i0.e.b.z2.g.l, i> {
    public final /* synthetic */ AudienceType c;
    public final /* synthetic */ ChannelViewModel d;

    @m0.l.f.a.c(c = "com.clubhouse.android.channels.mvi.ChannelViewModel$changeRoomAccess$1$1", f = "ChannelViewModel.kt", l = {285, 288}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.channels.mvi.ChannelViewModel$changeRoomAccess$1$1  reason: invalid class name */
    /* compiled from: ChannelViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super i>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(channelViewModel, lVar, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(channelViewModel, lVar, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                if (AudienceType.this == AudienceType.Open) {
                    ChannelRepo channelRepo = channelViewModel.s;
                    String str = lVar.t;
                    this.c = 1;
                    if (channelRepo.u(str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (i == 1) {
                h.d4(obj);
            } else if (i == 2) {
                h.d4(obj);
                return i.a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (AudienceType.this == AudienceType.Social) {
                ChannelRepo channelRepo2 = channelViewModel.s;
                String str2 = lVar.t;
                this.c = 2;
                if (channelRepo2.v(str2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$changeRoomAccess$1(AudienceType audienceType, ChannelViewModel channelViewModel) {
        super(1);
        this.c = audienceType;
        this.d = channelViewModel;
    }

    public Object invoke(Object obj) {
        AudienceType audienceType;
        final i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        m0.n.b.i.e(lVar, "state");
        Channel channel = lVar.u;
        if (channel == null) {
            audienceType = null;
        } else {
            audienceType = v.o(channel);
        }
        final AudienceType audienceType2 = this.c;
        if (audienceType != audienceType2) {
            final ChannelViewModel channelViewModel = this.d;
            AnonymousClass1 r4 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            final ChannelViewModel channelViewModel2 = this.d;
            MavericksViewModel.f(channelViewModel, r4, (d0) null, (m) null, new p<i0.e.b.z2.g.l, b<? extends i>, i0.e.b.z2.g.l>() {
                public Object invoke(Object obj, Object obj2) {
                    i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
                    b bVar = (b) obj2;
                    m0.n.b.i.e(lVar, "$this$execute");
                    m0.n.b.i.e(bVar, "it");
                    if (bVar instanceof f0) {
                        ChannelViewModel.this.r.p(i0.a);
                    }
                    if (bVar instanceof i0.b.b.c) {
                        ChannelViewModel channelViewModel = ChannelViewModel.this;
                        d dVar = new d((String) null, 1);
                        int i = ChannelViewModel.m;
                        channelViewModel.o(dVar);
                    }
                    return lVar;
                }
            }, 3, (Object) null);
        }
        return i.a;
    }
}
