package i0.h.a.b.b;

import android.content.Context;
import android.util.Log;
import i0.h.a.b.c.m.f.a;
import i0.h.a.b.m.g;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class f {
    public static f a;
    public final Context b;
    public final ScheduledExecutorService c;
    public g d = new g(this, (h) null);
    public int e = 1;

    public f(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public static synchronized f a(Context context) {
        f fVar;
        synchronized (f.class) {
            if (a == null) {
                a = new f(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new a("MessengerIpcClient"))));
            }
            fVar = a;
        }
        return fVar;
    }

    public final synchronized <T> g<T> b(q<T> qVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(qVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.d.b(qVar)) {
            g gVar = new g(this, (h) null);
            this.d = gVar;
            gVar.b(qVar);
        }
        return qVar.b.a;
    }
}
