package androidx.paging;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.l.f.a.c;
import m0.n.a.q;
import m0.n.b.i;

@c(c = "androidx.paging.PagingDataTransforms$insertHeaderItem$1", f = "PagingDataTransforms.kt", l = {}, m = "invokeSuspend")
/* compiled from: PagingDataTransforms.kt */
public final class PagingDataTransforms$insertHeaderItem$1 extends SuspendLambda implements q<T, T, m0.l.c<? super T>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagingDataTransforms$insertHeaderItem$1(Object obj, m0.l.c cVar) {
        super(3, cVar);
        this.d = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m0.l.c cVar = (m0.l.c) obj3;
        i.e(cVar, "continuation");
        Object obj4 = this.d;
        PagingDataTransforms$insertHeaderItem$1 pagingDataTransforms$insertHeaderItem$1 = new PagingDataTransforms$insertHeaderItem$1(obj4, cVar);
        pagingDataTransforms$insertHeaderItem$1.c = obj;
        m0.i iVar = m0.i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        if (pagingDataTransforms$insertHeaderItem$1.c == null) {
            return obj4;
        }
        return null;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        if (this.c == null) {
            return this.d;
        }
        return null;
    }
}
