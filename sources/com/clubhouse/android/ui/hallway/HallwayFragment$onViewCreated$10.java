package com.clubhouse.android.ui.hallway;

import com.clubhouse.android.shared.update.UpdatesCoordinator;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.ui.hallway.HallwayFragment$onViewCreated$10", f = "HallwayFragment.kt", l = {134}, m = "invokeSuspend")
/* compiled from: HallwayFragment.kt */
public final class HallwayFragment$onViewCreated$10 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ HallwayFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HallwayFragment$onViewCreated$10(HallwayFragment hallwayFragment, m0.l.c<? super HallwayFragment$onViewCreated$10> cVar) {
        super(2, cVar);
        this.d = hallwayFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new HallwayFragment$onViewCreated$10(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new HallwayFragment$onViewCreated$10(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            UpdatesCoordinator updatesCoordinator = this.d.a2;
            if (updatesCoordinator != null) {
                this.c = 1;
                if (updatesCoordinator.d(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                m0.n.b.i.m("updatescoordinator");
                throw null;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
