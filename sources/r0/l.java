package r0;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import m0.n.b.i;

/* compiled from: ForwardingTimeout.kt */
public class l extends z {
    public z e;

    public l(z zVar) {
        i.e(zVar, "delegate");
        this.e = zVar;
    }

    public z a() {
        return this.e.a();
    }

    public z b() {
        return this.e.b();
    }

    public long c() {
        return this.e.c();
    }

    public z d(long j) {
        return this.e.d(j);
    }

    public boolean e() {
        return this.e.e();
    }

    public void f() throws IOException {
        this.e.f();
    }

    public z g(long j, TimeUnit timeUnit) {
        i.e(timeUnit, "unit");
        return this.e.g(j, timeUnit);
    }
}
