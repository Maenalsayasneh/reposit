package androidx.paging;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import m0.i;
import m0.j.l;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.g2.d;
import n0.a.g2.e;
import n0.a.g2.n;

@c(c = "androidx.paging.CachedPageEventFlow$multicastedSrc$1", f = "CachedPageEventFlow.kt", l = {292}, m = "invokeSuspend")
/* compiled from: CachedPageEventFlow.kt */
public final class CachedPageEventFlow$multicastedSrc$1 extends SuspendLambda implements p<e<? super l<? extends PageEvent<T>>>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ CachedPageEventFlow q;
    public final /* synthetic */ d x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$multicastedSrc$1(CachedPageEventFlow cachedPageEventFlow, d dVar, m0.l.c cVar) {
        super(2, cVar);
        this.q = cachedPageEventFlow;
        this.x = dVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        CachedPageEventFlow$multicastedSrc$1 cachedPageEventFlow$multicastedSrc$1 = new CachedPageEventFlow$multicastedSrc$1(this.q, this.x, cVar);
        cachedPageEventFlow$multicastedSrc$1.c = obj;
        return cachedPageEventFlow$multicastedSrc$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        CachedPageEventFlow$multicastedSrc$1 cachedPageEventFlow$multicastedSrc$1 = new CachedPageEventFlow$multicastedSrc$1(this.q, this.x, cVar);
        cachedPageEventFlow$multicastedSrc$1.c = obj;
        return cachedPageEventFlow$multicastedSrc$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            e eVar = (e) this.c;
            if (this.q.b.compareAndSet(false, true)) {
                d dVar = this.x;
                this.d = 1;
                Object collect = dVar.collect(new n(eVar, new Ref$IntRef()), this);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    collect = i.a;
                }
                if (collect == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
