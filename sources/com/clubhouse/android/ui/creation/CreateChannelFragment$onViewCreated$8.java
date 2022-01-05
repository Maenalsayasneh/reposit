package com.clubhouse.android.ui.creation;

import h0.b0.g;
import h0.b0.n;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.creation.CreateChannelFragment$onViewCreated$8", f = "CreateChannelFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: CreateChannelFragment.kt */
public final class CreateChannelFragment$onViewCreated$8 extends SuspendLambda implements p<Throwable, m0.l.c<? super i>, Object> {
    public final /* synthetic */ CreateChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateChannelFragment$onViewCreated$8(CreateChannelFragment createChannelFragment, m0.l.c<? super CreateChannelFragment$onViewCreated$8> cVar) {
        super(2, cVar);
        this.c = createChannelFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new CreateChannelFragment$onViewCreated$8(this.c, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        Throwable th = (Throwable) obj;
        CreateChannelFragment$onViewCreated$8 createChannelFragment$onViewCreated$8 = new CreateChannelFragment$onViewCreated$8(this.c, (m0.l.c) obj2);
        i iVar = i.a;
        createChannelFragment$onViewCreated$8.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        n.c((g) this.c.v2.getValue(), new h0.b0.c());
        return i.a;
    }
}
