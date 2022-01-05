package h0.q;

import java.io.Closeable;
import java.util.concurrent.CancellationException;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

/* compiled from: ViewModel.kt */
public final class e implements Closeable, f0 {
    public final m0.l.e c;

    public e(m0.l.e eVar) {
        i.e(eVar, "context");
        this.c = eVar;
    }

    public m0.l.e C() {
        return this.c;
    }

    public void close() {
        a.m0(this.c, (CancellationException) null, 1, (Object) null);
    }
}
