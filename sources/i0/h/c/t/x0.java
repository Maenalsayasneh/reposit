package i0.h.c.t;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import i0.h.a.b.m.b0;
import i0.h.a.b.m.c0;
import i0.h.a.b.m.g;
import i0.h.a.b.m.q;
import i0.h.a.b.m.y;
import i0.h.c.t.a1;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public class x0 extends Binder {
    public final a a;

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    public interface a {
    }

    public x0(a aVar) {
        this.a = aVar;
    }

    public void a(a1.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            a aVar2 = this.a;
            g<Void> e = g.this.e(aVar.a);
            Executor executor = v0.c;
            w0 w0Var = new w0(aVar);
            b0 b0Var = (b0) e;
            y<TResult> yVar = b0Var.b;
            int i = c0.a;
            yVar.b(new q(executor, w0Var));
            b0Var.t();
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
