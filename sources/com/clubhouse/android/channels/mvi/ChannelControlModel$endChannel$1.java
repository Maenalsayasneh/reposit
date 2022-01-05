package com.clubhouse.android.channels.mvi;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.channels.analytics.LeaveReason;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.ChannelRepo;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.z2.g.c0;
import i0.e.b.z2.g.k;
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

/* compiled from: ChannelControlModel.kt */
public final class ChannelControlModel$endChannel$1 extends Lambda implements l<k, i> {
    public final /* synthetic */ ChannelControlModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.channels.mvi.ChannelControlModel$endChannel$1$1", f = "ChannelControlModel.kt", l = {418}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.channels.mvi.ChannelControlModel$endChannel$1$1  reason: invalid class name */
    /* compiled from: ChannelControlModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super EmptySuccessResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(kVar, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(kVar, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                ChannelRepo channelRepo = ChannelControlModel.this.m;
                String str = kVar.a;
                this.c = 1;
                obj = channelRepo.i(str, this);
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
    public ChannelControlModel$endChannel$1(ChannelControlModel channelControlModel) {
        super(1);
        this.c = channelControlModel;
    }

    public Object invoke(Object obj) {
        final k kVar = (k) obj;
        m0.n.b.i.e(kVar, "it");
        final ChannelControlModel channelControlModel = this.c;
        AnonymousClass1 r2 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        final ChannelControlModel channelControlModel2 = this.c;
        MavericksViewModel.f(channelControlModel, r2, (d0) null, (m) null, new p<k, b<? extends EmptySuccessResponse>, k>() {
            public Object invoke(Object obj, Object obj2) {
                k kVar = (k) obj;
                b bVar = (b) obj2;
                m0.n.b.i.e(kVar, "$this$execute");
                m0.n.b.i.e(bVar, "it");
                if (bVar instanceof f0) {
                    ChannelControlModel.this.p(new c0(LeaveReason.ENDED));
                }
                if (bVar instanceof i0.b.b.c) {
                    ChannelControlModel.this.o(new d((String) null, 1));
                }
                return kVar;
            }
        }, 3, (Object) null);
        return i.a;
    }
}
