package androidx.paging;

import h0.u.d;
import h0.u.x;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "androidx.paging.LegacyPagingSource$load$2", f = "LegacyPagingSource.kt", l = {116}, m = "invokeSuspend")
/* compiled from: LegacyPagingSource.kt */
public final class LegacyPagingSource$load$2 extends SuspendLambda implements p<f0, m0.l.c<? super x.b.C0069b<Key, Value>>, Object> {
    public int c;
    public final /* synthetic */ LegacyPagingSource d;
    public final /* synthetic */ Ref$ObjectRef q;
    public final /* synthetic */ x.a x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyPagingSource$load$2(LegacyPagingSource legacyPagingSource, Ref$ObjectRef ref$ObjectRef, x.a aVar, m0.l.c cVar) {
        super(2, cVar);
        this.d = legacyPagingSource;
        this.q = ref$ObjectRef;
        this.x = aVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new LegacyPagingSource$load$2(this.d, this.q, this.x, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        new LegacyPagingSource$load$2(this.d, this.q, this.x, cVar).invokeSuspend(i.a);
        throw null;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            Objects.requireNonNull(this.d);
            d dVar = (d) this.q.c;
            this.c = 1;
            throw null;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            h.d4(obj);
            Objects.requireNonNull((h0.u.c) obj);
            throw null;
        }
    }
}
