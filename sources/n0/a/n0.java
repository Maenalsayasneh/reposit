package n0.a;

import i0.d.a.a.a;
import java.util.concurrent.Future;

/* compiled from: Executors.kt */
public final class n0 implements o0 {
    public final Future<?> c;

    public n0(Future<?> future) {
        this.c = future;
    }

    public void dispose() {
        this.c.cancel(false);
    }

    public String toString() {
        StringBuilder P0 = a.P0("DisposableFutureHandle[");
        P0.append(this.c);
        P0.append(']');
        return P0.toString();
    }
}
