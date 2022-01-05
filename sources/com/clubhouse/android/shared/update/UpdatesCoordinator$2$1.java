package com.clubhouse.android.shared.update;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;
import v0.a.a;

@c(c = "com.clubhouse.android.shared.update.UpdatesCoordinator$2$1", f = "UpdatesCoordinator.kt", l = {70}, m = "invokeSuspend")
/* compiled from: UpdatesCoordinator.kt */
public final class UpdatesCoordinator$2$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ UpdatesCoordinator d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesCoordinator$2$1(UpdatesCoordinator updatesCoordinator, m0.l.c<? super UpdatesCoordinator$2$1> cVar) {
        super(2, cVar);
        this.d = updatesCoordinator;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new UpdatesCoordinator$2$1(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new UpdatesCoordinator$2$1(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            UpdatesCoordinator updatesCoordinator = this.d;
            this.c = 1;
            if (UpdatesCoordinator.a(updatesCoordinator, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                h.d4(obj);
            } catch (Exception e) {
                a.d.w(e, "Error resuming updates", new Object[0]);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
