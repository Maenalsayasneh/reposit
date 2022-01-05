package androidx.lifecycle;

import h0.q.v;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {176}, m = "invokeSuspend")
/* compiled from: CoroutineLiveData.kt */
public final class BlockRunner$maybeRun$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ h0.q.c q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockRunner$maybeRun$1(h0.q.c cVar, m0.l.c cVar2) {
        super(2, cVar2);
        this.q = cVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        BlockRunner$maybeRun$1 blockRunner$maybeRun$1 = new BlockRunner$maybeRun$1(this.q, cVar);
        blockRunner$maybeRun$1.c = obj;
        return blockRunner$maybeRun$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        BlockRunner$maybeRun$1 blockRunner$maybeRun$1 = new BlockRunner$maybeRun$1(this.q, cVar);
        blockRunner$maybeRun$1.c = obj;
        return blockRunner$maybeRun$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            LiveDataScopeImpl liveDataScopeImpl = new LiveDataScopeImpl(this.q.c, ((f0) this.c).C());
            p<v<T>, m0.l.c<? super i>, Object> pVar = this.q.d;
            this.d = 1;
            if (pVar.invoke(liveDataScopeImpl, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.q.g.invoke();
        return i.a;
    }
}
