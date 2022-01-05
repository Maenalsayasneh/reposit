package m0.r.t.a.r.l;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import m0.n.b.i;

/* compiled from: locks.kt */
public class c implements j {
    public final Lock b;

    public c(Lock lock, int i) {
        ReentrantLock reentrantLock = (i & 1) != 0 ? new ReentrantLock() : null;
        i.e(reentrantLock, "lock");
        this.b = reentrantLock;
    }

    public void a() {
        this.b.unlock();
    }

    public void b() {
        this.b.lock();
    }
}
