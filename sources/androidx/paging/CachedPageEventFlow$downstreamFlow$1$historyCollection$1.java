package androidx.paging;

import h0.u.c0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import m0.i;
import m0.j.l;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;
import n0.a.g2.d;
import n0.a.g2.e;

@c(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$historyCollection$1", f = "CachedPageEventFlow.kt", l = {292}, m = "invokeSuspend")
/* compiled from: CachedPageEventFlow.kt */
public final class CachedPageEventFlow$downstreamFlow$1$historyCollection$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ c0 d;
    public final /* synthetic */ TemporaryDownstream q;
    public final /* synthetic */ Ref$IntRef x;

    /* compiled from: Collect.kt */
    public static final class a implements e<l<? extends PageEvent<T>>> {
        public final /* synthetic */ CachedPageEventFlow$downstreamFlow$1$historyCollection$1 c;

        public a(CachedPageEventFlow$downstreamFlow$1$historyCollection$1 cachedPageEventFlow$downstreamFlow$1$historyCollection$1) {
            this.c = cachedPageEventFlow$downstreamFlow$1$historyCollection$1;
        }

        public Object emit(Object obj, m0.l.c cVar) {
            l lVar = (l) obj;
            CachedPageEventFlow$downstreamFlow$1$historyCollection$1 cachedPageEventFlow$downstreamFlow$1$historyCollection$1 = this.c;
            cachedPageEventFlow$downstreamFlow$1$historyCollection$1.x.c = lVar.a;
            Object t = cachedPageEventFlow$downstreamFlow$1$historyCollection$1.d.t(lVar.b, cVar);
            if (t == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return t;
            }
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$downstreamFlow$1$historyCollection$1(c0 c0Var, TemporaryDownstream temporaryDownstream, Ref$IntRef ref$IntRef, m0.l.c cVar) {
        super(2, cVar);
        this.d = c0Var;
        this.q = temporaryDownstream;
        this.x = ref$IntRef;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new CachedPageEventFlow$downstreamFlow$1$historyCollection$1(this.d, this.q, this.x, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        return new CachedPageEventFlow$downstreamFlow$1$historyCollection$1(this.d, this.q, this.x, cVar).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            d<T> J0 = m0.r.t.a.r.m.a1.a.J0(this.q.a);
            a aVar = new a(this);
            this.c = 1;
            if (((n0.a.g2.a) J0).collect(aVar, this) == coroutineSingletons) {
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
