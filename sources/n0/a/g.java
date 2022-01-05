package n0.a;

import java.util.concurrent.locks.LockSupport;
import m0.l.e;
import m0.n.b.i;

/* compiled from: Builders.kt */
public final class g<T> extends d<T> {
    public final Thread q;
    public final s0 x;

    public g(e eVar, Thread thread, s0 s0Var) {
        super(eVar, true, true);
        this.q = thread;
        this.x = s0Var;
    }

    public void D(Object obj) {
        if (!i.a(Thread.currentThread(), this.q)) {
            LockSupport.unpark(this.q);
        }
    }
}
