package i0.h.c.t;

import i0.h.a.b.m.c;
import i0.h.a.b.m.g;
import java.util.concurrent.ScheduledFuture;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class z0 implements c {
    public final ScheduledFuture c;

    public z0(ScheduledFuture scheduledFuture) {
        this.c = scheduledFuture;
    }

    public void onComplete(g gVar) {
        this.c.cancel(false);
    }
}
