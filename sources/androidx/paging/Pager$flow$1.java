package androidx.paging;

import h0.u.e0;
import h0.u.x;
import java.util.Objects;
import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.l.c;
import m0.l.e;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: Pager.kt */
public final /* synthetic */ class Pager$flow$1 extends FunctionReferenceImpl implements l<c<? super x<Key, Value>>, Object> {
    public Pager$flow$1(a aVar) {
        super(1, aVar, e0.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public Object invoke(Object obj) {
        e0 e0Var = (e0) ((a) this.receiver);
        Objects.requireNonNull(e0Var);
        return m0.r.t.a.r.m.a1.a.k4((e) null, new SuspendingPagingSourceFactory$create$2(e0Var, (c) null), (c) obj);
    }
}
