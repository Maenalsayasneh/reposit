package com.clubhouse.android.channels.mvi;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.ChannelRepo;
import com.clubhouse.android.user.model.User;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.z2.g.t0;
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
public final class ChannelViewModel$blockFromChannel$1 extends Lambda implements l<i0.e.b.z2.g.l, i> {
    public final /* synthetic */ ChannelViewModel c;
    public final /* synthetic */ User d;
    public final /* synthetic */ boolean q;

    @m0.l.f.a.c(c = "com.clubhouse.android.channels.mvi.ChannelViewModel$blockFromChannel$1$1", f = "ChannelViewModel.kt", l = {335}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.channels.mvi.ChannelViewModel$blockFromChannel$1$1  reason: invalid class name */
    /* compiled from: ChannelViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super EmptySuccessResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(lVar, user, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(lVar, user, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                ChannelRepo channelRepo = ChannelViewModel.this.s;
                String str = lVar.t;
                int intValue = user.getId().intValue();
                this.c = 1;
                obj = channelRepo.c(str, intValue, this);
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
    public ChannelViewModel$blockFromChannel$1(ChannelViewModel channelViewModel, User user, boolean z) {
        super(1);
        this.c = channelViewModel;
        this.d = user;
        this.q = z;
    }

    public Object invoke(Object obj) {
        final i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        m0.n.b.i.e(lVar, "it");
        final ChannelViewModel channelViewModel = this.c;
        final User user = this.d;
        AnonymousClass1 r2 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        final ChannelViewModel channelViewModel2 = this.c;
        final User user2 = this.d;
        final boolean z = this.q;
        MavericksViewModel.f(channelViewModel, r2, (d0) null, (m) null, new p<i0.e.b.z2.g.l, b<? extends EmptySuccessResponse>, i0.e.b.z2.g.l>() {
            public Object invoke(Object obj, Object obj2) {
                i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
                b bVar = (b) obj2;
                m0.n.b.i.e(lVar, "$this$execute");
                m0.n.b.i.e(bVar, "it");
                if (bVar instanceof f0) {
                    ChannelViewModel channelViewModel = ChannelViewModel.this;
                    t0 t0Var = new t0(user2, z);
                    int i = ChannelViewModel.m;
                    channelViewModel.o(t0Var);
                } else if (bVar instanceof i0.b.b.c) {
                    ChannelViewModel channelViewModel2 = ChannelViewModel.this;
                    d dVar = new d((String) null, 1);
                    int i2 = ChannelViewModel.m;
                    channelViewModel2.o(dVar);
                }
                return lVar;
            }
        }, 3, (Object) null);
        return i.a;
    }
}
