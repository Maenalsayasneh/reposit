package androidx.paging;

import h0.u.c0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.e;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f1;

@c(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", l = {83, 117}, m = "invokeSuspend")
/* compiled from: CachedPageEventFlow.kt */
public final class CachedPageEventFlow$downstreamFlow$1 extends SuspendLambda implements p<c0<PageEvent<T>>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ CachedPageEventFlow q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$downstreamFlow$1(CachedPageEventFlow cachedPageEventFlow, m0.l.c cVar) {
        super(2, cVar);
        this.q = cachedPageEventFlow;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        CachedPageEventFlow$downstreamFlow$1 cachedPageEventFlow$downstreamFlow$1 = new CachedPageEventFlow$downstreamFlow$1(this.q, cVar);
        cachedPageEventFlow$downstreamFlow$1.c = obj;
        return cachedPageEventFlow$downstreamFlow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        CachedPageEventFlow$downstreamFlow$1 cachedPageEventFlow$downstreamFlow$1 = new CachedPageEventFlow$downstreamFlow$1(this.q, cVar);
        cachedPageEventFlow$downstreamFlow$1.c = obj;
        return cachedPageEventFlow$downstreamFlow$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        c0 c0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            c0Var = (c0) this.c;
            FlattenedPageController<T> flattenedPageController = this.q.a;
            this.c = c0Var;
            this.d = 1;
            obj2 = flattenedPageController.a(this);
            if (obj2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            c0Var = (c0) this.c;
            h.d4(obj);
            obj2 = obj;
        } else if (i == 2) {
            h.d4(obj);
            return i.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c0 c0Var2 = c0Var;
        TemporaryDownstream temporaryDownstream = (TemporaryDownstream) obj2;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.c = Integer.MIN_VALUE;
        f1 E2 = a.E2(c0Var2, (e) null, (CoroutineStart) null, new CachedPageEventFlow$downstreamFlow$1$historyCollection$1(c0Var2, temporaryDownstream, ref$IntRef, (m0.l.c) null), 3, (Object) null);
        f1[] f1VarArr = {a.E2(c0Var2, (e) null, (CoroutineStart) null, new CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1(this, c0Var2, temporaryDownstream, E2, ref$IntRef, (m0.l.c) null), 3, (Object) null), E2};
        this.c = null;
        this.d = 2;
        if (a.D2(f1VarArr, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return i.a;
    }
}
