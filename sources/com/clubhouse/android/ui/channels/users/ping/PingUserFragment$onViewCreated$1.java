package com.clubhouse.android.ui.channels.users.ping;

import i0.e.b.a3.d.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.channels.users.ping.PingUserFragment$onViewCreated$1", f = "PingUserFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: PingUserFragment.kt */
public final class PingUserFragment$onViewCreated$1 extends SuspendLambda implements p<String, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ PingUserFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PingUserFragment$onViewCreated$1(PingUserFragment pingUserFragment, m0.l.c<? super PingUserFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = pingUserFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        PingUserFragment$onViewCreated$1 pingUserFragment$onViewCreated$1 = new PingUserFragment$onViewCreated$1(this.d, cVar);
        pingUserFragment$onViewCreated$1.c = obj;
        return pingUserFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        PingUserFragment$onViewCreated$1 pingUserFragment$onViewCreated$1 = new PingUserFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        pingUserFragment$onViewCreated$1.c = (String) obj;
        i iVar = i.a;
        pingUserFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        PingUserFragment pingUserFragment = this.d;
        k<Object>[] kVarArr = PingUserFragment.r2;
        pingUserFragment.Y0().p(new b((String) this.c));
        return i.a;
    }
}
