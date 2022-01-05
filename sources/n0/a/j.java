package n0.a;

import i0.d.a.a.a;
import java.util.concurrent.Future;
import m0.i;

/* compiled from: Future.kt */
public final class j extends k {
    public final Future<?> c;

    public j(Future<?> future) {
        this.c = future;
    }

    public void a(Throwable th) {
        if (th != null) {
            this.c.cancel(false);
        }
    }

    public Object invoke(Object obj) {
        if (((Throwable) obj) != null) {
            this.c.cancel(false);
        }
        return i.a;
    }

    public String toString() {
        StringBuilder P0 = a.P0("CancelFutureOnCancel[");
        P0.append(this.c);
        P0.append(']');
        return P0.toString();
    }
}
