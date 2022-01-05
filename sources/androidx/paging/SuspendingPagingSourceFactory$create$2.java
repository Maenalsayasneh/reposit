package androidx.paging;

import h0.u.e0;
import h0.u.x;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "androidx.paging.SuspendingPagingSourceFactory$create$2", f = "SuspendingPagingSourceFactory.kt", l = {}, m = "invokeSuspend")
/* compiled from: SuspendingPagingSourceFactory.kt */
public final class SuspendingPagingSourceFactory$create$2 extends SuspendLambda implements p<f0, m0.l.c<? super x<Key, Value>>, Object> {
    public final /* synthetic */ e0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendingPagingSourceFactory$create$2(e0 e0Var, m0.l.c cVar) {
        super(2, cVar);
        this.c = e0Var;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new SuspendingPagingSourceFactory$create$2(this.c, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        e0 e0Var = this.c;
        new SuspendingPagingSourceFactory$create$2(e0Var, cVar);
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        Objects.requireNonNull(e0Var);
        throw null;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        Objects.requireNonNull(this.c);
        throw null;
    }
}
