package n0.a;

import i0.d.a.a.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import m0.l.c;
import n0.a.h2.r;

/* compiled from: Timeout.kt */
public final class z1<U, T extends U> extends r<T> implements Runnable {
    public final long x;

    public z1(long j, c<? super U> cVar) {
        super(((ContinuationImpl) cVar).getContext(), cVar);
        this.x = j;
    }

    public String h0() {
        return super.h0() + "(timeMillis=" + this.x + ')';
    }

    public void run() {
        K(new TimeoutCancellationException(a.l0("Timed out waiting for ", this.x, " ms"), this));
    }
}
