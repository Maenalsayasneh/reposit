package i0.h.c.t;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import i0.h.c.r.g;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class r0 implements Callable {
    public final a0 Y1;
    public final Context c;
    public final ScheduledExecutorService d;
    public final FirebaseMessaging q;
    public final g x;
    public final f0 y;

    public r0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, g gVar, f0 f0Var, a0 a0Var) {
        this.c = context;
        this.d = scheduledExecutorService;
        this.q = firebaseMessaging;
        this.x = gVar;
        this.y = f0Var;
        this.Y1 = a0Var;
    }

    public Object call() {
        q0 q0Var;
        Context context = this.c;
        ScheduledExecutorService scheduledExecutorService = this.d;
        FirebaseMessaging firebaseMessaging = this.q;
        g gVar = this.x;
        f0 f0Var = this.y;
        a0 a0Var = this.Y1;
        synchronized (q0.class) {
            WeakReference<q0> weakReference = q0.a;
            q0Var = weakReference != null ? (q0) weakReference.get() : null;
            if (q0Var == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                q0 q0Var2 = new q0(sharedPreferences, scheduledExecutorService);
                synchronized (q0Var2) {
                    q0Var2.c = m0.a(sharedPreferences, "topic_operation_queue", scheduledExecutorService);
                }
                q0.a = new WeakReference<>(q0Var2);
                q0Var = q0Var2;
            }
        }
        return new s0(firebaseMessaging, gVar, f0Var, q0Var, a0Var, context, scheduledExecutorService);
    }
}
