package com.clubhouse.android.notifications;

import com.clubhouse.android.data.repos.NotificationRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.notifications.PushListenerService$onNewToken$1$1", f = "PushListenerService.kt", l = {113}, m = "invokeSuspend")
/* compiled from: PushListenerService.kt */
public final class PushListenerService$onNewToken$1$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ NotificationRepo d;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ String x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushListenerService$onNewToken$1$1(NotificationRepo notificationRepo, boolean z, String str, m0.l.c<? super PushListenerService$onNewToken$1$1> cVar) {
        super(2, cVar);
        this.d = notificationRepo;
        this.q = z;
        this.x = str;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new PushListenerService$onNewToken$1$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new PushListenerService$onNewToken$1$1(this.d, this.q, this.x, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            NotificationRepo notificationRepo = this.d;
            boolean z = this.q;
            String str = this.x;
            this.c = 1;
            if (notificationRepo.h(z, str, this) == coroutineSingletons) {
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
