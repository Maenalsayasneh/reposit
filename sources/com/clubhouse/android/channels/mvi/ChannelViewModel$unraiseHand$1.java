package com.clubhouse.android.channels.mvi;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.remote.response.AudienceReplyResponse;
import com.clubhouse.android.data.repos.ChannelRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.r.m;
import n0.a.d0;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$unraiseHand$1 extends Lambda implements l<i0.e.b.z2.g.l, i> {
    public final /* synthetic */ ChannelViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.channels.mvi.ChannelViewModel$unraiseHand$1$1", f = "ChannelViewModel.kt", l = {387}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.channels.mvi.ChannelViewModel$unraiseHand$1$1  reason: invalid class name */
    /* compiled from: ChannelViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super AudienceReplyResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(lVar, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(lVar, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                ChannelRepo channelRepo = ChannelViewModel.this.s;
                String str = lVar.t;
                this.c = 1;
                obj = channelRepo.C(str, this);
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
    public ChannelViewModel$unraiseHand$1(ChannelViewModel channelViewModel) {
        super(1);
        this.c = channelViewModel;
    }

    public Object invoke(Object obj) {
        final i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        m0.n.b.i.e(lVar, "it");
        final ChannelViewModel channelViewModel = this.c;
        MavericksViewModel.f(channelViewModel, new AnonymousClass1((c<? super AnonymousClass1>) null), (d0) null, (m) null, AnonymousClass2.c, 3, (Object) null);
        return i.a;
    }
}
