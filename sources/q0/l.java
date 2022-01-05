package q0;

import java.util.concurrent.TimeUnit;
import m0.n.b.i;
import q0.h0.f.d;
import q0.h0.g.h;

/* compiled from: ConnectionPool.kt */
public final class l {
    public final h a;

    public l() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        i.e(timeUnit, "timeUnit");
        h hVar = new h(d.a, 5, 5, timeUnit);
        i.e(hVar, "delegate");
        this.a = hVar;
    }
}
