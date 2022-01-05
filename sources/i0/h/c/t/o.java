package i0.h.c.t;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import i0.h.a.b.c.m.b;
import i0.h.a.b.m.b0;
import i0.h.a.b.m.c0;
import i0.h.a.b.m.g;
import i0.h.a.b.m.q;
import i0.h.a.b.m.y;
import i0.h.c.t.a1;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public class o {
    public static final Object a = new Object();
    public static a1 b;
    public final Context c;

    public o(Context context) {
        this.c = context;
    }

    public static g<Integer> a(Context context, Intent intent) {
        a1 a1Var;
        b0<TResult> b0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (a) {
            if (b == null) {
                b = new a1(context, "com.google.firebase.MESSAGING_EVENT");
            }
            a1Var = b;
        }
        synchronized (a1Var) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            a1.a aVar = new a1.a(intent);
            ScheduledExecutorService scheduledExecutorService = a1Var.c;
            ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new y0(aVar), 9000, TimeUnit.MILLISECONDS);
            b0<TResult> b0Var2 = aVar.b.a;
            z0 z0Var = new z0(schedule);
            y<TResult> yVar = b0Var2.b;
            int i = c0.a;
            yVar.b(new q(scheduledExecutorService, z0Var));
            b0Var2.t();
            a1Var.d.add(aVar);
            a1Var.b();
            b0Var = aVar.b.a;
        }
        return b0Var.g(k.c, l.a);
    }

    public g<Integer> b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.c;
        if (b.U() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        int flags = intent.getFlags() & 268435456;
        if (z && flags == 0) {
            return a(context, intent);
        }
        Executor executor = h.c;
        return b.u(executor, new i(context, intent)).h(executor, new j(context, intent));
    }
}
