package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import h0.q.b0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.e;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.f1;

@c(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {162}, m = "invokeSuspend")
/* compiled from: PausingDispatcher.kt */
public final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements p<f0, m0.l.c<? super T>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ Lifecycle q;
    public final /* synthetic */ Lifecycle.State x;
    public final /* synthetic */ p y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, p pVar, m0.l.c cVar) {
        super(2, cVar);
        this.q = lifecycle;
        this.x = state;
        this.y = pVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.q, this.x, this.y, cVar);
        pausingDispatcherKt$whenStateAtLeast$2.c = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.q, this.x, this.y, cVar);
        pausingDispatcherKt$whenStateAtLeast$2.c = obj;
        return pausingDispatcherKt$whenStateAtLeast$2.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        LifecycleController lifecycleController;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            e C = ((f0) this.c).C();
            int i2 = f1.k;
            f1 f1Var = (f1) C.get(f1.a.c);
            if (f1Var != null) {
                b0 b0Var = new b0();
                LifecycleController lifecycleController2 = new LifecycleController(this.q, this.x, b0Var.d, f1Var);
                try {
                    p pVar = this.y;
                    this.c = lifecycleController2;
                    this.d = 1;
                    obj = a.k4(b0Var, pVar, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lifecycleController = lifecycleController2;
                } catch (Throwable th) {
                    th = th;
                    lifecycleController = lifecycleController2;
                    lifecycleController.a();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
        } else if (i == 1) {
            lifecycleController = (LifecycleController) this.c;
            try {
                h.d4(obj);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        lifecycleController.a();
        return obj;
    }
}
