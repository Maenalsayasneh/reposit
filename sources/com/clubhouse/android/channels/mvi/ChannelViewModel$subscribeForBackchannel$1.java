package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.e.b.z2.g.k;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.channels.mvi.ChannelViewModel$subscribeForBackchannel$1", f = "ChannelViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$subscribeForBackchannel$1 extends SuspendLambda implements p<Integer, m0.l.c<? super i>, Object> {
    public /* synthetic */ int c;
    public final /* synthetic */ ChannelViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$subscribeForBackchannel$1(ChannelViewModel channelViewModel, m0.l.c<? super ChannelViewModel$subscribeForBackchannel$1> cVar) {
        super(2, cVar);
        this.d = channelViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ChannelViewModel$subscribeForBackchannel$1 channelViewModel$subscribeForBackchannel$1 = new ChannelViewModel$subscribeForBackchannel$1(this.d, cVar);
        channelViewModel$subscribeForBackchannel$1.c = ((Number) obj).intValue();
        return channelViewModel$subscribeForBackchannel$1;
    }

    public Object invoke(Object obj, Object obj2) {
        Integer valueOf = Integer.valueOf(((Number) obj).intValue());
        ChannelViewModel channelViewModel = this.d;
        ChannelViewModel$subscribeForBackchannel$1 channelViewModel$subscribeForBackchannel$1 = new ChannelViewModel$subscribeForBackchannel$1(channelViewModel, (m0.l.c) obj2);
        channelViewModel$subscribeForBackchannel$1.c = valueOf.intValue();
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        final int i = channelViewModel$subscribeForBackchannel$1.c;
        AnonymousClass1 r02 = new l<i0.e.b.z2.g.l, i0.e.b.z2.g.l>() {
            public Object invoke(Object obj) {
                i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
                m0.n.b.i.e(lVar, "$this$setState");
                return i0.e.b.z2.g.l.copy$default(lVar, (k) null, (SourceLocation) null, false, false, false, (List) null, false, 0, r3, false, false, 0, (List) null, false, false, 32511, (Object) null);
            }
        };
        int i2 = ChannelViewModel.m;
        channelViewModel.m(r02);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final int i = this.c;
        ChannelViewModel channelViewModel = this.d;
        AnonymousClass1 r1 = new l<i0.e.b.z2.g.l, i0.e.b.z2.g.l>() {
            public Object invoke(Object obj) {
                i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
                m0.n.b.i.e(lVar, "$this$setState");
                return i0.e.b.z2.g.l.copy$default(lVar, (k) null, (SourceLocation) null, false, false, false, (List) null, false, 0, i, false, false, 0, (List) null, false, false, 32511, (Object) null);
            }
        };
        int i2 = ChannelViewModel.m;
        channelViewModel.m(r1);
        return i.a;
    }
}
