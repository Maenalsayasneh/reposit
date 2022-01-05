package androidx.paging;

import h0.u.x;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.a;
import m0.n.a.l;

@c(c = "androidx.paging.Pager$flow$2", f = "Pager.kt", l = {}, m = "invokeSuspend")
/* compiled from: Pager.kt */
public final class Pager$flow$2 extends SuspendLambda implements l<m0.l.c<? super x<Key, Value>>, Object> {
    public final /* synthetic */ a c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pager$flow$2(a aVar, m0.l.c cVar) {
        super(1, cVar);
        this.c = aVar;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new Pager$flow$2(this.c, cVar);
    }

    public final Object invoke(Object obj) {
        m0.l.c cVar = (m0.l.c) obj;
        m0.n.b.i.e(cVar, "completion");
        a aVar = this.c;
        new Pager$flow$2(aVar, cVar);
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        return aVar.invoke();
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        return this.c.invoke();
    }
}
