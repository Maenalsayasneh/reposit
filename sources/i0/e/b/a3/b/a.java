package i0.e.b.a3.b;

import com.airbnb.mvrx.MavericksViewModel;
import i0.b.b.j;
import java.util.Objects;
import kotlinx.coroutines.channels.BufferOverflow;
import m0.n.b.i;
import n0.a.f0;
import n0.a.g2.p;
import n0.a.g2.t;
import n0.a.g2.u;
import n0.a.g2.x;

/* compiled from: BaseViewModel.kt */
public abstract class a<S extends j> extends MavericksViewModel<S> {
    public final p<c> i;
    public final p<b> j;
    public final t<c> k;
    public final t<b> l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(S s) {
        super(s);
        i.e(s, "initialState");
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        p<c> b = u.b(1, 0, bufferOverflow, 2);
        this.i = b;
        p<b> b2 = u.b(1, 0, bufferOverflow, 2);
        this.j = b2;
        f0 f0Var = this.c;
        x.a aVar = x.a;
        Objects.requireNonNull(aVar);
        x xVar = x.a.c;
        this.k = m0.r.t.a.r.m.a1.a.y3(b, f0Var, xVar, 0, 4, (Object) null);
        f0 f0Var2 = this.c;
        Objects.requireNonNull(aVar);
        this.l = m0.r.t.a.r.m.a1.a.y3(b2, f0Var2, xVar, 0, 4, (Object) null);
    }

    public final void o(b bVar) {
        i.e(bVar, "effect");
        this.j.d(bVar);
    }

    public final void p(c cVar) {
        i.e(cVar, "intent");
        this.i.d(cVar);
    }
}
