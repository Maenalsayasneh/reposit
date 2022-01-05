package i0.h.a.b.b;

import android.util.Log;
import i0.h.a.b.m.h;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final /* synthetic */ class u implements Runnable {
    public final h c;

    public u(h hVar) {
        this.c = hVar;
    }

    public final void run() {
        if (this.c.a(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }
}
