package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import g0.a.b.b.a;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", l = {74}, m = "invokeSuspend")
/* compiled from: Lifecycle.kt */
public final class LifecycleCoroutineScope$launchWhenCreated$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ LifecycleCoroutineScope d;
    public final /* synthetic */ p q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScope$launchWhenCreated$1(LifecycleCoroutineScope lifecycleCoroutineScope, p pVar, m0.l.c cVar) {
        super(2, cVar);
        this.d = lifecycleCoroutineScope;
        this.q = pVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new LifecycleCoroutineScope$launchWhenCreated$1(this.d, this.q, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        return new LifecycleCoroutineScope$launchWhenCreated$1(this.d, this.q, cVar).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            Lifecycle b = this.d.b();
            p pVar = this.q;
            this.c = 1;
            if (a.F0(b, Lifecycle.State.CREATED, pVar, this) == coroutineSingletons) {
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
