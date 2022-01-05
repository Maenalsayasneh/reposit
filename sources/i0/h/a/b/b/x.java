package i0.h.a.b.b;

import i0.h.a.b.m.c;
import i0.h.a.b.m.g;
import java.util.concurrent.ScheduledFuture;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final /* synthetic */ class x implements c {
    public final b c;
    public final String d;
    public final ScheduledFuture q;

    public x(b bVar, String str, ScheduledFuture scheduledFuture) {
        this.c = bVar;
        this.d = str;
        this.q = scheduledFuture;
    }

    public final void onComplete(g gVar) {
        b bVar = this.c;
        String str = this.d;
        ScheduledFuture scheduledFuture = this.q;
        synchronized (bVar.c) {
            bVar.c.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
