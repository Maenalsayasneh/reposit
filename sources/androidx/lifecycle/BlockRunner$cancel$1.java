package androidx.lifecycle;

import i0.j.f.p.h;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.f1;

@c(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {187}, m = "invokeSuspend")
/* compiled from: CoroutineLiveData.kt */
public final class BlockRunner$cancel$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ h0.q.c d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockRunner$cancel$1(h0.q.c cVar, m0.l.c cVar2) {
        super(2, cVar2);
        this.d = cVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new BlockRunner$cancel$1(this.d, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        return new BlockRunner$cancel$1(this.d, cVar).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            long j = this.d.e;
            this.c = 1;
            if (a.d1(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!this.d.c.hasActiveObservers()) {
            f1 f1Var = this.d.a;
            if (f1Var != null) {
                a.o0(f1Var, (CancellationException) null, 1, (Object) null);
            }
            this.d.a = null;
        }
        return i.a;
    }
}
