package i0.h.c.t;

import android.util.Log;
import i0.h.c.t.a1;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class y0 implements Runnable {
    public final a1.a c;

    public y0(a1.a aVar) {
        this.c = aVar;
    }

    public void run() {
        a1.a aVar = this.c;
        String action = aVar.a.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("FirebaseMessaging", sb.toString());
        aVar.a();
    }
}
