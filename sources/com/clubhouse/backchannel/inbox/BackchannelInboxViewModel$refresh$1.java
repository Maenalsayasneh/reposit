package com.clubhouse.backchannel.inbox;

import i0.e.c.f.d.a;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.backchannel.inbox.BackchannelInboxViewModel$refresh$1", f = "BackchannelInboxViewModel.kt", l = {98}, m = "invokeSuspend")
/* compiled from: BackchannelInboxViewModel.kt */
public final class BackchannelInboxViewModel$refresh$1 extends SuspendLambda implements l<m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ BackchannelInboxViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelInboxViewModel$refresh$1(BackchannelInboxViewModel backchannelInboxViewModel, m0.l.c<? super BackchannelInboxViewModel$refresh$1> cVar) {
        super(1, cVar);
        this.d = backchannelInboxViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new BackchannelInboxViewModel$refresh$1(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new BackchannelInboxViewModel$refresh$1(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            a aVar = this.d.n;
            this.c = 1;
            if (aVar.u(this) == coroutineSingletons) {
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
