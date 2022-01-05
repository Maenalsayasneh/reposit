package com.clubhouse.android.notifications;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.notifications.PushListenerService$onCreate$1$1", f = "PushListenerService.kt", l = {}, m = "invokeSuspend")
/* compiled from: PushListenerService.kt */
public final class PushListenerService$onCreate$1$1 extends SuspendLambda implements p<String, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ PushListenerService d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushListenerService$onCreate$1$1(PushListenerService pushListenerService, m0.l.c<? super PushListenerService$onCreate$1$1> cVar) {
        super(2, cVar);
        this.d = pushListenerService;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        PushListenerService$onCreate$1$1 pushListenerService$onCreate$1$1 = new PushListenerService$onCreate$1$1(this.d, cVar);
        pushListenerService$onCreate$1$1.c = obj;
        return pushListenerService$onCreate$1$1;
    }

    public Object invoke(Object obj, Object obj2) {
        PushListenerService pushListenerService = this.d;
        PushListenerService$onCreate$1$1 pushListenerService$onCreate$1$1 = new PushListenerService$onCreate$1$1(pushListenerService, (m0.l.c) obj2);
        pushListenerService$onCreate$1$1.c = (String) obj;
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        pushListenerService.h2.setValue((String) pushListenerService$onCreate$1$1.c);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        this.d.h2.setValue((String) this.c);
        return i.a;
    }
}
