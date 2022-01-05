package i0.e.b.f3.j;

import com.clubhouse.android.shared.data.RemoteSearchDataSource$fetchResults$1;
import h0.u.w;
import i0.e.b.b3.a.b.a.a;
import i0.e.b.b3.b.e.j;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.n.b.i;
import n0.a.f0;
import n0.a.f1;
import n0.a.g2.d;
import n0.a.g2.p;
import n0.a.g2.u;

/* compiled from: RemoteSearchDataSource.kt */
public final class f<Query extends i0.e.b.b3.a.b.a.a, T extends j> {
    public final f0 a;
    public final a<Query, T> b;
    public f1 c;
    public Query d;
    public d<w<T>> e = u.b(1, 0, BufferOverflow.DROP_OLDEST, 2);

    /* compiled from: RemoteSearchDataSource.kt */
    public interface a<Q extends i0.e.b.b3.a.b.a.a, T extends j> {
        d<w<T>> a(Q q);
    }

    public f(f0 f0Var, a<Query, T> aVar) {
        i.e(f0Var, "coroutineScope");
        i.e(aVar, "requestFactory");
        this.a = f0Var;
        this.b = aVar;
    }

    public void a(Query query) {
        if (query.a() != null) {
            f1 f1Var = this.c;
            if (f1Var != null) {
                m0.r.t.a.r.m.a1.a.o0(f1Var, (CancellationException) null, 1, (Object) null);
            }
            this.c = m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(g0.a.b.b.a.h(this.b.a(query), this.a), new RemoteSearchDataSource$fetchResults$1(this, (c<? super RemoteSearchDataSource$fetchResults$1>) null)), this.a);
        } else {
            ((p) this.e).d(w.c.a());
        }
        this.d = query;
    }
}
